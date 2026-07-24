---
title: "System::Drawing::Drawing2D::GraphicsPath kelas"
linktitle: "GraphicsPath"
second_title: "Aspose.Page untuk C++"
description: "System::Drawing::Drawing2D::GraphicsPath class. Mewakili sekumpulan garis dan kurva yang terhubung. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 600
url: /id/cpp/system.drawing.drawing2d/graphicspath/
---
## GraphicsPath class


Mewakili sekumpulan garis dan kurva yang terhubung. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class GraphicsPath : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [AddArc](./addarc/)(float, float, float, float, float, float) | Menambahkan busur elips yang ditentukan ke jalur yang diwakili oleh objek saat ini. |
| [AddArc](./addarc/)(int, int, int, int, float, float) | Menambahkan busur elips yang ditentukan ke jalur yang diwakili oleh objek saat ini. |
| [AddArc](./addarc/)(const RectangleF\&, float, float) | Menambahkan busur elips yang ditentukan ke jalur yang diwakili oleh objek saat ini. |
| [AddArc](./addarc/)(const Rectangle\&, float, float) | Menambahkan busur elips yang ditentukan ke jalur yang diwakili oleh objek saat ini. |
| [AddBezier](./addbezier/)(const Point\&, const Point\&, const Point\&, const Point\&) | Menambahkan kurva Bezier kubik yang ditentukan ke jalur yang diwakili oleh objek saat ini. |
| [AddBezier](./addbezier/)(const PointF\&, const PointF\&, const PointF\&, const PointF\&) | Menambahkan kurva Bezier kubik yang ditentukan ke jalur yang diwakili oleh objek saat ini. |
| [AddBezier](./addbezier/)(int, int, int, int, int, int, int, int) | Menambahkan kurva Bezier kubik yang ditentukan ke jalur yang diwakili oleh objek saat ini. |
| [AddBezier](./addbezier/)(float, float, float, float, float, float, float, float) | Menambahkan kurva Bezier kubik yang ditentukan ke jalur yang diwakili oleh objek saat ini. |
| [AddBeziers](./addbeziers/)(const ArrayPtr\<Point\>\&) | Menambahkan urutan kurva Bezier kubik yang terhubung ke gambar saat ini. |
| [AddBeziers](./addbeziers/)(const ArrayPtr\<PointF\>\&) | Menambahkan urutan kurva Bezier kubik yang terhubung ke gambar saat ini. |
| [AddClosedCurve](./addclosedcurve/)(const ArrayPtr\<PointF\>\&, float) | Menambahkan kurva tertutup yang ditentukan ke jalur yang diwakili oleh objek saat ini. |
| [AddClosedCurve](./addclosedcurve/)(const ArrayPtr\<Point\>\&, float) | Menambahkan kurva tertutup yang ditentukan ke jalur yang diwakili oleh objek saat ini. |
| [AddCurve](./addcurve/)(const ArrayPtr\<PointF\>\&, float) | Menambahkan kurva yang ditentukan ke jalur yang diwakili oleh objek saat ini. |
| [AddCurve](./addcurve/)(const ArrayPtr\<Point\>\&, float) | Menambahkan kurva yang ditentukan ke jalur yang diwakili oleh objek saat ini. |
| [AddCurve](./addcurve/)(const ArrayPtr\<PointF\>\&, int, int, float) | Menambahkan kurva yang ditentukan ke jalur yang diwakili oleh objek saat ini. |
| [AddCurve](./addcurve/)(const ArrayPtr\<Point\>\&, int, int, float) | Menambahkan kurva yang ditentukan ke jalur yang diwakili oleh objek saat ini. |
| [AddEllipse](./addellipse/)(float, float, float, float) | Menambahkan elips yang ditentukan ke jalur yang diwakili oleh objek saat ini. |
| [AddEllipse](./addellipse/)(int, int, int, int) | Menambahkan elips yang ditentukan ke jalur yang diwakili oleh objek saat ini. |
| [AddEllipse](./addellipse/)(const RectangleF\&) | Menambahkan elips yang ditentukan ke jalur yang diwakili oleh objek saat ini. |
| [AddEllipse](./addellipse/)(const Rectangle\&) | Menambahkan elips yang ditentukan ke jalur yang diwakili oleh objek saat ini. |
| [AddLine](./addline/)(const Point\&, const Point\&) | Menambahkan garis yang ditentukan ke jalur yang diwakili oleh objek saat ini. |
| [AddLine](./addline/)(const PointF\&, const PointF\&) | Menambahkan garis yang ditentukan ke jalur yang diwakili oleh objek saat ini. |
| [AddLine](./addline/)(int, int, int, int) | Menambahkan garis yang ditentukan ke jalur yang diwakili oleh objek saat ini. |
| [AddLine](./addline/)(float, float, float, float) | Menambahkan garis yang ditentukan ke jalur yang diwakili oleh objek saat ini. |
| [AddLines](./addlines/)(const ArrayPtr\<PointF\>\&) | Menambahkan rangkaian segmen garis yang terhubung yang ditentukan ke jalur yang diwakili oleh objek saat ini. |
| [AddLines](./addlines/)(const ArrayPtr\<Point\>\&) | Menambahkan rangkaian segmen garis yang terhubung yang ditentukan ke jalur yang diwakili oleh objek saat ini. |
| [AddPath](./addpath/)(const SharedPtr\<GraphicsPath\>\&, bool) | Menambahkan jalur yang ditentukan ke jalur yang diwakili oleh objek saat ini. |
| [AddPie](./addpie/)(float, float, float, float, float, float) | Menambahkan kontur bentuk pai yang ditentukan ke jalur yang diwakili oleh objek saat ini. |
| [AddPie](./addpie/)(int, int, int, int, float, float) | Menambahkan kontur bentuk pai yang ditentukan ke jalur yang diwakili oleh objek saat ini. |
| [AddPie](./addpie/)(const Rectangle\&, float, float) | Menambahkan kontur bentuk pai yang ditentukan ke jalur yang diwakili oleh objek saat ini. |
| [AddPolygon](./addpolygon/)(const ArrayPtr\<PointF\>\&) | Menambahkan poligon yang ditentukan ke jalur yang diwakili oleh objek saat ini. |
| [AddPolygon](./addpolygon/)(const ArrayPtr\<Point\>\&) | Menambahkan poligon yang ditentukan ke jalur yang diwakili oleh objek saat ini. |
| [AddRectangle](./addrectangle/)(const Rectangle\&) | Menambahkan persegi panjang yang ditentukan ke jalur yang diwakili oleh objek saat ini. |
| [AddRectangle](./addrectangle/)(const RectangleF\&) | Menambahkan persegi panjang yang ditentukan ke jalur yang diwakili oleh objek saat ini. |
| [AddRectangles](./addrectangles/)(const ArrayPtr\<Rectangle\>\&) | Menambahkan rangkaian persegi panjang yang ditentukan ke jalur yang diwakili oleh objek saat ini. |
| [AddRectangles](./addrectangles/)(const ArrayPtr\<RectangleF\>\&) | Menambahkan rangkaian persegi panjang yang ditentukan ke jalur yang diwakili oleh objek saat ini. |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, Point, const SharedPtr\<StringFormat\>\&) | Menambahkan rangkaian teks ke jalur yang diwakili oleh objek saat ini. |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, PointF, const SharedPtr\<StringFormat\>\&) | Menambahkan rangkaian teks ke jalur yang diwakili oleh objek saat ini. |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, Rectangle, const SharedPtr\<StringFormat\>\&) | Menambahkan rangkaian teks ke jalur yang diwakili oleh objek saat ini. |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, RectangleF, const SharedPtr\<StringFormat\>\&) | Menambahkan rangkaian teks ke jalur yang diwakili oleh objek saat ini. |
| virtual [Clone](./clone/)() | Membuat salinan dari objek saat ini. |
| [CloseAllFigures](./closeallfigures/)() | Menutup semua gambar terbuka dan memulai yang baru. |
| [CloseFigure](./closefigure/)() | Menutup gambar saat ini dan memulai yang baru. |
| [Dispose](./dispose/)() | Melepaskan semua sumber daya sistem operasi yang diperoleh oleh objek saat ini. |
| [Flatten](./flatten/)() | Meratakan setiap kurva dalam jalur dengan mengubahnya menjadi rangkaian garis yang terhubung. Nilai kelatihan 0.25 digunakan. |
| [Flatten](./flatten/)(const MatrixPtr\&) | Meratakan setiap kurva dalam jalur dengan mengubahnya menjadi rangkaian garis yang terhubung. Nilai kelatihan 0.25 digunakan. |
| [Flatten](./flatten/)(const MatrixPtr\&, float) | Meratakan setiap kurva dalam jalur dengan mengubahnya menjadi rangkaian garis yang terhubung. |
| [get_FillMode](./get_fillmode/)() | Mengembalikan mode pengisian objek saat ini. |
| [get_PathData](./get_pathdata/)() | Mengembalikan objek [PathData](../pathdata/) yang berisi titik-titik yang membentuk jalur yang diwakili oleh objek saat ini dan tipe-tipe mereka. |
| [get_PathPoints](./get_pathpoints/)() const | Mengembalikan array yang berisi titik-titik yang membentuk jalur yang diwakili oleh objek saat ini. |
| [get_PathTypes](./get_pathtypes/)() const | Mengembalikan array yang berisi nilai-nilai yang menunjukkan tipe titik-titik yang membentuk jalur yang diwakili oleh objek saat ini. |
| [get_PointCount](./get_pointcount/)() const | Mengembalikan jumlah titik dalam jalur yang diwakili oleh objek saat ini. |
| [GetBounds](./getbounds/)(const MatrixPtr\&, const SharedPtr\<Pen\>\&) const | Mengembalikan objek [RectangleF](../../system.drawing/rectanglef/) yang mewakili persegi panjang yang membatasi jalur yang diwakili oleh objek saat ini ketika diubah dengan matriks yang ditentukan. |
| [GetFigureFlags](./getfigureflags/)() | Mengembalikan nilai yang merupakan kombinasi bitwise dari nilai Detail::FigureType yang menunjukkan jenis-jenis gambar apa yang terkandung dalam jalur yang diwakili oleh objek saat ini. |
| [GetLastPoint](./getlastpoint/)() const | Mengembalikan objek [PointF](../../system.drawing/pointf/) yang mewakili titik terakhir dalam jalur. |
| [GraphicsPath](./graphicspath/)(FillMode) | Membuat instance baru dari kelas [GraphicsPath](./) dengan mode isi yang ditentukan. |
| [GraphicsPath](./graphicspath/)(const ArrayPtr\<Point\>\&, const ArrayPtr\<uint8_t\>\&, FillMode) | Membuat instance baru dari objek [GraphicsPath](./) yang mewakili jalur yang ditentukan. |
| [GraphicsPath](./graphicspath/)(const ArrayPtr\<PointF\>\&, const ArrayPtr\<uint8_t\>\&, FillMode) | Membuat instance baru dari objek [GraphicsPath](./) yang mewakili jalur yang ditentukan. |
| [GraphicsPath](./graphicspath/)(const SkPath\&) |  |
| [IsOutlineVisible](./isoutlinevisible/)(const PointF\&, const SharedPtr\<Pen\>\&) | Menunjukkan apakah titik yang ditentukan berada di dalam (di bawah) kontur [GraphicsPath](./) ini ketika digambar dengan [Pen](../../system.drawing/pen/) yang ditentukan. TIDAK DIIMPLEMENTASIKAN. |
| [IsVisible](./isvisible/)(const PointF\&) | Menentukan apakah titik yang ditentukan berada di dalam jalur yang diwakili oleh objek saat ini. |
| [IsVisible](./isvisible/)(float, float) | Menentukan apakah titik yang ditentukan berada di dalam jalur yang diwakili oleh objek saat ini. |
| [Reset](./reset/)() | Mengosongkan jalur dengan menghapus semua titik darinya. |
| [Reverse](./reverse/)() | Membalik urutan titik dalam array PathPoints dari [GraphicsPath](./) ini. |
| [set_FillMode](./set_fillmode/)(FillMode) | Mengatur mode isi dari objek saat ini. |
| [SetMarkers](./setmarkers/)() | BELUM DIIMPLEMENTASIKAN. |
| [StartFigure](./startfigure/)() | Memulai sebuah figur baru. |
| [Transform](./transform/)(const MatrixPtr\&) | Mengubah jalur yang diwakili oleh objek saat ini dengan menerapkan matriks transformasi yang ditentukan padanya. |
| [Transform](./transform/)(const SkMatrix\&) |  |
| [Widen](./widen/)(const SharedPtr\<Pen\>\&) | Mengganti jalur ini dengan kontur di sekitar jalur asli. |
| [~GraphicsPath](./~graphicspath/)() | Destruktor. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
