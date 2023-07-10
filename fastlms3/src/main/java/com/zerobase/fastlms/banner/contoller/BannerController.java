package com.zerobase.fastlms.banner.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BannerController {

    @GetMapping("/admin/banner/list.do")
    public String list() {
        return "admin/banner/list";
    }


    @GetMapping(value = {"/admin/banner/add.do", "/admin/banner/edit.do"})
    public String add() {
        return "admin/banner/add";
    }

//    @PostMapping(value = {"/admin/banner/add.do", "/admin/banner/edit.do"})
//    public String addSubmit()


}
