package com.pauldeng.controller;

import com.pauldeng.form.SearchForm;
import com.pauldeng.service.MoveoutService;
import com.pauldeng.util.ResultVOUtil;
import com.pauldeng.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>

 */
@RestController
@RequestMapping("/moveout")
public class MoveoutController {

    @Autowired
    private MoveoutService moveoutService;

    @GetMapping("/list/{page}/{size}")
    public ResultVO list(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        return ResultVOUtil.success(this.moveoutService.list(page, size));
    }

    @GetMapping("/search")
    public ResultVO search(SearchForm searchForm){
        return ResultVOUtil.success(this.moveoutService.search(searchForm));
    }

    @PutMapping("/moveout/{id}/{reason}")
    public ResultVO moveout(@PathVariable("id") Integer id,@PathVariable("reason") String reason){
        Boolean moveout = this.moveoutService.moveout(id, reason);
        if(!moveout) return ResultVOUtil.fail();
        return ResultVOUtil.success(null);
    }

    @GetMapping("/moveoutList/{page}/{size}")
    public ResultVO moveoutList(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        return ResultVOUtil.success(this.moveoutService.moveoutList(page, size));
    }

    @GetMapping("/moveoutSearch")
    public ResultVO moveoutSearch(SearchForm searchForm){
        return ResultVOUtil.success(this.moveoutService.moveoutSearch(searchForm));
    }
}

