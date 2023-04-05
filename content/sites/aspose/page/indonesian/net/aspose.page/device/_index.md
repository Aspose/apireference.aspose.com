---
title: Class Device
second_title: Aspose.Page untuk Referensi .NET API
description: Aspose.Page.Device kelas. Kelas ini merangkum rendering dokumen ke perangkat abstrak. Rendering dokumen dilakukan halaman demi halaman.
type: docs
weight: 20
url: /id/net/aspose.page/device/
---
## Device class

Kelas ini merangkum rendering dokumen ke perangkat abstrak. Rendering dokumen dilakukan halaman demi halaman.

```csharp
public abstract class Device
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [Device](device/)(Size) | Inisialisasi`Device` dengan ukuran halaman. |

## Properti

| Nama | Keterangan |
| --- | --- |
| virtual [Background](../../aspose.page/device/background/) { get; set; } | Mengembalikan atau menentukan latar belakang halaman saat ini. |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | Mengembalikan atau menentukan transformasi karakter saat ini. |
| [Creator](../../aspose.page/device/creator/) { get; set; } | Mengembalikan atau menentukan pembuat output perangkat yang dihasilkan. |
| virtual [Font](../../aspose.page/device/font/) { get; set; } | Mengembalikan atau menentukan font saat ini. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | Menunjukkan apakah perangkat menggunakan mode RGB langsung, yaitu RGB. |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | Menunjukkan apakah instance pustaka Aspose.Page ini dilisensikan. |
| virtual [Opacity](../../aspose.page/device/opacity/) { get; set; } | Mengembalikan atau menentukan opacity saat ini. |
| virtual [OpacityMask](../../aspose.page/device/opacitymask/) { get; set; } | Mengembalikan atau menentukan masker opacity saat ini. |
| virtual [Paint](../../aspose.page/device/paint/) { get; set; } | Mengembalikan atau menentukan cat saat ini. |
| [Properties](../../aspose.page/device/properties/) { get; set; } | Properti perangkat termasuk metadata. |
| virtual [SaveOptions](../../aspose.page/device/saveoptions/) { set; } | Opsi untuk mengelola proses rendering. |
| virtual [Size](../../aspose.page/device/size/) { get; set; } | Mengembalikan atau menentukan ukuran halaman. |
| virtual [Stroke](../../aspose.page/device/stroke/) { get; set; } | Mengembalikan atau menentukan goresan saat ini. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | Mengembalikan atau menentukan mode rendering teks saat ini. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | Mengembalikan atau menentukan lebar goresan teks saat ini. |

## Metode

| Nama | Keterangan |
| --- | --- |
| virtual [Create](../../aspose.page/device/create/)() | Membuat salinan perangkat ini. |
| virtual [Dispose](../../aspose.page/device/dispose/)() | Membuang perangkat. |
| virtual [Draw](../../aspose.page/device/draw/)(GraphicsPath) | Menggambar jalur. |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | Menggambar busur. |
| virtual [DrawImage](../../aspose.page/device/drawimage/)(Bitmap, Matrix, Color) | Menggambar gambar dengan transformasi dan latar belakang yang ditetapkan. |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | Menggambar ruas garis. |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | Menggambar oval. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/#drawpolygon)(double[], double[], int) | Menggambar poligon. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/#drawpolygon_1)(int[], int[], int) | Menggambar poligon. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/#drawpolyline)(double[], double[], int) | Menggambar polyline. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/#drawpolyline_1)(int[], int[], int) | Menggambar polyline. |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | Menggambar persegi panjang. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | Menggambar persegi panjang bulat. |
| virtual [DrawString](../../aspose.page/device/drawstring/)(string, double, double) | Menggambar string pada titik tertentu. |
| virtual [EndDocument](../../aspose.page/device/enddocument/)() | Membuat persiapan perangkat yang diperlukan setelah dokumen dirender. |
| virtual [Fill](../../aspose.page/device/fill/)(GraphicsPath) | Mengisi jalur. |
| virtual [FillArc](../../aspose.page/device/fillarc/)(double, double, double, double, double, double) | Mengisi busur. |
| virtual [FillOval](../../aspose.page/device/filloval/)(double, double, double, double) | Mengisi oval. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/#fillpolygon)(double[], double[], int) | Mengisi poligon. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/#fillpolygon_1)(int[], int[], int) | Mengisi poligon. |
| virtual [FillRect](../../aspose.page/device/fillrect/)(double, double, double, double) | Mengisi persegi panjang. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect/)(double, double, double, double, double, double) | Mengisi persegi panjang bulat. |
| [GetProperty](../../aspose.page/device/getproperty/)(string) | Mendapat nilai properti string. |
| [GetPropertyColor](../../aspose.page/device/getpropertycolor/)(string) | Mendapat nilai properti warna. |
| [GetPropertyDouble](../../aspose.page/device/getpropertydouble/)(string) | Mendapat nilai properti ganda. |
| [GetPropertyInt](../../aspose.page/device/getpropertyint/)(string) | Mendapat nilai properti integer. |
| [GetPropertyMargins](../../aspose.page/device/getpropertymargins/)(string) | Mendapat nilai properti margin. |
| [GetPropertyRectangle](../../aspose.page/device/getpropertyrectangle/)(string) | Mendapat nilai properti persegi panjang. |
| [GetPropertySize](../../aspose.page/device/getpropertysize/)(string) | Mendapat nilai properti size. |
| virtual [GetTransform](../../aspose.page/device/gettransform/)() | Mendapat transformasi saat ini. |
| virtual [InitClip](../../aspose.page/device/initclip/)() | Menginisialisasi klip perangkat. |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | Mendapat nilai properti boolean. |
| virtual [ReNew](../../aspose.page/device/renew/)() | Atur ulang perangkat ke keadaan awal untuk seluruh dokumen. Digunakan untuk menyetel ulang aliran keluaran. |
| virtual [Reset](../../aspose.page/device/reset/)() | Setel ulang perangkat ke status awal untuk sebuah halaman. |
| virtual [Rotate](../../aspose.page/device/rotate/#rotate)(double) | Putar matriks transformasi saat ini. Memanggil writeTransform(Transform). Memutar dengan sudut positif theta memutar titik pada sumbu x positif menuju sumbu y positif. |
| virtual [Rotate](../../aspose.page/device/rotate/#rotate_1)(double, double, double) | Putar matriks transformasi saat ini di sekitar titik. |
| virtual [Scale](../../aspose.page/device/scale/)(double, double) | Skala matriks transformasi saat ini. Memanggil writeTransform(Transform). |
| virtual [SetClip](../../aspose.page/device/setclip/)(GraphicsPath) | Menentukan klip perangkat. |
| virtual [SetTransform](../../aspose.page/device/settransform/)(Matrix) | Menentukan transformasi saat ini. |
| virtual [Shear](../../aspose.page/device/shear/)(double, double) | Memotong matriks transformasi saat ini. Memanggil writeTransform(Transform). |
| virtual [StartDocument](../../aspose.page/device/startdocument/)() | Membuat persiapan perangkat yang diperlukan sebelum mulai merender dokumen. |
| override [ToString](../../aspose.page/device/tostring/)() | Mengembalikan nama jenis perangkat. |
| virtual [Transform](../../aspose.page/device/transform/)(Matrix) | Mengubah matriks transformasi saat ini. Memanggil writeTransform(Transform) |
| virtual [Translate](../../aspose.page/device/translate/)(double, double) | Menerjemahkan matriks transformasi saat ini. Memanggil writeTransform(Transform). |
| virtual [WriteComment](../../aspose.page/device/writecomment/)(string) | Menulis komentar. |

## Bidang

| Nama | Keterangan |
| --- | --- |
| static [VERSION](../../aspose.page/device/version/) | Versi perangkat saat ini. |

### Lihat juga

* ruang nama [Aspose.Page](../../aspose.page/)
* perakitan [Aspose.Page](../../)


