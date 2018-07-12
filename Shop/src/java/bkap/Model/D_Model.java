/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.Model;

import bkap.Connection.D_Connection;
import bkap.Controller.D_Controller;
import bkap.Entity.D_banner;
import bkap.Entity.Product;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ScorPius 31
 */
public class D_Model {
//    Banner
    public List<D_banner> getBannerMen(){
        Connection conn=null;
        CallableStatement call=null;
        List<D_banner> listBannerMen=new ArrayList<>();
        try {
            conn=D_Connection.openDataBase();
            call=conn.prepareCall("{call GetBannerParentMen()}");
            ResultSet rs=call.executeQuery();
            while(rs.next()){
                D_banner banner=new D_banner();
                banner.setMadanhmuccha(rs.getInt("Ma_danh_muc_cha"));
                banner.setTendanhmuccha(rs.getString("Ten_danh_muc_cha"));
                banner.setMadanhmuccon(rs.getInt("Ma_danh_muc_con"));
                banner.setTendanhmuccon(rs.getString("Ten_danh_muc_con"));
                banner.setDouutien(rs.getInt("Do_uu_tien"));
                banner.setTrangthai(rs.getBoolean("Trang_thai"));
                listBannerMen.add(banner);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            D_Connection.closeDataBase(conn, call);
        }
        return listBannerMen;
    }
    public List<D_banner> getBannerWomen(){
        Connection conn=null;
        CallableStatement call=null;
        List<D_banner> listBannerWomen=new ArrayList<>();
        try {
            conn=D_Connection.openDataBase();
            call=conn.prepareCall("{call GetBannerParentWomen()}");
            ResultSet rs=call.executeQuery();
            while(rs.next()){
                D_banner banner=new D_banner();
                banner.setMadanhmuccha(rs.getInt("Ma_danh_muc_cha"));
                banner.setTendanhmuccha(rs.getString("Ten_danh_muc_cha"));
                banner.setMadanhmuccon(rs.getInt("Ma_danh_muc_con"));
                banner.setTendanhmuccon(rs.getString("Ten_danh_muc_con"));
                banner.setDouutien(rs.getInt("Do_uu_tien"));
                banner.setTrangthai(rs.getBoolean("Trang_thai"));
                listBannerWomen.add(banner);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            D_Connection.closeDataBase(conn, call);
        }
        return listBannerWomen;
    }
    
    public List<Product> getProductMenById(int productMenById){
        Connection conn=null;
        CallableStatement call=null;
        List<Product> ProductMenById=new ArrayList<>();
        try {
            conn=D_Connection.openDataBase();
            call=conn.prepareCall("{call getProductMenById(?)}");
            call.setInt(1,productMenById);
            ResultSet rs=call.executeQuery();
            while(rs.next()){
                Product pro=new Product();
                pro.setProductId(rs.getInt("Ma_san_pham"));
                pro.setProductImage(rs.getString("Hinh_anh"));
                pro.setProductName(rs.getString("Ten_san_pham"));
                pro.setPrice(rs.getFloat("Don_gia"));               
                ProductMenById.add(pro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            D_Connection.closeDataBase(conn, call);
        }
        return ProductMenById;
    }
    
    public List<Product> getProductWomenById(int productWomenById){
        Connection conn=null;
        CallableStatement call=null;
        List<Product> ProductWomenById=new ArrayList<>();
        try {
            conn=D_Connection.openDataBase();
            call=conn.prepareCall("{call getProductWomenById(?)}");
            call.setInt(1,productWomenById);
            ResultSet rs=call.executeQuery();
            while(rs.next()){
                Product pro=new Product();
                pro.setProductId(rs.getInt("Ma_san_pham"));
                pro.setProductImage(rs.getString("Hinh_anh"));
                pro.setProductName(rs.getString("Ten_san_pham"));
                pro.setPrice(rs.getFloat("Don_gia"));               
                ProductWomenById.add(pro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            D_Connection.closeDataBase(conn, call);
        }
        return ProductWomenById;
    }
//    Banner
    public List<Product> getProductMen(){
        Connection conn=null;
        CallableStatement call=null;
        List<Product> listMen=new ArrayList<>();
        try {
            conn=D_Connection.openDataBase();
            call=conn.prepareCall("{call getProductMen()}");
            ResultSet rs=call.executeQuery();
            while(rs.next()){
                Product pro=new Product();
                pro.setProductId(rs.getInt("Ma_san_pham"));
                pro.setProductImage(rs.getString("Hinh_anh"));
                pro.setProductName(rs.getString("Ten_san_pham"));
                pro.setPrice(rs.getFloat("Don_gia"));               
                listMen.add(pro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            D_Connection.closeDataBase(conn, call);
        }
        return listMen;
    }
    
    public List<Product> getProductWomen(){
        Connection conn=null;
        CallableStatement call=null;
        List<Product> listWomen=new ArrayList<>();
        try {
            conn=D_Connection.openDataBase();
            call=conn.prepareCall("{call getProductWomen()}");
            ResultSet rs=call.executeQuery();
            while(rs.next()){
                Product pro=new Product();
                pro.setProductId(rs.getInt("Ma_san_pham"));
                pro.setProductImage(rs.getString("Hinh_anh"));
                pro.setProductName(rs.getString("Ten_san_pham"));
                pro.setPrice(rs.getFloat("Don_gia"));               
                listWomen.add(pro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            D_Connection.closeDataBase(conn, call);
        }
        return listWomen;
    }
    
    public List<Product> getProductBag(){
        Connection conn=null;
        CallableStatement call=null;
        List<Product> listBag=new ArrayList<>();
        try {
            conn=D_Connection.openDataBase();
            call=conn.prepareCall("{call getProductBag()}");
            ResultSet rs=call.executeQuery();
            while(rs.next()){
                Product pro=new Product();
                pro.setProductId(rs.getInt("Ma_san_pham"));
                pro.setProductImage(rs.getString("Hinh_anh"));
                pro.setProductName(rs.getString("Ten_san_pham"));
                pro.setPrice(rs.getFloat("Don_gia"));               
                listBag.add(pro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            D_Connection.closeDataBase(conn, call);
        }
        return listBag;
    }
    
    public List<Product> getProductFootwear(){
        Connection conn=null;
        CallableStatement call=null;
        List<Product> listFootwear=new ArrayList<>();
        try {
            conn=D_Connection.openDataBase();
            call=conn.prepareCall("{call getProductFootwear()}");
            ResultSet rs=call.executeQuery();
            while(rs.next()){
                Product pro=new Product();
                pro.setProductId(rs.getInt("Ma_san_pham"));
                pro.setProductImage(rs.getString("Hinh_anh"));
                pro.setProductName(rs.getString("Ten_san_pham"));
                pro.setPrice(rs.getFloat("Don_gia"));               
                listFootwear.add(pro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            D_Connection.closeDataBase(conn, call);
        }
        return listFootwear;
    }
    
        public static void main(String[] args) {
        D_Model proModel = new D_Model();
        List<D_banner> listBannerMen = proModel.getBannerMen();
        for (D_banner pro : listBannerMen) {
            System.out.println("Ma SP: " + pro.getMadanhmuccha());
            System.out.println("Ten SP: " + pro.getTendanhmuccha());
            System.out.println("Image: " + pro.getMadanhmuccon());
            System.out.println("Image: " + pro.getTendanhmuccon());
            System.out.println("Image: " + pro.getDouutien());
            System.out.println("Image: " + pro.isTrangthai()); 
        }
    } 
}
