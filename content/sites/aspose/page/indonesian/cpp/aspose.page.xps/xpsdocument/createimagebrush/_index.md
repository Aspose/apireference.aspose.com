---
title: "Aspose::Page::XPS::XpsDocument::CreateImageBrush method"
linktitle: "CreateImageBrush"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::XPS::XpsDocument::CreateImageBrush method. Membuat brush gambar baru di C++."
type: docs
weight: 1800
url: /id/cpp/aspose.page.xps/xpsdocument/createimagebrush/
---
## XpsDocument::CreateImageBrush(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) method


Membuat image brush baru.

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::XpsDocument::CreateImageBrush(System::SharedPtr<XpsModel::XpsImage> image, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| gambar | System::SharedPtr\<XpsModel::XpsImage\> | Sebuah sumber gambar. |
| viewbox | System::Drawing::RectangleF | Posisi dan dimensi konten sumber kuas. |
| jendela tampilan | System::Drawing::RectangleF | Wilayah dalam ruang koordinat yang berisi ubin kuas utama yang (mungkin berulang kali) diterapkan untuk mengisi wilayah tempat kuas diterapkan |

### ReturnValue

Kuas gambar baru.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsImageBrush](../../../aspose.page.xps.xpsmodel/xpsimagebrush/)
* Class [XpsImage](../../../aspose.page.xps.xpsmodel/xpsimage/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateImageBrush(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) method


Membuat image brush baru.

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::XpsDocument::CreateImageBrush(System::String imagePath, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| imagePath | System::String | Jalur ke gambar yang akan digunakan sebagai ubin kuas. |
| viewbox | System::Drawing::RectangleF | Posisi dan dimensi konten sumber kuas. |
| jendela tampilan | System::Drawing::RectangleF | Wilayah dalam ruang koordinat yang berisi ubin kuas utama yang (mungkin berulang kali) diterapkan untuk mengisi wilayah tempat kuas diterapkan |

### ReturnValue

Kuas gambar baru.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsImageBrush](../../../aspose.page.xps.xpsmodel/xpsimagebrush/)
* Class [String](../../../system/string/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
