package com.his.mapper;

import com.his.pojo.Workload;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface DoctorWorkloadMapper {
    @Select("select doctor_name, sum(patient) as patient, sum(invoice) as invoice, " +
            "sum(western_medicine) as western_medicine, sum(Chinese_patent_medicine) " +
            "as Chinese_patent_medicine,sum(Chinese_herbal_medicine) as Chinese_herbal_medicine, " +
            "sum(registration) as registration, sum(inspection) as inspection, sum(examination) as " +
            "examination, sum(treatment) as treatment from workload group by doctor_name")
    List<Workload> selectdcoworkload();//表

    @Select("select * from workload")
    List<Workload> selectallworkload();//图

    @Select("<script>select doctor_name,sum(patient) as patient, sum(invoice) as invoice, " +
            "sum(western_medicine) as western_medicine, sum(Chinese_patent_medicine) " +
            "as Chinese_patent_medicine,sum(Chinese_herbal_medicine) as Chinese_herbal_medicine," +
            " sum(registration) as registration, sum(inspection) as inspection, sum(examination) as" +
            " examination, sum(treatment) as treatment from workload where 1 = 1 " +
            "<if test=\"name!=null and name!=''\">and doctor_name=#{name}</if>" +
            "<if test=\"date1!=''\">and date &gt;= STR_TO_DATE(#{date1},'%Y-%m-%d')</if>" + //>转义字符&gt; 否则：元素内容必须由格式正确的字符数据或标记组成。
            "<if test=\"date2!=''\">and date &lt; STR_TO_DATE(#{date2},'%Y-%m-%d')</if>" +     //<转义字符&lt;
            "group by doctor_name"+
            "</script>")
    List<Workload> searchworkloadList(String name, String  date1, String date2);//表

    @Select("<script>select * from workload where 1 = 1 " +
            "<if test=\"name!=null and name!=''\">and doctor_name=#{name}</if>" +
            "<if test=\"date1!=''\">and date &gt;= STR_TO_DATE(#{date1},'%Y-%m-%d')</if>" + //>转义字符&gt; 否则：元素内容必须由格式正确的字符数据或标记组成。
            "<if test=\"date2!=''\">and date &lt; STR_TO_DATE(#{date2},'%Y-%m-%d')</if>" +     //<转义字符&lt;
            "</script>")
    List<Workload> searchworkloadList1(String name, String  date1, String date2);//图
}
