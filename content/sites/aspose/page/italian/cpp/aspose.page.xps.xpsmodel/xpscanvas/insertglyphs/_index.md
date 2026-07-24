---
title: "Aspose::Page::XPS::XpsModel::XpsCanvas::InsertGlyphs metodo"
linktitle: "InsertGlyphs"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::XpsModel::XpsCanvas::InsertGlyphs metodo. Inserisce nuovi glifi nell'elenco dei figli di questa canvas''s alla posizione indice in C++."
type: docs
weight: 900
url: /it/cpp/aspose.page.xps.xpsmodel/xpscanvas/insertglyphs/
---
## XpsCanvas::InsertGlyphs method


Inserisce nuovi glyphs nell'elenco dei figli di questo canvas nella posizione *index*.

```cpp
System::SharedPtr<XpsGlyphs> Aspose::Page::XPS::XpsModel::XpsCanvas::InsertGlyphs(int32_t index, System::String fontFamily, float fontSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int32_t | Posizione in cui i nuovi glifi devono essere inseriti. |
| fontFamily | System::String | [Font](../../../aspose.page.font/) famiglia. |
| fontSize | float | [Font](../../../aspose.page.font/) dimensione. |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) stile. |
| originX | float | Coordinata X di origine dei glifi. |
| originY | float | Coordinata T di origine dei glifi. |
| unicodeString | System::String | Stringa da stampare. |

### ReturnValue

Glifi aggiunti.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [XpsCanvas](../)
* Namespace [Aspose::Page::XPS::XpsModel](../../)
* Library [Aspose.Page for C++](../../../)
