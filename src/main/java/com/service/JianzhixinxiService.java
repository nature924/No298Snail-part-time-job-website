package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JianzhixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JianzhixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JianzhixinxiView;


/**
 * 兼职信息
 *
 * @author 
 * @email 
 * @date 2021-03-06 10:03:19
 */
public interface JianzhixinxiService extends IService<JianzhixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianzhixinxiVO> selectListVO(Wrapper<JianzhixinxiEntity> wrapper);
   	
   	JianzhixinxiVO selectVO(@Param("ew") Wrapper<JianzhixinxiEntity> wrapper);
   	
   	List<JianzhixinxiView> selectListView(Wrapper<JianzhixinxiEntity> wrapper);
   	
   	JianzhixinxiView selectView(@Param("ew") Wrapper<JianzhixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianzhixinxiEntity> wrapper);
   	
}

