package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhiweishenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhiweishenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhiweishenqingView;


/**
 * 职位申请
 *
 * @author 
 * @email 
 * @date 2021-03-06 10:03:19
 */
public interface ZhiweishenqingService extends IService<ZhiweishenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhiweishenqingVO> selectListVO(Wrapper<ZhiweishenqingEntity> wrapper);
   	
   	ZhiweishenqingVO selectVO(@Param("ew") Wrapper<ZhiweishenqingEntity> wrapper);
   	
   	List<ZhiweishenqingView> selectListView(Wrapper<ZhiweishenqingEntity> wrapper);
   	
   	ZhiweishenqingView selectView(@Param("ew") Wrapper<ZhiweishenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhiweishenqingEntity> wrapper);
   	
}

