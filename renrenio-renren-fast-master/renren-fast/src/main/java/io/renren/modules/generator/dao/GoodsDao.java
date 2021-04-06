package io.renren.modules.generator.dao;

import io.renren.modules.generator.entity.GoodsEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品管理
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-03-31 10:47:09
 */
@Mapper
public interface GoodsDao extends BaseMapper<GoodsEntity> {
	
}
