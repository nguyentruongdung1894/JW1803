/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.Controller;

import bkap.Entity.D_banner;
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
        d_model = new D_Model();
    }

    @RequestMapping(value = "/index")
    public ModelAndView getProductHot() {
        ModelAndView model = new ModelAndView("index");
        List<Product> listMen = d_model.getProductMen();
        List<Product> listWomen = d_model.getProductWomen();
        List<Product> listBag = d_model.getProductBag();
        List<Product> listFootwear = d_model.getProductFootwear();
        List<D_banner> listBannerMen = d_model.getBannerMen();
        List<D_banner> listBannerWomen = d_model.getBannerWomen();
        model.addObject("listMen", listMen);
        model.addObject("listWomen", listWomen);
        model.addObject("listBag", listBag);
        model.addObject("listFootwear", listFootwear);
        model.addObject("listBannerMen", listBannerMen);
        model.addObject("listBannerWomen", listBannerWomen);
        return model;
    }

    @RequestMapping(value = "/about")
    public ModelAndView getabout() {
        ModelAndView model = new ModelAndView("about");
        List<D_banner> listBannerMen = d_model.getBannerMen();
        List<D_banner> listBannerWomen = d_model.getBannerWomen();
        model.addObject("listBannerMen", listBannerMen);
        model.addObject("listBannerWomen", listBannerWomen);
        return model;
    }

    @RequestMapping(value = "/contact")
    public ModelAndView getcontact() {
        ModelAndView model = new ModelAndView("contact");
        List<D_banner> listBannerMen = d_model.getBannerMen();
        List<D_banner> listBannerWomen = d_model.getBannerWomen();
        model.addObject("listBannerMen", listBannerMen);
        model.addObject("listBannerWomen", listBannerWomen);
        return model;
    }
    
    @RequestMapping(value = "/mens")
    public ModelAndView getmens(int productMenById) {
        ModelAndView model = new ModelAndView("mens");
        List<D_banner> listBannerMen = d_model.getBannerMen();
        List<D_banner> listBannerWomen = d_model.getBannerWomen();
        List<Product> listProductMen=d_model.getProductMenById(productMenById);
        model.addObject("listBannerMen", listBannerMen);
        model.addObject("listBannerWomen", listBannerWomen);
        model.addObject("listProductMen", listProductMen);
        return model;
    }

    @RequestMapping(value = "/womens")
    public ModelAndView getwomens(int productWomenById) {
        ModelAndView model = new ModelAndView("womens");
        List<D_banner> listBannerMen = d_model.getBannerMen();
        List<D_banner> listBannerWomen = d_model.getBannerWomen();
        List<Product> listProductWomen=d_model.getProductWomenById(productWomenById);
        model.addObject("listBannerMen", listBannerMen);
        model.addObject("listBannerWomen", listBannerWomen);
        model.addObject("listProductWomen", listProductWomen);
        return model;
    }
    
}
