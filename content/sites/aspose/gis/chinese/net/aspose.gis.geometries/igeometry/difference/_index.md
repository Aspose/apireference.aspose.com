---
title: IGeometry.Difference
second_title: Aspose.GIS for .NET API 参考
description: IGeometry 方法. 从该几何体中减去指定的几何体
type: docs
weight: 170
url: /zh/net/aspose.gis.geometries/igeometry/difference/
---
## IGeometry.Difference method

从该几何体中减去指定的几何体。

```csharp
public IGeometry Difference(IGeometry other)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| other | IGeometry | 要减去的几何体。 |

### 返回值

表示此几何与参数的差异的几何。结果几何包含 点集，该点集存在于该几何中但不存在于参数中。

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


