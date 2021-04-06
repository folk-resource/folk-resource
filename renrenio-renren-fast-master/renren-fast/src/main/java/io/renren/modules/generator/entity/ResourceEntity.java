package io.renren.modules.generator.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("resource")
public class ResourceEntity implements Serializable {
    private static final long serialVersionUID = 1L;


    @TableId
    private Long id_resource;
    /**
     * 资源类型
     */
    private String resource_type;
    /**
     * 资源名
     */
    private String name;
    /**
     * 资源民族
     */
    private String nation;
    /**
     * 描述
     */
    private String description;


}
