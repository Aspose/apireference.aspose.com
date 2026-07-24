---
title: "Aspose::Page::XPS::XpsDocument::CreateArcSegment yöntemi"
linktitle: "CreateArcSegment"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::XpsDocument::CreateArcSegment yöntemi. C++'ta yeni bir eliptik yay segmenti oluşturur."
type: docs
weight: 1000
url: /tr/cpp/aspose.page.xps/xpsdocument/createarcsegment/
---
## XpsDocument::CreateArcSegment method


Yeni bir eliptik yay segmenti oluşturur.

```cpp
System::SharedPtr<XpsModel::XpsArcSegment> Aspose::Page::XPS::XpsDocument::CreateArcSegment(System::Drawing::PointF point, System::Drawing::SizeF size, float rotationAngle, bool isLargeArc, XpsModel::XpsSweepDirection sweepDirection, bool isStroked=true)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| nokta | System::Drawing::PointF | Eliptik yayının son noktası. |
| size | System::Drawing::SizeF | Eliptik yayının x ve y yarıçapı x,y çifti olarak. |
| rotationAngle | float | Elipsin mevcut koordinat sistemine göre nasıl döndürüldüğünü gösterir. |
| isLargeArc | bool | Yayın 180 derece veya daha büyük bir açıyla çizilip çizilmediğini belirler. |
| sweepDirection | XpsModel::XpsSweepDirection | Yayın çizildiği yön. |
| isStroked | bool | Bu yol segmentinin çizgisinin çizilip çizilmediğini belirtir. |

### ReturnValue

Yeni eliptik yay segmenti.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsArcSegment](../../../aspose.page.xps.xpsmodel/xpsarcsegment/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [XpsSweepDirection](../../../aspose.page.xps.xpsmodel/xpssweepdirection/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
