package org.ko.prototype.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.ko")
public class PrototypeApiServer {

    public static void main(String[] args) {
        SpringApplication.run(PrototypeApiServer.class, args);
    }
}
