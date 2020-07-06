package cn.jdbc.controller;

import cn.jdbc.bean.Account;
import cn.jdbc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.jdbc.bean.Account;
import cn.jdbc.service.AccountService;
import cn.jdbc.bean.Account;
import cn.jdbc.service.AccountService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author:ZouJun
 * @version：1.0
 * @Date: 2020-07-01 21:42
 * @description: [一句话描述改类的功能]
 * @company:厦门市
 **/
@Controller
@RequestMapping("/aa")
public class controllerTest {

   @Autowired
   AccountService accountService;

    @RequestMapping("/zz")
    public String findAll(Model model){
        System.out.println("控制层请求");
      List<Account> list = accountService.findAll();
      model.addAttribute("list",list);
        return "list";
    }
    @RequestMapping("/save")
    public String seve(Account account) throws IOException {
        System.out.println("业务层:保存账户");
    accountService.saveAccount(account);
    return "redirect:/aa/zz";
    }
}
