package com.genn.test_demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.genn.test_demo.mapper.TableAMapper;
import com.genn.test_demo.pojo.TableA;
import com.genn.test_demo.service.TableAService;
import org.springframework.stereotype.Service;

@Service
public class TableAServiceImpl extends ServiceImpl<TableAMapper, TableA> implements TableAService {
}