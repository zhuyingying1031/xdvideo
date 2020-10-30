package net.xdclass.xdvideo.service;

import net.xdclass.xdvideo.domain.Video;

import java.util.List;

public interface VideoService {
	int deleteByPrimaryKey(Integer id);

	int insert(Video record);

	int insertSelective(Video record);

	Video selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Video record);

	int updateByPrimaryKey(Video record);

	List<Video> findAll();
}
