package com.ds.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ds.model.InqDoctors;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ds.model.vo.InqDoctorsVo;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author dps
 * @since 2020-02-13
 */
public interface InqDoctorsMapper extends BaseMapper<InqDoctors> {

    /**
    * @author  : sunpx
    * @desc    : 分页查询
    * @date    : 2020/02/13 11:11:20
    * @params  : page,inqDoctors
    * @return  : com.baomidou.mybatisplus.core.metadata.IPage<com.ds.model.InqDoctors>
    */
    IPage<InqDoctorsVo> getPage(Page page, @Param("inq") InqDoctors inqDoctors);



}
