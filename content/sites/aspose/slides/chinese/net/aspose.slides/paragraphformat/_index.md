---
title: ParagraphFormat
second_title: Aspose.Slides for .NET API 参考
description: 此类包含段落格式属性与IParagraphFormatEffectiveData./iparagraphformateffectivedata不同此类的所有属性都是可写的
type: docs
weight: 8580
url: /zh/net/aspose.slides/paragraphformat/
---
## ParagraphFormat class

此类包含段落格式属性。与[`IParagraphFormatEffectiveData`](../iparagraphformateffectivedata)不同，此类的所有属性都是可写的。

```csharp
public class ParagraphFormat : PVIObject, IChartParagraphFormat, IParagraphFormat
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [ParagraphFormat](paragraphformat)() | 初始化[`ParagraphFormat`](../paragraphformat)类的新实例。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [Alignment](../../aspose.slides/paragraphformat/alignment) { get; set; } | 返回或设置没有继承的段落中的文本对齐方式。 读/写[`TextAlignment`](../textalignment)。 |
| [AsIPresentationComponent](../../aspose.slides/pviobject/asipresentationcomponent) { get; } | 允许获取基本 IPresentationComponent 接口。 只读[`IPresentationComponent`](../ipresentationcomponent)。 |
| [DefaultTabSize](../../aspose.slides/paragraphformat/defaulttabsize) { get; set; } | 返回或设置不继承的默认制表大小。 读/写Single。 |
| [EastAsianLineBreak](../../aspose.slides/paragraphformat/eastasianlinebreak) { get; set; } | 确定段落中是否使用东亚换行符。未应用继承。 读/写[`NullableBool`](../nullablebool)。 |
| [FontAlignment](../../aspose.slides/paragraphformat/fontalignment) { get; set; } | 在没有继承的段落中返回或设置字体对齐方式。 读/写[`FontAlignment`](../fontalignment)。 |
| [HangingPunctuation](../../aspose.slides/paragraphformat/hangingpunctuation) { get; set; } | 确定段落中是否使用悬挂标点。未应用继承。 读/写[`NullableBool`](../nullablebool)。 |
| [Indent](../../aspose.slides/paragraphformat/indent) { get; set; } | 返回或设置段落首行缩进/悬挂缩进，无继承。悬挂缩进可以用负值定义。 读/写Single。 |
| [LatinLineBreak](../../aspose.slides/paragraphformat/latinlinebreak) { get; set; } | 确定段落中是否使用拉丁换行符。未应用继承。 读/写[`NullableBool`](../nullablebool)。 |
| [MarginLeft](../../aspose.slides/paragraphformat/marginleft) { get; set; } | 返回或设置没有继承的段落的左边距。 读/写Single。 |
| [MarginRight](../../aspose.slides/paragraphformat/marginright) { get; set; } | 返回或设置没有继承的段落的右边距。 读/写Single。 |
| [RightToLeft](../../aspose.slides/paragraphformat/righttoleft) { get; set; } | 确定段落中是否使用从右到左书写。未应用继承。 读/写[`NullableBool`](../nullablebool)。 |
| [SpaceAfter](../../aspose.slides/paragraphformat/spaceafter) { get; set; } | 返回或设置没有继承的段落中最后一行之后的空格量。 正值指定空白应该是字体大小的百分比。 负值以磅为单位指定空白的大小。 读/写Single。 |
| [SpaceBefore](../../aspose.slides/paragraphformat/spacebefore) { get; set; } | 返回或设置没有继承的段落中第一行之前的空格量。 正值指定空白应该是字体大小的百分比。 负值以磅为单位指定空白的大小。 读/写Single。 |
| [SpaceWithin](../../aspose.slides/paragraphformat/spacewithin) { get; set; } | 返回或设置段落中基线之间的空间量。正值表示百分比，负值表示以点为单位的大小。未应用继承。 读/写Single。 |
| [Tabs](../../aspose.slides/paragraphformat/tabs) { get; } | 返回段落的列表。未应用继承。 只读[`ITabCollection`](../itabcollection)。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| override [Equals](../../aspose.slides/pviobject/equals)(object) | 与指定对象比较。 |
| [GetEffective](../../aspose.slides/paragraphformat/geteffective)() | 获取应用了继承的有效段落格式数据。 |
| override [GetHashCode](../../aspose.slides/pviobject/gethashcode)() | 返回哈希码。 |

### 评论

此类用于返回和操作为特定段落定义的段落格式属性。这意味着 在获取值时不应用继承，因此在大多数情况下，您将获得意味着“未定义”的值。

为了获得包括继承在内的有效格式化参数值，您需要使用[`GetEffective`](./geteffective)方法 返回一个[`IParagraphFormatEffectiveData`](../iparagraphformateffectivedata)实例。

### 也可以看看

* class [PVIObject](../pviobject)
* interface [IChartParagraphFormat](../../aspose.slides.charts/ichartparagraphformat)
* interface [IParagraphFormat](../iparagraphformat)
* 命名空间 [Aspose.Slides](../../aspose.slides)
* 部件 [Aspose.Slides](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
