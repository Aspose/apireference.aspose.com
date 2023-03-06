---
title: IGeometry.GetConvexHull
second_title: Aspose.GIS for .NET API 参考
description: IGeometry 方法. 计算此几何体的凸包
type: docs
weight: 220
url: /zh/net/aspose.gis.geometries/igeometry/getconvexhull/
---
## IGeometry.GetConvexHull method

计算此几何体的凸包。

```csharp
public IGeometry GetConvexHull()
```

### 返回值

表示此几何体的凸包的几何体。 如果此几何体没有点，则结果为[`Null`](../../geometry/null/). 如果这个几何体只有一个点，那么结果就是这个点。 如果这个几何体只有两个点，那么结果就是[`ILineString`](../../ilinestring/)with the points. 如果这个几何有三个或更多的点那么结果是[`ILinearRing`](../../ilinearring/)表示围绕所有几何点的凸包

### 也可以看看

* interface [IGeometry](../)
* 命名空间 [Aspose.Gis.Geometries](../../igeometry/)
* 部件 [Aspose.GIS](../../../)


