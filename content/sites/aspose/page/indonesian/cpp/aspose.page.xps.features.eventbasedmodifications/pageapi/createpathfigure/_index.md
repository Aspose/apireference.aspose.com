---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure metode"
linktitle: "CreatePathFigure"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure metode. Membuat figur jalur baru dalam C++."
type: docs
weight: 1500
url: /id/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createpathfigure/
---
## PageAPI::CreatePathFigure(System::Drawing::PointF, bool) method


Membuat path figure baru.

```cpp
System::SharedPtr<XpsModel::XpsPathFigure> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure(System::Drawing::PointF startPoint, bool isClosed=false)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| startPoint | System::Drawing::PointF | Titik awal untuk segmen pertama dari gambar jalur. |
| isClosed | bool | Menentukan apakah jalur ditutup. Jika disetel ke true, goresan digambar "closed", yaitu titik terakhir pada segmen terakhir dari gambar jalur dihubungkan dengan titik yang ditentukan dalam atribut StartPoint, jika tidak goresan digambar "open", dan titik terakhir tidak terhubung ke titik awal. Hanya berlaku jika gambar jalur digunakan dalam elemen Path yang menentukan goresan. |

### ReturnValue

Gambar jalur baru.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreatePathFigure(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\>, bool) method


Membuat path figure baru.

```cpp
System::SharedPtr<XpsModel::XpsPathFigure> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure(System::Drawing::PointF startPoint, System::SharedPtr<System::Collections::Generic::List<System::SharedPtr<XpsModel::XpsPathSegment>>> segments, bool isClosed=false)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| startPoint | System::Drawing::PointF | Titik awal untuk segmen pertama dari gambar jalur. |
| segmen | System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\> | Daftar segmen jalur. |
| isClosed | bool | Menentukan apakah jalur ditutup. Jika disetel ke true, goresan digambar "closed", yaitu titik terakhir pada segmen terakhir dari gambar jalur dihubungkan dengan titik yang ditentukan dalam atribut StartPoint, jika tidak goresan digambar "open", dan titik terakhir tidak terhubung ke titik awal. Hanya berlaku jika gambar jalur digunakan dalam elemen Path yang menentukan goresan. |

### ReturnValue

Gambar jalur baru.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [List](../../../system.collections.generic/list/)
* Class [XpsPathSegment](../../../aspose.page.xps.xpsmodel/xpspathsegment/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
