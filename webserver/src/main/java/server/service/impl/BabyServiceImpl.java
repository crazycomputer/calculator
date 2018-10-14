package server.service.impl;


import org.springframework.stereotype.Service;
import server.domain.Baby;
import server.service.BabyService;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Book 业务层实现
 *
 * Created by bysocket on 30/09/2017.
 */
@Service
public class  BabyServiceImpl implements BabyService {

    // 模拟数据库，存储 Book 信息
    // 第五章《﻿数据存储》会替换成 H2 数据源存储
    private static Map<Long, Baby> BABY_DB = new HashMap<>();

    @Override
    public List<Baby> findAll() {
        return new ArrayList<>(BABY_DB.values());
    }

    @Override
    public Baby insertByBaby(Baby baby) {
        baby.setId(BABY_DB.size() + 1L);
        BABY_DB.put(baby.getId(), baby);
        return baby;
    }

    @Override
    public Baby update(Baby baby) {
        BABY_DB.put(baby.getId(), baby);
        return baby;
    }

    @Override
    public Baby delete(Long id) {
        return BABY_DB.remove(id);
    }

    @Override
    public Baby findById(Long id) {
        return BABY_DB.get(id);
    }
}
