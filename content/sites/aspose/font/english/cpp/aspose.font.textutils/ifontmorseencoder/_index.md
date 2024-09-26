---
title: Aspose::Font::TextUtils::IFontMorseEncoder class
linktitle: IFontMorseEncoder
second_title: Aspose.Font for C++
description: 'Aspose::Font::TextUtils::IFontMorseEncoder class. Declares functionality to encode text by Morse code and get result as font glyphs in C++.'
type: docs
weight: 200
url: /cpp/aspose.font.textutils/ifontmorseencoder/
---
## IFontMorseEncoder class


Declares functionality to encode text by Morse code and get result as font glyphs.

```cpp
class IFontMorseEncoder : public virtual System::Object
```

## Methods

| Method | Description |
| --- | --- |
| virtual [Encode](./encode/)(System::String, System::SharedPtr\<IFont\>, MorseAlphabets, char16_t, char16_t) | Encodes text by Morse code and returns result as set of glyphs(glyph identifiers). |
| virtual [Encode](./encode/)(System::String, System::SharedPtr\<IFont\>, char16_t, char16_t) | Encodes text in Morse code and returns result as set of glyphs(glyphId). Heuristic analysis is used to calculate the alphabet of the input text. |
| virtual [Encode](./encode/)(System::String, System::SharedPtr\<IFont\>, double, Renderers::RenderingUtils::LineSpacingType, int32_t, int32_t, MorseAlphabets, char16_t, char16_t) | Encodes text by Morse code and draws result in PNG-format. |
| virtual [Encode](./encode/)(System::String, System::SharedPtr\<IFont\>, double, Renderers::RenderingUtils::LineSpacingType, int32_t, int32_t, char16_t, char16_t) | Encodes text in Morse code and draws result in PNG-format. Heuristic analysis is used to calculate the alphabet of the input text. |
## See Also

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::TextUtils](../)
* Library [Aspose.Font for C++](../../)
