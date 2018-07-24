--Test: Exec Pagination 2
ALTER PROC Pagination
--Đang ở trang thứ bao nhiêu
@PageIndex INT
--Số bản ghi tối đa trên 1 trang
AS
BEGIN
--Xác định hiển thị từ x-> y
	DECLARE @FromIndex INT , @ToIndex INT
	SET @FromIndex=(@PageIndex-1)*2+1
	SET @ToIndex=@PageIndex*2

	SELECT * 
	FROM(SELECT p.Ma_san_pham,p.Ten_san_pham,p.Hinh_anh,p.Don_gia,
	ROW_NUMBER() OVER(ORDER BY p.Ma_san_pham ASC) AS RowIndex
	FROM dbo.SanPham p) 
	AS tblDemo
	WHERE  tblDemo.RowIndex BETWEEN @FromIndex AND @ToIndex
END

--lấy sản phẩm nam
ALTER PROC getProductMen
AS
BEGIN
	SELECT TOP 8 * FROM dbo.SanPham sp INNER JOIN dbo.Danhmuccon dmc ON dmc.Ma_danh_muc_con = sp.Ma_danh_muc_con
		INNER JOIN dbo.Danhmuccha dm ON dm.Ma_danh_muc_cha = dmc.Ma_danh_muc_cha
	WHERE dm.Ma_danh_muc_cha=1 AND sp.Trang_Thai=1 ORDER BY sp.Ngay_Nhap DESC
END

--Lấy sản phẩm nữ
ALTER PROC getProductWomen
AS
BEGIN
	SELECT TOP 8 * FROM dbo.SanPham sp INNER JOIN dbo.Danhmuccon dmc ON dmc.Ma_danh_muc_con = sp.Ma_danh_muc_con
		INNER JOIN dbo.Danhmuccha dm ON dm.Ma_danh_muc_cha = dmc.Ma_danh_muc_cha
		WHERE dm.Ma_danh_muc_cha=2 AND sp.Trang_Thai=1 ORDER BY sp.Ngay_Nhap DESC
END

--Lấy cặp
ALTER PROC getProductBag
AS
BEGIN
	SELECT TOP 8 * FROM dbo.SanPham sp INNER JOIN dbo.Danhmuccon dmc ON dmc.Ma_danh_muc_con = sp.Ma_danh_muc_con
		INNER JOIN dbo.Danhmuccha dm ON dm.Ma_danh_muc_cha = dmc.Ma_danh_muc_cha
		WHERE dm.Ma_danh_muc_cha=3 AND sp.Trang_Thai=1 ORDER BY sp.Ngay_Nhap DESC
END

--Lấy Giầy
ALTER PROC getProductFootwear
AS
BEGIN
	SELECT TOP 8 * FROM dbo.SanPham sp INNER JOIN dbo.Danhmuccon dmc ON dmc.Ma_danh_muc_con = sp.Ma_danh_muc_con
		INNER JOIN dbo.Danhmuccha dm ON dm.Ma_danh_muc_cha = dmc.Ma_danh_muc_cha
		WHERE dm.Ma_danh_muc_cha=4 AND sp.Trang_Thai=1 ORDER BY sp.Ngay_Nhap DESC
END

--Lấy tên danh mục con của nam
CREATE PROC GetBannerParentMen
AS
BEGIN
	SELECT *
	FROM dbo.Danhmuccha dm INNER JOIN dbo.Danhmuccon dmc ON dmc.Ma_danh_muc_cha = dm.Ma_danh_muc_cha	
	WHERE dmc.Trang_thai=1 AND dm.Ma_danh_muc_cha=1 ORDER BY dmc.Do_uu_tien ASC
END

--Lấy tên danh mục con của nữ
CREATE PROC GetBannerParentWomen
AS
BEGIN
	SELECT *
	FROM dbo.Danhmuccha dm INNER JOIN dbo.Danhmuccon dmc ON dmc.Ma_danh_muc_cha = dm.Ma_danh_muc_cha	
	WHERE dmc.Trang_thai=1 AND dm.Ma_danh_muc_cha=2 ORDER BY dmc.Do_uu_tien ASC
END

--lấy sản phẩm theo id
--Test: Exec getProductById 2
CREATE PROC getProductById
@Id INT
AS
BEGIN
	SELECT * FROM dbo.SanPham sp WHERE sp.Ma_san_pham=@Id AND sp.Trang_Thai=1
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

--Lấy danh sách admin
CREATE PROC getAdmin
AS
BEGIN
	SELECT * FROM dbo.Khach_hang kh WHERE kh.Quyen_truy_cap=1
END

--Lấy danh sách user
CREATE PROC getUser
AS
BEGIN
	SELECT * FROM dbo.Khach_hang kh WHERE kh.Quyen_truy_cap=2
END

--Xóa sản phẩm
CREATE procedure DeleteProduct
@productId varchar(50)
AS
BEGIN
	DELETE dbo.SanPham
	WHERE Ma_san_pham=@productId
END

--Tạo sản phẩm mới
Create procedure InsertProdcut
@madmc int,
@nameProduct NVARCHAR(50),
@image VARCHAR(100),
@inputdate DATE,
@imageid INT,
@quantity INT,
@mota TEXT,
@price FLOAT,
@saleid INT,
@view INT,
@suppliersid INT,
@trangthai BIT
as
BEGIN
	insert into Product
	values(@madmc ,@nameProduct ,@image ,@inputdate ,@imageid ,@quantity ,@mota ,@price ,@saleid ,@view ,@suppliersid ,@trangthai );
END

