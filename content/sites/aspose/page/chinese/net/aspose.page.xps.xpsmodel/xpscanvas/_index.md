---
title: Class XpsCanvas
second_title: Aspose.Page for .NET API 参考
description: Aspose.Page.XPS.XpsModel.XpsCanvas 班级. Class incapsulating Canvas element features. 该元素将元素组合在一起例如字形和路径元素 可以在画布中分组以便被识别为一个单元作为超链接目标或 以将组合属性值应用于每个子元素和祖先元素
type: docs
weight: 2970
url: /zh/net/aspose.page.xps.xpsmodel/xpscanvas/
---
## XpsCanvas class

Class incapsulating Canvas element features. 该元素将元素组合在一起。例如，字形和路径元素 可以在画布中分组，以便被识别为一个单元（作为超链接目标）或 以将组合属性值应用于每个子元素和祖先元素。

```csharp
public sealed class XpsCanvas : XpsContentElement
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| [Clip](../../aspose.page.xps.xpsmodel/xpscontentelement/clip/) { get; set; } | 返回/设置限制元素渲染区域的路径几何实例。 |
| [Count](../../aspose.page.xps.xpsmodel/xpselement/count/) { get; } | 返回子元素的数量。 |
| [EdgeMode](../../aspose.page.xps.xpsmodel/xpscanvas/edgemode/) { get; set; } | 返回/设置控制画布内路径边缘如何呈现的值。 |
| [HyperlinkTarget](../../aspose.page.xps.xpsmodel/xpshyperlinkelement/hyperlinktarget/) { get; set; } | 返回/设置超链接目标对象。 |
| [Item](../../aspose.page.xps.xpsmodel/xpselement/item/) { get; } | 通过索引提供对元素子元素的访问*i*. |
| [Opacity](../../aspose.page.xps.xpsmodel/xpscontentelement/opacity/) { get; set; } | 返回/设置定义元素均匀透明度的值。 |
| [OpacityMask](../../aspose.page.xps.xpsmodel/xpscontentelement/opacitymask/) { get; set; } | 返回/设置指定 alpha 值掩码 的画笔，它以与不透明度属性 相同的方式应用于元素，但允许元素的不同区域使用不同的 alpha 值。 |
| [RenderTransform](../../aspose.page.xps.xpsmodel/xpscontentelement/rendertransform/) { get; set; } | 返回/设置仿射变换矩阵，为元素的所有属性和所有子元素（如果有）建立新的坐标 frame 。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [Add&lt;T&gt;](../../aspose.page.xps.xpsmodel/xpscanvas/add/)(T) | 向此画布的子列表添加一个元素。 |
| [AddCanvas](../../aspose.page.xps.xpsmodel/xpscanvas/addcanvas/)() | 将新画布添加到该画布的子列表中。 |
| [AddGlyphs](../../aspose.page.xps.xpsmodel/xpscanvas/addglyphs/)(string, float, FontStyle, float, float, string) | 将新字形添加到此画布的子列表中。 |
| [AddPath](../../aspose.page.xps.xpsmodel/xpscanvas/addpath/)(XpsPathGeometry) | 向该画布的子列表添加新路径。 |
| [Clone](../../aspose.page.xps.xpsmodel/xpscanvas/clone/)() | 克隆此画布。 |
| [GetEnumerator](../../aspose.page.xps.xpsmodel/xpselement/getenumerator/)() | 实施IEnumerable接口. |
| [Insert&lt;T&gt;](../../aspose.page.xps.xpsmodel/xpscanvas/insert/)(int, T) | 将元素插入此画布的子列表中*index*位置. |
| [InsertCanvas](../../aspose.page.xps.xpsmodel/xpscanvas/insertcanvas/)(int) | 将新画布插入此画布的子列表中*index*位置. |
| [InsertGlyphs](../../aspose.page.xps.xpsmodel/xpscanvas/insertglyphs/)(int, string, float, FontStyle, float, float, string) | 将新字形插入此画布的子列表中*index*位置. |
| [InsertPath](../../aspose.page.xps.xpsmodel/xpscanvas/insertpath/)(int, XpsPathGeometry) | 在此画布的子列表中插入一个新路径*index*位置. |

### 也可以看看

* class [XpsContentElement](../xpscontentelement/)
* 命名空间 [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* 部件 [Aspose.Page](../../)


