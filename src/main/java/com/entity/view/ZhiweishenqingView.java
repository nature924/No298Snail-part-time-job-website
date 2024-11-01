package com.entity.view;

import com.entity.ZhiweishenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 职位申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-06 10:03:19
 */
@TableName("zhiweishenqing")
public class ZhiweishenqingView  extends ZhiweishenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhiweishenqingView(){
	}
 
 	public ZhiweishenqingView(ZhiweishenqingEntity zhiweishenqingEntity){
 	try {
			BeanUtils.copyProperties(this, zhiweishenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
