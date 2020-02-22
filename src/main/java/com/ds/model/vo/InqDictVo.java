package com.ds.model.vo;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ds.model.InqDict;
import lombok.Data;

/**
 * @ClassName: inqDictVo
 * @Author: sunpxit
 * @Description: 字典增强
 * @Date: 2020/2/17 20:54
 */
@Data
public class InqDictVo extends InqDict {

    private Page page;

}
