---
title: SpatialReferenceSystem.CreateFromWkt
second_title: Aspose.GIS for .NET API Reference
description: SpatialReferenceSystem method. Creates a new SpatialReferenceSystem based on WKT WellKnown Text string
type: docs
weight: 20
url: /net/aspose.gis.spatialreferencing/spatialreferencesystem/createfromwkt/
---
## SpatialReferenceSystem.CreateFromWkt method

Creates a new `SpatialReferenceSystem` based on WKT (Well-Known Text) string.

```csharp
public static SpatialReferenceSystem CreateFromWkt(string wkt)
```

| Parameter | Type | Description |
| --- | --- | --- |
| wkt | String | WKT string. |

### Return Value

New `SpatialReferenceSystem`.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Argument is `null`. |
| FormatException | Hierarchy of wkt values, their order or types, is wrong. |
| NotSupportedException | WKT root element is not supported (for examples it is FITTED_CS). |

### See Also

* method [TryCreateFromWkt](../trycreatefromwkt/)
* class [SpatialReferenceSystem](../)
* namespace [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* assembly [Aspose.GIS](../../../)


