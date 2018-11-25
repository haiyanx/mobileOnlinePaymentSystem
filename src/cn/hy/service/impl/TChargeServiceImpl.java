package cn.hy.service.impl;

import cn.hy.mapper.TChargeMapper;
import cn.hy.service.TChargeRulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TChargeServiceImpl implements TChargeRulesService {
    @Autowired
    private TChargeMapper tChargeMapper;
}
