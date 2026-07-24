---
title: "Aspose::Page::XPS::XpsModel::XpsCanvas::AddGlyphs طريقة"
linktitle: "AddGlyphs"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::XPS::XpsModel::XpsCanvas::AddGlyphs طريقة. يضيف رموزًا جديدة إلى قائمة الأطفال لهذه اللوحة في C++."
type: docs
weight: 300
url: /ar/cpp/aspose.page.xps.xpsmodel/xpscanvas/addglyphs/
---
## XpsCanvas::AddGlyphs method


يضيف glyphs جديدة إلى قائمة الأطفال لهذا الـ canvas.

```cpp
System::SharedPtr<XpsGlyphs> Aspose::Page::XPS::XpsModel::XpsCanvas::AddGlyphs(System::String fontFamily, float fontSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
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
