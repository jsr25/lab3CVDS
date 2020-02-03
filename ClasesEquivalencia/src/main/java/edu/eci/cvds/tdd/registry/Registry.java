package edu.eci.cvds.tdd.registry;
import java.util.*;

public class Registry {
	private ArrayList<Person> historico;
	
	public Registry(){
		historico=new ArrayList<Person>();		
	}
	
	
    public RegisterResult registerVoter(Person p) {
		RegisterResult result=RegisterResult.VALID;
		
		if(result==RegisterResult.VALID) result=validateAge(p);
		if(result==RegisterResult.VALID) result=validateAdult(p);
		if(result==RegisterResult.VALID) result=validateId(p);
		if(result==RegisterResult.VALID) result=validateAlive(p);
		if(result==RegisterResult.VALID) result=validateName(p);
		
        return result;
    }
	
	private RegisterResult validateAdult(Person p){
		RegisterResult result=RegisterResult.VALID;
		if(p.getAge()<=17 && p.getAge()>0){
			result=RegisterResult.UNDERAGE;
		}		
		return result;
	}
	
	private RegisterResult validateAge(Person p){
		RegisterResult result=RegisterResult.VALID;
		if(p.getAge()<=0){
			result=RegisterResult.INVALID_AGE;
		}
		return result;	
	}
	private RegisterResult validateId(Person p){
		RegisterResult result=RegisterResult.VALID;
		for(int i = 0; i < historico.size() && result == RegisterResult.VALID; i++){
			if (p.getId()==historico.get(i).getId()){
				result=RegisterResult.DUPLICATED;
			}
		}
		if(result==RegisterResult.VALID) historico.add(p);
		return result;
		
	}
	private RegisterResult validateAlive(Person p){
		RegisterResult result=RegisterResult.VALID;
		if(!p.isAlive()){
			result=RegisterResult.DEAD;
		}
		return result;
	
	}
	
	private RegisterResult validateName(Person p){
		RegisterResult result=RegisterResult.VALID;
		if(p.getName().length()<1){
			result=RegisterResult.NO_NAME;
		}
	
		return result;
	}
}