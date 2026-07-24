---
title: "System::Drawing::Graphics::MeasureCharacterRanges methode"
linktitle: "MeasureCharacterRanges"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::Graphics::MeasureCharacterRanges methode. Retourneert een array van regio's die elk de tekenposities in de opgegeven string begrenzen in C++."
type: docs
weight: 6400
url: /nl/cpp/system.drawing/graphics/measurecharacterranges/
---
## Graphics::MeasureCharacterRanges method


Retourneert een array van regio's die elk de tekenposities in de opgegeven tekenreeks begrenzen.

```cpp
ArrayPtr<SharedPtr<Region>> System::Drawing::Graphics::MeasureCharacterRanges(const System::String &text, const SharedPtr<Font> &font, RectangleF layoutRect, const SharedPtr<StringFormat> &stringFormat)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| text | const System::String\& | De te meten tekenreeks |
| lettertype | const SharedPtr\<Font\>\& | Het lettertype dat wordt gebruikt tijdens het meten van de tekenreeks |
| layoutRect | RectangleF | De lay-outrechthoek die wordt gebruikt tijdens het meten van de tekenreeks |
| stringFormat | const SharedPtr\<StringFormat\>\& | Het tekenreeksformaat, bevat de tekenbereiken die moeten worden gemeten |

## Zie ook

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
