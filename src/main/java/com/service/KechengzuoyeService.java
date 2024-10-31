package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KechengzuoyeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KechengzuoyeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KechengzuoyeView;


/**
 * 课程作业
 *
 * @author 
 * @email 
 * @date 2021-04-15 11:05:43
 */
public interface KechengzuoyeService extends IService<KechengzuoyeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KechengzuoyeVO> selectListVO(Wrapper<KechengzuoyeEntity> wrapper);
   	
   	KechengzuoyeVO selectVO(@Param("ew") Wrapper<KechengzuoyeEntity> wrapper);
   	
   	List<KechengzuoyeView> selectListView(Wrapper<KechengzuoyeEntity> wrapper);
   	
   	KechengzuoyeView selectView(@Param("ew") Wrapper<KechengzuoyeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KechengzuoyeEntity> wrapper);
   	
}

