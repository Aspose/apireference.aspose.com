---
title: "接口 IFontCharactersMerger"
second_title: "Aspose.Font for .NET API 参考"
description: "Aspose.Font.TtfHelpers.IFontCharactersMerger 接口。声明用于合并 TrueType 字体的辅助功能。通过参数 font1 传入的字体被视为主字体。这意味着许多与最终合并字体相关的特性，如度量、编码、结构等，都将取自此主字体。"
type: docs
weight: 990
url: /zh/net/aspose.font.ttfhelpers/ifontcharactersmerger/
---
## IFontCharactersMerger interface

声明用于合并 TrueType 字体的辅助功能。通过参数 font1 传入的字体被视为主字体。这意味着许多与最终合并字体相关的特性，如度量、编码结构等，将从此主字体中获取。

```csharp
public interface IFontCharactersMerger
```

## 方法

| 名称 | 描述 |
| --- | --- |
| [MergeFonts](../../aspose.font.ttfhelpers/ifontcharactersmerger/mergefonts/#mergefonts)(GlyphId[], GlyphId[], string) | 根据传入的字形列表合并字体。为每个传入的字形搜索字符代码，并将找到的字符代码与相应的字形添加到生成的新字体中。 |
| [MergeFonts](../../aspose.font.ttfhelpers/ifontcharactersmerger/mergefonts/#mergefonts_1)(IDictionary&lt;uint, GlyphId&gt;, IDictionary&lt;uint, GlyphId&gt;, string) | 此方法版本旨在您希望显式为生成字体中的字形设置字符代码的情况。提供的字形代码不一定必须包含在原始字体中。传入的代码的意义在于它将与生成字体中对应的字形标识符关联。因此，处理字典参数[code, glyph identifier]中每对键值的规则是，仅从原始字体中获取字形标识符，然后将其与生成字体中的相应代码关联。当第一个字体的某些代码与第二个字体的相同代码冲突时，此方法可能会有帮助。 |
| [MergeFonts](../../aspose.font.ttfhelpers/ifontcharactersmerger/mergefonts/#mergefonts_2)(uint[], uint[], string) | 根据传入的字符代码列表合并字体。要创建所需的生成字体，只需传入您希望包含在生成字体中的原始字体的符号代码。与传入代码对应的字形将自动被找到。例如，如果您想在生成字体中包含来自第一字体的字母 A 和 B 对应的字形，以及来自第二字体的字母 C 和 D 对应的字形，只需按如下方式调用此方法： |

### 另见

* namespace [Aspose.Font.TtfHelpers](../../aspose.font.ttfhelpers/)
* assembly [Aspose.Font](../../)


