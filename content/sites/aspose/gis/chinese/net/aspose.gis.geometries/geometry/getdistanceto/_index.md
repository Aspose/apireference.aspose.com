---
title: Geometry.GetDistanceTo
second_title: Aspose.GIS for .NET API 参考
description: Geometry 方法. 计算此几何与指定几何之间的最小距离
type: docs
weight: 240
url: /zh/net/aspose.gis.geometries/geometry/getdistanceto/
---
## Geometry.GetDistanceTo method

计算此几何与指定几何之间的最小距离。

```csharp
public double GetDistanceTo(IGeometry other)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| other | IGeometry | 寻找距离的几何体。 |

### 返回值

如果两个几何图形都不是[`IsEmpty`](../isempty/) 几何图形最近点之间的距离。 如果至少有一个几何图形为空，则返回 -1。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 参数是`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/)几何形状不等价。 您可以使用[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/)为了将几何图形转换为相同的 spatial 参考系统。 |

### 也可以看看

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* 命名空间 [Aspose.Gis.Geometries](../../geometry/)
* 部件 [Aspose.GIS](../../../)


