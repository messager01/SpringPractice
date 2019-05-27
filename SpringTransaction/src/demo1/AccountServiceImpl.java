package demo1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(isolation = Isolation.DEFAULT)
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;
    @Override
    public void transferMoney(String from, String to, Double money) {

      accountDao.minMoney(from,money);
      int i = 1 /0;
      accountDao.addMoney(to,money);

    }
}
