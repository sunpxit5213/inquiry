package com.ds.service.impl;

import com.ds.model.InqMessage;
import com.ds.dao.InqMessageMapper;
import com.ds.service.InqMessageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 交流表 服务实现类
 * </p>
 *
 * @author dps
 * @since 2020-02-13
 */
@Service
public class InqMessageServiceImpl extends ServiceImpl<InqMessageMapper, InqMessage> implements InqMessageService {

}
