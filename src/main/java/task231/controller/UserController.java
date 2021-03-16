package task231.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import task231.Service.UserService;
import task231.Service.UserServiceImpl;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;
    @GetMapping("/hello")
    public String print(Model model){

        model.addAttribute("users",service.getUsers());
        return "index";
    }


}
