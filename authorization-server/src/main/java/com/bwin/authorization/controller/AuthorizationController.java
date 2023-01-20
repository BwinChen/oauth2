package com.bwin.authorization.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author McAfee
 */
@RestController
public class AuthorizationController {

    @GetMapping("/authentication")
    public String authentication(Authentication authentication) {
        return authentication.toString();
    }

}
