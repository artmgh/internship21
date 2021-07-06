package com.comarch.internship.rest;

import com.comarch.internship.data.User;
import com.comarch.internship.data.UserDto;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    private final ModelMapper modelMapper;

    public Controller(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @GetMapping(path = "/get")
    public UserDto getUser() {
        User user = new User("Jan", "pesel");
        UserDto userDto = modelMapper.map(user, UserDto.class);
        return userDto;
    }

    @PostMapping(path = "/post")
    public String createUser(@RequestBody User user) {
        User newUser = new User(user.getName(), user.getPESEL());
        return "created";
    }

    @DeleteMapping(path = "delete/{name}")
    public String deleteUser(@PathVariable String name) {
        //todo add impl for delete User(name)
        return "User: " + name + " was deleted";
    }

    @PutMapping(path = "delete/{name}")
    public String putUser(@PathVariable String name) {
        //todo add impl for update User(name)
        return "User: " + name + " was updated";
    }
}
