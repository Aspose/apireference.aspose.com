---
title: SpatialReferenceSystem.CreateVertical
second_title: Aspose.GIS for .NET API Reference
description: SpatialReferenceSystem method. Create vertical SRS.
type: docs
weight: 390
url: /net/aspose.gis.spatialreferencing/spatialreferencesystem/createvertical/
---
## SpatialReferenceSystem.CreateVertical method

Create vertical SRS.

```csharp
public static VerticalSpatialReferenceSystem CreateVertical(string name, 
    VerticalDatum verticalDatum, Unit verticalUnit = null, Axis verticalAxis = null, 
    Identifier identifier = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| name | String | Name of SRS. If `null`. |
| verticalDatum | VerticalDatum | Datum to be used in SRS. |
| verticalUnit | Unit | Unit to be used in SRS. If `null`, [`Meter`](../../unit/meter/) will be used. |
| verticalAxis | Axis | Axis with "up" or "down" direction, to be used in SRS. If `null`, axis with up direction will be used. |
| identifier | Identifier | Identifier, that will be attached to SRS. Attaching an Identifier will not modify other SRS parameters. Its up to you to ensure consistency of identifier and SRS parameters. |

### Return Value

New Vertical SRS.

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | *verticalAxis* direction is not up or down. |
| ArgumentNullException | Some of required parameters is null. |

### See Also

* class [VerticalSpatialReferenceSystem](../../verticalspatialreferencesystem/)
* class [VerticalDatum](../../verticaldatum/)
* class [Unit](../../unit/)
* class [Axis](../../axis/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* namespace [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* assembly [Aspose.GIS](../../../)


