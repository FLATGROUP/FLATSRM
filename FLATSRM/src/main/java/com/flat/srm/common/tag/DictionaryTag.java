package com.flat.srm.common.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;
import java.io.IOException;

/**
 * 字典数据转换
 *
 * @author 金国忠  qq 274492196
 * @create 2017-08-31 下午 12:40
 */
public class DictionaryTag extends BodyTagSupport{

    private Long id;
    private  String name;
    @Override
    public int doAfterBody() throws JspException {
        String string="金国忠";
        JspWriter jspWriter=this.getPreviousOut();

        try {
            jspWriter.print("<input type='text'  name='"+name+"' value='"+string+"'readonly='ture'>");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return SKIP_BODY;
    }

    @Override
    public void release() {
        super.release();
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
