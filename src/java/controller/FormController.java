/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.util.LinkedHashMap;
import java.util.Map;
import model.Person;
import model.PersonValidator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Daniel
 */

@Controller
@RequestMapping(value="form.htm")
public class FormController {
    
    private PersonValidator validator;

    public FormController() {
        this.validator = new PersonValidator();
        
    }
    
    
    
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView form(){
        
        ModelAndView mav = new ModelAndView();
        mav.setViewName("form");
        mav.addObject("person",new Person());
        
        
        return mav;
        /* pass parameter throught the constructor of the class person
        return new ModelAndView("form","command",new Person("Daniel", "Email@gmail.com", 23,1));
        */
    }
    
    
    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView form(@ModelAttribute("person") Person per, 
            BindingResult result, 
            SessionStatus status){
    
        //send data to validate
        this.validator.validate(per, result);
        
        //check errors
        if(result.hasErrors()){
            ModelAndView mav = new ModelAndView();
            mav.setViewName("form");
            mav.addObject("person",new Person());
            return mav;
        }
        else{
            ModelAndView mav = new ModelAndView();
            mav.setViewName("success");
            mav.addObject("name",per.getName());
            mav.addObject("email",per.getEmail());
            mav.addObject("age",per.getAge());
            mav.addObject("country",per.getCountry());
            return mav;
        }
    }
    
    
     //fill select on jsp form
    @ModelAttribute("countries")
    public Map<String,String> listCountry(){
        
        Map<String,String> country = new LinkedHashMap<>();
        country.put("1","CHILE");
        country.put("2","ESPAÑA");
        country.put("3","ARGENTINA");
        country.put("4","SUIZA");
        country.put("5","USA");
        
        return country;
    }
}
