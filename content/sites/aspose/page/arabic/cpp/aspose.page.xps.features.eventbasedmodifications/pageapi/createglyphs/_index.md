---
title: "طريقة Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateGlyphs"
linktitle: "CreateGlyphs"
second_title: "Aspose.Page لـ C++"
description: "طريقة Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateGlyphs. تنشئ رموزًا جديدة في C++."
type: docs
weight: 900
url: /ar/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createglyphs/
---
## PageAPI::CreateGlyphs(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) method


ينشئ glyphs جديدة.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateGlyphs(System::SharedPtr<XpsModel::XpsFont> font, float fontRenderingEmSize, float originX, float originY, System::String unicodeString)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| font | System::SharedPtr\<XpsModel::XpsFont\> | [Font](../../../aspose.page.font/) مورد. |
| fontRenderingEmSize | float | [Font](../../../aspose.page.font/) حجم. |
| originX | عدد عائم | إحداثي X لأصل الرموز. |
| originY | عدد عائم | إحداثي Y لأصل الرموز. |
| unicodeString | System::String | النص المراد طباعته. |

### ReturnValue

رموز جديدة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreateGlyphs(System::String, float, System::Drawing::FontStyle, float, float, System::String) method


ينشئ glyphs جديدة.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateGlyphs(System::String fontFamily, float fontRenderingEmSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| fontFamily | System::String | [Font](../../../aspose.page.font/) عائلة. |
| fontRenderingEmSize | float | [Font](../../../aspose.page.font/) حجم. |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) نمط. |
| originX | عدد عائم | إحداثي X لأصل الرموز. |
| originY | عدد عائم | إحداثي Y لأصل الرموز. |
| unicodeString | System::String | النص المراد طباعته. |

### ReturnValue

رموز جديدة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
