package com.LB.TaskTracker.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.LB.TaskTracker.Model.Task;
import com.LB.TaskTracker.Repository.TaskRepository;

@Controller
public class TaskController {
	
	TaskRepository taskRepo;
	
	@GetMapping("/")
	public String getHomePage() {
		return "Login";
	}
	
	@PostMapping("/CheckCreds")
	public String checkUserCreds(@RequestParam("username") String userName, @RequestParam("password") String password) {
		
		if(userName.equals("Ime") && password.equals("pass")) return "TasksPage";
		
		return "Login";
	}
	
	@GetMapping("/AddTask")
	public String getAddTask(@RequestParam("userId") int id,Model model) {
		model.addAttribute("userId",id);
		return "AddTasksPage";
	}
	
	@PostMapping("/SubmitTask")
	public String submitTask(@RequestParam("subject") String subject,@RequestParam("body") String body,@RequestParam("userId") int userId) {
		
		taskRepo.save(new Task(subject,body,userId));
		return "redirect:/tasks?userId=" + userId; 
	}
	
}
