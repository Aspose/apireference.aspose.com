---
title: Class XpsGlyphs
second_title: Aspose.Page for .NET API 参考
description: Aspose.Page.XPS.XpsModel.XpsGlyphs 班级. 封装 Glyphs 元素特性的类 此元素表示来自单一字体的一系列统一格式的文本 它提供准确呈现所需的信息并支持 search 和查看消费者中的选择功能
type: docs
weight: 3100
url: /zh/net/aspose.page.xps.xpsmodel/xpsglyphs/
---
## XpsGlyphs class

封装 Glyphs 元素特性的类。 此元素表示来自单一字体的一系列统一格式的文本。 它提供准确呈现所需的信息，并支持 search 和查看消费者中的选择功能。

```csharp
public sealed class XpsGlyphs : XpsContentElement
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| [BidiLevel](../../aspose.page.xps.xpsmodel/xpsglyphs/bidilevel/) { get; set; } | 返回/设置指定 Unicode 算法双向嵌套级别的值。 偶数表示从左到右布局，奇数表示从右到左布局。 从右到左布局将运行原点放在右侧第一个字形的 具有正的前进宽度（表示向左前进）将后续 字形放置在前一个字形的左侧。 |
| [Clip](../../aspose.page.xps.xpsmodel/xpscontentelement/clip/) { get; set; } | 返回/设置限制元素渲染区域的路径几何实例。 |
| [Count](../../aspose.page.xps.xpsmodel/xpselement/count/) { get; } | 返回子元素的数量。 |
| [Fill](../../aspose.page.xps.xpsmodel/xpsglyphs/fill/) { get; set; } | 返回/设置用于填充渲染字形形状的画笔。 |
| [Font](../../aspose.page.xps.xpsmodel/xpsglyphs/font/) { get; } | 返回用于排版元素文本的 TrueType 字体的字体资源。 |
| [FontRenderingEmSize](../../aspose.page.xps.xpsmodel/xpsglyphs/fontrenderingemsize/) { get; set; } | 返回/设置绘图表面单位的字体大小，以有效坐标空间的单位表示为 float 。 |
| [HyperlinkTarget](../../aspose.page.xps.xpsmodel/xpshyperlinkelement/hyperlinktarget/) { get; set; } | 返回/设置超链接目标对象。 |
| [IsSideways](../../aspose.page.xps.xpsmodel/xpsglyphs/issideways/) { get; set; } | 返回/设置指示字形翻转的值， 原点定义为未翻转字形的顶部中心。 |
| [Item](../../aspose.page.xps.xpsmodel/xpselement/item/) { get; } | 通过索引提供对元素子元素的访问*i*. |
| [Opacity](../../aspose.page.xps.xpsmodel/xpscontentelement/opacity/) { get; set; } | 返回/设置定义元素均匀透明度的值。 |
| [OpacityMask](../../aspose.page.xps.xpsmodel/xpscontentelement/opacitymask/) { get; set; } | 返回/设置指定 alpha 值掩码 的画笔，它以与不透明度属性 相同的方式应用于元素，但允许元素的不同区域使用不同的 alpha 值。 |
| [OriginX](../../aspose.page.xps.xpsmodel/xpsglyphs/originx/) { get; set; } | 返回/设置运行中第一个字形的 x 坐标， 以有效坐标空间为单位。 |
| [OriginY](../../aspose.page.xps.xpsmodel/xpsglyphs/originy/) { get; set; } | 返回/设置运行中第一个字形的 y 坐标， 以有效坐标空间为单位。 |
| [RenderTransform](../../aspose.page.xps.xpsmodel/xpscontentelement/rendertransform/) { get; set; } | 返回/设置仿射变换矩阵，为元素的所有属性和所有子元素（如果有）建立新的坐标 frame 。 |
| [StyleSimulations](../../aspose.page.xps.xpsmodel/xpsglyphs/stylesimulations/) { get; set; } | 返回/设置指定样式模拟的值。 |
| [UnicodeString](../../aspose.page.xps.xpsmodel/xpsglyphs/unicodestring/) { get; set; } | 返回/设置由 Glyphs 元素呈现的文本字符串。 文本被指定为 Unicode 代码点。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [Clone](../../aspose.page.xps.xpsmodel/xpsglyphs/clone/)() | 克隆这个字形。 |
| [GetEnumerator](../../aspose.page.xps.xpsmodel/xpselement/getenumerator/)() | 实施IEnumerable接口. |

### 也可以看看

* class [XpsContentElement](../xpscontentelement/)
* 命名空间 [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* 部件 [Aspose.Page](../../)


