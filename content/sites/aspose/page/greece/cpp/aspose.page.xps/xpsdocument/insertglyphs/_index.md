---
title: "Aspose::Page::XPS::XpsDocument::InsertGlyphs μέθοδος"
linktitle: "InsertGlyphs"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::XPS::XpsDocument::InsertGlyphs μέθοδος. Εισάγει νέα glyphs στη ενεργή σελίδα στη θέση index  position σε C++."
type: docs
weight: 4400
url: /el/cpp/aspose.page.xps/xpsdocument/insertglyphs/
---
## XpsDocument::InsertGlyphs(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) method


Εισάγει νέα glyphs στη ενεργή σελίδα στη θέση *index* .

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::XpsDocument::InsertGlyphs(int32_t index, System::SharedPtr<XpsModel::XpsFont> font, float fontSize, float originX, float originY, System::String unicodeString)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| δείκτης | int32_t | Θέση στην οποία πρέπει να εισαχθούν νέες γλύφες. |
| font | System::SharedPtr\<XpsModel::XpsFont\> | [Font](../../../aspose.page.font/) πόρος. |
| fontSize | float | [Font](../../../aspose.page.font/) μέγεθος. |
| originX | float | Συντεταγμένη X προέλευσης γλύφων. |
| originY | float | Συντεταγμένη Y προέλευσης γλύφων. |
| unicodeString | System::String | Συμβολοσειρά για εκτύπωση. |

### ReturnValue

Εισαχθείσες γλύφες.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::InsertGlyphs(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) method


Εισάγει νέα glyphs στη ενεργή σελίδα στη θέση *index* .

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::XpsDocument::InsertGlyphs(int32_t index, System::String fontFamily, float fontSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| δείκτης | int32_t | Θέση στην οποία πρέπει να εισαχθούν νέες γλύφες. |
| fontFamily | System::String | [Font](../../../aspose.page.font/) οικογένεια. |
| fontSize | float | [Font](../../../aspose.page.font/) μέγεθος. |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) στυλ. |
| originX | float | Συντεταγμένη X προέλευσης γλύφων. |
| originY | float | Συντεταγμένη Y προέλευσης γλύφων. |
| unicodeString | System::String | Συμβολοσειρά για εκτύπωση. |

### ReturnValue

Εισαχθείσες γλύφες.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
