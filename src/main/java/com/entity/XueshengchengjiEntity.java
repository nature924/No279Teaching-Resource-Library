package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 学生成绩
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-15 11:05:43
 */
@TableName("xueshengchengji")
public class XueshengchengjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XueshengchengjiEntity() {
		
	}
	
	public XueshengchengjiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 作业名称
	 */
					
	private String zuoyemingcheng;
	
	/**
	 * 作业图片
	 */
					
	private String zuoyetupian;
	
	/**
	 * 主观题成绩
	 */
					
	private Integer zhuguantichengji;
	
	/**
	 * 客观题成绩
	 */
					
	private Integer keguantichengji;
	
	/**
	 * 成绩总分
	 */
					
	private Integer chengjizongfen;
	
	/**
	 * 成绩等级
	 */
					
	private String chengjidengji;
	
	/**
	 * 成绩评语
	 */
					
	private String chengjipingyu;
	
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 学生姓名
	 */
					
	private String xueshengxingming;
	
	/**
	 * 班级
	 */
					
	private String banji;
	
	/**
	 * 教师工号
	 */
					
	private String jiaoshigonghao;
	
	/**
	 * 教师姓名
	 */
					
	private String jiaoshixingming;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：作业名称
	 */
	public void setZuoyemingcheng(String zuoyemingcheng) {
		this.zuoyemingcheng = zuoyemingcheng;
	}
	/**
	 * 获取：作业名称
	 */
	public String getZuoyemingcheng() {
		return zuoyemingcheng;
	}
	/**
	 * 设置：作业图片
	 */
	public void setZuoyetupian(String zuoyetupian) {
		this.zuoyetupian = zuoyetupian;
	}
	/**
	 * 获取：作业图片
	 */
	public String getZuoyetupian() {
		return zuoyetupian;
	}
	/**
	 * 设置：主观题成绩
	 */
	public void setZhuguantichengji(Integer zhuguantichengji) {
		this.zhuguantichengji = zhuguantichengji;
	}
	/**
	 * 获取：主观题成绩
	 */
	public Integer getZhuguantichengji() {
		return zhuguantichengji;
	}
	/**
	 * 设置：客观题成绩
	 */
	public void setKeguantichengji(Integer keguantichengji) {
		this.keguantichengji = keguantichengji;
	}
	/**
	 * 获取：客观题成绩
	 */
	public Integer getKeguantichengji() {
		return keguantichengji;
	}
	/**
	 * 设置：成绩总分
	 */
	public void setChengjizongfen(Integer chengjizongfen) {
		this.chengjizongfen = chengjizongfen;
	}
	/**
	 * 获取：成绩总分
	 */
	public Integer getChengjizongfen() {
		return chengjizongfen;
	}
	/**
	 * 设置：成绩等级
	 */
	public void setChengjidengji(String chengjidengji) {
		this.chengjidengji = chengjidengji;
	}
	/**
	 * 获取：成绩等级
	 */
	public String getChengjidengji() {
		return chengjidengji;
	}
	/**
	 * 设置：成绩评语
	 */
	public void setChengjipingyu(String chengjipingyu) {
		this.chengjipingyu = chengjipingyu;
	}
	/**
	 * 获取：成绩评语
	 */
	public String getChengjipingyu() {
		return chengjipingyu;
	}
	/**
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
	/**
	 * 设置：学生姓名
	 */
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
	/**
	 * 设置：班级
	 */
	public void setBanji(String banji) {
		this.banji = banji;
	}
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
	/**
	 * 设置：教师工号
	 */
	public void setJiaoshigonghao(String jiaoshigonghao) {
		this.jiaoshigonghao = jiaoshigonghao;
	}
	/**
	 * 获取：教师工号
	 */
	public String getJiaoshigonghao() {
		return jiaoshigonghao;
	}
	/**
	 * 设置：教师姓名
	 */
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}

}
