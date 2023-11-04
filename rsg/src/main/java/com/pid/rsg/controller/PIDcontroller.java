package com.pid.rsg.controller;

import com.pid.rsg.util.Constants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Constants.DEFAULT_ENDPOINT)
@Slf4j
@Validated
public class PIDcontroller {

}
