package org.cloud.product.admin.service;

import java.util.List;
import java.util.Map;

import org.cloud.product.admin.model.AttGroup;
import org.cloud.product.admin.service.breaker.AttGroupServiceBreaker;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="cloud-product-server",fallback=AttGroupServiceBreaker.class)
public interface AttGroupService {
	
	/**
	 * 根据类目编号获取属性组和属性列表和属性值列表
	 * @param catId
	 * @return
	 */	
	@RequestMapping(value="/product/category/attribute/attGroup/list_attributes_attValues_catid",method=RequestMethod.GET)
	public List<Map<String,List<Object>>> listAttributesAttValuesByCatid(@RequestParam(value="catid",required=true)long catid);
	
	/**
	 * 添加属性组
	 * @param attGroup
	 */
	@RequestMapping(value="/product/category/attribute/attGroup/add",method=RequestMethod.POST)
	public void add(@RequestBody AttGroup attGroup);
	
	/**
	 * 根据属性组编号获取属性组
	 * @param groid
	 * @return
	 */
	@RequestMapping(value="/product/category/attribute/attGroup/get_groid",method=RequestMethod.GET)
	public AttGroup getByGroid(@RequestParam(value="groid",required=true)long groid);
	
	/**
	 * 删除属性组，级联删除以下所有属性
	 * @param groid
	 */
	@RequestMapping(value="/product/category/attribute/attGroup/del_groid",method=RequestMethod.DELETE)
	public void delByGroid(@RequestParam(value="groid",required=true)long groid);
	
	/**
	 * 修改属性组
	 * @param attGroup
	 */
	@RequestMapping(value="/product/category/attribute/attGroup/upd_groid",method=RequestMethod.PUT)
	public void updByGroid(@RequestBody AttGroup attGroup);
}
