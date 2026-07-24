---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateRadialGradientBrush method"
linktitle: "CreateRadialGradientBrush"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateRadialGradientBrush method. Skapar en ny radialgradientpensel i C++."
type: docs
weight: 2000
url: /sv/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createradialgradientbrush/
---
## PageAPI::CreateRadialGradientBrush(System::Drawing::PointF, System::Drawing::PointF, float, float) method


Skapar en ny radiell gradientpensel.

```cpp
System::SharedPtr<XpsModel::XpsRadialGradientBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateRadialGradientBrush(System::Drawing::PointF center, System::Drawing::PointF gradientOrigin, float radiusX, float radiusY)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| center | System::Drawing::PointF | Centrumpunkten för den radiala gradienten (det vill säga ellipsens centrum). |
| gradientOrigin | System::Drawing::PointF | Ursprungspunkten för den radiala gradienten. |
| radiusX | float | Radien i x-dimensionen av ellipsen som definierar den radiala gradienten. |
| radiusY | float | Radien i y-dimensionen av ellipsen som definierar den radiella gradienten. |

### ReturnValue

Ny pensel för radiell gradient.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsRadialGradientBrush](../../../aspose.page.xps.xpsmodel/xpsradialgradientbrush/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreateRadialGradientBrush(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) method


Skapar en ny radiell gradientpensel.

```cpp
System::SharedPtr<XpsModel::XpsRadialGradientBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateRadialGradientBrush(System::SharedPtr<System::Collections::Generic::List<System::SharedPtr<XpsModel::XpsGradientStop>>> gradientStops, System::Drawing::PointF center, System::Drawing::PointF gradientOrigin, float radiusX, float radiusY)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| gradientStops | System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\> | Listan med gradientstopp. |
| center | System::Drawing::PointF | Centrumpunkten för den radiala gradienten (det vill säga ellipsens centrum). |
| gradientOrigin | System::Drawing::PointF | Ursprungspunkten för den radiala gradienten. |
| radiusX | float | Radien i x-dimensionen av ellipsen som definierar den radiala gradienten. |
| radiusY | float | Radien i y-dimensionen av ellipsen som definierar den radiella gradienten. |

### ReturnValue

Ny pensel för radiell gradient.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsRadialGradientBrush](../../../aspose.page.xps.xpsmodel/xpsradialgradientbrush/)
* Class [List](../../../system.collections.generic/list/)
* Class [XpsGradientStop](../../../aspose.page.xps.xpsmodel/xpsgradientstop/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
