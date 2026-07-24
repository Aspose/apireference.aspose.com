---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush method"
linktitle: "CreateImageBrush"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush method. Membuat kuas gambar baru dalam C++."
type: docs
weight: 1100
url: /id/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createimagebrush/
---
## PageAPI::CreateImageBrush(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) method


Membuat image brush baru.

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush(System::SharedPtr<XpsModel::XpsImage> image, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
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
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreateImageBrush(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) method


Membuat image brush baru.

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush(System::String imagePath, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
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
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
