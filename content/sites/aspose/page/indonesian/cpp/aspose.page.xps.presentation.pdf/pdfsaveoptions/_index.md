---
title: "Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions kelas"
linktitle: "PdfSaveOptions"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions kelas. Kelas untuk opsi penyimpanan XPS-as-PDF dalam C++."
type: docs
weight: 300
url: /id/cpp/aspose.page.xps.presentation.pdf/pdfsaveoptions/
---
## PdfSaveOptions class


Kelas untuk opsi penyimpanan XPS-sebagai-PDF.

```cpp
class PdfSaveOptions : public Aspose::Page::SaveOptions,
                       public Aspose::Page::IMultiPageSaveOptions,
                       public Aspose::Page::XPS::Presentation::IXpsTextConversionOptions,
                       public Aspose::Page::XPS::Presentation::IPipelineOptions,
                       public Aspose::Page::XPS::Presentation::IEventBasedModificationOptions
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_BatchSize](./get_batchsize/)() override | Menentukan ukuran bagian halaman yang akan dipindahkan dari node ke node. |
| [get_BeforePageSavingEventHandlers](./get_beforepagesavingeventhandlers/)() override | Koleksi penangkap peristiwa yang melakukan modifikasi pada halaman [XPS](../../aspose.page.xps/) tepat sebelum disimpan. |
| [get_EncryptionDetails](./get_encryptiondetails/)() const | Mendapatkan detail enkripsi. Jika tidak disetel, maka tidak akan ada enkripsi yang dilakukan. |
| [get_ImageCompression](./get_imagecompression/)() const | Menentukan jenis kompresi yang akan digunakan untuk semua gambar dalam dokumen. Defaultnya adalah [PdfImageCompression::Auto](../pdfimagecompression/). |
| [get_OutlineTreeExpansionLevel](./get_outlinetreeexpansionlevel/)() const | Menentukan sampai level berapa garis besar dokumen harus diperluas ketika file PDF dibuka di penampil. 1 - hanya item garis besar tingkat pertama yang ditampilkan, 2 - hanya item tingkat pertama dan kedua yang ditampilkan, dan seterusnya. Defaultnya adalah 1. |
| [get_OutlineTreeHeight](./get_outlinetreeheight/)() const | Menentukan tinggi pohon garis besar dokumen yang akan disimpan. 0 - pohon garis besar tidak akan dikonversi, 1 - hanya item garis besar tingkat pertama yang akan dikonversi, dan seterusnya. Defaultnya adalah 10. |
| [get_PageNumbers](./get_pagenumbers/)() override | Mendapatkan/mengatur array nomor halaman yang akan dikonversi. |
| [get_PreserveText](./get_preservetext/)() override | In [XPS](../../aspose.page.xps/), beberapa elemen teks mungkin berisi referensi ke bentuk glif alternatif yang tidak sesuai dengan kode karakter apa pun dalam font. Jika flag ini disetel ke true, teks dari elemen [XPS](../../aspose.page.xps/) tersebut diubah menjadi bentuk grafik. Kemudian teks itu sendiri muncul transparan di atasnya. Ini membuat teks elemen tersebut dapat dipilih. Namun efek sampingnya adalah file output mungkin jauh lebih besar daripada aslinya. Jika flag ini disetel ke false, karakter yang seharusnya ditampilkan sebagai bentuk alternatif diganti dengan karakter lain yang dipetakan ke bentuk glif alternatif. Oleh karena itu teks, meskipun masih dapat dipilih, akan dimodifikasi dan kemungkinan menjadi tidak dapat dibaca. Defaultnya adalah false. |
| [get_TextCompression](./get_textcompression/)() const | Menentukan pada level berapa dalam garis besar dokumen untuk menampilkan objek [ApsBookmark](../). 0 - tidak ditampilkan. 1 pada level pertama dan seterusnya. Defaultnya adalah 0. |
| [PdfSaveOptions](./pdfsaveoptions/)() | Membuat instance baru dari opsi. |
| [set_BatchSize](./set_batchsize/)(int32_t) override | Menentukan ukuran bagian halaman yang akan dipindahkan dari node ke node. |
| [set_EncryptionDetails](./set_encryptiondetails/)(System::SharedPtr\<PdfEncryptionDetails\>) | Mengatur detail enkripsi. Jika tidak disetel, maka tidak akan ada enkripsi yang dilakukan. |
| [set_ImageCompression](./set_imagecompression/)(PdfImageCompression) | Menentukan jenis kompresi yang akan digunakan untuk semua gambar dalam dokumen. Defaultnya adalah [PdfImageCompression::Auto](../pdfimagecompression/). |
| [set_OutlineTreeExpansionLevel](./set_outlinetreeexpansionlevel/)(int32_t) | Menentukan sampai level berapa garis besar dokumen harus diperluas ketika file PDF dibuka di penampil. 1 - hanya item garis besar tingkat pertama yang ditampilkan, 2 - hanya item tingkat pertama dan kedua yang ditampilkan, dan seterusnya. Defaultnya adalah 1. |
| [set_OutlineTreeHeight](./set_outlinetreeheight/)(int32_t) | Menentukan tinggi pohon garis besar dokumen yang akan disimpan. 0 - pohon garis besar tidak akan dikonversi, 1 - hanya item garis besar tingkat pertama yang akan dikonversi, dan seterusnya. Defaultnya adalah 10. |
| [set_PageNumbers](./set_pagenumbers/)(System::ArrayPtr\<int32_t\>) override | Mendapatkan/mengatur array nomor halaman yang akan dikonversi. |
| [set_PreserveText](./set_preservetext/)(bool) override | In [XPS](../../aspose.page.xps/), beberapa elemen teks mungkin berisi referensi ke bentuk glif alternatif yang tidak sesuai dengan kode karakter apa pun dalam font. Jika flag ini disetel ke true, teks dari elemen [XPS](../../aspose.page.xps/) tersebut diubah menjadi bentuk grafik. Kemudian teks itu sendiri muncul transparan di atasnya. Ini membuat teks elemen tersebut dapat dipilih. Namun efek sampingnya adalah file output mungkin jauh lebih besar daripada aslinya. Jika flag ini disetel ke false, karakter yang seharusnya ditampilkan sebagai bentuk alternatif diganti dengan karakter lain yang dipetakan ke bentuk glif alternatif. Oleh karena itu teks, meskipun masih dapat dipilih, akan dimodifikasi dan kemungkinan menjadi tidak dapat dibaca. Defaultnya adalah false. |
| [set_TextCompression](./set_textcompression/)(PdfTextCompression) | Menentukan pada level berapa dalam garis besar dokumen untuk menampilkan objek [ApsBookmark](../). 0 - tidak ditampilkan. 1 pada level pertama dan seterusnya. Defaultnya adalah 0. |
## Lihat Juga

* Class [SaveOptions](../../aspose.page/saveoptions/)
* Class [IMultiPageSaveOptions](../../aspose.page/imultipagesaveoptions/)
* Class [IXpsTextConversionOptions](../../aspose.page.xps.presentation/ixpstextconversionoptions/)
* Class [IPipelineOptions](../../aspose.page.xps.presentation/ipipelineoptions/)
* Class [IEventBasedModificationOptions](../../aspose.page.xps.presentation/ieventbasedmodificationoptions/)
* Namespace [Aspose::Page::XPS::Presentation::Pdf](../)
* Library [Aspose.Page for C++](../../)
