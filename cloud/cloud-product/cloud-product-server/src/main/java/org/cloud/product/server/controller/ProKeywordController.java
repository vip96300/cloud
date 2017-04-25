package org.cloud.product.server.controller;

import java.util.List;

import org.cloud.product.server.model.ProKeyword;
import org.cloud.product.server.service.ProKeywordService;
import org.cloud.product.server.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
@RequestMapping(value="/product/category/product/keyword")
public class ProKeywordController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	@Autowired
	private ProKeywordService proKeywordService;
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public void add(@RequestParam(value="proKeywords",required=true)List<ProKeyword> proKeywords){
		proKeywordService.add(proKeywords);
	}

	@RequestMapping(value="/del_keyids",method=RequestMethod.DELETE)
	public void delByKeyids(@RequestParam(value="keyids",required=true)List<Long> keyids){
		proKeywordService.delByKeyids(keyids);
	}
}