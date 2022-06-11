CREATE DATABASE QL
GO

USE QL
GO

create table tblQlyPhongTro( 
                maPhong char(5) primary key,
                dienTich float,
                soNguoi int,
                giaThue money,
                DoiTuongThue varchar(10),
                TinhTrang varchar(20),
                chiSoDienMoi int,
                chiSoDienCu int,
                chiSoNuocMoi int,
                chiSoNuocCu int)

create table tblKhachThue(
                maKT char(5) primary key,
                HoTen varchar(50),
                NgaySinh Date,
                NgheNghiep varchar(50),
                Gioitinh varchar(10),
                Sdt varchar(10),
                QueQuan varchar(50),
                maPhong char(5) foreign key references tblQlyPhongTro(maPhong)
                )
                

create table tblHoaDon(
                maHD char(5) primary key,
                maKT char(5) foreign key references tblKhachThue(maKT)
                on update cascade
                on delete cascade,
                maPhong char(5) foreign key references tblQlyPhongTro(maPhong)
                on update cascade
                on delete cascade,
                tgian date
                )

create table acc_admin (
                UserName varchar(30), Pass varchar(10)
                )


CREATE FUNCTION AUTO_ID
                (@x VARCHAR(3))
                RETURNS CHAR(5)
                AS
                BEGIN
                    DECLARE @ID VARCHAR(5)
                    IF @x = 'PH'
                         BEGIN
                             SELECT @ID = MAX(RIGHT(maPhong, 3)) FROM tblQlyPhongTro
                		IF (SELECT COUNT(maPhong) FROM tblQlyPhongTro) = 0
                                 SET @ID = '0'
                         END
                     IF @x = 'KH'
                         BEGIN
                		SELECT @ID = MAX(RIGHT(maKT, 3)) FROM tblKhachThue
                		IF (SELECT COUNT(maKT) FROM tblKhachThue) = 0
                                 SET @ID = '0'
                         END
                	IF @x = 'HD'
                         BEGIN
                		SELECT @ID = MAX(RIGHT(maHD, 3)) FROM tblHoaDon
                		IF (SELECT COUNT(maHD) FROM tblHoaDon) = 0
                                 SET @ID = '0'
                         END
                set @ID = @x + format(@ID+1,'D3')
                RETURN @ID
                END


ALTER TABLE tblHoaDon 
               ADD CONSTRAINT dfHD default dbo.AUTO_ID('HD') for maHD with VALUES;
ALTER TABLE tblQlyPhongTro 
                ADD CONSTRAINT dfPH default dbo.AUTO_ID('PH') for maPhong with VALUES;
ALTER TABLE tblKhachThue 
                ADD CONSTRAINT dfKH default dbo.AUTO_ID('KH') for maKT with VALUES;


INSERT INTO tblQlyPhongTro
VALUES
(default, 35,4,3000000,'Nam & Nu','Trong',5,0,0,0),
(default, 25,3,3000000,'Nam','Trong',0,0,0,0),
(default, 25,3,3000000,'Nu','Da Thue',5,0,0,0),
(default, 30,4,4000000,'Nu','Trong',5,0,0,0),
(default, 30,4,3000000,'Nu','Da Thue',5,0,0,0),
(default, 20,3,3000000,'Nam','Trong',0,0,0,0),
(default, 25,3,3000000,'Nam & Nu','Da Thue',5,0,0,0),
(default, 30,3,3000000,'Nam & Nu','Trong',0,0,0,0),
(default, 35,4,4000000,'Nam & Nu','Da Thue',5,0,0,0)


INSERT INTO tblKhachThue 
VALUES
(default, 'Nguyen Van A','2001-08-01','Sinh Vien','Nam','0917654321','Ha Noi','PH007'),
(default, 'Tran Van B','1999-05-02','Sinh Vien','Nam','0387654321','Ha Nam','PH007'),
(default, 'Le Thi C','1999-02-01','Sinh Vien','Nu','0947654321','Ha Noi','PH007'),
(default, 'Nguyen Van D','2000-03-20','Sinh Vien','Nam','0977654321','Vinh Phuc','PH009'),
(default, 'Nguyen Hoang Ke L','2002-06-30','Sinh Vien','Nam','0987654321','Ha Noi','PH009'),
(default, 'Phan Thi Thanh T','2001-06-20','Sinh Vien','Nu','0988654321','Ha Noi','PH003'),
(default, 'Tuong Thi My Ng','1999-06-12','Cong Nhan','Nu','0997654321','Ha Noi','PH005'),
(default, 'Le Thi C','2002-07-30','Sinh Vien','Nu','0987656321','Vinh Phuc','PH005'),
(default, 'Le Van D','2002-08-10','Cong Nhan','Nam','0587654321','Vinh Phuc','PH009'),
(default, 'Le Thi C','2001-12-12','Sinh Vien','Nu','0987654341','Vinh Phuc','PH003'),
(default, 'Nguyen Van Hoa','2001-01-07','Sinh Vien','Nam','0987654321','Bac Ninh','PH009')





INSERT INTO tblHoaDon 
VALUES
(default, 'KH011', 'PH009', getdate()),
(default, 'KH007', 'PH005', getdate()),
(default, 'KH002', 'PH007', '2021-04-01'),
(default, 'KH003', 'PH005', getdate())



insert into acc_admin
values ('admin', 'admin')