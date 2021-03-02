package com.goddess.knowledge.service;

import com.goddess.knowledge.entity.GameHero;
import com.goddess.knowledge.mapper.GameHeroMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 英雄相关服务
 *
 * @author qinshengke
 * @since 2020/5/23 16:07
 **/
@Service
public class HeroServiceImpl implements HeroService {
	/*@Autowired
	private GameHeroMapper gameHeroMapper;*/

	@Override
	public List<GameHero> findAll() {
		//return gameHeroMapper.selectAll();
		return null;
	}

	@Transactional
	@Override
	public int insertSeq(GameHero hero) {
		return 0;
	}
}
