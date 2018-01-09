package org.ssm.apply.mapper;

import java.util.List;
import org.ssm.apply.domain.DeptBase;

public interface DeptBaseMapper {
    int deleteByPrimaryKey(Integer did);

    int insert(DeptBase record);

    DeptBase selectByPrimaryKey(Integer did);

    List<DeptBase> selectAll();

    int updateByPrimaryKey(DeptBase record);
}