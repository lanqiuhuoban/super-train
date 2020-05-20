package com.hanlin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hanlin.pojo.Grade;

public interface GradeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer gid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbg.generated
     */
    int insert(Grade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbg.generated
     */
    int insertSelective(Grade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbg.generated
     */
    Grade selectByPrimaryKey(Integer gid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Grade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Grade record);
    @Select(" select * from grade ")
	List<Grade> getGradeList();
}