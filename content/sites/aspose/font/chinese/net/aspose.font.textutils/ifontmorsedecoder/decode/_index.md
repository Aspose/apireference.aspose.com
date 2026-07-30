---
title: "IFontMorseDecoder.Decode"
second_title: "Aspose.Font for .NET API 参考"
description: "IFontMorseDecoder 方法。将摩尔斯电码解码为指定字体的字形"
type: docs
weight: 10
url: /zh/net/aspose.font.textutils/ifontmorsedecoder/decode/
---
## Decode(string, IFont, MorseAlphabets, char, char) {#decode}

将摩尔斯电码解码为指定字体的字形。

```csharp
public GlyphId[] Decode(string morseText, IFont font, 
    MorseAlphabets alphabet = MorseAlphabets.Latin, char inputSeparator = ' ', 
    char outputSeparator = '/')
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| morseText | String | 由摩尔斯电码编码的文本，例如 "... --- ..."（SOS） |
| 字体 | IFont | 用于获取已解码文本相关字形的字体 |
| 字母表 | MorseAlphabets | 摩尔斯电码的字母表 |
| inputSeparator | Char | 用于在编码文本中分隔单词的符号 |
| outputSeparator | Char | 用于在解码文本中分隔单词的符号 |

### 返回值

与已解码文本相关的字形（字形标识符）

### 另见

* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* interface [IFont](../../../aspose.font/ifont/)
* enum [MorseAlphabets](../../morsealphabets/)
* interface [IFontMorseDecoder](../)
* namespace [Aspose.Font.TextUtils](../../../aspose.font.textutils/)
* assembly [Aspose.Font](../../../)

---

## Decode(string, IFont, double, LineSpacingType, int, int, MorseAlphabets, char, char) {#decode_1}

解码摩尔斯电码并以 PNG 格式绘制结果。

```csharp
public Stream Decode(string morseText, IFont font, double fontSize, 
    LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth, 
    MorseAlphabets alphabet = MorseAlphabets.Latin, char inputSeparator = ' ', 
    char outputSeparator = '/')
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| morseText | String | 由摩尔斯电码编码的文本，例如 "... --- ..."（SOS） |
| 字体 | IFont | 用于获取已解码文本相关字形的字体 |
| fontSize | Double | 字体大小 |
| lineSpacingType | LineSpacingType | 行间距的类型。像素数或字体高度的百分比 |
| lineSpacingValue | Int32 | 行间距的值 |
| maxWidth | Int32 | 图像的最大宽度（像素） |
| 字母表 | MorseAlphabets | 摩尔斯电码的字母表 |
| inputSeparator | Char | 用于在编码文本中分隔单词的符号 |
| outputSeparator | Char | 用于在解码文本中分隔单词的符号 |

### 返回值

以 PNG 格式的字节流形式的已解码文本

### 另见

* interface [IFont](../../../aspose.font/ifont/)
* enum [LineSpacingType](../../../aspose.font.renderers/renderingutils.linespacingtype/)
* enum [MorseAlphabets](../../morsealphabets/)
* interface [IFontMorseDecoder](../)
* namespace [Aspose.Font.TextUtils](../../../aspose.font.textutils/)
* assembly [Aspose.Font](../../../)


