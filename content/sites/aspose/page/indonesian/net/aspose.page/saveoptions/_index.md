---
title: Class SaveOptions
second_title: Aspose.Page untuk Referensi .NET API
description: Aspose.Page.SaveOptions kelas. Kelas ini berisi opsi yang diperlukan untuk mengelola proses konversi.
type: docs
weight: 300
url: /id/net/aspose.page/saveoptions/
---
## SaveOptions class

Kelas ini berisi opsi yang diperlukan untuk mengelola proses konversi.

```csharp
public abstract class SaveOptions
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [SaveOptions](saveoptions/#constructor)() | Menginisialisasi instance baru dari`SaveOptions` kelas dengan nilai default untuk flag!:SuppressErrors (benar) dan[`Debug`](./debug/) (salah). |
| [SaveOptions](saveoptions/#constructor_1)(bool) | Menginisialisasi instance baru dari`SaveOptions` kelas dengan nilai default untuk bendera[`Debug`](./debug/) (salah). |

## Properti

| Nama | Keterangan |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | Menentukan folder tambahan tempat konverter harus menemukan font untuk dokumen input. Folder default adalah folder font standar tempat OS menemukan font untuk kebutuhan internal. |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | Menentukan apakah informasi debug harus dicetak ke aliran keluaran standar atau tidak. |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | Mengembalikan daftar kesalahan konversi yang ditekan Jika!:SuppressErrors benar. |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | Kategori Kualitas menentukan tingkat kompresi untuk suatu gambar. Nilai yang tersedia adalah 0 hingga 100. Semakin rendah angka yang ditentukan, semakin tinggi kompresinya dan karenanya semakin rendah kualitas gambarnya. Nilai 0 menghasilkan kualitas gambar terendah, sedangkan 100 menghasilkan kualitas tertinggi. |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | Menentukan apakah kesalahan harus ditekan atau tidak. Jika kesalahan yang benar-benar ditekan ditambahkan ke[`Exceptions`](./exceptions/) list. Jika salah, kesalahan pertama akan menghentikan program. |

### Lihat juga

* ruang nama [Aspose.Page](../../aspose.page/)
* perakitan [Aspose.Page](../../)


