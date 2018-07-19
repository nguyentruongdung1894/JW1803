/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.Controller;

import bkap.Entity.ProductAdmin;
import bkap.Entity.UserAdmin;
import bkap.Model.D_Model;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ScorPius 31
 */
@Controller
@RequestMapping(value = "/admin")
public class D_Controller {
     private final D_Model d_model;

    public D_Controller() {
        d_model = new D_Model();
    }
    
    @RequestMapping(value = "/index")
    public ModelAndView getProduct(){
        ModelAndView model=new ModelAndView("index-admin");
        return model;
    }
    
    @RequestMapping(value = "/admin")
    public ModelAndView getAdmin(){
        ModelAndView model=new ModelAndView("AccountAdmin");
        List<UserAdmin> listAdmin=d_model.getAdmin();
        model.addObject("listAdmin", listAdmin);
        return model;
    }
    
    @RequestMapping(value = "/user")
    public ModelAndView getUser(){
        ModelAndView model=new ModelAndView("AccountUser");
        List<UserAdmin> listUser=d_model.getUser();
        model.addObject("listUser", listUser);
        return model;
    }
    
    @RequestMapping(value = "/productMen-admin")
    public ModelAndView getMadmin(){
        ModelAndView model=new ModelAndView("Men-admin");
        List<ProductAdmin> listMadmin=d_model.getProductMen();
        model.addObject("listMadmin", listMadmin);
        return model;
    }
    
    @RequestMapping(value = "/productWomen-admin")
    public ModelAndView getWadmin(){
        ModelAndView model=new ModelAndView("Women-admin");
        List<ProductAdmin> listWadmin=d_model.getProductWomen();
        model.addObject("listWadmin", listWadmin);
        return model;
    }
    
    @RequestMapping(value = "/productBag-admin")
    public ModelAndView getBadmin(){
        ModelAndView model=new ModelAndView("Bag-admin");
        List<ProductAdmin> listBadmin=d_model.getProductBag();
        model.addObject("listBadmin", listBadmin);
        return model;
    }
    
    @RequestMapping(value = "/productFootwear-admin")
    public ModelAndView getFadmin(){
        ModelAndView model=new ModelAndView("Footwear-admin");
        List<ProductAdmin> listFadmin=d_model.getProductFootwear();
        model.addObject("listFadmin", listFadmin);
        return model;
    }
}
