---
title: Geometry.CoveredBy
second_title: Aspose.GIS for .NET API 参考
description: Geometry 方法. 判断这个几何体是否被指定的几何体覆盖
type: docs
weight: 150
url: /zh/net/aspose.gis.geometries/geometry/coveredby/
---
## Geometry.CoveredBy method

判断这个几何体是否被指定的几何体覆盖。

```csharp
public bool CoveredBy(IGeometry other)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| other | IGeometry | 一个几何。 |

### 返回值

`true`如果这个几何体被另一个几何体“空间覆盖”。`false`否则.

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 参数是`null`. |
| ArgumentException | 其中一个几何图形无效，无法完成操作。 |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/)几何形状不等价。 您可以使用[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/)为了将几何图形转换为相同的 spatial 参考系统。 |

### 评论

此方法根据 DE-9IM 交集矩阵测试一个几何体是否被另一个几何体覆盖。 这个方法等同于：

```csharp
other.Covers(this);
```

### 也可以看看

* method [SpatiallyContains](../../igeometry/spatiallycontains/)
* method [Covers](../../igeometry/covers/)
* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* 命名空间 [Aspose.Gis.Geometries](../../geometry/)
* 部件 [Aspose.GIS](../../../)


