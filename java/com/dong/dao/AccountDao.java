package com.dong.dao;

import com.dong.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao {


        /**
         * 查询所有账户
         * @return
         */
        @Select("select * from account")
        public List<Account> findAll();

        /**
         * 添加账户
         * @param account
         */
        @Insert("insert into account (name,money) values (#{name},#{money})")
        public void add(Account account);

}
