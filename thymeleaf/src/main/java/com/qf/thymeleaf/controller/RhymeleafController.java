package com.qf.thymeleaf.controller;

import com.qf.thymeleaf.pojo.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: WangXi
 * @Date: 2019/6/4
 */
@Controller
@RequestMapping("my")
public class RhymeleafController {

    @RequestMapping("test")
    public String test(Model model){
        model.addAttribute("msg","hello,钊哥");
        Teacher teacher=new Teacher(1,"zs",20);
        List<Teacher> list=new ArrayList();
        list.add(teacher);
        list.add(new Teacher(2,"王喜",19));
        model.addAttribute("list",list);
        model.addAttribute("teacher",teacher);
        return "ok";
    }

}
