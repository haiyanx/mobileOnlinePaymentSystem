package cn.hy.service.impl;

import cn.hy.mapper.TMobilesMapper;
import cn.hy.pojo.TMobiles;
import cn.hy.pojo.TOperator;
import cn.hy.service.TMobilesService;
import cn.hy.utiles.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TMobilesServiceImpl implements TMobilesService {
    @Autowired
    private TMobilesMapper tMobilesMapper;

    @Override
    public int addResources(String mobileType, long from, long to) {
        List<TMobiles> tMobileslist = new ArrayList<>();
        long count = to - from+1;
        for(int i = 0; i<count;i++) {
            TMobiles tMobiles = new TMobiles();
            tMobiles.setMobileType(mobileType);
            tMobiles.setCardNumber(CommonUtils.uuid().substring(0,13));
            tMobiles.setMobileNumber(from+i+"");
            tMobiles.setIsAvailable("y");
            tMobileslist.add(tMobiles);
        }
        return insertList(tMobileslist);
    }
    @Override
    public TMobiles findMobileNumberByNumber(String mobileNum) {
        return tMobilesMapper.selectByPrimaryKey(mobileNum);
    }

    @Override
    public int addTxtResources(List<String> olist) {
        List<TMobiles> tlist = new ArrayList<>();

        for(int i = 1;i<olist.size();i++){
            TMobiles tMobiles = new TMobiles();
            tMobiles.setMobileType(olist.get(0));
            tMobiles.setCardNumber(CommonUtils.uuid().substring(0,13));
            tMobiles.setMobileNumber(olist.get(i));
            tMobiles.setIsAvailable("y");
            tlist.add(tMobiles);
        }
        return insertList(tlist);
    }

    public int insertList(List<TMobiles> tlist){
        int num = 0;
        for(int i=0;i<tlist.size();i++) {
            String mobileNum = tlist.get(i).getMobileNumber();
            TMobiles findTM = findMobileNumberByNumber(mobileNum);
            if(findTM == null) {
                tMobilesMapper.insert(tlist.get(i));
                num++;
            }else {
                continue;
            }
        }
        return num;
    }
}
