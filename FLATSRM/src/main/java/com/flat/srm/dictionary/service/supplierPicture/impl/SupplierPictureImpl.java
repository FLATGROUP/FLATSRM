package com.flat.srm.dictionary.service.supplierPicture.impl;

import com.flat.srm.common.publicBean.TzParams;
import com.flat.srm.dictionary.bean.SupplierPicture;
import com.flat.srm.dictionary.dao.supplierPicture.ISupplierPictureMapper;
import com.flat.srm.dictionary.service.supplierPicture.ISupplierPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * classNmae SupplierPictureImpl
 * package com.flat.srm.dictionary.service.supplierPicture.impl
 * user jingu
 * date 2017/8/12
 * time 上午 10:23
*/
@Service
public class SupplierPictureImpl implements ISupplierPictureService {
    @Autowired
    private ISupplierPictureMapper supplierPictureMapper;

    @Override
    public Integer save(SupplierPicture supplierPicture) {
        /**
         *SupplierPictureImpl方法save的功能描述
         * 图片的保存
         * @paam [supplierPicture]
         * @return long
         * @throws
         * @sice v1.0
         * @author jingu qq 274492196
         * 2017/8/12
        */
        return supplierPictureMapper.save(supplierPicture);
    }

    @Override
    public List<SupplierPicture> find(TzParams par) {
       /**
        *SupplierPictureImpl方法find的功能描述:查询
        * @paam [par]
        * @return java.util.List<com.flat.srm.dictionary.bean.SupplierPicture>
        * @throws
        * @sice v1.0
        * @author jingu qq 274492196
        * 2017/9/6
       */
        return supplierPictureMapper.find(par);
    }

}
