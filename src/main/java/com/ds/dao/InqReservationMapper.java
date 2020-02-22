package com.ds.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ds.model.InqReservation;
import com.ds.model.vo.InqReservationVo;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 挂号表 Mapper 接口
 * </p>
 *
 * @author dps
 * @since 2020-02-13
 */
public interface InqReservationMapper extends BaseMapper<InqReservation> {

    IPage<InqReservationVo> queryPage(Page page, InqReservation inqReservation);



    InqReservationVo getBy(@Param("id") Integer id);
}
