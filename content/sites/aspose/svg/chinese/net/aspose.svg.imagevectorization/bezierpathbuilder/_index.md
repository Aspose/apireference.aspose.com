---
title: Class BezierPathBuilder
second_title: Aspose.SVG for .NET API 参考
description: Aspose.Svg.ImageVectorization.BezierPathBuilder 班级. 的SplinePathBuilder类负责构建路径段SVGPathSeg来自跟踪点列表 此路径构建器基于使用最小二乘法来查找点跟踪的贝塞尔控制点
type: docs
weight: 2080
url: /zh/net/aspose.svg.imagevectorization/bezierpathbuilder/
---
## BezierPathBuilder class

的[`SplinePathBuilder`](../splinepathbuilder/)类负责构建路径段[`SVGPathSeg`](../../aspose.svg.paths/svgpathseg/)来自跟踪点列表。 此路径构建器基于使用最小二乘法来查找点跟踪的贝塞尔控制点。

```csharp
public class BezierPathBuilder : IPathBuilder
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [BezierPathBuilder](bezierpathbuilder/)() | 初始化一个新的实例`BezierPathBuilder`类. |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [ErrorThreshold](../../aspose.svg.imagevectorization/bezierpathbuilder/errorthreshold/) { get; set; } | 获取或设置误差阈值。 此参数定义点与拟合曲线的最大偏差。 默认为 30. |
| [MaxIterations](../../aspose.svg.imagevectorization/bezierpathbuilder/maxiterations/) { get; set; } | 获取或设置误差阈值。 该参数定义最小二乘近似法的迭代次数。 默认为 30. |
| [TraceSmoother](../../aspose.svg.imagevectorization/bezierpathbuilder/tracesmoother/) { get; set; } | 获取或设置轨迹平滑器。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [Build](../../aspose.svg.imagevectorization/bezierpathbuilder/build/)(IEnumerable&lt;PointF&gt;, SVGPathElement) | 从跟踪点列表构建路径段。 |

### 也可以看看

* interface [IPathBuilder](../ipathbuilder/)
* 命名空间 [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* 部件 [Aspose.SVG](../../)


