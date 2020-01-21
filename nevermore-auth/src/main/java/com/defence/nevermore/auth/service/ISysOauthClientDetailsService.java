package com.defence.nevermore.auth.service;

import com.defence.nevermore.auth.entity.SysOauthClientDetails;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 终端信息表 服务类
 * </p>
 *
 * @author sxf
 * @since 2020-01-21
 */
public interface ISysOauthClientDetailsService extends IService<SysOauthClientDetails> {
    /**
     * 通过ID删除客户端
     *
     * @param id
     * @return
     */
    Boolean removeClientDetailsById(String id);

    /**
     * 根据客户端信息
     *
     * @param sysOauthClientDetails
     * @return
     */
    Boolean updateClientDetailsById(SysOauthClientDetails sysOauthClientDetails);
}
