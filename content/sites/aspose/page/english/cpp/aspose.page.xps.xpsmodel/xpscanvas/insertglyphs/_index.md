---
title: Aspose::Page::XPS::XpsModel::XpsCanvas::InsertGlyphs method
linktitle: InsertGlyphs
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsModel::XpsCanvas::InsertGlyphs method. Inserts new glyphs to this canvas''s child list at index  position in C++.'
type: docs
weight: 1000
url: /cpp/aspose.page.xps.xpsmodel/xpscanvas/insertglyphs/
---
## XpsCanvas::InsertGlyphs method


Inserts new glyphs to this canvas's child list at *index*  position.

```cpp
System::SharedPtr<XpsGlyphs> Aspose::Page::XPS::XpsModel::XpsCanvas::InsertGlyphs(int32_t index, System::String fontFamily, float fontSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| Parameter | Type | Description |
| --- | --- | --- |
| index | int32_t | Position at which new glyphs should be inserted. |
| fontFamily | System::String | [Font](../../../aspose.page.font/) family. |
| fontSize | float | [Font](../../../aspose.page.font/) size. |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) style. |
| originX | float | Glyphs origin X coordinate. |
| originY | float | Glyphs origin T coordinate. |
| unicodeString | System::String | String to be printed. |

### ReturnValue

Added glyphs.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [XpsCanvas](../)
* Namespace [Aspose::Page::XPS::XpsModel](../../)
* Library [Aspose.Page for C++](../../../)
