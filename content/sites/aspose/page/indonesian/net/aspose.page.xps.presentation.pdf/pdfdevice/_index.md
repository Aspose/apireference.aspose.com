---
title: Class PdfDevice
second_title: Aspose.Page untuk Referensi .NET API
description: Aspose.Page.XPS.Presentation.Pdf.PdfDevice kelas. Perangkat pembuat gambar yang merangkum kelas.
type: docs
weight: 400
url: /id/net/aspose.page.xps.presentation.pdf/pdfdevice/
---
## PdfDevice class

Perangkat pembuat gambar yang merangkum kelas.

```csharp
public class PdfDevice : Device, IMultiPageDevice
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [PdfDevice](pdfdevice/#constructor)(Stream) | Membuat instance baru. |
| [PdfDevice](pdfdevice/#constructor_1)(Stream, Size) | Membuat instance baru dengan ukuran media yang ditentukan. |

## Properti

| Nama | Keterangan |
| --- | --- |
| override [Background](../../aspose.page.xps.presentation.pdf/pdfdevice/background/) { get; set; } | Mendapat/mengatur warna latar belakang. |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | Mengembalikan atau menentukan transformasi karakter saat ini. |
| [Creator](../../aspose.page/device/creator/) { get; set; } | Mengembalikan atau menentukan pembuat output perangkat yang dihasilkan. |
| virtual [CurrentPageNumber](../../aspose.page.xps.presentation.pdf/pdfdevice/currentpagenumber/) { get; } | Mengembalikan jumlah absolut halaman saat ini di dalam dokumen. |
| virtual [CurrentRelativePageNumber](../../aspose.page.xps.presentation.pdf/pdfdevice/currentrelativepagenumber/) { get; } | Mengembalikan nomor halaman saat ini dalam partisi saat ini. |
| override [Font](../../aspose.page.xps.presentation.pdf/pdfdevice/font/) { get; set; } | Mendapat/mengatur font saat ini. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | Menunjukkan apakah perangkat menggunakan mode RGB langsung, yaitu RGB. |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | Menunjukkan apakah instance pustaka Aspose.Page ini dilisensikan. |
| override [Opacity](../../aspose.page.xps.presentation.pdf/pdfdevice/opacity/) { get; set; } | Mendapat/mengatur opacity. |
| override [OpacityMask](../../aspose.page.xps.presentation.pdf/pdfdevice/opacitymask/) { get; set; } | Mendapatkan/mengatur kuas untuk masker opacity. Topeng berlaku di atas Paint atau Strike. |
| override [Paint](../../aspose.page.xps.presentation.pdf/pdfdevice/paint/) { get; set; } | Mendapat/mengatur kuas untuk mengisi jalur. |
| [Properties](../../aspose.page/device/properties/) { get; set; } | Properti perangkat termasuk metadata. |
| override [SaveOptions](../../aspose.page.xps.presentation.pdf/pdfdevice/saveoptions/) { set; } | Menginisialisasi opsi penyimpanan. |
| override [Size](../../aspose.page.xps.presentation.pdf/pdfdevice/size/) { get; set; } | Mendapat/mengatur ukuran media perangkat. |
| override [Stroke](../../aspose.page.xps.presentation.pdf/pdfdevice/stroke/) { get; set; } | Mendapat/mengatur goresan untuk menggambar jalur. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | Mengembalikan atau menentukan mode rendering teks saat ini. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | Mengembalikan atau menentukan lebar goresan teks saat ini. |

## Metode

| Nama | Keterangan |
| --- | --- |
| virtual [AddOutline](../../aspose.page.xps.presentation.pdf/pdfdevice/addoutline/#addoutline)(int, string) | Menambahkan item kerangka dengan objek terakhir sebagai targetnya. |
| virtual [AddOutline](../../aspose.page.xps.presentation.pdf/pdfdevice/addoutline/#addoutline_1)(PointF, int, string) | Menambahkan item kerangka dengan titik asal sebagai targetnya. |
| virtual [ClosePage](../../aspose.page.xps.presentation.pdf/pdfdevice/closepage/)() | Menyelesaikan halaman. |
| virtual [ClosePartition](../../aspose.page.xps.presentation.pdf/pdfdevice/closepartition/)() | Menyelesaikan partisi dokumen. |
| override [Create](../../aspose.page.xps.presentation.pdf/pdfdevice/create/)() | Membuat instance baru perangkat berdasarkan instance perangkat ini. Menulis status grafik perangkat ini, yaitu membuatApsCanvas instance(s) dengan properti RenderTransform dan Clip yang sesuai. |
| override [Dispose](../../aspose.page.xps.presentation.pdf/pdfdevice/dispose/)() | Membuang instance perangkat ini. Menyelesaikan status grafik instance perangkat ini, yaitu mengalihkan konteks penulisan APS keApsCanvas tingkat yang lebih tinggi dari status grafis perangkat iniApsCanvas . |
| override [Draw](../../aspose.page.xps.presentation.pdf/pdfdevice/draw/)(GraphicsPath) | Menggambar jalur yang ditentukan. |
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
| override [DrawString](../../aspose.page.xps.presentation.pdf/pdfdevice/drawstring/)(string, double, double) | Menggambar string pada posisi yang ditentukan. |
| override [EndDocument](../../aspose.page.xps.presentation.pdf/pdfdevice/enddocument/)() | Menyelesaikan dokumen. |
| override [Fill](../../aspose.page.xps.presentation.pdf/pdfdevice/fill/)(GraphicsPath) | Mengisi jalur yang ditentukan. |
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
| override [GetTransform](../../aspose.page.xps.presentation.pdf/pdfdevice/gettransform/)() | Mengembalikan matriks transformasi saat ini. |
| virtual [InitClip](../../aspose.page/device/initclip/)() | Menginisialisasi klip perangkat. |
| [InitPageNumbers](../../aspose.page.xps.presentation.pdf/pdfdevice/initpagenumbers/)() | Menginisialisasi jumlah halaman yang akan dihasilkan. |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | Mendapat nilai properti boolean. |
| virtual [OpenPage](../../aspose.page.xps.presentation.pdf/pdfdevice/openpage/#openpage_1)(string) | Memulai halaman baru dengan judul yang ditentukan. |
| virtual [OpenPage](../../aspose.page.xps.presentation.pdf/pdfdevice/openpage/#openpage)(float, float) | Memulai halaman baru dengan lebar dan tinggi yang ditentukan. |
| virtual [OpenPartition](../../aspose.page.xps.presentation.pdf/pdfdevice/openpartition/)() | Memulai partisi dokumen baru. |
| override [ReNew](../../aspose.page.xps.presentation.pdf/pdfdevice/renew/)() | Mengatur perangkat ke keadaan awal. |
| override [Reset](../../aspose.page.xps.presentation.pdf/pdfdevice/reset/)() | Mereset perangkat. |
| override [Rotate](../../aspose.page.xps.presentation.pdf/pdfdevice/rotate/#rotate)(double) | Menerapkan rotasi searah jarum jam tentang asal ke matriks transformasi saat ini. |
| virtual [Rotate](../../aspose.page/device/rotate/)(double, double, double) | Putar matriks transformasi saat ini di sekitar titik. |
| override [Scale](../../aspose.page.xps.presentation.pdf/pdfdevice/scale/)(double, double) | Menerapkan vektor skala yang ditentukan ke matriks transformasi saat ini. |
| override [SetClip](../../aspose.page.xps.presentation.pdf/pdfdevice/setclip/)(GraphicsPath) | Menambahkan jalur yang ditentukan ke jalur klip saat ini. |
| virtual [SetHyperlinkTarget](../../aspose.page.xps.presentation.pdf/pdfdevice/sethyperlinktarget/#sethyperlinktarget)(int) | Menetapkan hyperlink dengan nomor halaman sebagai targetnya. |
| virtual [SetHyperlinkTarget](../../aspose.page.xps.presentation.pdf/pdfdevice/sethyperlinktarget/#sethyperlinktarget_1)(string) | Menetapkan hyperlink dengan URI eksternal sebagai targetnya. |
| override [SetTransform](../../aspose.page.xps.presentation.pdf/pdfdevice/settransform/)(Matrix) | Menetapkan matriks transformasi saat ini. |
| override [Shear](../../aspose.page.xps.presentation.pdf/pdfdevice/shear/)(double, double) | Menerapkan vektor geser yang ditentukan ke matriks transformasi saat ini. |
| override [StartDocument](../../aspose.page.xps.presentation.pdf/pdfdevice/startdocument/)() | Memulai dokumen. |
| override [ToString](../../aspose.page/device/tostring/)() | Mengembalikan nama jenis perangkat. |
| override [Transform](../../aspose.page.xps.presentation.pdf/pdfdevice/transform/)(Matrix) | Mengalikan matriks transformasi saat ini dengan yang ditentukanMatrix . |
| override [Translate](../../aspose.page.xps.presentation.pdf/pdfdevice/translate/)(double, double) | Menerapkan vektor terjemahan yang ditentukan ke matriks transformasi saat ini. |
| virtual [UpdatePageParameters](../../aspose.page.xps.presentation.pdf/pdfdevice/updatepageparameters/)(IMultiPageDevice) | Memperbarui parameter halaman saat ini. |
| virtual [WriteComment](../../aspose.page/device/writecomment/)(string) | Menulis komentar. |

### Lihat juga

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* ruang nama [Aspose.Page.XPS.Presentation.Pdf](../../aspose.page.xps.presentation.pdf/)
* perakitan [Aspose.Page](../../)


