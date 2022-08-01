
package com.his.mapper;

        import com.his.pojo.Register;
        import org.apache.ibatis.annotations.*;

        import java.util.List;

@Mapper
public interface RegisterMapper {
    /**
     *
     * @param cn
     * @param rn
     * @return
     */
    @Select("select * from register where case_number=#{cn} or real_name like concat('%',#{rn},'%')")
    List<Register> selectRegister(String cn,String rn);




    /**
     * 退号，即isbook设置为0
     * @param id ID
     * @return true-成功，false-失败
     */
    @Update("update register set isbook = 0 where dept_code = #{code}")
     boolean deleteRegisterById(int id);

    /**
     * 添加
     * @param register 新挂号信息
     * @return true-成功，false-失败
     */
    @Insert("insert into register(id, case_number, real_name, gender, card_number, birthdate, age, age_type, home_address, visit_date, noon, deptment_id, " +
            "employee_id, regist_level_id, settle_category_id, is_book, regist_method, regist_money, visit_state) "
            +"values(#{register.id},#{register.casenumber},#{register.realName},#{register.gender},#{register.cardNumber},#{register.birthdate},#{register.age},#{register.ageType},#{register.homeAddress}," +
            "#{register.visitDate}，#{register.noon},#{register.detmentId},#{register.employeeId},#{register.registLevelId},#{register.settleCategoryId},#{register.isBook}," +
            "#{register.registMethod}，#{register.registMoney}，#{register.visitState}")
    int insertRegister(Register register);




}
