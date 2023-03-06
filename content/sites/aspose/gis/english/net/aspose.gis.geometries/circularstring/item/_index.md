---
title: CircularString.Item
second_title: Aspose.GIS for .NET API Reference
description: CircularString property. Gets or sets the IPoint at the specified index.
type: docs
weight: 90
url: /net/aspose.gis.geometries/circularstring/item/
---
## CircularString indexer

Gets or sets the [`IPoint`](../../ipoint/) at the specified index.

```csharp
public IPoint this[int index] { get; set; }
```

| Parameter | Description |
| --- | --- |
| index | The index. |

### Property Value

The [`IPoint`](../../ipoint/).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentOutOfRangeException | Index is out of range. |
| ArgumentNullException | The value is `null`. |
| ArgumentException | Point is empty. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) of this geometry and [`SpatialReferenceSystem`](../spatialreferencesystem/) of argument are both not `null` and don't equal to each other. |

### See Also

* interface [IPoint](../../ipoint/)
* class [CircularString](../)
* namespace [Aspose.Gis.Geometries](../../circularstring/)
* assembly [Aspose.GIS](../../../)


