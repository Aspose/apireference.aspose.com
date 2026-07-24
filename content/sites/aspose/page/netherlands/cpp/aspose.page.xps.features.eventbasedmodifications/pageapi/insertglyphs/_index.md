---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::InsertGlyphs method"
linktitle: "InsertGlyphs"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::InsertGlyphs method. Voegt nieuwe glyphs toe aan de pagina op index  positie in C++."
type: docs
weight: 3000
url: /nl/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/insertglyphs/
---
## PageAPI::InsertGlyphs(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) method


Voegt nieuwe glyphs toe aan de pagina op *index* positie.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::InsertGlyphs(int32_t index, System::SharedPtr<XpsModel::XpsFont> font, float fontSize, float originX, float originY, System::String unicodeString)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| index | int32_t | Positie waarop nieuwe glyphs moeten worden ingevoegd. |
| font | System::SharedPtr\<XpsModel::XpsFont\> | [Font](../../../aspose.page.font/) bron. |
| fontSize | float | [Font](../../../aspose.page.font/) grootte. |
| originX | float | Glyphs oorsprong X-coördinaat. |
| originY | float | Glyphs oorsprong Y-coördinaat. |
| unicodeString | System::String | Te afdrukken tekenreeks. |

### ReturnValue

Ingevoegde glyphs.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::InsertGlyphs(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) method


Voegt nieuwe glyphs toe aan de pagina op *index* positie.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::InsertGlyphs(int32_t index, System::String fontFamily, float fontSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| index | int32_t | Positie waarop nieuwe glyphs moeten worden ingevoegd. |
| fontFamily | System::String | [Font](../../../aspose.page.font/) familie. |
| fontSize | float | [Font](../../../aspose.page.font/) grootte. |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) stijl. |
| originX | float | Glyphs oorsprong X-coördinaat. |
| originY | float | Glyphs oorsprong Y-coördinaat. |
| unicodeString | System::String | Te afdrukken tekenreeks. |

### ReturnValue

Ingevoegde glyphs.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
