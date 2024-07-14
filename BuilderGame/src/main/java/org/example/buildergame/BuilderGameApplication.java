package org.example.buildergame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilderGameApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuilderGameApplication.class, args);
        Reshape reshape = new Reshape();
        String input = "abc de fghi";
        int n = 3;
        String reshaped = reshape.rechapeString(n, input);
        System.out.println("Result for 'abc de fghi' with n = 3: " + reshaped);

        input = "1 23 456";
        n = 2;
        reshaped = reshape.rechapeString(n, input);
        System.out.println("Result for '1 23 456' with n = 2: " + reshaped);

    }

}
