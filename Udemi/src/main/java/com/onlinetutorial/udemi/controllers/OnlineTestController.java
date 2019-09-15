package com.onlinetutorial.udemi.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.onlinetutorial.udemi.beans.OnlineTestQuestionBean;
import com.onlinetutorial.udemi.commons.Constants;
import com.onlinetutorial.udemi.commons.ValidationsUtils;
import com.onlinetutorial.udemi.model.TestType;
import com.onlinetutorial.udemi.validator.OnlineTestQuestionBeanValidator;
import com.onlinetutorial.udemicontrollerservice.OnlineTestControllerService;

@Controller
public class OnlineTestController {
	
	@Autowired
	private OnlineTestQuestionBeanValidator validator;
	
	@Autowired
	private HttpSession httpSession;
	
	@InitBinder
	public void InitBinder(WebDataBinder webDataBinder) {
		webDataBinder.setValidator(validator);
	}
	
	@Autowired
	private OnlineTestControllerService onlineTestControllerService;
	
	/*
	 * @Autowired private CurrentUser currentUser;
	 */
	
	@RequestMapping(value = "/savequestion", method = RequestMethod.GET)
	public String addQuestion(Model model) {
		
		OnlineTestQuestionBean onlineTestQuestionBean = new OnlineTestQuestionBean();		
		Integer optionsCount = (Integer) model.asMap().get("optionsCount");	
		Integer testTypeId = (Integer) model.asMap().get("testTypeId");	
		
		List<TestType> testTypeList = onlineTestControllerService.getAllTestType();
		
		
		if(optionsCount != null) {
			
			model.addAttribute("hideShowDiv", Constants.Y);
			
			//while adding option count the Page is refreshing so we lost data for that to save 
			//Question info we set data 
			String question = (String) model.asMap().get("question");	
			onlineTestQuestionBean.setQuestion(question);
			onlineTestQuestionBean.setOptionsCount(optionsCount.toString());
		}
		
		
		model.addAttribute("OnlineTestQuestionBean", onlineTestQuestionBean);
		model.addAttribute("testTypeList", testTypeList);
		model.addAttribute("testTypeId", testTypeId);
		
		return "addquestion";
	}
	
	@RequestMapping(value = "/savequestion", method = RequestMethod.POST)
	public String saveQuestion(@Validated @ModelAttribute("OnlineTestQuestionBean")OnlineTestQuestionBean onlineTestQuestionBean, BindingResult bindingResult , Model model) {
		
		if(bindingResult.hasErrors()) {		
			
			model.addAttribute("hideShowDiv", Constants.Y);
			
			model.addAttribute("OnlineTestQuestionBean", onlineTestQuestionBean);
			
			return "addquestion"; 
		
		}
		onlineTestControllerService.saveQueAnsOptions(onlineTestQuestionBean);
		
		return null;
	}
	
	@RequestMapping(value = "getexcel", method = RequestMethod.GET)
	public String getExcel(Model model) {
		model.addAttribute("OnlineTestQuestionBeanfile", new OnlineTestQuestionBean());
		return "getexcel";
	}
	
	@RequestMapping(value = "savequestionfromfile", method = RequestMethod.POST)
	public String saveExcelData(@ModelAttribute("OnlineTestQuestionBeanfile")OnlineTestQuestionBean onlineTestQuestionBean, Model model) {
		
		onlineTestControllerService.saveQueAnsOptionsFromExcel(onlineTestQuestionBean);
		

		return "getexcel";
	}
	
	
	@RequestMapping(value = "/showoptionsfield", method = RequestMethod.GET)
	public String showOptions(@RequestParam("optionsCount") String optionsCount , @RequestParam("question")String question, 
			                  @RequestParam("testType_id")String testTypeId, RedirectAttributes redirect) {
		
	  redirect.addFlashAttribute("optionsCount", Integer.parseInt(optionsCount));
	  redirect.addFlashAttribute("question", question);
	  redirect.addFlashAttribute("testTypeId", Integer.parseInt(testTypeId));
	
	  
		return "redirect:/savequestion";
	}
	
	@RequestMapping(value = "/selecttest", method = RequestMethod.GET)
	public String selectTestQuestion(Model model , @RequestParam("testTypeId")String testTypeId) {	
		
		System.out.println(testTypeId+"-----------------");
		List<TestType> testTypeList = onlineTestControllerService.getAllTestType();
		
		if(ValidationsUtils.checkStringIsNullorEmpty(testTypeId)) {
			
			onlineTestControllerService.getTestQuestionByTestType(Long.parseLong(testTypeId));
		}
		
		
		model.addAttribute("testTypeList", testTypeList);
	  
		return "selecttest";
	}
	
	
	@RequestMapping(value = "/getQuestion", method = RequestMethod.GET)
	public String showOptions(Model model) {
		
		model.addAttribute("testTime", 3600);
	  
	
	  
		return "onlineTest";
	}
	
    
}
