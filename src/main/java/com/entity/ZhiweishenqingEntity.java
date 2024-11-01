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
 * 职位申请
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-06 10:03:19
 */
@TableName("zhiweishenqing")
public class ZhiweishenqingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhiweishenqingEntity() {
		
	}
	
	public ZhiweishenqingEntity(T t) {
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
	 * 职位名称
	 */
					
	private String zhiweimingcheng;
	
	/**
	 * 招聘人数
	 */
					
	private String zhaopinrenshu;
	
	/**
	 * 薪资待遇
	 */
					
	private String xinzidaiyu;
	
	/**
	 * 职位简介
	 */
					
	private String zhiweijianjie;
	
	/**
	 * 工作内容
	 */
					
	private String gongzuoneirong;
	
	/**
	 * 企业号
	 */
					
	private String qiyehao;
	
	/**
	 * 企业名称
	 */
					
	private String qiyemingcheng;
	
	/**
	 * 申请日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shenqingriqi;
	
	/**
	 * 简历
	 */
					
	private String jianli;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	/**
	 * 手机号码
	 */
					
	private String shoujihaoma;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
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
	 * 设置：职位名称
	 */
	public void setZhiweimingcheng(String zhiweimingcheng) {
		this.zhiweimingcheng = zhiweimingcheng;
	}
	/**
	 * 获取：职位名称
	 */
	public String getZhiweimingcheng() {
		return zhiweimingcheng;
	}
	/**
	 * 设置：招聘人数
	 */
	public void setZhaopinrenshu(String zhaopinrenshu) {
		this.zhaopinrenshu = zhaopinrenshu;
	}
	/**
	 * 获取：招聘人数
	 */
	public String getZhaopinrenshu() {
		return zhaopinrenshu;
	}
	/**
	 * 设置：薪资待遇
	 */
	public void setXinzidaiyu(String xinzidaiyu) {
		this.xinzidaiyu = xinzidaiyu;
	}
	/**
	 * 获取：薪资待遇
	 */
	public String getXinzidaiyu() {
		return xinzidaiyu;
	}
	/**
	 * 设置：职位简介
	 */
	public void setZhiweijianjie(String zhiweijianjie) {
		this.zhiweijianjie = zhiweijianjie;
	}
	/**
	 * 获取：职位简介
	 */
	public String getZhiweijianjie() {
		return zhiweijianjie;
	}
	/**
	 * 设置：工作内容
	 */
	public void setGongzuoneirong(String gongzuoneirong) {
		this.gongzuoneirong = gongzuoneirong;
	}
	/**
	 * 获取：工作内容
	 */
	public String getGongzuoneirong() {
		return gongzuoneirong;
	}
	/**
	 * 设置：企业号
	 */
	public void setQiyehao(String qiyehao) {
		this.qiyehao = qiyehao;
	}
	/**
	 * 获取：企业号
	 */
	public String getQiyehao() {
		return qiyehao;
	}
	/**
	 * 设置：企业名称
	 */
	public void setQiyemingcheng(String qiyemingcheng) {
		this.qiyemingcheng = qiyemingcheng;
	}
	/**
	 * 获取：企业名称
	 */
	public String getQiyemingcheng() {
		return qiyemingcheng;
	}
	/**
	 * 设置：申请日期
	 */
	public void setShenqingriqi(Date shenqingriqi) {
		this.shenqingriqi = shenqingriqi;
	}
	/**
	 * 获取：申请日期
	 */
	public Date getShenqingriqi() {
		return shenqingriqi;
	}
	/**
	 * 设置：简历
	 */
	public void setJianli(String jianli) {
		this.jianli = jianli;
	}
	/**
	 * 获取：简历
	 */
	public String getJianli() {
		return jianli;
	}
	/**
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * 设置：用户姓名
	 */
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
	/**
	 * 设置：手机号码
	 */
	public void setShoujihaoma(String shoujihaoma) {
		this.shoujihaoma = shoujihaoma;
	}
	/**
	 * 获取：手机号码
	 */
	public String getShoujihaoma() {
		return shoujihaoma;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
