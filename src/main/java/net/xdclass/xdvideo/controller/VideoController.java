package net.xdclass.xdvideo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import net.xdclass.xdvideo.domain.Video;
import net.xdclass.xdvideo.mapper.ChapterMapper;
import net.xdclass.xdvideo.mapper.VideoMapper;
import net.xdclass.xdvideo.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class VideoController {




	@Autowired
	private VideoService videoService;

	@RequestMapping("test")
	public String test(){
		System.out.println("xdclass.net");
		return "hello xdclass.net777";
	}



	@RequestMapping("test_db")
	public Object test_db(){
		System.out.println("xdclass.net");
		return videoService.selectByPrimaryKey(30);
	}

	@GetMapping("page")
	public Object pageVideo(@RequestParam(value = "page",defaultValue = "1")int page,
							@RequestParam(value = "size",defaultValue = "10")int size){
		PageHelper.startPage(page,size);
		List<Video> list = videoService.findAll();
		PageInfo<Video> pageInfo = new PageInfo<>(list);
		Map<String,Object> data = new HashMap<>();
		data.put("total_size",pageInfo.getTotal());//总条数
		data.put("total_page",pageInfo.getPages());//总页数
		data.put("current_page",page);//当前页
		data.put("data",pageInfo.getList());//数据
		return data;
	}

}
