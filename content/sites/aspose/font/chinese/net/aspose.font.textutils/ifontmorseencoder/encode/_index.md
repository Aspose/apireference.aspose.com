---
title: "IFontMorseEncoder.Encode"
second_title: "Aspose.Font for .NET API 参考"
description: "IFontMorseEncoder 方法。通过摩尔斯电码对文本进行编码，并将结果返回为字形集合（字形标识符）"
type: docs
weight: 10
url: /zh/net/aspose.font.textutils/ifontmorseencoder/encode/
---
## Encode(string, IFont, MorseAlphabets, char, char) {#encode}

通过摩尔斯电码对文本进行编码，并将结果返回为一组字形（字形标识符）。

```csharp
public GlyphId[] Encode(string text, IFont font, MorseAlphabets alphabet, 
    char inputSeparator = ' ', char outputSeparator = '/')
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 文本 | String | 要通过摩尔斯电码编码的文本 |
| 字体 | IFont | 用于获取点和划符号相关字形的字体 |
| 字母表 | MorseAlphabets | 摩尔斯电码的字母表 |
| inputSeparator | Char | 用于在输入文本中分隔单词的符号 |
| outputSeparator | Char | 用于在编码文本中分隔单词的符号 |

### 返回值

与已编码文本相关的字形（glyphId），例如输入文本 "SOS" 对应的 "... --- ..."

### 另见

* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* interface [IFont](../../../aspose.font/ifont/)
* enum [MorseAlphabets](../../morsealphabets/)
* interface [IFontMorseEncoder](../)
* namespace [Aspose.Font.TextUtils](../../../aspose.font.textutils/)
* assembly [Aspose.Font](../../../)

---

## Encode(string, IFont, char, char) {#encode_1}

使用摩尔斯电码编码文本，并将结果作为字形集合（glyphId）返回。启发式分析用于计算输入文本的字母表。

```csharp
public GlyphId[] Encode(string text, IFont font, char inputSeparator = ' ', 
    char outputSeparator = '/')
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 文本 | String | 要通过摩尔斯电码编码的文本 |
| 字体 | IFont | 用于获取点和划符号相关字形的字体 |
| inputSeparator | Char | 用于在输入文本中分隔单词的符号 |
| outputSeparator | Char | 用于在编码文本中分隔单词的符号 |

### 返回值

与已编码文本相关的字形（glyphId），例如输入文本 "SOS" 对应的 "... --- ..."

### 另见

* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* interface [IFont](../../../aspose.font/ifont/)
* interface [IFontMorseEncoder](../)
* namespace [Aspose.Font.TextUtils](../../../aspose.font.textutils/)
* assembly [Aspose.Font](../../../)

---

## Encode(string, IFont, double, LineSpacingType, int, int, MorseAlphabets, char, char) {#encode_2}

通过摩尔斯电码对文本进行编码并绘制为 PNG 格式。

```csharp
public Stream Encode(string text, IFont font, double fontSize, LineSpacingType lineSpacingType, 
    int lineSpacingValue, int maxWidth, MorseAlphabets alphabet, char inputSeparator = ' ', 
    char outputSeparator = '/')
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 文本 | String | 要通过摩尔斯电码编码的文本 |
| 字体 | IFont | 用于获取点和划符号相关字形的字体 |
| fontSize | Double | 字体大小 |
| lineSpacingType | LineSpacingType | 行间距的类型。像素数或字体高度的百分比 |
| lineSpacingValue | Int32 | 行间距的值 |
| maxWidth | Int32 | 图像的最大宽度（像素） |
| 字母表 | MorseAlphabets | 摩尔斯电码的字母表 |
| inputSeparator | Char | 用于在输入文本中分隔单词的符号 |
| outputSeparator | Char | 用于在编码文本中分隔单词的符号 |

### 返回值

以 PNG 格式的字节流形式的、通过摩尔斯电码编码的文本

### 另见

* interface [IFont](../../../aspose.font/ifont/)
* enum [LineSpacingType](../../../aspose.font.renderers/renderingutils.linespacingtype/)
* enum [MorseAlphabets](../../morsealphabets/)
* interface [IFontMorseEncoder](../)
* namespace [Aspose.Font.TextUtils](../../../aspose.font.textutils/)
* assembly [Aspose.Font](../../../)

---

## Encode(string, IFont, double, LineSpacingType, int, int, char, char) {#encode_3}

将文本以摩尔斯电码编码并绘制为 PNG 格式。使用启发式分析来计算输入文本的字母表。

```csharp
public Stream Encode(string text, IFont font, double fontSize, LineSpacingType lineSpacingType, 
    int lineSpacingValue, int maxWidth, char inputSeparator = ' ', char outputSeparator = '/')
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 文本 | String | 要通过摩尔斯电码编码的文本 |
| 字体 | IFont | 用于获取点和划符号相关字形的字体 |
| fontSize | Double | 字体大小 |
| lineSpacingType | LineSpacingType | 行间距的类型。像素数或字体高度的百分比 |
| lineSpacingValue | Int32 | 行间距的值 |
| maxWidth | Int32 | 图像的最大宽度（像素） |
| inputSeparator | Char | 用于在输入文本中分隔单词的符号 |
| outputSeparator | Char | 用于在编码文本中分隔单词的符号 |

### 返回值

以 PNG 格式的字节流形式的、通过摩尔斯电码编码的文本

### 另见

* interface [IFont](../../../aspose.font/ifont/)
* enum [LineSpacingType](../../../aspose.font.renderers/renderingutils.linespacingtype/)
* interface [IFontMorseEncoder](../)
* namespace [Aspose.Font.TextUtils](../../../aspose.font.textutils/)
* assembly [Aspose.Font](../../../)


