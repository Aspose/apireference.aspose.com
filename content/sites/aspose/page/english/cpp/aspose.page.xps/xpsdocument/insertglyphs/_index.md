---
title: Aspose::Page::XPS::XpsDocument::InsertGlyphs method
linktitle: InsertGlyphs
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsDocument::InsertGlyphs method. Inserts new glyphs to the active page at index  position in C++.'
type: docs
weight: 4400
url: /cpp/aspose.page.xps/xpsdocument/insertglyphs/
---
## XpsDocument::InsertGlyphs(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) method


Inserts new glyphs to the active page at *index*  position.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::XpsDocument::InsertGlyphs(int32_t index, System::SharedPtr<XpsModel::XpsFont> font, float fontSize, float originX, float originY, System::String unicodeString)
```


| Parameter | Type | Description |
| --- | --- | --- |
| index | int32_t | Position at which new glyphs should be inserted. |
| font | System::SharedPtr\<XpsModel::XpsFont\> | [Font](../../../aspose.page.font/) resource. |
| fontSize | float | [Font](../../../aspose.page.font/) size. |
| originX | float | Glyphs origin X coordinate. |
| originY | float | Glyphs origin Y coordinate. |
| unicodeString | System::String | String to be printed. |

### ReturnValue

Inserted glyphs.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::InsertGlyphs(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) method


Inserts new glyphs to the active page at *index*  position.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::XpsDocument::InsertGlyphs(int32_t index, System::String fontFamily, float fontSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| Parameter | Type | Description |
| --- | --- | --- |
| index | int32_t | Position at which new glyphs should be inserted. |
| fontFamily | System::String | [Font](../../../aspose.page.font/) family. |
| fontSize | float | [Font](../../../aspose.page.font/) size. |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) style. |
| originX | float | Glyphs origin X coordinate. |
| originY | float | Glyphs origin Y coordinate. |
| unicodeString | System::String | String to be printed. |

### ReturnValue

Inserted glyphs.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
