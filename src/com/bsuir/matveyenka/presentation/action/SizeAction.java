package com.bsuir.matveyenka.presentation.action;

import com.bsuir.matveyenka.dao.factory.AbstractFactoryDao;
import com.bsuir.matveyenka.entity.Size;
import com.bsuir.matveyenka.presentation.form.SizeForm;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * User: User
 * Date: 09/12/12
 */
public class SizeAction extends DispatchAction {

    @Autowired
    private AbstractFactoryDao abstractFactoryDao;

    public ActionForward saveSize(ActionMapping mapping, ActionForm form,
                                  HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        SizeForm sizeForm = (SizeForm)form;
        sizeForm.setSizes(abstractFactoryDao.getSizeDao().getList());
        return mapping.findForward("saveSize");
    }
}
