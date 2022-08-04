
package com.his.mapper;


import com.his.pojo.Register;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface RegisterMapper {
    /**
     * 查询病历号
     */
    @Select("select real_name,case_number from register")
    List<Register> showCaseNumber();
    /**
     *
     * @param cn
     * @param rn
     * @return
     */
    @Select("select * from register where case_number=#{cn} or real_name like concat('%',#{rn},'%')")
    List<Register> selectRegister(String cn,String rn);


    /**
     * 删除
     * @return true-成功，false-失败
     */
    @Delete("delete from register where case_number = #{caseNumber}")
    boolean deleteRegister(int caseNumber);

    /**
     * 添加
     * @param register 新挂号信息
     * @return true-成功，false-失败
     */
    @Insert("insert into register(id, case_number, real_name, gender, card_number, birthdate, age, age_type, home_address, visit_date, noon, deptment_id, " +
            "employee_id, regist_level_id, settle_category_id, is_book, register_method, register_money, visit_state) "
            +"values(#{register.id},#{register.caseNumber},#{register.realName},#{register.gender},#{register.cardNumber},#{register.birthdate},#{register.age},#{register.ageType},#{register.homeAddress}," +
            "#{register.visitDate}，#{register.noon},#{register.deptmentId},#{register.employeeId},#{register.registerLevelId},#{register.settleCategoryId},#{register.isBook}," +
            "#{register.registerMethod}，#{register.registerMoney}，#{register.visitState}")
    boolean addRegister(Register register);


    @Update("update register set visit_state=#{vs} where id=#{id}")
    int updateVisitState(int vs,int id);

}
