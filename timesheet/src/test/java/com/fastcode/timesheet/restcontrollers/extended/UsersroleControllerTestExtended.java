package com.fastcode.timesheet.restcontrollers.extended;

import com.fastcode.timesheet.restcontrollers.core.UsersroleControllerTest;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
				properties = "spring.profiles.active=test")
public class UsersroleControllerTestExtended extends UsersroleControllerTest {
	
	//Add your custom code here	
}
