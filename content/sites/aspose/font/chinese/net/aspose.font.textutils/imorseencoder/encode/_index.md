---
title: "IMorseEncoder.Encode"
second_title: "Aspose.Font for .NET API 参考"
description: "IMorseEncoder 方法。通过摩尔斯电码对文本进行编码"
type: docs
weight: 10
url: /zh/net/aspose.font.textutils/imorseencoder/encode/
---
## Encode(string, MorseAlphabets, char, char) {#encode}

使用摩尔斯电码编码文本。

```csharp
public string Encode(string text, MorseAlphabets alphabet, char inputSeparator = ' ', 
    char outputSeparator = '/')
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 文本 | String | 要通过摩尔斯电码编码的文本 |
| 字母表 | MorseAlphabets | 摩尔斯电码的字母表 |
| inputSeparator | Char | 用于在输入文本中分隔单词的符号 |
| outputSeparator | Char | 用于在编码文本中分隔单词的符号 |

### 返回值

已编码文本，例如输入文本 "SOS" 对应的 "... --- ..."

### 另见

* enum [MorseAlphabets](../../morsealphabets/)
* interface [IMorseEncoder](../)
* namespace [Aspose.Font.TextUtils](../../../aspose.font.textutils/)
* assembly [Aspose.Font](../../../)

---

## Encode(string, char, char) {#encode_1}

使用摩尔斯电码编码文本。启发式分析用于计算输入文本的字母表。字母表通过第一个单词选择。

```csharp
public string Encode(string text, char inputSeparator = ' ', char outputSeparator = '/')
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 文本 | String | 要通过摩尔斯电码编码的文本 |
| inputSeparator | Char | 用于在输入文本中分隔单词的符号 |
| outputSeparator | Char | 用于在编码文本中分隔单词的符号 |

### 返回值

已编码文本，例如输入文本 "SOS" 对应的 "... --- ..."

### 另见

* interface [IMorseEncoder](../)
* namespace [Aspose.Font.TextUtils](../../../aspose.font.textutils/)
* assembly [Aspose.Font](../../../)


