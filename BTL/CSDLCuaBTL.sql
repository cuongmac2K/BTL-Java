CREATE DATABASE PHANMEMTRACNGHIEM

USE PHANMEMTRACNGHIEM
GO 

CREATE TABLE TAIKHOAN(
	TenDangNhap varchar(30) PRIMARY KEY,
	MatKhau varchar(30) NOT NULL,
	LoaiTaiKhoan nvarchar(30)
)

CREATE TABLE GIANGVIEN(
	MaGV varchar(30) PRIMARY KEY,
	TenGV nvarchar(30) NOT NULL,
	TenDangNhap varchar(30) NOT NULL,
	FOREIGN KEY(TenDangNhap) REFERENCES TAIKHOAN(TenDangNhap) ON UPDATE CASCADE ON DELETE CASCADE
)

CREATE TABLE LOP(
	MaLop varchar(30) PRIMARY KEY,
	TenLop nvarchar(30) NOT NULL,
	MaGV varchar(30) NOT NULL,
	SoSV int,
	FOREIGN KEY(MaGV) REFERENCES GIANGVIEN(MaGV) ON UPDATE CASCADE ON DELETE CASCADE
)

CREATE TABLE SINHVIEN(
	MaSV varchar(30) PRIMARY KEY,
	TenSV nvarchar(30) NOT NULL,
	MaLop varchar(30) NOT NULL,
	TenDangNhap varchar(30) NOT NULL,
	FOREIGN KEY(MaLop) REFERENCES LOP(MaLop) ON UPDATE CASCADE ON DELETE CASCADE,
	FOREIGN KEY(TenDangNhap) REFERENCES TAIKHOAN(TenDangNhap)
)

CREATE TABLE BAIKIEMTRA(
	MaBKT varchar(30) PRIMARY KEY,
	MaLop varchar(30) NOT NULL,
	TenBKT nvarchar(30) NOT NULL,
	DoKho nvarchar(30) NOT NULL,
	ThoiGianLam int NOT NULL,
	HanNop datetime,
	TongSoCau int,
	FOREIGN KEY(MaLop) REFERENCES LOP(MaLop) ON UPDATE CASCADE ON DELETE CASCADE
)

CREATE TABLE CAUHOI(
	MaCH int IDENTITY(1,1) PRIMARY KEY,
	MaBKT varchar(30),
	NoiDung nvarchar(1000) NOT NULL,
	A nvarchar(1000) NOT NULL,
	B nvarchar(1000) NOT NULL,
	C nvarchar(1000) NOT NULL,
	D nvarchar(1000) NOT NULL,
	DapAn varchar(5),
	DoKho nvarchar(30) NOT NULL,
	FOREIGN KEY(MaBKT) REFERENCES BAIKIEMTRA(MaBKT) ON UPDATE CASCADE ON DELETE CASCADE
)

CREATE TABLE CT_SV_BKT(
	MaSV varchar(30),
	MaBKT varchar(30),
	Diem float,
	SoCauDung int,
	TongThoiGianLam int,
	TrangThai nvarchar(30),
	FOREIGN KEY(MaSV) REFERENCES SINHVIEN(MaSV),
	FOREIGN KEY(MaBKT) REFERENCES BAIKIEMTRA(MaBKT) ON UPDATE CASCADE ON DELETE CASCADE,
	PRIMARY KEY(MaSV, MaBKT)
)
GO

INSERT INTO TAIKHOAN VALUES('GiangVien1', '123456', N'Giảng viên')
INSERT INTO TAIKHOAN VALUES('GiangVien2', '123456', N'Giảng viên')
INSERT INTO TAIKHOAN VALUES('SinhVien1', '123456', N'Sinh viên')
INSERT INTO TAIKHOAN VALUES('SinhVien2', '123456', N'Sinh viên')
INSERT INTO TAIKHOAN VALUES('SinhVien3', '123456', N'Sinh viên')

INSERT INTO GIANGVIEN VALUES('GV1', N'Nguyễn Văn A', 'GiangVien1')
INSERT INTO GIANGVIEN VALUES('GV2', N'Nguyễn Văn B', 'GiangVien2')

