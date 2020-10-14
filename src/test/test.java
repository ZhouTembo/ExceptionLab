package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.BadNameException;
import main.Greeting;

class test {
	Greeting greeter;
//	//	SET UP
	@BeforeEach
	void setUp() {
//	Create instance of class being tested
		System.out.println("Before Greeting");
	 greeter=new Greeting();
		System.out.println("After Greeting");
	
	}
	
	

	@Test
	void testHello() {
		String expected="Hello Mia";
		
		String actual=greeter.Hello("Mia");
		
		assertEquals(actual, expected,"Wrong");
		
		
	}
	@Test
	void testBadNameException() {
		assertThrows(BadNameException.class, ()-> greeter.Hello("Mia"),"Name needed");
	}
}
