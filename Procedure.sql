
ALTER PROC getProductMen
AS
BEGIN
	SELECT TOP 8 * FROM dbo.SanPham sp INNER JOIN dbo.Danhmuccon dmc ON dmc.Ma_danh_muc_con = sp.Ma_danh_muc_con
		INNER JOIN dbo.Danhmuccha dm ON dm.Ma_danh_muc_cha = dmc.Ma_danh_muc_cha
	WHERE dm.Ma_danh_muc_cha=1 AND sp.Trang_Thai=1 ORDER BY sp.Ngay_Nhap DESC
END

ALTER PROC getProductWomen
AS
BEGIN
	SELECT TOP 8 * FROM dbo.SanPham sp INNER JOIN dbo.Danhmuccon dmc ON dmc.Ma_danh_muc_con = sp.Ma_danh_muc_con
		INNER JOIN dbo.Danhmuccha dm ON dm.Ma_danh_muc_cha = dmc.Ma_danh_muc_cha
		WHERE dm.Ma_danh_muc_cha=2 AND sp.Trang_Thai=1 ORDER BY sp.Ngay_Nhap DESC
END

ALTER PROC getProductBag
AS
BEGIN
	SELECT TOP 8 * FROM dbo.SanPham sp INNER JOIN dbo.Danhmuccon dmc ON dmc.Ma_danh_muc_con = sp.Ma_danh_muc_con
		INNER JOIN dbo.Danhmuccha dm ON dm.Ma_danh_muc_cha = dmc.Ma_danh_muc_cha
		WHERE dm.Ma_danh_muc_cha=3 AND sp.Trang_Thai=1 ORDER BY sp.Ngay_Nhap DESC
END

ALTER PROC getProductFootwear
AS
BEGIN
	SELECT TOP 8 * FROM dbo.SanPham sp INNER JOIN dbo.Danhmuccon dmc ON dmc.Ma_danh_muc_con = sp.Ma_danh_muc_con
		INNER JOIN dbo.Danhmuccha dm ON dm.Ma_danh_muc_cha = dmc.Ma_danh_muc_cha
		WHERE dm.Ma_danh_muc_cha=4 AND sp.Trang_Thai=1 ORDER BY sp.Ngay_Nhap DESC
END

CREATE PROC GetBannerParentMen
AS
BEGIN
	SELECT *
	FROM dbo.Danhmuccha dm INNER JOIN dbo.Danhmuccon dmc ON dmc.Ma_danh_muc_cha = dm.Ma_danh_muc_cha	
	WHERE dmc.Trang_thai=1 AND dm.Ma_danh_muc_cha=1 ORDER BY dmc.Do_uu_tien ASC
END

CREATE PROC GetBannerParentWomen
AS
BEGIN
	SELECT *
	FROM dbo.Danhmuccha dm INNER JOIN dbo.Danhmuccon dmc ON dmc.Ma_danh_muc_cha = dm.Ma_danh_muc_cha	
	WHERE dmc.Trang_thai=1 AND dm.Ma_danh_muc_cha=2 ORDER BY dmc.Do_uu_tien ASC
END

--Test: Exec getProductMenById 1
ALTER PROC getProductMenById
@Id INT
AS
BEGIN
	SELECT * 
	FROM dbo.Danhmuccha dm INNER JOIN dbo.Danhmuccon dmc ON dmc.Ma_danh_muc_cha = dm.Ma_danh_muc_cha
		INNER JOIN dbo.SanPham sp ON sp.Ma_danh_muc_con = dmc.Ma_danh_muc_con
	WHERE dm.Ma_danh_muc_cha=1 AND sp.Ma_danh_muc_con=@Id AND sp.Trang_Thai=1 
END

--Test: Exec getProductWomenById 17
CREATE PROC getProductWomenById
@Id INT
AS
BEGIN
	SELECT * 
	FROM dbo.Danhmuccha dm INNER JOIN dbo.Danhmuccon dmc ON dmc.Ma_danh_muc_cha = dm.Ma_danh_muc_cha
		INNER JOIN dbo.SanPham sp ON sp.Ma_danh_muc_con = dmc.Ma_danh_muc_con
	WHERE dm.Ma_danh_muc_cha=2 AND sp.Ma_danh_muc_con=@Id AND sp.Trang_Thai=1 
END

--Test: Exec getCart 1
CREATE PROC getCart
@Id INT
AS
BEGIN
	SELECT sp.Ma_san_pham,sp.Ten_san_pham,sp.Don_gia
	FROM dbo.SanPham sp 
	WHERE sp.Trang_Thai=1 AND sp.Ma_san_pham=@Id
END
