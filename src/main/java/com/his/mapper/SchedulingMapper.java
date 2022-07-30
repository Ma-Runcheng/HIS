package com.his.mapper;

import com.his.pojo.Scheduling;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface SchedulingMapper {

    @Select("select * from scheduling where delmark = 1 and rule_name like concat('%',#{name},'%')")
    List<Scheduling> selectAllScheduling(String name);

    @Select("select * from scheduling where rule_name = #{name} and delmark = 1")
    Scheduling selectSchedulingByName(String name);

    @Select("select * from scheduling where delmark = 1 and id = #{id}")
    Scheduling selectSchedulingById(int id);

    @Insert("insert into scheduling(rule_name,week_rule) values (#{ruleName},#{weekRule})")
    boolean insertScheduling(Scheduling scheduling);

    @Update("update scheduling set rule_name=#{ruleName},week_rule=#{weekRule} where id=#{id}")
    boolean updateScheduling(Scheduling scheduling);
}
