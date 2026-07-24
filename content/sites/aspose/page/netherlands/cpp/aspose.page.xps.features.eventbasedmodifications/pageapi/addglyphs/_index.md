---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::AddGlyphs methode"
linktitle: "AddGlyphs"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::AddGlyphs method. Voegt nieuwe glyphs toe aan de pagina in C++."
type: docs
weight: 300
url: /nl/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/addglyphs/
---
## PageAPI::AddGlyphs(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) method


Voegt nieuwe glyphs toe aan de pagina.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::AddGlyphs(System::SharedPtr<XpsModel::XpsFont> font, float fontRenderingEmSize, float originX, float originY, System::String unicodeString)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| font | System::SharedPtr\<XpsModel::XpsFont\> | [Font](../../../aspose.page.font/) bron. |
| fontRenderingEmSize | float | [Font](../../../aspose.page.font/) grootte. |
| originX | float | Glyphs oorsprong X-coördinaat. |
| originY | float | Glyphs oorsprong Y-coördinaat. |
| unicodeString | System::String | Te afdrukken tekenreeks. |

### ReturnValue

Toegevoegde glyphs.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::AddGlyphs(System::String, float, System::Drawing::FontStyle, float, float, System::String) method


Voegt nieuwe glyphs toe aan de pagina.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::AddGlyphs(System::String fontFamily, float fontRenderingEmSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| fontFamily | System::String | [Font](../../../aspose.page.font/) familie. |
| fontRenderingEmSize | float | [Font](../../../aspose.page.font/) grootte. |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) stijl. |
| originX | float | Glyphs oorsprong X-coördinaat. |
| originY | float | Glyphs oorsprong Y-coördinaat. |
| unicodeString | System::String | Te afdrukken tekenreeks. |

### ReturnValue

Toegevoegde glyphs.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
