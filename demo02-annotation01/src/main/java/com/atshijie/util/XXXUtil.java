package com.atshijie.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class XXXUtil {

    @Value("${a_username}")
    private String username ;
    @Value("${a_password}")
    private String pasword;
}
