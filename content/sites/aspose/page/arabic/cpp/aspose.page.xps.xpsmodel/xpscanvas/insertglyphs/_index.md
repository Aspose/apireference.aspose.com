---
title: "Aspose::Page::XPS::XpsModel::XpsCanvas::InsertGlyphs طريقة"
linktitle: "InsertGlyphs"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::XPS::XpsModel::XpsCanvas::InsertGlyphs طريقة. يدرج رموزًا جديدة إلى قائمة الأطفال الخاصة بهذا canvas''s عند الفهرس الموضع في C++."
type: docs
weight: 900
url: /ar/cpp/aspose.page.xps.xpsmodel/xpscanvas/insertglyphs/
---
## XpsCanvas::InsertGlyphs method


يدرج glyphs جديدة إلى قائمة الأطفال لهذا الـ canvas في موضع *index*.

```cpp
System::SharedPtr<XpsGlyphs> Aspose::Page::XPS::XpsModel::XpsCanvas::InsertGlyphs(int32_t index, System::String fontFamily, float fontSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الفهرس | int32_t | الموضع الذي يجب إدراج الرموز الجديدة فيه. |
| fontFamily | System::String | [Font](../../../aspose.page.font/) عائلة. |
| fontSize | float | [Font](../../../aspose.page.font/) حجم. |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) نمط. |
| originX | عدد عائم | إحداثي X لأصل الرموز. |
| originY | عدد عائم | إحداثي T لأصل الرموز. |
| unicodeString | System::String | النص المراد طباعته. |

### ReturnValue

الرموز المضافة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [XpsCanvas](../)
* Namespace [Aspose::Page::XPS::XpsModel](../../)
* Library [Aspose.Page for C++](../../../)
