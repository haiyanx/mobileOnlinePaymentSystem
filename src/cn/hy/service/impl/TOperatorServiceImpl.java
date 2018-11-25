package cn.hy.service.impl;

import cn.hy.mapper.TOperatorMapper;
import cn.hy.pojo.TOperator;
import cn.hy.pojo.TOperatorExample;
import cn.hy.service.TOperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TOperatorServiceImpl implements TOperatorService {
    @Autowired
    private TOperatorMapper tOperatorMapper;

    public TOperator findOperaByOID(String operateId){
        return tOperatorMapper.selectByPrimaryKey(operateId);
    }

    @Override
    public boolean insertOperator(TOperator tuser) {
        String operatorId = tuser.getOperatorId();
        TOperator opid = findOperaByOID(operatorId);
        if(opid==null) {
            tOperatorMapper.insert(tuser);
            return true;
        }
        return false;
    }

    @Override
    public List<TOperator> queryOperatorList() {
        TOperatorExample example = null;
        return tOperatorMapper.selectByExample(example);
    }

    @Override
    public List<TOperator> likeQuery(String operator_name, String operator_id) {
        TOperatorExample example = new TOperatorExample();
        TOperatorExample.Criteria likeCriteria = example.createCriteria();
        if(operator_name!=null && !operator_name.equals("")){
            likeCriteria.andOperatorNameLike("%"+operator_name+"%");
        }
        if(operator_id!=null && !operator_id.equals("")){
            likeCriteria.andOperatorIdLike("%"+operator_id+"%");
        }
        return tOperatorMapper.selectByExample(example);
    }

    @Override
    public int deleterOperators(String[] items) {
        int count = 0;
        for (int i = 0; i < items.length;i++){
            tOperatorMapper.deleteByPrimaryKey(items[i]);
            count++;
        }
        return count;
    }

    @Override
    public TOperator queryOneOperator(String checkOperator) {
        return tOperatorMapper.selectByPrimaryKey(checkOperator);
    }

    @Override
    public int updateOperator(TOperator operator,String checkedId) {
        TOperatorExample example = new TOperatorExample();
        TOperatorExample.Criteria newCriteria = example.createCriteria();
        newCriteria.andOperatorIdEqualTo(checkedId);
        return tOperatorMapper.updateByExampleSelective(operator, example);
    }
}
