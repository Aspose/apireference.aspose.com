---
title: SpatialReferenceSystem.CreateFromEpsg
second_title: Aspose.GIS for .NET API Reference
description: SpatialReferenceSystem method. Create a spatial reference system based the specified EPSG code
type: docs
weight: 10
url: /net/aspose.gis.spatialreferencing/spatialreferencesystem/createfromepsg/
---
## SpatialReferenceSystem.CreateFromEpsg method

Create a spatial reference system based the specified EPSG code.

```csharp
public static SpatialReferenceSystem CreateFromEpsg(int epsg)
```

| Parameter | Type | Description |
| --- | --- | --- |
| epsg | Int32 | EPSG code of the spatial reference system. |

### Return Value

A new spatial reference system with the specified EPSG code.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentOutOfRangeException | Argument is not positive. |
| NotSupportedException | The specified EPSG code is unknown. |

### See Also

* method [TryCreateFromEpsg](../trycreatefromepsg/)
* class [SpatialReferenceSystem](../)
* namespace [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* assembly [Aspose.GIS](../../../)


