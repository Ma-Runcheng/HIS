package com.his.mapper;


import com.his.pojo.DrugInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DrugInfoMapper {

    @Select("<script>select * from drug_info where 1=1 " +
            "<if test=\"code!=null and code!=''\">and drug_code like concat('%',#{code},'%')</if>" +
            "<if test=\"name!=null and name!=''\">and drug_name like concat('%',#{name},'%')</if>" +
            "<if test=\"name!=null and name!=''\">and drug_name like concat('%',#{name},'%')</if>" +
            "</script>")
    List<DrugInfo> getDrugInfoList(String code,String name);

    @Insert("insert into drug_info(id,drug_code,drug_name,drug_format,manufacturer,drug_price,MnemonicCode,DelMark)"+" values(#{id},#{drugCode},#{drugName},#{drugFormat},#{manufacturer},#{drugPrice},#{mnemonicCode},#{delMark})")
    int insertDrugInfo(DrugInfo d);

    @Update("<script>update drug_info set drug_name = #{d.drugName},drug_format = #{d.drugFormat},manufacturer = #{d.manufacturer},drug_price = #{d.drugPrice},MnemonicCode = #{d.mnemonicCode} where id = #{id}" +
            "</script>")
    void updateById(int id,DrugInfo d);

    @Delete("delete from drug_info where id = #{id}")
    int deleteById(int id);
}