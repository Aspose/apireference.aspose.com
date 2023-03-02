---
title: IGeometry.Intersects
second_title: Aspose.GIS for .NET API 参考
description: IGeometry 方法. 确定此几何图形是否与指定范围相交
type: docs
weight: 270
url: /zh/net/aspose.gis.geometries/igeometry/intersects/
---
## Intersects(Extent) {#intersects}

确定此几何图形是否与指定范围相交。

```csharp
public bool Intersects(Extent extent)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| extent | Extent | 的程度。 |

### 返回值

`true`如果此几何图形与范围相交；`false`否则.

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 参数是`null`. |

### 也可以看看

* method [Intersects](../../../aspose.gis/extent/intersects/)
* class [Extent](../../../aspose.gis/extent/)
* interface [IGeometry](../)
* 命名空间 [Aspose.Gis.Geometries](../../igeometry/)
* 部件 [Aspose.GIS](../../../)

---

## Intersects(IGeometry) {#intersects_1}

确定此几何图形和指定的几何图形是否相交。

```csharp
public bool Intersects(IGeometry other)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| other | IGeometry | 一个几何。 |

### 返回值

`true`如果此几何图形“空间相交”另一个几何图形。`false`否则.

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 参数是`null`. |
| ArgumentException | 其中一个几何图形无效，无法完成操作。 |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/)几何形状不等价。 您可以使用[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/)为了将几何图形转换为相同的 spatial 参考系统。 |

### 评论

这个方法等同于： 这是对的否定[`Disjoint`](../disjoint/).看[`Disjoint`](../disjoint/)了解更多详情。

```csharp
!this.Disjoint(other);
```

### 也可以看看

* interface [IGeometry](../)
* 命名空间 [Aspose.Gis.Geometries](../../igeometry/)
* 部件 [Aspose.GIS](../../../)


