package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengchengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengchengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengchengjiView;


/**
 * 学生成绩
 *
 * @author 
 * @email 
 * @date 2021-04-15 11:05:43
 */
public interface XueshengchengjiService extends IService<XueshengchengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengchengjiVO> selectListVO(Wrapper<XueshengchengjiEntity> wrapper);
   	
   	XueshengchengjiVO selectVO(@Param("ew") Wrapper<XueshengchengjiEntity> wrapper);
   	
   	List<XueshengchengjiView> selectListView(Wrapper<XueshengchengjiEntity> wrapper);
   	
   	XueshengchengjiView selectView(@Param("ew") Wrapper<XueshengchengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengchengjiEntity> wrapper);
   	
}

