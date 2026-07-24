---
title: "System::Drawing::Graphics::MeasureCharacterRanges μέθοδος"
linktitle: "MeasureCharacterRanges"
second_title: "Aspose.Page για C++"
description: "System::Drawing::Graphics::MeasureCharacterRanges μέθοδος. Επιστρέφει έναν πίνακα περιοχών, ο καθένας από τους οποίους οριοθετεί τις θέσεις χαρακτήρων στην καθορισμένη συμβολοσειρά σε C++."
type: docs
weight: 6400
url: /el/cpp/system.drawing/graphics/measurecharacterranges/
---
## Graphics::MeasureCharacterRanges method


Επιστρέφει έναν πίνακα περιοχών, καθεμία από τις οποίες περιορίζει τις θέσεις χαρακτήρων στην καθορισμένη συμβολοσειρά.

```cpp
ArrayPtr<SharedPtr<Region>> System::Drawing::Graphics::MeasureCharacterRanges(const System::String &text, const SharedPtr<Font> &font, RectangleF layoutRect, const SharedPtr<StringFormat> &stringFormat)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| text | const System::String\& | Η συμβολοσειρά προς μέτρηση |
| γραμματοσειρά | const SharedPtr\<Font\>\& | Η γραμματοσειρά που χρησιμοποιείται κατά τη μέτρηση της συμβολοσειράς |
| layoutRect | RectangleF | Το ορθογώνιο διάταξης που χρησιμοποιείται κατά τη μέτρηση της συμβολοσειράς |
| stringFormat | const SharedPtr\<StringFormat\>\& | Η μορφή συμβολοσειράς, περιέχει τις περιοχές χαρακτήρων για μέτρηση |

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Region](../../region/)
* Class [String](../../../system/string/)
* Class [Font](../../font/)
* Class [RectangleF](../../rectanglef/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
