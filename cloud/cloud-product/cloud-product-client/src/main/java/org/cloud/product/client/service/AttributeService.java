package org.cloud.product.client.service;

import java.util.List;

import org.cloud.product.client.model.Attribute;
import org.cloud.product.client.service.breaker.AttributeServiceBreaker;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="cloud-product-server",fallback=AttributeServiceBreaker.class)
public interface AttributeService {
	/**
	 * 根据类目编号获取
	 * @param attId
	 * @return
	 */
	@RequestMapping(value = "/product/category/attribute/list_catId",method=RequestMethod.GET)
	public List<Attribute> listByCatId(@RequestParam(value="catId") long catId);
	/**
	 * 添加属性
	 * @param attribute
	 */
	@RequestMapping(value = "/product/category/attribute/add",method=RequestMethod.POST)
	public void add(@ModelAttribute Attribute attribute);
}