---
title: Class PdfDevice.PdfGraphicContext
second_title: Aspose.SVG for .NET API 参考
description: Aspose.Svg.Rendering.Pdf.PdfDevicePdfGraphicContext 班级. 保存 PdfDevice 的当前图形控制参数 这些参数定义了图形运算符执行的全局框架
type: docs
weight: 2960
url: /zh/net/aspose.svg.rendering.pdf/pdfdevice.pdfgraphiccontext/
---
## PdfDevice.PdfGraphicContext class

保存 PdfDevice 的当前图形控制参数。 这些参数定义了图形运算符执行的全局框架。

```csharp
public class PdfGraphicContext : GraphicContext
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [PdfGraphicContext](pdfgraphiccontext/)() | 默认构造函数。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| virtual [CharacterSpacing](../../aspose.svg.rendering/graphiccontext/characterspacing/) { get; set; } | 设置或获取字符间距。 |
| override [FillBrush](../../aspose.svg.rendering.pdf/pdfgraphiccontext/fillbrush/) { get; set; } | 设置或获取用于填充路径内部的画笔对象。 |
| virtual [Font](../../aspose.svg.rendering/graphiccontext/font/) { get; set; } | 设置或获取用于呈现文本的真实字体对象。 |
| virtual [FontSize](../../aspose.svg.rendering/graphiccontext/fontsize/) { get; set; } | 设置或获取文本字体大小。 |
| virtual [FontStyle](../../aspose.svg.rendering/graphiccontext/fontstyle/) { get; set; } | 设置或获取文本字体样式。 |
| override [LineCap](../../aspose.svg.rendering.pdf/pdfgraphiccontext/linecap/) { get; set; } | 设置或获取指定任何被描边的开放路径的端点形状的代码。 |
| virtual [LineDashOffset](../../aspose.svg.rendering/graphiccontext/linedashoffset/) { get; set; } | 设置或获取当前虚线模式的相位偏移。 |
| virtual [LineDashPattern](../../aspose.svg.rendering/graphiccontext/linedashpattern/) { get; set; } | 设置或获取描边路径时要使用的破折号模式的描述。 |
| virtual [LineDashStyle](../../aspose.svg.rendering/graphiccontext/linedashstyle/) { get; set; } | Sets of 获取描边路径的虚线样式。 |
| override [LineJoin](../../aspose.svg.rendering.pdf/pdfgraphiccontext/linejoin/) { get; set; } | 设置或获取指定描边路径的连接段之间关节形状的代码。 |
| override [LineWidth](../../aspose.svg.rendering.pdf/pdfgraphiccontext/linewidth/) { get; set; } | 设置或获取要描边的路径的厚度。 |
| override [MiterLimit](../../aspose.svg.rendering.pdf/pdfgraphiccontext/miterlimit/) { get; set; } | 设置或获取描边路径的斜接线连接的最大长度。 此参数限制线段以锐角连接时产生的“尖峰”长度。 |
| override [StrokeBrush](../../aspose.svg.rendering.pdf/pdfgraphiccontext/strokebrush/) { get; set; } | 设置或获取用于描边路径的画笔对象。 |
| virtual [TextInfo](../../aspose.svg.rendering/graphiccontext/textinfo/) { get; } | 得到一个[`TextInfo`](../../aspose.svg.rendering/textinfo/)包含有关渲染文本信息的对象。 |
| override [TransformationMatrix](../../aspose.svg.rendering.pdf/pdfgraphiccontext/transformationmatrix/) { get; set; } | 设置或获取转换矩阵。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| override [Clone](../../aspose.svg.rendering.pdf/pdfgraphiccontext/clone/)() | 创建与现有实例具有相同属性值的类的新实例。 |
| override [Transform](../../aspose.svg.rendering.pdf/pdfgraphiccontext/transform/)(Matrix) | 乘以指定矩阵修改当前变换矩阵 |

### 也可以看看

* class [GraphicContext](../../aspose.svg.rendering/graphiccontext/)
* class [PdfDevice](../pdfdevice/)
* 命名空间 [Aspose.Svg.Rendering.Pdf](../../aspose.svg.rendering.pdf/)
* 部件 [Aspose.SVG](../../)


