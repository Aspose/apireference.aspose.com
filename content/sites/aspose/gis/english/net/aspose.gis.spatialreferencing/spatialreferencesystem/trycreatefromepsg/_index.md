---
title: SpatialReferenceSystem.TryCreateFromEpsg
second_title: Aspose.GIS for .NET API Reference
description: SpatialReferenceSystem method. Create a spatial reference system based the specified EPSG code.
type: docs
weight: 400
url: /net/aspose.gis.spatialreferencing/spatialreferencesystem/trycreatefromepsg/
---
## SpatialReferenceSystem.TryCreateFromEpsg method

Create a spatial reference system based the specified EPSG code.

```csharp
public static bool TryCreateFromEpsg(int epsg, out SpatialReferenceSystem value)
```

| Parameter | Type | Description |
| --- | --- | --- |
| epsg | Int32 | EPSG code of the spatial reference system. |
| value | SpatialReferenceSystem& | When this methods returns `true`, contains a SRS with the specified EPSG code; otherwise, contains `null`. |

### Return Value

`true` if specified EPSG code is known and SRS was created; `false` otherwise.

### See Also

* method [CreateFromEpsg](../createfromepsg/)
* class [SpatialReferenceSystem](../)
* namespace [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* assembly [Aspose.GIS](../../../)


