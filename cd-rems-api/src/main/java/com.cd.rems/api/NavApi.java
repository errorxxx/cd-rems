package com.cd.rems.api;

import com.cd.rems.entity.TNav;

import java.util.List;

public interface NavApi {    List<TNav> getAllVisibleMenuByType(TNav nav);
}
