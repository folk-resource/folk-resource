package io.renren.modules.generator.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.renren.modules.generator.entity.ResourceEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ResourceDao extends BaseMapper<ResourceEntity> {
}
