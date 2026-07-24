---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::AddGlyphs method"
linktitle: "AddGlyphs"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::AddGlyphs method. Προσθέτει νέους γλύφους στη σελίδα σε C++."
type: docs
weight: 300
url: /el/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/addglyphs/
---
## PageAPI::AddGlyphs(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) method


Προσθέτει νέα glyphs στη σελίδα.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::AddGlyphs(System::SharedPtr<XpsModel::XpsFont> font, float fontRenderingEmSize, float originX, float originY, System::String unicodeString)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| font | System::SharedPtr\<XpsModel::XpsFont\> | [Font](../../../aspose.page.font/) πόρος. |
| fontRenderingEmSize | float | [Font](../../../aspose.page.font/) μέγεθος. |
| originX | float | Συντεταγμένη X προέλευσης γλύφων. |
| originY | float | Συντεταγμένη Y προέλευσης γλύφων. |
| unicodeString | System::String | Συμβολοσειρά για εκτύπωση. |

### ReturnValue

Προστέθηκαν γλύφοι.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::AddGlyphs(System::String, float, System::Drawing::FontStyle, float, float, System::String) method


Προσθέτει νέα glyphs στη σελίδα.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::AddGlyphs(System::String fontFamily, float fontRenderingEmSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
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

Προστέθηκαν γλύφοι.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
