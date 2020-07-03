package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.AddressDAO;
import com.example.demo.dao.UserDAO;
import com.example.demo.entity.Address;
import com.example.demo.entity.User;

@SpringBootApplication
public class ModelNoMappingApplication implements CommandLineRunner{
	
	private static final Logger log_ = LoggerFactory.getLogger(ModelNoMappingApplication.class);
	
	@Autowired UserDAO userdb;
	@Autowired AddressDAO addressDB;
	
	public static void main(String[] args) {
		SpringApplication.run(ModelNoMappingApplication.class, args);
		System.out.println("main");//this line : execute after run()
	}
	
	
	public void run(String... args) throws Exception {
		System.out.println("command line..");
		
		/** address dummy data **/
		log_.info("__________ address dummy data");
		Address a = new Address("bangalore", "KA");
		Address a2 = new Address("Bhilai", "CG");
		Address a3 = new Address("Delhi", "DL");
		Address a4 = new Address("Patna", "BR");
		Address a5 = Address.builder().city("Mysore").state("Karnataka").build();
		addressDB.save(a);
		addressDB.save(a2);
		addressDB.save(a3);
		addressDB.save(a4);
		addressDB.save(a5);

		/** user dummy data **/
		log_.info("__________ user dummy data");
		User u = new User("hari", a5);
		User u2 = new User("hari", a2);
		User u3 = new User("hari", a3);
		userdb.save(u);
		userdb.save(u2);
		userdb.save(u3);
		
		/** Test **/
		System.out.println("All Address: \n"+addressDB.findAll());
		System.out.println("All Users: \n"+userdb.findAll());
	}

}
