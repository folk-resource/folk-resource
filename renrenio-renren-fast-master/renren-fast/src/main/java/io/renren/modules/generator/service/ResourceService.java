package io.renren.modules.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.generator.entity.ResourceEntity;

import javax.annotation.Resource;
import java.util.Map;

public interface ResourceService extends IService<ResourceEntity> {
    PageUtils queryPage(Map<String, Object> params);
}
