---
title: Geometry.FromText
second_title: Aspose.GIS for .NET API 参考
description: Geometry 方法. 从其 WellKnown Text 表示中创建几何体
type: docs
weight: 470
url: /zh/net/aspose.gis.geometries/geometry/fromtext/
---
## FromText(string) {#fromtext}

从其 Well-Known Text 表示中创建几何体。

```csharp
public static IGeometry FromText(string wkt)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| wkt | String | 几何图形的众所周知的文本表示。 |

### 返回值

由参数表示的几何。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 参数为空。 |
| NotSupportedException | 参数表示不支持类型的几何图形。 |
| FormatException | 参数不是有效的 Well-Known Text。 |

### 也可以看看

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* 命名空间 [Aspose.Gis.Geometries](../../geometry/)
* 部件 [Aspose.GIS](../../../)

---

## FromText(string, SpatialReferenceSystem) {#fromtext_1}

从其 Well-Known Text 表示中创建几何体。

```csharp
public static IGeometry FromText(string wkt, SpatialReferenceSystem spatialReferenceSystem)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| wkt | String | 几何图形的众所周知的文本表示。 |
| spatialReferenceSystem | SpatialReferenceSystem | 要分配给几何体的空间参考系。 |

### 返回值

由参数表示的几何。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 参数为空。 |
| NotSupportedException | 参数表示不支持类型的几何图形。 |
| FormatException | 参数不是有效的 Well-Known Text。 |

### 也可以看看

* interface [IGeometry](../../igeometry/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Geometry](../)
* 命名空间 [Aspose.Gis.Geometries](../../geometry/)
* 部件 [Aspose.GIS](../../../)


