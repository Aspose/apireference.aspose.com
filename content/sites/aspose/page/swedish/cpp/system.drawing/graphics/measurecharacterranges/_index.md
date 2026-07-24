---
title: "System::Drawing::Graphics::MeasureCharacterRanges metod"
linktitle: "MeasureCharacterRanges"
second_title: "Aspose.Page för C++"
description: "System::Drawing::Graphics::MeasureCharacterRanges metod. Returnerar en array av regioner där varje region avgränsar teckenpositioner i den angivna strängen i C++."
type: docs
weight: 6400
url: /sv/cpp/system.drawing/graphics/measurecharacterranges/
---
## Graphics::MeasureCharacterRanges method


Returnerar en array av regioner där varje region avgränsar teckenpositioner i den angivna strängen.

```cpp
ArrayPtr<SharedPtr<Region>> System::Drawing::Graphics::MeasureCharacterRanges(const System::String &text, const SharedPtr<Font> &font, RectangleF layoutRect, const SharedPtr<StringFormat> &stringFormat)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| text | const System::String\& | Strängen att mäta |
| font | const SharedPtr\<Font\>\& | Fonten som används under mätning av strängen |
| layoutRect | RectangleF | Layoutrektangeln som används under mätning av strängen |
| stringFormat | const SharedPtr\<StringFormat\>\& | Strängformatet, innehåller teckenintervallen att mäta |

## Se även

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
