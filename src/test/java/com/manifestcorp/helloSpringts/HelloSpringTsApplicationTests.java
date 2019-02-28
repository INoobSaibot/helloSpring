package com.manifestcorp.helloSpringts;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import com.manifestcorp.helloSpringts.helloSpringts.HelloSpringTsApplication;
import com.manifestcorp.helloSpringts.model.Customer;
import com.manifestcorp.helloSpringts.repos.CustomerRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { HelloSpringTsApplication.class })
@WebAppConfiguration
@SpringBootTest
public class HelloSpringTsApplicationTests {

	
	
	 @Autowired
	 CustomerRepository customerRepository;
	    
	    @Test
	    public void test() {
	        Customer entity = new Customer();
	        entity.setFirstName("wub");
	        entity.setLastName("lubba");
	        
	        entity.setId(33L);
	        customerRepository.save(entity);
	        List<Customer> all = customerRepository.findAll();

	        assertEquals(all.size(), 1);
	    }

}







