---
title: "Aspose::Page::XPS::XpsModel::XpsCanvas::InsertGlyphs μέθοδος"
linktitle: "InsertGlyphs"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::XPS::XpsModel::XpsCanvas::InsertGlyphs μέθοδος. Εισάγει νέες γλύφες στη λίστα παιδιών αυτού του καμβά''s στη θέση index σε C++."
type: docs
weight: 900
url: /el/cpp/aspose.page.xps.xpsmodel/xpscanvas/insertglyphs/
---
## XpsCanvas::InsertGlyphs method


Εισάγει νέα glyphs στη λίστα παιδιών αυτού του canvas στη θέση *index*.

```cpp
System::SharedPtr<XpsGlyphs> Aspose::Page::XPS::XpsModel::XpsCanvas::InsertGlyphs(int32_t index, System::String fontFamily, float fontSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| δείκτης | int32_t | Θέση στην οποία πρέπει να εισαχθούν νέες γλύφες. |
| fontFamily | System::String | [Font](../../../aspose.page.font/) οικογένεια. |
| fontSize | float | [Font](../../../aspose.page.font/) μέγεθος. |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) στυλ. |
| originX | float | Συντεταγμένη X προέλευσης γλύφων. |
| originY | float | Συντεταγμένη T προέλευσης γλύφων. |
| unicodeString | System::String | Συμβολοσειρά για εκτύπωση. |

### ReturnValue

Προστέθηκαν γλύφοι.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [XpsCanvas](../)
* Namespace [Aspose::Page::XPS::XpsModel](../../)
* Library [Aspose.Page for C++](../../../)
