---
title: "Aspose::Page::XPS::Presentation::Image::ImageSaveOptions kelas"
linktitle: "ImageSaveOptions"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::XPS::Presentation::Image::ImageSaveOptions kelas. Kelas dasar untuk opsi penyimpanan XPS-sebagai-gambar dalam C++."
type: docs
weight: 200
url: /id/cpp/aspose.page.xps.presentation.image/imagesaveoptions/
---
## ImageSaveOptions class


Kelas dasar untuk opsi penyimpanan XPS-sebagai-gambar.

```cpp
class ImageSaveOptions : public Aspose::Page::SaveOptions,
                         public Aspose::Page::IMultiPageSaveOptions,
                         public Aspose::Page::XPS::Presentation::IPipelineOptions,
                         public Aspose::Page::XPS::Presentation::IEventBasedModificationOptions
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_BatchSize](./get_batchsize/)() override | Menentukan ukuran bagian halaman yang akan dipindahkan dari node ke node. |
| [get_BeforePageSavingEventHandlers](./get_beforepagesavingeventhandlers/)() override | Koleksi penangkap peristiwa yang melakukan modifikasi pada halaman [XPS](../../aspose.page.xps/) tepat sebelum disimpan. |
| [get_ImageSize](./get_imagesize/)() const | Mendapatkan/mengatur ukuran gambar keluaran dalam piksel. |
| [get_InterpolationMode](./get_interpolationmode/)() const | Mendapatkan/mengatur mode interpolasi. |
| [get_PageNumbers](./get_pagenumbers/)() override | Mendapatkan/mengatur array nomor halaman yang akan dikonversi. |
| [get_Resolution](./get_resolution/)() const | Mendapatkan/mengatur resolusi gambar. |
| [get_SmoothingMode](./get_smoothingmode/)() const | Mendapatkan/mengatur mode penghalusan. |
| [get_TextRenderingHint](./get_textrenderinghint/)() const | Mendapatkan/mengatur petunjuk perenderan teks. |
| [ImageSaveOptions](./imagesaveoptions/)() | Membuat instance baru dari opsi. |
| [set_BatchSize](./set_batchsize/)(int32_t) override | Menentukan ukuran bagian halaman yang akan dipindahkan dari node ke node. |
| [set_ImageSize](./set_imagesize/)(System::Drawing::Size) | Mendapatkan/mengatur ukuran gambar keluaran dalam piksel. |
| [set_InterpolationMode](./set_interpolationmode/)(System::Drawing::Drawing2D::InterpolationMode) | Mendapatkan/mengatur mode interpolasi. |
| [set_PageNumbers](./set_pagenumbers/)(System::ArrayPtr\<int32_t\>) override | Mendapatkan/mengatur array nomor halaman yang akan dikonversi. |
| [set_Resolution](./set_resolution/)(float) | Mendapatkan/mengatur resolusi gambar. |
| [set_SmoothingMode](./set_smoothingmode/)(System::Drawing::Drawing2D::SmoothingMode) | Mendapatkan/mengatur mode penghalusan. |
| [set_TextRenderingHint](./set_textrenderinghint/)(System::Drawing::Text::TextRenderingHint) | Mendapatkan/mengatur petunjuk perenderan teks. |
## Lihat Juga

* Class [SaveOptions](../../aspose.page/saveoptions/)
* Class [IMultiPageSaveOptions](../../aspose.page/imultipagesaveoptions/)
* Class [IPipelineOptions](../../aspose.page.xps.presentation/ipipelineoptions/)
* Class [IEventBasedModificationOptions](../../aspose.page.xps.presentation/ieventbasedmodificationoptions/)
* Namespace [Aspose::Page::XPS::Presentation::Image](../)
* Library [Aspose.Page for C++](../../)
