---
title: IMorseEncoder
second_title: Aspose.Font for Java API Reference
description: Declares functionality to encode text by Morse code.
type: docs
weight: 14
url: /java/com.aspose.font.textutils/imorseencoder/
---```
public interface IMorseEncoder
```

Declares functionality to encode text by Morse code.
## Methods

| Method | Description |
| --- | --- |
| [encode(String text)](#encode-java.lang.String-) | Encodes text by Morse code. |
| [encode(String text, char inputSeparator)](#encode-java.lang.String-char-) | Encodes text by Morse code. |
| [encode(String text, char inputSeparator, char outputSeparator)](#encode-java.lang.String-char-char-) | Encodes text by Morse code. |
| [encode(String text, MorseAlphabets alphabet)](#encode-java.lang.String-com.aspose.font.textutils.MorseAlphabets-) | Encodes text by Morse code. |
| [encode(String text, MorseAlphabets alphabet, char inputSeparator)](#encode-java.lang.String-com.aspose.font.textutils.MorseAlphabets-char-) | Encodes text by Morse code. |
| [encode(String text, MorseAlphabets alphabet, char inputSeparator, char outputSeparator)](#encode-java.lang.String-com.aspose.font.textutils.MorseAlphabets-char-char-) | Encodes text by Morse code. |
### encode(String text) {#encode-java.lang.String-}
```
public abstract String encode(String text)
```


Encodes text by Morse code. Heuristic analysis is used to calculate the alphabet of the input text. The alphabet is selected by the first word.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Text to encode by Morse code. |

**Returns:**
java.lang.String - Encoded text, i.e. "... --- ..." for the input text "SOS".
### encode(String text, char inputSeparator) {#encode-java.lang.String-char-}
```
public abstract String encode(String text, char inputSeparator)
```


Encodes text by Morse code. Heuristic analysis is used to calculate the alphabet of the input text. The alphabet is selected by the first word.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Text to encode by Morse code. |
| inputSeparator | char | Symbol used to separate words in input text. |

**Returns:**
java.lang.String - Encoded text, i.e. "... --- ..." for the input text "SOS".
### encode(String text, char inputSeparator, char outputSeparator) {#encode-java.lang.String-char-char-}
```
public abstract String encode(String text, char inputSeparator, char outputSeparator)
```


Encodes text by Morse code. Heuristic analysis is used to calculate the alphabet of the input text. The alphabet is selected by the first word.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Text to encode by Morse code. |
| inputSeparator | char | Symbol used to separate words in input text. |
| outputSeparator | char | Symbol used to separate words in encoded text. |

**Returns:**
java.lang.String - Encoded text, i.e. "... --- ..." for the input text "SOS".
### encode(String text, MorseAlphabets alphabet) {#encode-java.lang.String-com.aspose.font.textutils.MorseAlphabets-}
```
public abstract String encode(String text, MorseAlphabets alphabet)
```


Encodes text by Morse code.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Text to encode by Morse code. |
| alphabet | [MorseAlphabets](../../com.aspose.font.textutils/morsealphabets) | Alphabet of Morse code. |

**Returns:**
java.lang.String - Encoded text, ie "... --- ..." for the input text "SOS".
### encode(String text, MorseAlphabets alphabet, char inputSeparator) {#encode-java.lang.String-com.aspose.font.textutils.MorseAlphabets-char-}
```
public abstract String encode(String text, MorseAlphabets alphabet, char inputSeparator)
```


Encodes text by Morse code.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Text to encode by Morse code. |
| alphabet | [MorseAlphabets](../../com.aspose.font.textutils/morsealphabets) | Alphabet of Morse code. |
| inputSeparator | char | Symbol used to separate words in input text. |

**Returns:**
java.lang.String - Encoded text, ie "... --- ..." for the input text "SOS".
### encode(String text, MorseAlphabets alphabet, char inputSeparator, char outputSeparator) {#encode-java.lang.String-com.aspose.font.textutils.MorseAlphabets-char-char-}
```
public abstract String encode(String text, MorseAlphabets alphabet, char inputSeparator, char outputSeparator)
```


Encodes text by Morse code.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Text to encode by Morse code. |
| alphabet | [MorseAlphabets](../../com.aspose.font.textutils/morsealphabets) | Alphabet of Morse code. |
| inputSeparator | char | Symbol used to separate words in input text. |
| outputSeparator | char | Symbol used to separate words in encoded text. |

**Returns:**
java.lang.String - Encoded text, ie "... --- ..." for the input text "SOS".
