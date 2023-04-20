---
title: Class ImageTraceSimplifier
second_title: Aspose.SVG for .NET API 参考
description: Aspose.Svg.ImageVectorization.ImageTraceSimplifier 班级. ImageTraceSimplifier 类负责减少由一系列跟踪点近似的曲线中的点数
type: docs
weight: 2120
url: /zh/net/aspose.svg.imagevectorization/imagetracesimplifier/
---
## ImageTraceSimplifier class

ImageTraceSimplifier 类负责减少由一系列跟踪点近似的曲线中的点数。

```csharp
public class ImageTraceSimplifier : IImageTraceSimplifier
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [ImageTraceSimplifier](imagetracesimplifier/#constructor)() | 初始化一个新的实例`ImageTraceSimplifier`类. |
| [ImageTraceSimplifier](imagetracesimplifier/#constructor_1)(float) | 初始化一个新的实例`ImageTraceSimplifier`类. |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [Tolerance](../../aspose.svg.imagevectorization/imagetracesimplifier/tolerance/) { get; set; } | 公差值决定了允许从迹线中消除的点的最大误差公差。 它必须在 0 到 4 的范围内。任何更高或更低的值将相应地与该范围的最小值和最大值对齐。 默认值为 0.3. |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [Simplify](../../aspose.svg.imagevectorization/imagetracesimplifier/simplify/)(IEnumerable&lt;PointF&gt;) | 减少跟踪点列表中的点数。 |

### 也可以看看

* interface [IImageTraceSimplifier](../iimagetracesimplifier/)
* 命名空间 [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* 部件 [Aspose.SVG](../../)


