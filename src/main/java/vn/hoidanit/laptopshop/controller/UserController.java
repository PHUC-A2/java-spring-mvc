package vn.hoidanit.laptopshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.hoidanit.laptopshop.service.UserService;

// import vn.hoidanit.laptopshop.service.UserService;

// @Controller // @ là Annotation
@Controller
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String getHomePage(Model model) {
        String test = this.userService.handleHello();
        model.addAttribute("eric", test); // eric là tên biến dngf trong hello.jsp
        model.addAttribute("hoidanit", "from controller with model"); // eric là tên biến dngf trong hello.jsp

        return "hello";// trả về file eric.html
    }
}

// @RestController
// public class UserController {

// // Khai báo Userservice
// final private UserService userService;

// public UserController(UserService userService) {
// this.userService = userService;
// }

// @GetMapping("")
// public String getHomePage() {
// return this.userService.handleHello();
// }
// }
