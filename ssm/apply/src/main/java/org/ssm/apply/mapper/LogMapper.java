package org.ssm.apply.mapper;

import java.util.List;
import org.ssm.apply.domain.Log;

public interface LogMapper {
    int deleteByPrimaryKey(Integer lid);

    int insert(Log record);

    Log selectByPrimaryKey(Integer lid);

    List<Log> selectAll();

    int updateByPrimaryKey(Log record);
}