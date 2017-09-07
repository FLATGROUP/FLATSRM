package com.flat.srm.dictionary;

import com.flat.srm.dictionary.bean.Supplier;

/**
 * 销售订单
 *
 * @author    qq 274492196
 * @create 2017-08-31 上午 9:37
 */
public class SalesOrder {
    //单据编号
    private  String no;
    //业务员
    private  String yewuyuan;
    //供应商ID
    private  Long supplierId;
    //供应商--字典项目
    private Supplier supplier;
}
