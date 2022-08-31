package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Feedback;
import com.example.demo.repositories.FeedbackRepository;
import com.example.demo.services.FeedbackService;

@RestController
public class FeedbackController {
	
	@Autowired
	FeedbackService feedbackService;
	
	@Autowired
	FeedbackRepository feedbackRepository;
	
	@GetMapping(value="/")
    public String showIndexPage(ModelMap model){   
		 return "<html>\n"
		 		+ "<head>\n"
		 		+ "	<style>\n"
		 		+ "		.center {\n"
		 		+ "	  		text-align: center;\n"
		 		+ "	  	}\n"
		 		+ "		a {\n"
		 		+ "	  		text-decoration: None;\n"
		 		+ "	  		color:black;\n"
		 		+ "	  	}\n"
		 		+ "		#comment, #rating, #name {\n"
		 		+ "	  		padding: 16px;\n"
		 		+ "	  		margin:4px;\n"
		 		+ "	  		border-radius:4px;\n"
		 		+ "	  	}\n"
		 		+ "	  	\n"
		 		+ "	</style>\n"
		 		+ "</head>\n"
		 		+ "<body>\n"
		 		+ "	<div class=\"center\">\n"
		 		+ "		<h1>User Feedback Page</h1>\n"
		 		+ "		\n"
		 		
		 		+ "		\n"
		 		+ "		<br><br>\n"
				+ "     <form method=\"get\" action=\"update\">\n"
				+ "			<br><h3>Enter your feedback below:</h3>\n"
				+ "			<input type=\"text\" id=\"comment\" name=\"comment\" placeholder=\"Enter Comment Here...\" required>\n"
				+ "			<input type=\"number\" id=\"rating\" name=\"rating\" placeholder=\"Enter Rating Here...\" required>\n"
				+ "			<input type=\"text\" id=\"name\" name=\"name\" placeholder=\"Enter UserName Here...\" required> <br><br>	\n"
				+ "			<input type=\"submit\" value=\"Submit\" /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \n"
				+ "         <button><a href=\"/feedback\">View all feedback</a></button>\n"
				+ "		</form>"
		 		+ "	</div>\n"
		 		+ "</body>\n"
		 		+ "</html>";
    }
	
	@GetMapping("/feedback")
	public @ResponseBody String getAllFeedbacks() {
        // This returns a JSON or XML with the Feedbacks
        Iterable<Feedback> allFB = feedbackRepository.findAll();
		return "<html>\n"
		 		+ "<head>\n"
		 		+ "	<style>\n"
		 		+ "		.center {\n"
		 		+ "	  		text-align: center;\n"
		 		+ "	  		align-items: center;\n"
		 		+ "	  	}\n"
		 		+ "	  	\n"
		 		+ "	</style>\n"
		 		+ "</head>\n"
		 		+ "<body >\n"
		 		+ "	<div class=\"center\">\n"
		 		+ "<h1>Feedback Table</h1>\n"
//		 		+ "<table border='1'>"+"<tr><th>"+"UserName"+"</th>"+"<tr><th>"+"Id"+"</th>"+"<tr><th>"+"Comments"+"</th>"+"<tr><th>"+"Rating"+"</th></tr>"
        		+ allFB.toString()
		        + "	</div>\n"
		 		+ "</body>\n"
		 		+ "</html>";
    }
	
}
