---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateLinearGradientBrush method"
linktitle: "CreateLinearGradientBrush"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateLinearGradientBrush method. C++'ta yeni bir doğrusal degrade fırçası oluşturur."
type: docs
weight: 1200
url: /tr/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createlineargradientbrush/
---
## PageAPI::CreateLinearGradientBrush(System::Drawing::PointF, System::Drawing::PointF) method


Yeni bir doğrusal gradient fırçası oluşturur.

```cpp
System::SharedPtr<XpsModel::XpsLinearGradientBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateLinearGradientBrush(System::Drawing::PointF startPoint, System::Drawing::PointF endPoint)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| startPoint | System::Drawing::PointF | Doğrusal degrade'nin başlangıç noktası. |
| endPoint | System::Drawing::PointF | Doğrusal degrade'nin bitiş noktası. |

### ReturnValue

Yeni doğrusal degrade fırçası.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsLinearGradientBrush](../../../aspose.page.xps.xpsmodel/xpslineargradientbrush/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreateLinearGradientBrush(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF) method


Yeni bir doğrusal gradient fırçası oluşturur.

```cpp
System::SharedPtr<XpsModel::XpsLinearGradientBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateLinearGradientBrush(System::SharedPtr<System::Collections::Generic::List<System::SharedPtr<XpsModel::XpsGradientStop>>> gradientStops, System::Drawing::PointF startPoint, System::Drawing::PointF endPoint)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| gradientStops | System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\> | Degrade duraklarının listesi. |
| startPoint | System::Drawing::PointF | Doğrusal degrade'nin başlangıç noktası. |
| endPoint | System::Drawing::PointF | Doğrusal degrade'nin bitiş noktası. |

### ReturnValue

Yeni doğrusal degrade fırçası.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsLinearGradientBrush](../../../aspose.page.xps.xpsmodel/xpslineargradientbrush/)
* Class [List](../../../system.collections.generic/list/)
* Class [XpsGradientStop](../../../aspose.page.xps.xpsmodel/xpsgradientstop/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
