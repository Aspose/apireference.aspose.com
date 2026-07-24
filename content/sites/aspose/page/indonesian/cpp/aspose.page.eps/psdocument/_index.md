---
title: "kelas Aspose::Page::EPS::PsDocument"
linktitle: "PsDocument"
second_title: "Aspose.Page untuk C++"
description: "kelas Aspose::Page::EPS::PsDocument. Kelas ini mengenkapsulasi dokumen PS/EPS dalam C++."
type: docs
weight: 700
url: /id/cpp/aspose.page.eps/psdocument/
---
## PsDocument class


Kelas ini mengenkapsulasi dokumen PS/EPS.

```cpp
class PsDocument : public Aspose::Page::Document
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Clip](./clip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Menambahkan klip ke keadaan grafis saat ini. |
| [ClipAndNewPath](./clipandnewpath/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Menambahkan klip ke keadaan grafis saat ini dan kemudian menulis operator "newpath". Hal ini diperlukan untuk menghindari konfluensi jalur klipping ini dengan beberapa jalur berikutnya seperti glif yang digambar dengan operator "charpath". |
| [ClipRectangle](./cliprectangle/)(System::Drawing::RectangleF) | Menambahkan persegi panjang klipping ke keadaan grafis saat ini. |
| [ClipText](./cliptext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | Menambahkan klip dari kontur teks yang diberikan dalam font yang diberikan. |
| [ClosePage](./closepage/)() | Selesaikan halaman saat ini. |
| [ConvertType1FontToTTF](./converttype1fonttottf/)(System::String, System::String) | Mengonversi font Type 1 ke **TrueType**. Nama font TTF yang dikonversi akan sama dengan font Type 1 input dengan ekstensi ".ttf". File TTF akan disimpan ke direktori output yang ditentukan. |
| [ConvertType3FontToTTF](./converttype3fonttottf/)(System::String, System::String) | Mengonversi font Type 3 ke **TrueType**. Nama font TTF yang dikonversi akan sama dengan file font Type 3 input dengan ekstensi ".ttf". File TTF akan disimpan ke direktori output yang ditentukan. |
| [ConvertType3FontToTTF](./converttype3fonttottf/)(System::String, System::SharedPtr\<System::IO::Stream\>) | Mengonversi font Type 3 menjadi aliran **TrueType**. |
| [CropEps](./cropeps/)(System::String, System::ArrayPtr\<float\>) | Memotong [PsDocument](./) yang diberikan sebagai file [EPS](../). Ia menyimpan file [EPS](../) awal dengan %BoundingBox yang ada diperbarui atau yang baru akan dibuat. |
| [CropEps](./cropeps/)(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<float\>) | Memotong [PsDocument](./) yang diberikan sebagai file [EPS](../). Ia menyimpan file [EPS](../) awal dengan %BoundingBox yang ada diperbarui atau yang baru akan dibuat. |
| [Draw](./draw/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Gambar jalur arbitrer. |
| [DrawArc](./drawarc/)(double, double, double, double, double, double) | Menggambar busur. |
| [DrawExplicitImageMask](./drawexplicitimagemask/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Menggambar gambar yang dimask. |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>) | Menggambar gambar. |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Color) | Menggambar gambar yang ditransformasi dengan latar belakang. |
| [DrawLine](./drawline/)(double, double, double, double) | Menggambar segmen garis. |
| [DrawOval](./drawoval/)(double, double, double, double) | Menggambar oval. |
| [DrawPolygon](./drawpolygon/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | Menggambar sebuah poligon. |
| [DrawPolygon](./drawpolygon/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | Menggambar sebuah poligone. |
| [DrawPolyline](./drawpolyline/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | Menggambar sebuah polyline. |
| [DrawPolyline](./drawpolyline/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | Menggambar sebuah polyline. |
| [DrawRect](./drawrect/)(double, double, double, double) | Menggambar sebuah persegi panjang. |
| [DrawRoundRect](./drawroundrect/)(double, double, double, double, double, double) | Menggambar sebuah persegi panjang bulat. |
| [DrawTransparentImage](./drawtransparentimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, int32_t) | Menggambar gambar transparan yang diubah. Jika gambar tidak memiliki saluran Alpha, gambar akan digambar sebagai gambar buram. |
| [ExtractEpsBoundingBox](./extractepsboundingbox/)() | Membaca file [EPS](../) dan mengekstrak kotak pembatas gambar [EPS](../) dari komentar %BoundingBox atau batas ukuran halaman default (0, 0, 595, 842) jika tidak ada. |
| [ExtractEpsSize](./extractepssize/)() | Membaca file [EPS](../) dan mengekstrak ukuran gambar [EPS](../) dari komentar %BoundingBox atau ukuran halaman default (595, 842) jika tidak ada. |
| [ExtractText](./extracttext/)(System::SharedPtr\<SaveOptions\>, int32_t, int32_t) | Mengekstrak teks dari file PS. Teks hanya dapat diekstrak jika ditulis dengan font Type 42 (**TrueType**) atau font Type 0 dengan font Type 42 dalam Peta Vektornya. |
| [Fill](./fill/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Mengisi jalur arbitrer. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Menambahkan rangkaian teks dengan mengisi interior glif dan menggambar kontur glif. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Menambahkan rangkaian teks dengan mengisi interior glif dan menggambar kontur glif. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Menambahkan rangkaian teks dengan mengisi interior glif dan menggambar kontur glif. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Menambahkan rangkaian teks dengan mengisi interior glif dan menggambar kontur glif. |
| [FillArc](./fillarc/)(double, double, double, double, double, double) | Mengisi sebuah busur. |
| [FillOval](./filloval/)(double, double, double, double) | Mengisi sebuah oval. |
| [FillPolygon](./fillpolygon/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | Mengisi sebuah poligone. |
| [FillPolygon](./fillpolygon/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | Mengisi sebuah poligone. |
| [FillRect](./fillrect/)(double, double, double, double) | Mengisi sebuah persegi panjang. |
| [FillRoundRect](./fillroundrect/)(double, double, double, double, double, double) | Mengisi sebuah persegi panjang bulat. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | Menambahkan rangkaian teks dengan mengisi interior glif. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float) | Menambahkan rangkaian teks dengan mengisi interior glif. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Menambahkan rangkaian teks dengan mengisi interior glif. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Menambahkan rangkaian teks dengan mengisi interior glif. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Menambahkan rangkaian teks dengan mengisi interior glif. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Menambahkan rangkaian teks dengan mengisi interior glif. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Menambahkan rangkaian teks dengan mengisi interior glif. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Menambahkan rangkaian teks dengan mengisi interior glif. |
| [get_InputStream](./get_inputstream/)() | Menginisialisasi [PsDocument](./) dengan aliran dan opsi pemuatan. |
| [get_NumberOfPages](./get_numberofpages/)() const | Mengembalikan jumlah halaman dalam dokumen PDF yang dihasilkan. |
| [GetPaint](./getpaint/)() | Mendapatkan cat dari keadaan grafik saat ini. |
| [GetStroke](./getstroke/)() | Mengatur goresan dalam keadaan grafik saat ini. |
| [GetXmpMetadata](./getxmpmetadata/)() | Membaca file PS/EPS dan mengekstrak XmpMetdata jika sudah ada atau menambahkan yang baru jika tidak ada. |
| [MergeToPdf](./mergetopdf/)(System::String, System::ArrayPtr\<System::String\>, System::SharedPtr\<SaveOptions\>) | Menggabungkan file PS/EPS ke sebuah perangkat. |
| [MergeToPdf](./mergetopdf/)(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<System::String\>, System::SharedPtr\<SaveOptions\>) | Menggabungkan file PS/EPS ke sebuah perangkat. |
| [OpenPage](./openpage/)(float, float) | Membuat halaman baru dan menjadikannya halaman saat ini. |
| [OpenPage](./openpage/)(System::String) | Membuat halaman baru dengan ukuran dokumen dan menjadikannya halaman saat ini. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | Menambahkan string teks dengan menggambar kontur glif. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float) | Menambahkan string teks dengan menggambar kontur glif. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Menambahkan string teks dengan menggambar kontur glif. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Menambahkan string teks dengan menggambar kontur glif. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Menambahkan string teks dengan menggambar kontur glif. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Menambahkan string teks dengan menggambar kontur glif. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Menambahkan string teks dengan menggambar kontur glif. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Menambahkan string teks dengan menggambar kontur glif. |
| [PsDocument](./psdocument/)() | Menginisialisasi [PsDocument](./) kosong. Konstruktor ini hanya digunakan untuk operasi tambahan yang tidak terkait dengan file PostScript, misalnya mengonversi font. |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>) | Menginisialisasi [PsDocument](./) kosong dengan halaman yang telah diinisialisasi. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | Menginisialisasi [PsDocument](./) kosong dengan halaman yang telah diinisialisasi. |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>, bool) | Menginisialisasi [PsDocument](./) kosong. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, bool) | Menginisialisasi [PsDocument](./) kosong. |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) | Menginisialisasi [PsDocument](./) kosong ketika jumlah halaman dokumen [Postscript](../../aspose.page.eps.postscript/) sudah diketahui sebelumnya. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) | Menginisialisasi [PsDocument](./) kosong ketika jumlah halaman dokumen [Postscript](../../aspose.page.eps.postscript/) sudah diketahui sebelumnya. |
| [PsDocument](./psdocument/)(System::String) | Menginisialisasi [PsDocument](./) dengan file PS/EPS masukan. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>) | Menginisialisasi [PsDocument](./) dengan aliran file PS/EPS. |
| [ResizeEps](./resizeeps/)(System::String, System::Drawing::SizeF, Units) | Mengubah ukuran [PsDocument](./) yang diberikan menjadi file [EPS](../). Metode ini hanya digunakan setelah mengekstrak ukuran [EPS](../). Ini menyimpan file [EPS](../) awal filD:\\ASPOSE.GIT\\aspose.pdf.cpp\\cs_porter_produce\\Aspose.Page.Cpp.Page.Cpp\\eps\\src_eps\\PsDocument.hThe output directory where image file will be saved.e dengan %BoundingBox yang ada yang diperbarui atau yang baru akan dibuat. Matriks transformasi [Page](../../aspose.page/) juga akan diatur. |
| [ResizeEps](./resizeeps/)(System::SharedPtr\<System::IO::Stream\>, System::Drawing::SizeF, Units) | Mengubah ukuran [PsDocument](./) yang diberikan menjadi file [EPS](../). Metode ini hanya digunakan setelah mengekstrak ukuran [EPS](../). Ini menyimpan file [EPS](../) awal dengan %BoundingBox yang ada yang diperbarui atau yang baru akan dibuat. Matriks transformasi [Page](../../aspose.page/) juga akan diatur. |
| [Rotate](./rotate/)(float) | Menambahkan rotasi berlawanan arah jarum jam sekitar asal ke keadaan grafis saat ini (memutar matriks saat ini). |
| [Rotate](./rotate/)(int32_t) | Menambahkan rotasi berlawanan arah jarum jam sekitar asal ke keadaan grafis saat ini (memutar matriks saat ini). |
| [Save](./save/)(System::String) | Menyimpan [PsDocument](./) yang diberikan sebagai file [EPS](../). Metode ini hanya digunakan setelah memperbarui metadata [XMP](../../aspose.page.eps.xmp/). Ini menyimpan file [EPS](../) awal dengan metadata yang ada yang diperbarui atau yang baru dibuat saat memanggil metode GetMetadata. Pada kasus terakhir semua kode PostScript yang diperlukan dan komentar [EPS](../) ditambahkan. |
| [Save](./save/)(System::SharedPtr\<System::IO::Stream\>) | Menyimpan [PsDocument](./) yang diberikan ke aliran. Metode ini hanya digunakan setelah memperbarui metadata [XMP](../../aspose.page.eps.xmp/). Ini menyimpan file [EPS](../) awal dengan metadata yang ada yang diperbarui atau yang baru dibuat saat memanggil metode GetMetadata. Pada kasus terakhir semua kode PostScript yang diperlukan dan komentar [EPS](../) ditambahkan. |
| [Save](./save/)() | Menyimpan [PsDocument](./) yang diberikan sebagai file PS atau [EPS](../). Metode ini hanya digunakan ketika [PsDocument](./) dibuat dari awal. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Device::ImageSaveOptions\>) | Menyimpan file PS/EPS ke file gambar. Direktori output dan nama file akan sama dengan file PS masukan. Ekstensi file akan sesuai dengan format gambar dalam parameter "options". Jika dokumen diinisialisasi dengan aliran yang bukan FileStream, file gambar akan disimpan di folder saat ini dengan templat nama file default. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Device::ImageSaveOptions\>, System::String, System::String) | Menyimpan file PS/EPS ke file gambar ke direktori yang ditentukan dengan nama file yang ditentukan. Ekstensi file akan sesuai dengan format gambar dalam parameter "options". |
| [SaveAsImagesBytes](./saveasimagesbytes/)(System::SharedPtr\<Device::ImageSaveOptions\>) | Menyimpan file PS/EPS ke array byte gambar. |
| [SaveAsPdf](./saveaspdf/)(System::String, System::SharedPtr\<Device::PdfSaveOptions\>) | Menyimpan file PS/EPS ke file PDF. |
| [SaveAsPdf](./saveaspdf/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PdfSaveOptions\>) | Menyimpan file PS/EPS ke aliran PDF. |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | Menyimpan gambar PNG/JPEG/TIFF/BMP/GIF/EMF dari aliran masukan ke aliran keluaran [EPS](../). |
| static [SaveImageAsEps](./saveimageaseps/)(System::String, System::String, System::SharedPtr\<Device::PsSaveOptions\>) | Menyimpan gambar PNG/JPEG/TIFF/BMP/GIF/EMF dari file ke file [EPS](../). |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::String, System::SharedPtr\<Device::PsSaveOptions\>) | Menyimpan objek Bitmap ke file [EPS](../). |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | Menyimpan objek Bitmap ke aliran keluaran [EPS](../). |
| [Scale](./scale/)(float, float) | Menambahkan skala ke keadaan grafis saat ini (menskalakan matriks saat ini). |
| [set_InputStream](./set_inputstream/)(System::SharedPtr\<System::IO::Stream\>) | Menginisialisasi [PsDocument](./) dengan aliran dan opsi pemuatan. |
| [SetPageDevice](./setpagedevice/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Mengatur parameter perangkat halaman (lihat operator "setpagedevice" dalam spesifikasi PostScript). Di antaranya dapat berupa ukuran halaman, warna, dll. |
| [SetPageSize](./setpagesize/)(float, float) | Mengatur ukuran halaman. Untuk membuat halaman dengan ukuran berbeda dalam satu dokumen, gunakan metode [SetPageDevice](./setpagedevice/) tepat setelah metode ini. |
| [SetPaint](./setpaint/)(System::SharedPtr\<System::Drawing::Brush\>) | Mengatur cat dalam keadaan grafik saat ini. |
| [SetStroke](./setstroke/)(System::SharedPtr\<System::Drawing::Pen\>) | Mengatur goresan dalam keadaan grafik saat ini. |
| [SetTransform](./settransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Atur transformasi saat ini menjadi ini. |
| [Shear](./shear/)(float, float) | Memutar keadaan grafik saat ini berlawanan arah jarum jam di sekitar suatu titik. |
| [Transform](./transform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Menambahkan transformasi ke keadaan grafik saat ini (menggabungkan matriks ini dengan yang saat ini). |
| [Translate](./translate/)(float, float) | Menambahkan translasi ke keadaan grafik saat ini (menterjemahkan matriks saat ini). |
| [WriteGraphicsRestore](./writegraphicsrestore/)() | Menulis pemulihan keadaan grafik saat ini (Lihat spesifikasi PostScript pada operator "grestore"). |
| [WriteGraphicsSave](./writegraphicssave/)() | Menulis penyimpanan keadaan grafik saat ini (Lihat spesifikasi PostScript pada operator "gsave"). |
## Lihat Juga

* Class [Document](../../aspose.page/document/)
* Namespace [Aspose::Page::EPS](../)
* Library [Aspose.Page for C++](../../)
