package task231.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import task231.UsersService.UserService;
import task231.model.User;

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

    @RequestMapping("/user-update/{id}")
    public ModelAndView showEditProductPage(@PathVariable(name = "id") Long id) {
        ModelAndView mav = new ModelAndView("user-update");
        User user = service.findById(id);
        mav.addObject("user", user);

        return mav;
    }

    @RequestMapping(value = "/user-update", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("user") User user) {
        service.update(user);

        return "redirect:/users";
    }
}
