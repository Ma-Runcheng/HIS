package com.his.mapper;


import com.his.pojo.ExpenseInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ExpenseMapper {
    @Select("select * from expense_info where delmark = 1")
    List<ExpenseInfo> selectAllExpenses();

    @Select("<script>select * from expense_info where DelMark = 1 " +
            "<if test=\"code!=null and code!=''\">and expense_code=#{code}</if>" +
            "<if test=\"name!=null and name!=''\">and expense_name=#{name}</if>" +
            "<if test=\"type!=null and type!=''\">and expense_name like concat('%',#{type},'%')</if>"+
            "</script>")
    List<ExpenseInfo> searchExpenseList(String code, String name, String type);

    /*@Update("<script>update expense_info set DelMark=0 where id in"   +
            "<foreach collection =\"array\" item=\"code\" open=\"(\" close=\")\" separator=\",\">"+
            "#{id}</foreach>"+
            "</script>")
    int deleteExpense(int []arr);*/         //批量删除前端不会写
    @Update("update expense_info set DelMark=0 where id =#{id}")    //一个一个删
    int deleteExpense(int id);


    @Update("update expense_info set expense_code=#{code}, expense_name=#{name}, expense_price=#{price}, expense_description=#{description} where id=#{id}")
    int updateExpense(int id, String code, String name, float price, String description);

    @Insert("insert into expense_info(expense_code, expense_name,  expense_price, expense_description) values(#{code}, #{name}, #{price}, #{description})")
    int insertExpense(String code, String name, float price, String description);
}
