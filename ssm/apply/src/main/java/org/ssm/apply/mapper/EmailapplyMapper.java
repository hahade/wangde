package org.ssm.apply.mapper;

import java.util.List;
import org.ssm.apply.domain.Emailapply;

public interface EmailapplyMapper {
    int deleteByPrimaryKey(Integer eid);

    int insert(Emailapply record);

    Emailapply selectByPrimaryKey(Integer eid);

    List<Emailapply> selectAll();

    int updateByPrimaryKey(Emailapply record);
}