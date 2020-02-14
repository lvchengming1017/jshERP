package com.jsh.erp.datasource.mappers;

import com.jsh.erp.datasource.entities.AccountItem;
import com.jsh.erp.datasource.entities.AccountItemExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface AccountItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_accountitem
     *
     * @mbggenerated
     */
    int countByExample(AccountItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_accountitem
     *
     * @mbggenerated
     */
    int deleteByExample(AccountItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_accountitem
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_accountitem
     *
     * @mbggenerated
     */
    int insert(AccountItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_accountitem
     *
     * @mbggenerated
     */
    int insertSelective(AccountItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_accountitem
     *
     * @mbggenerated
     */
    List<AccountItem> selectByExample(AccountItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_accountitem
     *
     * @mbggenerated
     */
    AccountItem selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_accountitem
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") AccountItem record, @Param("example") AccountItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_accountitem
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") AccountItem record, @Param("example") AccountItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_accountitem
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AccountItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_accountitem
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AccountItem record);
}