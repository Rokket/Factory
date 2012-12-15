package com.bsuir.matveyenka.presentation.action;

import com.bsuir.matveyenka.dao.factory.AbstractFactoryDao;
import com.bsuir.matveyenka.presentation.form.MainForm;
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
 * Date: 15/12/12
 */
public class MainAction extends DispatchAction {

    @Autowired
    private AbstractFactoryDao abstractFactoryDao;

    public ActionForward viewProfit(ActionMapping mapping, ActionForm form,
                                    HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        MainForm mainForm = (MainForm) form;
        mainForm.setProfits(abstractFactoryDao.getProfitDao().getList());

        return mapping.findForward("viewProfit");
    }

    public ActionForward viewOrders(ActionMapping mapping, ActionForm form,
                                    HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        MainForm mainForm = (MainForm) form;
        mainForm.setOrders(abstractFactoryDao.getOrderDao().getList());

        return mapping.findForward("viewOrders");
    }

    public ActionForward viewProducts(ActionMapping mapping, ActionForm form,
                                    HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        MainForm mainForm = (MainForm) form;
        mainForm.setProducts(abstractFactoryDao.getProductDao().getList());

        return mapping.findForward("viewProducts");
    }

    public ActionForward viewClients(ActionMapping mapping, ActionForm form,
                                    HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        MainForm mainForm = (MainForm) form;
        mainForm.setClients(abstractFactoryDao.getClientDao().getList());

        return mapping.findForward("viewClients");
    }

    public ActionForward viewEquipments(ActionMapping mapping, ActionForm form,
                                    HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        MainForm mainForm = (MainForm) form;
        mainForm.setEquipments(abstractFactoryDao.getEquipmentDao().getList());

        return mapping.findForward("viewEquipments");
    }

    public ActionForward viewFactories(ActionMapping mapping, ActionForm form,
                                        HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        MainForm mainForm = (MainForm) form;
        mainForm.setFactories(abstractFactoryDao.getFactoryDao().getList());

        return mapping.findForward("viewFactories");
    }

    public ActionForward viewPersonnel(ActionMapping mapping, ActionForm form,
                                       HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        MainForm mainForm = (MainForm) form;
        mainForm.setPersonnel(abstractFactoryDao.getPersonnelDao().getList());

        return mapping.findForward("viewPersonnel");
    }
}
