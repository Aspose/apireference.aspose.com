---
title: "Aspose::Page::XPS::XpsDocument::CreatePolyQuadraticBezierSegment method"
linktitle: "CreatePolyQuadraticBezierSegment"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::XpsDocument::CreatePolyQuadraticBezierSegment method. C++'ta belirtilen kontrol noktalarını kullanarak, yol şeklinin önceki noktasından bir dizi köşe üzerinden yeni bir küme ikinci dereceden Bézier eğrileri oluşturur."
type: docs
weight: 2600
url: /tr/cpp/aspose.page.xps/xpsdocument/createpolyquadraticbeziersegment/
---
## XpsDocument::CreatePolyQuadraticBezierSegment method


Yol şekli içindeki önceki noktadan bir dizi köşe üzerinden, belirtilen kontrol noktalarını kullanarak yeni bir kuadratik Bézier eğrileri kümesi oluşturur.

```cpp
System::SharedPtr<XpsModel::XpsPolyQuadraticBezierSegment> Aspose::Page::XPS::XpsDocument::CreatePolyQuadraticBezierSegment(System::ArrayPtr<System::Drawing::PointF> points, bool isStroked=true)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| points | System::ArrayPtr\<System::Drawing::PointF\> | Birden fazla ikinci dereceden Bézier segmenti için kontrol noktaları. |
| isStroked | bool | Bu yol segmentinin çizgisinin çizilip çizilmediğini belirtir. |

### ReturnValue

Yeni ikinci dereceden Bézier eğrileri segmenti.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPolyQuadraticBezierSegment](../../../aspose.page.xps.xpsmodel/xpspolyquadraticbeziersegment/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
