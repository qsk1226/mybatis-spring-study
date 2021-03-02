package com.goddess.knowledge.mapper;

import com.goddess.knowledge.entity.RaceOccupationRelation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 种族职业
 * 
 * @author qinshengke
 * 2020-06-06
 */
public interface RaceOccupationRelationMapper {
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
     * @param record RaceOccupationRelation
     * 
     * @return int 影响行数
     */
    int insert(RaceOccupationRelation record);

    /**
     * 根据指定主键获取一条数据库记录
     *
     * @param id Long
     * 
     * @return RaceOccupationRelation
     */
    RaceOccupationRelation selectByPrimaryKey(Long id);

    /**
     *
     * 
     * @return List<RaceOccupationRelation>
     */
    List<RaceOccupationRelation> selectAll();

    /**
     * 根据主键来更新符合条件的数据库记录
     *
     * @param record RaceOccupationRelation
     * 
     * @return int 影响行数
     */
    int updateByPrimaryKey(RaceOccupationRelation record);
}