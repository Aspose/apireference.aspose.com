---
title: Class ImageDevice
second_title: Aspose.Page untuk Referensi .NET API
description: Aspose.Page.EPS.Device.ImageDevice kelas. Kelas ini merangkum rendering dokumen ke gambar.
type: docs
weight: 40
url: /id/net/aspose.page.eps.device/imagedevice/
---
## ImageDevice class

Kelas ini merangkum rendering dokumen ke gambar.

```csharp
public class ImageDevice : Device, IMultiPageDevice
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [ImageDevice](imagedevice/#constructor)() | Menginisialisasi instance baru`ImageDevice` . |
| [ImageDevice](imagedevice/#constructor_1)(ImageFormat) | Menginisialisasi instance baru`ImageDevice` dengan format gambar yang ditentukan. |
| [ImageDevice](imagedevice/#constructor_2)(Size) | Menginisialisasi instance baru`ImageDevice` dengan ukuran halaman yang ditentukan. |
| [ImageDevice](imagedevice/#constructor_3)(Size, ImageFormat) | Menginisialisasi instance baru`ImageDevice` dengan ukuran halaman dan format gambar yang ditentukan. |

## Properti

| Nama | Keterangan |
| --- | --- |
| override [Background](../../aspose.page.eps.device/imagedevice/background/) { get; set; } | Menunjukkan apakah perangkat menggunakan mode RGB langsung, yaitu RGB. |
| override [CharTM](../../aspose.page.eps.device/imagedevice/chartm/) { get; set; } | Mengembalikan atau menentukan transformasi karakter saat ini. |
| [Creator](../../aspose.page.eps.device/imagedevice/creator/) { get; set; } | Mengembalikan atau menentukan pembuat output perangkat yang dihasilkan. |
| virtual [CurrentPageNumber](../../aspose.page.eps.device/imagedevice/currentpagenumber/) { get; } | Nomor halaman saat ini. |
| override [Font](../../aspose.page.eps.device/imagedevice/font/) { get; set; } | Mengembalikan atau menentukan font saat ini. |
| [Format](../../aspose.page.eps.device/imagedevice/format/) { get; } | Format gambar. |
| [ImagesBytes](../../aspose.page.eps.device/imagedevice/imagesbytes/) { get; } | Mengembalikan gambar yang dihasilkan dalam byte, array satu byte untuk satu halaman. |
| override [IsDirectRGB](../../aspose.page.eps.device/imagedevice/isdirectrgb/) { get; } | Menunjukkan apakah perangkat menggunakan mode RGB langsung, yaitu RGB. |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | Menunjukkan apakah instance pustaka Aspose.Page ini dilisensikan. |
| override [Opacity](../../aspose.page.eps.device/imagedevice/opacity/) { get; set; } | Mengembalikan atau menentukan latar belakang halaman saat ini. |
| virtual [OpacityMask](../../aspose.page/device/opacitymask/) { get; set; } | Mengembalikan atau menentukan masker opacity saat ini. |
| override [Paint](../../aspose.page.eps.device/imagedevice/paint/) { get; set; } | Mengembalikan atau menentukan cat saat ini. |
| [Properties](../../aspose.page/device/properties/) { get; set; } | Properti perangkat termasuk metadata. |
| override [SaveOptions](../../aspose.page.eps.device/imagedevice/saveoptions/) { set; } | Opsi untuk mengelola proses rendering. |
| override [Size](../../aspose.page.eps.device/imagedevice/size/) { get; set; } | Mengembalikan atau menentukan ukuran halaman. |
| override [Stroke](../../aspose.page.eps.device/imagedevice/stroke/) { get; set; } | Mengembalikan atau menentukan goresan saat ini. |
| override [TextRenderingMode](../../aspose.page.eps.device/imagedevice/textrenderingmode/) { get; set; } | Mengembalikan atau menentukan mode rendering teks saat ini. |
| override [TextStrokeWidth](../../aspose.page.eps.device/imagedevice/textstrokewidth/) { get; set; } | Mengembalikan atau menentukan lebar goresan teks saat ini. |

## Metode

| Nama | Keterangan |
| --- | --- |
| virtual [ClosePage](../../aspose.page.eps.device/imagedevice/closepage/)() | Membuat persiapan perangkat yang diperlukan setelah halaman dirender. |
| override [Create](../../aspose.page.eps.device/imagedevice/create/)() | Membuat salinan perangkat ini. |
| override [Dispose](../../aspose.page.eps.device/imagedevice/dispose/)() | Membuang perangkat. |
| override [Draw](../../aspose.page.eps.device/imagedevice/draw/)(GraphicsPath) | Menggambar jalur. |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | Menggambar busur. |
| override [DrawImage](../../aspose.page.eps.device/imagedevice/drawimage/)(Bitmap, Matrix, Color) | Menggambar gambar dengan transformasi dan latar belakang yang ditetapkan. |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | Menggambar ruas garis. |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | Menggambar oval. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(double[], double[], int) | Menggambar poligon. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(int[], int[], int) | Menggambar poligon. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(double[], double[], int) | Menggambar polyline. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(int[], int[], int) | Menggambar polyline. |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | Menggambar persegi panjang. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | Menggambar persegi panjang bulat. |
| override [DrawString](../../aspose.page.eps.device/imagedevice/drawstring/)(string, double, double) | Menggambar string pada titik tertentu. |
| override [EndDocument](../../aspose.page.eps.device/imagedevice/enddocument/)() | Membuat persiapan perangkat yang diperlukan setelah dokumen dirender. |
| override [Fill](../../aspose.page.eps.device/imagedevice/fill/)(GraphicsPath) | Mengisi jalur. |
| virtual [FillArc](../../aspose.page/device/fillarc/)(double, double, double, double, double, double) | Mengisi busur. |
| virtual [FillOval](../../aspose.page/device/filloval/)(double, double, double, double) | Mengisi oval. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(double[], double[], int) | Mengisi poligon. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(int[], int[], int) | Mengisi poligon. |
| virtual [FillRect](../../aspose.page/device/fillrect/)(double, double, double, double) | Mengisi persegi panjang. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect/)(double, double, double, double, double, double) | Mengisi persegi panjang bulat. |
| [GetProperty](../../aspose.page.eps.device/imagedevice/getproperty/#getproperty)(string) | Mendapat nilai properti string. (2 methods) |
| [GetPropertyColor](../../aspose.page.eps.device/imagedevice/getpropertycolor/#getpropertycolor)(string) | Mendapat nilai properti warna. (2 methods) |
| [GetPropertyDouble](../../aspose.page.eps.device/imagedevice/getpropertydouble/#getpropertydouble)(string) | Mendapat nilai properti ganda. (2 methods) |
| [GetPropertyInt](../../aspose.page.eps.device/imagedevice/getpropertyint/#getpropertyint)(string) | Mendapat nilai properti integer. (2 methods) |
| [GetPropertyMargins](../../aspose.page.eps.device/imagedevice/getpropertymargins/#getpropertymargins)(string) | Mendapat nilai properti margin. (2 methods) |
| [GetPropertyRectangle](../../aspose.page.eps.device/imagedevice/getpropertyrectangle/#getpropertyrectangle)(string) | Mendapat nilai properti persegi panjang. (2 methods) |
| [GetPropertySize](../../aspose.page.eps.device/imagedevice/getpropertysize/#getpropertysize)(string) | Mendapat nilai properti size. (2 methods) |
| override [GetTransform](../../aspose.page.eps.device/imagedevice/gettransform/)() | Mendapatkan transformasi saat ini. |
| override [InitClip](../../aspose.page.eps.device/imagedevice/initclip/)() | Menginisialisasi klip perangkat. |
| virtual [InitPageNumbers](../../aspose.page.eps.device/imagedevice/initpagenumbers/)() | Menginisialisasi jumlah halaman yang akan dihasilkan. |
| [IsProperty](../../aspose.page.eps.device/imagedevice/isproperty/#isproperty)(string) | Mendapat nilai properti boolean. (2 methods) |
| virtual [OpenPage](../../aspose.page.eps.device/imagedevice/openpage/#openpage_1)(string) | Melakukan persiapan perangkat yang diperlukan sebelum perenderan halaman. |
| virtual [OpenPage](../../aspose.page.eps.device/imagedevice/openpage/#openpage)(float, float) | Membuat persiapan perangkat yang diperlukan sebelum setiap halaman dirender. |
| override [ReNew](../../aspose.page.eps.device/imagedevice/renew/)() | Atur ulang perangkat ke keadaan awal untuk seluruh dokumen. |
| override [Reset](../../aspose.page.eps.device/imagedevice/reset/)() | Setel ulang perangkat ke status awal untuk sebuah halaman. |
| override [Rotate](../../aspose.page.eps.device/imagedevice/rotate/#rotate)(double) | Putar matriks transformasi saat ini di atas sumbu Z. Memanggil writeTransform(Transform). Memutar dengan sudut positif theta memutar titik pada sumbu x positif menuju sumbu y positif. |
| virtual [Rotate](../../aspose.page/device/rotate/)(double, double, double) | Putar matriks transformasi saat ini di sekitar titik. |
| override [Scale](../../aspose.page.eps.device/imagedevice/scale/)(double, double) | Skala matriks transformasi saat ini. Memanggil writeTransform(Transform). |
| override [SetClip](../../aspose.page.eps.device/imagedevice/setclip/)(GraphicsPath) | Bentuk klip. |
| override [SetTransform](../../aspose.page.eps.device/imagedevice/settransform/)(Matrix) | Menentukan transformasi saat ini. |
| override [Shear](../../aspose.page.eps.device/imagedevice/shear/)(double, double) | Memotong matriks transformasi saat ini. Memanggil writeTransform(Transform). |
| override [StartDocument](../../aspose.page.eps.device/imagedevice/startdocument/)() | Membuat persiapan perangkat yang diperlukan sebelum mulai merender dokumen. |
| override [ToString](../../aspose.page.eps.device/imagedevice/tostring/)() | Mengembalikan nama jenis perangkat. |
| override [Transform](../../aspose.page.eps.device/imagedevice/transform/)(Matrix) | Mengubah matriks transformasi saat ini. Memanggil writeTransform(Transform). |
| override [Translate](../../aspose.page.eps.device/imagedevice/translate/)(double, double) | Menerjemahkan matriks transformasi saat ini. Memanggil writeTransform(Transform). |
| virtual [UpdatePageParameters](../../aspose.page.eps.device/imagedevice/updatepageparameters/)(IMultiPageDevice) | Memperbarui parameter halaman dari perangkat multi halaman lainnya. |
| override [WriteComment](../../aspose.page.eps.device/imagedevice/writecomment/)(string) | Menulis komentar. |

## Bidang

| Nama | Keterangan |
| --- | --- |
| static readonly [BACKGROUND](../../aspose.page.eps.device/imagedevice/background/) | Kunci properti "Latar Belakang". |
| static readonly [BACKGROUND_COLOR](../../aspose.page.eps.device/imagedevice/background_color/) | Kunci properti "Warna latar belakang". |
| static readonly [EMBED_FONTS](../../aspose.page.eps.device/imagedevice/embed_fonts/) | Kunci properti "Sematkan font dalam dokumen". |
| static readonly [EMIT_ERRORS](../../aspose.page.eps.device/imagedevice/emit_errors/) | Nilai properti "Emit error". |
| static readonly [EMIT_WARNINGS](../../aspose.page.eps.device/imagedevice/emit_warnings/) | Nilai properti "Emit warnings". |
| static readonly [FIT_TO_PAGE](../../aspose.page.eps.device/imagedevice/fit_to_page/) | Kunci properti "Sesuaikan konten dengan halaman". |
| static readonly [ORIENTATION](../../aspose.page.eps.device/imagedevice/orientation/) | Kunci properti "Orientasi". |
| static readonly [PAGE_MARGINS](../../aspose.page.eps.device/imagedevice/page_margins/) | Kunci properti "Margin halaman". |
| static readonly [PAGE_SIZE](../../aspose.page.eps.device/imagedevice/page_size/) | Kunci properti "Ukuran halaman". |
| static readonly [PRODUCER](../../aspose.page.eps.device/imagedevice/producer/) | Nilai properti "Produsen". |
| static readonly [TRANSPARENT](../../aspose.page.eps.device/imagedevice/transparent/) | Kunci properti "Transparan". |

### Lihat juga

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* ruang nama [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* perakitan [Aspose.Page](../../)


