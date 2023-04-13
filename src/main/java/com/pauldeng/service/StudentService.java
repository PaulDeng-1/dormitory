package com.pauldeng.service;

import com.pauldeng.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pauldeng.form.SearchForm;
import com.pauldeng.form.StudentForm;
import com.pauldeng.vo.PageVO;

/**
 * <p>
 *  服务类
 * </p>
 */
public interface StudentService extends IService<Student> {
    public Boolean saveStudent(Student student);
    public PageVO list(Integer page, Integer size);
    public PageVO search(SearchForm searchForm);
    public Boolean update(StudentForm studentForm);
    public Boolean deleteById(Integer id);
}
