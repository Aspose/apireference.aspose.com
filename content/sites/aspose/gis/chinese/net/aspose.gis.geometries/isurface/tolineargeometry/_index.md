---
title: ISurface.ToLinearGeometry
second_title: Aspose.GIS for .NET API 参考
description: ISurface 方法. 使用默认值获取此几何的近似或等效非曲线版本宽容.
type: docs
weight: 30
url: /zh/net/aspose.gis.geometries/isurface/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry}

使用默认值获取此几何的近似或等效非曲线版本`宽容`.

```csharp
public IPolygon ToLinearGeometry()
```

### 返回值

一个[`IPolygon`](../../ipolygon/)近似或等同于此`表面`. 这相当于`ToLinearGeometry`with 默认值`宽容`.默认`宽容` 值取决于[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)此几何的 ： 对于预计的 SRS 公差为 0.001 米（以 SRS 为单位）对于地理 SRS 公差是`1e-5`度（SRS 单位）对于未知的 SRS 公差是`1e-5` 有关应用哪些转换的更多详细信息，请参阅`ToLinearGeometry`规范.

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| InvalidOperationException | 此几何图形无效，无法完成该操作。 |

### 也可以看看

* interface [IPolygon](../../ipolygon/)
* interface [ISurface](../)
* 命名空间 [Aspose.Gis.Geometries](../../isurface/)
* 部件 [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_1}

使用指定的几何图形获取近似或等效的非曲线版本`宽容`.

```csharp
public IPolygon ToLinearGeometry(double tolerance)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| tolerance | Double | 的`宽容`使用。结果保证小于`宽容`远离 the 曲线几何，除非线性化几何所需的点数超过每个象限最大值， 当前等于 10000 点。 |

### 返回值

一个[`IPolygon`](../../ipolygon/)近似或等同于此`表面`:  如果这个对象是[`IPolygon`](../../ipolygon/)本身 结果等同于这个对象 如果这个对象不是[`IPolygon`](../../ipolygon/)它被线性化并且[`IPolygon`](../../ipolygon/)已创建

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentOutOfRangeException | `宽容`小于或等于`0`. |
| InvalidOperationException | 此几何图形无效，无法完成该操作。 |

### 也可以看看

* interface [IPolygon](../../ipolygon/)
* interface [ISurface](../)
* 命名空间 [Aspose.Gis.Geometries](../../isurface/)
* 部件 [Aspose.GIS](../../../)


