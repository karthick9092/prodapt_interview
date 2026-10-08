package com.example.demo.controller;


import com.example.demo.dto.Response;
import com.example.demo.service.impl.DemoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    DemoInterface demoInterface;

    @GetMapping("/remove-chars")
    public ResponseEntity<Response> removeChars(@RequestParam String value) {
        Response response = new Response();
        try {
            String result = demoInterface.removeChars(value);
            response.setData(result);
            response.setSuccessMsg("Characters removed successfully");
            response.setStatusCode(HttpStatus.OK.value());
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            response.setErrorMsg("Failed to remove characters");
            response.setErrorCode(HttpStatus.BAD_REQUEST.value());
            return ResponseEntity.badRequest().body(response);
        }
    }
}
