---
title: Aspose::Page::XPS::DocumentUtils::CreatePieSlice method
linktitle: CreatePieSlice
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::DocumentUtils::CreatePieSlice method. Creates a path geometry representing a circle slice between two radial rays in C++.'
type: docs
weight: 600
url: /cpp/aspose.page.xps/documentutils/createpieslice/
---
## DocumentUtils::CreatePieSlice method


Creates a path geometry representing a circle slice between two radial rays.

```cpp
System::SharedPtr<XpsModel::XpsPathGeometry> Aspose::Page::XPS::DocumentUtils::CreatePieSlice(System::Drawing::PointF center, float radius, float startAngle, float endAngle)
```


| Parameter | Type | Description |
| --- | --- | --- |
| center | System::Drawing::PointF | The center of the circle. |
| radius | float | The radius of the circle. |
| startAngle | float | The angle of the starting ray. |
| endAngle | float | The angle of the ending ray. |

### ReturnValue

The [XPS](../../) path geometry.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPathGeometry](../../../aspose.page.xps.xpsmodel/xpspathgeometry/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [DocumentUtils](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
