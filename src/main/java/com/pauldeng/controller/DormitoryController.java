package com.pauldeng.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.pauldeng.entity.Dormitory;
import com.pauldeng.form.SearchForm;
import com.pauldeng.service.DormitoryService;
import com.pauldeng.util.ResultVOUtil;
import com.pauldeng.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>

 */
@RestController
@RequestMapping("/dormitory")
public class DormitoryController {

    @Autowired
    private DormitoryService dormitoryService;

    @GetMapping("/availableList")
    public ResultVO availableList(){
        QueryWrapper<Dormitory> queryWrapper = new QueryWrapper<>();
        queryWrapper.gt("available", 0);
        List<Dormitory> dormitoryList = this.dormitoryService.list(queryWrapper);
        return ResultVOUtil.success(dormitoryList);
    }

    @PostMapping("/save")
    public ResultVO save(@RequestBody Dormitory dormitory){
        dormitory.setAvailable(dormitory.getType());
        boolean save = this.dormitoryService.save(dormitory);
        if(!save) return ResultVOUtil.fail();
        return ResultVOUtil.success(null);
    }

    @GetMapping("/list/{page}/{size}")
    public ResultVO list(@PathVariable("page") Integer page,@PathVariable("size") Integer size){
        return ResultVOUtil.success(this.dormitoryService.list(page, size));
    }

    @GetMapping("/search")
    public ResultVO search(SearchForm searchForm){
        return ResultVOUtil.success(this.dormitoryService.search(searchForm));
    }

    @GetMapping("/findById/{id}")
    public ResultVO findById(@PathVariable("id") Integer id){
        return ResultVOUtil.success(this.dormitoryService.getById(id));
    }

    @PutMapping("/update")
    public ResultVO update(@RequestBody Dormitory dormitory){
        boolean update = this.dormitoryService.updateById(dormitory);
        if(!update) return ResultVOUtil.fail();
        return ResultVOUtil.success(null);
    }

    @DeleteMapping("/deleteById/{id}")
    public ResultVO deleteById(@PathVariable("id") Integer id){
        Boolean delete = this.dormitoryService.deleteById(id);
        if(!delete) return ResultVOUtil.fail();
        return ResultVOUtil.success(null);
    }
}
