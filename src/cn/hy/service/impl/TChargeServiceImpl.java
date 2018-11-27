package cn.hy.service.impl;

import cn.hy.mapper.TChargeMapper;
import cn.hy.pojo.TCharge;
import cn.hy.pojo.TChargeExample;
import cn.hy.service.TChargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TChargeServiceImpl implements TChargeService {
    @Autowired
    private TChargeMapper tChargeMapper;

    @Override
    public List<TCharge> queryChargeList() {
        System.out.println("===============");
        return tChargeMapper.selectByExample(new TChargeExample());
    }
}
