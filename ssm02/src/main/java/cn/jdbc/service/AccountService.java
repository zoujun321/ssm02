
package cn.jdbc.service;

import cn.jdbc.bean.Account;
import cn.jdbc.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author:ZouJun
 * @version：1.0
 * @Date: 2020-07-01 22:45
 * @description: [一句话描述改类的功能]
 * @company:厦门市
 **/

@Service("accountService")
public class AccountService {
    @Autowired
    AccountDao accountDao;

    public List<Account> findAll(){
        return accountDao.findAll();
    }

    public void saveAccount(Account account) {
         accountDao.saveAccount(account);
    }
}

