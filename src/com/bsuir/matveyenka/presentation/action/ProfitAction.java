package com.bsuir.matveyenka.presentation.action;

import com.bsuir.matveyenka.dao.factory.AbstractFactoryDao;
import com.bsuir.matveyenka.entity.Profit;
import com.bsuir.matveyenka.presentation.form.ProfitForm;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * User: User
 * Date: 10/12/12
 */
public class ProfitAction extends DispatchAction {

    @Autowired
    private AbstractFactoryDao abstractFactoryDao;

    public ActionForward viewProfit(ActionMapping mapping, ActionForm form,
                                    HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        ProfitForm profitForm = (ProfitForm) form;
        profitForm.setProfits(abstractFactoryDao.getProfitDao().getList());

        return mapping.findForward("viewProfit");
    }
}
