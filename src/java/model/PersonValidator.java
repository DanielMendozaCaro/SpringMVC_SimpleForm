/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author Daniel Mendoza Caro
 */
public class PersonValidator implements Validator{

    
    private static final String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private Pattern pattern;
    private Matcher matcher;
    
    
    @Override
    public boolean supports(Class<?> type) {
        return Person.class.isAssignableFrom(type);
    }

    @Override
    public void validate(Object o, Errors errors) {
        
        Person per = (Person)o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "required.name","El campo nombre es obligatorio.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "required.name","El campo email es obligatorio.");
    
        if(!(per.getEmail() != null && per.getEmail().isEmpty())){
        
            //validate email with regular expressions
            this.pattern = Pattern.compile(PATTERN_EMAIL);
            this.matcher = pattern.matcher(per.getEmail());
                if(!matcher.matches()){
                    errors.rejectValue("email", "email.incorrect", "EL email " + per.getEmail() + " no es valido");
                }
        }
        
        if(per.getCountry()==0) errors.rejectValue("country", "country.incorrect","El campo pais es obligatorio");
        if(per.getAge()==0) errors.rejectValue("age", "age.incorrect","El campo edad es obligatorio");
            
    }
}//end class
