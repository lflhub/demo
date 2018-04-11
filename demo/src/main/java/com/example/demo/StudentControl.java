package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentControl {
    @GetMapping("/getStudentName")
    public String getStudengtName(){
        return "张三";
    }

    @GetMapping("/insertStudent")
    public String insertStudent(){
        System.out.println("已经插入一个学生的信息");
        return "OK";
    }

    @GetMapping("/updateStudent")
    public String updateStudent(){
        System.out.println("已经更新了张三同学信息");
        return "OK";
    }
}
