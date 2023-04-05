---
title: Class ImageDevice
second_title: Aspose.Page untuk Referensi .NET API
description: Aspose.Page.XPS.Presentation.Image.ImageDevice kelas. Perangkat pembuat gambar yang merangkum kelas.
type: docs
weight: 350
url: /id/net/aspose.page.xps.presentation.image/imagedevice/
---
## ImageDevice class

Perangkat pembuat gambar yang merangkum kelas.

```csharp
public class ImageDevice : Device, IMultiPageDevice
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [ImageDevice](imagedevice/#constructor)() | Membuat instance baru. |
| [ImageDevice](imagedevice/#constructor_1)(Size) | Membuat instance baru dengan ukuran media yang ditentukan. |

## Properti

| Nama | Keterangan |
| --- | --- |
| override [Background](../../aspose.page.xps.presentation.image/imagedevice/background/) { get; set; } | Mendapat/mengatur warna latar belakang. |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | Mengembalikan atau menentukan transformasi karakter saat ini. |
| [Creator](../../aspose.page/device/creator/) { get; set; } | Mengembalikan atau menentukan pembuat output perangkat yang dihasilkan. |
| virtual [CurrentPageNumber](../../aspose.page.xps.presentation.image/imagedevice/currentpagenumber/) { get; } | Mengembalikan jumlah absolut halaman saat ini dalam dokumen. |
| virtual [CurrentRelativePageNumber](../../aspose.page.xps.presentation.image/imagedevice/currentrelativepagenumber/) { get; } | Mengembalikan nomor relatif halaman saat ini dalam partisi saat ini. |
| override [Font](../../aspose.page.xps.presentation.image/imagedevice/font/) { get; set; } | Mendapat/mengatur font saat ini. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | Menunjukkan apakah perangkat menggunakan mode RGB langsung, yaitu RGB. |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | Menunjukkan apakah instance pustaka Aspose.Page ini dilisensikan. |
| override [Opacity](../../aspose.page.xps.presentation.image/imagedevice/opacity/) { get; set; } | Mendapat/mengatur opacity. |
| override [OpacityMask](../../aspose.page.xps.presentation.image/imagedevice/opacitymask/) { get; set; } | Mendapatkan/mengatur kuas untuk masker opacity. Topeng berlaku di atas Paint atau Strike. |
| override [Paint](../../aspose.page.xps.presentation.image/imagedevice/paint/) { get; set; } | Mendapat/mengatur kuas untuk mengisi jalur. |
| [Properties](../../aspose.page/device/properties/) { get; set; } | Properti perangkat termasuk metadata. |
| [Result](../../aspose.page.xps.presentation.image/imagedevice/result/) { get; } | Mengembalikan array byte gambar yang dihasilkan. Dimensi pertama adalah untuk dokumen bagian dalam dan yang kedua adalah untuk halaman di dalam dokumen bagian dalam. |
| override [SaveOptions](../../aspose.page.xps.presentation.image/imagedevice/saveoptions/) { set; } | Menginisialisasi opsi penyimpanan. |
| override [Size](../../aspose.page.xps.presentation.image/imagedevice/size/) { get; set; } | Mendapat/mengatur ukuran media perangkat. |
| override [Stroke](../../aspose.page.xps.presentation.image/imagedevice/stroke/) { get; set; } | Mendapat/mengatur goresan untuk menggambar jalur. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | Mengembalikan atau menentukan mode rendering teks saat ini. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | Mengembalikan atau menentukan lebar goresan teks saat ini. |

## Metode

| Nama | Keterangan |
| --- | --- |
| virtual [ClosePage](../../aspose.page.xps.presentation.image/imagedevice/closepage/)() | Menyelesaikan halaman. |
| virtual [ClosePartition](../../aspose.page.xps.presentation.image/imagedevice/closepartition/)() | Menyelesaikan partisi dokumen. |
| override [Create](../../aspose.page.xps.presentation.image/imagedevice/create/)() | Membuat instance baru perangkat berdasarkan instance perangkat ini. Menulis status grafik perangkat ini, yaitu membuatApsCanvas instance(s) dengan properti RenderTransform dan Clip yang sesuai. |
| override [Dispose](../../aspose.page.xps.presentation.image/imagedevice/dispose/)() | Membuang instance perangkat ini. Menyelesaikan status grafik instance perangkat ini, yaitu mengalihkan konteks penulisan APS keApsCanvas tingkat yang lebih tinggi dari status grafis perangkat iniApsCanvas . |
| override [Draw](../../aspose.page.xps.presentation.image/imagedevice/draw/)(GraphicsPath) | Menggambar jalur yang ditentukan. |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | Menggambar busur. |
| virtual [DrawImage](../../aspose.page/device/drawimage/)(Bitmap, Matrix, Color) | Menggambar gambar dengan transformasi dan latar belakang yang ditetapkan. |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | Menggambar ruas garis. |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | Menggambar oval. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(double[], double[], int) | Menggambar poligon. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(int[], int[], int) | Menggambar poligon. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(double[], double[], int) | Menggambar polyline. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(int[], int[], int) | Menggambar polyline. |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | Menggambar persegi panjang. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | Menggambar persegi panjang bulat. |
| override [DrawString](../../aspose.page.xps.presentation.image/imagedevice/drawstring/)(string, double, double) | Menggambar string pada posisi yang ditentukan. |
| override [EndDocument](../../aspose.page.xps.presentation.image/imagedevice/enddocument/)() | Menyelesaikan dokumen. |
| override [Fill](../../aspose.page.xps.presentation.image/imagedevice/fill/)(GraphicsPath) | Mengisi jalur yang ditentukan. |
| virtual [FillArc](../../aspose.page/device/fillarc/)(double, double, double, double, double, double) | Mengisi busur. |
| virtual [FillOval](../../aspose.page/device/filloval/)(double, double, double, double) | Mengisi oval. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(double[], double[], int) | Mengisi poligon. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(int[], int[], int) | Mengisi poligon. |
| virtual [FillRect](../../aspose.page/device/fillrect/)(double, double, double, double) | Mengisi persegi panjang. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect/)(double, double, double, double, double, double) | Mengisi persegi panjang bulat. |
| [GetProperty](../../aspose.page/device/getproperty/)(string) | Mendapat nilai properti string. |
| [GetPropertyColor](../../aspose.page/device/getpropertycolor/)(string) | Mendapat nilai properti warna. |
| [GetPropertyDouble](../../aspose.page/device/getpropertydouble/)(string) | Mendapat nilai properti ganda. |
| [GetPropertyInt](../../aspose.page/device/getpropertyint/)(string) | Mendapat nilai properti integer. |
| [GetPropertyMargins](../../aspose.page/device/getpropertymargins/)(string) | Mendapat nilai properti margin. |
| [GetPropertyRectangle](../../aspose.page/device/getpropertyrectangle/)(string) | Mendapat nilai properti persegi panjang. |
| [GetPropertySize](../../aspose.page/device/getpropertysize/)(string) | Mendapat nilai properti size. |
| override [GetTransform](../../aspose.page.xps.presentation.image/imagedevice/gettransform/)() | Mengembalikan matriks transformasi saat ini. |
| virtual [InitClip](../../aspose.page/device/initclip/)() | Menginisialisasi klip perangkat. |
| [InitPageNumbers](../../aspose.page.xps.presentation.image/imagedevice/initpagenumbers/)() | Menginisialisasi jumlah halaman yang akan dihasilkan. |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | Mendapat nilai properti boolean. |
| virtual [OpenPage](../../aspose.page.xps.presentation.image/imagedevice/openpage/#openpage_1)(string) | Memulai halaman baru dengan judul yang ditentukan. |
| virtual [OpenPage](../../aspose.page.xps.presentation.image/imagedevice/openpage/#openpage)(float, float) | Memulai halaman baru dengan lebar dan tinggi yang ditentukan. |
| virtual [OpenPartition](../../aspose.page.xps.presentation.image/imagedevice/openpartition/)() | Memulai partisi dokumen baru. |
| override [ReNew](../../aspose.page.xps.presentation.image/imagedevice/renew/)() | Mengatur perangkat ke keadaan awal. |
| override [Reset](../../aspose.page.xps.presentation.image/imagedevice/reset/)() | Mereset perangkat. |
| override [Rotate](../../aspose.page.xps.presentation.image/imagedevice/rotate/#rotate)(double) | Menerapkan rotasi searah jarum jam tentang asal ke matriks transformasi saat ini. |
| virtual [Rotate](../../aspose.page/device/rotate/)(double, double, double) | Putar matriks transformasi saat ini di sekitar titik. |
| override [Scale](../../aspose.page.xps.presentation.image/imagedevice/scale/)(double, double) | Menerapkan vektor skala yang ditentukan ke matriks transformasi saat ini. |
| override [SetClip](../../aspose.page.xps.presentation.image/imagedevice/setclip/)(GraphicsPath) | Menambahkan jalur yang ditentukan ke jalur klip saat ini. |
| override [SetTransform](../../aspose.page.xps.presentation.image/imagedevice/settransform/)(Matrix) | Menetapkan matriks transformasi saat ini. |
| override [Shear](../../aspose.page.xps.presentation.image/imagedevice/shear/)(double, double) | Menerapkan vektor geser yang ditentukan ke matriks transformasi saat ini. |
| override [StartDocument](../../aspose.page.xps.presentation.image/imagedevice/startdocument/)() | Memulai dokumen. |
| override [ToString](../../aspose.page/device/tostring/)() | Mengembalikan nama jenis perangkat. |
| override [Transform](../../aspose.page.xps.presentation.image/imagedevice/transform/)(Matrix) | Mengalikan matriks transformasi saat ini dengan yang ditentukanMatrix . |
| override [Translate](../../aspose.page.xps.presentation.image/imagedevice/translate/)(double, double) | Menerapkan vektor terjemahan yang ditentukan ke matriks transformasi saat ini. |
| virtual [UpdatePageParameters](../../aspose.page.xps.presentation.image/imagedevice/updatepageparameters/)(IMultiPageDevice) | Memperbarui parameter halaman saat ini. |
| virtual [WriteComment](../../aspose.page/device/writecomment/)(string) | Menulis komentar. |

### Lihat juga

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* ruang nama [Aspose.Page.XPS.Presentation.Image](../../aspose.page.xps.presentation.image/)
* perakitan [Aspose.Page](../../)


