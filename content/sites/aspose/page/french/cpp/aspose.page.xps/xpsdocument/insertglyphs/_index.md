---
title: "Aspose::Page::XPS::XpsDocument::InsertGlyphs méthode"
linktitle: "InsertGlyphs"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::XpsDocument::InsertGlyphs méthode. Insère de nouveaux glyphes dans la page active à la position d'index en C++."
type: docs
weight: 4400
url: /fr/cpp/aspose.page.xps/xpsdocument/insertglyphs/
---
## XpsDocument::InsertGlyphs(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) method


Insère de nouveaux glyphes dans la page active à la position *index* .

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::XpsDocument::InsertGlyphs(int32_t index, System::SharedPtr<XpsModel::XpsFont> font, float fontSize, float originX, float originY, System::String unicodeString)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| indice | int32_t | Position à laquelle de nouveaux glyphes doivent être insérés. |
| font | System::SharedPtr\<XpsModel::XpsFont\> | [Font](../../../aspose.page.font/) ressource. |
| fontSize | float | [Font](../../../aspose.page.font/) taille. |
| originX | float | Coordonnée X d'origine des glyphes. |
| originY | float | Coordonnée Y d'origine des glyphes. |
| unicodeString | System::String | Chaîne à imprimer. |

### ReturnValue

Glyphes insérés.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::InsertGlyphs(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) method


Insère de nouveaux glyphes dans la page active à la position *index* .

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::XpsDocument::InsertGlyphs(int32_t index, System::String fontFamily, float fontSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| indice | int32_t | Position à laquelle de nouveaux glyphes doivent être insérés. |
| fontFamily | System::String | [Font](../../../aspose.page.font/) famille. |
| fontSize | float | [Font](../../../aspose.page.font/) taille. |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) style. |
| originX | float | Coordonnée X d'origine des glyphes. |
| originY | float | Coordonnée Y d'origine des glyphes. |
| unicodeString | System::String | Chaîne à imprimer. |

### ReturnValue

Glyphes insérés.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
