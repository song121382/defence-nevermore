package com.defence.nevermore.auth.service;

import com.defence.nevermore.auth.entity.DeptTree;
import com.defence.nevermore.auth.entity.SysDept;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 部门管理 服务类
 * </p>
 *
 * @author sxf
 * @since 2020-01-21
 */
public interface ISysDeptService extends IService<SysDept> {
    /**
     * 查询部门树菜单
     *
     * @return 树
     */
    List<DeptTree> listDeptTrees();

    /**
     * 查询用户部门树
     *
     * @return
     */
    List<DeptTree> listCurrentUserDeptTrees();

    /**
     * 添加信息部门
     *
     * @param sysDept
     * @return
     */
    Boolean saveDept(SysDept sysDept);

    /**
     * 删除部门
     *
     * @param id 部门 ID
     * @return 成功、失败
     */
    Boolean removeDeptById(Integer id);

    /**
     * 更新部门
     *
     * @param sysDept 部门信息
     * @return 成功、失败
     */
    Boolean updateDeptById(SysDept sysDept);
}
