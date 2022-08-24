---
title: VerticalSpatialReferenceSystem
second_title: Aspose.GIS for .NET API 参考
description: 垂直 SRS 是描述高度坐标的一维 SRS
type: docs
weight: 2210
url: /zh/net/aspose.gis.spatialreferencing/verticalspatialreferencesystem/
---
## VerticalSpatialReferenceSystem class

垂直 SRS 是描述高度坐标的一维 SRS。

```csharp
public class VerticalSpatialReferenceSystem : SpatialReferenceSystem
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound) { get; } | 返回此 SRS 转换为[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem). 使用[`IsCompound`](../spatialreferencesystem/iscompound)找出是否可以转换。 |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric) { get; } | 返回此 SRS 转换为[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem). 使用[`Type`](../spatialreferencesystem/type)找出是否可以转换。 |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic) { get; } | 返回此 SRS 转换为[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem). 使用[`Type`](../spatialreferencesystem/type)找出是否可以转换。 |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal) { get; } | 返回此 SRS 转换为[`LocalSpatialReferenceSystem`](../localspatialreferencesystem). 使用[`Type`](../spatialreferencesystem/type)找出是否可以转换。 |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected) { get; } | 返回此 SRS 转换为[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem). 使用[`Type`](../spatialreferencesystem/type)找出是否可以转换。 |
| override [AsVertical](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/asvertical) { get; } | 返回此 SRS。 |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/dimensionscount) { get; } | 返回 1，因为垂直 SRS 始终是一维的。 |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode) { get; } | 如果此对象标识符是 EPSG 标识符 - 返回其代码。否则 - 返回 -1. |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/geographicdatum) { get; } | 抛出InvalidOperationException ，因为垂直 SRS 没有地理基准。 |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/hasgeographicdatum) { get; } | 返回`false` ，因为垂直 SRS 没有地理基准。 |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/hasprimemeridian) { get; } | 返回`false` ，因为垂直 SRS 没有本初子午线。 |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier) { get; } | 此可识别对象的标识符。 |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound) { get; } | 返回此 SRS 是否为复合（两个 SRS 的并集）。 复合 SRS 中的以下 SRS 组合被认为是有效的： 地理 SRS + 垂直 SRS，在这种情况下，复合 SRS 的类型将是Geographic. 投影 SRS + 垂直 SRS，在这种情况下，复合 SRS 的类型将是Projected. 如果 SRS 的组合不同，复合 SRS 的类型将为Unknown. |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle) { get; } | 返回此 SRS 是否为单个（不是两个 SRS 的并集）。 |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid) { get; } | 同[`Validate`](../spatialreferencesystem/validate)，但不返回错误信息。 |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name) { get; } | 此对象的名称。 |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/primemeridian) { get; } | 抛出InvalidOperationException ，因为垂直 SRS 没有本初子午线。 |
| override [Type](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/type) { get; } | 返回Vertical. |
| [VerticalDatum](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/verticaldatum) { get; } | 此 SRS 中使用的基准。 |
| [VerticalUnit](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/verticalunit) { get; } | 在此 SRS 中使用的单位。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto)(SpatialReferenceSystem) | 从这里创建转换`空间参考系统`给另一个`空间参考系统`. |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt)() | 将此 SRS 的表示形式返回为 WKT 字符串。 结果 WKT 字符串将匹配 OGC 01-009 规范，通常命名为“WKT1”。 |
| override [GetAxis](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/getaxis)(int) | 获取[`Axis`](../axis)描述维度. |
| override [GetUnit](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/getunit)(int) | 获取[`Unit`](../unit)尺寸. |
| override [IsEquivalent](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/isequivalent)(SpatialReferenceSystem) | 检测此 SRS 是否等同于其他 SRS。. |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring)() | 返回表示当前对象的字符串。 |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | 从这里创建转换`空间参考系统`给另一个`空间参考系统`. |
| override [Validate](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/validate)(out string) | 确定此 SRS 是否有效。看[`Validate`](../spatialreferencesystem/validate)有效性说明。 |

### 也可以看看

* class [SpatialReferenceSystem](../spatialreferencesystem)
* 命名空间 [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing)
* 部件 [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
