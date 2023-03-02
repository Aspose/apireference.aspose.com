---
title: IGeometryCollection.ToLinearGeometry
second_title: Aspose.GIS for .NET API 参考
description: IGeometryCollection 方法. 使用默认值获取此几何的近似或等效非曲线版本宽容.
type: docs
weight: 60
url: /zh/net/aspose.gis.geometries/igeometrycollection/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry}

使用默认值获取此几何的近似或等效非曲线版本`宽容`.

```csharp
public IGeometryCollection ToLinearGeometry()
```

### 返回值

没有曲线几何的几何。这相当于`ToLinearGeometry`with 默认值`宽容`.默认`宽容` 值取决于[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)此几何的 ： 对于预计的 SRS 公差为 0.001 米（以 SRS 为单位）对于地理 SRS 公差是`1e-5`度（SRS 单位）对于未知的 SRS 公差是`1e-5` 有关应用哪些转换的更多详细信息，请参阅`ToLinearGeometry`规范.

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| InvalidOperationException | 此几何图形无效，无法完成该操作。 |

### 也可以看看

* interface [IGeometryCollection](../)
* 命名空间 [Aspose.Gis.Geometries](../../igeometrycollection/)
* 部件 [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_1}

使用指定的几何图形获取近似或等效的非曲线版本`宽容`.

```csharp
public IGeometryCollection ToLinearGeometry(double tolerance)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| tolerance | Double | 的`宽容`使用。结果保证小于`宽容`远离 the 曲线几何，除非线性化几何所需的点数超过每个象限最大值， 当前等于 10000 点。 |

### 返回值

没有曲线几何的几何。应用以下转换： CircularString 是 linearized （转化为LineString带有指定的*tolerance*)CompoundCurve s 连接成`线串`秒CurvePolygon 被转化为Polygon秒MultiCurve 被转化为MultiCurve秒MultiSurface 被转化为MultiPolygon秒 结果，[`HasCurveGeometry`](../../igeometry/hascurvegeometry/)输出几何是`false`.

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentOutOfRangeException | `宽容`小于或等于`0`. |
| InvalidOperationException | 此几何图形无效，无法完成该操作。 |

### 也可以看看

* interface [IGeometryCollection](../)
* 命名空间 [Aspose.Gis.Geometries](../../igeometrycollection/)
* 部件 [Aspose.GIS](../../../)


