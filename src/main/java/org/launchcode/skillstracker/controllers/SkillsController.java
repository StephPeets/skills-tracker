package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

	@GetMapping
	public String defaultRequest() {
		return
			"<html>" +
				"<body>" +
				"<h1>Skills Tracker</h1>" +
				"<h2>" +
				"We have several skills we would like to learn. Here's the list!" +
				"</h2>" +
				"<ul>" +
				"<li>JavaScript</li>" +
				"<li>Java</li>" +
				"<li>Python</li>" +
				"<li>Kotlin</li>" +
				"<li>Go</li>" +
				"</ul>" +
				"<br>" +

				"<h2>" +
				"What are your top 3 favorites?" +
				"</h2>" +

				"<form action='choices' method='post'>" +
				"Name:" +
				"<br>" +
				"<input type='text' name='name' placeholder='Your Name' required>" +
				"<br>" +

				"First:" +
				"<br>" +
				"<select name='first'>" +
				"<option value='javascript'>JavaScript</option>" +
				"<option value='java'>Java</option>" +
				"<option value='python'>Python</option>" +
				"<option value='kotlin'>Kotlin</option>" +
				"<option value='go'>Go</option>" +
				"</select>" +
				"<br>" +

				"Second:" +
				"<br>" +
				"<select name='second'>" +
				"<option value='javascript'>JavaScript</option>" +
				"<option value='java'>Java</option>" +
				"<option value='python'>Python</option>" +
				"<option value='kotlin'>Kotlin</option>" +
				"<option value='go'>Go</option>" +
				"</select>" +
				"<br>" +

				"Third:" +
				"<br>" +
				"<select name='third'>" +
				"<option value='javascript'>JavaScript</option>" +
				"<option value='java'>Java</option>" +
				"<option value='python'>Python</option>" +
				"<option value='kotlin'>Kotlin</option>" +
				"<option value='go'>Go</option>" +
				"</select>" +
				"<br>" +

				"<input type='submit' value ='Submit'>" +
				"</form>" +
				"</body>" +
				"</html>";
	}

	@PostMapping("choices")
	public String choices(@RequestParam String name, String first, String second, String third) {
		return "<html>" +
			       "<body>" +
			       "<h1>" +
			       name + "'s Top 3 Coding Languages" +
			       "</h1>" +
			       "<h2>" +
			       "<ol>" +
			       "<li>" +
			       first +
			       "</li>" +
			       "<li>" +
			       second +
			       "</li>" +
			       "<li>" +
			       third +
			       "</li>" +
			       "</ol>" +
			       "</h2>" +
			       "</body>" +
			       "</html>";
	}
}
