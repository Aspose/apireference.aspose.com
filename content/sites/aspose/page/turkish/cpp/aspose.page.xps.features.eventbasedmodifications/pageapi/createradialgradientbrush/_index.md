---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateRadialGradientBrush method"
linktitle: "CreateRadialGradientBrush"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateRadialGradientBrush yöntemi. C++'ta yeni bir radyal degrade fırçası oluşturur."
type: docs
weight: 2000
url: /tr/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createradialgradientbrush/
---
## PageAPI::CreateRadialGradientBrush(System::Drawing::PointF, System::Drawing::PointF, float, float) method


Yeni bir radyal gradient fırçası oluşturur.

```cpp
System::SharedPtr<XpsModel::XpsRadialGradientBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateRadialGradientBrush(System::Drawing::PointF center, System::Drawing::PointF gradientOrigin, float radiusX, float radiusY)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| merkez | System::Drawing::PointF | Radyal degrade'nin merkez noktası (yani elipsin merkezi). |
| gradientOrigin | System::Drawing::PointF | Radyal degrade'nin başlangıç noktası. |
| radiusX | float | Radyal degradeyi tanımlayan elipsin x boyutundaki yarıçap. |
| radiusY | float | Elipsin y boyutundaki yarıçap, radyal gradyanı tanımlar. |

### ReturnValue

Yeni radyal gradyan fırçası.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsRadialGradientBrush](../../../aspose.page.xps.xpsmodel/xpsradialgradientbrush/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreateRadialGradientBrush(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) method


Yeni bir radyal gradient fırçası oluşturur.

```cpp
System::SharedPtr<XpsModel::XpsRadialGradientBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateRadialGradientBrush(System::SharedPtr<System::Collections::Generic::List<System::SharedPtr<XpsModel::XpsGradientStop>>> gradientStops, System::Drawing::PointF center, System::Drawing::PointF gradientOrigin, float radiusX, float radiusY)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| gradientStops | System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\> | Degrade duraklarının listesi. |
| merkez | System::Drawing::PointF | Radyal degrade'nin merkez noktası (yani elipsin merkezi). |
| gradientOrigin | System::Drawing::PointF | Radyal degrade'nin başlangıç noktası. |
| radiusX | float | Radyal degradeyi tanımlayan elipsin x boyutundaki yarıçap. |
| radiusY | float | Elipsin y boyutundaki yarıçap, radyal gradyanı tanımlar. |

### ReturnValue

Yeni radyal gradyan fırçası.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsRadialGradientBrush](../../../aspose.page.xps.xpsmodel/xpsradialgradientbrush/)
* Class [List](../../../system.collections.generic/list/)
* Class [XpsGradientStop](../../../aspose.page.xps.xpsmodel/xpsgradientstop/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
