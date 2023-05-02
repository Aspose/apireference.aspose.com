---
title: Class Graphics
second_title: Aspose.Drawing untuk Referensi .NET API
description: System.Drawing.Graphics kelas. Mengenkapsulasi permukaan gambar.
type: docs
weight: 530
url: /id/net/system.drawing/graphics/
---
## Graphics class

Mengenkapsulasi permukaan gambar.

```csharp
public class Graphics : IDisposable
```

## Properti

| Nama | Keterangan |
| --- | --- |
| [Clip](../../system.drawing/graphics/clip/) { get; set; } | Mendapat atau menyetel aRegion yang membatasi wilayah gambar iniGraphics . |
| [ClipBounds](../../system.drawing/graphics/clipbounds/) { get; } | Mendapat a[`RectangleF`](../rectanglef/) struktur yang membatasi wilayah kliping ini`Graphics` . |
| [CompositingMode](../../system.drawing/graphics/compositingmode/) { get; set; } | Mendapat atau menyetel nilai yang menentukan cara gambar gabungan digambar ke siniGraphics . |
| [CompositingQuality](../../system.drawing/graphics/compositingquality/) { get; set; } | Mendapat atau menyetel kualitas rendering gambar komposit yang digambar ke siniGraphics . |
| [DpiX](../../system.drawing/graphics/dpix/) { get; } | Mendapat resolusi horizontal iniGraphics . |
| [DpiY](../../system.drawing/graphics/dpiy/) { get; } | Mendapat resolusi vertikal dari iniGraphics . |
| [InterpolationMode](../../system.drawing/graphics/interpolationmode/) { get; set; } | Mendapat atau menyetel mode interpolasi yang terkait dengan Grafik ini. |
| [IsClipEmpty](../../system.drawing/graphics/isclipempty/) { get; } | Mendapat nilai yang menunjukkan apakah wilayah kliping iniGraphics kosong. |
| [IsVisibleClipEmpty](../../system.drawing/graphics/isvisibleclipempty/) { get; } | Mendapat nilai yang menunjukkan apakah wilayah kliping terlihat dari iniGraphics kosong. |
| [PageScale](../../system.drawing/graphics/pagescale/) { get; set; } | Mendapat atau mengatur penskalaan antara unit dunia dan unit halaman untuk iniGraphics . |
| [PageUnit](../../system.drawing/graphics/pageunit/) { get; set; } | Mendapat atau menetapkan satuan ukuran yang digunakan untuk koordinat halaman dalam hal iniGraphics . |
| [PixelOffsetMode](../../system.drawing/graphics/pixeloffsetmode/) { get; set; } | Mendapat atau menyetel nilai yang menentukan bagaimana piksel diimbangi selama rendering iniGraphics . |
| [RenderingOrigin](../../system.drawing/graphics/renderingorigin/) { get; set; } | Mendapat atau menyetel asal rendering iniGraphics untuk dithering dan untuk sikat penetasan. |
| [SmoothingMode](../../system.drawing/graphics/smoothingmode/) { get; set; } | Mendapat atau menyetel kualitas rendering untuk Grafik ini. |
| [TextContrast](../../system.drawing/graphics/textcontrast/) { get; set; } | Mendapat atau menyetel nilai koreksi gamma untuk merender teks. |
| [TextRenderingHint](../../system.drawing/graphics/textrenderinghint/) { get; set; } | Mendapatkan atau menyetel mode rendering untuk teks yang terkait dengan iniGraphics . |
| [Transform](../../system.drawing/graphics/transform/) { get; set; } | Mendapatkan atau menyetel salinan transformasi dunia geometris untuk iniGraphics . |
| [VisibleClipBounds](../../system.drawing/graphics/visibleclipbounds/) { get; } | Mendapat persegi panjang pembatas dari wilayah kliping yang terlihat dari iniGraphics . |

## Metode

