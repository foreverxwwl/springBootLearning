package com.spring.mapper;

import com.spring.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @outhor li
 * @create 2020-02-27 9:28
 */
@Mapper
@Repository("AccountMapper")
public interface AccountMapper {
    public List<Account> queryUserList();
}
