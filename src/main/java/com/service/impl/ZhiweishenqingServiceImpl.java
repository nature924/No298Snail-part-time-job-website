package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZhiweishenqingDao;
import com.entity.ZhiweishenqingEntity;
import com.service.ZhiweishenqingService;
import com.entity.vo.ZhiweishenqingVO;
import com.entity.view.ZhiweishenqingView;

@Service("zhiweishenqingService")
public class ZhiweishenqingServiceImpl extends ServiceImpl<ZhiweishenqingDao, ZhiweishenqingEntity> implements ZhiweishenqingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhiweishenqingEntity> page = this.selectPage(
                new Query<ZhiweishenqingEntity>(params).getPage(),
                new EntityWrapper<ZhiweishenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhiweishenqingEntity> wrapper) {
		  Page<ZhiweishenqingView> page =new Query<ZhiweishenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhiweishenqingVO> selectListVO(Wrapper<ZhiweishenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhiweishenqingVO selectVO(Wrapper<ZhiweishenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhiweishenqingView> selectListView(Wrapper<ZhiweishenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhiweishenqingView selectView(Wrapper<ZhiweishenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
