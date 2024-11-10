package vn.hoidanit.laptopshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vn.hoidanit.laptopshop.domain.User;

// import vn.hoidanit.laptopshop.service.UserService;

// @Controller // @ là Annotation
@Controller
public class UserController {

    @RequestMapping("/admin/user") // GET nếu khôn định nghĩa method thì sẽ mặc định là GET(lấy thông tin )
    public String getUserPage(Model model) {
        model.addAttribute("newUser", new User());
        return "/admin/user/create";
    }

    @RequestMapping(value = "/admin/user/create1", method = RequestMethod.POST) // url và Post
    public String createUserPage(Model model, @ModelAttribute("newUser") User hoidanit) { // lấy giá data bằng
                                                                                          // modelAttribute
        System.out.println("run here" + hoidanit); // nếu chuyển trang thành công thì sẽ báo run here
        return "hello"; // sang trang hello.jsp
    }

}