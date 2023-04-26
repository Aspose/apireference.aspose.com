---
title: CharactersAllowedType
second_title: Aspose.OCR for Java API Reference
description: Determines the type of characters allowed for recognition result.
type: docs
weight: 30
url: /java/com.aspose.ocr/charactersallowedtype/
---

**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum CharactersAllowedType extends Enum<CharactersAllowedType>
```

Determines the type of characters allowed for recognition result. Used in the @see RecognitionSettings\#RecognitionSettings to indicate which characters will be recognized.
## Fields

| Field | Description |
| --- | --- |
| [ALL](#ALL) | Recognize all characters. |
| [LATIN_ALPHABET](#LATIN-ALPHABET) | Recognize only if character is an latin alphabetic letter. |
| [DIGITS](#DIGITS) | Recognize only if character is hexadecimal digit. |
## Methods

| Method | Description |
| --- | --- |
| [values()](#values--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
### ALL {#ALL}
```
public static final CharactersAllowedType ALL
```


Recognize all characters.

### LATIN_ALPHABET {#LATIN-ALPHABET}
```
public static final CharactersAllowedType LATIN_ALPHABET
```


Recognize only if character is an latin alphabetic letter.

### DIGITS {#DIGITS}
```
public static final CharactersAllowedType DIGITS
```


Recognize only if character is hexadecimal digit.

### values() {#values--}
```
public static CharactersAllowedType[] values()
```




**Returns:**
com.aspose.ocr.CharactersAllowedType[]
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static CharactersAllowedType valueOf(String name)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |

**Returns:**
[CharactersAllowedType](../../com.aspose.ocr/charactersallowedtype)
