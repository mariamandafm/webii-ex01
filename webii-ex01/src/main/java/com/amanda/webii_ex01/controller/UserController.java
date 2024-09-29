package com.amanda.webii_ex01.controller;

import com.amanda.webii_ex01.model.Usuario;
import com.amanda.webii_ex01.model.dto.UserDto;
import com.amanda.webii_ex01.service.UsuarioService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UsuarioService usuarioService;

//    @GetMapping("/signup")
//    public String sugnUpUsuario(Model model){
//        model.addAttribute("usuario", new Usuario());
//
//        return "signup-usuario";
//    }
//
//    @PostMapping("/salvar")
//    public String salvarUsuario(@ModelAttribute Usuario usuario){
//        usuarioService.save(usuario);
//        return "redirect:/";
//    }
//
//    @GetMapping("/registration")
//    public String showRegistrationForm(WebRequest request, Model model) {
//        UserDto userDto = new UserDto();
//        model.addAttribute("user", userDto);
//        return "registration";
//    }

//    @PostMapping("/user/registration")
//    public ModelAndView registerUserAccount(
//            @ModelAttribute("user") UserDto userDto,
//            HttpServletRequest request,
//            Errors errors) {
//
//        try {
//            User registered = userService.registerNewUserAccount(userDto);
//        } catch (UserAlreadyExistException uaeEx) {
//            mav.addObject("message", "An account for that username/email already exists.");
//            return mav;
//        }
//
//        return new ModelAndView("successRegister", "user", userDto);
//    }
}
