package com.goddess.knowledge.mapper;

import com.goddess.knowledge.entity.Hero;
import com.goddess.knowledge.entity.example.HeroCondition;

import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * 
 * @author qinshengke
 * 2020-05-23
 */
public interface HeroMapper {
    /**
     * 根据指定的条件获取数据库记录数
     *
     * @param condition HeroCondition
     * 
     * @return long 记录数
     */
    long countByExample(HeroCondition condition);

    /**
     * 根据指定的条件删除数据库符合条件的记录
     *
     * @param condition HeroCondition
     * 
     * @return int 影响行数
     */
    int deleteByExample(HeroCondition condition);

    /**
     * 根据主键删除数据库的记录
     *
     * @param id Long
     * 
     * @return int 影响行数
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 新写入数据库记录
     *
     * @param record Hero
     * 
     * @return int 影响行数
     */
    int insert(Hero record);

    /**
     * 动态字段,写入数据库记录
     *
     * @param record Hero
     * 
     * @return int 影响行数
     */
    int insertSelective(Hero record);

    /**
     * 根据指定的条件查询符合条件的数据库记录
     *
     * @param condition HeroCondition
     * 
     * @return List<Hero>
     */
    List<Hero> selectByExample(HeroCondition condition);

    /**
     * 根据指定主键获取一条数据库记录
     *
     * @param id Long
     * 
     * @return Hero
     */
    Hero selectByPrimaryKey(Long id);

    /**
     * 动态根据指定的条件来更新符合条件的数据库记录
     *
     * @param record Hero
     * @param condition HeroCondition
     * 
     * @return int 影响行数
     */
    int updateByExampleSelective(@Param("record") Hero record, @Param("example") HeroCondition condition);

    /**
     * 根据指定的条件来更新符合条件的数据库记录
     *
     * @param record Hero
     * @param condition HeroCondition
     * 
     * @return int 影响行数
     */
    int updateByExample(@Param("record") Hero record, @Param("example") HeroCondition condition);

    /**
     * 动态字段,根据主键来更新符合条件的数据库记录
     *
     * @param record Hero
     * 
     * @return int 影响行数
     */
    int updateByPrimaryKeySelective(Hero record);

    /**
     * 根据主键来更新符合条件的数据库记录
     *
     * @param record Hero
     * 
     * @return int 影响行数
     */
    int updateByPrimaryKey(Hero record);
}