package com.itlike.Annotation;


import org.springframework.stereotype.Service;

@Service
public class GoodsDaoImpl implements GoodsDao {
    @Override
    public void save() {
        System.out.println("保存操作");
    }

    @Override
    public String update() {
        System.out.println("更新操作");
        return "success";
    }

    @Override
    public void delete() {
        System.out.println("删除操作");
    }

    @Override
    public void find() {
        System.out.println("find");
        int i = 1 / 0;
    }
}
