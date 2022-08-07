
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
    @Select("select * from register where case_number=#{cn} or real_name like concat('%',#{rn},'%') and visit_state=#{visitState}")
    List<Register> selectRegister(String cn,String rn,int visitState);


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
    @Insert("insert into register(real_name,gender,age,birthdate,card_number,home_address,deptment_id,employee_id,visit_date,noon,is_book,regist_method)values(#{realName},#{gender},#{age},#{birthdate},#{cardNumber},#{homeAddress},#{deptmentId},#{employeeId},#{visitDate},#{noon},#{isBook},#{registMethod})")
    
    boolean addRegister(Register register);


    @Update("update register set visit_state=#{vs} where id=#{id}")
    int updateVisitState(int vs,int id);

}
