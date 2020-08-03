package com.spring.basics.app.external;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExternalPropertiesService
{
    @Value("${external.service.url}")
    public String url;

    public String returnUrl()
    {
        return url;
    }

}
