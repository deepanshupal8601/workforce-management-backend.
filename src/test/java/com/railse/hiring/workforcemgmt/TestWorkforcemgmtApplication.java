package com.railse.hiring.workforcemgmt;

import org.springframework.boot.SpringApplication;

public class TestWorkforcemgmtApplication {

	public static void main(String[] args) {
		SpringApplication.from(WorkforcemgmtApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
