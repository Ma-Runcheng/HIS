package com.his.service.impl;

import com.his.mapper.DrugInfoMapper;
import com.his.pojo.DrugInfo;
import com.his.service.DrugInfoService;
import org.apache.ibatis.annotations.One;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.sourceforge.pinyin4j.PinyinHelper;

import java.util.List;

@Service
public class DrugInfoServiceImpl implements DrugInfoService {

    @Autowired
    DrugInfoMapper drugInfoMapper;

    @Override
    public List<DrugInfo> getDrugInfoList(String code, String name,String m_code) {
        return drugInfoMapper.getDrugInfoList(code,name,m_code);
    }


    @Override
    public void updateById(int id, DrugInfo d) {
        drugInfoMapper.updateById(id, d);
    }

    @Override
    public int deleteById(int id){
        System.out.println(id);
        return drugInfoMapper.deleteById(id);
    }

    @Override
    public int insertDrugInfo(DrugInfo d){
        System.out.println(d);
        return drugInfoMapper.insertDrugInfo(d);
    }


    public String toFirstChar(String str){
        String context = "";
        for (int j = 0; j <  str.length(); j++) {
            char word = str.charAt(j);
            String[] pinyinArray = PinyinHelper.toHanyuPinyinStringArray(word);
            if (pinyinArray != null) {
                context += pinyinArray[0].charAt(0);
            } else {
                context += word;
            }
        }
        return context;
    }

    public List<DrugInfo> searchDrug(String drugname, String mnemoniccode){return drugInfoMapper.searchDrug(drugname,mnemoniccode);}

}
