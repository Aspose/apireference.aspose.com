---
title: Class PdfSaveOptions
second_title: Aspose.Page untuk Referensi .NET API
description: Aspose.Page.EPS.Device.PdfSaveOptions kelas. Kelas ini berisi input dan output stream dan opsi lain yang diperlukan untuk mengelola proses konversi.
type: docs
weight: 70
url: /id/net/aspose.page.eps.device/pdfsaveoptions/
---
## PdfSaveOptions class

Kelas ini berisi input dan output stream dan opsi lain yang diperlukan untuk mengelola proses konversi.

```csharp
public class PdfSaveOptions : SaveOptions
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [PdfSaveOptions](pdfsaveoptions/#constructor)() | Menginisialisasi instance baru dari`PdfSaveOptions` kelas dengan nilai default untuk flag!:SuppressErrors (benar) dan!:Debug (salah). |
| [PdfSaveOptions](pdfsaveoptions/#constructor_1)(bool) | Menginisialisasi instance baru dari`PdfSaveOptions` kelas dengan nilai default untuk bendera!:Debug (salah). |

## Properti

| Nama | Keterangan |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | Menentukan folder tambahan tempat konverter harus menemukan font untuk dokumen input. Folder default adalah folder font standar tempat OS menemukan font untuk kebutuhan internal. |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | Menentukan apakah informasi debug harus dicetak ke aliran keluaran standar atau tidak. |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | Mengembalikan daftar kesalahan konversi yang ditekan Jika!:SuppressErrors benar. |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | Kategori Kualitas menentukan tingkat kompresi untuk suatu gambar. Nilai yang tersedia adalah 0 hingga 100. Semakin rendah angka yang ditentukan, semakin tinggi kompresinya dan karenanya semakin rendah kualitas gambarnya. Nilai 0 menghasilkan kualitas gambar terendah, sedangkan 100 menghasilkan kualitas tertinggi. |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | Menentukan apakah kesalahan harus ditekan atau tidak. Jika kesalahan yang benar-benar ditekan ditambahkan ke[`Exceptions`](../../aspose.page/saveoptions/exceptions/) list. Jika salah, kesalahan pertama akan menghentikan program. |

### Lihat juga

* class [SaveOptions](../../aspose.page/saveoptions/)
* ruang nama [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* perakitan [Aspose.Page](../../)


