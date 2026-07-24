---
title: "Metode Aspose::Page::XPS::XpsDocument::CreateArcSegment"
linktitle: "CreateArcSegment"
second_title: "Aspose.Page untuk C++"
description: "Metode Aspose::Page::XPS::XpsDocument::CreateArcSegment. Membuat segmen busur elips baru dalam C++."
type: docs
weight: 1000
url: /id/cpp/aspose.page.xps/xpsdocument/createarcsegment/
---
## XpsDocument::CreateArcSegment method


Membuat segmen busur elips baru.

```cpp
System::SharedPtr<XpsModel::XpsArcSegment> Aspose::Page::XPS::XpsDocument::CreateArcSegment(System::Drawing::PointF point, System::Drawing::SizeF size, float rotationAngle, bool isLargeArc, XpsModel::XpsSweepDirection sweepDirection, bool isStroked=true)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| titik | System::Drawing::PointF | Titik akhir busur elips. |
| size | System::Drawing::SizeF | Radius x dan y dari busur elips sebagai pasangan x,y. |
| rotationAngle | float | Menunjukkan bagaimana elips diputar relatif terhadap sistem koordinat saat ini. |
| isLargeArc | bool | Menentukan apakah busur digambar dengan sweep 180 derajat atau lebih. |
| sweepDirection | XpsModel::XpsSweepDirection | Arah di mana busur digambar. |
| isStroked | bool | Menentukan apakah goresan untuk segmen jalur ini digambar. |

### ReturnValue

Segmen busur elips baru.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsArcSegment](../../../aspose.page.xps.xpsmodel/xpsarcsegment/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [XpsSweepDirection](../../../aspose.page.xps.xpsmodel/xpssweepdirection/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
