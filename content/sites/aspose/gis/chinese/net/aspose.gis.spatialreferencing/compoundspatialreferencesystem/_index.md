---
title: CompoundSpatialReferenceSystem
second_title: Aspose.GIS for .NET API 参考
description: 复合 SRS 结合了两个基础 SRS其中没有一个可以是复合的
type: docs
weight: 1960
url: /zh/net/aspose.gis.spatialreferencing/compoundspatialreferencesystem/
---
## CompoundSpatialReferenceSystem class

复合 SRS 结合了两个基础 SRS，其中没有一个可以是复合的。

```csharp
public class CompoundSpatialReferenceSystem : SpatialReferenceSystem
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| override [AsCompound](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/ascompound) { get; } | 返回这个。 |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric) { get; } | 返回此 SRS 转换为[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem). 使用[`Type`](../spatialreferencesystem/type)找出是否可以转换。 |
| override [AsGeographic](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/asgeographic) { get; } | 返回此 SRS 的地理表示。如果此复合 SRS 确实代表地理 SRS，则结果将 为三维地理 SRS（具有经度、纬度、高度维度）。否则会抛出异常。 |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal) { get; } | 返回此 SRS 转换为[`LocalSpatialReferenceSystem`](../localspatialreferencesystem). 使用[`Type`](../spatialreferencesystem/type)找出是否可以转换。 |
| override [AsProjected](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/asprojected) { get; } | 返回此 SRS 的投影表示。如果此复合 SRS 确实表示投影 SRS，则结果将 为三维投影 SRS（具有 X、Y、高度尺寸）。否则会抛出异常。 |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical) { get; } | 返回此 SRS 转换为[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem). 使用[`Type`](../spatialreferencesystem/type)找出是否可以转换。 |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/dimensionscount) { get; } | 维数。对于复合 SRS，这是基础 SRS 的维数之和。 |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode) { get; } | 如果此对象标识符是 EPSG 标识符 - 返回其代码。否则 - 返回 -1. |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/geographicdatum) { get; } | 返回此 SRS 的地理基准。 如果两者都[`Head`](./head)和[`Tail`](./tail)有地理基准 - 返回 head. 的地理基准 |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/hasgeographicdatum) { get; } | 如果任何基础 SRS 具有地理基准，则复合 SRS 具有地理基准。 |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/hasprimemeridian) { get; } | 如果任何基础 SRS 具有本初子午线，则复合 SRS 具有本初子午线。 |
| [Head](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/head) { get; } | 第一个底层 SRS. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier) { get; } | 此可识别对象的标识符。 |
| override [IsCompound](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/iscompound) { get; } | 返回`true`. |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle) { get; } | 返回此 SRS 是否为单个（不是两个 SRS 的并集）。 |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid) { get; } | 同[`Validate`](../spatialreferencesystem/validate)，但不返回错误信息。 |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name) { get; } | 此对象的名称。 |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/primemeridian) { get; } | 返回此 SRS 的本初子午线。 如果两者都有[`Head`](./head)和[`Tail`](./tail)有本初子午线 - 返回头部的本初子午线。 |
| [Tail](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/tail) { get; } | 第二个底层 SRS. |
| override [Type](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/type) { get; } | 此复合 SRS 的类型。可Geographicif 这个复合 SRS 是地理和垂直 SRS 的组合，或者Projectedif 这个复合 SRS 是投影和垂直 SRS 的组合。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto)(SpatialReferenceSystem) | 从这里创建转换`空间参考系统`给另一个`空间参考系统`. |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt)() | 将此 SRS 的表示形式返回为 WKT 字符串。 结果 WKT 字符串将匹配 OGC 01-009 规范，通常命名为“WKT1”。 |
| override [GetAxis](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/getaxis)(int) | 获取[`Axis`](../axis)描述维度. |
| override [GetUnit](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/getunit)(int) | 获取[`Unit`](../unit)尺寸. |
| override [IsEquivalent](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/isequivalent)(SpatialReferenceSystem) | 检测此 SRS 是否等同于其他 SRS。. |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring)() | 返回表示当前对象的字符串。 |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | 从这里创建转换`空间参考系统`给另一个`空间参考系统`. |
| override [Validate](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/validate)(out string) | 确定此 SRS 是否有效。看[`Validate`](../spatialreferencesystem/validate)有效性说明。 |

### 也可以看看

* class [SpatialReferenceSystem](../spatialreferencesystem)
* 命名空间 [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing)
* 部件 [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
