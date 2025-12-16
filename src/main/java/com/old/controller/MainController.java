package com.old.controller;

import com.old.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/main")
public class MainController {

    private final UserService userService;

    @GetMapping("/")
    public String mainPage(Model model) {
        List<Map<String, String>> seasonMenus = new ArrayList<>();
        seasonMenus.add(Map.of("name", "STRAWBERRY CAKE", "img", "/images/menu/strawberry-basket.png"));
        seasonMenus.add(Map.of("name", "STRAWBERRY PARFAIT", "img", "/images/menu/strawberry-parfait.png"));
        model.addAttribute("seasonMenus", seasonMenus);

        model.addAttribute("isLoggedIn", false);

        return "user/main";
    }


}
