package net.xdclass.xdvideo.service.impl;

import net.xdclass.xdvideo.domain.Video;
import net.xdclass.xdvideo.mapper.VideoMapper;
import net.xdclass.xdvideo.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {

	@Autowired
	private VideoMapper videoMapper;
	@Override
	public int deleteByPrimaryKey(Integer id) {
		return videoMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Video record) {
		return videoMapper.insert(record);
	}

	@Override
	public int insertSelective(Video record) {
		return videoMapper.insertSelective(record);
	}

	@Override
	public Video selectByPrimaryKey(Integer id) {
		return videoMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Video record) {
		return videoMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Video record) {
		return videoMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Video> findAll() {
		return videoMapper.findAll();
	}
}
