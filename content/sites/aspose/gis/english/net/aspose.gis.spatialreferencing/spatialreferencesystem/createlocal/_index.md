---
title: SpatialReferenceSystem.CreateLocal
second_title: Aspose.GIS for .NET API Reference
description: SpatialReferenceSystem method. Create local Spatial Reference System
type: docs
weight: 370
url: /net/aspose.gis.spatialreferencing/spatialreferencesystem/createlocal/
---
## SpatialReferenceSystem.CreateLocal method

Create local Spatial Reference System.

```csharp
public static LocalSpatialReferenceSystem CreateLocal(string name, LocalDatum datum, Unit unit, 
    ICollection<Axis> axises, Identifier identifier = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| name | String | Name of Spatial Reference System. |
| datum | LocalDatum | Datum to be used in SRS. |
| unit | Unit | Unit to be used in SRS. |
| axises | ICollection`1 | Axises to be used in SRS. Must be non empty |
| identifier | Identifier | Identifier, that will be attached to SRS. Attaching an Identifier will not modify other SRS parameters. Its up to you to ensure consistency of identifier and SRS parameters. |

### Return Value

New Local Spatial Reference System.

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | There must be at least one axis. |
| InvalidOperationException | *axises* is empty. |
| ArgumentNullException | Any argument, except *identifier* is null. |

### See Also

* class [LocalSpatialReferenceSystem](../../localspatialreferencesystem/)
* class [LocalDatum](../../localdatum/)
* class [Unit](../../unit/)
* class [Axis](../../axis/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* namespace [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* assembly [Aspose.GIS](../../../)


