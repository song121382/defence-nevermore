package com.defence.nevermore.auth.service;

import com.defence.nevermore.auth.entity.SysDept;
import com.defence.nevermore.auth.entity.SysDeptRelation;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 部门关系表 服务类
 * </p>
 *
 * @author sxf
 * @since 2020-01-21
 */
public interface ISysDeptRelationService extends IService<SysDeptRelation> {
    /**
     * 新建部门关系
     *
     * @param sysDept 部门
     */
    void saveDeptRelation(SysDept sysDept);

    /**
     * 通过ID删除部门关系
     *
     * @param id
     */
    void removeDeptRelationById(Integer id);

    /**
     * 更新部门关系
     *
     * @param relation
     */
    void updateDeptRelation(SysDeptRelation relation);
}
