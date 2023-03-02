---
title: Geometry.GetBuffer
second_title: Aspose.GIS for .NET API 参考
description: Geometry 方法. 计算此几何图形周围的缓冲区
type: docs
weight: 210
url: /zh/net/aspose.gis.geometries/geometry/getbuffer/
---
## Geometry.GetBuffer method

计算此几何图形周围的缓冲区。

```csharp
public IGeometry GetBuffer(double distance, int quadrantSegments = 30)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| distance | Double | 缓冲区宽度。 |
| quadrantSegments | Int32 | 用于近似 90 度曲率的段数。 此数字越大，产生的曲线近似越好。 默认值为 30. |

### 返回值

表示距离 此几何指定距离内的所有点的几何。 结果的类型是[`Null`](../null/),[`IPolygon`](../../ipolygon/)或者[`IMultiPolygon`](../../imultipolygon/).

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| InvalidOperationException | 此几何图形无效，无法完成操作。 |
| ArgumentOutOfRangeException | 象限段小于或等于 0. |

### 也可以看看

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* 命名空间 [Aspose.Gis.Geometries](../../geometry/)
* 部件 [Aspose.GIS](../../../)


