---
title: VectorLayer.Item
second_title: Aspose.GIS for .NET API 参考
description: VectorLayer 财产. 获取Feature在指定的索引处.
type: docs
weight: 70
url: /zh/net/aspose.gis/vectorlayer/item/
---
## VectorLayer indexer

获取[`Feature`](../../feature/)在指定的索引处.

```csharp
public virtual Feature this[int index] { get; }
```

| 范围 | 描述 |
| --- | --- |
| index | 特征的索引。 |

### 适当的价值

的[`Feature`](../../feature/).

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| InvalidOperationException | 如果图层以只写方式打开，则抛出。 |
| ArgumentOutOfRangeException | 索引超出范围。 |
| [GisException](../../gisexception/) | 从文件中读取特征时出错。 |
| IOException | 发生 I/O 错误。 |

### 也可以看看

* class [Feature](../../feature/)
* class [VectorLayer](../)
* 命名空间 [Aspose.Gis](../../vectorlayer/)
* 部件 [Aspose.GIS](../../../)


