package vn.hoidanit.laptopshop.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vn.hoidanit.laptopshop.domain.User;
import vn.hoidanit.laptopshop.service.UserService;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String getHomePage(Model model) {

        List<User> arrUser = this.userService.getAllUsers();
        System.out.println(arrUser);

        model.addAttribute("eric", "test");
        model.addAttribute("hoidanit", "from controller with model");
        return "hello";
    }

    @RequestMapping("/getuserByEmail")
    public String getAllUserByEmail() {
        List<User> arrUser = this.userService.getAllUsersByEmail("1add@gmail.com");
        System.out.println(arrUser);
        return "hello";
    }

    // @RequestMapping("/getuserByEmaill")
    // public String getAllUserByEmaill() {
    // User arrUser = this.userService.getAllUsersByEmaill("1add@gmail.com");
    // System.out.println(arrUser);
    // return "hello";
    // }

    @RequestMapping("/admin/user")
    public String getUserPage(Model model) {
        model.addAttribute("newUser", new User());
        return "/admin/user/create"; // trả về file create.jsp
    }

    @RequestMapping(value = "/admin/user/create1", method = RequestMethod.POST)
    public String createUserPage(@ModelAttribute("newUser") User hoidanit) {
        System.out.println("run here" + hoidanit);
        this.userService.handleSaveUser(hoidanit);
        return "hello"; // nếu thêm thành công thì chuyển sang trang hello
    }

}