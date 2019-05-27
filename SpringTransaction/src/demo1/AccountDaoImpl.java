package demo1;


import jdk.nashorn.internal.scripts.JD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements AccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;



    @Override
    public void addMoney(String name, Double money) {

        jdbcTemplate.update("update account set money = money+? where name=?",money,name);
    }


    @Override
    public void minMoney(String name, Double money) {
        jdbcTemplate.update("update account set money = money-? where name=?",money,name);
    }
}
