---
title: "Aspose::Page::XPS::XpsDocument::AddGlyphs method"
linktitle: "AddGlyphs"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::XpsDocument::AddGlyphs method. Aggiunge nuovi glifi alla pagina attiva in C++."
type: docs
weight: 500
url: /it/cpp/aspose.page.xps/xpsdocument/addglyphs/
---
## XpsDocument::AddGlyphs(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) method


Aggiunge nuovi glifi alla pagina attiva.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::XpsDocument::AddGlyphs(System::SharedPtr<XpsModel::XpsFont> font, float fontRenderingEmSize, float originX, float originY, System::String unicodeString)
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
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::AddGlyphs(System::String, float, System::Drawing::FontStyle, float, float, System::String) method


Aggiunge nuovi glifi alla pagina attiva.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::XpsDocument::AddGlyphs(System::String fontFamily, float fontRenderingEmSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
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
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
