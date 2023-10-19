---
title: IMorseDecoder
second_title: Aspose.Font for Java API Reference
description: Declares functionality to decipher Morse code.
type: docs
weight: 13
url: /java/com.aspose.font.textutils/imorsedecoder/
---```
public interface IMorseDecoder
```

Declares functionality to decipher Morse code.
## Methods

| Method | Description |
| --- | --- |
| [decode(String morseText)](#decode-java.lang.String-) | Deciphers Morse code. |
| [decode(String morseText, MorseAlphabets alphabet)](#decode-java.lang.String-com.aspose.font.textutils.MorseAlphabets-) | Deciphers Morse code. |
| [decode(String morseText, MorseAlphabets alphabet, char inputSeparator)](#decode-java.lang.String-com.aspose.font.textutils.MorseAlphabets-char-) | Deciphers Morse code. |
| [decode(String morseText, MorseAlphabets alphabet, char inputSeparator, char outputSeparator)](#decode-java.lang.String-com.aspose.font.textutils.MorseAlphabets-char-char-) | Deciphers Morse code. |
### decode(String morseText) {#decode-java.lang.String-}
```
public abstract String decode(String morseText)
```


Deciphers Morse code.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| morseText | java.lang.String | Text encoded by Morse code, i.e. text like "... --- ..."(SOS). |

**Returns:**
java.lang.String - Decoded text.
### decode(String morseText, MorseAlphabets alphabet) {#decode-java.lang.String-com.aspose.font.textutils.MorseAlphabets-}
```
public abstract String decode(String morseText, MorseAlphabets alphabet)
```


Deciphers Morse code.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| morseText | java.lang.String | Text encoded by Morse code, i.e. text like "... --- ..."(SOS). |
| alphabet | [MorseAlphabets](../../com.aspose.font.textutils/morsealphabets) | Alphabet of Morse code. |

**Returns:**
java.lang.String - Decoded text.
### decode(String morseText, MorseAlphabets alphabet, char inputSeparator) {#decode-java.lang.String-com.aspose.font.textutils.MorseAlphabets-char-}
```
public abstract String decode(String morseText, MorseAlphabets alphabet, char inputSeparator)
```


Deciphers Morse code.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| morseText | java.lang.String | Text encoded by Morse code, i.e. text like "... --- ..."(SOS). |
| alphabet | [MorseAlphabets](../../com.aspose.font.textutils/morsealphabets) | Alphabet of Morse code. |
| inputSeparator | char | Symbol used to separate words in encoded text. |

**Returns:**
java.lang.String - Decoded text.
### decode(String morseText, MorseAlphabets alphabet, char inputSeparator, char outputSeparator) {#decode-java.lang.String-com.aspose.font.textutils.MorseAlphabets-char-char-}
```
public abstract String decode(String morseText, MorseAlphabets alphabet, char inputSeparator, char outputSeparator)
```


Deciphers Morse code.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| morseText | java.lang.String | Text encoded by Morse code, i.e. text like "... --- ..."(SOS). |
| alphabet | [MorseAlphabets](../../com.aspose.font.textutils/morsealphabets) | Alphabet of Morse code. |
| inputSeparator | char | Symbol used to separate words in encoded text. |
| outputSeparator | char | Symbol used to separate words in decoded text. |

**Returns:**
java.lang.String - Decoded text.
