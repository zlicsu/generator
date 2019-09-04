package com.atabase.mapper;

import com.database.entity.AuditOrder;
import com.database.entity.AuditOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuditOrderMapper {
    int countByExample(AuditOrderExample example);

    int deleteByExample(AuditOrderExample example);

    int insert(AuditOrder record);

    int insertSelective(AuditOrder record);

    List<AuditOrder> selectByExample(AuditOrderExample example);

    int updateByExampleSelective(@Param("record") AuditOrder record, @Param("example") AuditOrderExample example);

    int updateByExample(@Param("record") AuditOrder record, @Param("example") AuditOrderExample example);
}