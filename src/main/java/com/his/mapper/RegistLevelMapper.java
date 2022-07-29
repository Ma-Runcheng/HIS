package com.his.mapper;

import com.his.pojo.Department;
import com.his.pojo.RegistLevel;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface RegistLevelMapper {

    /**
     * 查询存在的所有挂号级别
     * @return 所有挂号级别json数组
     */
    @Select("select * from regist_level where delmark = 1")
    List<RegistLevel> selectAllRegistLevel();

    @Select("select * from regist_level where delmark = 1 and id = #{id}")
    RegistLevel selectRegistLevelById(int id);

    /**
     * 通过id删除
     * @param id
     * @return true-成功，false-失败
     */
    @Update("update regist_level set delmark = 0 where id = #{id}")
    boolean deleteRegistLevelById(String id);

    /**
     * 更新
     * @param newRegistLevel
     * @return true-成功，false-失败
     */
    @Update("update regist_level set regist_code = #{registCode} ," +
            "regist_name=#{registName}," +
            "regist_fee=#{registFee}," +
            "regist_quota=#{registQuota} where id = #{id}")
    boolean updateRegistLevel(RegistLevel newRegistLevel);

    /**
     * 插入数据，新元组中顺序号默认为0
     * @param registLevel
     * @return true-成功，false-失败
     */
    @Insert("insert into regist_level (regist_code,regist_name,regist_fee,regist_quota,sequence_no) " +
            "values (#{registCode},#{registName},#{registFee},#{registQuota},0)")
    boolean insertRegistLevel(RegistLevel registLevel);
}
