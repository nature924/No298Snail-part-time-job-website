package com.dao;

import com.entity.QiyeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiyeVO;
import com.entity.view.QiyeView;


/**
 * 企业
 * 
 * @author 
 * @email 
 * @date 2021-03-06 10:03:19
 */
public interface QiyeDao extends BaseMapper<QiyeEntity> {
	
	List<QiyeVO> selectListVO(@Param("ew") Wrapper<QiyeEntity> wrapper);
	
	QiyeVO selectVO(@Param("ew") Wrapper<QiyeEntity> wrapper);
	
	List<QiyeView> selectListView(@Param("ew") Wrapper<QiyeEntity> wrapper);

	List<QiyeView> selectListView(Pagination page,@Param("ew") Wrapper<QiyeEntity> wrapper);
	
	QiyeView selectView(@Param("ew") Wrapper<QiyeEntity> wrapper);
	
}
