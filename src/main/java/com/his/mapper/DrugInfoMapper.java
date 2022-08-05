package com.his.mapper;



import com.his.pojo.DrugInfo;
import com.his.pojo.Prescription;
import com.his.pojo.Register;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface DrugInfoMapper {


    @Select("<script>select * from drug_info where 1=1 " +
            "<if test=\"code!=null and code!=''\">and drug_code like concat('%',#{code},'%')</if>" +
            "<if test=\"name!=null and name!=''\">and drug_name like concat('%',#{name},'%')</if>" +
            "<if test=\"m_code!=null and m_code!=''\">and mnemonicCode like concat('%',#{m_code},'%')</if>" +
            "</script>")
    List<DrugInfo> getDrugInfoList(String code,String name,String m_code);

    @Insert("insert into drug_info(id,drug_code,drug_name,drug_format,manufacturer,drug_price,MnemonicCode,DelMark)"+" values(#{id},#{drugCode},#{drugName},#{drugFormat},#{manufacturer},#{drugPrice},#{mnemonicCode},#{delMark})")
    int insertDrugInfo(DrugInfo d);

    @Update("<script>update drug_info set drug_name = #{d.drugName},drug_format = #{d.drugFormat},manufacturer = #{d.manufacturer},drug_price = #{d.drugPrice},MnemonicCode = #{d.mnemonicCode} where id = #{id}" +
            "</script>")
    void updateById(int id,DrugInfo d);

    @Delete("delete from drug_info where id = #{id}")
    int deleteById(int id);

    @Select("select * from drug_info where id=#{id}")
    List<DrugInfo> selectById(int id);

    @Select("select * from register where id in ("+
            "select register_id from prescription where drug_state = 1)")
    List<Register> giveList();

    @Select("select * from register where id in ("+
            "select register_id from prescription where drug_state = 0)")
    List<Register> refundList();

    @Update("<script>update prescription set drug_state = #{state} where id = #{id}" +
            "</script>")
    void stateChange(int id,String state);

    @Select("<script>select * from prescription where 1=1"+
            "<if test=\"id!=null and id!=''\">and register_id=#{id}</if>"+
            "</script>"
            )
    List<Prescription> checkPrescription(int id);

    @Select("select * from drug_info where drug_name like concat('%',#{drugname},'%') and MnemonicCode like concat('%',#{mnemoniccode},'%')")
    List<DrugInfo> searchDrug(String drugname,String mnemoniccode);
}
