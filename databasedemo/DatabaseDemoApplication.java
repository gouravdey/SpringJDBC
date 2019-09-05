package com.example.databasedemo;

import com.example.databasedemo.entity.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbcDAO dao;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("User id 3 -> {}", dao.findById(3));
		logger.info("User name 'Gourav' -> {} ", dao.findByName("Gourav"));
		logger.info("User id 2 -> {}", dao.deleteById(2));
		logger.info("Insert -> {}", dao.insert(new Person(4, "Tara", "Berlin", new Date())));
		logger.info("Update -> {}", dao.update(new Person(3, "Peter", "Delhi", new Date())));
		logger.info("All users -> {}", dao.findAll());

	}
}
