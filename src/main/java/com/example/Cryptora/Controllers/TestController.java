package com.example.Cryptora.Controllers;

import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Test")
public class TestController {


    @GetMapping
    public ResponseEntity<UserDto> Test(){
        return ResponseEntity.ok(new UserDto());
    }

}

class UserDto{

}

