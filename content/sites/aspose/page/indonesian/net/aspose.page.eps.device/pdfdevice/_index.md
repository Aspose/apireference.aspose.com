---
title: Class PdfDevice
second_title: Aspose.Page untuk Referensi .NET API
description: Aspose.Page.EPS.Device.PdfDevice kelas. Kelas ini merangkum rendering dokumen ke PDF.
type: docs
weight: 60
url: /id/net/aspose.page.eps.device/pdfdevice/
---
## PdfDevice class

Kelas ini merangkum rendering dokumen ke PDF.

```csharp
public class PdfDevice : Device, IMultiPageDevice, IStreamable
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [PdfDevice](pdfdevice/#constructor)(Stream) | Menginisialisasi instance baru`PdfDevice` dengan aliran keluaran. |
| [PdfDevice](pdfdevice/#constructor_1)(Stream, Size) | Menginisialisasi instance baru`PdfDevice` dengan aliran keluaran dan ukuran halaman yang ditentukan. |

## Properti

| Nama | Keterangan |
| --- | --- |
| virtual [Background](../../aspose.page/device/background/) { get; set; } | Mengembalikan atau menentukan latar belakang halaman saat ini. |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | Mengembalikan atau menentukan transformasi karakter saat ini. |
| [Creator](../../aspose.page/device/creator/) { get; set; } | Mengembalikan atau menentukan pembuat output perangkat yang dihasilkan. |
| virtual [CurrentPageNumber](../../aspose.page.eps.device/pdfdevice/currentpagenumber/) { get; } | Nomor halaman saat ini. |
| override [Font](../../aspose.page.eps.device/pdfdevice/font/) { set; } | Menentukan font saat ini. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | Menunjukkan apakah perangkat menggunakan mode RGB langsung, yaitu RGB. |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | Menunjukkan apakah instance pustaka Aspose.Page ini dilisensikan. |
| virtual [Opacity](../../aspose.page/device/opacity/) { get; set; } | Mengembalikan atau menentukan opacity saat ini. |
| virtual [OpacityMask](../../aspose.page/device/opacitymask/) { get; set; } | Mengembalikan atau menentukan masker opacity saat ini. |
| [OutputStream](../../aspose.page.eps.device/pdfdevice/outputstream/) { get; set; } | Menentukan atau mengembalikan aliran keluaran. |
| override [Paint](../../aspose.page.eps.device/pdfdevice/paint/) { set; } | Mengembalikan atau menentukan cat saat ini. |
| [Properties](../../aspose.page/device/properties/) { get; set; } | Properti perangkat termasuk metadata. |
| virtual [SaveOptions](../../aspose.page/device/saveoptions/) { set; } | Opsi untuk mengelola proses rendering. |
| virtual [Size](../../aspose.page/device/size/) { get; set; } | Mengembalikan atau menentukan ukuran halaman. |
| override [Stroke](../../aspose.page.eps.device/pdfdevice/stroke/) { set; } | Mengembalikan atau menentukan goresan saat ini. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | Mengembalikan atau menentukan mode rendering teks saat ini. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | Mengembalikan atau menentukan lebar goresan teks saat ini. |

## Metode

| Nama | Keterangan |
| --- | --- |
| virtual [ClosePage](../../aspose.page.eps.device/pdfdevice/closepage/)() | Membuat persiapan perangkat yang diperlukan setelah halaman dirender. |
| override [Create](../../aspose.page.eps.device/pdfdevice/create/)() | Membuat salinan perangkat ini. |
| override [Dispose](../../aspose.page.eps.device/pdfdevice/dispose/)() | Membuang konteks grafik. Jika saat pembuatan restoreOnDispose benar, writeGraphicsRestore() akan dipanggil. |
| override [Draw](../../aspose.page.eps.device/pdfdevice/draw/)(GraphicsPath) | Menggambar jalur. |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | Menggambar busur. |
| override [DrawImage](../../aspose.page.eps.device/pdfdevice/drawimage/)(Bitmap, Matrix, Color) | Menggambar gambar dengan transformasi dan latar belakang yang ditetapkan. |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | Menggambar ruas garis. |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | Menggambar oval. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(double[], double[], int) | Menggambar poligon. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(int[], int[], int) | Menggambar poligon. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(double[], double[], int) | Menggambar polyline. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(int[], int[], int) | Menggambar polyline. |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | Menggambar persegi panjang. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | Menggambar persegi panjang bulat. |
| override [DrawString](../../aspose.page.eps.device/pdfdevice/drawstring/)(string, double, double) | Menggambar string pada titik tertentu. |
| override [EndDocument](../../aspose.page.eps.device/pdfdevice/enddocument/)() | Membuat persiapan perangkat yang diperlukan setelah dokumen dirender. |
| override [Fill](../../aspose.page.eps.device/pdfdevice/fill/)(GraphicsPath) | Mengisi jalur. |
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
| override [GetTransform](../../aspose.page.eps.device/pdfdevice/gettransform/)() | Mendapat transformasi saat ini. |
| override [InitClip](../../aspose.page.eps.device/pdfdevice/initclip/)() | Menginisialisasi klip perangkat. |
| virtual [InitPageNumbers](../../aspose.page.eps.device/pdfdevice/initpagenumbers/)() | Menginisialisasi jumlah halaman yang akan dihasilkan. |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | Mendapat nilai properti boolean. |
| virtual [OpenPage](../../aspose.page.eps.device/pdfdevice/openpage/#openpage_1)(string) | Melakukan persiapan perangkat yang diperlukan sebelum perenderan halaman. |
| virtual [OpenPage](../../aspose.page.eps.device/pdfdevice/openpage/#openpage)(float, float) | Membuat persiapan perangkat yang diperlukan sebelum setiap halaman dirender. |
| override [ReNew](../../aspose.page.eps.device/pdfdevice/renew/)() | Atur ulang perangkat ke keadaan awal untuk seluruh dokumen. Digunakan untuk menyetel ulang aliran keluaran. |
| override [Reset](../../aspose.page.eps.device/pdfdevice/reset/)() | Jika parameter perangkat halaman akan disetel, metode ini memungkinkan untuk mengembalikan aliran penulisan kembali ke awal halaman. |
| override [Rotate](../../aspose.page.eps.device/pdfdevice/rotate/#rotate)(double) | Putar transformasi arus pada sumbu Z. Memanggil writeTransform(Transform). Memutar dengan sudut positif theta memutar titik pada sumbu x positif menuju sumbu y positif. |
| virtual [Rotate](../../aspose.page/device/rotate/)(double, double, double) | Putar matriks transformasi saat ini di sekitar titik. |
| override [Scale](../../aspose.page.eps.device/pdfdevice/scale/)(double, double) | Skala matriks transformasi saat ini. Memanggil writeTransform(Transform). |
| override [SetClip](../../aspose.page.eps.device/pdfdevice/setclip/)(GraphicsPath) | Menentukan klip perangkat. |
| override [SetTransform](../../aspose.page.eps.device/pdfdevice/settransform/)(Matrix) | Menentukan transformasi saat ini. Karena sebagian besar format keluaran tidak mengimplementasikan fungsi ini, transformasi kebalikan dari Transform currentTransform dihitung dan dikalikan dengan transformasi yang akan disetel. Hasilnya kemudian diteruskan oleh call ke writeTransform(Transform). |
| override [Shear](../../aspose.page.eps.device/pdfdevice/shear/)(double, double) | Memotong matriks transformasi saat ini. Memanggil writeTransform(Transform). |
| override [StartDocument](../../aspose.page.eps.device/pdfdevice/startdocument/)() | Membuat persiapan perangkat yang diperlukan sebelum mulai merender dokumen. |
| override [ToString](../../aspose.page.eps.device/pdfdevice/tostring/)() | Mengembalikan nama jenis perangkat. |
| override [Transform](../../aspose.page.eps.device/pdfdevice/transform/)(Matrix) | Mengubah matriks transformasi saat ini. Memanggil writeTransform(Transform) |
| override [Translate](../../aspose.page.eps.device/pdfdevice/translate/)(double, double) | Menerjemahkan matriks transformasi saat ini. Memanggil writeTransform(Transform). |
| virtual [UpdatePageParameters](../../aspose.page.eps.device/pdfdevice/updatepageparameters/)(IMultiPageDevice) | Memperbarui parameter halaman dari perangkat multi halaman lainnya. |
| override [WriteComment](../../aspose.page.eps.device/pdfdevice/writecomment/)(string) | Menulis komentar. |

## Bidang

| Nama | Keterangan |
| --- | --- |
| static readonly [AUTHOR](../../aspose.page.eps.device/pdfdevice/author/) | Nilai properti "Penulis". |
| static readonly [BACKGROUND](../../aspose.page.eps.device/pdfdevice/background/) | Kunci properti "Latar Belakang". |
| static readonly [BACKGROUND_COLOR](../../aspose.page.eps.device/pdfdevice/background_color/) | Kunci properti "Warna latar belakang". |
| static readonly [COMPRESS](../../aspose.page.eps.device/pdfdevice/compress/) | Kunci properti "Kompres". |
| static readonly [EMBED_FONTS](../../aspose.page.eps.device/pdfdevice/embed_fonts/) | Kunci properti "Sematkan font dalam dokumen". |
| static readonly [EMBED_FONTS_AS](../../aspose.page.eps.device/pdfdevice/embed_fonts_as/) | Kunci properti "Jenis font apa yang digunakan untuk penyematan". |
| static readonly [EMIT_ERRORS](../../aspose.page.eps.device/pdfdevice/emit_errors/) | Nilai properti "Emit error". |
| static readonly [EMIT_WARNINGS](../../aspose.page.eps.device/pdfdevice/emit_warnings/) | Nilai properti "Emit warnings". |
| static readonly [FIT_TO_PAGE](../../aspose.page.eps.device/pdfdevice/fit_to_page/) | Kunci properti "Sesuaikan konten dengan halaman". |
| static readonly [KEYWORDS](../../aspose.page.eps.device/pdfdevice/keywords/) | Nilai properti "Kata Kunci". |
| static readonly [ORIENTATION](../../aspose.page.eps.device/pdfdevice/orientation/) | Kunci properti "Orientasi". |
| static readonly [PAGE_MARGINS](../../aspose.page.eps.device/pdfdevice/page_margins/) | Kunci properti "Margin halaman". |
| static readonly [PAGE_SIZE](../../aspose.page.eps.device/pdfdevice/page_size/) | Kunci properti "Ukuran halaman". |
| static readonly [SUBJECT](../../aspose.page.eps.device/pdfdevice/subject/) | Nilai properti "Subjek". |
| static readonly [TITLE](../../aspose.page.eps.device/pdfdevice/title/) | Nilai properti "Judul". |
| static readonly [TRANSPARENT](../../aspose.page.eps.device/pdfdevice/transparent/) | Kunci properti "Transparan". |
| static readonly [VERSION](../../aspose.page.eps.device/pdfdevice/version/) | Kunci properti "Versi". |
| const [VERSION5](../../aspose.page.eps.device/pdfdevice/version5/) | Nilai properti "Versi Adobe Acrobat Reader". |
| static readonly [WRITE_IMAGES_AS](../../aspose.page.eps.device/pdfdevice/write_images_as/) | Kunci properti "Format gambar". |

### Lihat juga

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* interface [IStreamable](../../aspose.page/istreamable/)
* ruang nama [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* perakitan [Aspose.Page](../../)


