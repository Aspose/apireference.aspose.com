---
title: FileGdbOptions.GeometryFieldName
second_title: Aspose.GIS for .NET API 参考
description: FileGdbOptions 财产. 几何字段的名称
type: docs
weight: 40
url: /zh/net/aspose.gis.formats.filegdb/filegdboptions/geometryfieldname/
---
## FileGdbOptions.GeometryFieldName property

几何字段的名称。

```csharp
public string GeometryFieldName { get; set; }
```

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentException | 值不是有效的字段名称。有效的字段名称必须： 不是`null`而且不空以拉丁字母或下划线开头仅包含拉丁字母、数字或下划线 |

### 评论

这是一个创建选项，它不影响读取。 定义几何字段（列）的名称。 默认为“SHAPE”。 如果任何属性在[`Attributes`](../../../aspose.gis/vectorlayer/attributes/)名称等于此属性的值，则 此属性已重命名。

### 也可以看看

* class [FileGdbOptions](../)
* 命名空间 [Aspose.Gis.Formats.FileGdb](../../filegdboptions/)
* 部件 [Aspose.GIS](../../../)


