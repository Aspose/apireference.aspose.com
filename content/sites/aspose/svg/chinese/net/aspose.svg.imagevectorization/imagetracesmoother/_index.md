---
title: Class ImageTraceSmoother
second_title: Aspose.SVG for .NET API 参考
description: Aspose.Svg.ImageVectorization.ImageTraceSmoother 班级. ImageTraceSimplifier 类负责平滑由一系列跟踪点近似的曲线中的点数 此类实现最近邻方法
type: docs
weight: 2130
url: /zh/net/aspose.svg.imagevectorization/imagetracesmoother/
---
## ImageTraceSmoother class

ImageTraceSimplifier 类负责平滑由一系列跟踪点近似的曲线中的点数。 此类实现最近邻方法。

```csharp
public class ImageTraceSmoother : IImageTraceSmoother
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [ImageTraceSmoother](imagetracesmoother/#constructor)() | 初始化一个新的实例`ImageTraceSmoother`类. |
| [ImageTraceSmoother](imagetracesmoother/#constructor_1)(int) | 初始化一个新的实例`ImageTraceSmoother`类. |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [Extent](../../aspose.svg.imagevectorization/imagetracesmoother/extent/) { get; set; } | 获取查询点所考虑区域的集合范围。 它必须在 1 到 20 的范围内。任何更高或更低的值将相应地与该范围的最小值和最大值对齐。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| virtual [Smooth](../../aspose.svg.imagevectorization/imagetracesmoother/smooth/)(IEnumerable&lt;PointF&gt;) | 平滑轨迹。 |

### 也可以看看

* interface [IImageTraceSmoother](../iimagetracesmoother/)
* 命名空间 [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* 部件 [Aspose.SVG](../../)


