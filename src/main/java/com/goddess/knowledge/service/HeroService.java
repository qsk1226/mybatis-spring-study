package com.goddess.knowledge.service;

import com.goddess.knowledge.entity.GameHero;

import java.util.List;

/**
 * 英雄相关服务
 *
 * @author qinshengke
 * @since 2020/5/23 16:07
 **/
public interface HeroService {
	List<GameHero> findAll();

	int insertSeq(GameHero hero);
}
