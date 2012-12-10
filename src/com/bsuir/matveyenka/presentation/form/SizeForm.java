package com.bsuir.matveyenka.presentation.form;

import com.bsuir.matveyenka.entity.Size;
import org.apache.struts.action.ActionForm;

import java.util.List;

/**
 * User: User
 * Date: 09/12/12
 */
public class SizeForm extends ActionForm {

    private Size size = new Size();

    private List<Size> sizes;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public List<Size> getSizes() {
        return sizes;
    }

    public void setSizes(List<Size> sizes) {
        this.sizes = sizes;
    }
}
