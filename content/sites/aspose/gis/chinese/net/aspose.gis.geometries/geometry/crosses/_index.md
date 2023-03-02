---
title: Geometry.Crosses
second_title: Aspose.GIS for .NET API 参考
description: Geometry 方法. 确定此几何图形和指定的几何图形是否交叉
type: docs
weight: 170
url: /zh/net/aspose.gis.geometries/geometry/crosses/
---
## Geometry.Crosses method

确定此几何图形和指定的几何图形是否交叉。

```csharp
public bool Crosses(IGeometry other)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| other | IGeometry | 一个几何。 |

### 返回值

`true`如果此几何图形“在空间上穿过”另一个几何图形。`false`否则.

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 参数是`null`. |
| ArgumentException | 其中一个几何图形无效，无法完成操作。 |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/)几何形状不等价。 您可以使用[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/)为了将几何图形转换为相同的 spatial 参考系统。 |

### 评论

此方法根据 DE-9IM 交集矩阵测试几何图形是否交叉。 如果两个几何图形有一些但不是所有内部点相同，则两个几何图形相互交叉，并且 交集的维度小于至少其中一个的维度geometries. 即：两个[`LineString`](../../linestring/) 交叉，如果它们形成一个 'X' 字母，一个 LineString 和一个[`Polygon`](../../polygon/) cross if LineString goes interior of a Polygon. See OpenGIS Simple Features Specification for more details about DE-9IM and "spatially crosses" 关系。

### 也可以看看

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* 命名空间 [Aspose.Gis.Geometries](../../geometry/)
* 部件 [Aspose.GIS](../../../)


