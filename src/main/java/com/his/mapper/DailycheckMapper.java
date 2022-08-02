package com.his.mapper;

import com.his.pojo.DailyCheck;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface DailycheckMapper {


    @Select("select * from daily_check where cashier=#{cashier} and date = STR_TO_DATE(#{date},'%Y-%m-%d')")
    List<DailyCheck> searchdailycheckList(String cashier, String  date);

    @Update("update daily_check set checkMark = 1, check_date = date_format(#{checkdate},'%Y-%m-%d %H:%i:%s') " +
            "where cashier=#{cashier} and date = STR_TO_DATE(#{date},'%Y-%m-%d')")
    int submitdailycheck(String cashier, String  date, String checkdate);

    @Update("update daily_check set checkMark = 0, check_date = null " +
            "where cashier=#{cashier} and date = STR_TO_DATE(#{date},'%Y-%m-%d')")
    int dismissdailycheck(String cashier, String  date);
}
