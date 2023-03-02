---
title: IGeometry.Covers
second_title: Aspose.GIS for .NET API 参考
description: IGeometry 方法. 判断这个几何图形是否覆盖指定的几何图形
type: docs
weight: 150
url: /zh/net/aspose.gis.geometries/igeometry/covers/
---
## IGeometry.Covers method

判断这个几何图形是否覆盖指定的几何图形。

```csharp
public bool Covers(IGeometry other)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| other | IGeometry | 一个几何。 |

### 返回值

`true`如果此几何图形“空间覆盖”另一个几何图形。`false`否则.

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 参数是`null`. |
| ArgumentException | 其中一个几何图形无效，无法完成操作。 |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/)几何形状不等价。 您可以使用[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/)为了将几何图形转换为相同的 spatial 参考系统。 |

### 评论

此方法根据 DE-9IM 交集矩阵测试一个几何是否覆盖另一个。 如果几何包含另一个几何的每个点，则一个几何覆盖另一个。 此方法类似于[`SpatiallyContains`](../spatiallycontains/)，但返回`true`更多时候， 因为它不区分内部点和边界点。因此，如果几何 A 位于 几何 B 的边界上，[`SpatiallyContains`](../spatiallycontains/)回报`false`, 而此方法返回`true`. 这个方法等同于：

```csharp
this.Relate(other, "T*****FF*") || this.Relate(other, "*T****FF*") || this.Relate(other, "***T**FF*) || this.Relate(other, "***T*FF*");
```

### 也可以看看

* method [SpatiallyContains](../spatiallycontains/)
* method [CoveredBy](../coveredby/)
* interface [IGeometry](../)
* 命名空间 [Aspose.Gis.Geometries](../../igeometry/)
* 部件 [Aspose.GIS](../../../)


