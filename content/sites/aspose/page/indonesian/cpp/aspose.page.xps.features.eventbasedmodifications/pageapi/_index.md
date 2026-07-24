---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI kelas"
linktitle: "PageAPI"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI kelas. API modifikasi elemen Page dalam C++."
type: docs
weight: 500
url: /id/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/
---
## PageAPI class


API modifikasi elemen **[Page](../../aspose.page/)**.

```cpp
class PageAPI : public Aspose::Page::XPS::Features::EventBasedModifications::IModificationAPI
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Add](./add/)(T) | Menambahkan elemen konten (Canvas, Path, atau Glyphs). |
| [AddCanvas](./addcanvas/)() | Menambahkan kanvas baru ke halaman. |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Menambahkan glyphs baru ke halaman. |
| [AddGlyphs](./addglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Menambahkan glyphs baru ke halaman. |
| [AddOutlineEntry](./addoutlineentry/)(System::String, int32_t, int32_t) | Menambahkan entri outline ke dokumen. |
| [AddPath](./addpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Menambahkan path baru ke halaman. |
| [CreateArcSegment](./createarcsegment/)(System::Drawing::PointF, System::Drawing::SizeF, float, bool, XpsModel::XpsSweepDirection, bool) | Membuat segmen busur elips baru. |
| [CreateCanvas](./createcanvas/)() | Membuat kanvas baru. |
| [CreateColor](./createcolor/)(System::Drawing::Color) | Membuat warna baru. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t, int32_t) | Membuat warna baru dalam ruang warna sRGB. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t) | Membuat warna baru dalam ruang warna sRGB. |
| [CreateColor](./createcolor/)(float, float, float, float) | Membuat warna baru dalam ruang warna scRGB. |
| [CreateColor](./createcolor/)(float, float, float) | Membuat warna baru dalam ruang warna scRGB. |
| [CreateColor](./createcolor/)(System::String, const System::ArrayPtr\<float\>\&) | Membuat warna baru dalam ruang warna berbasis ICC. |
| [CreateColor](./createcolor/)(System::SharedPtr\<XpsModel::XpsIccProfile\>, const System::ArrayPtr\<float\>\&) | Membuat warna baru dalam ruang warna berbasis ICC. |
| [CreateGlyphs](./createglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Membuat glyphs baru. |
| [CreateGlyphs](./createglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Membuat glyphs baru. |
| [CreateGradientStop](./creategradientstop/)(System::SharedPtr\<XpsModel::XpsColor\>, float) | Membuat gradient stop baru. |
| [CreateGradientStop](./creategradientstop/)(System::Drawing::Color, float) | Membuat gradient stop baru. |
| [CreateImageBrush](./createimagebrush/)(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | Membuat image brush baru. |
| [CreateImageBrush](./createimagebrush/)(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) | Membuat image brush baru. |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF) | Membuat linear gradient brush baru. |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::Drawing::PointF, System::Drawing::PointF) | Membuat linear gradient brush baru. |
| [CreateMatrix](./creatematrix/)(float, float, float, float, float, float) | Membuat matriks transformasi afine baru. |
| [CreatePath](./createpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Membuat path baru. |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, bool) | Membuat path figure baru. |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\>, bool) | Membuat path figure baru. |
| [CreatePathGeometry](./createpathgeometry/)(System::String) | Membuat path geometry baru yang ditentukan dengan bentuk singkat. |
| [CreatePathGeometry](./createpathgeometry/)() | Membuat path geometry baru. |
| [CreatePathGeometry](./createpathgeometry/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathFigure\>\>\>) | Membuat path geometry baru dengan daftar path figure yang ditentukan. |
| [CreatePolyBezierSegment](./createpolybeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Membuat sekumpulan kurva Bézier kubik baru. |
| [CreatePolyLineSegment](./createpolylinesegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Membuat gambar poligonal baru yang berisi jumlah vertex individual secara sembarang. |
| [CreatePolyQuadraticBezierSegment](./createpolyquadraticbeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Membuat sekumpulan kurva Bézier kuadratik baru dari titik sebelumnya dalam path figure melalui sekumpulan vertex, menggunakan titik kontrol yang ditentukan. |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) | Membuat radial gradient brush baru. |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::Drawing::PointF, System::Drawing::PointF, float, float) | Membuat radial gradient brush baru. |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::SharedPtr\<XpsModel::XpsColor\>) | Membuat solid color brush baru. |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::Drawing::Color) | Membuat solid color brush baru. |
| [CreateVisualBrush](./createvisualbrush/)(System::SharedPtr\<XpsModel::XpsContentElement\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | Membuat visual brush baru. |
| [get_Height](./get_height/)() | Mengembalikan/mengatur tinggi halaman, dinyatakan sebagai angka real dalam satuan ruang koordinat efektif. |
| [get_PageCount](./get_pagecount/)() | Mengembalikan jumlah halaman dalam dokumen aktif. |
| [get_TotalPageCount](./get_totalpagecount/)() | Mengembalikan total jumlah halaman dalam semua dokumen di dalam dokumen [XPS](../../aspose.page.xps/). |
| [get_Utils](./get_utils/)() | Mendapatkan objek yang menyediakan utilitas di luar API manipulasi [XPS](../../aspose.page.xps/) formal. |
| [get_Width](./get_width/)() | Mengembalikan/mengatur lebar halaman, dinyatakan sebagai angka real dalam satuan ruang koordinat efektif. |
| [Insert](./insert/)(int32_t, T) | Menyisipkan elemen (Canvas, Path, atau Glyphs) ke halaman pada posisi *index*. |
| [InsertCanvas](./insertcanvas/)(int32_t) | Menyisipkan canvas baru ke halaman pada posisi *index*. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | Menyisipkan glyphs baru ke halaman pada posisi *index*. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Menyisipkan glyphs baru ke halaman pada posisi *index*. |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Menyisipkan path baru ke halaman pada posisi *index*. |
| [Remove](./remove/)(T) | Menghapus elemen dari halaman. |
| [RemoveAt](./removeat/)(int32_t) | Menghapus elemen pada posisi *index* dari halaman. |
| [set_Height](./set_height/)(float) | Mengembalikan/mengatur tinggi halaman, dinyatakan sebagai angka real dalam satuan ruang koordinat efektif. |
| [set_Width](./set_width/)(float) | Mengembalikan/mengatur lebar halaman, dinyatakan sebagai angka real dalam satuan ruang koordinat efektif. |
## Lihat Juga

* Class [IModificationAPI](../imodificationapi/)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../)
* Library [Aspose.Page for C++](../../)
