package io.renren.modules.generator.controller;



import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;
import io.renren.modules.generator.entity.GoodsEntity;
import io.renren.modules.generator.entity.ResourceEntity;
import io.renren.modules.generator.service.ResourceService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

@RestController
@RequestMapping("generator/resource")
public class ResourceController {
    @Autowired
    private ResourceService resourceService;
    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:resource:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = resourceService.queryPage(params);

        return R.ok().put("page", page);
    }
    /**
     * 信息
     */
    @RequestMapping("/info/{id_resource}")
    @RequiresPermissions("generator:resource:info")
    public R info(@PathVariable("id_resource") Long id_resource){
        ResourceEntity resource = resourceService.getById(id_resource);

        return R.ok().put("resource", resource);
    }
    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:resource:save")
    public R save(@RequestBody ResourceEntity resource){
        resourceService.save(resource);

        return R.ok();
    }
    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:resource:update")
    public R update(@RequestBody ResourceEntity resource){
        resourceService.updateById(resource);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:resource:delete")
    public R delete(@RequestBody Long[] resourceIds){
        resourceService.removeByIds(Arrays.asList(resourceIds));

        return R.ok();
    }
}
