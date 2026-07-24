---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure طريقة"
linktitle: "CreatePathFigure"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure طريقة. ينشئ شكل مسار جديد في C++."
type: docs
weight: 1500
url: /ar/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createpathfigure/
---
## PageAPI::CreatePathFigure(System::Drawing::PointF, bool) method


ينشئ شكل مسار جديد.

```cpp
System::SharedPtr<XpsModel::XpsPathFigure> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure(System::Drawing::PointF startPoint, bool isClosed=false)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| startPoint | System::Drawing::PointF | نقطة البداية للمقطع الأول من شكل المسار. |
| isClosed | bool | يحدد ما إذا كان المسار مغلقًا. إذا تم تعيينه إلى true، يتم رسم الخط "مغلقًا"، أي أن النقطة الأخيرة في المقطع الأخير من شكل المسار تتصل بالنقطة المحددة في الخاصية StartPoint، وإلا يتم رسم الخط "مفتوحًا"، ولا تتصل النقطة الأخيرة بنقطة البداية. ينطبق فقط إذا تم استخدام شكل المسار في عنصر Path يحدد خطًا. |

### ReturnValue

شكل مسار جديد.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreatePathFigure(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\>, bool) method


ينشئ شكل مسار جديد.

```cpp
System::SharedPtr<XpsModel::XpsPathFigure> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePathFigure(System::Drawing::PointF startPoint, System::SharedPtr<System::Collections::Generic::List<System::SharedPtr<XpsModel::XpsPathSegment>>> segments, bool isClosed=false)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| startPoint | System::Drawing::PointF | نقطة البداية للمقطع الأول من شكل المسار. |
| المقاطع | System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\> | قائمة مقاطع المسار. |
| isClosed | bool | يحدد ما إذا كان المسار مغلقًا. إذا تم تعيينه إلى true، يتم رسم الخط "مغلقًا"، أي أن النقطة الأخيرة في المقطع الأخير من شكل المسار تتصل بالنقطة المحددة في الخاصية StartPoint، وإلا يتم رسم الخط "مفتوحًا"، ولا تتصل النقطة الأخيرة بنقطة البداية. ينطبق فقط إذا تم استخدام شكل المسار في عنصر Path يحدد خطًا. |

### ReturnValue

شكل مسار جديد.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [List](../../../system.collections.generic/list/)
* Class [XpsPathSegment](../../../aspose.page.xps.xpsmodel/xpspathsegment/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
