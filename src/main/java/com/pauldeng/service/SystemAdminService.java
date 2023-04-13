package com.pauldeng.service;

import com.pauldeng.entity.SystemAdmin;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pauldeng.form.RuleForm;
import com.pauldeng.vo.ResultVO;

/**
 * <p>
 *  服务类
 * </p>
 */
public interface SystemAdminService extends IService<SystemAdmin> {
    public ResultVO login(RuleForm ruleForm);
}
