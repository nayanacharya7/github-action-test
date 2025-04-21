package com.example.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PracticeApplication {

	public static void main(String[] args) {

        SpringApplication.run(PracticeApplication.class, args);
        System.out.println("Hello World");


	}
    @GetMapping("/test")
    public String test(){
        return "inserting new values in db checking the content";
    }

}
//echo "# github-action-test" >> README.md
//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin https://github.com/nayanacharya7/github-action-test.git
//git push -u origin main
