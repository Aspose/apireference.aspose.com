---
title: Dataset.EditLayer
second_title: Aspose.GIS for .NET API 参考
description: Dataset 方法. 打开具有指定名称的图层进行编辑
type: docs
weight: 90
url: /zh/net/aspose.gis/dataset/editlayer/
---
## Dataset.EditLayer method

打开具有指定名称的图层进行编辑。

```csharp
public abstract VectorLayer EditLayer(string name, DriverOptions options = null, 
    SpatialReferenceSystem spatialReferenceSystem = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| name | String | 要编辑的层的名称。 |
| options | DriverOptions | 打开选项。 |
| spatialReferenceSystem | SpatialReferenceSystem | 新几何的空间参考系统。 |

### 返回值

图层打开以进行编辑。

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
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Dataset](../)
* 命名空间 [Aspose.Gis](../../dataset/)
* 部件 [Aspose.GIS](../../../)


