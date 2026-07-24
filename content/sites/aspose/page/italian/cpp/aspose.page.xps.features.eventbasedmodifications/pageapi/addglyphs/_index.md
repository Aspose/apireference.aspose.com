---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::AddGlyphs metodo"
linktitle: "AddGlyphs"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::AddGlyphs method. Aggiunge nuovi glifi alla pagina in C++."
type: docs
weight: 300
url: /it/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/addglyphs/
---
## PageAPI::AddGlyphs(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) method


Aggiunge nuovi glyphs alla pagina.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::AddGlyphs(System::SharedPtr<XpsModel::XpsFont> font, float fontRenderingEmSize, float originX, float originY, System::String unicodeString)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| font | System::SharedPtr\<XpsModel::XpsFont\> | [Font](../../../aspose.page.font/) risorsa. |
| fontRenderingEmSize | float | [Font](../../../aspose.page.font/) dimensione. |
| originX | float | Coordinata X di origine dei glifi. |
| originY | float | Coordinata Y di origine dei glifi. |
| unicodeString | System::String | Stringa da stampare. |

### ReturnValue

Glifi aggiunti.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::AddGlyphs(System::String, float, System::Drawing::FontStyle, float, float, System::String) method


Aggiunge nuovi glyphs alla pagina.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::AddGlyphs(System::String fontFamily, float fontRenderingEmSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fontFamily | System::String | [Font](../../../aspose.page.font/) famiglia. |
| fontRenderingEmSize | float | [Font](../../../aspose.page.font/) dimensione. |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) stile. |
| originX | float | Coordinata X di origine dei glifi. |
| originY | float | Coordinata Y di origine dei glifi. |
| unicodeString | System::String | Stringa da stampare. |

### ReturnValue

Glifi aggiunti.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
