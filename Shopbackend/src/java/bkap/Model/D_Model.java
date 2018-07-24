/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.Model;

import bkap.Connection.D_Connection;
import bkap.Connection.Pagination;
import bkap.Entity.D_banner;
import bkap.Entity.ProductAdmin;
import bkap.Entity.UserAdmin;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author ScorPius 31
 */
public class D_Model {

    public List<UserAdmin> getAdmin() {
        Connection conn = null;
        CallableStatement call = null;
        List<UserAdmin> listAdmin = new ArrayList<>();
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call getAdmin()}");
            ResultSet rs = call.executeQuery();
            while (rs.next()) {
                UserAdmin a = new UserAdmin();
                a.setIdCustomer(rs.getInt("Ma_khach_hang"));
                a.setNameCustomer(rs.getString("Ten_khach_hang"));
                a.setUserName(rs.getString("Ten_dang_nhap"));
                a.setPassword(rs.getString("Mat_khau"));
                a.setAddress(rs.getString("Dia_chi"));
                a.setTelephone(rs.getInt("So_dien_thoai"));
                a.setEmail(rs.getString("Gmail"));
                a.setBirthday(rs.getDate("Ngay_sinh"));
                a.setRole(rs.getInt("Quyen_truy_cap"));
                listAdmin.add(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return listAdmin;
    }

    public List<UserAdmin> getUser() {
        Connection conn = null;
        CallableStatement call = null;
        List<UserAdmin> listUser = new ArrayList<>();
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call getUser()}");
            ResultSet rs = call.executeQuery();
            while (rs.next()) {
                UserAdmin a = new UserAdmin();
                a.setIdCustomer(rs.getInt("Ma_khach_hang"));
                a.setNameCustomer(rs.getString("Ten_khach_hang"));
                a.setUserName(rs.getString("Ten_dang_nhap"));
                a.setPassword(rs.getString("Mat_khau"));
                a.setAddress(rs.getString("Dia_chi"));
                a.setTelephone(rs.getInt("So_dien_thoai"));
                a.setEmail(rs.getString("Gmail"));
                a.setBirthday(rs.getDate("Ngay_sinh"));
                a.setRole(rs.getInt("Quyen_truy_cap"));
                listUser.add(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return listUser;
    }

    public List<ProductAdmin> getProductMen() {
        Connection conn = null;
        CallableStatement call = null;
        List<ProductAdmin> listMen = new ArrayList<>();
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call getProductMen()}");
            ResultSet rs = call.executeQuery();
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
                listMen.add(pro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return listMen;
    }

    public List<ProductAdmin> getProductWomen() {
        Connection conn = null;
        CallableStatement call = null;
        List<ProductAdmin> listWomen = new ArrayList<>();
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call getProductWomen()}");
            ResultSet rs = call.executeQuery();
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
                listWomen.add(pro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return listWomen;
    }

    public List<ProductAdmin> getProductBag() {
        Connection conn = null;
        CallableStatement call = null;
        List<ProductAdmin> listBag = new ArrayList<>();
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call getProductBag()}");
            ResultSet rs = call.executeQuery();
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
                listBag.add(pro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return listBag;
    }

    public List<ProductAdmin> getProductFootwear() {
        Connection conn = null;
        CallableStatement call = null;
        List<ProductAdmin> listFootwear = new ArrayList<>();
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call getProductFootwear()}");
            ResultSet rs = call.executeQuery();
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
                listFootwear.add(pro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return listFootwear;
    }

    public HashMap getDataPagination(int page, int pageSize) {
        HashMap map = Pagination.getDataForPagination(page, pageSize, "SanPham", "Ma_san_pham",
                "getDataPagging.htm");
        return map;
    }

    //    Banner
    public List<D_banner> getBannerMen() {
        Connection conn = null;
        CallableStatement call = null;
        List<D_banner> listBannerMen = new ArrayList<>();
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call GetBannerParentMen()}");
            ResultSet rs = call.executeQuery();
            while (rs.next()) {
                D_banner banner = new D_banner();
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
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return listBannerMen;
    }

    public List<D_banner> getBannerWomen() {
        Connection conn = null;
        CallableStatement call = null;
        List<D_banner> listBannerWomen = new ArrayList<>();
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call GetBannerParentWomen()}");
            ResultSet rs = call.executeQuery();
            while (rs.next()) {
                D_banner banner = new D_banner();
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
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return listBannerWomen;
    }
    
    public ProductAdmin getProductById(int productId){
        Connection conn=null;
        CallableStatement call=null;
        ProductAdmin pro=new ProductAdmin();
        try {
            conn=D_Connection.openDataBase();
            call=conn.prepareCall("{call getProductById(?)}");
            call.setInt(1, productId);
            ResultSet rs=call.executeQuery();
            if(rs.next()){
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
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            D_Connection.closeDataBase(conn, call);
        }
        return pro;
    }
    
    public List<ProductAdmin> getProductMenById(int productMenById) {
        Connection conn = null;
        CallableStatement call = null;
        List<ProductAdmin> ProductMenById = new ArrayList<>();
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call getProductMenById(?)}");
            call.setInt(1, productMenById);
            ResultSet rs = call.executeQuery();
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
                ProductMenById.add(pro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return ProductMenById;
    }

    public List<ProductAdmin> getProductWomenById(int productWomenById) {
        Connection conn = null;
        CallableStatement call = null;
        List<ProductAdmin> ProductWomenById = new ArrayList<>();
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call getProductWomenById(?)}");
            call.setInt(1, productWomenById);
            ResultSet rs = call.executeQuery();
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
                ProductWomenById.add(pro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return ProductWomenById;
    }
//    Banner

    public boolean inserProduct(ProductAdmin pro) {
        Connection conn = null;
        CallableStatement call = null;
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call InsertProdcut(?,?,?,?,?,?,?,?,?,?,?,?)}");
            call.setInt(1, pro.getCategoryId());
            call.setString(2, pro.getProductName());
            call.setString(3, pro.getProductImage());
            call.setDate(4, pro.getDate());
            call.setInt(5, pro.getImageId());        
            call.setInt(6, pro.getQuantity());
            call.setString(7, pro.getDescription());         
            call.setFloat(8, pro.getPrice());       
            call.setInt(9, pro.getSaleId());
            call.setInt(10, pro.getView());
            call.setInt(11, pro.getSupplier());
            call.setBoolean(12, pro.isStatus());          
            call.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return true;
    }

    public boolean UpdateProduct(ProductAdmin pro) {
        Connection conn = null;
        CallableStatement call = null;
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call UpdateProduct(?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            call.setInt(1, pro.getProductId());
            call.setInt(2, pro.getCategoryId());
            call.setString(3, pro.getProductName());
            call.setString(4, pro.getProductImage());
            call.setDate(5, pro.getDate());
            call.setInt(6, pro.getImageId());        
            call.setInt(7, pro.getQuantity());
            call.setString(8, pro.getDescription());         
            call.setFloat(9, pro.getPrice());       
            call.setInt(10, pro.getSaleId());
            call.setInt(11, pro.getView());
            call.setInt(12, pro.getSupplier());
            call.setBoolean(13, pro.isStatus());   
            call.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return true;
    }

    public boolean deleteProduct(String productId) {
        Connection conn = null;
        CallableStatement call = null;
        try {
            conn = D_Connection.openDataBase();
            call = conn.prepareCall("{call DeleteProduct(?)}");
            call.setString(1, productId);
            call.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            D_Connection.closeDataBase(conn, call);
        }
        return true;
    }
}
