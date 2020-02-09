package com.ds.model.vo;

import com.ds.model.InqDoctors;
import lombok.Data;

/**
 * @ClassName: InqDoctorsVo
 * @Author: sunpxit
 * @Description:
 * @Date: 2020/2/9 17:27
 */
@Data
public class InqDoctorsVo extends InqDoctors {

    /**
     * 科室名称
     */
    private String depName;
    /**
     * 科室类型
     */
    private String depTypeName;

}
