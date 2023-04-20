---
title: Class SplinePathBuilder
second_title: Aspose.SVG for .NET API 参考
description: Aspose.Svg.ImageVectorization.SplinePathBuilder 班级. 的SplinePathBuilder类负责构建路径段SVGPathSeg来自跟踪点列表 此路径构建器基于将 CatmullRoma 样条应用于一组平滑和减少的路径点..
type: docs
weight: 2160
url: /zh/net/aspose.svg.imagevectorization/splinepathbuilder/
---
## SplinePathBuilder class

的`SplinePathBuilder`类负责构建路径段[`SVGPathSeg`](../../aspose.svg.paths/svgpathseg/)来自跟踪点列表。 此路径构建器基于将 Catmull-Roma 样条应用于一组平滑和减少的路径点..

```csharp
public class SplinePathBuilder : IPathBuilder
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [SplinePathBuilder](splinepathbuilder/#constructor)() | 初始化一个新的实例`SplinePathBuilder`类. |
| [SplinePathBuilder](splinepathbuilder/#constructor_2)(float) | 初始化一个新的实例`SplinePathBuilder`类. |
| [SplinePathBuilder](splinepathbuilder/#constructor_1)(IImageTraceSmoother, IImageTraceSimplifier, float) | 初始化一个新的实例`SplinePathBuilder`类. |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [Tension](../../aspose.svg.imagevectorization/splinepathbuilder/tension/) { get; set; } | 张力值影响曲线在（插值）控制点处弯曲的程度。 它必须在 0 到 1 的范围内。任何更高或更低的值都将与该范围的最小值和最大值对齐，因此. |
| [TraceSimplifier](../../aspose.svg.imagevectorization/splinepathbuilder/tracesimplifier/) { get; set; } | 获取或设置跟踪简化器。 |
| [TraceSmoother](../../aspose.svg.imagevectorization/splinepathbuilder/tracesmoother/) { get; set; } | 获取或设置轨迹平滑器。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [Build](../../aspose.svg.imagevectorization/splinepathbuilder/build/)(IEnumerable&lt;PointF&gt;, SVGPathElement) | 从跟踪点列表构建路径段。 |

### 也可以看看

* interface [IPathBuilder](../ipathbuilder/)
* 命名空间 [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* 部件 [Aspose.SVG](../../)


