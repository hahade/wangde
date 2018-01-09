package org.ssm.apply.mapper;

import java.util.List;
import org.ssm.apply.domain.Apply;

public interface ApplyMapper {
    int deleteByPrimaryKey(Integer apid);

    int insert(Apply record);

    Apply selectByPrimaryKey(Integer apid);

    List<Apply> selectAll();

    int updateByPrimaryKey(Apply record);
}