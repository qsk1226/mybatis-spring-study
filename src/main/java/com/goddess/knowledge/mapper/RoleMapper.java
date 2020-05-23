package com.goddess.knowledge.mapper;

import com.goddess.knowledge.entity.Role;
import com.goddess.knowledge.entity.example.RoleCondition;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * 
 * @author qinshengke
 * 2020-05-23
 */
public interface RoleMapper {
    /**
     * 根据指定的条件获取数据库记录数
     *
     * @param condition RoleCondition
     * 
     * @return long 记录数
     */
    long countByExample(RoleCondition condition);

    /**
     * 根据指定的条件删除数据库符合条件的记录
     *
     * @param condition RoleCondition
     * 
     * @return int 影响行数
     */
    int deleteByExample(RoleCondition condition);

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
     * @param record Role
     * 
     * @return int 影响行数
     */
    int insert(Role record);

    /**
     * 动态字段,写入数据库记录
     *
     * @param record Role
     * 
     * @return int 影响行数
     */
    int insertSelective(Role record);

    /**
     * 根据指定的条件查询符合条件的数据库记录
     *
     * @param condition RoleCondition
     * 
     * @return List<Role>
     */
    List<Role> selectByExample(RoleCondition condition);

    /**
     * 根据指定主键获取一条数据库记录
     *
     * @param id Long
     * 
     * @return Role
     */
    Role selectByPrimaryKey(Long id);

    /**
     * 动态根据指定的条件来更新符合条件的数据库记录
     *
     * @param record Role
     * @param condition RoleCondition
     * 
     * @return int 影响行数
     */
    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleCondition condition);

    /**
     * 根据指定的条件来更新符合条件的数据库记录
     *
     * @param record Role
     * @param condition RoleCondition
     * 
     * @return int 影响行数
     */
    int updateByExample(@Param("record") Role record, @Param("example") RoleCondition condition);

    /**
     * 动态字段,根据主键来更新符合条件的数据库记录
     *
     * @param record Role
     * 
     * @return int 影响行数
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     * 根据主键来更新符合条件的数据库记录
     *
     * @param record Role
     * 
     * @return int 影响行数
     */
    int updateByPrimaryKey(Role record);
}