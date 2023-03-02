---
title: SpatialReferenceSystemTransformation.Transform
second_title: Aspose.GIS for .NET API 参考
description: SpatialReferenceSystemTransformation 方法. 将几何图形从源空间参考系统转换为目标空间参考系统
type: docs
weight: 40
url: /zh/net/aspose.gis.spatialreferencing/spatialreferencesystemtransformation/transform/
---
## SpatialReferenceSystemTransformation.Transform method

将几何图形从源空间参考系统转换为目标空间参考系统。

```csharp
public Geometry Transform(IGeometry geometry)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| geometry | IGeometry | 要变换的几何体。 |

### 返回值

目标空间参考系统中的新几何体。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 几何是`null`. |
| ArgumentException | 几何[`SpatialReferenceSystem`](../../../aspose.gis.geometries/igeometry/spatialreferencesystem/)不是`null`并且不等于 [`Source`](../source/) |
| [TransformationException](../../transformationexception/) | 转型失败。 |

### 也可以看看

* class [Geometry](../../../aspose.gis.geometries/geometry/)
* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [SpatialReferenceSystemTransformation](../)
* 命名空间 [Aspose.Gis.SpatialReferencing](../../spatialreferencesystemtransformation/)
* 部件 [Aspose.GIS](../../../)


