/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.Model;

import bkap.Connection.D_Connection;
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
        List<Product> listPJSaleIteam = proModel.getProductFootwear();
        for (Product pro : listPJSaleIteam) {
            System.out.println("Ma SP: " + pro.getProductName());
            System.out.println("Ten SP: " + pro.getProductImage());
            System.out.println("Image: " + pro.getPrice());
            System.out.println("Image: " + pro.getProductId());
             
        }
    } 
}
