---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateGlyphs Methode"
linktitle: "CreateGlyphs"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateGlyphs Methode. Erstellt neue Glyphen in C++."
type: docs
weight: 900
url: /de/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createglyphs/
---
## PageAPI::CreateGlyphs(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) method


Erstellt neue Glyphs.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateGlyphs(System::SharedPtr<XpsModel::XpsFont> font, float fontRenderingEmSize, float originX, float originY, System::String unicodeString)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| font | System::SharedPtr\<XpsModel::XpsFont\> | [Font](../../../aspose.page.font/) Ressource. |
| fontRenderingEmSize | float | [Font](../../../aspose.page.font/) Größe. |
| originX | float | Glyphen Ursprung X-Koordinate. |
| originY | float | Glyphen Ursprung Y-Koordinate. |
| unicodeString | System::String | String, der gedruckt werden soll. |

### ReturnValue

Neue Glyphen.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreateGlyphs(System::String, float, System::Drawing::FontStyle, float, float, System::String) method


Erstellt neue Glyphs.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateGlyphs(System::String fontFamily, float fontRenderingEmSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fontFamily | System::String | [Font](../../../aspose.page.font/) Familie. |
| fontRenderingEmSize | float | [Font](../../../aspose.page.font/) Größe. |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) Stil. |
| originX | float | Glyphen Ursprung X-Koordinate. |
| originY | float | Glyphen Ursprung Y-Koordinate. |
| unicodeString | System::String | String, der gedruckt werden soll. |

### ReturnValue

Neue Glyphen.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
