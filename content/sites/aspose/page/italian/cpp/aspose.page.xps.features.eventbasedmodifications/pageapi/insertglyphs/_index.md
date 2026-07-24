---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::InsertGlyphs metodo"
linktitle: "InsertGlyphs"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::InsertGlyphs metodo. Inserisce nuovi glifi nella pagina alla posizione indice in C++."
type: docs
weight: 3000
url: /it/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/insertglyphs/
---
## PageAPI::InsertGlyphs(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) method


Inserisce nuovi glyphs nella pagina alla posizione *index*.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::InsertGlyphs(int32_t index, System::SharedPtr<XpsModel::XpsFont> font, float fontSize, float originX, float originY, System::String unicodeString)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int32_t | Posizione in cui i nuovi glifi devono essere inseriti. |
| font | System::SharedPtr\<XpsModel::XpsFont\> | [Font](../../../aspose.page.font/) risorsa. |
| fontSize | float | [Font](../../../aspose.page.font/) dimensione. |
| originX | float | Coordinata X di origine dei glifi. |
| originY | float | Coordinata Y di origine dei glifi. |
| unicodeString | System::String | Stringa da stampare. |

### ReturnValue

Glifi inseriti.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::InsertGlyphs(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) method


Inserisce nuovi glyphs nella pagina alla posizione *index*.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::InsertGlyphs(int32_t index, System::String fontFamily, float fontSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int32_t | Posizione in cui i nuovi glifi devono essere inseriti. |
| fontFamily | System::String | [Font](../../../aspose.page.font/) famiglia. |
| fontSize | float | [Font](../../../aspose.page.font/) dimensione. |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) stile. |
| originX | float | Coordinata X di origine dei glifi. |
| originY | float | Coordinata Y di origine dei glifi. |
| unicodeString | System::String | Stringa da stampare. |

### ReturnValue

Glifi inseriti.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
