---
title: Class GeocentricSpatialReferenceSystemParameters
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.SpatialReferencing.GeocentricSpatialReferenceSystemParameters class. Parameters to create geocentric SRS. Parameters have reasonable defaults so you will have to assign only some of them. If you assign null to any parameter a default value will be used
type: docs
weight: 4550
url: /net/aspose.gis.spatialreferencing/geocentricspatialreferencesystemparameters/
---
## GeocentricSpatialReferenceSystemParameters class

Parameters to create geocentric SRS. Parameters have reasonable defaults, so you will have to assign only some of them. If you assign `null` to any parameter, a default value will be used.

```csharp
public class GeocentricSpatialReferenceSystemParameters
```

## Constructors

| Name | Description |
| --- | --- |
| [GeocentricSpatialReferenceSystemParameters](geocentricspatialreferencesystemparameters/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [AxisesOrder](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystemparameters/axisesorder/) { get; set; } | Order of axises. Defaults to XYZ. |
| [Datum](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystemparameters/datum/) { get; set; } | Datum of geocentric SRS. Default is [`Wgs84`](../geographicdatum/wgs84/). |
| [LinearUnit](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystemparameters/linearunit/) { get; set; } | Units to be used in this SRS. Defaults to [`Meter`](../unit/meter/). |
| [Name](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystemparameters/name/) { get; set; } | Name of geocentric SRS. Default is "Unnamed". |
| [PrimeMeridian](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystemparameters/primemeridian/) { get; set; } | Prime meridian of this SRS. Default is [`Greenwich`](../primemeridian/greenwich/). |
| [XAxis](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystemparameters/xaxis/) { get; set; } | Axis of geocentric SRS that describes 'X' dimension (axis that points at prime meridian). |
| [YAxis](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystemparameters/yaxis/) { get; set; } | Axis of geocentric SRS that describes 'Y' dimension (axis that points to the left or to the right of X axis on equatorial plane). Defaults to axis with East direction. |
| [ZAxis](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystemparameters/zaxis/) { get; set; } | Axis of geocentric SRS that describes 'Z' dimension (axis that points to the north or south pole). Defaults to axis with North direction. |

### See Also

* namespace [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* assembly [Aspose.GIS](../../)


