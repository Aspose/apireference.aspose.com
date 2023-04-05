---
title: Class PdfSaveOptions
second_title: Aspose.Page untuk Referensi .NET API
description: Aspose.Page.XPS.Presentation.Pdf.PdfSaveOptions kelas. Kelas untuk opsi penyimpanan XPSasPDF.
type: docs
weight: 440
url: /id/net/aspose.page.xps.presentation.pdf/pdfsaveoptions/
---
## PdfSaveOptions class

Kelas untuk opsi penyimpanan XPS-as-PDF.

```csharp
public class PdfSaveOptions : SaveOptions
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [PdfSaveOptions](pdfsaveoptions/)() | Membuat instance opsi baru. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | Menentukan folder tambahan tempat konverter harus menemukan font untuk dokumen input. Folder default adalah folder font standar tempat OS menemukan font untuk kebutuhan internal. |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | Menentukan apakah informasi debug harus dicetak ke aliran keluaran standar atau tidak. |
| [EncryptionDetails](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/encryptiondetails/) { get; set; } | Mendapat atau menyetel detail enkripsi. Jika tidak disetel, enkripsi tidak akan dilakukan. |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | Mengembalikan daftar kesalahan konversi yang ditekan Jika!:SuppressErrors benar. |
| [ImageCompression](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/imagecompression/) { get; set; } | Menentukan jenis kompresi yang akan digunakan untuk semua gambar dalam dokumen. Standarnya adalahAuto . |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | Kategori Kualitas menentukan tingkat kompresi untuk suatu gambar. Nilai yang tersedia adalah 0 hingga 100. Semakin rendah angka yang ditentukan, semakin tinggi kompresinya dan karenanya semakin rendah kualitas gambarnya. Nilai 0 menghasilkan kualitas gambar terendah, sedangkan 100 menghasilkan kualitas tertinggi. |
| [OutlineTreeExpansionLevel](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/outlinetreeexpansionlevel/) { get; set; } | Menentukan sampai tingkat mana kerangka dokumen harus diperluas saat file PDF dibuka di penampil. 1 - hanya item kerangka tingkat pertama yang ditampilkan, 2 - hanya item kerangka tingkat pertama dan kedua yang ditampilkan, dan seterusnya. Standarnya adalah 1. |
| [OutlineTreeHeight](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/outlinetreeheight/) { get; set; } | Menentukan tinggi pohon kerangka dokumen yang akan disimpan. 0 - pohon kerangka tidak akan dikonversi, 1 - hanya item kerangka tingkat pertama yang akan dikonversi, dan seterusnya. Standarnya adalah 10. |
| [PageNumbers](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/pagenumbers/) { get; set; } | Mendapat/mengatur larik jumlah halaman yang akan dikonversi. |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | Menentukan apakah kesalahan harus ditekan atau tidak. Jika kesalahan yang benar-benar ditekan ditambahkan ke[`Exceptions`](../../aspose.page/saveoptions/exceptions/) list. Jika salah, kesalahan pertama akan menghentikan program. |
| [TextCompression](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/textcompression/) { get; set; } | Menentukan jenis kompresi yang akan digunakan untuk semua aliran konten kecuali gambar. Standarnya adalahFlate . |

### Lihat juga

* class [SaveOptions](../../aspose.page/saveoptions/)
* ruang nama [Aspose.Page.XPS.Presentation.Pdf](../../aspose.page.xps.presentation.pdf/)
* perakitan [Aspose.Page](../../)


