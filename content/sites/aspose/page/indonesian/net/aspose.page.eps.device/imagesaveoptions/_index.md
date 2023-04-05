---
title: Class ImageSaveOptions
second_title: Aspose.Page untuk Referensi .NET API
description: Aspose.Page.EPS.Device.ImageSaveOptions kelas. Kelas ini berisi opsi yang diperlukan untuk mengelola proses penyimpanan gambar.
type: docs
weight: 50
url: /id/net/aspose.page.eps.device/imagesaveoptions/
---
## ImageSaveOptions class

Kelas ini berisi opsi yang diperlukan untuk mengelola proses penyimpanan gambar.

```csharp
public class ImageSaveOptions : SaveOptions
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [ImageSaveOptions](imagesaveoptions/#constructor)() | Menginisialisasi instance baru dari`ImageSaveOptions` kelas dengan nilai default untuk flag!:SuppressErrors (benar) dan!:Debug (salah). |
| [ImageSaveOptions](imagesaveoptions/#constructor_1)(bool) | Menginisialisasi instance baru dari`ImageSaveOptions` with nilai default untuk bendera!:Debug (salah). |

## Properti

| Nama | Keterangan |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | Menentukan folder tambahan tempat konverter harus menemukan font untuk dokumen input. Folder default adalah folder font standar tempat OS menemukan font untuk kebutuhan internal. |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | Menentukan apakah informasi debug harus dicetak ke aliran keluaran standar atau tidak. |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | Mengembalikan daftar kesalahan konversi yang ditekan Jika!:SuppressErrors benar. |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | Kategori Kualitas menentukan tingkat kompresi untuk suatu gambar. Nilai yang tersedia adalah 0 hingga 100. Semakin rendah angka yang ditentukan, semakin tinggi kompresinya dan karenanya semakin rendah kualitas gambarnya. Nilai 0 menghasilkan kualitas gambar terendah, sedangkan 100 menghasilkan kualitas tertinggi. |
| [Resolution](../../aspose.page.eps.device/imagesaveoptions/resolution/) { get; set; } | Mendapat/mengatur resolusi gambar. |
| [SmoothingMode](../../aspose.page.eps.device/imagesaveoptions/smoothingmode/) { get; set; } | Mendapat/mengatur mode smoothing untuk merender gambar. |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | Menentukan apakah kesalahan harus ditekan atau tidak. Jika kesalahan yang benar-benar ditekan ditambahkan ke[`Exceptions`](../../aspose.page/saveoptions/exceptions/) list. Jika salah, kesalahan pertama akan menghentikan program. |

### Lihat juga

* class [SaveOptions](../../aspose.page/saveoptions/)
* ruang nama [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* perakitan [Aspose.Page](../../)


