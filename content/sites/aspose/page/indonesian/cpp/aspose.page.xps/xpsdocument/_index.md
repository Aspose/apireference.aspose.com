---
title: "Aspose::Page::XPS::XpsDocument kelas"
linktitle: "XpsDocument"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::XPS::XpsDocument kelas. Kelas yang mengenkapsulasi entitas utama dokumen XPS yang menyediakan metode manipulasi untuk setiap elemen XPS dalam C++."
type: docs
weight: 400
url: /id/cpp/aspose.page.xps/xpsdocument/
---
## XpsDocument class


Kelas yang mengenkapsulasi entitas utama dokumen [XPS](../) yang menyediakan metode manipulasi untuk setiap elemen [XPS](../).

```cpp
class XpsDocument : public Aspose::Page::Document,
                    public System::IDisposable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Add](./add/)(T) | Menambahkan elemen konten (Canvas, Path, atau Glyphs). |
| [AddCanvas](./addcanvas/)() | Menambahkan kanvas baru ke halaman aktif. |
| [AddDocument](./adddocument/)(bool) | Menambahkan dokumen kosong dengan ukuran halaman default. |
| [AddDocument](./adddocument/)(float, float, bool) | Menambahkan dokumen kosong dengan dimensi halaman pertama *width* dan *height*. |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Menambahkan glyph baru ke halaman aktif. |
| [AddGlyphs](./addglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Menambahkan glyph baru ke halaman aktif. |
| [AddOutlineEntry](./addoutlineentry/)(System::String, int32_t, System::SharedPtr\<XpsModel::XpsHyperlinkTarget\>) | Menambahkan entri outline ke dokumen. |
| [AddPage](./addpage/)(bool) | Menambahkan halaman kosong ke dokumen dengan ukuran halaman default. |
| [AddPage](./addpage/)(float, float, bool) | Menambahkan halaman kosong ke dokumen dengan *width* dan *height* yang ditentukan. |
| [AddPage](./addpage/)(System::SharedPtr\<XpsModel::XpsPage\>, bool) | Menambahkan halaman ke dokumen. |
| [AddPath](./addpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Menambahkan jalur baru ke halaman aktif. |
| [Assert](./assert/)() |  |
| [CreateArcSegment](./createarcsegment/)(System::Drawing::PointF, System::Drawing::SizeF, float, bool, XpsModel::XpsSweepDirection, bool) | Membuat segmen busur elips baru. |
| [CreateCanvas](./createcanvas/)() | Membuat kanvas baru. |
| [CreateColor](./createcolor/)(System::Drawing::Color) | Membuat warna baru. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t, int32_t) | Membuat warna baru dalam ruang warna sRGB. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t) | Membuat warna baru dalam ruang warna sRGB. |
| [CreateColor](./createcolor/)(float, float, float, float) | Membuat warna baru dalam ruang warna scRGB. |
| [CreateColor](./createcolor/)(float, float, float) | Membuat warna baru dalam ruang warna scRGB. |
| [CreateColor](./createcolor/)(System::String, const System::ArrayPtr\<float\>\&) | Membuat warna baru dalam ruang warna berbasis ICC. |
| [CreateColor](./createcolor/)(System::SharedPtr\<XpsModel::XpsIccProfile\>, const System::ArrayPtr\<float\>\&) | Membuat warna baru dalam ruang warna berbasis ICC. |
| [CreateFont](./createfont/)(System::String, System::Drawing::FontStyle) | Membuat sumber daya font **TrueType** baru. |
| [CreateFont](./createfont/)(System::SharedPtr\<System::IO::Stream\>) | Membuat sumber daya font **TrueType** baru dari aliran. |
| [CreateGlyphs](./createglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Membuat glyphs baru. |
| [CreateGlyphs](./createglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Membuat glyphs baru. |
| [CreateGradientStop](./creategradientstop/)(System::SharedPtr\<XpsModel::XpsColor\>, float) | Membuat gradient stop baru. |
| [CreateGradientStop](./creategradientstop/)(System::Drawing::Color, float) | Membuat gradient stop baru. |
| [CreateIccProfile](./createiccprofile/)(System::String) | Membuat sumber daya profil ICC baru dari file profil ICC yang terletak di *iccProfilePath*. |
| [CreateIccProfile](./createiccprofile/)(System::SharedPtr\<System::IO::Stream\>) | Membuat sumber daya profil ICC baru dari *stream*. |
| [CreateImage](./createimage/)(System::String) | Membuat sumber daya gambar baru dari file gambar yang terletak di *imagePath*. |
| [CreateImage](./createimage/)(System::SharedPtr\<System::IO::Stream\>) | Membuat sumber daya gambar baru dari *stream*. |
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
| [Dispose](./dispose/)() override | Membuang instance. |
| [get_ActiveDocument](./get_activedocument/)() | Mendapatkan nomor dokumen aktif. |
| [get_ActivePage](./get_activepage/)() | Mendapatkan nomor halaman aktif dalam dokumen aktif. |
| [get_DocumentCount](./get_documentcount/)() | Mengembalikan jumlah dokumen di dalam paket [XPS](../). |
| [get_JobPrintTicket](./get_jobprintticket/)() | Mengembalikan/mengatur tiket cetak pekerjaan dokumen. |
| [get_Page](./get_page/)() | Mengembalikan sebuah instance [XpsPage](../) untuk halaman aktif. |
| [get_PageCount](./get_pagecount/)() | Mengembalikan jumlah halaman dalam dokumen aktif. |
| [get_TotalPageCount](./get_totalpagecount/)() | Mengembalikan total jumlah halaman dalam semua dokumen di dalam dokumen [XPS](../). |
| [get_Utils](./get_utils/)() const | Mendapatkan objek yang menyediakan utilitas di luar API manipulasi [XPS](../) formal. |
| [GetDocumentPrintTicket](./getdocumentprintticket/)(int32_t) | Mengembalikan tiket cetak dari dokumen yang diindeks oleh *documentIndex* . |
| [GetPagePrintTicket](./getpageprintticket/)(int32_t, int32_t) | Mengembalikan tiket cetak dari halaman yang diindeks oleh *pageIndex*  dalam dokumen yang diindeks oleh *documentIndex* . |
| [Insert](./insert/)(int32_t, T) | Menyisipkan elemen (Canvas, Path, atau Glyphs) ke halaman aktif pada posisi *index* . |
| [InsertCanvas](./insertcanvas/)(int32_t) | Menyisipkan kanvas baru ke halaman aktif pada posisi *index* . |
| [InsertDocument](./insertdocument/)(int32_t, bool) | Menyisipkan dokumen kosong dengan ukuran halaman default pada posisi *index* . |
| [InsertDocument](./insertdocument/)(int32_t, float, float, bool) | Menyisipkan dokumen kosong dengan dimensi halaman pertama *width*  dan *height*  pada posisi *index* . |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | Menyisipkan glyph baru ke halaman aktif pada posisi *index* . |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Menyisipkan glyph baru ke halaman aktif pada posisi *index* . |
| [InsertPage](./insertpage/)(int32_t, bool) | Menyisipkan halaman kosong ke dokumen dengan ukuran halaman default pada posisi *index* . |
| [InsertPage](./insertpage/)(int32_t, float, float, bool) | Menyisipkan halaman kosong ke dokumen dengan *width*  dan *height*  yang ditentukan pada posisi *index* . |
| [InsertPage](./insertpage/)(int32_t, System::SharedPtr\<XpsModel::XpsPage\>, bool) | Menyisipkan halaman ke dokumen pada posisi *index* . |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Menyisipkan jalur baru ke halaman aktif pada posisi *index* . |
| [Merge](./merge/)(System::ArrayPtr\<System::String\>, System::String) | Menggabungkan beberapa file [XPS](../) menjadi satu dokumen [XPS](../). |
| [Merge](./merge/)(System::ArrayPtr\<System::String\>, System::SharedPtr\<System::IO::Stream\>) | Menggabungkan beberapa file [XPS](../) menjadi satu dokumen [XPS](../). |
| [MergeToPdf](./mergetopdf/)(System::ArrayPtr\<System::String\>, System::String, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Menggabungkan dokumen [XPS](../) ke PDF menggunakan instance [Device](../). |
| [MergeToPdf](./mergetopdf/)(System::ArrayPtr\<System::String\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Menggabungkan dokumen [XPS](../) ke PDF menggunakan instance [Device](../). |
| [Remove](./remove/)(T) | Menghapus elemen dari halaman aktif. |
| [RemoveAt](./removeat/)(int32_t) | Menghapus elemen pada posisi *index* dari halaman aktif. |
| [RemoveDocumentAt](./removedocumentat/)(int32_t) | Menghapus dokumen pada posisi *index*. |
| [RemovePage](./removepage/)(System::SharedPtr\<XpsModel::XpsPage\>) | Menghapus halaman dari dokumen. |
| [RemovePageAt](./removepageat/)(int32_t) | Menghapus halaman dari dokumen pada posisi *index*. |
| [Save](./save/)(System::String) | Menyimpan dokumen [XPS](../) ke file [XPS](../) yang terletak di *path* . |
| [Save](./save/)(System::SharedPtr\<System::IO::Stream\>) | Menyimpan dokumen [XPS](../) ke aliran. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) | Menyimpan dokumen ke file gambar. Direktori output dan nama file akan sama dengan file [XPS](../) input. Ekstensi file akan sesuai dengan format gambar dalam parameter "options". Jika dokumen diinisialisasi dengan aliran yang bukan FileStream, file gambar akan disimpan di folder saat ini dengan templat nama file default. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>, System::String, System::String) | Menyimpan dokumen ke file gambar ke direktori yang ditentukan dengan nama file yang ditentukan. Ekstensi file akan sesuai dengan format gambar dalam parameter "options". |
| [SaveAsImageBytes](./saveasimagebytes/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) | Menyimpan dokumen dalam format gambar bitmap sebagai array byte. |
| [SaveAsPdf](./saveaspdf/)(System::String, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Menyimpan dokumen dalam format PDF. |
| [SaveAsPdf](./saveaspdf/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Menyimpan dokumen dalam format PDF. |
| [SaveAsPs](./saveasps/)(System::String, System::SharedPtr\<EPS::Device::PsSaveOptions\>) | Menyimpan dokumen dalam format PS. |
| [SaveAsPs](./saveasps/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<EPS::Device::PsSaveOptions\>) | Menyimpan dokumen dalam format PS. |
| [SelectActiveDocument](./selectactivedocument/)(int32_t) | Memilih dokumen aktif untuk diedit. |
| [SelectActivePage](./selectactivepage/)(int32_t) | Memilih halaman dokumen aktif untuk diedit. |
| [set_JobPrintTicket](./set_jobprintticket/)(System::SharedPtr\<Aspose::Page::XPS::XpsMetadata::JobPrintTicket\>) | Mengembalikan/mengatur tiket cetak pekerjaan dokumen. |
| [SetDocumentPrintTicket](./setdocumentprintticket/)(int32_t, System::SharedPtr\<XpsMetadata::DocumentPrintTicket\>) | Menautkan *printTicket* ke dokumen yang diindeks oleh *documentIndex*. |
| [SetPagePrintTicket](./setpageprintticket/)(int32_t, int32_t, System::SharedPtr\<XpsMetadata::PagePrintTicket\>) | Menautkan *printTicket* ke halaman yang diindeks oleh *pageIndex* dalam dokumen yang diindeks oleh *documentIndex*. |
| [XpsDocument](./xpsdocument/)() | Membuat dokumen [XPS](../) kosong dengan ukuran halaman default. |
| [XpsDocument](./xpsdocument/)(System::String) | Membuka dokumen [XPS](../) yang ada yang terletak di *path*. |
| [XpsDocument](./xpsdocument/)(System::String, System::SharedPtr\<LoadOptions\>) | Membuka dokumen yang ada yang terletak di *path* sebagai dokumen [XPS](../). |
| [XpsDocument](./xpsdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<LoadOptions\>) | Memuat dokumen yang ada yang disimpan dalam *stream* sebagai dokumen [XPS](../). |
## Lihat Juga

* Class [Document](../../aspose.page/document/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [Aspose::Page::XPS](../)
* Library [Aspose.Page for C++](../../)
