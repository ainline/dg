package com.nepxion.discovery.guide.admin;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import de.codecentric.boot.admin.server.config.EnableAdminServer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableAdminServer
public class DiscoveryGuideAdmin {
    public static void main(String[] args) {
        new SpringApplicationBuilder(DiscoveryGuideAdmin.class).run(args);
    }
}