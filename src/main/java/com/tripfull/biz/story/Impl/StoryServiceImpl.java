package com.tripfull.biz.story.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tripfull.biz.story.StoryService;
import com.tripfull.biz.story.StoryVO;


@Service
public class StoryServiceImpl implements StoryService {

	private StoryDAO storyDAO;
	
	@Override
	public void insertStory(StoryVO vo) {
		storyDAO.insertStory(vo);
	}

	@Override
	public List<StoryVO> getStoryList(StoryVO vo) {
		List<StoryVO> list = storyDAO.getStoryList(vo);
		return list;
	}

	@Override
	public StoryVO getStory(StoryVO vo) {
		StoryVO story = storyDAO.getStory(vo);
		return story;
	}

	@Override
	public void updateStory(StoryVO vo) {
		storyDAO.updateStory(vo);
	}

	@Override
	public void deleteStory(StoryVO vo) {
		storyDAO.deleteStory(vo);
	}


}
