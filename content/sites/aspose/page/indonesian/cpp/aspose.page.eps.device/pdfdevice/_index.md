---
title: "Kelas Aspose::Page::EPS::Device::PdfDevice"
linktitle: "PdfDevice"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::EPS::Device::PdfDevice class. Kelas ini mengenkapsulasi proses rendering dokumen ke PDF dalam C++."
type: docs
weight: 300
url: /id/cpp/aspose.page.eps.device/pdfdevice/
---
## PdfDevice class


Kelas ini mengenkapsulasi perenderan dokumen ke PDF.

```cpp
class PdfDevice : public Aspose::Page::Device,
                  public Aspose::Page::IMultiPageDevice,
                  public Aspose::Page::IStreamable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [AUTHOR](./author/)() | "Author" nilai properti. |
| static [BACKGROUND](./background/)() | "Background" kunci properti. |
| static [BACKGROUND_COLOR](./background_color/)() | "Background color" kunci properti. |
| virtual [Clip](./clip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Memotong menggunakan bentuk yang diberikan. Meneruskan ke writeClip(Rectangle), writeClip(RectangleF), atau writeClip(Shape). |
| virtual [ClipRect](./cliprect/)(float, float, float, float) | Memotong persegi panjang. Memanggil clip(Rectangle2D). |
| [ClosePage](./closepage/)() override | Melakukan persiapan yang diperlukan pada perangkat setelah halaman selesai dirender. |
| [CloseStream](./closestream/)() |  |
| static [COMPRESS](./compress/)() | "Compress" kunci properti. |
| virtual [Copy](./copy/)() |  |
| [Create](./create/)() override | Membuat salinan perangkat ini. |
| virtual [Create](./create/)(float, float, float, float) |  |
| [CreatePdfCanvas](./createpdfcanvas/)() |  |
| [Dispose](./dispose/)() override | Membuang konteks grafis. Jika pada pembuatan restoreOnDispose bernilai true, writeGraphicsRestore() akan dipanggil. |
| [Draw](./draw/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | Menggambar jalur. |
| [DrawBitmapGlyph](./drawbitmapglyph/)(System::SharedPtr\<System::Object\>, System::String, System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override |  |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Color) override | Menggambar gambar dengan transformasi dan latar belakang yang ditetapkan. |
| [DrawString](./drawstring/)(System::String, double, double) override | Menggambar string pada titik yang diberikan. |
| static [EMBED_FONTS](./embed_fonts/)() | "Embed font in document" kunci properti. |
| static [EMBED_FONTS_AS](./embed_fonts_as/)() | "What font type is used for embedding" kunci properti. |
| static [EMIT_ERRORS](./emit_errors/)() | "Emit errors" nilai properti. |
| static [EMIT_WARNINGS](./emit_warnings/)() | "Emit warnings" nilai properti. |
| [EndDocument](./enddocument/)() override | Melakukan persiapan yang diperlukan pada perangkat setelah dokumen selesai dirender. |
| [Fill](./fill/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | Mengisi jalur. |
| [FillLastClip](./filllastclip/)() |  |
| static [FIT_TO_PAGE](./fit_to_page/)() | "Fit content to page" kunci properti. |
| [get_CurrentPageNumber](./get_currentpagenumber/)() override | Nomor halaman saat ini. |
| [get_LastWrittenPaint](./get_lastwrittenpaint/)() const | Menggambar bingkai dan spanduk di sekitar string. Metode ini menghitung dan mengembalikan titik di mana kursor teks harus ditempatkan sebelum menggambar string. |
| [get_OutputStream](./get_outputstream/)() override | Menentukan atau mengembalikan aliran keluaran. |
| [get_WarningMessage](./get_warningmessage/)() |  |
| [GetFinalWrittenLength](./getfinalwrittenlength/)() override |  |
| [GetTransform](./gettransform/)() override | Mendapatkan transformasi saat ini. |
| [InitClip](./initclip/)() override | Menginisialisasi klip perangkat. |
| [InitPageNumbers](./initpagenumbers/)() override | Menginisialisasi jumlah halaman untuk output. |
| static [KEYWORDS](./keywords/)() | "Keywords" nilai properti. |
| [OpenPage](./openpage/)(System::String) override | Melakukan persiapan yang diperlukan pada perangkat sebelum perenderan halaman. |
| [OpenPage](./openpage/)(float, float) override | Melakukan persiapan yang diperlukan pada perangkat sebelum perenderan setiap halaman. |
| static [ORIENTATION](./orientation/)() | "Orientation" kunci properti. |
| static [PAGE_MARGINS](./page_margins/)() | "Page margins" kunci properti. |
| static [PAGE_SIZE_](./page_size_/)() | "Page size" kunci properti. |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<System::IO::Stream\>) | Menginisialisasi instance baru dari [PdfDevice](./) dengan aliran output. |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<System::IO::Stream\>, System::Drawing::Size) | Menginisialisasi instance baru dari [PdfDevice](./) dengan aliran output dan ukuran halaman yang ditentukan. |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<PdfDevice\>, bool) | Konstruktor klon. Menginisialisasi instance baru dari [PdfDevice](./) dengan perangkat yang ada. |
| [ReNew](./renew/)() override | Mengatur ulang perangkat ke keadaan awal untuk seluruh dokumen. Digunakan untuk mereset aliran output. |
| [ReNewForMerge](./renewformerge/)(bool) override | Mengatur ulang perangkat ke keadaan awal untuk seluruh dokumen saat menggabungkan beberapa dokumen. Digunakan untuk mereset aliran output. |
| [Reset](./reset/)() override | Jika parameter perangkat halaman akan diatur, metode ini memungkinkan mengembalikan aliran penulisan ke awal halaman. |
| [Reset](./reset/)(bool) override |  |
| virtual [ResetClip](./resetclip/)(System::Drawing::Rectangle) |  |
| [Rotate](./rotate/)(double) override | Memutar transformasi saat ini pada sumbu Z. Memanggil writeTransform(Transform). Memutar dengan sudut positif theta memutar titik pada sumbu x positif menuju sumbu y positif. |
| virtual [SavePageTransform](./savepagetransform/)() |  |
| [Scale](./scale/)(double, double) override | Menskalakan matriks transformasi saat ini. Memanggil writeTransform(Transform). |
| [set_Font](./set_font/)(System::SharedPtr\<BaseTrFont\>) override | Menentukan font saat ini. |
| [set_OutputStream](./set_outputstream/)(System::SharedPtr\<System::IO::Stream\>) override | Menentukan atau mengembalikan aliran keluaran. |
| [set_Paint](./set_paint/)(System::SharedPtr\<System::Drawing::Brush\>) override | Mengembalikan atau menentukan paint saat ini. |
| [set_Stroke](./set_stroke/)(System::SharedPtr\<System::Drawing::Pen\>) override | Mengembalikan atau menentukan stroke saat ini. |
| [SetClip](./setclip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | Menentukan klip perangkat. |
| virtual [SetFooter](./setfooter/)(System::SharedPtr\<Postscript::TrFont\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, int32_t) |  |
| virtual [SetHeader](./setheader/)(System::SharedPtr\<Postscript::TrFont\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, int32_t) |  |
| [SetSaveFromPatternCreate](./setsavefrompatterncreate/)() |  |
| [SetTransform](./settransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override | Menentukan transformasi saat ini. Karena sebagian besar format output tidak mengimplementasikan fungsi ini, transformasi invers dari currentTransform dihitung dan dikalikan dengan transformasi yang akan diatur. Hasilnya kemudian diteruskan melalui pemanggilan writeTransform(Transform). |
| [Shear](./shear/)(double, double) override | Memiringkan matriks transformasi saat ini. Memanggil writeTransform(Transform). |
| [StartDocument](./startdocument/)() override | Melakukan persiapan yang diperlukan pada perangkat sebelum memulai perenderan dokumen. |
| static [SUBJECT](./subject/)() | "Subject" nilai properti. |
| static [TITLE](./title/)() | "Title" nilai properti. |
| [ToString](./tostring/)() const override | Mengembalikan nama tipe perangkat. |
| [Transform](./transform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override | Mengubah matriks transformasi saat ini. Memanggil writeTransform(Transform) |
| [Translate](./translate/)(double, double) override | Menerjemahkan matriks transformasi saat ini. Memanggil writeTransform(Transform). |
| static [TRANSPARENT](./transparent/)() | "Transparent" kunci properti. |
| [UpdatePageParameters](./updatepageparameters/)(System::SharedPtr\<IMultiPageDevice\>) override | Memperbarui parameter halaman dari perangkat multi-halaman lainnya. |
| static [WRITE_IMAGES_AS](./write_images_as/)() | "Format of images" kunci properti. |
| [WriteBackground](./writebackground/)() override | Menulis latar belakang saat ini. |
| [WriteCap](./writecap/)(System::Drawing::Drawing2D::LineCap) override | Menulis cap dari stroke. |
| virtual [WriteClip](./writeclip/)(System::Drawing::RectangleF) |  |
| virtual [WriteClip](./writeclip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) |  |
| [WriteComment](./writecomment/)(System::String) override | Menulis komentar. |
| [WriteDash](./writedash/)(System::ArrayPtr\<double\>, double, System::Drawing::Drawing2D::DashCap, float) override | Menulis dash dari stroke. |
| virtual [WriteGraphicsRestore](./writegraphicsrestore/)() |  |
| virtual [WriteGraphicsSave](./writegraphicssave/)() |  |
| [WriteHeader](./writeheader/)() | Menulis katalog, docinfo, preferensi, dan (karena kami hanya menggunakan output satu halaman) pohon halaman. |
| [WriteJoin](./writejoin/)(System::Drawing::Drawing2D::LineJoin) override | Menulis join dari stroke. |
| [WriteLastWrittenPaint](./writelastwrittenpaint/)() | Menulis cat (paint) yang terakhir ditulis. Ini berguna dalam kasus ketika setelah menulis cat grafik dipulihkan ("Q"). |
| [WriteMiterLimit](./writemiterlimit/)(float) override | Menulis batas miter dari stroke. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::SolidBrush\>) override | Menulis cat sebagai warna yang diberikan. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::Drawing2D::LinearGradientBrush\>) override | Menulis cat sebagai gradien yang diberikan. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::TextureBrush\>) override | Menulis cat sebagai tekstur yang diberikan. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::Brush\>) override | Menulis cat. |
| [WriteString](./writestring/)(System::SharedPtr\<BaseTrFont\>, System::String) override | Menulis string dengan font yang ditentukan. |
| [WriteTrailer](./writetrailer/)() | Menulis trailer dokumen PDF. |
| virtual [WriteTransform](./writetransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Menulis matriks transformasi yang diberikan ke file. |
| [WriteWarning](./writewarning/)(System::String) override | Menulis peringatan, secara default ke System.err. |
| [WriteWidth](./writewidth/)(float) override | Menulis lebar stroke. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [VERSION](./version/) | "Version" kunci properti. |
| static [VERSION5](./version5/) | "Version of Adobe Acrobat Reader" nilai properti. |

## Deprecated
Kelas PdfDevice tidak lagi digunakan mulai dari 24.3. Silakan gunakan metode SaveAsPdf di kelas PsDocument sebagai gantinya. Pada 24.6 kelas ini akan sepenuhnya disembunyikan

## Lihat Juga

* Class [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* Class [IStreamable](../../aspose.page/istreamable/)
* Namespace [Aspose::Page::EPS::Device](../)
* Library [Aspose.Page for C++](../../)
