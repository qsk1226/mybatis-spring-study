package com.goddess.knowledge.service;

import com.goddess.knowledge.entity.Hero;
import com.goddess.knowledge.entity.example.HeroCondition;
import com.goddess.knowledge.mapper.HeroMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TODO
 *
 * @author qinshengke
 * @since 2020/5/23 16:07
 **/
@Service
public class HeroServiceImpl implements HeroService{

	@Autowired
	private HeroMapper heroMapper;

	@Override
	public List<Hero> findAll() {
		HeroCondition heroCondition = new HeroCondition();
		HeroCondition.Criteria criteria = heroCondition.createCriteria();
		criteria.andEmailIsNull();
		return heroMapper.selectByExample(heroCondition);
	}
}
