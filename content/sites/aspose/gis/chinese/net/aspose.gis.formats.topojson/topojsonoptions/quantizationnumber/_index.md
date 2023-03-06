---
title: TopoJsonOptions.QuantizationNumber
second_title: Aspose.GIS for .NET API 参考
description: TopoJsonOptions 财产. 指定用于量化输出 TopoJSON 中的坐标和增量编码弧的量化编号
type: docs
weight: 50
url: /zh/net/aspose.gis.formats.topojson/topojsonoptions/quantizationnumber/
---
## TopoJsonOptions.QuantizationNumber property

指定用于量化输出 TopoJSON 中的坐标和增量编码弧的量化编号。

```csharp
public int? QuantizationNumber { get; set; }
```

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentOutOfRangeException | 参数少于两个。 |

### 评论

这是写入选项 - 它不影响读取。 此选项与[`Transform`](../transform/) 这两个选项中只有一个可以不`null`. 如果这不是`null` - 输出 TopoJSON 坐标被量化，弧被增量编码为指定的 量化数。量化数决定了生成的量化坐标中每个维度 可表达值的最大数量；通常选择十的幂。 默认为`null`.

### 也可以看看

* class [TopoJsonOptions](../)
* 命名空间 [Aspose.Gis.Formats.TopoJson](../../topojsonoptions/)
* 部件 [Aspose.GIS](../../../)


