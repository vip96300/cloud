package org.cloud.product.server.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_category_attribute")
public class Attribute implements Serializable{

	private static final long serialVersionUID = -4187369360003107593L;
	
	@Id
	@GeneratedValue
	private Long attId;//编号
	@Column(nullable=false)
	private Long catId;//类目编号
	@Column(nullable=false)
	private String name;//属性名称
	@Column(nullable=false)
	private Integer isOpt;
	@Column(nullable=false)
	private Long time;//创建时间

}