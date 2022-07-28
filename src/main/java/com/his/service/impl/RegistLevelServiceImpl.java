package com.his.service.impl;

import com.his.mapper.RegistLevelMapper;
import com.his.pojo.RegistLevel;
import com.his.service.RegistLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistLevelServiceImpl implements RegistLevelService {

    @Autowired
    RegistLevelMapper registLevelMapper;

    /**
     * 查找所有删除标志为1的挂号级别
     * @return 所有挂号级别
     */
    @Override
    public List<RegistLevel> getRegistLevelList() {
        return registLevelMapper.selectAllRegistLevel();
    }

    /**
     * 删除，delmark置1
     * @param id
     * @return true-成功，false-失败
     */
    @Override
    public boolean deleteRegistLevelById(String id) {
        return registLevelMapper.deleteRegistLevelById(id);
    }

    /**
     * 更新
     * @param newRegistLevel
     * @return true-成功，false-失败
     */
    @Override
    public boolean updateRegistLevel(RegistLevel newRegistLevel) {
        return registLevelMapper.updateRegistLevel(newRegistLevel);
    }

    /**
     * 添加新挂号级别，不可设置顺序号（默认为0）
     * @param newRegistLevel
     * @return true-成功，false-失败
     */
    @Override
    public boolean addRegistLevel(RegistLevel newRegistLevel) {
        return registLevelMapper.insertRegistLevel(newRegistLevel);
    }
}
