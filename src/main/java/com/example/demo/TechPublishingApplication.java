package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



import java.sql.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.example.demo.Respository.SystemRepository;
import com.example.demo.model.Admin;




@SpringBootApplication
@EnableJpaRepositories("com.example.demo.Respository")
public class TechPublishingApplication  implements CommandLineRunner {

	@Autowired
	DataSource dataSource;

	@Autowired
	SystemRepository systemRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(TechPublishingApplication.class, args);
	}
	
		@Override
	public void run(String... args) throws Exception {
		// add windows server
		Admin ad = new Admin();
		ad.setName("root");
		ad.setPassword("root");
		ad.setAdminname("root");
		ad.setEmail("d@gmail.com");
		ad.setPhoneNo("9718629881");
		
		systemRepository.save(ad);
		// add rhel
// 		SystemExample systemExampleRhel = new SystemExample();
// 		systemExampleRhel.setName("RHEL 7");
// 		systemExampleRhel.setLastaudit("2017-07-21");
// 		systemRepository.save(systemExampleRhel);
// 		// add solaris
// 		SystemExample systemExampleSolaris = new SystemExample();
// 		systemExampleSolaris.setName("Solaris 11");
// 		systemExampleSolaris.setLastaudit("2017-08-13");
// 		systemRepository.save(systemExampleSolaris);
// 		Iterable<SystemExample> systemlist = systemRepository.findAll();
// 		System.out.println("here are system count: " + systemlist.toString());
// 		for(SystemExample systemExample:systemlist){
// 			System.out.println("Here is a system: " + systemExample.toString());
	}

}

