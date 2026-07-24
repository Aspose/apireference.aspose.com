---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::AddGlyphs méthode"
linktitle: "AddGlyphs"
second_title: "Aspose.Page pour C++"
description: "Méthode Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::AddGlyphs. Ajoute de nouveaux glyphes à la page en C++."
type: docs
weight: 300
url: /fr/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/addglyphs/
---
## PageAPI::AddGlyphs(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) method


Ajoute de nouveaux glyphs à la page.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::AddGlyphs(System::SharedPtr<XpsModel::XpsFont> font, float fontRenderingEmSize, float originX, float originY, System::String unicodeString)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| font | System::SharedPtr\<XpsModel::XpsFont\> | [Font](../../../aspose.page.font/) ressource. |
| fontRenderingEmSize | float | [Font](../../../aspose.page.font/) taille. |
| originX | float | Coordonnée X d'origine des glyphes. |
| originY | float | Coordonnée Y d'origine des glyphes. |
| unicodeString | System::String | Chaîne à imprimer. |

### ReturnValue

Glyphes ajoutés.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::AddGlyphs(System::String, float, System::Drawing::FontStyle, float, float, System::String) method


Ajoute de nouveaux glyphs à la page.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::AddGlyphs(System::String fontFamily, float fontRenderingEmSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| fontFamily | System::String | [Font](../../../aspose.page.font/) famille. |
| fontRenderingEmSize | float | [Font](../../../aspose.page.font/) taille. |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) style. |
| originX | float | Coordonnée X d'origine des glyphes. |
| originY | float | Coordonnée Y d'origine des glyphes. |
| unicodeString | System::String | Chaîne à imprimer. |

### ReturnValue

Glyphes ajoutés.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
