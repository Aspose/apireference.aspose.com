---
title: Class PrecisionModel
second_title: Aspose.GIS for .NET API 参考
description: Aspose.Gis.PrecisionModel 班级. PrecisionModel指定坐标中有效数字的数量
type: docs
weight: 1310
url: /zh/net/aspose.gis/precisionmodel/
---
## PrecisionModel class

`PrecisionModel`指定坐标中有效数字的数量。

```csharp
public abstract class PrecisionModel : IEquatable<PrecisionModel>
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| static [Exact](../../aspose.gis/precisionmodel/exact/) { get; } | 返回精确精度模型。 根据精确精度模型，double 值中的所有数字都是重要的。 |
| [IsExact](../../aspose.gis/precisionmodel/isexact/) { get; } | 获取一个值，指示此精度模型是否准确。 |
| [IsRounding](../../aspose.gis/precisionmodel/isrounding/) { get; } | 获取一个值，指示此精度模型是否舍入。 |
| abstract [SignificantDigits](../../aspose.gis/precisionmodel/significantdigits/) { get; } | 如果是四舍五入，则获取精度模型中的有效数字位数。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| static [Rounding](../../aspose.gis/precisionmodel/rounding/)(int) | 返回舍入精度模型。 根据舍入精度模型，只有有限数量的数字是重要的。 |
| override [Equals](../../aspose.gis/precisionmodel/equals/#equals_1)(object) | 指示当前对象是否等于同一类型的另一个对象。 |
| [Equals](../../aspose.gis/precisionmodel/equals/#equals)(PrecisionModel) | 指示当前对象是否等于同一类型的另一个对象。 |
| override [GetHashCode](../../aspose.gis/precisionmodel/gethashcode/)() | 用作默认哈希函数。 |
| [operator ==](../../aspose.gis/precisionmodel/op_equality/) | 实现运算符 ==. |
| [operator !=](../../aspose.gis/precisionmodel/op_inequality/) | 实现运算符 !=. |

### 评论

PrecisionModel有两种： 精确的`PrecisionModel`（所有数字均有效）；圆形`PrecisionModel`（一些数字很重要）。 一个`PrecisionModel`可以设置为[`VectorLayer`](../vectorlayer/)通过[`DriverOptions`](../driveroptions/) 以便在写入或读取几何图形时舍入坐标。

### 也可以看看

* property [XYPrecisionModel](../driveroptions/xyprecisionmodel/)
* property [ZPrecisionModel](../driveroptions/zprecisionmodel/)
* property [MPrecisionModel](../driveroptions/mprecisionmodel/)
* 命名空间 [Aspose.Gis](../../aspose.gis/)
* 部件 [Aspose.GIS](../../)


