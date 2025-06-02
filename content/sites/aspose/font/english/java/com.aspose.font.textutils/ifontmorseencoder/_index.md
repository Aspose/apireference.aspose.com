---
title: IFontMorseEncoder
second_title: Aspose.Font for Java API Reference
description: Declares functionality to encode text by Morse code and get result as font glyphs.
type: docs
weight: 12
url: /java/com.aspose.font.textutils/ifontmorseencoder/
---```
public interface IFontMorseEncoder
```

Declares functionality to encode text by Morse code and get result as font glyphs.
## Methods

| Method | Description |
| --- | --- |
| [encode(String text, IFont font)](#encode-java.lang.String-com.aspose.font.IFont-) | Encodes text in Morse code and returns result as set of glyphs(glyphId). |
| [encode(String text, IFont font, char inputSeparator)](#encode-java.lang.String-com.aspose.font.IFont-char-) | Encodes text in Morse code and returns result as set of glyphs(glyphId). |
| [encode(String text, IFont font, char inputSeparator, char outputSeparator)](#encode-java.lang.String-com.aspose.font.IFont-char-char-) | Encodes text in Morse code and returns result as set of glyphs(glyphId). |
| [encode(String text, IFont font, MorseAlphabets alphabet)](#encode-java.lang.String-com.aspose.font.IFont-com.aspose.font.textutils.MorseAlphabets-) | Encodes text by Morse code and returns result as set of glyphs(glyph identifiers). |
| [encode(String text, IFont font, MorseAlphabets alphabet, char inputSeparator)](#encode-java.lang.String-com.aspose.font.IFont-com.aspose.font.textutils.MorseAlphabets-char-) | Encodes text by Morse code and returns result as set of glyphs(glyph identifiers). |
| [encode(String text, IFont font, MorseAlphabets alphabet, char inputSeparator, char outputSeparator)](#encode-java.lang.String-com.aspose.font.IFont-com.aspose.font.textutils.MorseAlphabets-char-char-) | Encodes text by Morse code and returns result as set of glyphs(glyph identifiers). |
| [encode(String text, IFont font, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth)](#encode-java.lang.String-com.aspose.font.IFont-double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-) | Encodes text in Morse code and draws result in PNG-format. |
| [encode(String text, IFont font, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth, char inputSeparator)](#encode-java.lang.String-com.aspose.font.IFont-double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-char-) | Encodes text in Morse code and draws result in PNG-format. |
| [encode(String text, IFont font, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth, char inputSeparator, char outputSeparator)](#encode-java.lang.String-com.aspose.font.IFont-double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-char-char-) | Encodes text in Morse code and draws result in PNG-format. |
| [encode(String text, IFont font, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth, MorseAlphabets alphabet)](#encode-java.lang.String-com.aspose.font.IFont-double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-com.aspose.font.textutils.MorseAlphabets-) | Encodes text by Morse code and draws result in PNG-format. |
| [encode(String text, IFont font, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth, MorseAlphabets alphabet, char inputSeparator)](#encode-java.lang.String-com.aspose.font.IFont-double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-com.aspose.font.textutils.MorseAlphabets-char-) | Encodes text by Morse code and draws result in PNG-format. |
| [encode(String text, IFont font, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth, MorseAlphabets alphabet, char inputSeparator, char outputSeparator)](#encode-java.lang.String-com.aspose.font.IFont-double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-com.aspose.font.textutils.MorseAlphabets-char-char-) | Encodes text by Morse code and draws result in PNG-format. |
### encode(String text, IFont font) {#encode-java.lang.String-com.aspose.font.IFont-}
```
public abstract GlyphId[] encode(String text, IFont font)
```


Encodes text in Morse code and returns result as set of glyphs(glyphId). Heuristic analysis is used to calculate the alphabet of the input text.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Text to encode by Morse code. |
| font | [IFont](../../com.aspose.font/ifont) | Font to take glyphs related to symbols dot and dash from. |

**Returns:**
com.aspose.font.GlyphId[] - Glyphs(glyphId) related to encoded text, i.e. "... --- ..." for the input text "SOS".
### encode(String text, IFont font, char inputSeparator) {#encode-java.lang.String-com.aspose.font.IFont-char-}
```
public abstract GlyphId[] encode(String text, IFont font, char inputSeparator)
```


Encodes text in Morse code and returns result as set of glyphs(glyphId). Heuristic analysis is used to calculate the alphabet of the input text.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Text to encode by Morse code. |
| font | [IFont](../../com.aspose.font/ifont) | Font to take glyphs related to symbols dot and dash from. |
| inputSeparator | char | Symbol used to separate words in input text. |

**Returns:**
com.aspose.font.GlyphId[] - Glyphs(glyphId) related to encoded text, i.e. "... --- ..." for the input text "SOS".
### encode(String text, IFont font, char inputSeparator, char outputSeparator) {#encode-java.lang.String-com.aspose.font.IFont-char-char-}
```
public abstract GlyphId[] encode(String text, IFont font, char inputSeparator, char outputSeparator)
```


Encodes text in Morse code and returns result as set of glyphs(glyphId). Heuristic analysis is used to calculate the alphabet of the input text.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Text to encode by Morse code. |
| font | [IFont](../../com.aspose.font/ifont) | Font to take glyphs related to symbols dot and dash from. |
| inputSeparator | char | Symbol used to separate words in input text. |
| outputSeparator | char | Symbol used to separate words in encoded text. |

**Returns:**
com.aspose.font.GlyphId[] - Glyphs(glyphId) related to encoded text, i.e. "... --- ..." for the input text "SOS".
### encode(String text, IFont font, MorseAlphabets alphabet) {#encode-java.lang.String-com.aspose.font.IFont-com.aspose.font.textutils.MorseAlphabets-}
```
public abstract GlyphId[] encode(String text, IFont font, MorseAlphabets alphabet)
```


Encodes text by Morse code and returns result as set of glyphs(glyph identifiers).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Text to encode by Morse code. |
| font | [IFont](../../com.aspose.font/ifont) | Font to take glyphs related to symbols dot and dash from. |
| alphabet | [MorseAlphabets](../../com.aspose.font.textutils/morsealphabets) | Alphabet of Morse code. |

**Returns:**
com.aspose.font.GlyphId[] - Glyphs(glyphId) related to encoded text, i.e. "... --- ..." for the input text "SOS".
### encode(String text, IFont font, MorseAlphabets alphabet, char inputSeparator) {#encode-java.lang.String-com.aspose.font.IFont-com.aspose.font.textutils.MorseAlphabets-char-}
```
public abstract GlyphId[] encode(String text, IFont font, MorseAlphabets alphabet, char inputSeparator)
```


Encodes text by Morse code and returns result as set of glyphs(glyph identifiers).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Text to encode by Morse code. |
| font | [IFont](../../com.aspose.font/ifont) | Font to take glyphs related to symbols dot and dash from. |
| alphabet | [MorseAlphabets](../../com.aspose.font.textutils/morsealphabets) | Alphabet of Morse code. |
| inputSeparator | char | Symbol used to separate words in input text. |

**Returns:**
com.aspose.font.GlyphId[] - Glyphs(glyphId) related to encoded text, i.e. "... --- ..." for the input text "SOS".
### encode(String text, IFont font, MorseAlphabets alphabet, char inputSeparator, char outputSeparator) {#encode-java.lang.String-com.aspose.font.IFont-com.aspose.font.textutils.MorseAlphabets-char-char-}
```
public abstract GlyphId[] encode(String text, IFont font, MorseAlphabets alphabet, char inputSeparator, char outputSeparator)
```


Encodes text by Morse code and returns result as set of glyphs(glyph identifiers).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Text to encode by Morse code. |
| font | [IFont](../../com.aspose.font/ifont) | Font to take glyphs related to symbols dot and dash from. |
| alphabet | [MorseAlphabets](../../com.aspose.font.textutils/morsealphabets) | Alphabet of Morse code. |
| inputSeparator | char | Symbol used to separate words in input text. |
| outputSeparator | char | Symbol used to separate words in encoded text. |

**Returns:**
com.aspose.font.GlyphId[] - Glyphs(glyphId) related to encoded text, i.e. "... --- ..." for the input text "SOS".
### encode(String text, IFont font, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth) {#encode-java.lang.String-com.aspose.font.IFont-double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-}
```
public abstract InputStream encode(String text, IFont font, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth)
```


Encodes text in Morse code and draws result in PNG-format. Heuristic analysis is used to calculate the alphabet of the input text.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Text to encode by Morse code. |
| font | [IFont](../../com.aspose.font/ifont) | Font to take glyphs related to symbols dot and dash from. |
| fontSize | double | Font size. |
| lineSpacingType | [LineSpacingType](../../com.aspose.font/linespacingtype) | Type of line spacing. Number of pixels or percent of font height. |
| lineSpacingValue | int | Value of line spacing. |
| maxWidth | int | Max width in pixels for image. |

**Returns:**
java.io.InputStream - Text, encoded by Morse code, in PNG-format as stream of bytes.
### encode(String text, IFont font, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth, char inputSeparator) {#encode-java.lang.String-com.aspose.font.IFont-double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-char-}
```
public abstract InputStream encode(String text, IFont font, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth, char inputSeparator)
```


Encodes text in Morse code and draws result in PNG-format. Heuristic analysis is used to calculate the alphabet of the input text.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Text to encode by Morse code. |
| font | [IFont](../../com.aspose.font/ifont) | Font to take glyphs related to symbols dot and dash from. |
| fontSize | double | Font size. |
| lineSpacingType | [LineSpacingType](../../com.aspose.font/linespacingtype) | Type of line spacing. Number of pixels or percent of font height. |
| lineSpacingValue | int | Value of line spacing. |
| maxWidth | int | Max width in pixels for image. |
| inputSeparator | char | Symbol used to separate words in input text. |

**Returns:**
java.io.InputStream - Text, encoded by Morse code, in PNG-format as stream of bytes.
### encode(String text, IFont font, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth, char inputSeparator, char outputSeparator) {#encode-java.lang.String-com.aspose.font.IFont-double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-char-char-}
```
public abstract InputStream encode(String text, IFont font, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth, char inputSeparator, char outputSeparator)
```


Encodes text in Morse code and draws result in PNG-format. Heuristic analysis is used to calculate the alphabet of the input text.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Text to encode by Morse code. |
| font | [IFont](../../com.aspose.font/ifont) | Font to take glyphs related to symbols dot and dash from. |
| fontSize | double | Font size. |
| lineSpacingType | [LineSpacingType](../../com.aspose.font/linespacingtype) | Type of line spacing. Number of pixels or percent of font height. |
| lineSpacingValue | int | Value of line spacing. |
| maxWidth | int | Max width in pixels for image. |
| inputSeparator | char | Symbol used to separate words in input text. |
| outputSeparator | char | Symbol used to separate words in encoded text. |

**Returns:**
java.io.InputStream - Text, encoded by Morse code, in PNG-format as stream of bytes.
### encode(String text, IFont font, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth, MorseAlphabets alphabet) {#encode-java.lang.String-com.aspose.font.IFont-double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-com.aspose.font.textutils.MorseAlphabets-}
```
public abstract InputStream encode(String text, IFont font, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth, MorseAlphabets alphabet)
```


Encodes text by Morse code and draws result in PNG-format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Text to encode by Morse code. |
| font | [IFont](../../com.aspose.font/ifont) | Font to take glyphs related to symbols dot and dash from. |
| fontSize | double | Font size. |
| lineSpacingType | [LineSpacingType](../../com.aspose.font/linespacingtype) | Type of line spacing. Number of pixels or percent of font height. |
| lineSpacingValue | int | Value of line spacing. |
| maxWidth | int | Max width in pixels for image. |
| alphabet | [MorseAlphabets](../../com.aspose.font.textutils/morsealphabets) | Alphabet of Morse code. |

**Returns:**
java.io.InputStream - Text, encoded by Morse code, in PNG-format as stream of bytes.
### encode(String text, IFont font, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth, MorseAlphabets alphabet, char inputSeparator) {#encode-java.lang.String-com.aspose.font.IFont-double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-com.aspose.font.textutils.MorseAlphabets-char-}
```
public abstract InputStream encode(String text, IFont font, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth, MorseAlphabets alphabet, char inputSeparator)
```


Encodes text by Morse code and draws result in PNG-format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Text to encode by Morse code. |
| font | [IFont](../../com.aspose.font/ifont) | Font to take glyphs related to symbols dot and dash from. |
| fontSize | double | Font size. |
| lineSpacingType | [LineSpacingType](../../com.aspose.font/linespacingtype) | Type of line spacing. Number of pixels or percent of font height. |
| lineSpacingValue | int | Value of line spacing. |
| maxWidth | int | Max width in pixels for image. |
| alphabet | [MorseAlphabets](../../com.aspose.font.textutils/morsealphabets) | Alphabet of Morse code. |
| inputSeparator | char | Symbol used to separate words in input text. |

**Returns:**
java.io.InputStream - Text, encoded by Morse code, in PNG-format as stream of bytes.
### encode(String text, IFont font, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth, MorseAlphabets alphabet, char inputSeparator, char outputSeparator) {#encode-java.lang.String-com.aspose.font.IFont-double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-com.aspose.font.textutils.MorseAlphabets-char-char-}
```
public abstract InputStream encode(String text, IFont font, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth, MorseAlphabets alphabet, char inputSeparator, char outputSeparator)
```


Encodes text by Morse code and draws result in PNG-format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Text to encode by Morse code. |
| font | [IFont](../../com.aspose.font/ifont) | Font to take glyphs related to symbols dot and dash from. |
| fontSize | double | Font size. |
| lineSpacingType | [LineSpacingType](../../com.aspose.font/linespacingtype) | Type of line spacing. Number of pixels or percent of font height. |
| lineSpacingValue | int | Value of line spacing. |
| maxWidth | int | Max width in pixels for image. |
| alphabet | [MorseAlphabets](../../com.aspose.font.textutils/morsealphabets) | Alphabet of Morse code. |
| inputSeparator | char | Symbol used to separate words in input text. |
| outputSeparator | char | Symbol used to separate words in encoded text. |

**Returns:**
java.io.InputStream - Text, encoded by Morse code, in PNG-format as stream of bytes.
