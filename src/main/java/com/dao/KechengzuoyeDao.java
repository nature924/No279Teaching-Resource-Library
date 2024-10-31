package com.dao;

import com.entity.KechengzuoyeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KechengzuoyeVO;
import com.entity.view.KechengzuoyeView;


/**
 * 课程作业
 * 
 * @author 
 * @email 
 * @date 2021-04-15 11:05:43
 */
public interface KechengzuoyeDao extends BaseMapper<KechengzuoyeEntity> {
	
	List<KechengzuoyeVO> selectListVO(@Param("ew") Wrapper<KechengzuoyeEntity> wrapper);
	
	KechengzuoyeVO selectVO(@Param("ew") Wrapper<KechengzuoyeEntity> wrapper);
	
	List<KechengzuoyeView> selectListView(@Param("ew") Wrapper<KechengzuoyeEntity> wrapper);

	List<KechengzuoyeView> selectListView(Pagination page,@Param("ew") Wrapper<KechengzuoyeEntity> wrapper);
	
	KechengzuoyeView selectView(@Param("ew") Wrapper<KechengzuoyeEntity> wrapper);
	
}
