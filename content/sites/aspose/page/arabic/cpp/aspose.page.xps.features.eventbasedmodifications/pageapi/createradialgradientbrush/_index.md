---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateRadialGradientBrush method"
linktitle: "CreateRadialGradientBrush"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateRadialGradientBrush method. ينشئ فرشاة تدرج شعاعي جديدة في C++."
type: docs
weight: 2000
url: /ar/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createradialgradientbrush/
---
## PageAPI::CreateRadialGradientBrush(System::Drawing::PointF, System::Drawing::PointF, float, float) method


ينشئ فرشاة تدرج شعاعي جديدة.

```cpp
System::SharedPtr<XpsModel::XpsRadialGradientBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateRadialGradientBrush(System::Drawing::PointF center, System::Drawing::PointF gradientOrigin, float radiusX, float radiusY)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المركز | System::Drawing::PointF | نقطة المركز للتدرج الشعاعي (أي، مركز الشكل البيضاوي). |
| gradientOrigin | System::Drawing::PointF | نقطة الأصل للتدرج الشعاعي. |
| radiusX | عدد عائم | نصف القطر في البعد x للشكل البيضاوي الذي يحدد التدرج الشعاعي. |
| radiusY | عدد عائم | نصف القطر في البُعد y للبيضاوي الذي يحدد التدرج الشعاعي. |

### ReturnValue

فرشاة تدرج شعاعي جديدة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsRadialGradientBrush](../../../aspose.page.xps.xpsmodel/xpsradialgradientbrush/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreateRadialGradientBrush(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) method


ينشئ فرشاة تدرج شعاعي جديدة.

```cpp
System::SharedPtr<XpsModel::XpsRadialGradientBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateRadialGradientBrush(System::SharedPtr<System::Collections::Generic::List<System::SharedPtr<XpsModel::XpsGradientStop>>> gradientStops, System::Drawing::PointF center, System::Drawing::PointF gradientOrigin, float radiusX, float radiusY)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| gradientStops | System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\> | قائمة نقاط التدرج. |
| المركز | System::Drawing::PointF | نقطة المركز للتدرج الشعاعي (أي، مركز الشكل البيضاوي). |
| gradientOrigin | System::Drawing::PointF | نقطة الأصل للتدرج الشعاعي. |
| radiusX | عدد عائم | نصف القطر في البعد x للشكل البيضاوي الذي يحدد التدرج الشعاعي. |
| radiusY | عدد عائم | نصف القطر في البُعد y للبيضاوي الذي يحدد التدرج الشعاعي. |

### ReturnValue

فرشاة تدرج شعاعي جديدة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsRadialGradientBrush](../../../aspose.page.xps.xpsmodel/xpsradialgradientbrush/)
* Class [List](../../../system.collections.generic/list/)
* Class [XpsGradientStop](../../../aspose.page.xps.xpsmodel/xpsgradientstop/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
