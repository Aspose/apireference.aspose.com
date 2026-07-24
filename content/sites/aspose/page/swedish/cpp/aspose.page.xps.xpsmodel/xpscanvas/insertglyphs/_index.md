---
title: "Aspose::Page::XPS::XpsModel::XpsCanvas::InsertGlyphs metod"
linktitle: "InsertGlyphs"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::XpsModel::XpsCanvas::InsertGlyphs metod. Infogar nya glyfer i detta canvas''s barnlista på indexposition i C++."
type: docs
weight: 900
url: /sv/cpp/aspose.page.xps.xpsmodel/xpscanvas/insertglyphs/
---
## XpsCanvas::InsertGlyphs method


Infogar nya glyphs i den här canvasens barnlista på *index* position.

```cpp
System::SharedPtr<XpsGlyphs> Aspose::Page::XPS::XpsModel::XpsCanvas::InsertGlyphs(int32_t index, System::String fontFamily, float fontSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| index | int32_t | Position där nya glyfer ska infogas. |
| fontFamily | System::String | [Font](../../../aspose.page.font/) familj. |
| fontSize | float | [Font](../../../aspose.page.font/) storlek. |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) stil. |
| originX | float | Glyphs ursprung X-koordinat. |
| originY | float | Glyfer ursprungs‑T‑koordinat. |
| unicodeString | System::String | Sträng som ska skrivas ut. |

### ReturnValue

Tillagda glyfer.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [XpsCanvas](../)
* Namespace [Aspose::Page::XPS::XpsModel](../../)
* Library [Aspose.Page for C++](../../../)
