package com.dao;

import com.entity.ZhiweishenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhiweishenqingVO;
import com.entity.view.ZhiweishenqingView;


/**
 * 职位申请
 * 
 * @author 
 * @email 
 * @date 2021-03-06 10:03:19
 */
public interface ZhiweishenqingDao extends BaseMapper<ZhiweishenqingEntity> {
	
	List<ZhiweishenqingVO> selectListVO(@Param("ew") Wrapper<ZhiweishenqingEntity> wrapper);
	
	ZhiweishenqingVO selectVO(@Param("ew") Wrapper<ZhiweishenqingEntity> wrapper);
	
	List<ZhiweishenqingView> selectListView(@Param("ew") Wrapper<ZhiweishenqingEntity> wrapper);

	List<ZhiweishenqingView> selectListView(Pagination page,@Param("ew") Wrapper<ZhiweishenqingEntity> wrapper);
	
	ZhiweishenqingView selectView(@Param("ew") Wrapper<ZhiweishenqingEntity> wrapper);
	
}
