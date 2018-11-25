package cn.hy.mapper;

import cn.hy.pojo.TCharge;
import cn.hy.pojo.TChargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TChargeMapper {
    int countByExample(TChargeExample example);

    int deleteByExample(TChargeExample example);

    int deleteByPrimaryKey(String chargeCode);

    int insert(TCharge record);

    int insertSelective(TCharge record);

    List<TCharge> selectByExample(TChargeExample example);

    TCharge selectByPrimaryKey(String chargeCode);

    int updateByExampleSelective(@Param("record") TCharge record, @Param("example") TChargeExample example);

    int updateByExample(@Param("record") TCharge record, @Param("example") TChargeExample example);

    int updateByPrimaryKeySelective(TCharge record);

    int updateByPrimaryKey(TCharge record);
}