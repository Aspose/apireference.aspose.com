---
title: SpatialReferenceSystem
second_title: Aspose.GIS for .NET API 参考
description: 空间参考系统将坐标映射到地球上的位置 有不同类型的 SRS请参阅Type 此外如果 SRS 的类型是Geographic或 ProjectedSRS 可以是复合的或单一的参见IsCompound
type: docs
weight: 2140
url: /zh/net/aspose.gis.spatialreferencing/spatialreferencesystem/
---
## SpatialReferenceSystem class

空间参考系统将坐标映射到地球上的位置。 有不同类型的 SRS，请参阅Type。 此外，如果 SRS 的类型是Geographic或 Projected，SRS 可以是复合的或单一的，参见IsCompound。

```csharp
public abstract class SpatialReferenceSystem : IdentifiableObject
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound) { get; } | 返回此 SRS 转换为CompoundSpatialReferenceSystem。 使用IsCompound来确定是否可以进行转换。 |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric) { get; } | 返回此 SRS 转换为GeocentricSpatialReferenceSystem。 使用Type来确定是否可以进行转换。 |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic) { get; } | 返回此 SRS 转换为GeographicSpatialReferenceSystem。 使用Type来确定是否可以进行转换。 |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal) { get; } | 返回此 SRS 转换为LocalSpatialReferenceSystem。 使用Type来确定是否可以进行转换。 |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected) { get; } | 返回此 SRS 转换为ProjectedSpatialReferenceSystem。 使用Type来确定是否可以进行转换。 |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical) { get; } | 返回此 SRS 转换为VerticalSpatialReferenceSystem。 使用Type来确定是否可以进行转换。 |
| abstract [DimensionsCount](../../aspose.gis.spatialreferencing/spatialreferencesystem/dimensionscount) { get; } | 返回此 SRS 中的维数。 |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode) { get; } | 如果此对象标识符是 EPSG 标识符 - 返回其代码。否则 - 返回 -1。 |
| abstract [GeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/geographicdatum) { get; } | 返回此 SRS 的地理基准面。 |
| abstract [HasGeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/hasgeographicdatum) { get; } | 确定此 SRS 是否具有地理基准。 对于每个地理、投影和地心 SRS 都是如此。 |
| abstract [HasPrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/hasprimemeridian) { get; } | 返回此 SRS 是否具有本初子午线。 对于每个地理、投影和地心 SRS 都是如此。 |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier) { get; } | 此可识别对象的标识符。 |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound) { get; } | 返回此 SRS 是否是复合的（两个 SRS 的并集）。 复合 SRS 中的以下 SRS 组合被认为是有效的: 地理 SRS + 垂直 SRS，在这种情况下，复合 SRS 的类型将是Geographic。 投影 SRS + 垂直 SRS，在这种情况下，复合 SRS 的类型将为Projected。 如果 SRS 的组合不同，复合 SRS 的类型将为Unknown。 |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle) { get; } | 返回此 SRS 是否为单个（不是两个 SRS 的并集）。 |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid) { get; } | 与String@)相同，但不返回错误消息. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name) { get; } | 此对象的名称。 |
| abstract [PrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/primemeridian) { get; } | 返回此 SRS 的本初子午线。 |
| abstract [Type](../../aspose.gis.spatialreferencing/spatialreferencesystem/type) { get; } | 获取此 SRS 的类型，请参见SpatialReferenceSystemType。 |
| static [Etrs89](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89) { get; } | ETRS 89 (EPSG:4258) 空间参考系统。 |
| static [Etrs89LambertAzimuthalEqualArea](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89lambertazimuthalequalarea) { get; } | ETRS 89 / ETRS Lambert 方位角等面积 (EPSG:3035) 空间参考系统。 |
| static [Etrs89LambertConformalConic](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89lambertconformalconic) { get; } | ETRS 89 / Lambert Conformal Conic (EPSG:3034) 空间参考系统。 |
| static [Nad83](../../aspose.gis.spatialreferencing/spatialreferencesystem/nad83) { get; } | NAD 83 (EPSG:4269) 空间参考系统。 |
| static [Osgb36](../../aspose.gis.spatialreferencing/spatialreferencesystem/osgb36) { get; } | OSGB 36 (EPSG:4277) 空间参考系统。 |
| static [Osgb36BritishNationalGrid](../../aspose.gis.spatialreferencing/spatialreferencesystem/osgb36britishnationalgrid) { get; } | OSGB 36 / British National Grid (EPSG:27700) 空间参考系统。 |
| static [WebMercator](../../aspose.gis.spatialreferencing/spatialreferencesystem/webmercator) { get; } | Web Mercator (EPSG:3857) 空间参考系统。 |
| static [Wgs72](../../aspose.gis.spatialreferencing/spatialreferencesystem/wgs72) { get; } | WGS 72 (EPSG:4322) 空间参考系统。 |
| static [Wgs84](../../aspose.gis.spatialreferencing/spatialreferencesystem/wgs84) { get; } | WGS 84 (EPSG:4326) 空间参考系统。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| static [CreateFromEpsg](../../aspose.gis.spatialreferencing/spatialreferencesystem/createfromepsg)(int) | 根据指定的 EPSG 代码创建空间参考系统。 |
| static [CreateFromWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/createfromwkt)(string) | 基于 WKT（众所周知的文本）字符串创建一个新的` SpatialReferenceSystem` 。 |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto)(SpatialReferenceSystem) | 从此创建转换 `空间参考系统` 给另一个 `空间参考系统`. |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt)() | 将此 SRS 的表示形式返回为 WKT 字符串。 结果 WKT 字符串将匹配 OGC 01-009 规范，通常命名为“WKT1”。 |
| abstract [GetAxis](../../aspose.gis.spatialreferencing/spatialreferencesystem/getaxis)(int) | 获取描述维度的[`Axis`](../axis)。 |
| abstract [GetUnit](../../aspose.gis.spatialreferencing/spatialreferencesystem/getunit)(int) | 获取[`Unit`](../unit)维度。 |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent)(SpatialReferenceSystem) | 检测此 SRS 是否与其他 SRS 等效。。 |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring)() | 返回代表当前对象的字符串。 |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | 从此创建转换 `空间参考系统` 给另一个 `空间参考系统`. |
| abstract [Validate](../../aspose.gis.spatialreferencing/spatialreferencesystem/validate)(out string) | 确定此 SRS 是否有效。 |
| static [CreateCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/createcompound)(string, SpatialReferenceSystem, SpatialReferenceSystem, Identifier) | 创建复合 SRS。 |
| static [CreateGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/creategeocentric)(GeocentricSpatialReferenceSystemParameters, Identifier) | 从自定义参数创建地心 SRS。 |
| static [CreateGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/creategeographic)(GeographicSpatialReferenceSystemParameters, Identifier) | 从自定义参数创建地理 SRS。 |
| static [CreateLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/createlocal)(string, LocalDatum, Unit, ICollection&lt;Axis&gt;, Identifier) | 创建本地 SRS。 |
| static [CreateProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/createprojected)(ProjectedSpatialReferenceSystemParameters, Identifier) | 从自定义参数创建投影 SRS。 |
| static [CreateVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/createvertical)(string, VerticalDatum, Unit, Axis, Identifier) | 创建垂直 SRS。 |
| static [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent)(SpatialReferenceSystem, SpatialReferenceSystem) | 确定两个 SRS 是否等价。 等效 SRS 的相同坐标匹配地球上的相同位置。 等效 SRS 的某些参数可以不同，例如[`Name`](../identifiableobject/name)。 |
| static [TryCreateFromEpsg](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatefromepsg)(int, out SpatialReferenceSystem) | 根据指定的 EPSG 代码创建空间参考系统。 |
| static [TryCreateFromWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatefromwkt)(string, out SpatialReferenceSystem) | 基于 WKT（众所周知的文本）字符串创建一个新的` SpatialReferenceSystem` 。 |

### 也可以看看

* class [IdentifiableObject](../identifiableobject)
* 命名空间 [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing)
* 部件 [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
