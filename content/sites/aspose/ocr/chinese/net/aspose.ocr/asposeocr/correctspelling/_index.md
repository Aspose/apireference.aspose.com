---
title: CorrectSpelling
second_title: Aspose.OCR 适用于 .NET API 参考
description: Corrects text replaces misspelled words.
type: docs
weight: 50
url: /zh/net/aspose.ocr/asposeocr/correctspelling/
---
## AsposeOcr.CorrectSpelling method

纠正文本（替换拼写错误的单词）。

```csharp
public string CorrectSpelling(string text, SpellCheckLanguage language = SpellCheckLanguage.Eng, 
    string dictionaryPath = null)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| text | String | Text for correction. |
| language | SpellCheckLanguage | Dictionary to use. |
| dictionaryPath | String | Optionally. Full path to the user dictionary (frequency dictionary). Dictionary file format: Plain text file in UTF-8 encoding. Word and Word Frequency are separated by space or tab.Per default, the word is expected in the first column and the frequency in the second column. Every word-frequency-pair in a separate line.A line is defined as a sequence of characters followed by a line feed ("\n"), a carriage return ("\r"), or a carriage return immediately followed by a line feed("\r\n"). Every word is expected to be in lower case. |

### 返回值

Text with replaced words.

### 另请参见

* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage)
* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.OCR.dll 生成 -->
