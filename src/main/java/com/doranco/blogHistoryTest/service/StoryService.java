package com.doranco.blogHistoryTest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.doranco.blogHistoryTest.model.Story;

@Service
public interface StoryService {

	Story save(Story story) ; 
	List<Story>findAllStories();
	 Story update(Story s); 
	 void delete (Long id ); 
	 Story findById(Long id); 


}
