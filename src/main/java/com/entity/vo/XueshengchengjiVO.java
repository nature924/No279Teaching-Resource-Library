package com.entity.vo;

import com.entity.XueshengchengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 学生成绩
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-15 11:05:43
 */
public class XueshengchengjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
