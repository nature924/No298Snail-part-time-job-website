package com.entity.view;

import com.entity.QiyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 企业
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-06 10:03:19
 */
@TableName("qiye")
public class QiyeView  extends QiyeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QiyeView(){
	}
 
 	public QiyeView(QiyeEntity qiyeEntity){
 	try {
			BeanUtils.copyProperties(this, qiyeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
