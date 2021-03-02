package com.goddess.knowledge.mapper;

import com.goddess.knowledge.entity.Occupation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 职业
 * 
 * @author qinshengke
 * 2020-06-06
 */
public interface OccupationMapper {
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
     * @param record Occupation
     * 
     * @return int 影响行数
     */
    int insert(Occupation record);

    /**
     * 根据指定主键获取一条数据库记录
     *
     * @param id Long
     * 
     * @return Occupation
     */
    Occupation selectByPrimaryKey(Long id);

    /**
     *
     * 
     * @return List<Occupation>
     */
    List<Occupation> selectAll();

    /**
     * 根据主键来更新符合条件的数据库记录
     *
     * @param record Occupation
     * 
     * @return int 影响行数
     */
    int updateByPrimaryKey(Occupation record);
}