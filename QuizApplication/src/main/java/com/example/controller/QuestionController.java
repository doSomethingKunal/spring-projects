package com.example.controller;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Question;
import com.example.repository.QuestionRepository;

@Controller
@RequestMapping("/user/test")
public class QuestionController {
	@Autowired
	private QuestionRepository qRepository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView getAllQuestions(@ModelAttribute("question") Question question, BindingResult errors) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("questions", qRepository.findAll());
		modelAndView.setViewName("user/displayquestions");
		return modelAndView;
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ModelAndView submitAnswers(
			@RequestParam(value = "answerChoiceCheckbox", required = false) BigInteger[] answerChoiceCheckbox) {
		ModelAndView modelAndView = new ModelAndView();
		if (answerChoiceCheckbox != null) {
			for (int i = 0; i < answerChoiceCheckbox.length; i++) {
				System.out.println("select answers are: >>>>>>>>>>> " + answerChoiceCheckbox[i]);
			}
		}
		modelAndView.addObject("questions", qRepository.findAll());
		modelAndView.setViewName("user/displayquestions");
		return modelAndView;
	}
}
