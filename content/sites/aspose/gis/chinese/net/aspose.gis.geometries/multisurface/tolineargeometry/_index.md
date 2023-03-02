---
title: MultiSurface.ToLinearGeometry
second_title: Aspose.GIS for .NET API 参考
description: MultiSurface 方法. 使用默认值获取此几何的近似或等效非曲线版本宽容.
type: docs
weight: 60
url: /zh/net/aspose.gis.geometries/multisurface/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry_4}

使用默认值获取此几何的近似或等效非曲线版本`宽容`.

```csharp
public IMultiPolygon ToLinearGeometry()
```

### 返回值

一个[`IMultiPolygon`](../../imultipolygon/)近似或等同于此[`IMultiSurface`](../../imultisurface/). 这相当于[`ToLinearGeometry`](../../imultisurface/tolineargeometry/)with 默认值`宽容`.默认`宽容` 值取决于[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)此几何的 ： 对于预计的 SRS 公差为 0.001 米（以 SRS 为单位）对于地理 SRS 公差是`1e-5`度（SRS 单位）对于未知的 SRS 公差是`1e-5` 有关应用哪些转换的更多详细信息，请参阅[`ToLinearGeometry`](../../imultisurface/tolineargeometry/)规范.

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| InvalidOperationException | 此几何图形无效，无法完成该操作。 |

### 也可以看看

* interface [IMultiPolygon](../../imultipolygon/)
* class [MultiSurface](../)
* 命名空间 [Aspose.Gis.Geometries](../../multisurface/)
* 部件 [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_5}

使用指定的几何图形获取近似或等效的非曲线版本`宽容`.

```csharp
public IMultiPolygon ToLinearGeometry(double tolerance)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| tolerance | Double | 的`宽容`使用。结果保证小于`宽容`远离 the 曲线几何，除非线性化几何所需的点数超过每个象限最大值， 当前等于 10000 点。 |

### 返回值

一个[`IMultiPolygon`](../../imultipolygon/)近似或等同于此[`IMultiSurface`](../../imultisurface/):  如果这个对象是[`IMultiPolygon`](../../imultipolygon/)本身 结果等同于这个对象 如果这个对象不是[`IMultiPolygon`](../../imultipolygon/) 所有表面都是线性化的和新的`I多边形`已创建

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentOutOfRangeException | `宽容`小于或等于`0`. |
| InvalidOperationException | 此几何图形无效，无法完成该操作。 |

### 也可以看看

* interface [IMultiPolygon](../../imultipolygon/)
* class [MultiSurface](../)
* 命名空间 [Aspose.Gis.Geometries](../../multisurface/)
* 部件 [Aspose.GIS](../../../)


