package task231.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import task231.UsersDao.DaoImpl;
import task231.UsersService.UserService;
import task231.config.JpaConfig;
import task231.model.User;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService service;


    @GetMapping("/users")
    public String print(Model model){

        model.addAttribute("users",service.getUsers());
        return "index";
    }

    @GetMapping("/user-create")
    public String createUserForm(User user){
        return "user-create";
    }

    @PostMapping("/user-create")
    public String createUser(User user){
        service.add(user);
        return "redirect:/users";
    }

    @GetMapping("user-delete/{id}")
    public String deleteUser(@PathVariable("id") Long id){
        service.remove(id);
        return "redirect:/users";
    }

    @GetMapping("/user-update/{id}")
    public ModelAndView updateUserForm(@PathVariable("id") Long id){
        User user = service.findById(id);
        ModelAndView model = new ModelAndView("user-update");
        model.addObject("user",user);
        return model;
    }

    @PostMapping("/user-update")
    public String updateUser(@ModelAttribute(value="user")User user){
        service.update(user);
        return "redirect:/users";
    }
}
