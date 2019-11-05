package com.cd.rems;

import com.cd.rems.dao.TBuildingcarparkMapper;
import com.cd.rems.entity.TBuildingcarpark;
import com.cd.rems.service.imp.ICarparkService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class CdRemsServiceApplicationTests {
    @Resource
    ICarparkService service;

    @Test
    void contextLoads() {
        List<TBuildingcarpark> tBuildingcarparks = service.listAll();
        if (null != tBuildingcarparks) {
            for (TBuildingcarpark park : tBuildingcarparks) {
                System.out.println(park);
            }
        }
    }

}
