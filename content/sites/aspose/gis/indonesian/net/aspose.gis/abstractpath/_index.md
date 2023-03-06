---
title: Class AbstractPath
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.AbstractPath kelas. AnJalur Abstrak adalah kelas dasar untuk kelas yang menentukan lokasi unik di lingkungan yang mirip dengan sistem file antara lain seperti sistem file lokal penyimpanan file jarak jauh atau arsip ZIP.
type: docs
weight: 10
url: /id/net/aspose.gis/abstractpath/
---
## AbstractPath class

An`Jalur Abstrak` adalah kelas dasar untuk kelas yang menentukan lokasi unik di lingkungan yang mirip dengan sistem file, antara lain seperti sistem file lokal, penyimpanan file jarak jauh, atau arsip ZIP.

```csharp
public abstract class AbstractPath
```

## Properti

| Nama | Keterangan |
| --- | --- |
| abstract [Location](../../aspose.gis/abstractpath/location/) { get; } | Mendapat representasi string dari lokasi ini`Jalur Abstrak` . |
| abstract [Separator](../../aspose.gis/abstractpath/separator/) { get; } | Mendapat karakter pemisah yang digunakan untuk memisahkan level direktori dari[`Location`](./location/) rangkaian. |

## Metode

| Nama | Keterangan |
| --- | --- |
| static [FromLocalPath](../../aspose.gis/abstractpath/fromlocalpath/)(string) | Membuat sebuah`AbstractPath` yang mewakili lokasi di sistem file lokal. |
| static [FromStream](../../aspose.gis/abstractpath/fromstream/)(Stream) | Membuat sebuah`AbstractPath` dariStream . |
| virtual [Combine](../../aspose.gis/abstractpath/combine/)(string) | Gabungkan ini`AbstractPath` dengan komponen jalur yang ditentukan. |
| abstract [Delete](../../aspose.gis/abstractpath/delete/)() | Menghapus file yang ditunjuk oleh jalur ini. |
| [GetExtension](../../aspose.gis/abstractpath/getextension/)() | Mengembalikan ekstensi ini`AbstractPath` . |
| [GetFileName](../../aspose.gis/abstractpath/getfilename/)() | Mengembalikan nama file dan ekstensi ini`AbstractPath` . |
| [GetFileNameWithoutExtension](../../aspose.gis/abstractpath/getfilenamewithoutextension/)() | Mengembalikan nama file ini`AbstractPath` tanpa ekstensi. |
| abstract [IsFile](../../aspose.gis/abstractpath/isfile/)() | Mendapat nilai yang menunjukkan apakah jalur ini mengarah ke file yang sudah ada yang dapat dibuka untuk dibaca. |
| abstract [ListDirectory](../../aspose.gis/abstractpath/listdirectory/)() | Mengembalikan jalur yang terletak di dalam ini`Jalur Abstrak` , jika itu adalah direktori. |
| abstract [Open](../../aspose.gis/abstractpath/open/)(FileAccess) | Membuka ini`Jalur Abstrak`sebagai file. |
| virtual [WithExtension](../../aspose.gis/abstractpath/withextension/)(string) | Mengembalikan yang baru`AbstractPath` dengan ekstensi file diubah menjadi nilai yang ditentukan. |

### Perkataan

An`Jalur Abstrak` mungkin menentukan lokasi di sistem file lokal, lokasi di sistem file jarak jauh atau penyimpanan eksternal seperti penyimpanan Azure Blob, dan sebagainya. Lokasi mungkin menunjuk ke objek seperti file yang ada atau tidak ada, objek seperti direktori, atau memiliki arti lain yang masuk akal untuk lingkungan tempatnya berada. Sebagai contoh, sebuah`Jalur Abstrak` pewaris yang mewakili lokasi di sistem file lokal dapat menunjuk ke file yang ada, direktori, atau ke tempat di sistem file yang belum dibuat. Untuk membuat penyimpanan seperti sistem file baru tersedia untuk`Aspose.GIS` seseorang harus mewarisi class ini dan menerapkan metode abstraknya.

### Lihat juga

* ruang nama [Aspose.Gis](../../aspose.gis/)
* perakitan [Aspose.GIS](../../)


