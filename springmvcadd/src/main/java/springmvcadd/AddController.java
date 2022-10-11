package springmvcadd;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response)
	{
		int i= Integer.parseInt(request.getParameter("t1"));	
		int j= Integer.parseInt(request.getParameter("t2"));
		int k = i+j;
		ModelAndView mv = new ModelAndView();//to send data to jsp page
		mv.setViewName("display.jsp");
		mv.addObject("result", k); //add object takes 2 parameters label and data
		return mv;
	}
}
