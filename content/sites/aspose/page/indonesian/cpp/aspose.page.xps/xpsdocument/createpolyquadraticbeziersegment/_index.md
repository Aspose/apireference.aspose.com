---
title: "Aspose::Page::XPS::XpsDocument::CreatePolyQuadraticBezierSegment metode"
linktitle: "CreatePolyQuadraticBezierSegment"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::XPS::XpsDocument::CreatePolyQuadraticBezierSegment metode. Membuat satu set baru kurva Bézier kuadratik dari titik sebelumnya dalam figur jalur melalui sekumpulan verteks, menggunakan titik kontrol yang ditentukan dalam C++."
type: docs
weight: 2600
url: /id/cpp/aspose.page.xps/xpsdocument/createpolyquadraticbeziersegment/
---
## XpsDocument::CreatePolyQuadraticBezierSegment method


Membuat sekumpulan kurva Bézier kuadratik baru dari titik sebelumnya dalam path figure melalui sekumpulan vertex, menggunakan titik kontrol yang ditentukan.

```cpp
System::SharedPtr<XpsModel::XpsPolyQuadraticBezierSegment> Aspose::Page::XPS::XpsDocument::CreatePolyQuadraticBezierSegment(System::ArrayPtr<System::Drawing::PointF> points, bool isStroked=true)
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
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
