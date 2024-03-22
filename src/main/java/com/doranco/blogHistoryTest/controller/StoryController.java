package com.doranco.blogHistoryTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doranco.blogHistoryTest.model.Story;
import com.doranco.blogHistoryTest.service.StoryService;

@RestController
@RequestMapping("api/v1/story")
@CrossOrigin(origins = "http://localhost:3000") 
public class StoryController {
	
		@Autowired
		private  StoryService service ; 
		
		
		public StoryController(StoryService service) {
			this.service = service;
		}

		@GetMapping("getStories")
		public List<Story> findAllStories(){
			return service.findAllStories();
		}
		
		@PostMapping("postUser")
		public Story save(
			@RequestBody Story story ) {
			service.save(story);
			return story ; 
		}
		
		@GetMapping("/getById")
		public Story findById(@PathVariable("id") Long id){
			Story s = service.findById( id); 
			return s ;	
		}
		
		@PutMapping("updateStory")
		public Story update(@RequestBody Story s	
				) {
			return service.update(s) ;
			
		}
		@DeleteMapping("deleteStory/{id}")
		public void delete(@PathVariable Long id) {
		    service.delete(id);
		}

}

