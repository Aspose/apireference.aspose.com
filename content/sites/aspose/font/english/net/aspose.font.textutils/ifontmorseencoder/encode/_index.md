---
title: IFontMorseEncoder.Encode
second_title: Aspose.Font for .NET API Reference
description: IFontMorseEncoder method. Encodes text by Morse code and returns result as set of glyphsglyph identifiers
type: docs
weight: 10
url: /net/aspose.font.textutils/ifontmorseencoder/encode/
---
## Encode(string, IFont, MorseAlphabets, char, char) {#encode}

Encodes text by Morse code and returns result as set of glyphs(glyph identifiers).

```csharp
public GlyphId[] Encode(string text, IFont font, MorseAlphabets alphabet, 
    char inputSeparator = ' ', char outputSeparator = '/')
```

| Parameter | Type | Description |
| --- | --- | --- |
| text | String | Text to encode by Morse code |
| font | IFont | Font to take glyphs related to symbols dot and dash from |
| alphabet | MorseAlphabets | Alphabet of Morse code |
| inputSeparator | Char | Symbol used to separate words in input text |
| outputSeparator | Char | Symbol used to separate words in encoded text |

### Return Value

Glyphs(glyphId) related to encoded text, ie "... --- ..." for the input text "SOS"

### See Also

* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* interface [IFont](../../../aspose.font/ifont/)
* enum [MorseAlphabets](../../morsealphabets/)
* interface [IFontMorseEncoder](../)
* namespace [Aspose.Font.TextUtils](../../ifontmorseencoder/)
* assembly [Aspose.Font](../../../)

---

## Encode(string, IFont, char, char) {#encode_1}

Encodes text in Morse code and returns result as set of glyphs(glyphId). Heuristic analysis is used to calculate the alphabet of the input text.

```csharp
public GlyphId[] Encode(string text, IFont font, char inputSeparator = ' ', 
    char outputSeparator = '/')
```

| Parameter | Type | Description |
| --- | --- | --- |
| text | String | Text to encode by Morse code |
| font | IFont | Font to take glyphs related to symbols dot and dash from |
| inputSeparator | Char | Symbol used to separate words in input text |
| outputSeparator | Char | Symbol used to separate words in encoded text |

### Return Value

Glyphs(glyphId) related to encoded text, ie "... --- ..." for the input text "SOS"

### See Also

* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* interface [IFont](../../../aspose.font/ifont/)
* interface [IFontMorseEncoder](../)
* namespace [Aspose.Font.TextUtils](../../ifontmorseencoder/)
* assembly [Aspose.Font](../../../)

---

## Encode(string, IFont, double, LineSpacingType, int, int, MorseAlphabets, char, char) {#encode_2}

Encodes text by Morse code and draws result in PNG-format.

```csharp
public Stream Encode(string text, IFont font, double fontSize, LineSpacingType lineSpacingType, 
    int lineSpacingValue, int maxWidth, MorseAlphabets alphabet, char inputSeparator = ' ', 
    char outputSeparator = '/')
```

| Parameter | Type | Description |
| --- | --- | --- |
| text | String | Text to encode by Morse code |
| font | IFont | Font to take glyphs related to symbols dot and dash from |
| fontSize | Double | Font size |
| lineSpacingType | LineSpacingType | Type of line spacing. Number of pixels or percent of font height |
| lineSpacingValue | Int32 | Value of line spacing |
| maxWidth | Int32 | Max width in pixels for image |
| alphabet | MorseAlphabets | Alphabet of Morse code |
| inputSeparator | Char | Symbol used to separate words in input text |
| outputSeparator | Char | Symbol used to separate words in encoded text |

### Return Value

Text, encoded by Morse code, in PNG-format as stream of bytes

### See Also

* interface [IFont](../../../aspose.font/ifont/)
* enum [LineSpacingType](../../../aspose.font.renderers/renderingutils.linespacingtype/)
* enum [MorseAlphabets](../../morsealphabets/)
* interface [IFontMorseEncoder](../)
* namespace [Aspose.Font.TextUtils](../../ifontmorseencoder/)
* assembly [Aspose.Font](../../../)

---

## Encode(string, IFont, double, LineSpacingType, int, int, char, char) {#encode_3}

Encodes text in Morse code and draws result in PNG-format. Heuristic analysis is used to calculate the alphabet of the input text.

```csharp
public Stream Encode(string text, IFont font, double fontSize, LineSpacingType lineSpacingType, 
    int lineSpacingValue, int maxWidth, char inputSeparator = ' ', char outputSeparator = '/')
```

| Parameter | Type | Description |
| --- | --- | --- |
| text | String | Text to encode by Morse code |
| font | IFont | Font to take glyphs related to symbols dot and dash from |
| fontSize | Double | Font size |
| lineSpacingType | LineSpacingType | Type of line spacing. Number of pixels or percent of font height |
| lineSpacingValue | Int32 | Value of line spacing |
| maxWidth | Int32 | Max width in pixels for image |
| inputSeparator | Char | Symbol used to separate words in input text |
| outputSeparator | Char | Symbol used to separate words in encoded text |

### Return Value

Text, encoded by Morse code, in PNG-format as stream of bytes

### See Also

* interface [IFont](../../../aspose.font/ifont/)
* enum [LineSpacingType](../../../aspose.font.renderers/renderingutils.linespacingtype/)
* interface [IFontMorseEncoder](../)
* namespace [Aspose.Font.TextUtils](../../ifontmorseencoder/)
* assembly [Aspose.Font](../../../)


