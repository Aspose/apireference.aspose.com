---
title: Class XpsDocument
second_title: Aspose.Page untuk Referensi .NET API
description: Aspose.Page.XPS.XpsDocument kelas. Kelas yang merangkum entitas utama dokumen XPS yang menyediakan metode manipulasi untuk setiap elemen XPS.
type: docs
weight: 470
url: /id/net/aspose.page.xps/xpsdocument/
---
## XpsDocument class

Kelas yang merangkum entitas utama dokumen XPS yang menyediakan metode manipulasi untuk setiap elemen XPS.

```csharp
public sealed class XpsDocument : Document, IDisposable
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [XpsDocument](xpsdocument/#constructor)() | Membuat dokumen XPS kosong dengan ukuran halaman default. |
| [XpsDocument](xpsdocument/#constructor_2)(string) | Membuka dokumen XPS yang ada di*path* . |
| [XpsDocument](xpsdocument/#constructor_1)(Stream, LoadOptions) | Memuat dokumen yang ada disimpan di*stream* sebagai dokumen XPS. |
| [XpsDocument](xpsdocument/#constructor_3)(string, LoadOptions) | Membuka dokumen yang ada terletak di*path* sebagai dokumen XPS. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [ActiveDocument](../../aspose.page.xps/xpsdocument/activedocument/) { get; } | Mendapat nomor dokumen aktif. |
| [ActivePage](../../aspose.page.xps/xpsdocument/activepage/) { get; } | Mendapat nomor halaman aktif dalam dokumen aktif. |
| [DocumentCount](../../aspose.page.xps/xpsdocument/documentcount/) { get; } | Mengembalikan jumlah dokumen di dalam paket XPS. |
| [JobPrintTicket](../../aspose.page.xps/xpsdocument/jobprintticket/) { get; set; } | Mengembalikan/mengatur tiket cetak pekerjaan dokumen |
| [Page](../../aspose.page.xps/xpsdocument/page/) { get; } | Mengembalikan sebuah[`XpsPage`](../../aspose.page.xps.xpsmodel/xpspage/) contoh untuk halaman aktif. |
| [PageCount](../../aspose.page.xps/xpsdocument/pagecount/) { get; } | Mengembalikan jumlah halaman dalam dokumen aktif. |
| [TotalPageCount](../../aspose.page.xps/xpsdocument/totalpagecount/) { get; } | Mengembalikan jumlah total halaman di semua dokumen di dalam dokumen XPS. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [Add&lt;T&gt;](../../aspose.page.xps/xpsdocument/add/)(T) | Menambahkan elemen konten (Kanvas, Jalur, atau Glyph) |
| [AddCanvas](../../aspose.page.xps/xpsdocument/addcanvas/)() | Menambahkan kanvas baru ke halaman aktif. |
| [AddDocument](../../aspose.page.xps/xpsdocument/adddocument/#adddocument)(bool) | Menambahkan dokumen kosong dengan ukuran halaman default. |
| [AddDocument](../../aspose.page.xps/xpsdocument/adddocument/#adddocument_1)(float, float, bool) | Menambahkan dokumen kosong dengan dimensi halaman pertama *width* Dan*height* . |
| [AddGlyphs](../../aspose.page.xps/xpsdocument/addglyphs/#addglyphs)(XpsFont, float, float, float, string) | Menambahkan mesin terbang baru ke halaman aktif. |
| [AddGlyphs](../../aspose.page.xps/xpsdocument/addglyphs/#addglyphs_1)(string, float, FontStyle, float, float, string) | Menambahkan mesin terbang baru ke halaman aktif. |
| [AddOutlineEntry](../../aspose.page.xps/xpsdocument/addoutlineentry/)(string, int, XpsHyperlinkTarget) | Menambahkan entri outline ke dokumen. |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage/#addpage_1)(bool) | Menambahkan halaman kosong ke dokumen dengan ukuran halaman default. |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage/#addpage)(XpsPage, bool) | Menambahkan halaman ke dokumen. |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage/#addpage_2)(float, float, bool) | Menambahkan halaman kosong ke dokumen dengan yang ditentukan*width* Dan*height* . |
| [AddPath](../../aspose.page.xps/xpsdocument/addpath/)(XpsPathGeometry) | Menambahkan jalur baru ke halaman aktif. |
| [CreateArcSegment](../../aspose.page.xps/xpsdocument/createarcsegment/)(PointF, SizeF, float, bool, XpsSweepDirection, bool) | Membuat segmen busur elips baru. |
| [CreateCanvas](../../aspose.page.xps/xpsdocument/createcanvas/)() | Membuat kanvas baru. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_5)(Color) | Membuat warna baru. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_6)(string, params float[]) | Membuat warna baru dalam ruang warna berbasis ICC. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor)(XpsIccProfile, params float[]) | Membuat warna baru dalam ruang warna berbasis ICC. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_3)(float, float, float) | Membuat warna baru di ruang warna scRGB. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_1)(int, int, int) | Membuat warna baru dalam ruang warna sRGB. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_4)(float, float, float, float) | Membuat warna baru di ruang warna scRGB. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_2)(int, int, int, int) | Membuat warna baru dalam ruang warna sRGB. |
| [CreateFont](../../aspose.page.xps/xpsdocument/createfont/#createfont)(Stream) | Membuat sumber daya font TrueType baru dari aliran. |
| [CreateFont](../../aspose.page.xps/xpsdocument/createfont/#createfont_1)(string, FontStyle) | Membuat sumber daya font TrueType baru. |
| [CreateGlyphs](../../aspose.page.xps/xpsdocument/createglyphs/#createglyphs)(XpsFont, float, float, float, string) | Membuat mesin terbang baru. |
| [CreateGlyphs](../../aspose.page.xps/xpsdocument/createglyphs/#createglyphs_1)(string, float, FontStyle, float, float, string) | Membuat mesin terbang baru. |
| [CreateGradientStop](../../aspose.page.xps/xpsdocument/creategradientstop/#creategradientstop_1)(Color, float) | Membuat perhentian gradien baru. |
| [CreateGradientStop](../../aspose.page.xps/xpsdocument/creategradientstop/#creategradientstop)(XpsColor, float) | Membuat perhentian gradien baru. |
| [CreateIccProfile](../../aspose.page.xps/xpsdocument/createiccprofile/#createiccprofile)(Stream) | Membuat sumber daya profil ICC baru dari*stream* . |
| [CreateIccProfile](../../aspose.page.xps/xpsdocument/createiccprofile/#createiccprofile_1)(string) | Membuat sumber daya profil ICC baru dari file profil ICC yang terletak di *iccProfilePath* . |
| [CreateImage](../../aspose.page.xps/xpsdocument/createimage/#createimage)(Stream) | Membuat sumber gambar baru dari*stream* . |
| [CreateImage](../../aspose.page.xps/xpsdocument/createimage/#createimage_1)(string) | Membuat sumber gambar baru dari file gambar yang terletak di*imagePath* . |
| [CreateImageBrush](../../aspose.page.xps/xpsdocument/createimagebrush/#createimagebrush_1)(string, RectangleF, RectangleF) | Membuat kuas gambar baru. |
| [CreateImageBrush](../../aspose.page.xps/xpsdocument/createimagebrush/#createimagebrush)(XpsImage, RectangleF, RectangleF) | Membuat kuas gambar baru. |
| [CreateLinearGradientBrush](../../aspose.page.xps/xpsdocument/createlineargradientbrush/#createlineargradientbrush_1)(PointF, PointF) | Membuat kuas gradien linier baru. |
| [CreateLinearGradientBrush](../../aspose.page.xps/xpsdocument/createlineargradientbrush/#createlineargradientbrush)(List&lt;XpsGradientStop&gt;, PointF, PointF) | Membuat kuas gradien linier baru. |
| [CreateMatrix](../../aspose.page.xps/xpsdocument/creatematrix/)(float, float, float, float, float, float) | Membuat matriks transformasi affine baru. |
| [CreatePath](../../aspose.page.xps/xpsdocument/createpath/)(XpsPathGeometry) | Membuat jalur baru. |
| [CreatePathFigure](../../aspose.page.xps/xpsdocument/createpathfigure/#createpathfigure)(PointF, bool) | Membuat figur jalur baru. |
| [CreatePathFigure](../../aspose.page.xps/xpsdocument/createpathfigure/#createpathfigure_1)(PointF, List&lt;XpsPathSegment&gt;, bool) | Membuat figur jalur baru. |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry/#createpathgeometry)() | Membuat geometri jalur baru. |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry/#createpathgeometry_1)(List&lt;XpsPathFigure&gt;) | Membuat geometri jalur baru dengan daftar angka jalur yang ditentukan. |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry/#createpathgeometry_2)(string) | Membuat geometri jalur baru yang ditentukan dengan bentuk singkat. |
| [CreatePolyBezierSegment](../../aspose.page.xps/xpsdocument/createpolybeziersegment/)(PointF[], bool) | Membuat satu set kurva Bézier kubik baru. |
| [CreatePolyLineSegment](../../aspose.page.xps/xpsdocument/createpolylinesegment/)(PointF[], bool) | Membuat gambar poligonal baru yang berisi jumlah simpul individual sembarang. |
| [CreatePolyQuadraticBezierSegment](../../aspose.page.xps/xpsdocument/createpolyquadraticbeziersegment/)(PointF[], bool) | Membuat satu set kurva Bézier kuadratik baru dari titik sebelumnya pada gambar jalur melalui set simpul, menggunakan titik kontrol yang ditentukan. |
| [CreateRadialGradientBrush](../../aspose.page.xps/xpsdocument/createradialgradientbrush/#createradialgradientbrush_1)(PointF, PointF, float, float) | Membuat sikat gradien radial baru. |
| [CreateRadialGradientBrush](../../aspose.page.xps/xpsdocument/createradialgradientbrush/#createradialgradientbrush)(List&lt;XpsGradientStop&gt;, PointF, PointF, float, float) | Membuat sikat gradien radial baru. |
| [CreateSolidColorBrush](../../aspose.page.xps/xpsdocument/createsolidcolorbrush/#createsolidcolorbrush_1)(Color) | Membuat kuas warna solid baru. |
| [CreateSolidColorBrush](../../aspose.page.xps/xpsdocument/createsolidcolorbrush/#createsolidcolorbrush)(XpsColor) | Membuat kuas warna solid baru. |
| [CreateVisualBrush](../../aspose.page.xps/xpsdocument/createvisualbrush/)(XpsContentElement, RectangleF, RectangleF) | Membuat kuas visual baru. |
| [Dispose](../../aspose.page.xps/xpsdocument/dispose/)() | Membuang instance. |
| [GetDocumentPrintTicket](../../aspose.page.xps/xpsdocument/getdocumentprintticket/)(int) | Mengembalikan tiket cetak dari dokumen yang diindeks oleh*documentIndex* . |
| [GetPagePrintTicket](../../aspose.page.xps/xpsdocument/getpageprintticket/)(int, int) | Mengembalikan tiket cetak dari halaman yang diindeks oleh*pageIndex* dalam dokumen yang diindeks oleh*documentIndex* . |
| [Insert&lt;T&gt;](../../aspose.page.xps/xpsdocument/insert/)(int, T) | Menyisipkan elemen (Canvas, Path atau Glyphs) ke halaman aktif di*index* posisi. |
| [InsertCanvas](../../aspose.page.xps/xpsdocument/insertcanvas/)(int) | Menyisipkan kanvas baru ke halaman aktif di*index* posisi. |
| [InsertDocument](../../aspose.page.xps/xpsdocument/insertdocument/#insertdocument)(int, bool) | Menyisipkan dokumen kosong dengan ukuran halaman default di*index* posisi. |
| [InsertDocument](../../aspose.page.xps/xpsdocument/insertdocument/#insertdocument_1)(int, float, float, bool) | Menyisipkan dokumen kosong dengan dimensi halaman pertama *width* Dan*height* pada*index* posisi. |
| [InsertGlyphs](../../aspose.page.xps/xpsdocument/insertglyphs/#insertglyphs)(int, XpsFont, float, float, float, string) | Menyisipkan mesin terbang baru ke halaman aktif di*index* posisi. |
| [InsertGlyphs](../../aspose.page.xps/xpsdocument/insertglyphs/#insertglyphs_1)(int, string, float, FontStyle, float, float, string) | Menyisipkan mesin terbang baru ke halaman aktif di*index* posisi. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage/#insertpage_1)(int, bool) | Menyisipkan halaman kosong ke dokumen dengan ukuran halaman default di*index* posisi. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage/#insertpage)(int, XpsPage, bool) | Menyisipkan halaman ke dokumen di*index* posisi. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage/#insertpage_2)(int, float, float, bool) | Menyisipkan halaman kosong ke dokumen dengan yang ditentukan*width* Dan*height* pada*index* posisi. |
| [InsertPath](../../aspose.page.xps/xpsdocument/insertpath/)(int, XpsPathGeometry) | Menyisipkan jalur baru ke halaman aktif di*index* posisi. |
| [Merge](../../aspose.page.xps/xpsdocument/merge/#merge_1)(string[], Stream) | Menggabungkan beberapa file XPS menjadi satu dokumen XPS. |
| [Merge](../../aspose.page.xps/xpsdocument/merge/#merge)(string[], Device, SaveOptions) | Menggabungkan dokumen XPS ke PDF menggunakan[`Device`](../../aspose.page/device/) contoh. |
| [Remove&lt;T&gt;](../../aspose.page.xps/xpsdocument/remove/)(T) | Menghapus elemen dari halaman aktif. |
| [RemoveAt](../../aspose.page.xps/xpsdocument/removeat/)(int) | Menghapus elemen di*index* posisi dari halaman aktif. |
| [RemoveDocumentAt](../../aspose.page.xps/xpsdocument/removedocumentat/)(int) | Menghapus dokumen di*index* posisi. |
| [RemovePage](../../aspose.page.xps/xpsdocument/removepage/)(XpsPage) | Menghapus halaman dari dokumen. |
| [RemovePageAt](../../aspose.page.xps/xpsdocument/removepageat/)(int) | Menghapus halaman dari dokumen di*index* posisi. |
| [Save](../../aspose.page.xps/xpsdocument/save/#save_1)(Stream) | Menyimpan dokumen XPS untuk streaming. |
| [Save](../../aspose.page.xps/xpsdocument/save/#save_2)(string) | Menyimpan dokumen XPS ke file XPS yang terletak di*path* . |
| override [Save](../../aspose.page.xps/xpsdocument/save/#save)(Device, SaveOptions) | Menyimpan dokumen menggunakan[`Device`](../../aspose.page/device/) contoh. |
| [SelectActiveDocument](../../aspose.page.xps/xpsdocument/selectactivedocument/)(int) | Memilih dokumen aktif untuk diedit. |
| [SelectActivePage](../../aspose.page.xps/xpsdocument/selectactivepage/)(int) | Memilih halaman dokumen yang aktif untuk diedit. |
| [SetDocumentPrintTicket](../../aspose.page.xps/xpsdocument/setdocumentprintticket/)(int, DocumentPrintTicket) | Menautkan*printTicket* ke dokumen yang diindeks oleh*documentIndex* . |
| [SetPagePrintTicket](../../aspose.page.xps/xpsdocument/setpageprintticket/)(int, int, PagePrintTicket) | Menautkan*printTicket* ke halaman yang diindeks oleh*pageIndex* dalam dokumen yang diindeks oleh*documentIndex* . |

### Lihat juga

* class [Document](../../aspose.page/document/)
* ruang nama [Aspose.Page.XPS](../../aspose.page.xps/)
* perakitan [Aspose.Page](../../)


