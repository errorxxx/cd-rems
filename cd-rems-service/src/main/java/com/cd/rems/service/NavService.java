package com.cd.rems.service;

import com.cd.rems.entity.TNav;

import java.util.List;

public interface NavService {
    List<TNav> getAllVisibleMenuByType(TNav nav);
}
