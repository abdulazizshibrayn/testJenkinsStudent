package com.WAKEB.firt.spring.controller;

import com.WAKEB.firt.spring.bean.LoginBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/second")
public class SeconController {

    @GetMapping("/login1")
    public ResponseEntity<String> login1(@RequestParam(name = "un" , required = false) String username,
                                         @RequestParam(name = "ps", required = false) String password) {
        if(username != null && password != null) {
        String response = "loin1 with username after " + username +  " password " + password;;
        return ResponseEntity.ok(response);
        }
        else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("soory your Request is incomplete");
        }
    }

    //     localhost:8080 /login2/username/password
    @GetMapping("/login2/{var1}/{var2}")
    public String login2(@PathVariable(name = "var1") String username,
                         @PathVariable(name = "var2") String password) {
        return "loin2 with " + username + " password " + password;
    }

    @PostMapping("/login3")
    public String login3(@RequestBody LoginBean loginBean) {
        return "Login3 with " + loginBean ;
    }

}

