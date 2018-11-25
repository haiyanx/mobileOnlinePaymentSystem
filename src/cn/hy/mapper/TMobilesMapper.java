package cn.hy.mapper;

import cn.hy.pojo.TMobiles;
import cn.hy.pojo.TMobilesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMobilesMapper {
    int countByExample(TMobilesExample example);

    int deleteByExample(TMobilesExample example);

    int deleteByPrimaryKey(String mobileNumber);

    int insert(TMobiles record);

    int insertSelective(TMobiles record);

    List<TMobiles> selectByExample(TMobilesExample example);

    TMobiles selectByPrimaryKey(String mobileNumber);

    int updateByExampleSelective(@Param("record") TMobiles record, @Param("example") TMobilesExample example);

    int updateByExample(@Param("record") TMobiles record, @Param("example") TMobilesExample example);

    int updateByPrimaryKeySelective(TMobiles record);

    int updateByPrimaryKey(TMobiles record);
}