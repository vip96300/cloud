package org.cloud.product.admin.service.breaker;

import java.util.List;
import java.util.Map;

import org.cloud.product.admin.model.Keyword;
import org.cloud.product.admin.model.Search;
import org.cloud.product.admin.service.SearchService;
import org.springframework.stereotype.Component;

@Component
public class SearchServiceBreaker implements SearchService{

	@Override
	public void add(Search search) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Map<Search, List<Keyword>>> listKeywordsByCatid(long catid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Search getBySeaid(long seaid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updBySeaid(Search search) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delBySeaid(long seaid) {
		// TODO Auto-generated method stub
		
	}




}
