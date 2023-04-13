package com.pauldeng.service;

import com.pauldeng.entity.Moveout;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pauldeng.form.SearchForm;
import com.pauldeng.vo.PageVO;

/**
 * <p>
 *  服务类
 * </p>
 */
public interface MoveoutService extends IService<Moveout> {
    public PageVO list(Integer page, Integer size);
    public PageVO search(SearchForm searchForm);
    public Boolean moveout(Integer id,String reason);
    public PageVO moveoutList(Integer page, Integer size);
    public PageVO moveoutSearch(SearchForm searchForm);
}
