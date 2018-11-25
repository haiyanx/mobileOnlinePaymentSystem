package cn.hy.service.impl;

import cn.hy.mapper.TCustomerMapper;
import cn.hy.service.TChargeRulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TCustomerServiceImpl implements TChargeRulesService {
    @Autowired
    private TCustomerMapper tCustomerMapper;
}
