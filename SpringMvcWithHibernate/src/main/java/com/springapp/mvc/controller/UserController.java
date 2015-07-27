package com.springapp.mvc.controller;

import com.springapp.mvc.model.User;
import com.springapp.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Tunç on 26.7.2015.
 */
@Controller
@Transactional
@RequestMapping("/user")
public class UserController {
    UserService userService;

    @Autowired(required=true)
    @Qualifier(value="userService")
    public void setPersonService(UserService userService){
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String user(Model model){
        //to add user
        model.addAttribute("personForm",new User());
        model.addAttribute("user", new User());
        //to get all user data
        model.addAttribute("listUser",userService.getAllUser());

        //to edit user
        model.addAttribute("userEdit",new User());
        return "hello";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String addUser(@ModelAttribute("personForm")User user){
        userService.addUser(user);
        return "redirect:user";
    }
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public @ResponseBody String deleteUser(@RequestParam int id){
        userService.deleteUser(id);
        return "true";
    }
    @RequestMapping(value = "/edit")
    public String updateUser(@ModelAttribute("userEdit")User user){

        userService.updateUser(user);
        return "redirect:/user";
    }
}
