package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiyeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiyeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiyeView;


/**
 * 企业
 *
 * @author 
 * @email 
 * @date 2021-03-06 10:03:19
 */
public interface QiyeService extends IService<QiyeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiyeVO> selectListVO(Wrapper<QiyeEntity> wrapper);
   	
   	QiyeVO selectVO(@Param("ew") Wrapper<QiyeEntity> wrapper);
   	
   	List<QiyeView> selectListView(Wrapper<QiyeEntity> wrapper);
   	
   	QiyeView selectView(@Param("ew") Wrapper<QiyeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiyeEntity> wrapper);
   	
}

