---
title: Geometry.Within
second_title: Aspose.GIS for .NET API 参考
description: Geometry 方法. 确定此几何图形是否在指定范围内
type: docs
weight: 440
url: /zh/net/aspose.gis.geometries/geometry/within/
---
## Within(Extent) {#within}

确定此几何图形是否在指定范围内。

```csharp
public bool Within(Extent extent)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| extent | Extent | 的程度。 |

### 返回值

`true`如果此几何图形在范围内；`false`否则.

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 参数是`null`. |

### 也可以看看

* method [Contains](../../../aspose.gis/extent/contains/)
* class [Extent](../../../aspose.gis/extent/)
* class [Geometry](../)
* 命名空间 [Aspose.Gis.Geometries](../../geometry/)
* 部件 [Aspose.GIS](../../../)

---

## Within(IGeometry) {#within_1}

确定此几何图形是否在指定的几何图形内。

```csharp
public bool Within(IGeometry other)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| other | IGeometry | 一个几何。 |

### 返回值

`true`如果此几何图形在另一个几何图形“空间内”。`false`否则.

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 参数是`null`. |
| ArgumentException | 其中一个几何图形无效，无法完成操作。 |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/)几何形状不等价。 您可以使用[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/)为了将几何图形转换为相同的 spatial 参考系统。 |

### 评论

此方法根据 DE-9IM 交集矩阵测试一个几何体是否在另一个几何体中。 一个几何体在另一个几何体中，如果另一个几何体包含几何体的每个点并且几何体 内部相交。 这个方法等同于： 有关 DE-9IM 和“空间内”关系的更多详细信息，请参阅 OpenGIS 简单要素规范。

```csharp
this.Relate(other, "T*F**F***");
```

### 也可以看看

* method [SpatiallyContains](../../igeometry/spatiallycontains/)
* method [CoveredBy](../../igeometry/coveredby/)
* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* 命名空间 [Aspose.Gis.Geometries](../../geometry/)
* 部件 [Aspose.GIS](../../../)


