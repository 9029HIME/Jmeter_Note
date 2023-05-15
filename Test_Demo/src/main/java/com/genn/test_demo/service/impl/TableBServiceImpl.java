package com.genn.test_demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.genn.test_demo.mapper.TableBMapper;
import com.genn.test_demo.pojo.TableB;
import org.springframework.stereotype.Service;
import com.genn.test_demo.service.TableBService;

@Service
public class TableBServiceImpl extends ServiceImpl<TableBMapper, TableB> implements TableBService {
}
