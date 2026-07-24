---
title: "الفئة Aspose::Page::XPS::Features::EventBasedModifications::BeforeSavingEventArgs"
linktitle: "BeforeSavingEventArgs"
second_title: "Aspose.Page لـ C++"
description: "الفئة Aspose::Page::XPS::Features::EventBasedModifications::BeforeSavingEventArgs. يحدد الفئة الأساسية للمعاملات الخاصة بمختلف أحداث ما قبل الحفظ في C++."
type: docs
weight: 200
url: /ar/cpp/aspose.page.xps.features.eventbasedmodifications/beforesavingeventargs/
---
## BeforeSavingEventArgs class


يعرف الفئة الأساسية للمعاملات الخاصة بأحداث الحفظ المختلفة قبل الحفظ.

```cpp
template<typename T>class BeforeSavingEventArgs : public System::Object
```


| Parameter | الوصف |
| --- | --- |
| T | نوع واجهة تعديل API. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_AbsolutePageNumber](./get_absolutepagenumber/)() const | رقم الصفحة المطلق الحالي عبر جميع المستندات داخل حزمة [XPS](../../aspose.page.xps/). |
| [get_DocumentNumber](./get_documentnumber/)() const | رقم المستند الحالي داخل حزمة [XPS](../../aspose.page.xps/). |
| [get_ElementAPI](./get_elementapi/)() const | يحصل على واجهة تعديل العنصر الذي سيُحفظ قريبًا. |
| [get_OutputPageNumber](./get_outputpagenumber/)() const | رقم الإخراج الحالي. يختلف عن **AbsolutePageNumber** إذا تم تحديد خيار حفظ **PageNumbers**. |
| [get_RelativePageNumber](./get_relativepagenumber/)() const | رقم الصفحة الحالي بالنسبة إلى المستند الحالي داخل حزمة [XPS](../../aspose.page.xps/). |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | عيّن الوسيط القالب رقم n كإشارة ضعيفة (بدلاً من المشتركة). يسمح بتبديل المؤشرات في الحاويات إلى وضع الضعيفة. |

## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../)
* Library [Aspose.Page for C++](../../)
