package com.doranco.blogHistoryTest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doranco.blogHistoryTest.model.Story;

@Repository
public interface StoryRepository extends JpaRepository<Story,Long > {

}
