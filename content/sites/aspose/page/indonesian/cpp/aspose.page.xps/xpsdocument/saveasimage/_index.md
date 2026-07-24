---
title: "Metode Aspose::Page::XPS::XpsDocument::SaveAsImage"
linktitle: "SaveAsImage"
second_title: "Aspose.Page untuk C++"
description: "Metode Aspose::Page::XPS::XpsDocument::SaveAsImage. Menyimpan dokumen ke file gambar. Direktori output dan nama file akan sama seperti dari file XPS input. Ekstensi file akan sesuai dengan format gambar dalam parameter \"options\". Jika dokumen diinisialisasi dengan aliran yang bukan FileStream, file gambar akan disimpan di folder saat ini dengan templat nama file default dalam C++."
type: docs
weight: 5500
url: /id/cpp/aspose.page.xps/xpsdocument/saveasimage/
---
## XpsDocument::SaveAsImage(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) method


Menyimpan dokumen ke file gambar. Direktori output dan nama file akan sama dengan file [XPS](../../) input. Ekstensi file akan sesuai dengan format gambar dalam parameter "options". Jika dokumen diinisialisasi dengan stream yang bukan FileStream, file gambar akan disimpan di folder saat ini dengan templat nama file default.

```cpp
void Aspose::Page::XPS::XpsDocument::SaveAsImage(System::SharedPtr<Presentation::Image::ImageSaveOptions> options)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| opsi | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | Opsi untuk menyimpan dokumen dalam format gambar bitmap. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::SaveAsImage(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>, System::String, System::String) method


Menyimpan dokumen ke file gambar ke direktori yang ditentukan dengan nama file yang ditentukan. Ekstensi file akan sesuai dengan format gambar dalam parameter "options".

```cpp
void Aspose::Page::XPS::XpsDocument::SaveAsImage(System::SharedPtr<Presentation::Image::ImageSaveOptions> options, System::String outDir, System::String fileNameTemplate)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| opsi | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | Opsi untuk menyimpan dokumen dalam format gambar bitmap. |
| outDir | System::String | Direktori output tempat file gambar akan disimpan. |
| fileNameTemplate | System::String | Templat nama file untuk gambar (tanpa ekstensi). Jika file [XPS](../../) input berisi 1 halaman, maka akan menjadi tepat nama file, jika tidak "_[n]", di mana "n" - nomor halaman mulai dari 0, akhiran akan ditambahkan ke ini. Ekstensi file akan sesuai dengan format gambar dalam parameter "option". |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [String](../../../system/string/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
