package mum.edu.controller;



//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
import mum.edu.domain.Calculator;
import mum.edu.service.CalculatorService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
 

@Controller
public class CalculatorController {
 
  @Autowired
  CalculatorService calculatorService;
  
  @RequestMapping(value={"/","/Calculator"} , method = RequestMethod.GET)
  public String inputCalc() throws Exception {
  
       return  "CalculatorForm" ;    
   }
   
  @RequestMapping(value= "/Calculator" , method = RequestMethod.POST)
  public String handleCalc(Calculator calculator,RedirectAttributes redirectAttribute ,Model model) throws Exception {
  
		if (calculator.getAdd1() != null &&
			 calculator.getAdd2() != null)
		     calculatorService.add(calculator);
 
		if (calculator.getMult1() != null &&
				 calculator.getMult2() != null)
			calculatorService.mult(calculator);

       //return  "CalculatorView" ; 
      // model.addAttribute("calc",calculator.getAdd1());
       redirectAttribute.addFlashAttribute("calculator",calculator);
       return ("redirect:success");
   }
   
  
  @RequestMapping(value="/success",method=RequestMethod.GET)
  public String respondResult(Calculator calculator, Model model){
	
//	  Calculator calc = (Calculator)(((ModelMap)model).get("calc"));
//	  if(calc!=null)System.out.println("our calc : "+ calc.getAdd1());
//	  else System.out.println("No Cal in model");
	  return "CalculatorView";
  }
 
}
