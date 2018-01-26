package org.mybatis.generator.codegen.mybatis3.xmlmapper.elements;

import org.mybatis.generator.api.IntrospectedColumn;

/**
 * description:
 *
 * @author saras_xu@163.com
 * @date 2018-01-26 09:33 创建
 */
public class UpdateFilter {
    private static final String CREATE_TIME = "create_time";

    private static final String UPDATE_TIME = "update_time";

    /**
     * 是否为过滤更新字段
     *
     * @param introspectedColumn
     * @return
     */
    public static boolean isUpdateFilterColumn(IntrospectedColumn introspectedColumn) {
        return CREATE_TIME.equals(introspectedColumn.getActualColumnName()) || UPDATE_TIME.equals(introspectedColumn.getActualColumnName());
    }

}
