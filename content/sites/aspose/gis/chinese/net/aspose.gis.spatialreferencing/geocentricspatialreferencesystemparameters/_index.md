---
title: Class GeocentricSpatialReferenceSystemParameters
second_title: Aspose.GIS for .NET API 参考
description: Aspose.Gis.SpatialReferencing.GeocentricSpatialReferenceSystemParameters 班级. 创建地心 SRS 的参数 参数具有合理的默认值因此您只需分配其中的一些参数 如果您分配null对于任何参数将使用默认值
type: docs
weight: 2100
url: /zh/net/aspose.gis.spatialreferencing/geocentricspatialreferencesystemparameters/
---
## GeocentricSpatialReferenceSystemParameters class

创建地心 SRS 的参数。 参数具有合理的默认值，因此您只需分配其中的一些参数。 如果您分配`null`对于任何参数，将使用默认值。

```csharp
public class GeocentricSpatialReferenceSystemParameters
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [GeocentricSpatialReferenceSystemParameters](geocentricspatialreferencesystemparameters/)() | 默认构造函数。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [AxisesOrder](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystemparameters/axisesorder/) { get; set; } | 轴顺序。默认为XYZ. |
| [Datum](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystemparameters/datum/) { get; set; } | 地心 SRS 的基准。默认是[`Wgs84`](../geographicdatum/wgs84/). |
| [LinearUnit](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystemparameters/linearunit/) { get; set; } | 在此 SRS 中使用的单位。默认为[`Meter`](../unit/meter/). |
| [Name](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystemparameters/name/) { get; set; } | 地心 SRS 的名称。默认为“未命名”. |
| [PrimeMeridian](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystemparameters/primemeridian/) { get; set; } | 此 SRS 的本初子午线。默认是[`Greenwich`](../primemeridian/greenwich/). |
| [XAxis](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystemparameters/xaxis/) { get; set; } | 描述“X”维度的地心 SRS 轴（指向本初子午线的轴）。 |
| [YAxis](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystemparameters/yaxis/) { get; set; } | 描述“Y”维度的地心 SRS 轴（在赤道面上指向 X 轴左侧或右侧的轴）。 默认为轴East方向. |
| [ZAxis](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystemparameters/zaxis/) { get; set; } | 描述“Z”维度的地心 SRS 轴（指向北极或南极的轴）。 默认为轴North方向. |

### 也可以看看

* 命名空间 [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* 部件 [Aspose.GIS](../../)


