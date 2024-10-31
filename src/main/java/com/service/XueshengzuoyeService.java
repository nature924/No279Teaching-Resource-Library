package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengzuoyeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengzuoyeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengzuoyeView;


/**
 * 学生作业
 *
 * @author 
 * @email 
 * @date 2021-04-15 11:05:43
 */
public interface XueshengzuoyeService extends IService<XueshengzuoyeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengzuoyeVO> selectListVO(Wrapper<XueshengzuoyeEntity> wrapper);
   	
   	XueshengzuoyeVO selectVO(@Param("ew") Wrapper<XueshengzuoyeEntity> wrapper);
   	
   	List<XueshengzuoyeView> selectListView(Wrapper<XueshengzuoyeEntity> wrapper);
   	
   	XueshengzuoyeView selectView(@Param("ew") Wrapper<XueshengzuoyeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengzuoyeEntity> wrapper);
   	
}

