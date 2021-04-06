package io.renren.modules.generator.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.modules.generator.dao.ResourceDao;
import io.renren.modules.generator.entity.ResourceEntity;
import io.renren.modules.generator.service.ResourceService;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service("resourceService")
public class ResourceServiceImpl extends ServiceImpl<ResourceDao, ResourceEntity> implements ResourceService {
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ResourceEntity> page = this.page(
                new Query<ResourceEntity>().getPage(params),
                new QueryWrapper<ResourceEntity>()
        );

        return new PageUtils(page);
    }
}
