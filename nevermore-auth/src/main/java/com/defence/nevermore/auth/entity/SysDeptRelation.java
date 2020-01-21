package com.defence.nevermore.auth.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 部门关系表
 * </p>
 *
 * @author sxf
 * @since 2020-01-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysDeptRelation对象", description="部门关系表")
public class SysDeptRelation extends Model<SysDeptRelation> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "祖先节点")
    private Integer ancestor;

    @ApiModelProperty(value = "后代节点")
    private Integer descendant;


    @Override
    protected Serializable pkVal() {
        return this.ancestor;
    }

}
