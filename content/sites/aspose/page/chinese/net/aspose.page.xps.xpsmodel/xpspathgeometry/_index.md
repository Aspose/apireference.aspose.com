---
title: Class XpsPathGeometry
second_title: Aspose.Page for .NET API 参考
description: Aspose.Page.XPS.XpsModel.XpsPathGeometry 班级. 封装 PathGeometry 属性元素特征的类 此元素包含一组路径图这些路径图使用 Figures 属性指定或者 带有子 PathFigure 元素
type: docs
weight: 3280
url: /zh/net/aspose.page.xps.xpsmodel/xpspathgeometry/
---
## XpsPathGeometry class

封装 PathGeometry 属性元素特征的类。 此元素包含一组路径图，这些路径图使用 Figures 属性指定，或者 带有子 PathFigure 元素。

```csharp
public sealed class XpsPathGeometry : XpsArray<XpsPathFigure>
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| [Count](../../aspose.page.xps.xpsmodel/xpsarray-1/count/) { get; } |  |
| [FillRule](../../aspose.page.xps.xpsmodel/xpspathgeometry/fillrule/) { get; set; } | 返回/设置指定几何 形状的交叉区域如何组合形成区域的值。 |
| [Item](../../aspose.page.xps.xpsmodel/xpsarray-1/item/) { get; } |  |
| [PathFigures](../../aspose.page.xps.xpsmodel/xpspathgeometry/pathfigures/) { get; } | 返回子路径图形列表。 |
| [Transform](../../aspose.page.xps.xpsmodel/xpspathgeometry/transform/) { get; set; } | 返回/设置仿射变换矩阵建立局部矩阵 transformation 在使用 用于填充、剪裁或描边之前应用于路径几何的所有子元素和后代元素。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmodel/xpsarray-1/add/)(XpsPathFigure) |  |
| [AddSegment](../../aspose.page.xps.xpsmodel/xpspathgeometry/addsegment/)(XpsPathSegment) | 将路径段添加到最后一个 pah 图的子段列表中。 |
| [Clone](../../aspose.page.xps.xpsmodel/xpspathgeometry/clone/)() | 克隆此路径几何图形。 |
| [Insert](../../aspose.page.xps.xpsmodel/xpsarray-1/insert/)(int, XpsPathFigure) |  |
| [InsertSegment](../../aspose.page.xps.xpsmodel/xpspathgeometry/insertsegment/)(int, XpsPathSegment) | 将路径段插入到 的最后一个路径图形的子段列表中*index*位置. |
| [Remove](../../aspose.page.xps.xpsmodel/xpsarray-1/remove/)(XpsPathFigure) |  |
| [RemoveAt](../../aspose.page.xps.xpsmodel/xpsarray-1/removeat/)(int) |  |
| [RemoveSegment](../../aspose.page.xps.xpsmodel/xpspathgeometry/removesegment/)(XpsPathSegment) | 从最后一个路径图形的子段列表中删除路径段。 |
| [RemoveSegmentAt](../../aspose.page.xps.xpsmodel/xpspathgeometry/removesegmentat/)(int) | 从 的最后一个路径图形的子段列表中删除路径段*index*位置. |

### 也可以看看

* class [XpsArray&lt;T&gt;](../xpsarray-1/)
* class [XpsPathFigure](../xpspathfigure/)
* 命名空间 [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* 部件 [Aspose.Page](../../)


