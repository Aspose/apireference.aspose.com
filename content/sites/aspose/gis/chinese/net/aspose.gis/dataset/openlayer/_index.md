---
title: Dataset.OpenLayer
second_title: Aspose.GIS for .NET API 参考
description: Dataset 方法. 打开指定名称的层进行读取
type: docs
weight: 110
url: /zh/net/aspose.gis/dataset/openlayer/
---
## Dataset.OpenLayer method

打开指定名称的层进行读取。

```csharp
public abstract VectorLayer OpenLayer(string name, DriverOptions options = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| name | String | 要打开的层的名称。 |
| options | DriverOptions | 打开选项。 |

### 返回值

该层已打开以供读取。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentException | 指定名称的图层不存在； 选项对象对于此数据集的类型不正确。 |
| ArgumentException | 此数据集的选项对象类型不正确。 |
| ArgumentNullException | 名字是`null`. |
| [GisException](../../gisexception/) | 从图层读取要素时出错。 |
| IOException | 发生 I/O 错误。 |

### 也可以看看

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [Dataset](../)
* 命名空间 [Aspose.Gis](../../dataset/)
* 部件 [Aspose.GIS](../../../)


