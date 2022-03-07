package org.example.AssignmentQ4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.AssignmentQ4")
public class Config {
    @Bean
    public BankAccount getBankAccount(){
        BankAccount bankAccount1 = new BankAccount(5498,"Shrirang Dawande","Saving",50500);
        return bankAccount1;
    }

    @Bean
    public BankAccount getBankAccount1(){
        BankAccount bankAccount1 = new BankAccount(5496,"Yash Bawne","Current",60500);
        return bankAccount1;
    }

}
