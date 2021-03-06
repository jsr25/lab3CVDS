package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {
	@Test 
	public void validateAdult(){
		Registry registry = new Registry();
		Person person = new Person("Sebastian Ramos",1018406820,20,Gender.MALE,true);
		RegisterResult result = registry.registerVoter(person);		
		Assert.assertEquals(RegisterResult.VALID, result);
	}
	
	@Test 
	public void invalidateAdult(){
		Registry registry = new Registry();
		Person person = new Person("Sebastian Ramos",1018406820,17,Gender.MALE,true);
		RegisterResult result = registry.registerVoter(person);		
		Assert.assertEquals(RegisterResult.UNDERAGE, result);		
	}
	@Test 
	public void invalidateAge(){
		Registry registry = new Registry();
		Person person = new Person("Sebastian Ramos",1018406820,-5,Gender.MALE,true);
		RegisterResult result = registry.registerVoter(person);		
		Assert.assertEquals(RegisterResult.INVALID_AGE, result);
	}
	
	@Test 
	public void validateId(){
		Registry registry = new Registry();
		Person person = new Person("Sebastian Ramos",1018406820,20,Gender.MALE,true);
		Person person1 = new Person("Maria Hernandez",1017008920,20,Gender.FEMALE,true);
		RegisterResult result = registry.registerVoter(person);		
		RegisterResult result1 = registry.registerVoter(person1);		
		Assert.assertEquals(RegisterResult.VALID, result1);		
	}
	
	@Test 
	public void invalidateId(){
		Registry registry = new Registry();
		Person person = new Person("Sebastian Ramos",1018406820,20,Gender.MALE,true);
		Person person1 = new Person("Sebastian Ramos",1018406820,20,Gender.MALE,true);
		RegisterResult result = registry.registerVoter(person);	
		RegisterResult result1 = registry.registerVoter(person1);				
		Assert.assertEquals(RegisterResult.DUPLICATED, result1);		
	}
	
	@Test 
	public void validateName(){
		Registry registry = new Registry();
		Person person = new Person("Sebastian Ramos",1018406820,20,Gender.MALE,true);
		RegisterResult result = registry.registerVoter(person);		
		Assert.assertEquals(RegisterResult.VALID, result);		
	}
	
	@Test 
	public void invalidateName(){
		Registry registry = new Registry();
		Person person = new Person("",1018406820,20,Gender.MALE,true);
		RegisterResult result = registry.registerVoter(person);		
		Assert.assertEquals(RegisterResult.NO_NAME, result);		
	}
	
	@Test 
	public void validateAlive(){
		Registry registry = new Registry();
		Person person = new Person("Sebastian Ramos",1018406820,20,Gender.MALE,true);
		RegisterResult result = registry.registerVoter(person);		
		Assert.assertEquals(RegisterResult.VALID, result);		
	}
	
	@Test 
	public void invalidateAlive(){
		Registry registry = new Registry();
		Person person = new Person("Sebastian Ramos",1018406820,20,Gender.MALE,false);
		RegisterResult result = registry.registerVoter(person);		
		Assert.assertEquals(RegisterResult.DEAD, result);		
	}
}