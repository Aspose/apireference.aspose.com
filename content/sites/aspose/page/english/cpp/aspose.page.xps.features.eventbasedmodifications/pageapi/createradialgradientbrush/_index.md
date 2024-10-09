---
title: Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateRadialGradientBrush method
linktitle: CreateRadialGradientBrush
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateRadialGradientBrush method. Creates a new radial gradient brush in C++.'
type: docs
weight: 2000
url: /cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createradialgradientbrush/
---
## PageAPI::CreateRadialGradientBrush(System::Drawing::PointF, System::Drawing::PointF, float, float) method


Creates a new radial gradient brush.

```cpp
System::SharedPtr<Aspose::Page::XPS::XpsModel::XpsRadialGradientBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateRadialGradientBrush(System::Drawing::PointF center, System::Drawing::PointF gradientOrigin, float radiusX, float radiusY)
```


| Parameter | Type | Description |
| --- | --- | --- |
| center | System::Drawing::PointF | The center point of the radial gradient (that is, the center of the ellipse). |
| gradientOrigin | System::Drawing::PointF | The origin point of the radial gradient. |
| radiusX | float | The radius in the x dimension of the ellipse which defines the radial gradient. |
| radiusY | float | The radius in the y dimension of the ellipse which defines the radial gradient. |

### ReturnValue

New radial gradient brush.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsRadialGradientBrush](../../../aspose.page.xps.xpsmodel/xpsradialgradientbrush/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreateRadialGradientBrush(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<Aspose::Page::XPS::XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) method


Creates a new radial gradient brush.

```cpp
System::SharedPtr<Aspose::Page::XPS::XpsModel::XpsRadialGradientBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateRadialGradientBrush(System::SharedPtr<System::Collections::Generic::List<System::SharedPtr<Aspose::Page::XPS::XpsModel::XpsGradientStop>>> gradientStops, System::Drawing::PointF center, System::Drawing::PointF gradientOrigin, float radiusX, float radiusY)
```


| Parameter | Type | Description |
| --- | --- | --- |
| gradientStops | System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<Aspose::Page::XPS::XpsModel::XpsGradientStop\>\>\> | The list of gradient stops. |
| center | System::Drawing::PointF | The center point of the radial gradient (that is, the center of the ellipse). |
| gradientOrigin | System::Drawing::PointF | The origin point of the radial gradient. |
| radiusX | float | The radius in the x dimension of the ellipse which defines the radial gradient. |
| radiusY | float | The radius in the y dimension of the ellipse which defines the radial gradient. |

### ReturnValue

New radial gradient brush.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsRadialGradientBrush](../../../aspose.page.xps.xpsmodel/xpsradialgradientbrush/)
* Class [List](../../../system.collections.generic/list/)
* Class [XpsGradientStop](../../../aspose.page.xps.xpsmodel/xpsgradientstop/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
