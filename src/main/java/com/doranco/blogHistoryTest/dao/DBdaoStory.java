package com.doranco.blogHistoryTest.dao;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.doranco.blogHistoryTest.Repository.StoryRepository;
import com.doranco.blogHistoryTest.model.Story;
import com.doranco.blogHistoryTest.service.StoryService;

@Service
@Primary 
public class DBdaoStory implements 	StoryService {
	private final StoryRepository repository; 

	public DBdaoStory(StoryRepository repository) {
		this.repository = repository;
	}

	@Override
	public Story save(Story story) {
		return repository.save(story);
	}

	@Override
	public List<Story> findAllStories() {
		return repository.findAll();
	}

	@Override
	public Story update(Story s) {
		return repository.save(s);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);	
	}

	@Override
	public Story findById(Long id) {
		return  null;
	}

}
