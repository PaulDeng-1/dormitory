package com.pauldeng.mapper;

import com.pauldeng.entity.Dormitory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;


public interface DormitoryMapper extends BaseMapper<Dormitory> {
    public void subAvailable(Integer id);
    public void addAvailable(Integer id);
    public Integer findAvailableDormitoryId();
}
