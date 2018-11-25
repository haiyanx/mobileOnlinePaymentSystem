package cn.hy.mapper;

import cn.hy.pojo.TChargeRules;
import cn.hy.pojo.TChargeRulesExample;
import cn.hy.pojo.TChargeRulesKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TChargeRulesMapper {
    int countByExample(TChargeRulesExample example);

    int deleteByExample(TChargeRulesExample example);

    int deleteByPrimaryKey(TChargeRulesKey key);

    int insert(TChargeRules record);

    int insertSelective(TChargeRules record);

    List<TChargeRules> selectByExample(TChargeRulesExample example);

    TChargeRules selectByPrimaryKey(TChargeRulesKey key);

    int updateByExampleSelective(@Param("record") TChargeRules record, @Param("example") TChargeRulesExample example);

    int updateByExample(@Param("record") TChargeRules record, @Param("example") TChargeRulesExample example);

    int updateByPrimaryKeySelective(TChargeRules record);

    int updateByPrimaryKey(TChargeRules record);
}