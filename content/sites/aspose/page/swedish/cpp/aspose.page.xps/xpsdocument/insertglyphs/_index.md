---
title: "Aspose::Page::XPS::XpsDocument::InsertGlyphs metod"
linktitle: "InsertGlyphs"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::XpsDocument::InsertGlyphs metod. Infogar nya glyfer på den aktiva sidan vid indexposition i C++."
type: docs
weight: 4400
url: /sv/cpp/aspose.page.xps/xpsdocument/insertglyphs/
---
## XpsDocument::InsertGlyphs(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) method


Infogar nya glyphs på den aktiva sidan på *index*  position.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::XpsDocument::InsertGlyphs(int32_t index, System::SharedPtr<XpsModel::XpsFont> font, float fontSize, float originX, float originY, System::String unicodeString)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| index | int32_t | Position där nya glyfer ska infogas. |
| font | System::SharedPtr\<XpsModel::XpsFont\> | [Font](../../../aspose.page.font/) resurs. |
| fontSize | float | [Font](../../../aspose.page.font/) storlek. |
| originX | float | Glyphs ursprung X-koordinat. |
| originY | float | Glyphs ursprung Y-koordinat. |
| unicodeString | System::String | Sträng som ska skrivas ut. |

### ReturnValue

Infogade glyfer.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::InsertGlyphs(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) method


Infogar nya glyphs på den aktiva sidan på *index*  position.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::XpsDocument::InsertGlyphs(int32_t index, System::String fontFamily, float fontSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| index | int32_t | Position där nya glyfer ska infogas. |
| fontFamily | System::String | [Font](../../../aspose.page.font/) familj. |
| fontSize | float | [Font](../../../aspose.page.font/) storlek. |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) stil. |
| originX | float | Glyphs ursprung X-koordinat. |
| originY | float | Glyphs ursprung Y-koordinat. |
| unicodeString | System::String | Sträng som ska skrivas ut. |

### ReturnValue

Infogade glyfer.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
