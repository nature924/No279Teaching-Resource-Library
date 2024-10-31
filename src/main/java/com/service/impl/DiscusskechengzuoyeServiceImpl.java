package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscusskechengzuoyeDao;
import com.entity.DiscusskechengzuoyeEntity;
import com.service.DiscusskechengzuoyeService;
import com.entity.vo.DiscusskechengzuoyeVO;
import com.entity.view.DiscusskechengzuoyeView;

@Service("discusskechengzuoyeService")
public class DiscusskechengzuoyeServiceImpl extends ServiceImpl<DiscusskechengzuoyeDao, DiscusskechengzuoyeEntity> implements DiscusskechengzuoyeService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusskechengzuoyeEntity> page = this.selectPage(
                new Query<DiscusskechengzuoyeEntity>(params).getPage(),
                new EntityWrapper<DiscusskechengzuoyeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusskechengzuoyeEntity> wrapper) {
		  Page<DiscusskechengzuoyeView> page =new Query<DiscusskechengzuoyeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusskechengzuoyeVO> selectListVO(Wrapper<DiscusskechengzuoyeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusskechengzuoyeVO selectVO(Wrapper<DiscusskechengzuoyeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusskechengzuoyeView> selectListView(Wrapper<DiscusskechengzuoyeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusskechengzuoyeView selectView(Wrapper<DiscusskechengzuoyeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
