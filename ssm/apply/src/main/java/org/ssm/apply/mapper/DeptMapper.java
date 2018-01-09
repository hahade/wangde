package org.ssm.apply.mapper;

import java.util.List;
import org.ssm.apply.domain.Dept;

public interface DeptMapper {
    int deleteByPrimaryKey(Integer did);

    int insert(Dept record);

    Dept selectByPrimaryKey(Integer did);

    List<Dept> selectAll();

    int updateByPrimaryKey(Dept record);
}