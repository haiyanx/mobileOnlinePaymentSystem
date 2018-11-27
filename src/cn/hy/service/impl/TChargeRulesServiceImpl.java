package cn.hy.service.impl;

import cn.hy.mapper.TChargeRulesMapper;
import cn.hy.pojo.TChargeRules;
import cn.hy.pojo.TChargeRulesExample;
import cn.hy.service.TChargeRulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TChargeRulesServiceImpl implements TChargeRulesService {
    @Autowired
    private TChargeRulesMapper tChargeRulesMapper;

    @Override
    public List<TChargeRules> queryChargeRulesList() {
        return tChargeRulesMapper.selectByExample(new TChargeRulesExample());
    }
}
