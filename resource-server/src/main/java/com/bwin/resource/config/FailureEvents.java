package com.bwin.resource.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.AuthenticationFailureBadCredentialsEvent;
import org.springframework.security.oauth2.server.resource.authentication.BearerTokenAuthenticationToken;
import org.springframework.stereotype.Component;

/**
 * @author McAfee
 */
@Slf4j
@Component
public class FailureEvents {
    /**
     * access_token错误时执行
     * @param badCredentials 错误信息
     */
    @EventListener
    public void onFailure(AuthenticationFailureBadCredentialsEvent badCredentials) {
        if (badCredentials.getAuthentication() instanceof BearerTokenAuthenticationToken) {
            log.error("Authentication Failure: {}", badCredentials.getAuthentication());
        }
    }
}
