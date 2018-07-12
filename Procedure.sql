CREATE PROC 
AS
BEGIN
		
END

CREATE PROC getProductMen
AS
BEGIN
	SELECT * FROM dbo.SanPham sp INNER JOIN dbo.Danhmuccon dmc ON dmc.Ma_danh_muc_con = sp.Ma_danh_muc_con
		INNER JOIN dbo.Danhmuccha dm ON dm.Ma_danh_muc_cha = dmc.Ma_danh_muc_cha
		
END

CREATE PROC getProductWomen
AS
BEGIN
	SELECT * FROM dbo.SanPham sp INNER JOIN dbo.Danhmuccon dmc ON dmc.Ma_danh_muc_con = sp.Ma_danh_muc_con
		INNER JOIN dbo.Danhmuccha dm ON dm.Ma_danh_muc_cha = dmc.Ma_danh_muc_cha
		WHERE sp.Trang_Thai=1 AND dmc.Ma_danh_muc_cha=2
END

CREATE PROC getProductBag
AS
BEGIN
	SELECT * FROM dbo.SanPham sp INNER JOIN dbo.Danhmuccon dmc ON dmc.Ma_danh_muc_con = sp.Ma_danh_muc_con
		INNER JOIN dbo.Danhmuccha dm ON dm.Ma_danh_muc_cha = dmc.Ma_danh_muc_cha
		WHERE sp.Trang_Thai=1 AND dmc.Ma_danh_muc_cha=3
END

CREATE PROC getProductFootwear
AS
BEGIN
	SELECT * FROM dbo.SanPham sp INNER JOIN dbo.Danhmuccon dmc ON dmc.Ma_danh_muc_con = sp.Ma_danh_muc_con
		INNER JOIN dbo.Danhmuccha dm ON dm.Ma_danh_muc_cha = dmc.Ma_danh_muc_cha
		WHERE sp.Trang_Thai=1 AND dmc.Ma_danh_muc_cha=4
END

