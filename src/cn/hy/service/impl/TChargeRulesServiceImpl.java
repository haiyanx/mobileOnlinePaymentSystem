package cn.hy.service.impl;

import cn.hy.mapper.TChargeRulesMapper;
import cn.hy.service.TChargeRulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TChargeRulesServiceImpl implements TChargeRulesService {
    @Autowired
    private TChargeRulesMapper tChargeRulesMapper;
}
