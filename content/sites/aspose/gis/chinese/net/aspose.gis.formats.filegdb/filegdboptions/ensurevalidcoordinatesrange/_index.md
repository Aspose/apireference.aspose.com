---
title: FileGdbOptions.EnsureValidCoordinatesRange
second_title: Aspose.GIS for .NET API 参考
description: FileGdbOptions 财产. 坐标是否在有效范围内
type: docs
weight: 30
url: /zh/net/aspose.gis.formats.filegdb/filegdboptions/ensurevalidcoordinatesrange/
---
## FileGdbOptions.EnsureValidCoordinatesRange property

坐标是否在有效范围内。

```csharp
public bool EnsureValidCoordinatesRange { get; set; }
```

### 评论

这是创建选项，不影响读取。 如果设置为`true`尝试写入 values 超出有效范围的坐标时将抛出异常。如果设置为`false`这样的坐标将被静默写入。 有效范围定义为[`CoordinatePrecisionGrid`](../coordinateprecisiongrid/).参考[`CoordinatePrecisionGrid`](../coordinateprecisiongrid/) 文档以了解如何根据坐标精度网格确定有效范围。 默认值为`false`.

### 也可以看看

* class [FileGdbOptions](../)
* 命名空间 [Aspose.Gis.Formats.FileGdb](../../filegdboptions/)
* 部件 [Aspose.GIS](../../../)


