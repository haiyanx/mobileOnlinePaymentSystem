package cn.hy.service;

import cn.hy.pojo.TOperator;

import java.util.List;

public interface TOperatorService {
    TOperator findOperaByOID(String operateId);

    boolean insertOperator(TOperator tuser);

    List<TOperator> queryOperatorList();

    List<TOperator> likeQuery(String operator_name, String operator_id);

    int deleterOperators(String[] items);

    TOperator queryOneOperator(String checkOperator);

    int updateOperator(TOperator operator,String checkedId);
}
