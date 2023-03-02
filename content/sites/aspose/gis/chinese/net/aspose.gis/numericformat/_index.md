---
title: Class NumericFormat
second_title: Aspose.GIS for .NET API 参考
description: Aspose.Gis.NumericFormat 班级. NumericFormat用于格式化文本中常见的数字类型
type: docs
weight: 1290
url: /zh/net/aspose.gis/numericformat/
---
## NumericFormat class

`NumericFormat`用于格式化文本中常见的数字类型。

```csharp
public abstract class NumericFormat
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| static [RoundTrip](../../aspose.gis/numericformat/roundtrip/) { get; } | 转换并尝试确保将转换为 字符串的数值解析回相同的数值。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| static [Flat](../../aspose.gis/numericformat/flat/)(int) | 将数字转换为不带科学记数法的定点文本。 |
| static [General](../../aspose.gis/numericformat/general/)(int) | 将数字转换为更紧凑的定点或科学计数法， 取决于数字的类型以及是否存在精度说明符。推荐使用. |

### 评论

一共有三种类型`NumericFormat`: 一般 - 定点或科学记数法。一些数字很重要。 RoundTrip - 定点或科学记数法。最大位数很重要。 Flat - 定点表示法。一些数字很重要。 一个`NumericFormat`可以设置为[`IGeometry`](../../aspose.gis.geometries/igeometry/)通过[`AsText`](../../aspose.gis.geometries/igeometry/astext/) 以便在将几何图形转换为其 Well-Known Text (WKT) 表示时指定数字格式。

### 也可以看看

* 命名空间 [Aspose.Gis](../../aspose.gis/)
* 部件 [Aspose.GIS](../../)


