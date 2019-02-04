package com.wangzhen.spbspringdatajpa.controller;

import com.wangzhen.spbspringdatajpa.bean.Student;
import com.wangzhen.spbspringdatajpa.service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName StudentController
 * @Description
 * @Author momo
 * @Date 2019/2/4 下午1:36
 **/
@RestController
@RequestMapping("/student")
public class StudentController {

    //注入studentservice
    @Resource
    private StudentService studentService;

    @RequestMapping("/save")
    public String save(){
        Student swk = new Student();
        swk.setAddress("广州");
        swk.setName("孙悟空");
        swk.setAge(700);
        swk.setSex('男');

        Student zzj = new Student();
        zzj.setAddress("广州");
        zzj.setName("蜘蛛精");
        zzj.setAge(700);
        zzj.setSex('女');

        Student nmw = new Student();
        nmw.setAddress("广州");
        nmw.setName("牛魔王");
        nmw.setAge(1000);
        nmw.setSex('男');

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(swk);
        studentList.add(zzj);
        studentList.add(nmw);

        studentService.saveAll(studentList);
        return "保存学生对象成功了！";
    }

    @RequestMapping("/name")
    public Student getByName(String name){
        return studentService.getByName(name);
    }

    @RequestMapping("/nameAndAddress")
    public List<Student> getByNameAndAddress(String name,String address){
        return studentService.getStusByNameAndAddr(name,address);
    }

    @RequestMapping("/nameLike")
    public List<Student> getByNameLike(String name){
        return studentService.getStusByNameLike(name);
    }


}
