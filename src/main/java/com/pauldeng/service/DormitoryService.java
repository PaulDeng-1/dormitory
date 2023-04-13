package com.pauldeng.service;

import com.pauldeng.entity.Dormitory;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pauldeng.form.SearchForm;
import com.pauldeng.vo.PageVO;

/**
 * <p>
 *  服务类
 * </p>
 */
public interface DormitoryService extends IService<Dormitory> {
    public PageVO list(Integer page, Integer size);
    public PageVO search(SearchForm searchForm);
    public Boolean deleteById(Integer id);
}
