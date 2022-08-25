---
title: ProjectedSpatialReferenceSystem
second_title: Aspose.GIS for .NET API 参考
description: 投影 SRS 是对地理 SRS 进行投影的结果 投影 SRS 可以是二维或三维的 如果投影 SRS 是三维的那么它实际上是二维投影 SRS 和一维垂直的复合 SRS SRS.
type: docs
weight: 2120
url: /zh/net/aspose.gis.spatialreferencing/projectedspatialreferencesystem/
---
## ProjectedSpatialReferenceSystem class

投影 SRS 是对地理 SRS 进行投影的结果。 投影 SRS 可以是二维或三维的。 如果投影 SRS 是三维的，那么它实际上是二维投影 SRS 和一维垂直的复合 SRS SRS.

```csharp
public abstract class ProjectedSpatialReferenceSystem : SpatialReferenceSystem
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| abstract [AngularUnit](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/angularunit) { get; } | 单位，用于此 SRS 中的角度值和角度参数[`Projection`](./projection). 匹配角度单位[`Base`](./base). |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound) { get; } | 返回此 SRS 转换为[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem). 使用[`IsCompound`](../spatialreferencesystem/iscompound)找出是否可以转换。 |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric) { get; } | 返回此 SRS 转换为[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem). 使用[`Type`](../spatialreferencesystem/type)找出是否可以转换。 |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic) { get; } | 返回此 SRS 转换为[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem). 使用[`Type`](../spatialreferencesystem/type)找出是否可以转换。 |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal) { get; } | 返回此 SRS 转换为[`LocalSpatialReferenceSystem`](../localspatialreferencesystem). 使用[`Type`](../spatialreferencesystem/type)找出是否可以转换。 |
| [AsProjected](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/asprojected) { get; } | 返回这个。 |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical) { get; } | 返回此 SRS 转换为[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem). 使用[`Type`](../spatialreferencesystem/type)找出是否可以转换。 |
| abstract [AxisesOrder](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/axisesorder) { get; } | 此 SRS 中的轴顺序。 如果此 SRS 无效且轴方向错误，Invalid被退回。 |
| abstract [Base](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/base) { get; } | 地理 SRS 到哪个[`Projection`](./projection)已申请获得此 SRS. |
| abstract [DimensionsCount](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/dimensionscount) { get; } | 返回此 SRS 中的维度计数。对于投影 SRS，这可以是： 二 - 如果这是单个投影 SRS。 三 - 如果这是复合 SRS，它由单维、二维、投影 SRS 和垂直 SRS 组成，添加第三维。 |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode) { get; } | 如果此对象标识符是 EPSG 标识符 - 返回其代码。否则 - 返回 -1. |
| abstract [GeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/geographicdatum) { get; } | 返回此 SRS 的地理基准面。 |
| [HasGeographicDatum](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/hasgeographicdatum) { get; } | 返回真，因为投影的 SRS 总是有本初子午线。 |
| [HasPrimeMeridian](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/hasprimemeridian) { get; } | 返回真，因为投影的 SRS 总是有本初子午线。 |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier) { get; } | 此可识别对象的标识符。 |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound) { get; } | 返回此 SRS 是否为复合（两个 SRS 的并集）。 复合 SRS 中的以下 SRS 组合被认为是有效的： 地理 SRS + 垂直 SRS，在这种情况下，复合 SRS 的类型将是Geographic. 投影 SRS + 垂直 SRS，在这种情况下，复合 SRS 的类型将是Projected. 如果 SRS 的组合不同，复合 SRS 的类型将为Unknown. |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle) { get; } | 返回此 SRS 是否为单个（不是两个 SRS 的并集）。 |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid) { get; } | 同[`Validate`](../spatialreferencesystem/validate)，但不返回错误信息。 |
| abstract [LinearUnit](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/linearunit) { get; } | 单位，用于此 SRS 中的线性尺寸和线性参数[`Projection`](./projection). |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name) { get; } | 此对象的名称。 |
| abstract [PrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/primemeridian) { get; } | 返回此 SRS 的本初子午线。 |
| abstract [Projection](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/projection) { get; } | 投影，应用于[`Base`](./base)得到这个 SRS. |
| [Type](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/type) { get; } | 返回Projected. |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto)(SpatialReferenceSystem) | 从这里创建转换`空间参考系统`给另一个`空间参考系统`. |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt)() | 将此 SRS 的表示形式返回为 WKT 字符串。 结果 WKT 字符串将匹配 OGC 01-009 规范，通常命名为“WKT1”。 |
| abstract [GetAxis](../../aspose.gis.spatialreferencing/spatialreferencesystem/getaxis)(int) | 获取[`Axis`](../axis)描述维度. |
| abstract [GetUnit](../../aspose.gis.spatialreferencing/spatialreferencesystem/getunit)(int) | 获取[`Unit`](../unit)尺寸. |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent)(SpatialReferenceSystem) | 检测此 SRS 是否等同于其他 SRS。. |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring)() | 返回表示当前对象的字符串。 |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | 从这里创建转换`空间参考系统`给另一个`空间参考系统`. |
| abstract [Validate](../../aspose.gis.spatialreferencing/spatialreferencesystem/validate)(out string) | 确定此 SRS 是否有效。 |

### 也可以看看

* class [SpatialReferenceSystem](../spatialreferencesystem)
* 命名空间 [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing)
* 部件 [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
