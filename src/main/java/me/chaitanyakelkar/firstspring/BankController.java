package me.chaitanyakelkar.firstspring;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bank")
public class BankController {
    @GetMapping
    public BankResponse bankGet(){
        return new BankResponse("Welcome to the Banking API!");
    }

    @PostMapping
    public BankResponse bankPost(@RequestBody String name){
        return new BankResponse("Hello " + name + "! Welcome to the banking API");
    }
}
