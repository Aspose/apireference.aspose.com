---
title: "Aspose::Page::XPS::XpsDocument::InsertGlyphs Methode"
linktitle: "InsertGlyphs"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::XpsDocument::InsertGlyphs Methode. Fügt neue Glyphen zur aktiven Seite an der Index‑Position in C++ ein."
type: docs
weight: 4400
url: /de/cpp/aspose.page.xps/xpsdocument/insertglyphs/
---
## XpsDocument::InsertGlyphs(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) method


Fügt neue Glyphen zur aktiven Seite an der Position *index* ein.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::XpsDocument::InsertGlyphs(int32_t index, System::SharedPtr<XpsModel::XpsFont> font, float fontSize, float originX, float originY, System::String unicodeString)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int32_t | Position, an der neue Glyphen eingefügt werden sollen. |
| font | System::SharedPtr\<XpsModel::XpsFont\> | [Font](../../../aspose.page.font/) Ressource. |
| fontSize | float | [Font](../../../aspose.page.font/) Größe. |
| originX | float | Glyphen Ursprung X-Koordinate. |
| originY | float | Glyphen Ursprung Y-Koordinate. |
| unicodeString | System::String | String, der gedruckt werden soll. |

### ReturnValue

Eingefügte Glyphen.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::InsertGlyphs(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) method


Fügt neue Glyphen zur aktiven Seite an der Position *index* ein.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::XpsDocument::InsertGlyphs(int32_t index, System::String fontFamily, float fontSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int32_t | Position, an der neue Glyphen eingefügt werden sollen. |
| fontFamily | System::String | [Font](../../../aspose.page.font/) Familie. |
| fontSize | float | [Font](../../../aspose.page.font/) Größe. |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) Stil. |
| originX | float | Glyphen Ursprung X-Koordinate. |
| originY | float | Glyphen Ursprung Y-Koordinate. |
| unicodeString | System::String | String, der gedruckt werden soll. |

### ReturnValue

Eingefügte Glyphen.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
