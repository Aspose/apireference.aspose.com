---
title: "System::Drawing::Graphics::MeasureCharacterRanges Methode"
linktitle: "MeasureCharacterRanges"
second_title: "Aspose.Font für C++"
description: "System::Drawing::Graphics::MeasureCharacterRanges Methode. Gibt ein Array von Regionen zurück, von denen jede die Zeichenpositionen im angegebenen String in C++ begrenzt."
type: docs
weight: 6400
url: /de/cpp/system.drawing/graphics/measurecharacterranges/
---
## Graphics::MeasureCharacterRanges method


Gibt ein Array von Regionen zurück, von denen jede die Zeichenpositionen im angegebenen String begrenzt.

```cpp
ArrayPtr<SharedPtr<Region>> System::Drawing::Graphics::MeasureCharacterRanges(const System::String &text, const SharedPtr<Font> &font, RectangleF layoutRect, const SharedPtr<StringFormat> &stringFormat)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Text | const System::String\& | Der zu messende String |
| font | const SharedPtr\<Font\>\& | Die Schriftart, die bei der Messung des Strings verwendet wird |
| layoutRect | RectangleF | Das Layout-Rechteck, das bei der Messung des Strings verwendet wird |
| stringFormat | const SharedPtr\<StringFormat\>\& | Das Zeichenformat, enthält die zu messenden Zeichenbereiche |

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Region](../../region/)
* Class [String](../../../system/string/)
* Class [Font](../../font/)
* Class [RectangleF](../../rectanglef/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
