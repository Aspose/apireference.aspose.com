---
title: "Aspose::Page::XPS::XpsDocument::AddGlyphs طريقة"
linktitle: "AddGlyphs"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::XPS::XpsDocument::AddGlyphs طريقة. يضيف رموزاً جديدة إلى الصفحة النشطة في C++."
type: docs
weight: 500
url: /ar/cpp/aspose.page.xps/xpsdocument/addglyphs/
---
## XpsDocument::AddGlyphs(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) method


يضيف رموزًا جديدة إلى الصفحة النشطة.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::XpsDocument::AddGlyphs(System::SharedPtr<XpsModel::XpsFont> font, float fontRenderingEmSize, float originX, float originY, System::String unicodeString)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| font | System::SharedPtr\<XpsModel::XpsFont\> | [Font](../../../aspose.page.font/) مورد. |
| fontRenderingEmSize | float | [Font](../../../aspose.page.font/) حجم. |
| originX | عدد عائم | إحداثي X لأصل الرموز. |
| originY | عدد عائم | إحداثي Y لأصل الرموز. |
| unicodeString | System::String | النص المراد طباعته. |

### ReturnValue

الرموز المضافة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::AddGlyphs(System::String, float, System::Drawing::FontStyle, float, float, System::String) method


يضيف رموزًا جديدة إلى الصفحة النشطة.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::XpsDocument::AddGlyphs(System::String fontFamily, float fontRenderingEmSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
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

الرموز المضافة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