--Sửa sản phẩm
CREATE PROC UpdateProduct
@productId varchar(50),
@madmc int,
@nameProduct NVARCHAR(50),
@image VARCHAR(100),
@inputdate DATE,
@imageid INT,
@quantity INT,
@mota TEXT,
@price FLOAT,
@saleid INT,
@view INT,
@suppliersid INT,
@trangthai BIT
AS
BEGIN
	UPDATE dbo.SanPham
	SET Ma_danh_muc_con=@madmc,
		Ten_san_pham =@nameProduct,
	Hinh_anh=@image,
	Ngay_Nhap=@inputdate,
	Ma_hinh_anh =@imageid,
	So_luong=@quantity,
	Mo_ta=@mota,
	Don_gia =@price,
	Ma_Giam_Gia=@saleid,
	Luot_xem=@view,
	Ma_nha_cung_cap=@suppliersid,
	Trang_Thai=@trangthai
	WHERE Ma_san_pham=@productId
END

CREATE PROCEDURE [dbo].[SP_DisplayPageNo]
	@CurrentPage int ,
	@PageSize int,
	@table nvarchar(200),
	@actionName nvarchar(100),
	@sql nvarchar(4000) OUTPUT
AS
BEGIN
	--Khai báo và lấy tổng số bản ghi lấy về
	DECLARE @TotalRecord int;
	DECLARE @sqlString nvarchar(200);
	SET @sqlString = N'SELECT @TotalRecord=Count(*) FROM '+@table;
	EXECUTE sp_executesql @sqlString,N'@TotalRecord int out',@TotalRecord out;

	--Khai báo và set tổng số trang cần phân ra dựa vào tổng số bản ghi và số bản ghi trên 1 trang
	DECLARE @TotalPage int;
	IF @TotalRecord%@PageSize>0
		SET @TotalPage=(@TotalRecord/@PageSize)+1;
	ELSE
		SET @TotalPage=@TotalRecord/@PageSize;

	--Xử lý trường hợp nếu trang đang chọn truyền vào nhỏ hơn 1
	IF @CurrentPage<1
		SET @CurrentPage=1;

	--Xử lý trường hợp nếu trang đang chọn truyền vào lớn hơn tổng số trang được chia
	IF @CurrentPage>@TotalPage
		SET @CurrentPage=@TotalPage

	--Set nội dung cho link phân trang
	SET @sql='Trang: '
		IF @CurrentPage>1
		BEGIN
			SET @sql=@sql+ N' <a href="'+@actionName+'?page=1" title="Trang đầu">&lt;&lt;</a>'
			SET @sql=@sql+ ' <a href="'+@actionName+'?page='+ Cast((@CurrentPage-1) AS
			NVARCHAR(4))+N'" title="Trang trước">&lt;</a>'
		END
	DECLARE @i int
	SET @i=1
	WHILE @i<=@TotalPage
	BEGIN
		IF @i=@CurrentPage
			SET @sql=@sql+'['+Cast(Cast(@i AS int) AS nvarchar(4))+'] '
		ELSE
			SET @sql=@sql+' <a href="'+@actionName+'?page='+Cast(@i AS nvarchar(4))+'">'+Cast(@i AS nvarchar(4))+'</a> '
		SET @i=@i+1
	END

	IF @CurrentPage<@TotalPage
	BEGIN
		SET @sql=@sql+ N' <a href="'+@actionName+'?page='+Cast((@CurrentPage+1) AS
		NVARCHAR(4))+N'" title="Trang sau">&gt;</a>'
		SET @sql=@sql+ N' <a href="'+@actionName+'?page='+cast(@TotalPage AS nvarchar(6))+ N'"title="Trang cuối">&gt;&gt;</a>'
	END
	SELECT @sql AS Paging
END


CREATE PROCEDURE [dbo].[SP_Paging]
	@CurrentPage int,
	@PageSize int,
	@table nvarchar(200),
	@tableId nvarchar(100)
AS
Begin
	-- Tính tổng số bản ghi
	DECLARE @TotalRecord int, @TotalPage INT
    
	--khai bao cau lenh va thuc thi cau lenh lay tong so ban ghi cua bang can phan trang
	DECLARE @SqlString nvarchar(500);
	DECLARE @SqlString1 nvarchar(500);
		SET @SqlString = N'SELECT @TotalRecord=Count(*) FROM '+@table;
		EXECUTE sp_executesql @SqlString,N'@TotalRecord int out',@TotalRecord out;

	-- Tính tổng số trang
	IF @TotalRecord%@PageSize>0
		SET @TotalPage=(@TotalRecord/@PageSize)+1
	ELSE
		SET @TotalPage=@TotalRecord/@PageSize

	--Xử lý trường hợp @CurrentPage<1
	IF @CurrentPage<1
	SET @CurrentPage=1

	--Xử lý trường hợp @CurrentPage>@Tolal
	IF @CurrentPage>@TotalPage
		SET @CurrentPage=@TotalPage

	--Xử lý lấy dữ liệu của trang hiện tại
		SET @SqlString1 = 'Begin WITH temp AS (SELECT ROW_NUMBER() OVER(ORDER BY
		'+@tableId+') AS RowNum, * FROM '+@table+') Select * From temp Where RowNum Between
		('+CAST(@CurrentPage AS nvarchar(10))+' - 1)*'+CAST(@PageSize AS nvarchar(10))+'+1 AND
		'+CAST(@CurrentPage AS nvarchar(10))+'*'+CAST(@PageSize AS nvarchar(10))+' END;'
		 execute sp_executesql @SqlString1;
END
