---
title: Class DrFont
second_title: Aspose.Page for .NET API 参考
description: Aspose.Page.Font.DrFont 班级. 使用此类而不是 GDI Font
type: docs
weight: 220
url: /zh/net/aspose.page.font/drfont/
---
## DrFont class

使用此类而不是 GDI+ Font

```csharp
public class DrFont
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| [AscentLis](../../aspose.page.font/drfont/ascentlis/) { get; } | 此字体 (lis) 的单元格上升。 这是从单元格顶部到单元格基线的垂直距离。 |
| [AscentPoints](../../aspose.page.font/drfont/ascentpoints/) { get; } | 返回以点为单位的单元格上升。 |
| [CellHeightLis](../../aspose.page.font/drfont/cellheightlis/) { get; } | 返回此字体 (lis) 的单元格高度。 这是[`AscentLis`](./ascentlis/)+[`DescentLis`](./descentlis/). |
| [CellHeightPoints](../../aspose.page.font/drfont/cellheightpoints/) { get; } | 的快捷方式[`AscentPoints`](./ascentpoints/)+[`DescentPoints`](./descentpoints/). |
| [DescentLis](../../aspose.page.font/drfont/descentlis/) { get; } | 此字体 (lis) 的单元格下降。 这是从单元格底部到单元格基线的垂直距离。 |
| [DescentPoints](../../aspose.page.font/drfont/descentpoints/) { get; } | 返回以点为单位的细胞下降。 |
| [FamilyName](../../aspose.page.font/drfont/familyname/) { get; } | 获取此字体的名称。 |
| [IsBold](../../aspose.page.font/drfont/isbold/) { get; } | 获取一个值，指示此实例是否为粗体。 |
| [IsItalic](../../aspose.page.font/drfont/isitalic/) { get; } | 获取一个值，指示此实例是否为斜体。 |
| [LeadingLis](../../aspose.page.font/drfont/leadinglis/) { get; } | 返回此字体 (lis) 的前导。 这是[`LineSpacingLis`](./linespacinglis/)-[`CellHeightLis`](./cellheightlis/). |
| [LeadingPoints](../../aspose.page.font/drfont/leadingpoints/) { get; } | 返回此字体 (lis) 的前导。 这是[`LineSpacingLis`](./linespacinglis/)-[`CellHeightLis`](./cellheightlis/). |
| [LineSpacingLis](../../aspose.page.font/drfont/linespacinglis/) { get; } | 返回此字体 (lis) 的单元格间距。 这是两个字形基线之间的垂直距离。 |
| [LineSpacingPoints](../../aspose.page.font/drfont/linespacingpoints/) { get; } | 返回此字体的单元格间距（点）。 这是两个字形基线之间的垂直距离。 |
| [SizePoints](../../aspose.page.font/drfont/sizepoints/) { get; set; } | 获取此字体的大小（点）。 |
| [SmallCapsScaleFactor](../../aspose.page.font/drfont/smallcapsscalefactor/) { get; } | 获取 SmallCaps 比例因子。 |
| [Style](../../aspose.page.font/drfont/style/) { get; } | 获取此字体的样式。 |
| [StyleEx](../../aspose.page.font/drfont/styleex/) { get; set; } | 此属性包含有关字体样式的附加信息 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| override [Equals](../../aspose.page.font/drfont/equals/)(object) | 判断指定的是否Object 等于这个实例. |
| [GetCharWidthLis](../../aspose.page.font/drfont/getcharwidthlis/)(char) | 获取字符宽度 lis. |
| [GetCharWidthPoints](../../aspose.page.font/drfont/getcharwidthpoints/)(char) | 返回字符的宽度（点）。 |
| override [GetHashCode](../../aspose.page.font/drfont/gethashcode/)() | 返回此实例的哈希码。 |
| [GetTextSizePoints](../../aspose.page.font/drfont/gettextsizepoints/)(string) | 以磅为单位返回文本的测量文本框。 |
| [GetTextWidthLis](../../aspose.page.font/drfont/gettextwidthlis/)(string) | 获取文字宽度lis. |
| [GetTextWidthPoints](../../aspose.page.font/drfont/gettextwidthpoints/#gettextwidthpoints)(string) | 获取文本宽度点数。 |
| [GetTextWidthPoints](../../aspose.page.font/drfont/gettextwidthpoints/#gettextwidthpoints_1)(string, int, int) | 获取文本宽度点数。 |
| [Replace](../../aspose.page.font/drfont/replace/)(DrFont) | 替换字体内容 |
| static [IsPoorlyRenderedByGdiPlus](../../aspose.page.font/drfont/ispoorlyrenderedbygdiplus/)(string) | 为“Microsoft Sans Serif”字体返回 True。 GDI+ 渲染效果很差。参见 Test286 和 Gemini-6959. |

### 也可以看看

* 命名空间 [Aspose.Page.Font](../../aspose.page.font/)
* 部件 [Aspose.Page](../../)


