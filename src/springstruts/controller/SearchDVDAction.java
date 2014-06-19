package springstruts.controller;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.web.struts.ActionSupport;

import springstruts.model.DVDBO;


//TODO make sure the class extends the appropriate Spring support class
public class SearchDVDAction extends ActionSupport {
    // TODO Define an instance field of type DVDBO
    private DVDBO dvdBO;

    // TODO Define the appropriate setter method(s)
    public void setDvdBO(DVDBO dvdBO) {
        this.dvdBO = dvdBO;
    }
//we have to remember this
    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        String searchCriteria = httpServletRequest.getParameter("criteria");

        if ((searchCriteria != null) && (!searchCriteria.equals(""))) {
            Collection foundProducts;
                foundProducts = dvdBO.searchProductsByName(searchCriteria);
                httpServletRequest.getSession(true).setAttribute("product_list", foundProducts);
        }

        return actionMapping.findForward("showProductList");
    }


}
