---
title: Interface ITrFont
second_title: Aspose.Page for .NET API 参考
description: Aspose.Page.ITrFont 界面. 这个接口可以访问字体的主要参数
type: docs
weight: 260
url: /zh/net/aspose.page/itrfont/
---
## ITrFont interface

这个接口可以访问字体的主要参数。

```csharp
public interface ITrFont
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| [CharStrings](../../aspose.page/itrfont/charstrings/) { get; } | 返回字符名称和字形之间的映射。 |
| [Encoding](../../aspose.page/itrfont/encoding/) { get; } | 返回编码数组。 |
| [EncodingTable](../../aspose.page/itrfont/encodingtable/) { get; } | 返回编码的名称。 |
| [FID](../../aspose.page/itrfont/fid/) { get; } | 返回字体标识符。 |
| [Font](../../aspose.page/itrfont/font/) { get; } | 返回与该字体对应的 DrFont。 |
| [FontName](../../aspose.page/itrfont/fontname/) { get; } | 返回字体名称。 |
| [FontType](../../aspose.page/itrfont/fonttype/) { get; } | 返回 Adobe 分类中的一种字体。 |
| [NativeFont](../../aspose.page/itrfont/nativefont/) { get; } | 返回与此字体对应的 System.Drawing.Font。 |
| [Size](../../aspose.page/itrfont/size/) { get; } | 返回字体大小。 |
| [Style](../../aspose.page/itrfont/style/) { get; } | 返回字体样式。 |
| [Transform](../../aspose.page/itrfont/transform/) { get; } | 返回字体转换。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [Clone](../../aspose.page/itrfont/clone/)() | 克隆字体。 |
| [DeriveFont](../../aspose.page/itrfont/derivefont/#derivefont)(float) | 创建具有新大小的此字体的等价物。 |
| [DeriveFont](../../aspose.page/itrfont/derivefont/#derivefont_3)(FontStyle) | 创建具有新样式的此字体的等效项。 |
| [DeriveFont](../../aspose.page/itrfont/derivefont/#derivefont_2)(Matrix) | f character 使用新转换创建此字体的等效项。 |
| [DeriveFont](../../aspose.page/itrfont/derivefont/#derivefont_1)(float, FontStyle) | 创建具有新大小和样式的此字体的等效项。 |
| [GetCharWidth](../../aspose.page/itrfont/getcharwidth/)(char) | 返回字符的宽度。 |
| [GetOutline](../../aspose.page/itrfont/getoutline/)(char, float, float) | 返回指定位置的字形轮廓。 |

### 也可以看看

* 命名空间 [Aspose.Page](../../aspose.page/)
* 部件 [Aspose.Page](../../)


