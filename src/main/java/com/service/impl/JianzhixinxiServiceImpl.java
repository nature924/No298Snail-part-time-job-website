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


import com.dao.JianzhixinxiDao;
import com.entity.JianzhixinxiEntity;
import com.service.JianzhixinxiService;
import com.entity.vo.JianzhixinxiVO;
import com.entity.view.JianzhixinxiView;

@Service("jianzhixinxiService")
public class JianzhixinxiServiceImpl extends ServiceImpl<JianzhixinxiDao, JianzhixinxiEntity> implements JianzhixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianzhixinxiEntity> page = this.selectPage(
                new Query<JianzhixinxiEntity>(params).getPage(),
                new EntityWrapper<JianzhixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianzhixinxiEntity> wrapper) {
		  Page<JianzhixinxiView> page =new Query<JianzhixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JianzhixinxiVO> selectListVO(Wrapper<JianzhixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JianzhixinxiVO selectVO(Wrapper<JianzhixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JianzhixinxiView> selectListView(Wrapper<JianzhixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianzhixinxiView selectView(Wrapper<JianzhixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
