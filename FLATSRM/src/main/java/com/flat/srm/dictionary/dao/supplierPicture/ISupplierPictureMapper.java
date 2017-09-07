package com.flat.srm.dictionary.dao.supplierPicture;

import com.flat.srm.common.publicBean.TzParams;
import com.flat.srm.dictionary.bean.SupplierPicture;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 供应商的图片管理
 * classNmae ISupplierPictureMapper
 * package com.flat.srm.dictionary.dao.supplierPicture
 * user jingu
 * date 2017/8/11
 * time 下午 2:40
*/
@Repository
public interface ISupplierPictureMapper {
    /**
     * 保存方法
     * @param supplierPicture
     * @return
     */
    public  Integer save(SupplierPicture supplierPicture);

    /**
     * 查询
     * @param params
     * @return
     */
    public List<SupplierPicture> find(TzParams params);
}
