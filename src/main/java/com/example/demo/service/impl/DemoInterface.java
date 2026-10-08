package com.example.demo.service.impl;

import org.apache.coyote.BadRequestException;

public interface DemoInterface {
    String removeChars(String value) throws BadRequestException;
}
