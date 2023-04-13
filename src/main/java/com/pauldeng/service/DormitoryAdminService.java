package com.pauldeng.service;

import com.pauldeng.entity.DormitoryAdmin;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pauldeng.form.RuleForm;
import com.pauldeng.form.SearchForm;
import com.pauldeng.vo.PageVO;
import com.pauldeng.vo.ResultVO;

/**
 * <p>
 *  服务类
 * </p>
 */
public interface DormitoryAdminService extends IService<DormitoryAdmin> {
    public ResultVO login(RuleForm ruleForm);
    public PageVO list(Integer page,Integer size);
    public PageVO search(SearchForm searchForm);
}
