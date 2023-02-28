---
title: RecognitionResult.GetSpellCheckCorrectedText
second_title: Aspose.OCR for .NET API 参考
description: RecognitionResult 方法. 更正文本替换拼写错误的单词
type: docs
weight: 100
url: /zh/net/aspose.ocr/recognitionresult/getspellcheckcorrectedtext/
---
## RecognitionResult.GetSpellCheckCorrectedText method

更正文本（替换拼写错误的单词）。

```csharp
public string GetSpellCheckCorrectedText(SpellCheckLanguage language = SpellCheckLanguage.Eng, 
    string dictionaryPath = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| language | SpellCheckLanguage | 要使用的词典。 |
| dictionaryPath | String | 可选。用户词典（频率词典）的完整路径。 词典文件格式： UTF-8 编码的纯文本文件。 单词和单词频率由空格或制表符分隔。默认情况下，单词在第一列中，频率在第二列中。 每个单词-单独一行中的频率对。一行定义为字符序列后跟换行符 ("\n")、回车符 ("\r")、 或回车符后紧跟换行符("\r\n"). 每个单词都应该是小写的。 |

### 返回值

带有替换词的文本。

### 也可以看看

* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* 命名空间 [Aspose.OCR](../../recognitionresult/)
* 部件 [Aspose.OCR](../../../)


