---
title: Enum SpatialReferenceSystemType
second_title: Aspose.GIS for .NET API 参考
description: Aspose.Gis.SpatialReferencing.SpatialReferenceSystemType 枚举. 表示空间参考系统的类型
type: docs
weight: 2270
url: /zh/net/aspose.gis.spatialreferencing/spatialreferencesystemtype/
---
## SpatialReferenceSystemType enumeration

表示空间参考系统的类型。

```csharp
public enum SpatialReferenceSystemType
```

### 价值观

| 姓名 | 价值 | 描述 |
| --- | --- | --- |
| Unknown | `0` | 默认值。 可以从返回[`Type`](../spatialreferencesystem/type/)如果这是具有 个基础 SRS 的无效组合的复合 SRS。看[`IsCompound`](../spatialreferencesystem/iscompound/). |
| Geographic | `1` | 地理SRS是基于角经度和角纬度的。 地理SRS可以转换为[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) 通过[`AsGeographic`](../spatialreferencesystem/asgeographic/)方法. |
| Geocentric | `2` | Geocentric SRS 是三维笛卡尔 SRS，原点在地球中心。 Geocentric SRS 可以转换为[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) 通过[`AsGeocentric`](../spatialreferencesystem/asgeocentric/)方法. |
| Projected | `3` | Projected SRS 基于线性 X 和线性 Y。它是应用投影到GeographicSRS. Projected SRS 可以转换为[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/) 通过[`AsProjected`](../spatialreferencesystem/asprojected/)方法. |
| Vertical | `4` | Vertical SRS描述线性高度坐标。 Vertical SRS可以转换为[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) 通过[`AsVertical`](../spatialreferencesystem/asvertical/)方法. |
| Local | `5` | Local SRS 将坐标与某些对象相关联，其他对象是地球。 Local SRS 可以转换为[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) 通过[`AsLocal`](../spatialreferencesystem/aslocal/)方法. |

### 也可以看看

* 命名空间 [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* 部件 [Aspose.GIS](../../)


