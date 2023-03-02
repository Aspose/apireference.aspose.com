---
title: IGeometry.Union
second_title: Aspose.GIS for .NET API 参考
description: IGeometry 方法. 将此几何图形与指定的几何图形结合起来
type: docs
weight: 370
url: /zh/net/aspose.gis.geometries/igeometry/union/
---
## IGeometry.Union method

将此几何图形与指定的几何图形结合起来。

```csharp
public IGeometry Union(IGeometry other)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| other | IGeometry | 与之结合的几何体。 |

### 返回值

表示此几何与参数联合的几何。结果几何包含存在于该几何或参数中的 点集。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | *other*是`null`. |
| ArgumentException | 其中一个几何图形无效，无法完成操作。 |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/)几何形状不等价。 您可以使用[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/)为了将几何图形转换为相同的 spatial 参考系统。 |

### 也可以看看

* interface [IGeometry](../)
* 命名空间 [Aspose.Gis.Geometries](../../igeometry/)
* 部件 [Aspose.GIS](../../../)


