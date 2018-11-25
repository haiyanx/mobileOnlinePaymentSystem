package cn.hy.service.impl;

import cn.hy.mapper.TAccountMapper;
import cn.hy.service.TAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TAccountServiceImpl implements TAccountService {
    @Autowired
    private TAccountMapper tAccountMapper;
}