| Nama | Keterangan |
| --- | --- |
| static [FromHwnd](../../system.drawing/graphics/fromhwnd/)(IntPtr) | Membuat yang baruGraphics dari pegangan yang ditentukan ke jendela. |
| static [FromImage](../../system.drawing/graphics/fromimage/)(Image) | Membuat Grafik baru dari Gambar yang ditentukan. |
| [AddMetafileComment](../../system.drawing/graphics/addmetafilecomment/)(byte[]) | Menambahkan komentar ke arusMetafile . |
| [BeginContainer](../../system.drawing/graphics/begincontainer/#begincontainer)() | Menyimpan wadah grafik dengan status saat iniGraphics dan membuka serta menggunakan wadah grafis baru. |
| [BeginContainer](../../system.drawing/graphics/begincontainer/#begincontainer_1)(Rectangle, Rectangle, GraphicsUnit) | Menyimpan wadah grafik dengan status saat iniGraphics dan membuka serta menggunakan wadah grafik baru dengan transformasi skala yang ditentukan. |
| [BeginContainer](../../system.drawing/graphics/begincontainer/#begincontainer_2)(RectangleF, RectangleF, GraphicsUnit) | Menyimpan wadah grafik dengan status saat iniGraphics dan membuka serta menggunakan wadah grafik baru dengan transformasi skala yang ditentukan. |
| [Clear](../../system.drawing/graphics/clear/)(Color) | Menghapus seluruh permukaan gambar dan mengisinya dengan warna latar yang ditentukan. |
| [CopyFromScreen](../../system.drawing/graphics/copyfromscreen/#copyfromscreen_1)(Point, Point, Size) | Melakukan transfer bit-blok data warna, sesuai dengan persegi panjang piksel, dari layar ke permukaan gambarGraphics . |
| [CopyFromScreen](../../system.drawing/graphics/copyfromscreen/#copyfromscreen_2)(Point, Point, Size, CopyPixelOperation) | Melakukan transfer bit-blok data warna, sesuai dengan persegi panjang piksel, dari layar ke permukaan gambarGraphics . |
| [CopyFromScreen](../../system.drawing/graphics/copyfromscreen/#copyfromscreen)(int, int, int, int, Size, CopyPixelOperation) | Melakukan transfer bit-blok data warna, sesuai dengan persegi panjang piksel, dari layar ke permukaan gambarGraphics . |
| [Dispose](../../system.drawing/graphics/dispose/)() | Merilis semua sumber daya yang digunakan oleh Grafik ini. |
| [DrawArc](../../system.drawing/graphics/drawarc/#drawarc_1)(Pen, RectangleF, float, float) | Menggambar busur yang mewakili sebagian elips yang ditentukan oleh struktur RectangleF. |
| [DrawArc](../../system.drawing/graphics/drawarc/#drawarc)(Pen, float, float, float, float, float, float) | Menggambar busur yang mewakili sebagian elips yang ditentukan oleh sepasang koordinat, lebar, dan tinggi. |
| [DrawBezier](../../system.drawing/graphics/drawbezier/#drawbezier_1)(Pen, PointF, PointF, PointF, PointF) | Menggambar spline Bézier yang ditentukan oleh empat struktur PointF. |
| [DrawBezier](../../system.drawing/graphics/drawbezier/#drawbezier)(Pen, float, float, float, float, float, float, float, float) | Menggambar spline Bézier yang ditentukan oleh empat pasang koordinat berurutan yang mewakili titik. |
| [DrawBeziers](../../system.drawing/graphics/drawbeziers/#drawbeziers)(Pen, PointF[]) | Menggambar serangkaian Bézier splines dari arrayPoint struktur. |
| [DrawBeziers](../../system.drawing/graphics/drawbeziers/#drawbeziers_1)(Pen, Point[]) | Menggambar serangkaian Bézier splines dari arrayPointF struktur. |
| [DrawClosedCurve](../../system.drawing/graphics/drawclosedcurve/#drawclosedcurve)(Pen, PointF[]) | Menggambar spline kardinal tertutup yang ditentukan oleh larikPointF struktur. |
| [DrawClosedCurve](../../system.drawing/graphics/drawclosedcurve/#drawclosedcurve_2)(Pen, Point[]) | Menggambar spline kardinal tertutup yang ditentukan oleh larikPoint struktur. |
| [DrawClosedCurve](../../system.drawing/graphics/drawclosedcurve/#drawclosedcurve_1)(Pen, PointF[], float, FillMode) | Menggambar spline kardinal tertutup yang ditentukan oleh larik struktur PointF menggunakan tegangan tertentu. |
| [DrawClosedCurve](../../system.drawing/graphics/drawclosedcurve/#drawclosedcurve_3)(Pen, Point[], float, FillMode) | Menggambar spline kardinal tertutup yang ditentukan oleh larikPoint struktur menggunakan tegangan tertentu. |
| [DrawCurve](../../system.drawing/graphics/drawcurve/#drawcurve)(Pen, PointF[]) | Menggambar spline kardinal melalui array tertentuPointF struktur. |
| [DrawCurve](../../system.drawing/graphics/drawcurve/#drawcurve_4)(Pen, Point[]) | Menggambar spline kardinal melalui array tertentuPoint struktur. |
| [DrawCurve](../../system.drawing/graphics/drawcurve/#drawcurve_3)(Pen, PointF[], float) | Menggambar spline kardinal melalui array tertentuPointF struktur menggunakan tegangan tertentu. |
| [DrawCurve](../../system.drawing/graphics/drawcurve/#drawcurve_6)(Pen, Point[], float) | Menggambar spline kardinal melalui array tertentuPoint struktur menggunakan tegangan tertentu. |
| [DrawCurve](../../system.drawing/graphics/drawcurve/#drawcurve_1)(Pen, PointF[], int, int) | Menggambar spline kardinal melalui array tertentuPointF struktur menggunakan tegangan tertentu. Gambar dimulai dari awal array. |
| [DrawCurve](../../system.drawing/graphics/drawcurve/#drawcurve_2)(Pen, PointF[], int, int, float) | Menggambar spline kardinal melalui array tertentuPointF struktur menggunakan tegangan tertentu. Gambar dimulai dari awal array. |
| [DrawCurve](../../system.drawing/graphics/drawcurve/#drawcurve_5)(Pen, Point[], int, int, float) | Menggambar spline kardinal melalui array tertentuPoint struktur menggunakan tegangan tertentu. Gambar dimulai dari awal array. |
| [DrawEllipse](../../system.drawing/graphics/drawellipse/#drawellipse_1)(Pen, RectangleF) | Menggambar elips yang ditentukan oleh RectangleF. yang membatasi |
| [DrawEllipse](../../system.drawing/graphics/drawellipse/#drawellipse)(Pen, float, float, float, float) | Menggambar elips yang ditentukan oleh persegi panjang pembatas yang ditentukan oleh sepasang koordinat, tinggi, dan lebar. |
| [DrawIcon](../../system.drawing/graphics/drawicon/#drawicon_1)(Icon, Rectangle) | Menggambar gambar yang diwakili oleh yang ditentukanIcon dalam wilayah yang ditentukan oleh aRectangle struktur. |
| [DrawIcon](../../system.drawing/graphics/drawicon/#drawicon)(Icon, int, int) | Menggambar gambar yang diwakili oleh yang ditentukanIcon pada koordinat yang ditentukan. |
| [DrawIconUnstretched](../../system.drawing/graphics/drawiconunstretched/)(Icon, Rectangle) | Menggambar gambar yang diwakili oleh yang ditentukanIcon tanpa menskalakan gambar. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_6)(Image, Point) | Menggambar Gambar yang ditentukan, menggunakan ukuran fisik aslinya, di lokasi yang ditentukan. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_7)(Image, PointF) | Menggambar yang ditentukanImage , menggunakan ukuran fisik aslinya, di lokasi yang ditentukan. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_8)(Image, PointF[]) | Menggambar yang ditentukanImage di lokasi yang ditentukan dan dengan bentuk dan ukuran yang ditentukan. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_11)(Image, Point[]) | Menggambar yang ditentukanЕ:Image di lokasi yang ditentukan dan dengan bentuk dan ukuran yang ditentukan. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_14)(Image, Rectangle) | Menggambar Gambar yang ditentukan di lokasi yang ditentukan dan dengan ukuran yang ditentukan. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_20)(Image, RectangleF) | Menggambar Gambar yang ditentukan di lokasi yang ditentukan dan dengan ukuran yang ditentukan. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_3)(Image, float, float) | Menggambar yang ditentukanImage , menggunakan ukuran fisik aslinya, di lokasi yang ditentukan. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage)(Image, int, int) | Menggambar gambar yang ditentukan, menggunakan ukuran fisik aslinya, di lokasi yang ditentukan oleh pasangan koordinat. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_9)(Image, PointF[], RectangleF, GraphicsUnit) | Menggambar bagian yang ditentukan dari Gambar yang ditentukan di lokasi yang ditentukan dan dengan ukuran yang ditentukan. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_12)(Image, Point[], Rectangle, GraphicsUnit) | Menggambar bagian yang ditentukan dari yang ditentukanImage di lokasi yang ditentukan dan dengan ukuran yang ditentukan. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_19)(Image, Rectangle, Rectangle, GraphicsUnit) | Menggambar bagian yang ditentukan dari Gambar yang ditentukan di lokasi yang ditentukan dan dengan ukuran yang ditentukan. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_21)(Image, RectangleF, RectangleF, GraphicsUnit) | Menggambar bagian yang ditentukan dari Gambar yang ditentukan di lokasi yang ditentukan dan dengan ukuran yang ditentukan. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_4)(Image, float, float, float, float) | Menggambar yang ditentukanImage , menggunakan ukuran fisik aslinya, di lokasi yang ditentukan dan dengan ukuran yang ditentukan. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_5)(Image, float, float, RectangleF, GraphicsUnit) | Menggambar sebagian gambar di lokasi tertentu. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_1)(Image, int, int, int, int) | Menggambar Gambar yang ditentukan di lokasi yang ditentukan dan dengan ukuran yang ditentukan. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_2)(Image, int, int, Rectangle, GraphicsUnit) | Menggambar sebagian gambar di lokasi tertentu. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_10)(Image, PointF[], RectangleF, GraphicsUnit, ImageAttributes) | Menggambar bagian yang ditentukan dari Gambar yang ditentukan di lokasi yang ditentukan dan dengan ukuran yang ditentukan. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_13)(Image, Point[], Rectangle, GraphicsUnit, ImageAttributes) | Menggambar bagian yang ditentukan dari yang ditentukanImage di lokasi yang ditentukan dan dengan ukuran yang ditentukan. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_17)(Image, Rectangle, float, float, float, float, GraphicsUnit) | Menggambar bagian yang ditentukan dari yang ditentukanImage di lokasi yang ditentukan dan dengan ukuran yang ditentukan. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_15)(Image, Rectangle, int, int, int, int, GraphicsUnit) | Menggambar bagian yang ditentukan dari yang ditentukanImage di lokasi yang ditentukan dan dengan ukuran yang ditentukan. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_18)(Image, Rectangle, float, float, float, float, GraphicsUnit, ImageAttributes) | Menggambar bagian yang ditentukan dari yang ditentukanImage di lokasi yang ditentukan dan dengan ukuran yang ditentukan. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_16)(Image, Rectangle, int, int, int, int, GraphicsUnit, ImageAttributes) | Menggambar bagian yang ditentukan dari Gambar yang ditentukan di lokasi yang ditentukan dan dengan ukuran yang ditentukan. |
| [DrawImageUnscaled](../../system.drawing/graphics/drawimageunscaled/#drawimageunscaled_2)(Image, Point) | Menggambar gambar tertentu menggunakan ukuran fisik aslinya di lokasi tertentu. |
| [DrawImageUnscaled](../../system.drawing/graphics/drawimageunscaled/#drawimageunscaled_3)(Image, Rectangle) | Menggambar gambar tertentu menggunakan ukuran fisik aslinya di lokasi tertentu. |
| [DrawImageUnscaled](../../system.drawing/graphics/drawimageunscaled/#drawimageunscaled)(Image, int, int) | Menggambar gambar yang ditentukan menggunakan ukuran fisik aslinya di lokasi yang ditentukan oleh pasangan koordinat. |
| [DrawImageUnscaled](../../system.drawing/graphics/drawimageunscaled/#drawimageunscaled_1)(Image, int, int, int, int) | Menggambar gambar yang ditentukan menggunakan ukuran fisik aslinya di lokasi yang ditentukan oleh pasangan koordinat. |
| [DrawImageUnscaledAndClipped](../../system.drawing/graphics/drawimageunscaledandclipped/)(Image, Rectangle) | Menggambar gambar yang ditentukan tanpa penskalaan dan memotongnya, jika perlu, agar sesuai dengan persegi panjang yang ditentukan. |
| [DrawLine](../../system.drawing/graphics/drawline/#drawline_2)(Pen, Point, Point) | Menggambar garis yang menghubungkan duaPoint struktur. |
| [DrawLine](../../system.drawing/graphics/drawline/#drawline_3)(Pen, PointF, PointF) | Menggambar garis yang menghubungkan dua struktur PointF. |
| [DrawLine](../../system.drawing/graphics/drawline/#drawline_1)(Pen, float, float, float, float) | Menggambar garis yang menghubungkan dua titik yang ditentukan oleh pasangan koordinat. |
| [DrawLine](../../system.drawing/graphics/drawline/#drawline)(Pen, int, int, int, int) | Menggambar garis yang menghubungkan dua titik yang ditentukan oleh pasangan koordinat. |
| [DrawLines](../../system.drawing/graphics/drawlines/#drawlines)(Pen, PointF[]) | Menggambar serangkaian segmen garis yang menghubungkan arrayPointF struktur. |
| [DrawLines](../../system.drawing/graphics/drawlines/#drawlines_1)(Pen, Point[]) | Menggambar serangkaian segmen garis yang menghubungkan arrayPoint struktur. |
| [DrawPath](../../system.drawing/graphics/drawpath/)(Pen, GraphicsPath) | Menggambar GraphicsPath. |
| [DrawPie](../../system.drawing/graphics/drawpie/#drawpie_1)(Pen, RectangleF, float, float) | Menggambar bentuk pai yang ditentukan oleh elips yang ditentukan oleh struktur RectangleF dan dua garis radial. |
| [DrawPie](../../system.drawing/graphics/drawpie/#drawpie)(Pen, float, float, float, float, float, float) | Menggambar bentuk pai yang ditentukan oleh elips yang ditentukan oleh pasangan koordinat, lebar, tinggi, dan dua garis radial. |
| [DrawPolygon](../../system.drawing/graphics/drawpolygon/#drawpolygon)(Pen, PointF[]) | Menggambar poligon yang ditentukan oleh larik struktur PointF. |
| [DrawPolygon](../../system.drawing/graphics/drawpolygon/#drawpolygon_1)(Pen, Point[]) | Menggambar poligon yang ditentukan oleh larikPoint struktur. |
| [DrawRectangle](../../system.drawing/graphics/drawrectangle/#drawrectangle_2)(Pen, Rectangle) | Menggambar persegi panjang yang ditentukan oleh struktur Persegi Panjang. |
| [DrawRectangle](../../system.drawing/graphics/drawrectangle/#drawrectangle_1)(Pen, float, float, float, float) | Menggambar persegi panjang yang ditentukan oleh pasangan koordinat, lebar, dan tinggi. |
| [DrawRectangle](../../system.drawing/graphics/drawrectangle/#drawrectangle)(Pen, int, int, int, int) | Menggambar persegi panjang yang ditentukan oleh pasangan koordinat, lebar, dan tinggi. |
| [DrawRectangles](../../system.drawing/graphics/drawrectangles/#drawrectangles)(Pen, RectangleF[]) | Menggambar serangkaian persegi panjang yang ditentukan olehRectangleF struktur. |
| [DrawRectangles](../../system.drawing/graphics/drawrectangles/#drawrectangles_1)(Pen, Rectangle[]) | Menggambar serangkaian persegi panjang yang ditentukan olehRectangle struktur. |
| [DrawString](../../system.drawing/graphics/drawstring/#drawstring_2)(string, Font, Brush, PointF) | Menggambar string teks yang ditentukan di lokasi yang ditentukan dengan yang ditentukanBrush danFont objek. |
| [DrawString](../../system.drawing/graphics/drawstring/#drawstring_4)(string, Font, Brush, RectangleF) | Menggambar string teks yang ditentukan dalam persegi panjang yang ditentukan dengan yang ditentukanBrush danFont objek menggunakan atribut pemformatan yang ditentukanStringFormat . |
| [DrawString](../../system.drawing/graphics/drawstring/#drawstring)(string, Font, Brush, float, float) | Menggambar string teks yang ditentukan di lokasi yang ditentukan dengan yang ditentukanBrush DanFont objek. |
| [DrawString](../../system.drawing/graphics/drawstring/#drawstring_3)(string, Font, Brush, PointF, StringFormat) | Menggambar string teks yang ditentukan di lokasi yang ditentukan dengan yang ditentukanBrush dan Font objek menggunakan atribut pemformatan yang ditentukanStringFormat . |
| [DrawString](../../system.drawing/graphics/drawstring/#drawstring_5)(string, Font, Brush, RectangleF, StringFormat) | Menggambar string teks yang ditentukan dalam persegi panjang yang ditentukan dengan yang ditentukanBrush danFont objek menggunakan atribut pemformatan yang ditentukanStringFormat . |
| [DrawString](../../system.drawing/graphics/drawstring/#drawstring_1)(string, Font, Brush, float, float, StringFormat) | Menggambar string teks yang ditentukan di lokasi yang ditentukan dengan yang ditentukanBrush dan Font objek menggunakan atribut pemformatan yang ditentukanStringFormat . |
| [EndContainer](../../system.drawing/graphics/endcontainer/)(GraphicsContainer) | Menutup penampung grafik saat ini dan memulihkan keadaan iniGraphics ke negara disimpan oleh panggilan keBeginContainer metode. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile)(Metafile, Point, EnumerateMetafileProc) | Mengirim catatan dalam yang ditentukan[`Metafile`](../../system.drawing.imaging/metafile/) , satu per satu, ke metode callback untuk ditampilkan pada titik tertentu. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_6)(Metafile, PointF, EnumerateMetafileProc) | Mengirim catatan dalam yang ditentukan[`Metafile`](../../system.drawing.imaging/metafile/) , satu per satu, ke metode callback untuk ditampilkan pada titik tertentu. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_12)(Metafile, PointF[], EnumerateMetafileProc) | Mengirim catatan dalam yang ditentukan[`Metafile`](../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam jajaran genjang yang ditentukan. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_18)(Metafile, Point[], EnumerateMetafileProc) | Mengirim catatan dalam yang ditentukan[`Metafile`](../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam jajaran genjang yang ditentukan. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_24)(Metafile, Rectangle, EnumerateMetafileProc) | Mengirim catatan yang ditentukan[`Metafile`](../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam persegi panjang tertentu. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_30)(Metafile, RectangleF, EnumerateMetafileProc) | Mengirim catatan yang ditentukan[`Metafile`](../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam persegi panjang tertentu. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_1)(Metafile, Point, EnumerateMetafileProc, IntPtr) | Mengirim catatan dalam yang ditentukan[`Metafile`](../../system.drawing.imaging/metafile/) , satu per satu, ke metode callback untuk ditampilkan pada titik tertentu. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_7)(Metafile, PointF, EnumerateMetafileProc, IntPtr) | Mengirim catatan dalam yang ditentukan[`Metafile`](../../system.drawing.imaging/metafile/) , satu per satu, ke metode callback untuk ditampilkan pada titik tertentu. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_13)(Metafile, PointF[], EnumerateMetafileProc, IntPtr) | Mengirim catatan dalam yang ditentukan[`Metafile`](../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam jajaran genjang yang ditentukan. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_19)(Metafile, Point[], EnumerateMetafileProc, IntPtr) | Mengirim catatan dalam yang ditentukan[`Metafile`](../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam jajaran genjang yang ditentukan. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_25)(Metafile, Rectangle, EnumerateMetafileProc, IntPtr) | Mengirim catatan yang ditentukan[`Metafile`](../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam persegi panjang tertentu. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_31)(Metafile, RectangleF, EnumerateMetafileProc, IntPtr) | Mengirim catatan yang ditentukan[`Metafile`](../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam persegi panjang tertentu. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_2)(Metafile, Point, EnumerateMetafileProc, IntPtr, ImageAttributes) | Mengirim catatan dalam yang ditentukan[`Metafile`](../../system.drawing.imaging/metafile/) satu per satu, ke metode panggilan balik untuk ditampilkan pada titik tertentu menggunakan atribut gambar tertentu. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_3)(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc) | Mengirim catatan dalam kotak yang dipilih dari a[`Metafile`](../../system.drawing.imaging/metafile/) , satu per satu, ke metode callback untuk ditampilkan pada titik tertentu. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_8)(Metafile, PointF, EnumerateMetafileProc, IntPtr, ImageAttributes) | Mengirim catatan dalam yang ditentukan[`Metafile`](../../system.drawing.imaging/metafile/) , satu per satu, ke metode callback untuk ditampilkan pada titik tertentu menggunakan atribut gambar tertentu. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_9)(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc) | Mengirim catatan dalam kotak yang dipilih dari a[`Metafile`](../../system.drawing.imaging/metafile/) , satu per satu, ke metode callback untuk ditampilkan pada titik tertentu. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_14)(Metafile, PointF[], EnumerateMetafileProc, IntPtr, ImageAttributes) | Mengirim catatan dalam yang ditentukan[`Metafile`](../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam jajaran genjang tertentu menggunakan atribut gambar tertentu. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_15)(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc) | Mengirim catatan dalam kotak yang dipilih dari S[`Metafile`](../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam jajaran genjang yang ditentukan. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_20)(Metafile, Point[], EnumerateMetafileProc, IntPtr, ImageAttributes) | Mengirim catatan dalam yang ditentukan[`Metafile`](../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam jajaran genjang tertentu menggunakan atribut gambar tertentu. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_21)(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc) | Mengirim catatan dalam kotak yang dipilih dari a[`Metafile`](../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam jajaran genjang yang ditentukan. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_26)(Metafile, Rectangle, EnumerateMetafileProc, IntPtr, ImageAttributes) | Mengirim catatan yang ditentukan[`Metafile`](../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam persegi panjang tertentu menggunakan atribut gambar tertentu. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_27)(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc) | Mengirim rekaman persegi panjang yang dipilih dari a[`Metafile`](../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam persegi panjang tertentu. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_32)(Metafile, RectangleF, EnumerateMetafileProc, IntPtr, ImageAttributes) | Mengirim catatan yang ditentukan[`Metafile`](../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam persegi panjang tertentu menggunakan atribut gambar tertentu. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_33)(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc) | Mengirim rekaman persegi panjang yang dipilih dari a[`Metafile`](../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam persegi panjang tertentu. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_4)(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) | Mengirim catatan dalam kotak yang dipilih dari a[`Metafile`](../../system.drawing.imaging/metafile/) , satu per satu, ke metode callback untuk ditampilkan pada titik tertentu. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_10)(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) | Mengirim catatan dalam kotak yang dipilih dari a[`Metafile`](../../system.drawing.imaging/metafile/) , satu per satu, ke metode callback untuk ditampilkan pada titik tertentu. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_16)(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) | Mengirim catatan dalam kotak yang dipilih dari a[`Metafile`](../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam jajaran genjang yang ditentukan. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_22)(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) | Mengirim catatan dalam kotak yang dipilih dari a[`Metafile`](../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam jajaran genjang yang ditentukan. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_28)(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) | Mengirim rekaman persegi panjang yang dipilih dari a[`Metafile`](../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam persegi panjang tertentu. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_34)(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) | Mengirim rekaman persegi panjang yang dipilih dari a[`Metafile`](../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam persegi panjang tertentu. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_5)(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | Mengirim catatan dalam kotak yang dipilih dari a[`Metafile`](../../system.drawing.imaging/metafile/) satu per satu, ke metode panggilan balik untuk ditampilkan pada titik tertentu menggunakan atribut gambar tertentu. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_11)(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | Mengirim catatan dalam kotak yang dipilih dari a[`Metafile`](../../system.drawing.imaging/metafile/) satu per satu, ke metode panggilan balik untuk ditampilkan pada titik tertentu menggunakan atribut gambar tertentu. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_17)(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | Mengirim catatan dalam kotak yang dipilih dari a[`Metafile`](../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam jajaran genjang tertentu menggunakan atribut gambar tertentu. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_23)(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | Mengirim catatan dalam kotak yang dipilih dari a[`Metafile`](../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam jajaran genjang tertentu menggunakan atribut gambar tertentu. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_29)(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | Mengirim rekaman persegi panjang yang dipilih dari a[`Metafile`](../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam persegi panjang tertentu menggunakan atribut gambar tertentu. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_35)(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | Mengirim rekaman persegi panjang yang dipilih dari a[`Metafile`](../../system.drawing.imaging/metafile/) , satu per satu, ke metode panggilan balik untuk ditampilkan dalam persegi panjang tertentu menggunakan atribut gambar tertentu. |
| [ExcludeClip](../../system.drawing/graphics/excludeclip/#excludeclip)(Rectangle) | Memperbarui wilayah klip iniGraphics untuk mengecualikan area yang ditentukan oleh aRectangle |
| [ExcludeClip](../../system.drawing/graphics/excludeclip/#excludeclip_1)(Region) | Memperbarui wilayah klip iniGraphics untuk mengecualikan area yang ditentukan oleh aRegion . |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve/#fillclosedcurve)(Brush, PointF[]) | Mengisi bagian dalam kurva spline kardinal tertutup yang ditentukan oleh larikPointF struktur. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve/#fillclosedcurve_3)(Brush, Point[]) | Mengisi bagian dalam kurva spline kardinal tertutup yang ditentukan oleh larikPoint struktur. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve/#fillclosedcurve_1)(Brush, PointF[], FillMode) | Mengisi bagian dalam kurva spline kardinal tertutup yang ditentukan oleh larikPointF struktur menggunakan mode isian yang ditentukan. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve/#fillclosedcurve_4)(Brush, Point[], FillMode) | Mengisi bagian dalam kurva spline kardinal tertutup yang ditentukan oleh larikPoint struktur menggunakan mode isian yang ditentukan. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve/#fillclosedcurve_2)(Brush, PointF[], FillMode, float) | Mengisi interior kurva spline kardinal tertutup yang ditentukan oleh larik struktur PointF menggunakan mode pengisian dan ketegangan yang ditentukan. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve/#fillclosedcurve_5)(Brush, Point[], FillMode, float) | Mengisi bagian dalam kurva spline kardinal tertutup yang ditentukan oleh larikPoint struktur menggunakan mode isian yang ditentukan. |
| [FillEllipse](../../system.drawing/graphics/fillellipse/#fillellipse_1)(Brush, RectangleF) | Mengisi interior elips yang ditentukan oleh persegi panjang pembatas yang ditentukan oleh struktur RectangleF. |
| [FillEllipse](../../system.drawing/graphics/fillellipse/#fillellipse)(Brush, float, float, float, float) | Mengisi bagian dalam elips yang ditentukan oleh persegi panjang pembatas yang ditentukan oleh sepasang koordinat, lebar, dan tinggi. |
| [FillPath](../../system.drawing/graphics/fillpath/)(Brush, GraphicsPath) | Mengisi bagian dalam GraphicsPath. |
| [FillPie](../../system.drawing/graphics/fillpie/#fillpie_2)(Brush, Rectangle, float, float) | Mengisi interior bagian pai yang ditentukan oleh elips yang ditentukan oleh struktur Rectangle dan dua garis radial. |
| [FillPie](../../system.drawing/graphics/fillpie/#fillpie_1)(Brush, float, float, float, float, float, float) | Mengisi interior bagian pai yang ditentukan oleh elips yang ditentukan oleh sepasang koordinat, lebar, tinggi, dan dua garis radial. |
| [FillPie](../../system.drawing/graphics/fillpie/#fillpie)(Brush, int, int, int, int, int, int) | Mengisi interior bagian pai yang ditentukan oleh elips yang ditentukan oleh sepasang koordinat, lebar, tinggi, dan dua garis radial. |
| [FillPolygon](../../system.drawing/graphics/fillpolygon/#fillpolygon)(Brush, PointF[]) | Mengisi bagian dalam poligon yang ditentukan oleh larik titik yang ditentukan olehPointF struktur. |
| [FillPolygon](../../system.drawing/graphics/fillpolygon/#fillpolygon_2)(Brush, Point[]) | Mengisi bagian dalam poligon yang ditentukan oleh larik titik yang ditentukan olehPoint struktur. |
| [FillPolygon](../../system.drawing/graphics/fillpolygon/#fillpolygon_1)(Brush, PointF[], FillMode) | Mengisi bagian dalam poligon yang ditentukan oleh larik titik yang ditentukan oleh struktur PointF menggunakan mode isian yang ditentukan. |
| [FillPolygon](../../system.drawing/graphics/fillpolygon/#fillpolygon_3)(Brush, Point[], FillMode) | Mengisi bagian dalam poligon yang ditentukan oleh larik titik yang ditentukan olehPoint struktur menggunakan mode isian yang ditentukan. |
| [FillRectangle](../../system.drawing/graphics/fillrectangle/#fillrectangle_1)(Brush, RectangleF) | Mengisi interior persegi panjang yang ditentukan oleh struktur RectangleF. |
| [FillRectangle](../../system.drawing/graphics/fillrectangle/#fillrectangle)(Brush, float, float, float, float) | Mengisi bagian dalam persegi panjang yang ditentukan oleh sepasang koordinat, lebar, dan tinggi. |
| [FillRectangles](../../system.drawing/graphics/fillrectangles/#fillrectangles)(Brush, RectangleF[]) | Mengisi interior rangkaian persegi panjang yang ditentukan olehRectangleF struktur. |
| [FillRectangles](../../system.drawing/graphics/fillrectangles/#fillrectangles_1)(Brush, Rectangle[]) | Mengisi interior rangkaian persegi panjang yang ditentukan olehRectangle struktur. |
| [FillRegion](../../system.drawing/graphics/fillregion/)(Brush, Region) | Mengisi interior suatu Wilayah. |
| [Flush](../../system.drawing/graphics/flush/#flush)() | Memaksa eksekusi semua operasi grafik yang tertunda dan segera kembali tanpa menunggu operasi selesai. |
| [Flush](../../system.drawing/graphics/flush/#flush_1)(FlushIntention) | Memaksa eksekusi semua operasi grafik yang tertunda dengan metode menunggu atau tidak menunggu, seperti yang ditentukan, untuk kembali sebelum operasi selesai. |
| [GetHdc](../../system.drawing/graphics/gethdc/)() | Mendapat pegangan ke konteks perangkat yang terkait dengan iniGraphics . |
| [GetNearestColor](../../system.drawing/graphics/getnearestcolor/)(Color) | Mendapat warna terdekat dengan yang ditentukanColor struktur. |
| [IntersectClip](../../system.drawing/graphics/intersectclip/#intersectclip)(Rectangle) | Memperbarui wilayah klip iniGraphics ke persimpangan wilayah klip saat ini dan yang ditentukanRectangle struktur. |
| [IntersectClip](../../system.drawing/graphics/intersectclip/#intersectclip_1)(RectangleF) | Memperbarui wilayah klip iniGraphics ke persimpangan wilayah klip saat ini dan yang ditentukanRectangleF struktur. |
| [IntersectClip](../../system.drawing/graphics/intersectclip/#intersectclip_2)(Region) | Memperbarui wilayah klip iniGraphics ke persimpangan wilayah klip saat ini dan yang ditentukanRegion . |
| [IsVisible](../../system.drawing/graphics/isvisible/#isvisible_4)(Point) | Menunjukkan apakah yang ditentukanPoint struktur terkandung dalam wilayah klip terlihat iniGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible/#isvisible_5)(PointF) | Menunjukkan apakah yang ditentukanPointF struktur terkandung dalam wilayah klip terlihat iniGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible/#isvisible_6)(Rectangle) | Menunjukkan apakah persegi panjang ditentukan oleh aRectangle struktur terkandung dalam wilayah klip terlihat iniGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible/#isvisible_7)(RectangleF) | Menunjukkan apakah persegi panjang ditentukan oleh aRectangleF struktur terkandung dalam wilayah klip terlihat iniGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible/#isvisible_2)(float, float) | Menunjukkan apakah titik yang ditentukan oleh sepasang koordinat terdapat dalam wilayah klip yang terlihat iniGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible/#isvisible)(int, int) | Menunjukkan apakah titik yang ditentukan oleh sepasang koordinat terdapat dalam wilayah klip yang terlihat iniGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible/#isvisible_3)(float, float, float, float) | Menunjukkan apakah persegi panjang yang ditentukan oleh sepasang koordinat, lebar, dan tinggi terkandung dalam wilayah klip yang terlihat iniGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible/#isvisible_1)(int, int, int, int) | Menunjukkan apakah persegi panjang yang ditentukan oleh sepasang koordinat, lebar, dan tinggi terkandung dalam wilayah klip yang terlihat iniGraphics . |
| [MeasureCharacterRanges](../../system.drawing/graphics/measurecharacterranges/)(string, Font, RectangleF, StringFormat) | Mendapat arrayRegion objek, yang masing-masing membatasi rentang posisi karakter dalam string yang ditentukan. |
| [MeasureString](../../system.drawing/graphics/measurestring/#measurestring)(string, Font) | Mengukur string yang ditentukan saat digambar dengan yang ditentukanFont . |
| [MeasureString](../../system.drawing/graphics/measurestring/#measurestring_1)(string, Font, int) | Mengukur string yang ditentukan saat digambar dengan yang ditentukanFont . |
| [MeasureString](../../system.drawing/graphics/measurestring/#measurestring_4)(string, Font, SizeF) | Mengukur string yang ditentukan saat digambar dengan yang ditentukanFont . |
| [MeasureString](../../system.drawing/graphics/measurestring/#measurestring_2)(string, Font, int, StringFormat) | Mengukur string yang ditentukan saat digambar dengan yang ditentukanFont dan diformat dengan yang ditentukanStringFormat . |
| [MeasureString](../../system.drawing/graphics/measurestring/#measurestring_3)(string, Font, PointF, StringFormat) | Mengukur string yang ditentukan saat digambar dengan yang ditentukanFont dan diformat dengan yang ditentukanStringFormat . |
| [MeasureString](../../system.drawing/graphics/measurestring/#measurestring_5)(string, Font, SizeF, StringFormat) | Mengukur string yang ditentukan saat digambar dengan yang ditentukanFont dan diformat dengan yang ditentukanStringFormat . |
| [MeasureString](../../system.drawing/graphics/measurestring/#measurestring_6)(string, Font, SizeF, StringFormat, out int, out int) | Mengukur string yang ditentukan saat digambar dengan yang ditentukanFont dan diformat dengan yang ditentukanStringFormat . |
| [MultiplyTransform](../../system.drawing/graphics/multiplytransform/#multiplytransform)(Matrix) | Mengalikan transformasi dunia iniGraphics dan ditentukanMatrix . |
| [MultiplyTransform](../../system.drawing/graphics/multiplytransform/#multiplytransform_1)(Matrix, MatrixOrder) | Mengalikan transformasi dunia iniGraphics dan ditentukan ituMatrix dalam urutan yang ditentukan. |
| [ReleaseHdc](../../system.drawing/graphics/releasehdc/#releasehdc)() | Merilis pegangan konteks perangkat yang diperoleh dari panggilan sebelumnya ke GetHdc metode iniGraphics . |
| [ReleaseHdc](../../system.drawing/graphics/releasehdc/#releasehdc_1)(IntPtr) | Merilis pegangan konteks perangkat yang diperoleh dari panggilan sebelumnya keGetHdc method iniGraphics . |
| [ResetClip](../../system.drawing/graphics/resetclip/)() | Mereset wilayah klip iniGraphics ke wilayah tak terbatas. |
| [ResetTransform](../../system.drawing/graphics/resettransform/)() | Mereset matriks transformasi dunia iniGraphics ke matriks identitas. |
| [Restore](../../system.drawing/graphics/restore/)(GraphicsState) | Mengembalikan keadaan ini`Graphics` ke negara bagian yang diwakili oleh a[`GraphicsState`](../../system.drawing.drawing2d/graphicsstate/) . |
| [RotateTransform](../../system.drawing/graphics/rotatetransform/#rotatetransform)(float) | Menerapkan rotasi yang ditentukan ke matriks transformasi iniGraphics . |
| [RotateTransform](../../system.drawing/graphics/rotatetransform/#rotatetransform_1)(float, MatrixOrder) | Menerapkan rotasi yang ditentukan ke matriks transformasi iniGraphics dalam urutan yang ditentukan. |
| [Save](../../system.drawing/graphics/save/)() | Menyimpan status saat ini`Graphics` dan mengidentifikasi status tersimpan dengan a[`GraphicsState`](../../system.drawing.drawing2d/graphicsstate/) . |
| [ScaleTransform](../../system.drawing/graphics/scaletransform/#scaletransform)(float, float) | Menerapkan operasi penskalaan yang ditentukan ke matriks transformasi iniGraphics dengan menambahkan it ke matriks transformasi objek. |
| [ScaleTransform](../../system.drawing/graphics/scaletransform/#scaletransform_1)(float, float, MatrixOrder) | Menerapkan operasi penskalaan yang ditentukan ke matriks transformasi iniGraphics dalam urutan yang ditentukan. |
| [SetClip](../../system.drawing/graphics/setclip/#setclip_2)(Graphics) | Mengatur wilayah kliping ini`Graphics` ke properti Clip yang ditentukan`Graphics` |
| [SetClip](../../system.drawing/graphics/setclip/#setclip)(GraphicsPath) | Mengatur wilayah kliping ini`Graphics` ke yang ditentukan[`GraphicsPath`](../../system.drawing.drawing2d/graphicspath/) . |
| [SetClip](../../system.drawing/graphics/setclip/#setclip_4)(Rectangle) | Mengatur wilayah kliping ini`Graphics` ke hasil operasi yang ditentukan menggabungkan wilayah klip saat ini dan persegi panjang yang ditentukan oleh a[`Rectangle`](../rectangle/) struktur. |
| [SetClip](../../system.drawing/graphics/setclip/#setclip_6)(RectangleF) | Mengatur wilayah kliping ini`Graphics` ke hasil operasi yang ditentukan menggabungkan wilayah klip saat ini dan persegi panjang yang ditentukan oleh a[`RectangleF`](../rectanglef/) struktur. |
| [SetClip](../../system.drawing/graphics/setclip/#setclip_3)(Graphics, CombineMode) | Mengatur wilayah kliping ini`Graphics` ke hasil operasi penggabungan yang ditentukan dari wilayah klip saat ini dan properti Klip dari yang ditentukan`Graphics` . |
| [SetClip](../../system.drawing/graphics/setclip/#setclip_1)(GraphicsPath, CombineMode) | Mengatur wilayah kliping ini`Graphics` ke hasil operasi yang ditentukan yang menggabungkan wilayah klip saat ini dan yang ditentukan[`GraphicsPath`](../../system.drawing.drawing2d/graphicspath/) . |
| [SetClip](../../system.drawing/graphics/setclip/#setclip_5)(Rectangle, CombineMode) | Mengatur wilayah kliping ini`Graphics` ke hasil operasi yang ditentukan menggabungkan wilayah klip saat ini dan persegi panjang yang ditentukan oleh a[`Rectangle`](../rectangle/) struktur. |
| [SetClip](../../system.drawing/graphics/setclip/#setclip_7)(RectangleF, CombineMode) | Mengatur wilayah kliping ini`Graphics` ke hasil operasi yang ditentukan menggabungkan wilayah klip saat ini dan persegi panjang yang ditentukan oleh a[`RectangleF`](../rectanglef/) struktur. |
| [SetClip](../../system.drawing/graphics/setclip/#setclip_8)(Region, CombineMode) | Mengatur wilayah kliping iniGraphicske hasil operasi yang ditentukan menggabungkan wilayah klip saat ini dan yang ditentukanRegion . |
| [TransformPoints](../../system.drawing/graphics/transformpoints/#transformpoints)(CoordinateSpace, CoordinateSpace, PointF[]) | Mengubah larik titik dari satu ruang koordinat ke ruang koordinat lainnya menggunakan transformasi dunia dan halaman saat iniGraphics . |
| [TransformPoints](../../system.drawing/graphics/transformpoints/#transformpoints_1)(CoordinateSpace, CoordinateSpace, Point[]) | Mengubah larik titik dari satu ruang koordinat ke ruang koordinat lainnya menggunakan transformasi dunia dan halaman saat iniGraphics . |
| [TranslateClip](../../system.drawing/graphics/translateclip/#translateclip_1)(float, float) | Menerjemahkan wilayah kliping iniGraphics dengan jumlah yang ditentukan dalam arah horizontal dan vertikal. |
| [TranslateClip](../../system.drawing/graphics/translateclip/#translateclip)(int, int) | Menerjemahkan wilayah kliping iniGraphics dengan jumlah yang ditentukan dalam arah horizontal dan vertikal. |
| [TranslateTransform](../../system.drawing/graphics/translatetransform/#translatetransform)(float, float) | Mengubah asal sistem koordinat dengan menambahkan translation yang ditentukan ke matriks transformasi iniGraphics . |
| [TranslateTransform](../../system.drawing/graphics/translatetransform/#translatetransform_1)(float, float, MatrixOrder) | Mengubah asal sistem koordinat dengan menerapkan terjemahan yang ditentukan ke matriks transformasi iniGraphics dalam urutan yang ditentukan. |

## Anggota lainnya

| Nama | Keterangan |
| --- | --- |
| delegate [DrawImageAbort](graphics.drawimageabort/) | Menyediakan metode panggilan balik untuk memutuskan kapan[`DrawImage`](./drawimage/) metode harus membatalkan eksekusi sebelum waktunya dan berhenti menggambar gambar. |
| delegate [EnumerateMetafileProc](graphics.enumeratemetafileproc/) | Menyediakan metode callback untuk[`EnumerateMetafile`](./enumeratemetafile/) metode. |

### Lihat juga

* ruang nama [System.Drawing](../../system.drawing/)
* perakitan [Aspose.Drawing](../../)


