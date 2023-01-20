package com.bwin.resource.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author McAfee
 */
@RestController
public class ResourceController {

    @GetMapping("/authentication")
    public String authentication(Authentication authentication) {
        return authentication.toString();
    }

    @GetMapping("/messages")
    public String[] messages() {
        return new String[] { "Message 1", "Message 2", "Message 3" };
    }

}
