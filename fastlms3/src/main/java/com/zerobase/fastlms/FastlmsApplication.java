package com.zerobase.fastlms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(
        {
                "com.zerobase.fastlms.banner.entity", "com.zerobase.fastlms.admin.entity",
                "com.zerobase.fastlms.course.entity" , "com.zerobase.fastlms.member.entity"

        })


public class FastlmsApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(FastlmsApplication.class, args);
    }
    
}
