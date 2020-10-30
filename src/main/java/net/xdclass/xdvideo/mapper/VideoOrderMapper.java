package net.xdclass.xdvideo.mapper;

import net.xdclass.xdvideo.domain.VideoOrder;

public interface VideoOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VideoOrder record);

    int insertSelective(VideoOrder record);

    VideoOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VideoOrder record);

    int updateByPrimaryKey(VideoOrder record);
}