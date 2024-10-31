package com.entity.view;

import com.entity.DiscusskechengxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 课程信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-15 11:05:43
 */
@TableName("discusskechengxinxi")
public class DiscusskechengxinxiView  extends DiscusskechengxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusskechengxinxiView(){
	}
 
 	public DiscusskechengxinxiView(DiscusskechengxinxiEntity discusskechengxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discusskechengxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
