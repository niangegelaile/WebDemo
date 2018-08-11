package cn.com.liquanan.gradleWebDemo.controller;

import java.util.List;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.com.liquanan.gradleWebDemo.common.HttpResult;
import cn.com.liquanan.gradleWebDemo.pojo.User;
import cn.com.liquanan.gradleWebDemo.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;

    @RequestMapping("/listUser")
    public String listUser(HttpServletRequest request) {
        List<User> list = userService.getAll();
        request.setAttribute("listUser", list);
        return "listUser";
    }

    @RequestMapping("/UIupdateUser")
    public String updateUserUI(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        User user = userService.getUserById(id);
        request.setAttribute("user", user);
        return "updateUser";
    }

    @RequestMapping("/updateUser")
    public String updateUser(User user) {
        userService.updateUserById(user);

        return "redirect:/user/listUser.do";
    }

    @RequestMapping("/addUser")
    public String addUser(User user) {
        userService.addUser(user);
        return "redirect:/user/listUser.do";
    }



    @RequestMapping(value = "/deleteUser")
    public String deleteUser(int id) {
        userService.deleteUserById(id);
        return "redirect:/page/index.do";
    }


    @RequestMapping("/login")
    @ResponseBody
    public HttpResult<Boolean> login(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/json;charset=UTF-8");
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        User user = userService.getUserByAccount(account);
        HttpResult<Boolean> result = new HttpResult<>();
        if (password.equals(user.getPassword())) {
            result.setResult(true);
        } else {
            result.setResult(false);
        }
        return result;
    }


}
