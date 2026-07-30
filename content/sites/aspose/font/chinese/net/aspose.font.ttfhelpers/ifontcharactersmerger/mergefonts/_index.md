---
title: "IFontCharactersMerger.MergeFonts"
second_title: "Aspose.Font for .NET API 参考"
description: "IFontCharactersMerger 方法。根据传入的字形列表合并字体。为每个传入的字形搜索字符代码，并将找到的字符代码与相应的字形添加到生成的新字体中。"
type: docs
weight: 10
url: /zh/net/aspose.font.ttfhelpers/ifontcharactersmerger/mergefonts/
---
## MergeFonts(GlyphId[], GlyphId[], string) {#mergefonts}

根据传入的字形列表合并字体。为每个传入的字形搜索字符代码，并将找到的字符代码与相应的字形添加到生成的新字体中。

```csharp
public TtfFont MergeFonts(GlyphId[] font1Glyphs, GlyphId[] font2Glyphs, string newFontName)
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| font1Glyphs | GlyphId[] | 第一个字体的字形列表 |
| font2Glyphs | GlyphId[] | 第二个字体的字形列表 |
| newFontName | String | 生成字体的期望名称 |

### 返回值

合并后的字体

### 另见

* class [TtfFont](../../../aspose.font.ttf/ttffont/)
* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* interface [IFontCharactersMerger](../)
* namespace [Aspose.Font.TtfHelpers](../../../aspose.font.ttfhelpers/)
* assembly [Aspose.Font](../../../)

---

## MergeFonts(uint[], uint[], string) {#mergefonts_2}

根据传入的字符代码列表合并字体。要创建所需的生成字体，只需传入您希望包含在生成字体中的原始字体的符号代码。与传入代码对应的字形将自动被找到。例如，如果您想在生成字体中包含来自第一字体的字母 A 和 B 对应的字形，以及来自第二字体的字母 C 和 D 对应的字形，只需按如下方式调用此方法：

```csharp
MergeFonts(new uint[] { 'A', 'B' }, new uint[] { 'C', 'D' }, "NewFont")
```

```csharp
public TtfFont MergeFonts(uint[] font1CharCodes, uint[] font2CharCodes, string newFontName)
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| font1CharCodes | UInt32[] | 从第一个字体获取的代码 |
| font2CharCodes | UInt32[] | 从第二种字体中获取的代码 |
| newFontName | String | 生成字体的期望名称 |

### 返回值

合并后的字体

### 另见

* class [TtfFont](../../../aspose.font.ttf/ttffont/)
* interface [IFontCharactersMerger](../)
* namespace [Aspose.Font.TtfHelpers](../../../aspose.font.ttfhelpers/)
* assembly [Aspose.Font](../../../)

---

## MergeFonts(IDictionary&lt;uint, GlyphId&gt;, IDictionary&lt;uint, GlyphId&gt;, string) {#mergefonts_1}

此方法版本旨在您希望显式为生成字体中的字形设置字符代码的情况。提供的字形代码不一定必须包含在原始字体中。传入的代码的意义在于它将与生成字体中对应的字形标识符关联。因此，处理字典参数[code, glyph identifier]中每对键值的规则是，仅从原始字体中获取字形标识符，然后将其与生成字体中的相应代码关联。当第一个字体的某些代码与第二个字体的相同代码冲突时，此方法可能会有帮助。

```csharp
public TtfFont MergeFonts(IDictionary<uint, GlyphId> font1Dict, 
    IDictionary<uint, GlyphId> font2Dict, string newFontName)
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| font1Dict | IDictionary`2 | 来自第一种字体的 [符号代码, 字形标识符] 对应的字典 |
| font2Dict | IDictionary`2 | 来自第二种字体的 [符号代码, 字形标识符] 对应的字典 |
| newFontName | String | 生成字体的期望名称 |

### 返回值

合并后的字体

### 另见

* class [TtfFont](../../../aspose.font.ttf/ttffont/)
* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* interface [IFontCharactersMerger](../)
* namespace [Aspose.Font.TtfHelpers](../../../aspose.font.ttfhelpers/)
* assembly [Aspose.Font](../../../)


