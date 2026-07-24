---
title: "Aspose::Page::XPS::XpsDocument::InsertGlyphs طريقة"
linktitle: "InsertGlyphs"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::XPS::XpsDocument::InsertGlyphs طريقة. يدرج رموزًا جديدة إلى الصفحة النشطة عند الفهرس الموضع في C++."
type: docs
weight: 4400
url: /ar/cpp/aspose.page.xps/xpsdocument/insertglyphs/
---
## XpsDocument::InsertGlyphs(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) method


يدرج رموزًا جديدة إلى الصفحة النشطة في موضع *index* .

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::XpsDocument::InsertGlyphs(int32_t index, System::SharedPtr<XpsModel::XpsFont> font, float fontSize, float originX, float originY, System::String unicodeString)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الفهرس | int32_t | الموضع الذي يجب إدراج الرموز الجديدة فيه. |
| font | System::SharedPtr\<XpsModel::XpsFont\> | [Font](../../../aspose.page.font/) مورد. |
| fontSize | float | [Font](../../../aspose.page.font/) حجم. |
| originX | عدد عائم | إحداثي X لأصل الرموز. |
| originY | عدد عائم | إحداثي Y لأصل الرموز. |
| unicodeString | System::String | النص المراد طباعته. |

### ReturnValue

الرموز المدخلة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::InsertGlyphs(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) method


يدرج رموزًا جديدة إلى الصفحة النشطة في موضع *index* .

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::XpsDocument::InsertGlyphs(int32_t index, System::String fontFamily, float fontSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الفهرس | int32_t | الموضع الذي يجب إدراج الرموز الجديدة فيه. |
| fontFamily | System::String | [Font](../../../aspose.page.font/) عائلة. |
| fontSize | float | [Font](../../../aspose.page.font/) حجم. |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) نمط. |
| originX | عدد عائم | إحداثي X لأصل الرموز. |
| originY | عدد عائم | إحداثي Y لأصل الرموز. |
| unicodeString | System::String | النص المراد طباعته. |

### ReturnValue

الرموز المدخلة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
