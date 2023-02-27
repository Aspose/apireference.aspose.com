---
title: RecognitionResult.Save
second_title: Aspose.OCR for .NET API 参考
description: RecognitionResult 方法. 将文档另存为纯文本PDF 或 Microsoft Word 文档
type: docs
weight: 130
url: /zh/net/aspose.ocr/recognitionresult/save/
---
## Save(string, SaveFormat, bool, SpellCheckLanguage, string) {#save_1}

将文档另存为纯文本、PDF 或 Microsoft Word 文档。

```csharp
public void Save(string fullFileName, SaveFormat saveFormat, bool applySpellingCorrection = false, 
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| fullFileName | String | 带有用于以所选格式保存识别结果的路径的文件名。 |
| saveFormat | SaveFormat | 文档格式（Docx、Txt、Pdf）。 |
| applySpellingCorrection | Boolean | 设置为 true 以纠正拼写错误的单词，以防识别结果中出现此类单词。 |
| language | SpellCheckLanguage | 拼写检查词典（可选）。 |
| dictionaryPath | String | 可选。 .txt 格式的用户字典的完整路径。格式为[word - space - frequence(number)]. 例子：the 23135851162\nthat 3400031103\n |

### 也可以看看

* enum [SaveFormat](../../saveformat/)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* 命名空间 [Aspose.OCR](../../recognitionresult/)
* 部件 [Aspose.OCR](../../../)

---

## Save(MemoryStream, SaveFormat, bool, SpellCheckLanguage, string) {#save}

将文档另存为纯文本、PDF 或 Microsoft Word 文档。

```csharp
public void Save(MemoryStream stream, SaveFormat saveFormat, bool applySpellingCorrection = false, 
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| stream | MemoryStream | MemoryStream，用于以选定的格式保存识别结果。 |
| saveFormat | SaveFormat | 文档格式（Docx、Txt、Pdf）。 |
| applySpellingCorrection | Boolean | 设置为 true 以纠正拼写错误的单词，以防识别结果中出现此类单词。 |
| language | SpellCheckLanguage | 拼写检查词典（可选）。 |
| dictionaryPath | String | 可选。 .txt 格式的用户字典的完整路径。格式为[word - space - frequence(number)]. 例子：the 23135851162\nthat 3400031103\n |

### 也可以看看

* enum [SaveFormat](../../saveformat/)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* 命名空间 [Aspose.OCR](../../recognitionresult/)
* 部件 [Aspose.OCR](../../../)


