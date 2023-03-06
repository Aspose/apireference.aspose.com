---
title: GeometryCollection.Add
second_title: Aspose.GIS for .NET API 参考
description: GeometryCollection 方法. 将指定的几何图形添加到集合中
type: docs
weight: 110
url: /zh/net/aspose.gis.geometries/geometrycollection/add/
---
## GeometryCollection.Add method

将指定的几何图形添加到集合中。

```csharp
public void Add(IGeometry geometry)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| geometry | IGeometry | 要添加的几何体。 |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 论据是`null`. |
| ArgumentException | 该集合不接受这种类型的几何图形。 |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/)这种几何和[`SpatialReferenceSystem`](../spatialreferencesystem/)参数都是 not `null`并且彼此不相等. |

### 也可以看看

* interface [IGeometry](../../igeometry/)
* class [GeometryCollection](../)
* 命名空间 [Aspose.Gis.Geometries](../../geometrycollection/)
* 部件 [Aspose.GIS](../../../)


