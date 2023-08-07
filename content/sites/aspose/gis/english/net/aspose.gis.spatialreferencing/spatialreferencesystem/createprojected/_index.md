---
title: SpatialReferenceSystem.CreateProjected
second_title: Aspose.GIS for .NET API Reference
description: SpatialReferenceSystem method. Create projected SRS from custom parameters
type: docs
weight: 380
url: /net/aspose.gis.spatialreferencing/spatialreferencesystem/createprojected/
---
## SpatialReferenceSystem.CreateProjected method

Create projected SRS from custom parameters.

```csharp
public static ProjectedSpatialReferenceSystem CreateProjected(
    ProjectedSpatialReferenceSystemParameters parameters, Identifier identifier = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| parameters | ProjectedSpatialReferenceSystemParameters | Parameters to create from. |
| identifier | Identifier | Identifier, that will be attached to SRS. Attaching an Identifier will not modify other SRS parameters. Its up to you to ensure consistency of identifier and SRS parameters. |

### Return Value

New Projected SRS.

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | Base SRS in parameters is `null`. Projection method in parameters is `null`. |

### See Also

* class [ProjectedSpatialReferenceSystem](../../projectedspatialreferencesystem/)
* class [ProjectedSpatialReferenceSystemParameters](../../projectedspatialreferencesystemparameters/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* namespace [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* assembly [Aspose.GIS](../../../)


