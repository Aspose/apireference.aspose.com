---
title: IFontMorseDecoder
second_title: Aspose.Font for Java API Reference
description: Declares functionality to decode Morse code into glyphs of the specified font.
type: docs
weight: 11
url: /java/com.aspose.font.textutils/ifontmorsedecoder/
---```
public interface IFontMorseDecoder
```

Declares functionality to decode Morse code into glyphs of the specified font.
## Methods

| Method | Description |
| --- | --- |
| [decode(String morseText, IFont font)](#decode-java.lang.String-com.aspose.font.IFont-) | Deciphers Morse code into glyphs of the specified font. |
| [decode(String morseText, IFont font, MorseAlphabets alphabet)](#decode-java.lang.String-com.aspose.font.IFont-com.aspose.font.textutils.MorseAlphabets-) | Deciphers Morse code into glyphs of the specified font. |
| [decode(String morseText, IFont font, MorseAlphabets alphabet, char inputSeparator)](#decode-java.lang.String-com.aspose.font.IFont-com.aspose.font.textutils.MorseAlphabets-char-) | Deciphers Morse code into glyphs of the specified font. |
| [decode(String morseText, IFont font, MorseAlphabets alphabet, char inputSeparator, char outputSeparator)](#decode-java.lang.String-com.aspose.font.IFont-com.aspose.font.textutils.MorseAlphabets-char-char-) | Deciphers Morse code into glyphs of the specified font. |
| [decode(String morseText, IFont font, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth)](#decode-java.lang.String-com.aspose.font.IFont-double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-) | Deciphers Morse code and draws result in PNG-format. |
| [decode(String morseText, IFont font, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth, MorseAlphabets alphabet)](#decode-java.lang.String-com.aspose.font.IFont-double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-com.aspose.font.textutils.MorseAlphabets-) | Deciphers Morse code and draws result in PNG-format. |
| [decode(String morseText, IFont font, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth, MorseAlphabets alphabet, char inputSeparator)](#decode-java.lang.String-com.aspose.font.IFont-double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-com.aspose.font.textutils.MorseAlphabets-char-) | Deciphers Morse code and draws result in PNG-format. |
| [decode(String morseText, IFont font, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth, MorseAlphabets alphabet, char inputSeparator, char outputSeparator)](#decode-java.lang.String-com.aspose.font.IFont-double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-com.aspose.font.textutils.MorseAlphabets-char-char-) | Deciphers Morse code and draws result in PNG-format. |
### decode(String morseText, IFont font) {#decode-java.lang.String-com.aspose.font.IFont-}
```
public abstract GlyphId[] decode(String morseText, IFont font)
```


Deciphers Morse code into glyphs of the specified font.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| morseText | java.lang.String | Text encoded by Morse code, i.e. text like "... --- ..."(SOS). |
| font | [IFont](../../com.aspose.font/ifont) | Font to take glyphs related to decoded text from. |

**Returns:**
com.aspose.font.GlyphId[] - Glyphs (glyph identifiers) related to decoded text.
### decode(String morseText, IFont font, MorseAlphabets alphabet) {#decode-java.lang.String-com.aspose.font.IFont-com.aspose.font.textutils.MorseAlphabets-}
```
public abstract GlyphId[] decode(String morseText, IFont font, MorseAlphabets alphabet)
```


Deciphers Morse code into glyphs of the specified font.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| morseText | java.lang.String | Text encoded by Morse code, i.e. text like "... --- ..."(SOS). |
| font | [IFont](../../com.aspose.font/ifont) | Font to take glyphs related to decoded text from. |
| alphabet | [MorseAlphabets](../../com.aspose.font.textutils/morsealphabets) | Alphabet of Morse code. |

**Returns:**
com.aspose.font.GlyphId[] - Glyphs (glyph identifiers) related to decoded text.
### decode(String morseText, IFont font, MorseAlphabets alphabet, char inputSeparator) {#decode-java.lang.String-com.aspose.font.IFont-com.aspose.font.textutils.MorseAlphabets-char-}
```
public abstract GlyphId[] decode(String morseText, IFont font, MorseAlphabets alphabet, char inputSeparator)
```


Deciphers Morse code into glyphs of the specified font.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| morseText | java.lang.String | Text encoded by Morse code, i.e. text like "... --- ..."(SOS). |
| font | [IFont](../../com.aspose.font/ifont) | Font to take glyphs related to decoded text from. |
| alphabet | [MorseAlphabets](../../com.aspose.font.textutils/morsealphabets) | Alphabet of Morse code. |
| inputSeparator | char | Symbol used to separate words in encoded text. |

**Returns:**
com.aspose.font.GlyphId[] - Glyphs (glyph identifiers) related to decoded text.
### decode(String morseText, IFont font, MorseAlphabets alphabet, char inputSeparator, char outputSeparator) {#decode-java.lang.String-com.aspose.font.IFont-com.aspose.font.textutils.MorseAlphabets-char-char-}
```
public abstract GlyphId[] decode(String morseText, IFont font, MorseAlphabets alphabet, char inputSeparator, char outputSeparator)
```


Deciphers Morse code into glyphs of the specified font.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| morseText | java.lang.String | Text encoded by Morse code, i.e. text like "... --- ..."(SOS). |
| font | [IFont](../../com.aspose.font/ifont) | Font to take glyphs related to decoded text from. |
| alphabet | [MorseAlphabets](../../com.aspose.font.textutils/morsealphabets) | Alphabet of Morse code. |
| inputSeparator | char | Symbol used to separate words in encoded text. |
| outputSeparator | char | Symbol used to separate words in decoded text. |

**Returns:**
com.aspose.font.GlyphId[] - Glyphs (glyph identifiers) related to decoded text.
### decode(String morseText, IFont font, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth) {#decode-java.lang.String-com.aspose.font.IFont-double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-}
```
public abstract InputStream decode(String morseText, IFont font, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth)
```


Deciphers Morse code and draws result in PNG-format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| morseText | java.lang.String | Text encoded by Morse code, i.e. text like "... --- ..."(SOS). |
| font | [IFont](../../com.aspose.font/ifont) | Font to take glyphs related to decoded text from. |
| fontSize | double | Font size. |
| lineSpacingType | [LineSpacingType](../../com.aspose.font/linespacingtype) | Type of line spacing. Number of pixels or percent of font height. |
| lineSpacingValue | int | Value of line spacing. |
| maxWidth | int | Max width in pixels for image. |

**Returns:**
java.io.InputStream - Decoded text in PNG-format as stream of bytes.
### decode(String morseText, IFont font, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth, MorseAlphabets alphabet) {#decode-java.lang.String-com.aspose.font.IFont-double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-com.aspose.font.textutils.MorseAlphabets-}
```
public abstract InputStream decode(String morseText, IFont font, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth, MorseAlphabets alphabet)
```


Deciphers Morse code and draws result in PNG-format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| morseText | java.lang.String | Text encoded by Morse code, i.e. text like "... --- ..."(SOS). |
| font | [IFont](../../com.aspose.font/ifont) | Font to take glyphs related to decoded text from. |
| fontSize | double | Font size. |
| lineSpacingType | [LineSpacingType](../../com.aspose.font/linespacingtype) | Type of line spacing. Number of pixels or percent of font height. |
| lineSpacingValue | int | Value of line spacing. |
| maxWidth | int | Max width in pixels for image. |
| alphabet | [MorseAlphabets](../../com.aspose.font.textutils/morsealphabets) | Alphabet of Morse code. |

**Returns:**
java.io.InputStream - Decoded text in PNG-format as stream of bytes.
### decode(String morseText, IFont font, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth, MorseAlphabets alphabet, char inputSeparator) {#decode-java.lang.String-com.aspose.font.IFont-double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-com.aspose.font.textutils.MorseAlphabets-char-}
```
public abstract InputStream decode(String morseText, IFont font, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth, MorseAlphabets alphabet, char inputSeparator)
```


Deciphers Morse code and draws result in PNG-format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| morseText | java.lang.String | Text encoded by Morse code, i.e. text like "... --- ..."(SOS). |
| font | [IFont](../../com.aspose.font/ifont) | Font to take glyphs related to decoded text from. |
| fontSize | double | Font size. |
| lineSpacingType | [LineSpacingType](../../com.aspose.font/linespacingtype) | Type of line spacing. Number of pixels or percent of font height. |
| lineSpacingValue | int | Value of line spacing. |
| maxWidth | int | Max width in pixels for image. |
| alphabet | [MorseAlphabets](../../com.aspose.font.textutils/morsealphabets) | Alphabet of Morse code. |
| inputSeparator | char | Symbol used to separate words in encoded text. |

**Returns:**
java.io.InputStream - Decoded text in PNG-format as stream of bytes.
### decode(String morseText, IFont font, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth, MorseAlphabets alphabet, char inputSeparator, char outputSeparator) {#decode-java.lang.String-com.aspose.font.IFont-double-com.aspose.font.RenderingUtils.LineSpacingType-int-int-com.aspose.font.textutils.MorseAlphabets-char-char-}
```
public abstract InputStream decode(String morseText, IFont font, double fontSize, RenderingUtils.LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth, MorseAlphabets alphabet, char inputSeparator, char outputSeparator)
```


Deciphers Morse code and draws result in PNG-format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| morseText | java.lang.String | Text encoded by Morse code, i.e. text like "... --- ..."(SOS). |
| font | [IFont](../../com.aspose.font/ifont) | Font to take glyphs related to decoded text from. |
| fontSize | double | Font size. |
| lineSpacingType | [LineSpacingType](../../com.aspose.font/linespacingtype) | Type of line spacing. Number of pixels or percent of font height. |
| lineSpacingValue | int | Value of line spacing. |
| maxWidth | int | Max width in pixels for image. |
| alphabet | [MorseAlphabets](../../com.aspose.font.textutils/morsealphabets) | Alphabet of Morse code. |
| inputSeparator | char | Symbol used to separate words in encoded text. |
| outputSeparator | char | Symbol used to separate words in decoded text. |

**Returns:**
java.io.InputStream - Decoded text in PNG-format as stream of bytes.
