package org.cloud.product.server.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_category_attgroup")
public class AttGroup extends BaseModel implements Serializable{

	private static final long serialVersionUID = -8871759945813635178L;
	/**
	 * 属性组
	 */
	@Id
	@GeneratedValue
	private Long groid;
	@Column(nullable=false)
	private Long catid;//类目编号
	@Column(nullable=false)
	private String name;//名称
	@Column(nullable=false)
	private Long time;//创建时间
	public Long getGroid() {
		return groid;
	}
	public void setGroid(Long groid) {
		this.groid = groid;
	}
	public Long getCatid() {
		return catid;
	}
	public void setCatid(Long catid) {
		this.catid = catid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getTime() {
		return time;
	}
	public void setTime(Long time) {
		this.time = time;
	}
	

	
}
