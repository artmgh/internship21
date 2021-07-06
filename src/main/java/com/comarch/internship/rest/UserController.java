package com.comarch.internship.rest;

import com.comarch.internship.data.User;
import com.comarch.internship.data.UserDto;
import com.comarch.internship.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private final ModelMapper modelMapper;

    @Autowired
    private UserService userService;

    public UserController(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @GetMapping(path = "/get")
    public UserDto getUser() {
        User user = userService.getUser();
        UserDto userDto = modelMapper.map(user, UserDto.class);
        return userDto;
    }

    @PostMapping(path = "/post")
    public String createUser(@RequestBody User user) {
        userService.createUser();
        return "created";
    }

    @DeleteMapping(path = "/delete/{name}")
    public String deleteUser(@PathVariable String name) {
        userService.deleteUser(name);
        return "User: " + name + " was deleted";
    }

    @PutMapping(path = "/put/{name}")
    public String putUser(@PathVariable String name, @RequestBody User user) {
        userService.updateUser(user);
        return "User: " + name + " was updated";
    }
}
