package cn.com.liquanan.gradleWebDemo.controller;

import cn.com.liquanan.gradleWebDemo.pojo.User;
import cn.com.liquanan.gradleWebDemo.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/page")
public class PageRouterController {
    @Resource
    private IUserService userService;
    @RequestMapping("/index")
    public String toIndexPage(HttpServletRequest request){
        List<User> list = userService.getAll();
        request.setAttribute("listUser", list);
        return "listUser" ;
    }

    @RequestMapping("/addUser")
    public String toAddPage(){
        return "addUser" ;
    }

    @RequestMapping("/updateUser")
    public String toupdatePage(HttpServletRequest request,int id){
        User user = userService.getUserById(id);
        request.setAttribute("user", user);
        return "updateUser" ;
    }




}
