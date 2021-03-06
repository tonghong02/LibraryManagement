USE [Quan_Ly_Thu_Vien]
GO
/****** Object:  Table [dbo].[DocGia]    Script Date: 11/29/2016 19:51:30 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DocGia](
	[MaDG] [nchar](8) NOT NULL,
	[TenDG] [nvarchar](50) NOT NULL,
	[HanSuDung] [date] NULL,
	[NgaySinh] [date] NULL,
	[DiaChi] [nvarchar](50) NULL,
	[SoDienThoai] [nchar](11) NULL,
	[GioiTinh] [nchar](10) NOT NULL,
 CONSTRAINT [PK__DocGia__272586607F60ED59] PRIMARY KEY CLUSTERED 
(
	[MaDG] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Sach]    Script Date: 11/29/2016 19:51:30 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Sach](
	[MaSach] [nchar](8) NOT NULL,
	[TenSach] [nvarchar](50) NOT NULL,
	[NXB] [nvarchar](50) NOT NULL,
	[TacGia] [nvarchar](50) NOT NULL,
	[TheLoai] [nvarchar](50) NOT NULL,
	[DonGia] [float] NOT NULL,
	[SoLuong] [int] NULL,
 CONSTRAINT [pk_Sach] PRIMARY KEY CLUSTERED 
(
	[MaSach] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[MuonTra]    Script Date: 11/29/2016 19:51:30 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[MuonTra](
	[MaMuon] [int] IDENTITY(1,1) NOT NULL,
	[MaDocGiaMuon] [nchar](8) NOT NULL,
	[TenDocGiaMuon] [nvarchar](50) NULL,
	[NgayMuon] [date] NULL,
	[HanTra] [date] NULL,
	[NgayTra] [date] NULL,
	[TrangThai] [nvarchar](30) NULL,
	[TienPhat] [float] NULL,
 CONSTRAINT [PK_MuonTra_1] PRIMARY KEY CLUSTERED 
(
	[MaMuon] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ChiTietMuon]    Script Date: 11/29/2016 19:51:30 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietMuon](
	[MaMuon] [int] NOT NULL,
	[MaSachMuon] [nchar](8) NOT NULL,
 CONSTRAINT [PK_ChiTietMuon] PRIMARY KEY CLUSTERED 
(
	[MaMuon] ASC,
	[MaSachMuon] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Default [tthaii]    Script Date: 11/29/2016 19:51:30 ******/
ALTER TABLE [dbo].[MuonTra] ADD  CONSTRAINT [tthaii]  DEFAULT (N'Đang mượn') FOR [TrangThai]
GO
/****** Object:  ForeignKey [FK_ChiTietMuon_MuonTra]    Script Date: 11/29/2016 19:51:30 ******/
ALTER TABLE [dbo].[ChiTietMuon]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietMuon_MuonTra] FOREIGN KEY([MaMuon])
REFERENCES [dbo].[MuonTra] ([MaMuon])
GO
ALTER TABLE [dbo].[ChiTietMuon] CHECK CONSTRAINT [FK_ChiTietMuon_MuonTra]
GO
/****** Object:  ForeignKey [FK_ChiTietMuon_Sach]    Script Date: 11/29/2016 19:51:30 ******/
ALTER TABLE [dbo].[ChiTietMuon]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietMuon_Sach] FOREIGN KEY([MaSachMuon])
REFERENCES [dbo].[Sach] ([MaSach])
GO
ALTER TABLE [dbo].[ChiTietMuon] CHECK CONSTRAINT [FK_ChiTietMuon_Sach]
GO
/****** Object:  ForeignKey [FK_MuonTra_DocGia]    Script Date: 11/29/2016 19:51:30 ******/
ALTER TABLE [dbo].[MuonTra]  WITH CHECK ADD  CONSTRAINT [FK_MuonTra_DocGia] FOREIGN KEY([MaDocGiaMuon])
REFERENCES [dbo].[DocGia] ([MaDG])
GO
ALTER TABLE [dbo].[MuonTra] CHECK CONSTRAINT [FK_MuonTra_DocGia]
GO
