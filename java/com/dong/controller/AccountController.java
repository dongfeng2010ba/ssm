package com.dong.controller;

import com.dong.domain.Account;
import com.dong.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView mv = new ModelAndView();

        List<Account> all = accountService.findAll();
        for (Account account : all) {
            System.out.println(account);
        }
        mv.addObject("list",all);
        mv.setViewName("list");
        return mv;
    }


    @RequestMapping("/save")
    public void add(Account account, HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        accountService.add(account);
        request.getRequestDispatcher("/account/findAll").forward(request,response);
    }
}
