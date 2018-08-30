package com.invesmart.invesmartWeb.controller;

import com.invesmart.invesmartCommons.dto.response.ResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("client")
public class ClientController {

    @GetMapping("/getClient/{clientId}")
    public ResponseEntity<ResponseDTO> getClient(@PathVariable int clientId) {
        return null;
    }

    /*@PutMapping Mapping("/addClient/")
    public ResponseEntity<ResponseDTO> getClient(@PathVariable int clientId) {
        return null;
    }*/

}
