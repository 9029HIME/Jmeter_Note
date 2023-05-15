package com.genn.test_demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.genn.test_demo.pojo.TableB;

@Repository
@Mapper
public interface TableBMapper extends BaseMapper<TableB> {
}
