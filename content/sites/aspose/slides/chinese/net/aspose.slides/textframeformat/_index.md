---
title: TextFrameFormat
second_title: Aspose.Slides for .NET API 参考
description: 包含 TextFrame 的 formatTextFrameFormatting 属性
type: docs
weight: 10150
url: /zh/net/aspose.slides/textframeformat/
---
## TextFrameFormat class

包含 TextFrame 的 formatTextFrameFormatting 属性。

```csharp
public class TextFrameFormat : PVIObject, IChartTextBlockFormat, ITextFrameFormat
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [TextFrameFormat](textframeformat)() | 初始化[`TextFrameFormat`](../textframeformat)类的新实例。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [AnchoringType](../../aspose.slides/textframeformat/anchoringtype) { get; set; } | 返回或设置 TextFrameEx 中的垂直锚文本。 读/写[`TextAnchorType`](../textanchortype)。 |
| [AsIPresentationComponent](../../aspose.slides/pviobject/asipresentationcomponent) { get; } | 允许获取基本 IPresentationComponent 接口。 只读[`IPresentationComponent`](../ipresentationcomponent)。 |
| [AutofitType](../../aspose.slides/textframeformat/autofittype) { get; set; } | 返回或设置文本的自动调整模式。 读/写[`TextAutofitType`](../textautofittype)。 |
| [CenterText](../../aspose.slides/textframeformat/centertext) { get; set; } | 如果 NullableBool.True 则文本应在框中水平居中。 读/写[`NullableBool`](../nullablebool)。 |
| [ColumnCount](../../aspose.slides/textframeformat/columncount) { get; set; } | 返回或设置文本区域的列数。 此值必须为正数。否则，该值将设置为零。 值 0 表示未定义的值。 读/写Int32。 |
| [ColumnSpacing](../../aspose.slides/textframeformat/columnspacing) { get; set; } | 返回或设置文本区域中文本列之间的间距（以磅为单位）。这应该只适用于 当存在超过 1 列时。 此值必须为正数。否则，该值将设置为零。 读/写Double。 |
| [KeepTextFlat](../../aspose.slides/textframeformat/keeptextflat) { get; set; } | 获取或设置即使应用了 3-D 旋转效果也保持文本平坦。 读/写Boolean。 |
| [MarginBottom](../../aspose.slides/textframeformat/marginbottom) { get; set; } | 返回或设置 TextFrame 中的下边距（点）。 读/写Double。 |
| [MarginLeft](../../aspose.slides/textframeformat/marginleft) { get; set; } | 返回或设置 TextFrame 中的左边距（点）。 读/写Double。 |
| [MarginRight](../../aspose.slides/textframeformat/marginright) { get; set; } | 返回或设置 TextFrame 中的右边距（点）。 读/写Double。 |
| [MarginTop](../../aspose.slides/textframeformat/margintop) { get; set; } | 返回或设置 TextFrame 中的上边距（点）。 读/写Double。 |
| [RotationAngle](../../aspose.slides/textframeformat/rotationangle) { get; set; } | 指定应用于边界框内文本的自定义旋转。如果未指定 ，则使用伴随形状的旋转。如果已指定，则为 独立于形状应用。也就是说，除了文本本身应用了旋转之外，形状还可以在 中应用旋转。 从该属性总结的可视文本旋转的结果值，并在属性 TextVerticalType 中预定义 垂直类型。 读/写Single。 |
| [TextVerticalType](../../aspose.slides/textframeformat/textverticaltype) { get; set; } | 确定文本方向。 从此属性和自定义角度 中的属性 RotationAngle 汇总的可视文本旋转的结果值。 读/写[`TextVerticalType`](../textverticaltype)。 |
| [ThreeDFormat](../../aspose.slides/textframeformat/threedformat) { get; } | 返回表示文本的 3d 效果属性的 ThreeDFormat 对象。 只读[`IThreeDFormat`](../ithreedformat)。 |
| [Transform](../../aspose.slides/textframeformat/transform) { get; set; } | 获取或设置文本环绕形状。 读/写[`TextShapeType`](../textshapetype)。 |
| [WrapText](../../aspose.slides/textframeformat/wraptext) { get; set; } | **True** 如果文本在 TextFrame 的边距处换行。 读/写[`NullableBool`](../nullablebool)。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| override [Equals](../../aspose.slides/pviobject/equals)(object) | 与指定对象比较。 |
| [GetEffective](../../aspose.slides/textframeformat/geteffective)() | 获取应用了继承的有效文本框架格式数据。 |
| override [GetHashCode](../../aspose.slides/pviobject/gethashcode)() | 返回哈希码。 |

### 也可以看看

* class [PVIObject](../pviobject)
* interface [IChartTextBlockFormat](../../aspose.slides.charts/icharttextblockformat)
* interface [ITextFrameFormat](../itextframeformat)
* 命名空间 [Aspose.Slides](../../aspose.slides)
* 部件 [Aspose.Slides](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
