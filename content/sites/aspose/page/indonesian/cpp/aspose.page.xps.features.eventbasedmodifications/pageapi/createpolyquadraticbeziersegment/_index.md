---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePolyQuadraticBezierSegment metode"
linktitle: "CreatePolyQuadraticBezierSegment"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePolyQuadraticBezierSegment metode. Membuat satu set baru kurva Bézier kuadratik dari titik sebelumnya dalam gambar jalur melalui sekumpulan verteks, menggunakan titik kontrol yang ditentukan dalam C++."
type: docs
weight: 1900
url: /id/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createpolyquadraticbeziersegment/
---
## PageAPI::CreatePolyQuadraticBezierSegment method


Membuat sekumpulan kurva Bézier kuadratik baru dari titik sebelumnya dalam path figure melalui sekumpulan vertex, menggunakan titik kontrol yang ditentukan.

```cpp
System::SharedPtr<XpsModel::XpsPolyQuadraticBezierSegment> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePolyQuadraticBezierSegment(System::ArrayPtr<System::Drawing::PointF> points, bool isStroked=true)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| points | System::ArrayPtr\<System::Drawing::PointF\> | Titik kontrol untuk beberapa segmen Bézier kuadratik. |
| isStroked | bool | Menentukan apakah goresan untuk segmen jalur ini digambar. |

### ReturnValue

Segmen kurva Bézier kuadratik baru.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPolyQuadraticBezierSegment](../../../aspose.page.xps.xpsmodel/xpspolyquadraticbeziersegment/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
