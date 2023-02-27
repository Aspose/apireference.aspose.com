---
title: Class BaseRecognitionSettings
second_title: Aspose.OCR untuk .NET API Referensi
description: Aspose.OCR.BaseRecognitionSettings kelas. Pengaturan untuk pengenalan gambar. Berisi elemen yang memungkinkan penyesuaian proses pengenalan.
type: docs
weight: 30
url: /id/net/aspose.ocr/baserecognitionsettings/
---
## BaseRecognitionSettings class

Pengaturan untuk pengenalan gambar. Berisi elemen yang memungkinkan penyesuaian proses pengenalan.

```csharp
public class BaseRecognitionSettings
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [BaseRecognitionSettings](baserecognitionsettings/)(Language, bool, float, int) | Menginisialisasi instance baru dari[`RecognitionSettings`](../recognitionsettings/)kelas dengan set properti lengkap. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [AllowedCharacters](../../aspose.ocr/baserecognitionsettings/allowedcharacters/) { get; set; } | Kumpulan karakter yang diizinkan. Menentukan jenis karakter yang diperbolehkan untuk hasil pengenalan. |
| [AutoContrast](../../aspose.ocr/baserecognitionsettings/autocontrast/) { get; set; } | Memungkinkan penggunaan algoritme koreksi kontras tambahan untuk gambar sebelum dikenali. |
| [AutoDenoising](../../aspose.ocr/baserecognitionsettings/autodenoising/) { get; set; } | Memungkinkan penggunaan jaringan saraf tambahan untuk menyempurnakan gambar - mengurangi noise. Berguna untuk gambar dengan artefak pemindaian, distorsi, bintik, suar, gradien, elemen asing. |
| [AutoSkew](../../aspose.ocr/baserecognitionsettings/autoskew/) { set; } | Mendapat atau menyetel bendera yang menunjukkan apakah koreksi kemiringan gambar otomatis harus diaktifkan. Diaktifkan (benar) secara default. |
| [DetectAreasMode](../../aspose.ocr/baserecognitionsettings/detectareasmode/) { get; set; } | Memungkinkan untuk memilih mode optimal untuk area jenis dokumen: dokumen, foto, teks biasa, kolom, gambar. |
| [IgnoredCharacters](../../aspose.ocr/baserecognitionsettings/ignoredcharacters/) { get; set; } | Menetapkan daftar hitam untuk simbol pengenalan. |
| [Language](../../aspose.ocr/baserecognitionsettings/language/) { set; } | Mendapat atau menyetel bahasa yang digunakan untuk OCR.  Menentukan alfabet yang digunakan selama pengenalan. Multi-bahasa secara default. |
| [LinesFiltration](../../aspose.ocr/baserecognitionsettings/linesfiltration/) { get; set; } | Memungkinkan untuk mengenali teks dalam tabel (daerah yang dikelilingi garis). |
| [PreprocessingFilters](../../aspose.ocr/baserecognitionsettings/preprocessingfilters/) { get; set; } | Memungkinkan menyiapkan gambar untuk OCR dengan menyesuaikan metode pra-pemrosesan. |
| [SkewAngle](../../aspose.ocr/baserecognitionsettings/skewangle/) { set; } | Mendapatkan atau mengatur sudut dalam derajat untuk rotasi gambar.  Menetapkan nilai ini akan menonaktifkan[`AutoSkew`](./autoskew/) properti, sehingga koreksi kemiringan otomatis tidak diterapkan. Nol secara default. |
| [ThreadsCount](../../aspose.ocr/baserecognitionsettings/threadscount/) { set; } | Mendapat atau menetapkan nomor utas untuk diproses. Secara default, 0 berarti gambar akan diproses dengan jumlah thread yang sama dengan jumlah prosesor Anda. ThreadsCount = 1 berarti gambar akan diproses di thread utama. |
| [ThresholdValue](../../aspose.ocr/baserecognitionsettings/thresholdvalue/) { set; } | Mendapat atau menyetel nilai ambang khusus untuk binerisasi gambar. Rentang dari 1 hingga 255. |
| [UpscaleSmallFont](../../aspose.ocr/baserecognitionsettings/upscalesmallfont/) { get; set; } | Memungkinkan Anda menggunakan algoritme tambahan khusus untuk pengenalan font kecil. Berguna untuk gambar dengan karakter ukuran kecil. |

### Lihat juga

* ruang nama [Aspose.OCR](../../aspose.ocr/)
* perakitan [Aspose.OCR](../../)


