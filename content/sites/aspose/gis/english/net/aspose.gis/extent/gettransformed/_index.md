---
title: Extent.GetTransformed
second_title: Aspose.GIS for .NET API Reference
description: Extent method. Returns new extent in specified SpatialReferenceSystem that contains this extent
type: docs
weight: 150
url: /net/aspose.gis/extent/gettransformed/
---
## Extent.GetTransformed method

Returns new extent in specified [`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) that contains this extent.

```csharp
public Extent GetTransformed(SpatialReferenceSystem targetSrs)
```

| Parameter | Type | Description |
| --- | --- | --- |
| targetSrs | SpatialReferenceSystem | [`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) to transform to. |

### Return Value

The result of transformation this extent to the specified SRS.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Argument is `null`. |
| NotSupportedException | Transformation to the provided SRS is not supported. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | Transformation failed. |
| InvalidOperationException | [`SpatialReferenceSystem`](../spatialreferencesystem/) of this extent is `null`. |

### See Also

* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Extent](../)
* namespace [Aspose.Gis](../../extent/)
* assembly [Aspose.GIS](../../../)


