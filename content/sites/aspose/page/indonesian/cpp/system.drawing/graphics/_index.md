---
title: "kelas System::Drawing::Graphics"
linktitle: "Grafik"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Drawing::Graphics. Mewakili permukaan gambar. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1000
url: /id/cpp/system.drawing/graphics/
---
## Graphics class


Mewakili permukaan gambar. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/) . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class Graphics : public virtual System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [AddMetafileComment](./addmetafilecomment/)(const System::ArrayPtr\<uint8_t\>\&) | BELUM DIIMPLEMENTASIKAN. |
| [BeginContainer](./begincontainer/)() | Menyimpan sebuah kontainer dengan keadaan saat ini dari objek ini, membuka dan menggunakan kontainer baru, serta mengembalikan kontainer yang disimpan. |
| [BeginContainer](./begincontainer/)(Rectangle, Rectangle, GraphicsUnit) | Menyimpan sebuah kontainer dengan keadaan saat ini dari objek ini, membuka dan menggunakan kontainer baru, serta mengembalikan kontainer yang disimpan. |
| [BeginContainer](./begincontainer/)(RectangleF, RectangleF, GraphicsUnit) | Menyimpan sebuah kontainer dengan keadaan saat ini dari objek ini, membuka dan menggunakan kontainer baru, serta mengembalikan kontainer yang disimpan. |
| [Clear](./clear/)(Color) | Membersihkan permukaan gambar yang diwakili oleh objek saat ini dan mengisinya dengan warna yang ditentukan. |
| [CopyFromScreen](./copyfromscreen/)(Point, Point, Size, CopyPixelOperation) | BELUM DIIMPLEMENTASIKAN. |
| [CopyFromScreen](./copyfromscreen/)(int32_t, int32_t, int32_t, int32_t, Size, CopyPixelOperation) | BELUM DIIMPLEMENTASIKAN. |
| [Dispose](./dispose/)() | Melepaskan semua sumber daya sistem operasi yang diperoleh oleh objek saat ini. |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t) | Menggambar busur yang ditentukan menggunakan pena yang ditentukan pada permukaan yang diwakili oleh objek saat ini. |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, float, float, float, float, float, float) | Menggambar busur yang ditentukan menggunakan pena yang ditentukan pada permukaan yang diwakili oleh objek saat ini. |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, Rectangle, float, float) | Menggambar busur yang ditentukan menggunakan pena yang ditentukan pada permukaan yang diwakili oleh objek saat ini. |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, RectangleF, float, float) | Menggambar busur yang ditentukan menggunakan pena yang ditentukan pada permukaan yang diwakili oleh objek saat ini. |
| [DrawBezier](./drawbezier/)(const SharedPtr\<Pen\>\&, const Point\&, const Point\&, const Point\&, const Point\&) | BELUM DIIMPLEMENTASIKAN. |
| [DrawBezier](./drawbezier/)(const SharedPtr\<Pen\>\&, const PointF\&, const PointF\&, const PointF\&, const PointF\&) | BELUM DIIMPLEMENTASIKAN. |
| [DrawBezier](./drawbezier/)(const SharedPtr\<Pen\>\&, float, float, float, float, float, float, float, float) | BELUM DIIMPLEMENTASIKAN. |
| [DrawBeziers](./drawbeziers/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&) | Menggambar serangkaian spline Bezier menggunakan pena yang ditentukan. |
| [DrawBeziers](./drawbeziers/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&) | Menggambar serangkaian spline Bezier menggunakan pena yang ditentukan. |
| [DrawClosedCurve](./drawclosedcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, float, Drawing2D::FillMode) | Menggambar spline tertutup menggunakan pena yang ditentukan. |
| [DrawClosedCurve](./drawclosedcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, float, Drawing2D::FillMode) | Menggambar spline tertutup menggunakan pena yang ditentukan. |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, float) | Menggambar spline menggunakan pena yang ditentukan. |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, float) | Menggambar spline menggunakan pena yang ditentukan. |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, int32_t, int32_t, float) | Menggambar spline menggunakan pena yang ditentukan. |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, int32_t, int32_t, float) | Menggambar spline menggunakan pena yang ditentukan. |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, Rectangle) | Menggambar elips yang ditentukan menggunakan pena yang ditentukan pada permukaan yang diwakili oleh objek saat ini. |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, RectangleF) | Menggambar elips yang ditentukan menggunakan pena yang ditentukan pada permukaan yang diwakili oleh objek saat ini. |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, int, int, int, int) | Menggambar elips yang ditentukan menggunakan pena yang ditentukan pada permukaan yang diwakili oleh objek saat ini. |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, float, float, float, float) | Menggambar elips yang ditentukan menggunakan pena yang ditentukan pada permukaan yang diwakili oleh objek saat ini. |
| [DrawIcon](./drawicon/)(const SharedPtr\<Icon\>\&, Rectangle) | BELUM DIIMPLEMENTASIKAN. |
| [DrawIcon](./drawicon/)(const SharedPtr\<Icon\>\&, int32_t, int32_t) | BELUM DIIMPLEMENTASIKAN. |
| [DrawIconUnstretched](./drawiconunstretched/)(const SharedPtr\<Icon\>\&, Rectangle) | BELUM DIIMPLEMENTASIKAN. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::ArrayPtr\<Point\>\&) | BELUM DIIMPLEMENTASIKAN. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::ArrayPtr\<PointF\>\&, const RectangleF\&, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | Menggambar wilayah yang ditentukan dari gambar yang ditentukan pada lokasi yang ditentukan. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::Details::ArrayView\<PointF\>\&, const RectangleF\&, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | Menggambar wilayah yang ditentukan dari gambar yang ditentukan pada lokasi yang ditentukan. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::Details::StackArray\<PointF, N\>\&, const RectangleF\&, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | Menggambar wilayah yang ditentukan dari gambar yang ditentukan pada lokasi yang ditentukan. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, int, int) | Menggambar gambar yang ditentukan pada lokasi yang ditentukan. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, float, float) | Menggambar gambar yang ditentukan pada lokasi yang ditentukan. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Point) | Menggambar gambar yang ditentukan pada lokasi yang ditentukan. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, PointF) | Menggambar gambar yang ditentukan pada lokasi yang ditentukan. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, int, int, int, int) | Menggambar gambar yang ditentukan ke persegi panjang yang ditentukan. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, float, float, float, float) | Menggambar gambar yang ditentukan ke persegi panjang yang ditentukan. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, RectangleF, RectangleF, GraphicsUnit) | Menggambar wilayah yang ditentukan dari gambar yang ditentukan pada lokasi yang ditentukan. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, Rectangle, GraphicsUnit) | Menggambar wilayah yang ditentukan dari gambar yang ditentukan pada lokasi yang ditentukan. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, int, int, Rectangle, GraphicsUnit) | Menggambar wilayah yang ditentukan dari gambar yang ditentukan pada lokasi yang ditentukan. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const Rectangle\&) | Menggambar gambar yang ditentukan pada lokasi yang ditentukan. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const RectangleF\&) | Menggambar gambar yang ditentukan pada lokasi yang ditentukan. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | Menggambar wilayah yang ditentukan dari gambar yang ditentukan ke persegi panjang yang ditentukan. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | Menggambar wilayah yang ditentukan dari gambar yang ditentukan ke persegi panjang yang ditentukan. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit) | Menggambar wilayah yang ditentukan dari gambar yang ditentukan ke persegi panjang yang ditentukan. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit) | Menggambar wilayah yang ditentukan dari gambar yang ditentukan ke persegi panjang yang ditentukan. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort) | BELUM DIIMPLEMENTASIKAN. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort) | BELUM DIIMPLEMENTASIKAN. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort, IntPtr) | BELUM DIIMPLEMENTASIKAN. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort, IntPtr) | BELUM DIIMPLEMENTASIKAN. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<PointF\>\&, RectangleF, GraphicsUnit) | BELUM DIIMPLEMENTASIKAN. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<PointF\>\&) | BELUM DIIMPLEMENTASIKAN. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<Point\>\&, Rectangle, GraphicsUnit) | BELUM DIIMPLEMENTASIKAN. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<Point\>\&, Rectangle, GraphicsUnit, const SharedPtr\<Imaging::ImageAttributes\>\&) | Menggambar wilayah yang ditentukan dari gambar yang ditentukan pada lokasi yang ditentukan. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, float, float, RectangleF, GraphicsUnit) | Menggambar wilayah yang ditentukan dari gambar yang ditentukan pada lokasi yang ditentukan. |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, int, int) | Menggambar gambar yang ditentukan menggunakan ukuran fisik aslinya pada lokasi yang ditentukan. |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, int, int, int, int) | Menggambar sebuah gambar yang ditentukan menggunakan ukuran fisik aslinya pada lokasi yang ditentukan. |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, const Rectangle\&) | Menggambar sebuah gambar yang ditentukan menggunakan ukuran fisik aslinya pada lokasi yang ditentukan. |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, const Point\&) | Menggambar sebuah gambar yang ditentukan menggunakan ukuran fisik aslinya pada lokasi yang ditentukan. |
| [DrawImageUnscaledAndClipped](./drawimageunscaledandclipped/)(const SharedPtr\<Image\>\&, Rectangle) | BELUM DIIMPLEMENTASIKAN. |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, Point, Point) | Menggambar garis yang ditentukan menggunakan pena yang ditentukan. |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, PointF, PointF) | Menggambar garis yang ditentukan menggunakan pena yang ditentukan. |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, int, int, int, int) | Menggambar garis yang ditentukan menggunakan pena yang ditentukan. |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, float, float, float, float) | Menggambar garis yang ditentukan menggunakan pena yang ditentukan. |
| [DrawLines](./drawlines/)(const SharedPtr\<Pen\>\&, const System::ArrayPtr\<System::Drawing::Point\>\&) | Menggambar serangkaian segmen garis menggunakan pena yang ditentukan. |
| [DrawLines](./drawlines/)(const SharedPtr\<Pen\>\&, const System::ArrayPtr\<System::Drawing::PointF\>\&) | Menggambar serangkaian segmen garis menggunakan pena yang ditentukan. |
| [DrawPath](./drawpath/)(const SharedPtr\<Pen\>\&, const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Menggambar jalur yang ditentukan menggunakan pena yang ditentukan. |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t) | Menggambar diagram pai yang ditentukan menggunakan pena yang ditentukan pada permukaan yang diwakili oleh objek saat ini. |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, float, float, float, float, float, float) | Menggambar diagram pai yang ditentukan menggunakan pena yang ditentukan pada permukaan yang diwakili oleh objek saat ini. |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, Rectangle, float, float) | Menggambar diagram pai yang ditentukan menggunakan pena yang ditentukan pada permukaan yang diwakili oleh objek saat ini. |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, RectangleF, float, float) | Menggambar diagram pai yang ditentukan menggunakan pena yang ditentukan pada permukaan yang diwakili oleh objek saat ini. |
| [DrawPolygon](./drawpolygon/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&) | Menggambar poligon menggunakan pena yang ditentukan. |
| [DrawPolygon](./drawpolygon/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&) | Menggambar poligon menggunakan pena yang ditentukan. |
| [DrawRectangle](./drawrectangle/)(const SharedPtr\<Pen\>\&, int, int, int, int) | Menggambar persegi panjang yang ditentukan menggunakan pena yang ditentukan pada permukaan yang diwakili oleh objek saat ini. |
| [DrawRectangle](./drawrectangle/)(const SharedPtr\<Pen\>\&, float, float, float, float) | Menggambar persegi panjang yang ditentukan menggunakan pena yang ditentukan pada permukaan yang diwakili oleh objek saat ini. |
| [DrawRectangle](./drawrectangle/)(const SharedPtr\<Pen\>\&, Rectangle) | Menggambar persegi panjang yang ditentukan menggunakan pena yang ditentukan pada permukaan yang diwakili oleh objek saat ini. |
| [DrawRectangles](./drawrectangles/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Rectangle\>\&) | Menggambar serangkaian persegi panjang menggunakan pena yang ditentukan. |
| [DrawRectangles](./drawrectangles/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<RectangleF\>\&) | Menggambar serangkaian persegi panjang menggunakan pena yang ditentukan. |
| [DrawString](./drawstring/)(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, PointF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) | Menggambar string yang ditentukan pada lokasi yang ditentukan menggunakan font dan kuas yang ditentukan. |
| [DrawString](./drawstring/)(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, RectangleF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) | Menggambar string yang ditentukan dalam persegi panjang yang ditentukan menggunakan font dan kuas yang ditentukan. |
| [DrawString](./drawstring/)(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, float, float, const System::SharedPtr\<System::Drawing::StringFormat\>\&) | Menggambar string yang ditentukan pada lokasi yang ditentukan menggunakan font dan kuas yang ditentukan. |
| [EndContainer](./endcontainer/)(const SharedPtr\<Drawing2D::GraphicsContainer\>\&) | Menutup kontainer saat ini dan mengembalikan keadaan objek ini dari keadaan kontainer yang disimpan. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<PointF\>\&, Graphics::EnumerateMetafileProc) | BELUM DIIMPLEMENTASIKAN. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<Point\>\&, Graphics::EnumerateMetafileProc) | BELUM DIIMPLEMENTASIKAN. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Point, Graphics::EnumerateMetafileProc) | BELUM DIIMPLEMENTASIKAN. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, PointF, Graphics::EnumerateMetafileProc) | BELUM DIIMPLEMENTASIKAN. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Rectangle, Graphics::EnumerateMetafileProc) | BELUM DIIMPLEMENTASIKAN. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, RectangleF, Graphics::EnumerateMetafileProc) | BELUM DIIMPLEMENTASIKAN. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Point, Rectangle, GraphicsUnit, Graphics::EnumerateMetafileProc) | BELUM DIIMPLEMENTASIKAN. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, PointF, RectangleF, GraphicsUnit, Graphics::EnumerateMetafileProc) | BELUM DIIMPLEMENTASIKAN. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<Point\>\&, Rectangle, GraphicsUnit, Graphics::EnumerateMetafileProc) | BELUM DIIMPLEMENTASIKAN. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<PointF\>\&, RectangleF, GraphicsUnit, Graphics::EnumerateMetafileProc) | BELUM DIIMPLEMENTASIKAN. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Rectangle, Rectangle, GraphicsUnit, Graphics::EnumerateMetafileProc) | BELUM DIIMPLEMENTASIKAN. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, RectangleF, RectangleF, GraphicsUnit, Graphics::EnumerateMetafileProc) | BELUM DIIMPLEMENTASIKAN. |
| [ExcludeClip](./excludeclip/)(Rectangle) | BELUM DIIMPLEMENTASIKAN. |
| [ExcludeClip](./excludeclip/)(const SharedPtr\<Region\>\&) | BELUM DIIMPLEMENTASIKAN. |
| [FillClosedCurve](./fillclosedcurve/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<PointF\>\&, Drawing2D::FillMode, float) | Menggambar spline tertutup menggunakan kuas yang ditentukan. |
| [FillClosedCurve](./fillclosedcurve/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<Point\>\&, Drawing2D::FillMode, float) | Menggambar spline tertutup menggunakan kuas yang ditentukan. |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, Rectangle) | Mengisi interior elips yang ditentukan oleh persegi panjang pembatas menggunakan kuas yang ditentukan. |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, RectangleF) | Mengisi interior elips yang ditentukan oleh persegi panjang pembatas menggunakan kuas yang ditentukan. |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, int, int, int, int) | Mengisi interior elips yang ditentukan oleh persegi panjang pembatas menggunakan kuas yang ditentukan. |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, float, float, float, float) | Mengisi interior elips yang ditentukan oleh persegi panjang pembatas menggunakan kuas yang ditentukan. |
| [FillPath](./fillpath/)(const SharedPtr\<Brush\>\&, const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Mengisi interior jalur yang ditentukan menggunakan kuas yang ditentukan. |
| [FillPie](./fillpie/)(const SharedPtr\<Brush\>\&, int, int, int, int, int, int) | Mengisi pai yang ditentukan menggunakan kuas yang ditentukan pada permukaan yang diwakili oleh objek saat ini. |
| [FillPie](./fillpie/)(const SharedPtr\<Brush\>\&, float, float, float, float, float, float) | Mengisi pai yang ditentukan menggunakan kuas yang ditentukan pada permukaan yang diwakili oleh objek saat ini. |
| [FillPie](./fillpie/)(const SharedPtr\<Brush\>\&, Rectangle, float, float) | Mengisi pai yang ditentukan menggunakan kuas yang ditentukan pada permukaan yang diwakili oleh objek saat ini. |
| [FillPolygon](./fillpolygon/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<Point\>\&, Drawing2D::FillMode) | Mengisi interior poligon yang ditentukan menggunakan kuas yang ditentukan. |
| [FillPolygon](./fillpolygon/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<PointF\>\&, Drawing2D::FillMode) | Mengisi interior poligon yang ditentukan menggunakan kuas yang ditentukan. |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, float, float, float, float) | Mengisi persegi panjang yang ditentukan dengan kuas yang ditentukan. |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, int, int, int, int) | Mengisi persegi panjang yang ditentukan dengan kuas yang ditentukan. |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, Rectangle) | Mengisi persegi panjang yang ditentukan dengan kuas yang ditentukan. |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, RectangleF) | Mengisi persegi panjang yang ditentukan dengan kuas yang ditentukan. |
| [FillRectangles](./fillrectangles/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<Rectangle\>\&) | Mengisi serangkaian persegi panjang menggunakan kuas yang ditentukan. |
| [FillRectangles](./fillrectangles/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<RectangleF\>\&) | Mengisi serangkaian persegi panjang menggunakan kuas yang ditentukan. |
| [FillRegion](./fillregion/)(const SharedPtr\<Brush\>\&, const SharedPtr\<Region\>\&) | Mengisi interior wilayah yang ditentukan menggunakan kuas yang ditentukan. |
| [Flush](./flush/)(Drawing2D::FlushIntention) | Memicu eksekusi segera semua operasi gambar yang tertunda. |
| static [FromHwnd](./fromhwnd/)(IntPtr) | BELUM DIIMPLEMENTASIKAN. |
| static [FromHwndInternal](./fromhwndinternal/)(IntPtr) | BELUM DIIMPLEMENTASIKAN. |
| static [FromImage](./fromimage/)(const SharedPtr\<Image\>\&) | Membuat objek [Graphics](./) baru dari gambar yang ditentukan. |
| [get_Clip](./get_clip/)() | Mengembalikan objek [Region](../region/) yang mewakili wilayah yang membatasi area gambar pada permukaan gambar yang diwakili oleh objek [Graphics](./) saat ini. |
| [get_ClipBounds](./get_clipbounds/)() const | Mengembalikan persegi panjang yang membatasi area pemotongan pada permukaan yang diwakili oleh objek saat ini. |
| [get_CompositingMode](./get_compositingmode/)() | Mengembalikan nilai yang menunjukkan bagaimana gambar yang digabungkan digambar pada permukaan yang diwakili oleh objek saat ini. |
| [get_CompositingQuality](./get_compositingquality/)() | Mengembalikan nilai yang menunjukkan tingkat kualitas yang digunakan saat menggabungkan gambar. |
| [get_DpiX](./get_dpix/)() | Mengembalikan resolusi horizontal. |
| [get_DpiY](./get_dpiy/)() | Mengembalikan resolusi vertikal. |
| [get_InterpolationMode](./get_interpolationmode/)() | Mengembalikan nilai yang menunjukkan mode interpolasi yang terkait dengan objek saat ini. |
| [get_IsClipEmpty](./get_isclipempty/)() const | BELUM DIIMPLEMENTASIKAN. |
| [get_IsVisibleClipEmpty](./get_isvisibleclipempty/)() const | BELUM DIIMPLEMENTASIKAN. |
| [get_PageScale](./get_pagescale/)() const | Mengembalikan skala antara satuan dunia dan satuan halaman untuk objek [Graphics](./) saat ini. |
| [get_PageUnit](./get_pageunit/)() const | Mengembalikan satuan pengukuran yang digunakan untuk koordinat halaman pada permukaan yang diwakili oleh objek saat ini. |
| [get_PixelOffsetMode](./get_pixeloffsetmode/)() | Mengembalikan nilai yang menunjukkan bagaimana piksel dipindahkan selama proses rendering pada permukaan yang diwakili oleh objek saat ini. |
| [get_RenderingOrigin](./get_renderingorigin/)() const | Mengembalikan objek [Point](../point/) yang mewakili asal rendering dari objek [Graphics](./) saat ini untuk dithering dan kuas hatch. |
| [get_SmoothingMode](./get_smoothingmode/)() | Mengembalikan nilai yang menunjukkan mode penenang yang digunakan selama rendering pada permukaan yang diwakili oleh objek saat ini. |
| [get_TextContrast](./get_textcontrast/)() const | BELUM DIIMPLEMENTASIKAN. |
| [get_TextRenderingHint](./get_textrenderinghint/)() | Mengembalikan nilai yang menunjukkan kualitas rendering teks. |
| [get_Transform](./get_transform/)() | Mengembalikan transformasi dunia geometris untuk objek [Graphics](./) saat ini. |
| [get_VisibleClipBounds](./get_visibleclipbounds/)() const | Mengembalikan objek [RectangleF](../rectanglef/) yang mewakili persegi panjang pembatas dari wilayah pemotongan yang terlihat pada objek [Graphics](./) saat ini. |
| [GetHdc](./gethdc/)() | BELUM DIIMPLEMENTASIKAN. |
| [GetNearestColor](./getnearestcolor/)(Color) | BELUM DIIMPLEMENTASIKAN. |
| [GetSkCanvas](./getskcanvas/)() const |  |
| [IntersectClip](./intersectclip/)(const System::SharedPtr\<Region\>\&) | Memperbarui wilayah klip objek ini menjadi irisan antara klip saat ini dan klip yang ditentukan. |
| [IntersectClip](./intersectclip/)(System::Drawing::RectangleF) | Memperbarui wilayah klip objek ini menjadi irisan antara klip saat ini dan klip yang ditentukan. |
| [IntersectClip](./intersectclip/)(System::Drawing::Rectangle) | Memperbarui wilayah klip objek ini menjadi irisan antara klip saat ini dan klip yang ditentukan. |
| [IsVisible](./isvisible/)(Point) | Menentukan apakah titik yang ditentukan berada di dalam wilayah klip yang terlihat pada objek [Graphics](./) saat ini. |
| [IsVisible](./isvisible/)(PointF) | BELUM DIIMPLEMENTASIKAN. |
| [IsVisible](./isvisible/)(Rectangle) | BELUM DIIMPLEMENTASIKAN. |
| [IsVisible](./isvisible/)(RectangleF) | BELUM DIIMPLEMENTASIKAN. |
| [IsVisible](./isvisible/)(int32_t, int32_t) | BELUM DIIMPLEMENTASIKAN. |
| [IsVisible](./isvisible/)(float, float) | BELUM DIIMPLEMENTASIKAN. |
| [IsVisible](./isvisible/)(float, float, float, float) | BELUM DIIMPLEMENTASIKAN. |
| [IsVisible](./isvisible/)(int32_t, int32_t, int32_t, int32_t) | BELUM DIIMPLEMENTASIKAN. |
| [MeasureCharacterRanges](./measurecharacterranges/)(const System::String\&, const SharedPtr\<Font\>\&, RectangleF, const SharedPtr\<StringFormat\>\&) | Mengembalikan array wilayah yang masing-masing membatasi posisi karakter dalam string yang ditentukan. |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, PointF const\&, System::SharedPtr\<StringFormat\> const\&) const | Mengembalikan ukuran string yang ditentukan ketika digambar dengan font dan format yang ditentukan. |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, int, System::SharedPtr\<StringFormat\> const\&) const | Mengembalikan ukuran string yang ditentukan ketika digambar dengan font dan format yang ditentukan. |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&, int\&, int\&) const | BELUM DIIMPLEMENTASIKAN. |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&) const | Mengembalikan ukuran string yang ditentukan ketika digambar dengan font dan format yang ditentukan. |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Drawing2D::Matrix\>\&, Drawing2D::MatrixOrder) | Mengalikan matriks transformasi dunia objek [Graphics](./) saat ini dengan matriks yang ditentukan. |
| [ReleaseHdc](./releasehdc/)() | BELUM DIIMPLEMENTASIKAN. |
| [ReleaseHdc](./releasehdc/)(IntPtr) | BELUM DIIMPLEMENTASIKAN. |
| [ResetClip](./resetclip/)() | Mengatur ulang wilayah klip untuk grafik ini menjadi wilayah tak terbatas. |
| [ResetTransform](./resettransform/)() | Mengatur ulang matriks transformasi dunia objek saat ini sehingga menjadi matriks identitas. |
| [Restore](./restore/)(const SharedPtr\<Drawing2D::GraphicsState\>\&) | Memulihkan keadaan objek ini dari keadaan yang disimpan. |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | Menerapkan rotasi yang ditentukan ke matriks transformasi dunia objek [Graphics](./) saat ini dalam urutan yang ditentukan. |
| [Save](./save/)() | Menyimpan keadaan saat ini dari objek ini dan mengembalikan keadaan yang disimpan. |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | Menerapkan vektor skala yang ditentukan ke matriks transformasi dunia objek saat ini. |
| [set_Clip](./set_clip/)(const SharedPtr\<Region\>\&) | Menetapkan wilayah yang membatasi area gambar pada permukaan gambar yang diwakili oleh objek saat ini. |
| [set_CompositingMode](./set_compositingmode/)(Drawing2D::CompositingMode) | Menetapkan nilai yang menentukan bagaimana gambar yang digabungkan digambar pada permukaan yang diwakili oleh objek saat ini. |
| [set_CompositingQuality](./set_compositingquality/)(Drawing2D::CompositingQuality) | Menetapkan nilai yang menentukan tingkat kualitas yang digunakan saat menggabungkan gambar. |
| [set_InterpolationMode](./set_interpolationmode/)(Drawing2D::InterpolationMode) | Menetapkan nilai yang menunjukkan mode interpolasi yang terkait dengan objek saat ini. |
| [set_PageScale](./set_pagescale/)(float) | Menetapkan skala antara satuan dunia dan satuan halaman untuk objek [Graphics](./) saat ini. |
| [set_PageUnit](./set_pageunit/)(GraphicsUnit) | Menetapkan satuan pengukuran yang digunakan untuk koordinat halaman pada permukaan yang diwakili oleh objek saat ini. |
| [set_PixelOffsetMode](./set_pixeloffsetmode/)(Drawing2D::PixelOffsetMode) | Menetapkan nilai yang menentukan bagaimana piksel harus di-offset selama rendering pada permukaan yang diwakili oleh objek saat ini. |
| [set_RenderingOrigin](./set_renderingorigin/)(Point) | Menetapkan objek [Point](../point/) yang menentukan asal rendering dari objek [Graphics](./) saat ini untuk dithering dan kuas hatch. |
| [set_SmoothingMode](./set_smoothingmode/)(Drawing2D::SmoothingMode) | Menetapkan nilai yang menentukan mode penyembuhan yang digunakan selama rendering pada permukaan yang diwakili oleh objek saat ini. |
| [set_TextContrast](./set_textcontrast/)(int32_t) | BELUM DIIMPLEMENTASIKAN. |
| [set_TextRenderingHint](./set_textrenderinghint/)(Text::TextRenderingHint) | Menetapkan nilai yang menentukan kualitas rendering teks. |
| [set_Transform](./set_transform/)(const SharedPtr\<Drawing2D::Matrix\>\&) | Menetapkan transformasi dunia geometris untuk objek [Graphics](./) saat ini. |
| [SetClip](./setclip/)(const SharedPtr\<Region\>\&, Drawing2D::CombineMode) | Menetapkan wilayah klip dari permukaan gambar yang diwakili oleh objek [Graphics](./) saat ini menjadi hasil dari operasi yang ditentukan yang menggabungkan wilayah klip saat ini dan wilayah yang ditentukan. |
| [SetClip](./setclip/)(Rectangle, Drawing2D::CombineMode) | Menetapkan wilayah klip dari permukaan gambar yang diwakili oleh objek [Graphics](./) saat ini menjadi hasil dari operasi yang ditentukan yang menggabungkan wilayah klip saat ini dan wilayah yang ditentukan. |
| [SetClip](./setclip/)(RectangleF, Drawing2D::CombineMode) | Menetapkan wilayah klip dari permukaan gambar yang diwakili oleh objek [Graphics](./) saat ini menjadi hasil dari operasi yang ditentukan yang menggabungkan wilayah klip saat ini dan wilayah yang ditentukan. |
| [SetClip](./setclip/)(const SharedPtr\<Graphics\>\&, Drawing2D::CombineMode) | BELUM DIIMPLEMENTASIKAN. |
| [SetClip](./setclip/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&, Drawing2D::CombineMode) | Mengatur wilayah pemotongan permukaan gambar yang diwakili oleh objek [Graphics](./) saat ini menjadi hasil operasi yang ditentukan yang menggabungkan wilayah pemotongan saat ini dan wilayah yang ditentukan oleh jalur grafis. |
| [TransformPoints](./transformpoints/)(Drawing2D::CoordinateSpace, Drawing2D::CoordinateSpace, const ArrayPtr\<System::Drawing::Point\>\&) | BELUM DIIMPLEMENTASIKAN. |
| [TransformPoints](./transformpoints/)(Drawing2D::CoordinateSpace, Drawing2D::CoordinateSpace, const ArrayPtr\<System::Drawing::PointF\>\&) | BELUM DIIMPLEMENTASIKAN. |
| [TranslateClip](./translateclip/)(int, int) | BELUM DIIMPLEMENTASIKAN. |
| [TranslateClip](./translateclip/)(float, float) | BELUM DIIMPLEMENTASIKAN. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | Menerapkan vektor translasi yang ditentukan ke matriks transformasi dunia dari objek [Graphics](./) saat ini. |
| [~Graphics](./~graphics/)() |  |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [DrawImageAbort](./drawimageabort/) | Tipe objek fungsi panggilan balik yang digunakan sebagai argumen untuk metode DrawImage. |
| [EnumerateMetafileProc](./enumeratemetafileproc/) | Tipe objek fungsi panggilan balik yang digunakan sebagai argumen untuk metode EnumerateMetafile. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
