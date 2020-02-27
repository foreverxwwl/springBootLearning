package com.spring.controller;

import com.spring.domain.Account;
import com.spring.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @outhor li
 * @create 2020-02-27 9:29
 */
@Controller
public class MybatisController {
    @Autowired
    private AccountMapper accountMapper;

    @RequestMapping("/user")
    @ResponseBody
    public List<Account> queryUserList(){
        List<Account> accounts = accountMapper.queryUserList();
        return accounts;
    }
}
