package com.example.DebitMicroservice;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.DebitMicroservice.model.Account;
import com.example.DebitMicroservice.model.Customer;
import com.example.DebitMicroservice.repository.AccountRepository;
import com.example.DebitMicroservice.repository.CustomerRepository;

@SpringBootApplication
public class DebitMicroserviceApplication {

	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private CustomerRepository customerRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DebitMicroserviceApplication.class, args);
	}
	
	@Bean
	InitializingBean sendDatabase() {
	    return () -> {
	    	
	    	Customer customer= new Customer();
	    	customer.setCustomerId(1001);
	    	customer.setName("Vikas Dighe");
	    	Customer custReturn = customerRepository.save(customer);
	    	
	    	Account account = new Account();
	    	account.setAccountNumber(1001);
	    	account.setCustomer(custReturn);
	    	account.setCreationDate(Instant.now());
	    	account.setBalance(10000);
	    	account.setEmail("vikas@gmail.com");
	    	accountRepository.save(account);
	    	
	    	Customer customer2= new Customer();
	    	customer2.setCustomerId(1002);
	    	customer2.setName("Ankita Ghosh");
	    	Customer custReturn2 = customerRepository.save(customer2);
	    	
	    	Account account2 = new Account();
	    	account2.setAccountNumber(1002);
	    	account2.setCreationDate(Instant.now());
	    	account2.setCustomer(custReturn2);
	    	account2.setBalance(10000);
	    	account2.setEmail("ankita@gmail.com");
	    	accountRepository.save(account2);
	    	
	    	Customer customer3= new Customer();
	    	customer3.setCustomerId(1003);
	    	customer3.setName("Sharvari");
	    	Customer custReturn3 = customerRepository.save(customer3);
	    	
	    	Account account3 = new Account();
	    	account3.setAccountNumber(1003);
	    	account3.setCreationDate(Instant.now());
	    	account3.setCustomer(custReturn3);
	    	account3.setBalance(10000);
	    	account3.setEmail("sharvari@gmail.com");
	    	accountRepository.save(account3);
	    	
	    	Customer customer4= new Customer();
	    	customer4.setCustomerId(1004);
	    	customer4.setName("Indranil Das");
	    	Customer custReturn4 = customerRepository.save(customer4);
	    	
	    	Account account4 = new Account();
	    	account4.setAccountNumber(1004);
	    	account4.setCreationDate(Instant.now());
	    	account4.setCustomer(custReturn4);
	    	account4.setBalance(10000);
	    	account4.setEmail("indranil@gmail.com");
	    	accountRepository.save(account4);

	      };
	   }

}

