package com;

import com.Mapper.AdminMapper;
import com.pojo.Admin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MpApplicationTests {

    @Autowired
    private AdminMapper adminMapper;

    @Test
    void contextLoads() {

        List<Admin> adminList = adminMapper.selectList(null);
        System.out.println(adminList);
    }

}
