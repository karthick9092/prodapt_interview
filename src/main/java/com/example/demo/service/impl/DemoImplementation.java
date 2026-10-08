package com.example.demo.service.impl;

import org.apache.coyote.BadRequestException;
import org.apache.coyote.Response;
import org.springframework.stereotype.Service;

@Service
public class DemoImplementation implements DemoInterface {

    @Override
    public String removeChars(String value) throws BadRequestException {

        if (value == null || value.length() < 2) {
            throw new BadRequestException("Invalid input");
        } else if (value.length() == 2) {
            return "";
        } else {
            return value.substring(1, value.length() - 1);
        }
    }
}
