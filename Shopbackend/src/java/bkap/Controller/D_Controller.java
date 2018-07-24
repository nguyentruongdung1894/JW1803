/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.Controller;

import bkap.Connection.D_Connection;
import bkap.Entity.D_banner;
import bkap.Entity.ProductAdmin;
import bkap.Entity.UserAdmin;
import bkap.Model.D_Model;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
    public ModelAndView getProduct() {
        ModelAndView model = new ModelAndView("index-admin");
        return model;
    }

    @RequestMapping(value = "/admin")
    public ModelAndView getAdmin() {
        ModelAndView model = new ModelAndView("AccountAdmin");
        List<UserAdmin> listAdmin = d_model.getAdmin();
        model.addObject("listAdmin", listAdmin);
        return model;
    }

    @RequestMapping(value = "/user")
    public ModelAndView getUser() {
        ModelAndView model = new ModelAndView("AccountUser");
        List<UserAdmin> listUser = d_model.getUser();
        model.addObject("listUser", listUser);
        return model;
    }

    @RequestMapping(value = "/productMen-admin")
    public ModelAndView getMadmin() {
        ModelAndView model = new ModelAndView("Men-admin");
        List<ProductAdmin> listMadmin = d_model.getProductMen();
        List<D_banner> listBannerMen = d_model.getBannerMen();
        List<D_banner> listBannerWomen = d_model.getBannerWomen();
        model.addObject("listMadmin", listMadmin);
        model.addObject("listBannerMen", listBannerMen);
        model.addObject("listBannerWomen", listBannerWomen);
        return model;
    }

    @RequestMapping(value = "/productWomen-admin")
    public ModelAndView getWadmin() {
        ModelAndView model = new ModelAndView("Women-admin");
        List<ProductAdmin> listWadmin = d_model.getProductWomen();
        List<D_banner> listBannerMen = d_model.getBannerMen();
        List<D_banner> listBannerWomen = d_model.getBannerWomen();
        model.addObject("listWadmin", listWadmin);
        model.addObject("listBannerMen", listBannerMen);
        model.addObject("listBannerWomen", listBannerWomen);
        return model;
    }

    @RequestMapping(value = "/productBag-admin")
    public ModelAndView getBadmin() {
        ModelAndView model = new ModelAndView("Bag-admin");
        List<ProductAdmin> listBadmin = d_model.getProductBag();
        List<D_banner> listBannerMen = d_model.getBannerMen();
        List<D_banner> listBannerWomen = d_model.getBannerWomen();
        model.addObject("listBadmin", listBadmin);
        model.addObject("listBannerMen", listBannerMen);
        model.addObject("listBannerWomen", listBannerWomen);
        return model;
    }

    @RequestMapping(value = "/productFootwear-admin")
    public ModelAndView getFadmin() {
        ModelAndView model = new ModelAndView("Footwear-admin");
        List<ProductAdmin> listFadmin = d_model.getProductFootwear();
        List<D_banner> listBannerMen = d_model.getBannerMen();
        List<D_banner> listBannerWomen = d_model.getBannerWomen();
        model.addObject("listFadmin", listFadmin);
        model.addObject("listBannerMen", listBannerMen);
        model.addObject("listBannerWomen", listBannerWomen);
        return model;
    }

    @RequestMapping(value = "/getData")
    public ModelAndView getDataProduct() {
        ModelAndView model = new ModelAndView("Product-admin");
        int sizeRowofPage = 10;
        HashMap map = d_model.getDataPagination(1, sizeRowofPage);
        String url = (String) map.get("url");
        List<ProductAdmin> listProduct = new ArrayList<>();
        try {
            ResultSet rs = (ResultSet) map.get("rs");
            while (rs.next()) {
                ProductAdmin pro = new ProductAdmin();
                pro.setProductId(rs.getInt("Ma_san_pham"));
                pro.setCategoryId(rs.getInt("Ma_danh_muc_con"));
                pro.setProductName(rs.getString("Ten_san_pham"));
                pro.setProductImage(rs.getString("Hinh_anh"));
                pro.setDate(rs.getDate("Ngay_Nhap"));
                pro.setImageId(rs.getInt("Ma_hinh_anh"));
                pro.setQuantity(rs.getInt("So_luong"));
                pro.setDescription(rs.getString("Mo_ta"));
                pro.setPrice(rs.getFloat("Don_gia"));
                pro.setSaleId(rs.getInt("Ma_Giam_Gia"));
                pro.setView(rs.getInt("Luot_xem"));
                pro.setSupplier(rs.getInt("Ma_nha_cung_cap"));
                pro.setStatus(rs.getBoolean("Trang_Thai"));
                listProduct.add(pro);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Connection conn = (Connection) map.get("conn");
            CallableStatement callSt = (CallableStatement) map.get("callSt");
            D_Connection.closeDataBase(conn, callSt);
        }
        model.getModelMap().put("listProduct", listProduct);
        model.getModelMap().put("url", url);
        return model;
    }

    @RequestMapping(value = "/getDataPagging")
    public ModelAndView getDataProductPagging(@RequestParam("page") String page) {
        ModelAndView model = new ModelAndView("Product-admin");
        int pageInt = Integer.parseInt(page);
        int sizeRowofPage = 10;
        HashMap map = d_model.getDataPagination(pageInt, sizeRowofPage);
        String url = (String) map.get("url");
        List<ProductAdmin> listProduct = new ArrayList<>();
        try {
            ResultSet rs = (ResultSet) map.get("rs");
            while (rs.next()) {
                ProductAdmin pro = new ProductAdmin();
                pro.setProductId(rs.getInt("Ma_san_pham"));
                pro.setCategoryId(rs.getInt("Ma_danh_muc_con"));
                pro.setProductName(rs.getString("Ten_san_pham"));
                pro.setProductImage(rs.getString("Hinh_anh"));
                pro.setDate(rs.getDate("Ngay_Nhap"));
                pro.setImageId(rs.getInt("Ma_hinh_anh"));
                pro.setQuantity(rs.getInt("So_luong"));
                pro.setDescription(rs.getString("Mo_ta"));
                pro.setPrice(rs.getFloat("Don_gia"));
                pro.setSaleId(rs.getInt("Ma_Giam_Gia"));
                pro.setView(rs.getInt("Luot_xem"));
                pro.setSupplier(rs.getInt("Ma_nha_cung_cap"));
                pro.setStatus(rs.getBoolean("Trang_Thai"));
                listProduct.add(pro);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            Connection conn = (Connection) map.get("conn");
            CallableStatement callSt = (CallableStatement) map.get("callSt");
            D_Connection.closeDataBase(conn, callSt);
        }
        model.getModelMap().put("listProduct", listProduct);
        model.getModelMap().put("url", url);
        return model;
    }
    
    @RequestMapping(value = "/mens-filter")
    public ModelAndView getmens(int productMenById) {
        ModelAndView model = new ModelAndView("men-filter");
        List<D_banner> listBannerMen = d_model.getBannerMen();
        List<D_banner> listBannerWomen = d_model.getBannerWomen();
        List<ProductAdmin> listProductM=d_model.getProductMenById(productMenById);
        model.addObject("listBannerMen", listBannerMen);
        model.addObject("listBannerWomen", listBannerWomen);
        model.addObject("listProductM", listProductM);
        return model;
    }

    @RequestMapping(value = "/womens-filter")
    public ModelAndView getwomens(int productWomenById) {
        ModelAndView model = new ModelAndView("women-filter");
        List<D_banner> listBannerMen = d_model.getBannerMen();
        List<D_banner> listBannerWomen = d_model.getBannerWomen();
        List<ProductAdmin> listProductW=d_model.getProductWomenById(productWomenById);
        model.addObject("listBannerMen", listBannerMen);
        model.addObject("listBannerWomen", listBannerWomen);
        model.addObject("listProductW", listProductW);
        return model;
    }
    
    @RequestMapping(value = "/delete-product")
    public String delete(String productId){
        boolean check=d_model.deleteProduct(productId);
        if(check){          
            return "redirect:getData.htm";
        }
        else{
            return "error";
        }
    }
    
    @RequestMapping(value = "/iUpdate")
    public ModelAndView iUpdate(int productId){
        ModelAndView model=new ModelAndView("updateProduct-admin");
        ProductAdmin pro=d_model.getProductById(productId);
        model.getModelMap().addAttribute("pro", pro);
        return model;
    }
    
    @RequestMapping(value = "/update")
    public String update(ProductAdmin pro){
        boolean check=d_model.UpdateProduct(pro);
        if(check){          
            return "redirect:getAll.htm";
        }
        else{
            return "error";
        }
    }
    
    @RequestMapping(value = "/iInsert")
    public ModelAndView iIsert(){
        ModelAndView model=new ModelAndView("insertProduct-admin");
        ProductAdmin pro=new ProductAdmin();
        model.getModelMap().addAttribute("pro", pro);
        return model;
    }
    
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String Isert(ProductAdmin pro){
        boolean check=d_model.inserProduct(pro);
        if(check){          
            return "redirect:getAll.htm";
        }
        else{
            return "error";
        }
    }
}
