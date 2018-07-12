/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.Controller;

import bkap.Entity.Product;
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
@RequestMapping(value = "/home")
public class D_Controller {
    private final D_Model d_model;

    public D_Controller() {
        d_model=new D_Model();
    }
    
    @RequestMapping(value = "/index")
    public ModelAndView getProductHot(){
        ModelAndView model=new ModelAndView("index");      
        List<Product> listMen=d_model.getProductMen();
        List<Product> listWomen=d_model.getProductWomen();
        List<Product> listBag=d_model.getProductBag();
        List<Product> listFootwear=d_model.getProductFootwear();
        model.addObject("listMen", listMen);
        model.addObject("listWomen", listWomen);
        model.addObject("listBag", listBag);
        model.addObject("listFootwear", listFootwear);
        return model;
    }   
}
