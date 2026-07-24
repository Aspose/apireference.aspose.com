---
title: "Aspose::Page::XPS::XpsDocument::CreateGlyphs μέθοδος"
linktitle: "CreateGlyphs"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::XPS::XpsDocument::CreateGlyphs μέθοδος. Δημιουργεί νέα glyphs σε C++."
type: docs
weight: 1400
url: /el/cpp/aspose.page.xps/xpsdocument/createglyphs/
---
## XpsDocument::CreateGlyphs(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) method


Δημιουργεί νέα glyphs.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::XpsDocument::CreateGlyphs(System::SharedPtr<XpsModel::XpsFont> font, float fontRenderingEmSize, float originX, float originY, System::String unicodeString)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| font | System::SharedPtr\<XpsModel::XpsFont\> | [Font](../../../aspose.page.font/) πόρος. |
| fontRenderingEmSize | float | [Font](../../../aspose.page.font/) μέγεθος. |
| originX | float | Συντεταγμένη X προέλευσης γλύφων. |
| originY | float | Συντεταγμένη Y προέλευσης γλύφων. |
| unicodeString | System::String | Συμβολοσειρά για εκτύπωση. |

### ReturnValue

Νέα γλύφα.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateGlyphs(System::String, float, System::Drawing::FontStyle, float, float, System::String) method


Δημιουργεί νέα glyphs.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::XpsDocument::CreateGlyphs(System::String fontFamily, float fontRenderingEmSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| fontFamily | System::String | [Font](../../../aspose.page.font/) οικογένεια. |
| fontRenderingEmSize | float | [Font](../../../aspose.page.font/) μέγεθος. |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) στυλ. |
| originX | float | Συντεταγμένη X προέλευσης γλύφων. |
| originY | float | Συντεταγμένη Y προέλευσης γλύφων. |
| unicodeString | System::String | Συμβολοσειρά για εκτύπωση. |

### ReturnValue

Νέα γλύφα.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
