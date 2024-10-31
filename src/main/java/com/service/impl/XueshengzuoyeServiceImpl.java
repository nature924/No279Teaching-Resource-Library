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


import com.dao.XueshengzuoyeDao;
import com.entity.XueshengzuoyeEntity;
import com.service.XueshengzuoyeService;
import com.entity.vo.XueshengzuoyeVO;
import com.entity.view.XueshengzuoyeView;

@Service("xueshengzuoyeService")
public class XueshengzuoyeServiceImpl extends ServiceImpl<XueshengzuoyeDao, XueshengzuoyeEntity> implements XueshengzuoyeService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengzuoyeEntity> page = this.selectPage(
                new Query<XueshengzuoyeEntity>(params).getPage(),
                new EntityWrapper<XueshengzuoyeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengzuoyeEntity> wrapper) {
		  Page<XueshengzuoyeView> page =new Query<XueshengzuoyeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengzuoyeVO> selectListVO(Wrapper<XueshengzuoyeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengzuoyeVO selectVO(Wrapper<XueshengzuoyeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengzuoyeView> selectListView(Wrapper<XueshengzuoyeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengzuoyeView selectView(Wrapper<XueshengzuoyeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
