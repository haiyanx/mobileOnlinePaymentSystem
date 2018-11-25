package cn.hy.service.impl;

import cn.hy.mapper.TUserMapper;
import cn.hy.pojo.TUser;
import cn.hy.pojo.TUserExample;
import cn.hy.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TUserServiceImpl implements TUserService {
    @Autowired
    private TUserMapper tUserMapper;

    @Override
    public int add(TUser tUser) {
        int insert = tUserMapper.insert(tUser);
        return insert;
    }


}
