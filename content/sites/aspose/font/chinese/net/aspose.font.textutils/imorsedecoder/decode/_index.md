---
title: "IMorseDecoder.Decode"
second_title: "Aspose.Font for .NET API 参考"
description: "IMorseDecoder 方法。解码摩尔斯电码"
type: docs
weight: 10
url: /zh/net/aspose.font.textutils/imorsedecoder/decode/
---
## IMorseDecoder.Decode method

解码摩尔斯电码。

```csharp
public string Decode(string morseText, MorseAlphabets alphabet = MorseAlphabets.Latin, 
    char inputSeparator = '/', char outputSeparator = ' ')
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| morseText | String | 由摩尔斯电码编码的文本，例如 "... --- ..."（SOS） |
| 字母表 | MorseAlphabets | 摩尔斯电码的字母表 |
| inputSeparator | Char | 用于在编码文本中分隔单词的符号 |
| outputSeparator | Char | 用于在解码文本中分隔单词的符号 |

### 返回值

已解码文本

### 另见

* enum [MorseAlphabets](../../morsealphabets/)
* interface [IMorseDecoder](../)
* namespace [Aspose.Font.TextUtils](../../../aspose.font.textutils/)
* assembly [Aspose.Font](../../../)


