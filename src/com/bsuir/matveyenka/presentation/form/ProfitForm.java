package com.bsuir.matveyenka.presentation.form;

import com.bsuir.matveyenka.entity.Profit;
import org.apache.struts.action.ActionForm;

import java.util.List;

/**
 * User: User
 * Date: 10/12/12
 */
public class ProfitForm extends ActionForm {

    private List<Profit> profits;

    public List<Profit> getProfits() {
        return profits;
    }

    public void setProfits(List<Profit> profits) {
        this.profits = profits;
    }
}
