---
title: Class GeographicSpatialReferenceSystem
second_title: Aspose.GIS for .NET API 参考
description: Aspose.Gis.SpatialReferencing.GeographicSpatialReferenceSystem 班级. Geographic SRS是基于经度和纬度的SRS Geographic SRS可以是二维的也可以是三维的 如果地理SRS是三维的那么它实际上是二维SRS和垂直SRS的复合SRS
type: docs
weight: 2130
url: /zh/net/aspose.gis.spatialreferencing/geographicspatialreferencesystem/
---
## GeographicSpatialReferenceSystem class

Geographic SRS是基于经度和纬度的SRS。 Geographic SRS可以是二维的，也可以是三维的。 如果地理SRS是三维的，那么它实际上是二维SRS和垂直SRS的复合SRS。

```csharp
public abstract class GeographicSpatialReferenceSystem : SpatialReferenceSystem
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| abstract [AngularUnit](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/angularunit/) { get; } | 单位，用于角度尺寸，在此 SRS. |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | 返回此 SRS 转换为[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/). 使用[`IsCompound`](../spatialreferencesystem/iscompound/)找出是否可以转换。 |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | 返回此 SRS 转换为[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/). 使用[`Type`](../spatialreferencesystem/type/)找出是否可以转换。 |
| [AsGeographic](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/asgeographic/) { get; } | 返回这个。 |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | 返回此 SRS 转换为[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/). 使用[`Type`](../spatialreferencesystem/type/)找出是否可以转换。 |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected/) { get; } | 返回此 SRS 转换为[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/). 使用[`Type`](../spatialreferencesystem/type/)找出是否可以转换。 |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | 返回此 SRS 转换为[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/). 使用[`Type`](../spatialreferencesystem/type/)找出是否可以转换。 |
| abstract [AxisesOrder](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/axisesorder/) { get; } | 此 SRS 中的轴顺序。 如果此 SRS 无效且轴方向错误，Invalid返回. |
| abstract [DimensionsCount](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/dimensionscount/) { get; } | 返回此 SRS 中的维度计数。对于地理 SRS，这可以是： two - 如果这是单个地理 SRS。 two - 如果这是复合 SRS，它由单一、二维、地理 SRS 和垂直 SRS 组成，添加了第三个维度。 |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | 如果此对象标识符是 EPSG 标识符 - 返回其代码。否则 - 返回 -1. |
| abstract [GeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/geographicdatum/) { get; } | 返回此 SRS 的地理数据。 |
| [HasGeographicDatum](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/hasgeographicdatum/) { get; } | 返回`true` , 因为地理 SRS 总是有本初子午线. |
| [HasPrimeMeridian](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/hasprimemeridian/) { get; } | 返回`true` , 因为地理 SRS 总是有本初子午线. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | 此可识别对象的标识符。 |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | 返回此 SRS 是否为复合（两个 SRS 的并集）。 复合 SRS 中的以下 SRS 组合被视为有效： 地理 SRS + 垂直 SRS，在这种情况下，复合 SRS 的类型将为Geographic. Projected SRS + Vertical SRS，在这种情况下，复合 SRS 的类型将为Projected. 如果 SRS 的组合不同，复合 SRS 的类型将是Unknown. |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | 返回此 SRS 是否为单个（不是两个 SRS 的并集）。 |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | 与[`Validate`](../spatialreferencesystem/validate/) 但不返回错误信息. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | 此对象的名称。 |
| abstract [PrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/primemeridian/) { get; } | 返回此 SRS 的本初子午线。 |
| [Type](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/type/) { get; } | 返回Geographic. |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | 从中创建转换`空间参考系统`给另一个`空间参考系统`. |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | 将此 SRS 的表示返回为 WKT 字符串。 结果 WKT 字符串将匹配 OGC 01-009 规范，通常命名为“WKT1”。 |
| abstract [GetAxis](../../aspose.gis.spatialreferencing/spatialreferencesystem/getaxis/)(int) | 得到[`Axis`](../axis/)描述维度. |
| abstract [GetUnit](../../aspose.gis.spatialreferencing/spatialreferencesystem/getunit/)(int) | 得到[`Unit`](../unit/)维度. |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | 检测此 SRS 是否等同于其他 SRS。. |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | 返回表示当前对象的字符串。 |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | 从中创建转换`空间参考系统`给另一个`空间参考系统`. |
| abstract [Validate](../../aspose.gis.spatialreferencing/spatialreferencesystem/validate/)(out string) | 确定此 SRS 是否有效。 |

### 也可以看看

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* 命名空间 [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* 部件 [Aspose.GIS](../../)