INSERT INTO LOP VALUES('L1', 'CNTT1', 'GV1', 2)
INSERT INTO LOP VALUES('L2', 'CNTT2', 'GV2', 1)

INSERT INTO SINHVIEN VALUES('SV1', N'Trần Văn A', 'L1', 'SinhVien1')
INSERT INTO SINHVIEN VALUES('SV2', N'Trần Văn B', 'L1', 'SinhVien2')
INSERT INTO SINHVIEN VALUES('SV3', N'Trần Văn C', 'L2', 'SinhVien3')

INSERT INTO BAIKIEMTRA VALUES('BKT1', 'L1', 'So 1', N'Dễ 50', 15, '05-26-2021', 10)

INSERT INTO CT_SV_BKT VALUES('SV1', 'BKT1', 9, 9, 10, N'Hoàn thành')
INSERT INTO CT_SV_BKT VALUES('SV2', 'BKT1', 5, 5, 3, N'Hoàn thành')
GO

SELECT *FROM TAIKHOAN
SELECT *FROM GIANGVIEN
SELECT *FROM LOP
SELECT *FROM SINHVIEN
SELECT *FROM BAIKIEMTRA
SELECT *FROM CT_SV_BKT
SELECT *FROM CAUHOI



INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Quá trình tiến hóa của phần mềm được chia thành mấy giai đoạn ?', N'2', N'4', N'5', N'6', 'B', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Đâu là đặc trưng của phần mềm ?', N'Phần mềm là hệ thống vật lý, không phải hệ thống logic', N'Được phát triển mà biết trước được hiệu quả và giá thành cụ thể', N'Phần mềm là hệ thống logic, không phải hệ thống vật lý', N'Cả 3 đáp án trên', 'C', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Phần mềm được thể hiện với các bộ phận cấu thành, đó là: ', N'Tập lệnh, các tài kĩ thuật liên quan', N'Tập lệnh cấu trúc dữ liệu', N'Tập lệnh, cấu trúc dữ liệu và các tài liệu liên quan', N'Cấu trúc dữ liệu và các tài liệu liên quan', 'C', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Đâu là đặc điểm của phần mềm hệ thống theo lĩnh vực ứng dụng', N'Xử lý cấu trúc thông tin phức tạp, nhưng chính xác', N'Đặc trưng bởi sự tương tác chủ yếu với phần cứng máy tính', N'Cấu trúc dữ liệu phức tạp và nhiều giao diện', N'Cả 3 đáp án trên', 'D', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Đặc trưng thời kỳ những năm 1960 đến giữa những năm 1970', N'Hệ thống thời gian thực', N'Phát triển mạng toàn cục và cục bộ, truyển thông tin hiệu số giải phóng cao', N'Các hệ thống đa nhiệm, đa người dùng', N'A và C', 'D', N'Khó')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Phân loại theo vai trò chức năng thì phần mềm hệ thống gồm', N'Hệ điều hành', N'Phần mềm đóng gói', N'Các hệ tiện ích hệ thống', N'A và C đều đúng', 'D', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Có mấy cách để phân loại phần mềm', N'3', N'4', N'5', N'6', 'A', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Câu: "Mềm dẻo, có khả năng thích nghi cho việc phát triển tiếp". xuất hiện ở mục nào', N'Kiến trúc phần mềm', N'Phần loại phần mềm', N'Đặc trưng phần mềm', N'Tiêu chuẩn phần mềm', 'D', N'Khó')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Quá trình từ khi quyết định sản phẩm sản xuất phầm mềm cho đến khi chuyển giao cho khách hàng là gì', N'Bảo trì', N'Sử dụng phần mềm', N'Loại bỏ phần mềm', N'Phát triển phần mềm', 'D', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Đâu là những thách thức cho phát triển phần mềm', N'Sự tăng quy mô, chi phí', N'Sự kéo dài thời gian và sự phụ thuộc nhiều vào kinh nghiệm', N'Chất lượng sản phẩm không ổn định, gánh nặng bảo trì hệ thống cũ', N'Cả 3 đáp án trên', 'D', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Có mấy nguyên nhân dẫn đến những thách thức đối với phát triển phần mềm hiện nay', N'2', N'3', N'4', N'5', 'C', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Phần mềm nào sau đây là phần mềm được phân loại theo vai trò - chức năng', N'Phần mềm công cụ', N'Phần mềm nghiệp vụ', N'PHần mềm máy tính cá nhân', N'Phần mềm thời gian thực', 'A', N'Khó')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Những yếu tố nào chủ chốt trong kỹ nghệ phần mềm', N'Phương pháp', N'Công cụ', N'Thủ tục', N'Cả 3 đáp án trên', 'D', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Có mấy tiêu chí để đánh giá tiêu chuẩn phần mềm tốt', N'5', N'6', N'7', N'8', 'D', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Thách thức đối với phát triển phần mềm là gì ?', N'Sự tăng quy mô của phần mềm', N'Sự tăng chi phí làm phần mềm', N'Chất lượng của phần mềm không ổn định', N'Cả 3 đáp án trên', 'D', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Phần mềm được thể hiện với những bộ phận cấu thành nào ?', N'Tập các lệnh', N'Cấu trúc dữ liệu', N'Các tài liệu kỹ thuật liên quan', N'Cả 3 đáp án trên', 'D', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Quy trình phần mềm là gì ?', N'Là một tập hợp các hoạt động nhằm xây dựng phần mềm', N'Là một tập các hoạt động nhằm phát triển phần mềm', N'Là một tập các hoạt động nhằm xây dựng và phát triển phần mềm', N'Là tập hợp các hoạt động sản xuất phần mềm', 'C', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Phần mềm theo nghĩa hẹp là một tập hợp các ... được viết theo nghôn ngữ lập trình để giải quyết bài toán. Điền vào dấu ... ?', N'Chương trình', N'Công nghệ', N'Câu lệnh', N'Công cụ', 'C', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Mô hình thác nước gồm bao nhiêu pha', N'3', N'4', N'5', N'6', 'C', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Mô hình nào không thuộc mô hình tiến hóa', N'Mô hình bản mẫu', N'Mô hình xoắn ốc', N'Mô hình thác nước', N'A và B đều đúng', 'C', N'Khó')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Ý nào sau đây không phải là ưu điểm của phương pháp hướng chức năng', N'Cho phép quản lý dữ liệu tập trung nhất quán', N'Làm giảm sự phức tạp', N'Hướng tương lai cho phép dễ thay đổi (Bảo trì)', N'Chuẩn hóa tạo ra sự độc lập, giảm bớt tính nghệ thuật', 'A', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Ca thiết kế của mô hình thác nước có mấy giai đoạn', N'1', N'2', N'3', N'4', 'A', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Mô hình bản mẫu có mấy phương pháp và dạng', N'2 phương pháp và 2 dạng', N'2 phương pháp và 1 dạng', N'3 phương pháp và 3 dạng', N'2 phương pháp và 3 dạng', 'D', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Sự kế thừa và bao đóng gói thông tin là ý tưởng của phương pháp nào', N'Hướng đối tượng', N'Hướng chức năng', N'Hướng dữ liệu', N'Hướng tiến trình', 'A', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Mô hình xoắn ốc có bao nhiêu bước hoạt động chính', N'4', N'5', N'6', N'7', 'A', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Phát triển nào đúng nhất về phương pháp định hướng tiến trình', N'Ra đời sớm khi máy tính còn chậm', N'Việc xử lý chỉ tập trung vào hiệu quả', N'Chỉ tập trung vào tiến trình và yêu cầu tự đọng hóa tiến trình', N'Cả 3 đáp án trên', 'D', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Mô hình thác nước do Royee đề xuất vào năm nào', N'1970', N'1960', N'1956', N'1975', 'A', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Mô hình RUP có mấy đặc trưng', N'4', N'3', N'9', N'2', 'B', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Đâu KHÔNG phải là ưu điểm của phương pháp hướng chức năng', N'Làm giảm sự phức tạp và tập trung vào ý tưởng', N'Chuẩn hóa tạo ra sự độc lập', N'Dễ dàng tạo áp dụng các công cụ toán học để xử lý', N'Giảm bớt tính nghệ thuật trong thiết kế', 'C', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Có bao nhiêu loại CASE', N'2 loại', N'3 loại', N'4 loại', N'5 loại', 'A', N'Dễ')

INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Các yêu cầu của hệ thống thường được chia làm mấy loại', N'2', N'3', N'4', N'5', 'B', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Có mấy vấn đề liên quan đến miền úng dụng', N'2', N'3', N'4', N'5', 'A', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Ngôn ngữ tự nhiên thường gặp phải một số vấn đề gì', N'Không rõ ràng', N'Thiếu khả năng Modul hóa', N'Quá mềm dẻo', N'Tất cả các đáp án trên', 'D', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Tài liệu đặc tả yêu cầu theo chuẩn IEEE/ANSI 830-1993 đưa ra cấu trúc gồm mấy thành phần', N'2', N'3', N'4', N'5', 'B', N'Khó')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Phương pháp thường được sử dụng để đặc tả yêu cầu hệ thống là ', N'Ngôn ngữ hướng cấu trúc', N'Đặc tả biểu mẫu', N'Ngôn ngữ trình tự', N'Ngôn ngữ tự nhiên', 'D', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Yêu cầu chức năng có mấy đặc điểm', N'1', N'2', N'3', N'4', 'B', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Yêu cầu phi chức năng được phân loại thành mấy yêu cầu nhỏ', N'1', N'2', N'3', N'4', 'C', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Đặc điểm nào sau đây là chính xác nhất của yêu cầu chức năng', N'Tính mật mờ', N'Tính hoàn thiền và nhất quán', N'Tính mập mờ không rõ ràng của hệ thống; tính hoàn thiện và nhất quán', N'Tính rõ rang của hệ thống, tính hoàn thiện và nhất quán', 'C', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Heniger đã đưa ra mấy yêu cầu của một tài liệu Yêu cầu phần mềm', N'4', N'5', N'6', N'Không có đáp án', 'C', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Trong các yêu cầu sau, yêu cầu nào KHÔNG PHẢI do Heniger đưa ra ', N'Chỉ mô tả các hoạt đông của hệ thống từ bên ngoài', N'Chỉ đưa ra các rảng buộc của hệ thống trong quá trình vận hành', N'Khó thay đổi', N'Dự đoán được vòng đời của hệ thống', 'C', N'Khó')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Ưu điểm của phương pháp đặc tả bằng ngôn ngữ hướng cấu trúc', N'Ngắn gọn', N'Đạt được mức độ diễn tả cao nhất của ngôn ngữ tự nhiên', N'Dễ hiểu', N'Cả A, B, C đều sai', 'C', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Mục tiêu của quy trình xác định yêu cầu là', N'Xác định được yêu cầu của hệ thống đang xây dựng', N'Đưa ra các yêu cầu của hệ thống', N'Tìm hiểu cách xây dựng phần mềm', N'Xác định yêu cầu của phần mềm để từ đó xây dựng', 'B', N'Khó')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Quy trình xác định yêu cầu có mấy giai đoạn', N'1', N'2', N'3', N'4', 'D', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Mô hình thường được sử dụng để xác định yêu cầu', N'Mô hình RUP', N'Mô hình hướng thành phần', N'Mô hình Xoắn ốc', N'Mô hình làm bản mẫu', 'C', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Có bao nhiêu hoạt động chung 1 tiến trình', N'3', N'4', N'5', N'6', 'D', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Khi phần tích tính khả thi ta thường tập trung vào các mặt', N'Kinh tế, kỹ thuật, hoạt động', N'Kỹ thuật, thời gian, pháp lý', N'Kinh tế, kỹ thuật, thời gian, pháp lý, hoạt động', N'Tất cả đều sai', 'C', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Nghiên cứu tính khả thi có các phương án nào', N'Rất thấp - Thấp - Trung bình', N'Thấp - Trung bình - Cao', N'Trung bình - Cao - Rất cao', N'Tuyệt đối', 'B', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Có mấy khó khăn khi Phát triển và phân tích yêu cầu', N'1', N'2', N'3', N'4', 'D', N'Khó')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Có bao nhiêu kỹ thuật phân tích yêu cầu', N'1', N'2', N'3', N'4', 'C', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Tiếp cận định hướng cách nhìn có mấy góc độ', N'2', N'3', N'4', N'5', 'B', N'Dễ')

INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Đâu là vai trò của thiết kế phần mềm', N'Làm cơ sở cho việc triển khai phần mềm', N'Quản lý rủi ro hiệu quả', N'Bảo trì hệ thống', N'Tất cả đều đúng', 'C', N'Khó')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Ý nào sau đây không có trong triển khai thiết kế', N'Tiến trình thiết kế', N'Các hoạt động và sản phẩm thiết kế', N'Biểu diễn thiết kế', N'Ý tưởng thiết kế', 'D', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Có những phương tiếp cận phổ biến nào cho phát triển hệ thống phần mềm', N'Tiếp cận định hướng cấu trúc', N'Tiếp cận định hướng đối tượng', N'A và B đều đúng', N'A Và B đều sai', 'C', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Chất lượng thiết kế gồm mấy hướng dẫn và nguyên lý', N'5 hướng dẫn và 9 nguyên lý', N'7 hướng dẫn và 9 nguyên lý', N'6 hướng dẫn và 6 nguyên lý', N'5 hướng dẫn và 7 nguyên lý', 'A', N'Khó')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Có những dạng trừu tượng nào trong thiết kế', N'Trừu tượng thủ tục', N'Trừu tượng dữ liệu', N'Trừu tượng điều khiển', N'Cả 3 đáp án trên', 'D', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Mô hình kiến trúc thường được nhìn nhận dưới mấy mặt', N'3', N'4', N'5', N'6', 'B', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Có bao nhiêu loại ghép nối trong thiết kế', N'4', N'5', N'6', N'7', 'B', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Thiết kế phần mềm theo hướng chức năng được chia làm mấy tiến trình', N'3', N'5', N'4', N'2', 'D', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Kiến trúc phần mềm chỉ một ... và qua đó cung cấp một sự tích hợp chặt chẽ về mặt khái niệm của hệ thống', N'Cấu trúc phần mềm', N'Cấu trúc phần cứng', N'Phần mềm', N'Phần cứng', 'A', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Class trong UML được biểu diễn như thế nào', N'Hình tròn có tên và thuộc tính', N'Hình vuông có tên thuộc tính và phương thức', N'Hình vuông có tên và thuộc tính', N'Hình tam giác', 'B', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Thiết kế dữ liệu gồm các bước', N'Thiết kế dữ liệu logic và thiết kế dữ liệu vật lý', N'Thiết kế dữ liệu vật lý và modul', N'Thiết kế modul và logic', N'Tất cả đều sai', '', N'Khó')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Hệ thống thời gian thực có bao nhiêu kích thích', N'1', N'2', N'3', N'4', '2', N'Dễ')
INSERT INTO CAUHOI(NoiDung, A, B, C, D, DapAn, DoKho) VALUES(N'Thiết kế xử lý gồm bao nhiêu bước', N'2', N'5', N'6', N'4', 'A', N'Dễ')



SELECT * FROM Lop INNER JOIN GIANGVIEN ON Lop.MaGV = GIANGVIEN.MaGV
WHERE LOP.MaGV = 'GV'
SELECT * FROM LOP INNER JOIN GIANGVIEN ON Lop.MaGV = GIANGVIEN.MaGV
WHERE LOP.MaGV = 'GV'

SELECT * FROM LOP INNER JOIN GIANGVIEN ON LOP.MaGV = GIANGVIEN.MaGV 
WHERE GIANGVIEN.MaGV = 'GV'