package com.dao;

import com.entity.JianzhixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianzhixinxiVO;
import com.entity.view.JianzhixinxiView;


/**
 * 兼职信息
 * 
 * @author 
 * @email 
 * @date 2021-03-06 10:03:19
 */
public interface JianzhixinxiDao extends BaseMapper<JianzhixinxiEntity> {
	
	List<JianzhixinxiVO> selectListVO(@Param("ew") Wrapper<JianzhixinxiEntity> wrapper);
	
	JianzhixinxiVO selectVO(@Param("ew") Wrapper<JianzhixinxiEntity> wrapper);
	
	List<JianzhixinxiView> selectListView(@Param("ew") Wrapper<JianzhixinxiEntity> wrapper);

	List<JianzhixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JianzhixinxiEntity> wrapper);
	
	JianzhixinxiView selectView(@Param("ew") Wrapper<JianzhixinxiEntity> wrapper);
	
}
