package org.studyeasy;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String homepage() {
		return "hello";
	}

	@GetMapping(value = "/displayName")
	public ModelAndView displayname(HttpServletRequest request) {
		List<String> list = new ArrayList<String>();
		list.add("Rajat");
		list.add("Saksham");
		list.add("Sahil");
		list.add("Shubham");

		String firstname = request.getParameter("firstname");
		ModelAndView mav = new ModelAndView("displayname");
		mav.addObject("firstname", firstname);
		mav.addObject("list", list);
		return mav;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/apple")
	public ModelAndView apple() {
		HibernateConnect connect = new HibernateConnect();
		ModelAndView mov = new ModelAndView("apple");

		List<Apple> list = connect.getList();
		mov.addObject("list", list);

		System.out.println(list);
		return mov;
	}

}
