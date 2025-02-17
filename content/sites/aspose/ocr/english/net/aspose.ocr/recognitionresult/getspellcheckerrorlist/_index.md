---
title: GetSpellCheckErrorList
second_title: Aspose.OCR for .NET API Reference
description: Find the misspelled words with suggested spellings for a given input text.
type: docs
weight: 130
url: /net/aspose.ocr/recognitionresult/getspellcheckerrorlist/
---
## RecognitionResult.GetSpellCheckErrorList method

Find the misspelled words with suggested spellings for a given input text.

```csharp
public List<SpellCheckError> GetSpellCheckErrorList(
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| language | SpellCheckLanguage | Dictionary to use. |
| dictionaryPath | String | Optionally. Full path to the user dictionary (frequency dictionary). Dictionary file format: Plain text file in UTF-8 encoding. Word and Word Frequency are separated by space or tab.Per default, the word is expected in the first column and the frequency in the second column. Every word-frequency-pair in a separate line.A line is defined as a sequence of characters followed by a line feed ("\n"), a carriage return ("\r"), or a carriage return immediately followed by a line feed("\r\n"). Every word is expected to be in lower case. |

### Return Value

A list of SpellCheckError object representing misspelled words with lists suggested correct spellings for the each misspelled word, and with the edit distance.

### See Also

* struct [SpellCheckError](../../../aspose.ocr.spellchecker/spellcheckerror)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage)
* class [RecognitionResult](../../recognitionresult)
* namespace [Aspose.OCR](../../recognitionresult)
* assembly [Aspose.OCR](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.OCR.dll -->
