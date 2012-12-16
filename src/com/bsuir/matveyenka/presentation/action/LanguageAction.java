package com.bsuir.matveyenka.presentation.action;

import com.bsuir.matveyenka.presentation.form.LanguageForm;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Locale;

/**
 * User: User
 * Date: 16/12/12
 */
public class LanguageAction extends Action {

    private static final String REFERER = "referer";

    private static final String LOCALE_ATTRIBUTE = "org.apache.struts.action.LOCALE";

    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        LanguageForm languageForm = (LanguageForm) form;
        String referer = request.getHeader(REFERER);
        request.getSession().setAttribute(LOCALE_ATTRIBUTE, new Locale(languageForm.getLanguage()));

        return new ActionForward(referer, true);
    }

}
