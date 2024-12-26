---
title: IFontMorseDecoder.Decode
second_title: Aspose.Font for .NET API Reference
description: IFontMorseDecoder method. Deciphers Morse code into glyphs of the specified font
type: docs
weight: 10
url: /net/aspose.font.textutils/ifontmorsedecoder/decode/
---
## Decode(string, IFont, MorseAlphabets, char, char) {#decode}

Deciphers Morse code into glyphs of the specified font.

```csharp
public GlyphId[] Decode(string morseText, IFont font, 
    MorseAlphabets alphabet = MorseAlphabets.Latin, char inputSeparator = ' ', 
    char outputSeparator = '/')
```

| Parameter | Type | Description |
| --- | --- | --- |
| morseText | String | Text encoded by Morse code, ie text like "... --- ..."(SOS) |
| font | IFont | Font to take glyphs related to decoded text from |
| alphabet | MorseAlphabets | Alphabet of Morse code |
| inputSeparator | Char | Symbol used to separate words in encoded text |
| outputSeparator | Char | Symbol used to separate words in decoded text |

### Return Value

Glyphs (glyph identifiers) related to decoded text

### See Also

* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* interface [IFont](../../../aspose.font/ifont/)
* enum [MorseAlphabets](../../morsealphabets/)
* interface [IFontMorseDecoder](../)
* namespace [Aspose.Font.TextUtils](../../../aspose.font.textutils/)
* assembly [Aspose.Font](../../../)

---

## Decode(string, IFont, double, LineSpacingType, int, int, MorseAlphabets, char, char) {#decode_1}

Deciphers Morse code and draws result in PNG-format.

```csharp
public Stream Decode(string morseText, IFont font, double fontSize, 
    LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth, 
    MorseAlphabets alphabet = MorseAlphabets.Latin, char inputSeparator = ' ', 
    char outputSeparator = '/')
```

| Parameter | Type | Description |
| --- | --- | --- |
| morseText | String | Text encoded by Morse code, ie text like "... --- ..."(SOS) |
| font | IFont | Font to take glyphs related to decoded text from |
| fontSize | Double | Font size |
| lineSpacingType | LineSpacingType | Type of line spacing. Number of pixels or percent of font height |
| lineSpacingValue | Int32 | Value of line spacing |
| maxWidth | Int32 | Max width in pixels for image |
| alphabet | MorseAlphabets | Alphabet of Morse code |
| inputSeparator | Char | Symbol used to separate words in encoded text |
| outputSeparator | Char | Symbol used to separate words in decoded text |

### Return Value

Decoded text in PNG-format as stream of bytes

### See Also

* interface [IFont](../../../aspose.font/ifont/)
* enum [LineSpacingType](../../../aspose.font.renderers/renderingutils.linespacingtype/)
* enum [MorseAlphabets](../../morsealphabets/)
* interface [IFontMorseDecoder](../)
* namespace [Aspose.Font.TextUtils](../../../aspose.font.textutils/)
* assembly [Aspose.Font](../../../)


