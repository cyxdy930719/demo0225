package com.neuedu.dao;

import com.neuedu.pojo.PayInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface PayInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_pay_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_pay_info
     *
     * @mbggenerated
     */
    int insert(PayInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_pay_info
     *
     * @mbggenerated
     */
    PayInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_pay_info
     *
     * @mbggenerated
     */
    List<PayInfo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_pay_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PayInfo record);
}