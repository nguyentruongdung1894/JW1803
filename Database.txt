CREATE DATABASE ProjectShop
GO
USE ProjectShop
GO
CREATE TABLE Danhmuccha(
	Ma_danh_muc_cha INT IDENTITY(1,1) NOT NULL PRIMARY KEY,	
	Ten_danh_muc_cha NVARCHAR(50) NOT NULL
)
CREATE TABLE Danhmuccon(
	Ma_danh_muc_con INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
	Ma_danh_muc_cha INT NOT NULL,
	Ten_danh_muc_con NVARCHAR(50) NOT NULL,
	Do_uu_tien INT NOT NULL,
	Trang_thai BIT NOT NULL,
	FOREIGN KEY(Ma_danh_muc_cha) REFERENCES dbo.Danhmuccha(Ma_danh_muc_cha),
)
CREATE TABLE Khuyenmai(
	Ma_Giam_Gia INT NOT NULL PRIMARY KEY IDENTITY(1,1) ,
	Ngay_bat_dau DATE NOT NULL,
	Ngay_ket_thuc DATE NOT NULL,
	Muc_do_giam_gia INT NOT NULL
)
CREATE TABLE Danh_muc_anh(
	Ma_hinh_anh INT NOT NULL PRIMARY KEY IDENTITY(1,1) ,
	Url1 VARCHAR(50) NOT NULL,
	Url2 VARCHAR(50) NOT NULL,
	Url3 VARCHAR(50) NOT NULL
)
CREATE TABLE Nha_cung_cap(
	Ma_nha_cung_cap INT NOT NULL PRIMARY KEY IDENTITY(1,1) ,
	Ten_nha_cung_cap NVARCHAR(50) NOT NULL,
	Dia_chi NVARCHAR(50) NOT NULL,
	So_dien_thoai INT NOT NULL,
	So_fax VARCHAR(20) NOT NULL
)
CREATE TABLE SanPham(
	Ma_san_pham INT NOT NULL PRIMARY KEY IDENTITY(1,1) ,
	Ma_danh_muc_con INT NOT NULL,
	Ten_san_pham NVARCHAR(50) NOT NULL,
	Hinh_anh VARCHAR(100) NOT NULL,
	Ngay_Nhap DATE NOT NULL,
	Ma_hinh_anh INT NOT NULL,
	So_luong INT NOT NULL,
	Mo_ta TEXT NOT NULL,
	Don_gia FLOAT NOT NULL,
	Ma_Giam_Gia INT NOT NULL,
	Luot_xem INT NOT NULL,
	Ma_nha_cung_cap INT NOT NULL,
	Trang_Thai BIT NOT NULL,
	FOREIGN KEY(Ma_danh_muc_con) REFERENCES dbo.Danhmuccon(Ma_danh_muc_con),
	FOREIGN KEY(Ma_Giam_Gia) REFERENCES dbo.Khuyenmai(Ma_Giam_Gia),
	FOREIGN KEY(Ma_nha_cung_cap) REFERENCES dbo.Nha_cung_cap(Ma_nha_cung_cap),
	FOREIGN KEY(Ma_hinh_anh) REFERENCES dbo.Danh_muc_anh(Ma_hinh_anh),
)
CREATE TABLE Mau_sac(
	Ma_mau INT NOT NULL PRIMARY KEY IDENTITY(1,1) ,
	Ten_mau NVARCHAR(20),
	Trang_thai BIT	
)
CREATE TABLE Mau_sac_san_pham(
	Ma_mau INT NOT NULL,
	Ma_san_pham INT NOT NULL,
	FOREIGN KEY(Ma_mau) REFERENCES dbo.Mau_sac(Ma_mau),
	FOREIGN KEY(Ma_san_pham) REFERENCES dbo.SanPham(Ma_san_pham),
	PRIMARY KEY(Ma_mau,Ma_san_pham)
)
CREATE TABLE Size(
	Ma_size INT NOT NULL PRIMARY KEY IDENTITY(1,1) ,
	Ten_size NVARCHAR(20),
	Trang_thai BIT	
)
CREATE TABLE Size_san_pham(
	Ma_size INT NOT NULL,
	Ma_san_pham INT NOT NULL,
	FOREIGN KEY(Ma_size) REFERENCES dbo.Size(Ma_size),
	FOREIGN KEY(Ma_san_pham) REFERENCES dbo.SanPham(Ma_san_pham),
	PRIMARY KEY(Ma_size,Ma_san_pham)
)
CREATE TABLE Khach_hang(
	Ma_khach_hang INT NOT NULL PRIMARY KEY IDENTITY(1,1) ,
	Ten_khach_hang NVARCHAR(20),
	Ten_dang_nhap VARCHAR(20),
	Mat_khau VARCHAR(20),
	Dia_chi NVARCHAR(50),
	So_dien_thoai INT,
	Gmail VARCHAR(20),
	Ngay_sinh DATE,
	Quyen_truy_cap INT
)
CREATE TABLE Binh_luan(
	Ma_khach_hang INT NOT NULL,
	Ma_san_pham INT NOT NULL, 
	Ngay_binh_luan DATE,
	Trang_thai BIT,
	FOREIGN KEY(Ma_khach_hang) REFERENCES dbo.Khach_hang(Ma_khach_hang),
	FOREIGN KEY(Ma_san_pham) REFERENCES dbo.SanPham(Ma_san_pham),
	PRIMARY KEY(Ma_khach_hang,Ma_san_pham)
)
CREATE TABLE Ua_thich(
	Ma_khach_hang INT NOT NULL,
	Ma_san_pham INT NOT NULL, 
	Trang_thai BIT,
	FOREIGN KEY(Ma_khach_hang) REFERENCES dbo.Khach_hang(Ma_khach_hang),
	FOREIGN KEY(Ma_san_pham) REFERENCES dbo.SanPham(Ma_san_pham),
	PRIMARY KEY(Ma_khach_hang,Ma_san_pham)
)
CREATE TABLE Ship(
	Ma_ship INT NOT NULL PRIMARY KEY IDENTITY(1,1) ,
	Ten_ship NVARCHAR(20),
	So_dien_thoai INT,
	Khoang_cach INT,
	Gia_ship MONEY,
	Trang_thai BIT
)
CREATE TABLE Thanh_toan(
	Ma_thanh_toan INT NOT NULL PRIMARY KEY IDENTITY(1,1) ,
	Hinh_thuc_thanh_toan NVARCHAR(20),
	Trang_thai BIT
)
CREATE TABLE Hoa_don(
	Ma_hoa_don INT NOT NULL PRIMARY KEY IDENTITY(1,1) ,
	Ma_khach_hang INT NOT NULL,
	Tong_tien MONEY,
	Ngay_mua DATE,
	Ma_ship INT,
	Ma_thanh_toan INT,
	Tinh_trang BIT,
	FOREIGN KEY(Ma_ship) REFERENCES dbo.Ship(Ma_ship),
    FOREIGN KEY(Ma_thanh_toan) REFERENCES dbo.Thanh_toan(Ma_thanh_toan),
	FOREIGN KEY(Ma_khach_hang) REFERENCES dbo.Khach_hang(Ma_khach_hang)
)
CREATE TABLE Hoa_don_chi_tiet(
	Ma_san_pham INT NOT NULL,
	Ma_hoa_don INT NOT NULL,
	So_luong INT,
	Tong_chi_tiet MONEY,
	FOREIGN KEY(Ma_san_pham) REFERENCES dbo.SanPham(Ma_san_pham),
    FOREIGN KEY(Ma_hoa_don) REFERENCES dbo.Hoa_don(Ma_hoa_don),
	PRIMARY KEY(Ma_san_pham,Ma_hoa_don)
)
CREATE TABLE Slide(
	SlideId INT NOT NULL PRIMARY KEY IDENTITY(1,1),
	SlideImage VARCHAR(50),
	SlideUuTien INT,
	SlideStatus BIT
)
