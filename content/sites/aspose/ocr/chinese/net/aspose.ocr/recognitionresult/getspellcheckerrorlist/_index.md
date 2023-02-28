---
title: RecognitionResult.GetSpellCheckErrorList
second_title: Aspose.OCR for .NET API 参考
description: RecognitionResult 方法. 根据给定输入文本的建议拼写查找拼写错误的单词
type: docs
weight: 110
url: /zh/net/aspose.ocr/recognitionresult/getspellcheckerrorlist/
---
## RecognitionResult.GetSpellCheckErrorList method

根据给定输入文本的建议拼写查找拼写错误的单词。

```csharp
public List<SpellCheckError> GetSpellCheckErrorList(
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| language | SpellCheckLanguage | 要使用的词典。 |
| dictionaryPath | String | 可选。用户词典（频率词典）的完整路径。 词典文件格式： UTF-8 编码的纯文本文件。 单词和单词频率由空格或制表符分隔。默认情况下，单词在第一列中，频率在第二列中。 每个单词-单独一行中的频率对。一行定义为字符序列后跟换行符 ("\n")、回车符 ("\r")、 或回车符后紧跟换行符("\r\n"). 每个单词都应该是小写的。 |

### 返回值

SpellCheckError 对象列表表示拼写错误的单词，其中列出了每个拼写错误的单词的建议正确拼写， 和编辑距离。

### 也可以看看

* struct [SpellCheckError](../../../aspose.ocr.spellchecker/spellcheckerror/)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* 命名空间 [Aspose.OCR](../../recognitionresult/)
* 部件 [Aspose.OCR](../../../)


