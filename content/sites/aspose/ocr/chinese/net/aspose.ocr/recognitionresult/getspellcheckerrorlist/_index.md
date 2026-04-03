---
title: GetSpellCheckErrorList
second_title: Aspose.OCR 适用于 .NET API 参考
description: 查找给定输入文本中拼写错误的单词并提供建议拼写。
type: docs
weight: 100
url: /zh/net/aspose.ocr/recognitionresult/getspellcheckerrorlist/
---
## RecognitionResult.GetSpellCheckErrorList method

查找给定输入文本中拼写错误的单词并提供建议拼写。

```csharp
public List<SpellCheckError> GetSpellCheckErrorList(
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| language | SpellCheckLanguage | Dictionary to use. |
| dictionaryPath | String | Optionally. Full path to the user dictionary (frequency dictionary). Dictionary file format: Plain text file in UTF-8 encoding. Word and Word Frequency are separated by space or tab.Per default, the word is expected in the first column and the frequency in the second column. Every word-frequency-pair in a separate line.A line is defined as a sequence of characters followed by a line feed ("\n"), a carriage return ("\r"), or a carriage return immediately followed by a line feed("\r\n"). Every word is expected to be in lower case. |

### 返回值

一个 SpellCheckError 对象的列表，表示拼写错误的单词，并为每个拼写错误的单词提供建议的正确拼写列表，以及编辑距离。

### 另请参见

* struct [SpellCheckError](../../../aspose.ocr.spellchecker/spellcheckerror)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage)
* class [RecognitionResult](../../recognitionresult)
* namespace [Aspose.OCR](../../recognitionresult)
* assembly [Aspose.OCR](../../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.OCR.dll 生成 -->
