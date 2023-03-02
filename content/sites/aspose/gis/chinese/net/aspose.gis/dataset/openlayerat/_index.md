---
title: Dataset.OpenLayerAt
second_title: Aspose.GIS for .NET API 参考
description: Dataset 方法. 打开指定索引处的层进行读取
type: docs
weight: 120
url: /zh/net/aspose.gis/dataset/openlayerat/
---
## Dataset.OpenLayerAt method

打开指定索引处的层进行读取。

```csharp
public abstract VectorLayer OpenLayerAt(int index, DriverOptions options = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| index | Int32 | 要打开的层的索引。 |
| options | DriverOptions | 打开选项。 |

### 返回值

该层已打开以供读取。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentException | 此数据集的选项对象类型不正确。 |
| ArgumentOutOfRangeException | 索引超出范围 |
| ArgumentException | 此数据集的选项对象类型不正确。 |
| [GisException](../../gisexception/) | 从图层读取要素时出错。 |
| IOException | 发生 I/O 错误。 |

### 也可以看看

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [Dataset](../)
* 命名空间 [Aspose.Gis](../../dataset/)
* 部件 [Aspose.GIS](../../../)


