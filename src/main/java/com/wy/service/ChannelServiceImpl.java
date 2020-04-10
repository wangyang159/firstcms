package com.wy.service;

import java.util.List;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wy.bean.Category;
import com.wy.bean.Channel;
import com.wy.dao.ChannelMapper;

@Service
public class ChannelServiceImpl implements ChannelService {
	@Resource
	private ChannelMapper channelMapper;

	@Override
	public List<Channel> selects() {
		// TODO Auto-generated method stub
		return channelMapper.selects();
	}

	@Override
	public List<Category> selectsByChannelId(Integer channelId) {
		// TODO Auto-generated method stub
		return channelMapper.selectsByChannelId(channelId);
	}

}
