package com.cd.rems.service.imp;

import com.cd.rems.dao.TBuildingcarparkMapper;
import com.cd.rems.entity.TBuildingcarpark;
import com.cd.rems.service.CarparkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ICarparkService implements CarparkService {
    @Autowired
    TBuildingcarparkMapper mapper;

    @Override
    public List<TBuildingcarpark> listAll() {
        return mapper.selectAll();
    }
}
