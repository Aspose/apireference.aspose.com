---
title: DatabaseDriver.OpenDataset
second_title: Aspose.GIS for .NET API 参考
description: DatabaseDriver 方法. 打开数据集
type: docs
weight: 10
url: /zh/net/aspose.gis/databasedriver/opendataset/
---
## DatabaseDriver.OpenDataset method

打开数据集。

```csharp
public abstract Dataset OpenDataset(IDbConnection connection)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| connection | IDbConnection | 打开与数据库的连接。 |

### 返回值

的实例[`Dataset`](../../dataset/).

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 连接是`null`. |
| [GisException](../../gisexception/) | 读取数据集时出错。 |
| IOException | 发生 I/O 错误。 |

### 也可以看看

* class [Dataset](../../dataset/)
* class [DatabaseDriver](../)
* 命名空间 [Aspose.Gis](../../databasedriver/)
* 部件 [Aspose.GIS](../../../)


