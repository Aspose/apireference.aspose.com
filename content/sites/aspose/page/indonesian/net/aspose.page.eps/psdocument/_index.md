---
title: Class PsDocument
second_title: Aspose.Page untuk Referensi .NET API
description: Aspose.Page.EPS.PsDocument kelas. Kelas ini merangkum dokumen PS/EPS.
type: docs
weight: 140
url: /id/net/aspose.page.eps/psdocument/
---
## PsDocument class

Kelas ini merangkum dokumen PS/EPS.

```csharp
public sealed class PsDocument : Document
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [PsDocument](psdocument/#constructor)(Stream) | Inisialisasi`PsDocument` dengan aliran file PS/EPS. |
| [PsDocument](psdocument/#constructor_1)(Stream, PsSaveOptions) | Inisialisasi kosong`PsDocument` dengan halaman yang diinisialisasi. |
| [PsDocument](psdocument/#constructor_2)(Stream, PsSaveOptions, bool) | Inisialisasi kosong`PsDocument` . |
| [PsDocument](psdocument/#constructor_3)(Stream, PsSaveOptions, int) | Inisialisasi kosong`PsDocument` ketika jumlah halaman dokumen Postscript diketahui sebelumnya. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [NumberOfPages](../../aspose.page.eps/psdocument/numberofpages/) { get; } | Mengembalikan jumlah halaman dalam dokumen PDF yang dihasilkan. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [Clip](../../aspose.page.eps/psdocument/clip/)(GraphicsPath) | Menambahkan klip ke status grafik saat ini. |
| [ClipAndNewPath](../../aspose.page.eps/psdocument/clipandnewpath/)(GraphicsPath) | Menambahkan klip ke status grafik saat ini dan kemudian menulis operator "jalur baru". Perlu dilakukan untuk melarikan diri dari pertemuan jalur kliping ini dan beberapa jalur berikutnya seperti mesin terbang yang diuraikan dengan operator "charpath". |
| [ClipRectangle](../../aspose.page.eps/psdocument/cliprectangle/)(RectangleF) | Menambahkan kotak kliping ke status grafik saat ini. |
| [ClipText](../../aspose.page.eps/psdocument/cliptext/)(string, Font, float, float) |  |
| [ClosePage](../../aspose.page.eps/psdocument/closepage/)() | Selesaikan halaman ini. |
| [Draw](../../aspose.page.eps/psdocument/draw/)(GraphicsPath) | Menggambar jalur arbitrer. |
| [DrawExplicitImageMask](../../aspose.page.eps/psdocument/drawexplicitimagemask/)(Bitmap, Bitmap, Matrix) | Menggambar gambar bertopeng. |
| [DrawImage](../../aspose.page.eps/psdocument/drawimage/#drawimage)(Bitmap) | Menggambar gambar. |
| [DrawImage](../../aspose.page.eps/psdocument/drawimage/#drawimage_1)(Bitmap, Matrix, Color) | Gambar transformasi gambar dengan latar belakang. |
| [DrawTransparentImage](../../aspose.page.eps/psdocument/drawtransparentimage/)(Bitmap, Matrix, int) | Menggambar gambar transparan yang diubah. Jika gambar tidak memiliki saluran Alpha, itu akan digambar sebagai gambar buram |
| [Fill](../../aspose.page.eps/psdocument/fill/)(GraphicsPath) | Isi jalur arbitrer. |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext)(string, DrFont, float, float, Brush, Pen) | Menambahkan string teks dengan mengisi interior mesin terbang dan menggambar kontur mesin terbang. |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext_3)(string, Font, float, float, Brush, Pen) | Menambahkan string teks dengan mengisi interior mesin terbang dan menggambar kontur mesin terbang. |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext_1)(string, float[], DrFont, float, float, Brush, Pen) | Menambahkan string teks dengan mengisi interior mesin terbang dan menggambar kontur mesin terbang. |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext_2)(string, float[], Font, float, float, Brush, Pen) | Menambahkan string teks dengan mengisi interior mesin terbang dan menggambar kontur mesin terbang. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext)(string, DrFont, float, float) | Menambahkan string teks dengan mengisi interior glyphs. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_6)(string, Font, float, float) | Menambahkan string teks dengan mengisi interior glyphs. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_1)(string, DrFont, float, float, Brush) | Menambahkan string teks dengan mengisi interior glyphs. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_2)(string, float[], DrFont, float, float) | Menambahkan string teks dengan mengisi interior glyphs. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_4)(string, float[], Font, float, float) | Menambahkan string teks dengan mengisi interior glyphs. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_7)(string, Font, float, float, Brush) | Menambahkan string teks dengan mengisi interior glyphs. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_3)(string, float[], DrFont, float, float, Brush) | Menambahkan string teks dengan mengisi interior glyphs. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_5)(string, float[], Font, float, float, Brush) | Menambahkan string teks dengan mengisi interior glyphs. |
| [GetPaint](../../aspose.page.eps/psdocument/getpaint/)() | Mendapat cat dari status grafik saat ini. |
| [GetStroke](../../aspose.page.eps/psdocument/getstroke/)() | Mendapat stroke dari status grafik saat ini. |
| [GetXmpMetadata](../../aspose.page.eps/psdocument/getxmpmetadata/)() | Membaca file PS/EPS dan mengekstrak XmpMetdata jika sudah ada atau menambahkan yang baru jika belum ada. |
| [Merge](../../aspose.page.eps/psdocument/merge/)(string[], Device, SaveOptions) | Menggabungkan file PS/EPS ke perangkat. |
| [OpenPage](../../aspose.page.eps/psdocument/openpage/#openpage_1)(string) | Membuat halaman baru dengan ukuran dokumen dan menjadikannya halaman saat ini. |
| [OpenPage](../../aspose.page.eps/psdocument/openpage/#openpage)(float, float) | Membuat halaman baru dan menjadikannya halaman saat ini. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext)(string, DrFont, float, float) | Menambahkan string teks dengan menggambar kontur mesin terbang. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_6)(string, Font, float, float) | Menambahkan string teks dengan menggambar kontur mesin terbang. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_1)(string, DrFont, float, float, Pen) | Menambahkan string teks dengan menggambar kontur mesin terbang. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_2)(string, float[], DrFont, float, float) | Menambahkan string teks dengan menggambar kontur mesin terbang. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_4)(string, float[], Font, float, float) | Menambahkan string teks dengan menggambar kontur mesin terbang. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_7)(string, Font, float, float, Pen) | Menambahkan string teks dengan menggambar kontur mesin terbang. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_3)(string, float[], DrFont, float, float, Pen) | Menambahkan string teks dengan menggambar kontur mesin terbang. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_5)(string, float[], Font, float, float, Pen) | Menambahkan string teks dengan menggambar kontur mesin terbang. |
| [Rotate](../../aspose.page.eps/psdocument/rotate/#rotate_1)(float) | Menambahkan rotasi berlawanan arah jarum jam tentang asal ke status grafik saat ini (memutar matriks saat ini). |
| [Rotate](../../aspose.page.eps/psdocument/rotate/#rotate)(int) | Menambahkan rotasi berlawanan arah jarum jam tentang asal ke status grafik saat ini (memutar matriks saat ini). |
| [Save](../../aspose.page.eps/psdocument/save/#save)() | Penghematan diberikan`PsDocument`sebagai file EPS. Metode ini hanya digunakan saat PsDocument dibuat dari awal. |
| [Save](../../aspose.page.eps/psdocument/save/#save_2)(Stream) | Penghematan diberikan`PsDocument` sebagai file EPS. Metode ini hanya digunakan setelah memperbarui metadata XMP. Metode ini menyimpan file EPS awal dengan metadata yang sudah diperbarui atau yang baru dibuat saat memanggil metode GetMetadata. Dalam kasus terakhir, semua kode PostScript yang diperlukan dan komentar EPS ditambahkan. |
| override [Save](../../aspose.page.eps/psdocument/save/#save_1)(Device, SaveOptions) | Menyimpan file PS/EPS ke perangkat. |
| [Scale](../../aspose.page.eps/psdocument/scale/)(float, float) | Menambahkan skala ke status grafik saat ini (skalakan matriks saat ini). |
| [SetPageDevice](../../aspose.page.eps/psdocument/setpagedevice/)(Dictionary&lt;string, object&gt;) | Mengatur parameter perangkat halaman (lihat spesifikasi PostScript operator "setpagedevice"). Di antaranya dapat berupa ukuran dan warna halaman dll. |
| [SetPageSize](../../aspose.page.eps/psdocument/setpagesize/)(float, float) | Mengatur ukuran halaman. Untuk membuat halaman dengan ukuran berbeda dalam satu dokumen gunakan[`SetPageDevice`](./setpagedevice/)metode tepat setelah metode ini. |
| [SetPaint](../../aspose.page.eps/psdocument/setpaint/)(Brush) | Menyetel cat dalam status grafik saat ini. |
| [SetStroke](../../aspose.page.eps/psdocument/setstroke/)(Pen) | Menyetel coretan pada status grafik saat ini. |
| [SetTransform](../../aspose.page.eps/psdocument/settransform/)(Matrix) | Tetapkan transformasi saat ini ke yang ini. |
| [Shear](../../aspose.page.eps/psdocument/shear/)(float, float) | Menambahkan transformasi geser ke status grafik saat ini (geser matriks saat ini). |
| [Transform](../../aspose.page.eps/psdocument/transform/)(Matrix) | Menambahkan transformasi ke status grafik saat ini (menggabungkan matriks ini dengan matriks saat ini). |
| [Translate](../../aspose.page.eps/psdocument/translate/)(float, float) | Menambahkan terjemahan ke status grafik saat ini (menerjemahkan matriks saat ini). |
| [WriteGraphicsRestore](../../aspose.page.eps/psdocument/writegraphicsrestore/)() | Menulis pemulihan status grafik saat ini (Lihat spesifikasi PostScript pada operator "grestore"). |
| [WriteGraphicsSave](../../aspose.page.eps/psdocument/writegraphicssave/)() | Menulis penyimpanan status grafik saat ini (Lihat spesifikasi PostScript pada operator "gsave"). |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps)(Bitmap, Stream, PsSaveOptions) | Menyimpan objek Bitmap ke aliran keluaran EPS. |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_1)(Bitmap, string, PsSaveOptions) | Menyimpan objek Bitmap ke file EPS. |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_2)(Stream, Stream, PsSaveOptions) | Menyimpan gambar PNG/JPEG/TIFF/BMP/GIF/EMF dari input stream ke EPS output stream. |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_3)(string, string, PsSaveOptions) | Menyimpan gambar PNG/JPEG/TIFF/BMP/GIF/EMF dari file ke file EPS. |

### Lihat juga

* class [Document](../../aspose.page/document/)
* ruang nama [Aspose.Page.EPS](../../aspose.page.eps/)
* perakitan [Aspose.Page](../../)


