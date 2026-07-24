---
title: "Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush metodu"
linktitle: "CreateRadialGradientBrush"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush metodu. C++'ta yeni bir radyal degrade fırçası oluşturur."
type: docs
weight: 2700
url: /tr/cpp/aspose.page.xps/xpsdocument/createradialgradientbrush/
---
## XpsDocument::CreateRadialGradientBrush(System::Drawing::PointF, System::Drawing::PointF, float, float) method


Yeni bir radyal gradient fırçası oluşturur.

```cpp
System::SharedPtr<XpsModel::XpsRadialGradientBrush> Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush(System::Drawing::PointF center, System::Drawing::PointF gradientOrigin, float radiusX, float radiusY)
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
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateRadialGradientBrush(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) method


Yeni bir radyal gradient fırçası oluşturur.

```cpp
System::SharedPtr<XpsModel::XpsRadialGradientBrush> Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush(System::SharedPtr<System::Collections::Generic::List<System::SharedPtr<XpsModel::XpsGradientStop>>> gradientStops, System::Drawing::PointF center, System::Drawing::PointF gradientOrigin, float radiusX, float radiusY)
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
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
