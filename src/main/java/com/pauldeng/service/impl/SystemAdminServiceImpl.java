package com.pauldeng.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.pauldeng.entity.SystemAdmin;
import com.pauldeng.form.RuleForm;
import com.pauldeng.mapper.SystemAdminMapper;
import com.pauldeng.service.SystemAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pauldeng.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 */
@Service
public class SystemAdminServiceImpl extends ServiceImpl<SystemAdminMapper, SystemAdmin> implements SystemAdminService {

    @Autowired
    private SystemAdminMapper systemAdminMapper;

    @Override
    public ResultVO login(RuleForm ruleForm) {
        //1、判断用户名是否存在
        QueryWrapper<SystemAdmin> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", ruleForm.getUsername());
        SystemAdmin systemAdmin = this.systemAdminMapper.selectOne(queryWrapper);
        ResultVO resultVO = new ResultVO();
        if(systemAdmin == null){
            resultVO.setCode(-1);
        } else {
            //2、判断密码是否正确
            if(!systemAdmin.getPassword().equals(ruleForm.getPassword())){
                resultVO.setCode(-2);
            } else {
                resultVO.setCode(0);
                resultVO.setData(systemAdmin);
            }
        }
        return resultVO;
    }
}
