package com.ds.service.impl;

import com.ds.model.InqOrder;
import com.ds.dao.InqOrderMapper;
import com.ds.service.InqOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author dps
 * @since 2020-02-13
 */
@Service
public class InqOrderServiceImpl extends ServiceImpl<InqOrderMapper, InqOrder> implements InqOrderService {

}
