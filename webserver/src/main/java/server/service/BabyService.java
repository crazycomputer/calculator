package server.service;





import server.domain.Baby;

import java.util.List;

/**
 * Book 业务接口层
 *
 * Created by bysocket on 30/09/2017.
 */
public interface BabyService {
    /**
     * 获取所有 baby
     */
    List<Baby> findAll();

    /**
     * 新增 baby
     *
     * @param baby {@link Baby}
     */
    Baby insertByBaby(Baby baby);

    /**
     * 更新 baby
     *
     * @param baby {@link Baby}
     */
    Baby update(Baby baby);

    /**
     * 删除 baby
     *
     * @param id 编号
     */
    Baby delete(Long id);

    /**
     * 获取 baby
     *
     * @param id 编号
     */
    Baby findById(Long id);
}
