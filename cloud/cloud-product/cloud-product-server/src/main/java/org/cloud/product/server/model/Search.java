package org.cloud.product.server.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="product_category_search")
public class Search extends BaseModel implements Serializable{

	/**
	 * 搜索
	 */
	private static final long serialVersionUID = -6946276860866171346L;
	
	@Id
	@GeneratedValue
	private Long seaid;
	@Column(nullable=false)
	private Long catid;//类目编号
	@Column(nullable=false)
	private String name;//名称
	@Column(nullable=false)
	private Long time;//时间
	public Long getSeaid() {
		return seaid;
	}
	public void setSeaid(Long seaid) {
		this.seaid = seaid;
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
