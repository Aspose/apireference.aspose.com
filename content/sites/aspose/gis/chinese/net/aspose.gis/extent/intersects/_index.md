---
title: Extent.Intersects
second_title: Aspose.GIS for .NET API 参考
description: Extent 方法. 确定此范围是否与参数相交
type: docs
weight: 190
url: /zh/net/aspose.gis/extent/intersects/
---
## Intersects(Extent) {#intersects}

确定此范围是否与参数相交。

```csharp
public bool Intersects(Extent extent)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| extent | Extent | 另一个程度。 |

### 返回值

值，指示此范围是否与参数相交。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 参数是`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/)这种程度和争论都不是`null`并且彼此不相等. |

### 也可以看看

* class [Extent](../)
* 命名空间 [Aspose.Gis](../../extent/)
* 部件 [Aspose.GIS](../../../)

---

## Intersects(IGeometry) {#intersects_1}

确定此范围是否与参数相交。

```csharp
public bool Intersects(IGeometry geometry)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| geometry | IGeometry | 用于测试相交的几何图形 |

### 返回值

值，指示此范围是否与参数相交。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 参数是`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/)这种程度和争论都不是`null`并且彼此不相等. |

### 也可以看看

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [Extent](../)
* 命名空间 [Aspose.Gis](../../extent/)
* 部件 [Aspose.GIS](../../../)


