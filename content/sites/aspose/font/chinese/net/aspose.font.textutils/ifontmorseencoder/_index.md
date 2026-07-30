---
title: "Interface IFontMorseEncoder"
second_title: "Aspose.Font for .NET API 参考"
description: "Aspose.Font.TextUtils.IFontMorseEncoder 接口。声明了使用摩尔斯电码编码文本并将结果作为字体字形获取的功能"
type: docs
weight: 770
url: /zh/net/aspose.font.textutils/ifontmorseencoder/
---
## IFontMorseEncoder interface

声明通过摩尔斯电码对文本进行编码并将结果作为字体字形获取的功能。

```csharp
public interface IFontMorseEncoder
```

## 方法

| 名称 | 描述 |
| --- | --- |
| [Encode](../../aspose.font.textutils/ifontmorseencoder/encode/#encode_1)(string, IFont, char, char) | 使用摩尔斯电码编码文本，并将结果作为字形集合（glyphId）返回。启发式分析用于计算输入文本的字母表。 |
| [Encode](../../aspose.font.textutils/ifontmorseencoder/encode/#encode)(string, IFont, MorseAlphabets, char, char) | 通过摩尔斯电码对文本进行编码，并将结果返回为一组字形（字形标识符）。 |
| [Encode](../../aspose.font.textutils/ifontmorseencoder/encode/#encode_3)(string, IFont, double, LineSpacingType, int, int, char, char) | 将文本以摩尔斯电码编码并绘制为 PNG 格式。使用启发式分析来计算输入文本的字母表。 |
| [Encode](../../aspose.font.textutils/ifontmorseencoder/encode/#encode_2)(string, IFont, double, LineSpacingType, int, int, MorseAlphabets, char, char) | 通过摩尔斯电码对文本进行编码并绘制为 PNG 格式。 |

### 另见

* namespace [Aspose.Font.TextUtils](../../aspose.font.textutils/)
* assembly [Aspose.Font](../../)


