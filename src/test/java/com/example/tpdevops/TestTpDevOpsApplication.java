package com.example.tpdevops;

import org.springframework.boot.SpringApplication;

public class TestTpDevOpsApplication {

    public static void main(String[] args) {
        SpringApplication.from(TpDevOpsApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
