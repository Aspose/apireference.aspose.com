---
title: TopoJsonOptions.Transform
second_title: Aspose.GIS for .NET API 参考
description: TopoJsonOptions 财产. 指定变换对象以用于量化输出 TopoJSON 中的坐标和增量编码弧
type: docs
weight: 60
url: /zh/net/aspose.gis.formats.topojson/topojsonoptions/transform/
---
## TopoJsonOptions.Transform property

指定变换对象以用于量化输出 TopoJSON 中的坐标和增量编码弧。

```csharp
public TopoJsonTransform Transform { get; set; }
```

### 评论

这是写入选项 - 它不影响读取。 此选项与[`QuantizationNumber`](../quantizationnumber/) 这两个选项中只有一个可以不`null`. 如果这不是`null` 输出 TopoJSON 坐标被量化，弧被指定的 变换对象进行增量编码。 有关变换对象的更多详细信息，请参阅 TopoJSON 规范。 默认为`null`.

### 也可以看看

* class [TopoJsonTransform](../../topojsontransform/)
* class [TopoJsonOptions](../)
* 命名空间 [Aspose.Gis.Formats.TopoJson](../../topojsonoptions/)
* 部件 [Aspose.GIS](../../../)


