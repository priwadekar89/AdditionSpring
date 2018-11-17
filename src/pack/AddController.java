package pack;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import model.Addition;

public class AddController implements Controller{
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) {
	
		Addition a = new Addition();
		a.setNo1(Integer.parseInt(req.getParameter("no1")));
		a.setNo2(Integer.parseInt(req.getParameter("no2")));
		int add = a.getNo1() + a.getNo2();
		System.out.println("test1");
		ModelAndView mv = new ModelAndView("add");
		System.out.println("test1");
		mv.addObject("addition", add);
		System.out.println("test3");
		return mv;
		
	}
	
	
	
}