---
title: Class GraphicsPath
second_title: Aspose.Drawing untuk Referensi .NET API
description: System.Drawing.Drawing2D.GraphicsPath kelas. Merupakan rangkaian garis dan kurva yang terhubung.
type: docs
weight: 260
url: /id/net/system.drawing.drawing2d/graphicspath/
---
## GraphicsPath class

Merupakan rangkaian garis dan kurva yang terhubung.

```csharp
public class GraphicsPath : IDisposable
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [GraphicsPath](graphicspath/#constructor)() | Menginisialisasi instance baru dari kelas GraphicsPath dengan nilai FillMode dari Alternate. |
| [GraphicsPath](graphicspath/#constructor_1)(FillMode) | Menginisialisasi instance baru dari`GraphicsPath`kelas dengan yang ditentukan FillMode pencacahan. |
| [GraphicsPath](graphicspath/#constructor_2)(PointF[], byte[]) | Menginisialisasi instance baru dari`GraphicsPath` kelas dengan yang ditentukan[`PathPointType`](../pathpointtype/) DanPointF array. |
| [GraphicsPath](graphicspath/#constructor_4)(Point[], byte[]) | Menginisialisasi instance baru dari`GraphicsPath` kelas dengan yang ditentukan[`PathPointType`](../pathpointtype/) DanPoint array. |
| [GraphicsPath](graphicspath/#constructor_3)(PointF[], byte[], FillMode) | Menginisialisasi instance baru dari`GraphicsPath` kelas dengan yang ditentukanPathPointType DanPointF array dan dengan yang ditentukanFillMode elemen pencacahan.. |
| [GraphicsPath](graphicspath/#constructor_5)(Point[], byte[], FillMode) | Menginisialisasi instance baru dari`GraphicsPath` kelas dengan yang ditentukanPathPointType DanPoint array dan dengan yang ditentukanFillMode elemen pencacahan.. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [FillMode](../../system.drawing.drawing2d/graphicspath/fillmode/) { get; set; } | Mendapat atau menyetel enumerasi FillMode yang menentukan bagaimana interior bentuk di GraphicsPath ini diisi. |
| [PathData](../../system.drawing.drawing2d/graphicspath/pathdata/) { get; } | Mendapat aPathData yang merangkum array poin dan tipe untuk iniGraphicsPath |
| [PathPoints](../../system.drawing.drawing2d/graphicspath/pathpoints/) { get; } | Mendapat poin di jalur. |
| [PathTypes](../../system.drawing.drawing2d/graphicspath/pathtypes/) { get; } | Mendapat jenis poin yang sesuai diPathPoints larik. |
| [PointCount](../../system.drawing.drawing2d/graphicspath/pointcount/) { get; } | Mendapat jumlah elemen diPathPoints atauPathTypes larik. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [AddArc](../../system.drawing.drawing2d/graphicspath/addarc/#addarc_1)(RectangleF, float, float) | Menambahkan busur elips ke angka saat ini. |
| [AddArc](../../system.drawing.drawing2d/graphicspath/addarc/#addarc)(float, float, float, float, float, float) | Menambahkan busur elips ke angka saat ini. |
| [AddBezier](../../system.drawing.drawing2d/graphicspath/addbezier/#addbezier_1)(PointF, PointF, PointF, PointF) | Menambahkan kurva Bézier kubik ke angka saat ini. |
| [AddBezier](../../system.drawing.drawing2d/graphicspath/addbezier/#addbezier)(float, float, float, float, float, float, float, float) | Menambahkan kurva Bézier kubik ke angka saat ini. |
| [AddBeziers](../../system.drawing.drawing2d/graphicspath/addbeziers/#addbeziers)(PointF[]) | Menambahkan urutan kurva Bézier kubik yang terhubung ke angka saat ini. |
| [AddBeziers](../../system.drawing.drawing2d/graphicspath/addbeziers/#addbeziers_1)(Point[]) | Menambahkan urutan kurva Bézier kubik yang terhubung ke angka saat ini. |
| [AddClosedCurve](../../system.drawing.drawing2d/graphicspath/addclosedcurve/#addclosedcurve)(PointF[]) | Menambahkan kurva tertutup ke jalur ini. Kurva kardinal spline digunakan karena kurva melewati setiap titik dalam larik. |
| [AddClosedCurve](../../system.drawing.drawing2d/graphicspath/addclosedcurve/#addclosedcurve_1)(PointF[], float) | Menambahkan kurva tertutup ke jalur ini. Kurva kardinal spline digunakan karena kurva melewati setiap titik dalam larik. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve/#addcurve)(PointF[]) | Menambahkan kurva spline ke gambar saat ini. Kurva kardinal spline digunakan karena kurva melewati setiap titik dalam larik. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve/#addcurve_3)(Point[]) | Menambahkan kurva spline ke gambar saat ini. Kurva kardinal spline digunakan karena kurva melewati setiap titik dalam larik. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve/#addcurve_2)(PointF[], float) | Menambahkan kurva spline ke gambar saat ini. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve/#addcurve_1)(PointF[], int, int, float) | Menambahkan kurva spline ke gambar saat ini. |
| [AddEllipse](../../system.drawing.drawing2d/graphicspath/addellipse/#addellipse_1)(RectangleF) | Menambahkan elips ke jalur saat ini. |
| [AddEllipse](../../system.drawing.drawing2d/graphicspath/addellipse/#addellipse)(float, float, float, float) | Menambahkan elips ke jalur saat ini. |
| [AddLine](../../system.drawing.drawing2d/graphicspath/addline/#addline_1)(PointF, PointF) | Menambahkan segmen garis ke GraphicsPath ini. |
| [AddLine](../../system.drawing.drawing2d/graphicspath/addline/#addline)(float, float, float, float) | Menambahkan segmen garis ke GraphicsPath ini. |
| [AddLines](../../system.drawing.drawing2d/graphicspath/addlines/#addlines)(PointF[]) | Menambahkan serangkaian segmen garis yang terhubung ke bagian akhir iniGraphicsPath . |
| [AddLines](../../system.drawing.drawing2d/graphicspath/addlines/#addlines_1)(Point[]) | Menambahkan serangkaian segmen garis yang terhubung ke bagian akhir iniGraphicsPath . |
| [AddPath](../../system.drawing.drawing2d/graphicspath/addpath/)(GraphicsPath, bool) | Menambahkan GraphicsPath yang ditentukan ke jalur ini. |
| [AddPie](../../system.drawing.drawing2d/graphicspath/addpie/#addpie_1)(Rectangle, float, float) | Menambahkan garis bentuk pai ke jalur ini. |
| [AddPie](../../system.drawing.drawing2d/graphicspath/addpie/#addpie)(float, float, float, float, float, float) | Menambahkan garis bentuk pai ke jalur ini. |
| [AddPolygon](../../system.drawing.drawing2d/graphicspath/addpolygon/#addpolygon)(PointF[]) | Menambahkan poligon ke jalur ini. |
| [AddPolygon](../../system.drawing.drawing2d/graphicspath/addpolygon/#addpolygon_1)(Point[]) | Menambahkan poligon ke jalur ini. |
| [AddRectangle](../../system.drawing.drawing2d/graphicspath/addrectangle/#addrectangle)(Rectangle) | Menambahkan persegi panjang ke jalur ini. |
| [AddRectangle](../../system.drawing.drawing2d/graphicspath/addrectangle/#addrectangle_1)(RectangleF) | Menambahkan persegi panjang ke jalur ini. |
| [AddRectangles](../../system.drawing.drawing2d/graphicspath/addrectangles/#addrectangles)(RectangleF[]) | Menambahkan serangkaian persegi panjang ke jalur ini. |
| [AddRectangles](../../system.drawing.drawing2d/graphicspath/addrectangles/#addrectangles_1)(Rectangle[]) | Menambahkan serangkaian persegi panjang ke jalur ini. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring/#addstring)(string, FontFamily, int, float, Point, StringFormat) | Menambahkan string teks ke jalur ini. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring/#addstring_1)(string, FontFamily, int, float, PointF, StringFormat) | Menambahkan string teks ke jalur ini. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring/#addstring_2)(string, FontFamily, int, float, Rectangle, StringFormat) | Menambahkan string teks ke jalur ini. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring/#addstring_3)(string, FontFamily, int, float, RectangleF, StringFormat) | Menambahkan string teks ke jalur ini. |
| [Clone](../../system.drawing.drawing2d/graphicspath/clone/)() | Buat salinan objek jalur saat ini. |
| [CloseAllFigures](../../system.drawing.drawing2d/graphicspath/closeallfigures/)() | Menutup semua figur terbuka di jalur ini dan memulai figur baru. Itu menutup setiap gambar terbuka dengan menghubungkan garis dari titik akhirnya ke titik awalnya. |
| [CloseFigure](../../system.drawing.drawing2d/graphicspath/closefigure/)() | Menutup angka saat ini dan memulai angka baru. Jika gambar saat ini berisi urutan garis dan kurva yang terhubung, metode menutup loop dengan menghubungkan garis dari titik akhir ke titik awal. |
| [Dispose](../../system.drawing.drawing2d/graphicspath/dispose/)() | Merilis semua sumber daya yang digunakan oleh GraphicsPath ini. |
| [Flatten](../../system.drawing.drawing2d/graphicspath/flatten/#flatten)() | Mengubah setiap kurva di jalur ini menjadi urutan segmen garis yang terhubung. |
| [Flatten](../../system.drawing.drawing2d/graphicspath/flatten/#flatten_1)(Matrix) | Menerapkan transformasi yang ditentukan dan kemudian mengonversi setiap kurva dalam hal iniGraphicsPath . |
| [Flatten](../../system.drawing.drawing2d/graphicspath/flatten/#flatten_2)(Matrix, float) | Mengonversi setiap kurva dalam hal iniGraphicsPath menjadi urutan segmen garis yang terhubung. |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds/#getbounds)() | Mengembalikan persegi panjang yang membatasi iniGraphicsPath . |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds/#getbounds_1)(Matrix) | Mengembalikan persegi panjang yang membatasi iniGraphicsPath ketika jalur ini diubah oleh yang ditentukanMatrix . |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds/#getbounds_2)(Matrix, Pen) | Mengembalikan persegi panjang yang membatasi iniGraphicsPath ketika jalur saat ini diubah oleh yang ditentukanMatrix dan digambar dengan yang ditentukanPen . |
| [GetLastPoint](../../system.drawing.drawing2d/graphicspath/getlastpoint/)() | Mendapat titik terakhir dalam array PathPoints ini`GraphicsPath` . |
| [IsOutlineVisible](../../system.drawing.drawing2d/graphicspath/isoutlinevisible/)(PointF, Pen) | Menunjukkan apakah titik yang ditentukan terkandung di dalam (di bawah) garis besar iniGraphicsPath saat digambar dengan yang ditentukanPen . |
| [IsVisible](../../system.drawing.drawing2d/graphicspath/isvisible/)(PointF) | Menunjukkan apakah titik yang ditentukan terkandung di dalamnyaGraphicsPath . |
| [Reset](../../system.drawing.drawing2d/graphicspath/reset/)() | Mengosongkan[`PathPoints`](./pathpoints/) Dan[`PathTypes`](./pathtypes/) arrays dan atur[`FillMode`](../fillmode/) keAlternate . |
| [Reverse](../../system.drawing.drawing2d/graphicspath/reverse/)() | Membalik urutan poin di[`PathPoints`](./pathpoints/)susunan ini`GraphicsPath` . |
| [SetMarkers](../../system.drawing.drawing2d/graphicspath/setmarkers/)() | Menetapkan penanda untuk ini`GraphicsPath` . |
| [StartFigure](../../system.drawing.drawing2d/graphicspath/startfigure/)() | Memulai gambar baru tanpa menutup gambar saat ini. Semua titik berikutnya yang ditambahkan ke jalur ditambahkan ke gambar baru ini. |
| [Transform](../../system.drawing.drawing2d/graphicspath/transform/)(Matrix) | Menerapkan matriks transformasi ke GraphicsPath ini. |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp/#warp)(PointF[], RectangleF) | Menerapkan transformasi warp, ditentukan oleh persegi panjang dan jajaran genjang, untuk ini`GraphicsPath` . |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp/#warp_1)(PointF[], RectangleF, Matrix) | Menerapkan transformasi warp, ditentukan oleh persegi panjang dan jajaran genjang, untuk ini`GraphicsPath`. |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp/#warp_2)(PointF[], RectangleF, Matrix, WarpMode) | Menerapkan transformasi warp, ditentukan oleh persegi panjang dan jajaran genjang, untuk ini`GraphicsPath`. |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp/#warp_3)(PointF[], RectangleF, Matrix, WarpMode, float) | Menerapkan transformasi warp, ditentukan oleh persegi panjang dan jajaran genjang, untuk ini`GraphicsPath`. |
| [Widen](../../system.drawing.drawing2d/graphicspath/widen/#widen)(Pen) | Menambahkan kerangka tambahan ke jalur. |
| [Widen](../../system.drawing.drawing2d/graphicspath/widen/#widen_1)(Pen, Matrix) | Menambahkan kerangka tambahan keGraphicsPath . |
| [Widen](../../system.drawing.drawing2d/graphicspath/widen/#widen_2)(Pen, Matrix, float) | Menggantikan iniGraphicsPath dengan kurva yang melingkupi area yang diisi saat jalur ini digambar dengan pena yang ditentukan. |

### Lihat juga

* ruang nama [System.Drawing.Drawing2D](../../system.drawing.drawing2d/)
* perakitan [Aspose.Drawing](../../)


