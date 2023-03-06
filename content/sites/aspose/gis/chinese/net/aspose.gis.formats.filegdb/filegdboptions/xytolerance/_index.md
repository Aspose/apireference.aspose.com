---
title: FileGdbOptions.XYTolerance
second_title: Aspose.GIS for .NET API 参考
description: FileGdbOptions 财产. X 和 Y 捕捉公差
type: docs
weight: 70
url: /zh/net/aspose.gis.formats.filegdb/filegdboptions/xytolerance/
---
## FileGdbOptions.XYTolerance property

X 和 Y 捕捉公差。

```csharp
public double? XYTolerance { get; set; }
```

### 评论

这是一个创建选项，它不影响读取。 该参数控制用于高级 ArcGIS 功能的捕捉公差。 它不影响 Aspose.GIS 行为，但它可以被 ArcGIS 使用。 参数的单位是空间参照系的单位。 如果设置为`null` 使用默认值。默认值取决于空间参考系统 ，对于地理系统等于 0.000000008983153 度，对于投影系统 等于 0.001 米（值转换为空间参考系统单位）。 如果空间参考系统未知，则默认值为 0.001.

### 也可以看看

* class [FileGdbOptions](../)
* 命名空间 [Aspose.Gis.Formats.FileGdb](../../filegdboptions/)
* 部件 [Aspose.GIS](../../../)


