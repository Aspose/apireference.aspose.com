---
title: GeoGenerator.ProduceStars
second_title: Aspose.GIS for .NET API Reference
description: GeoGenerator method. Creates an array of stars all of them within a given extent.
type: docs
weight: 40
url: /net/aspose.gis.geotools/geogenerator/producestars/
---
## GeoGenerator.ProduceStars method

Creates an array of stars, all of them within a given extent.

```csharp
public static IEnumerable<IPolygon> ProduceStars(Extent rect, StarGeneratorOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| rect | Extent | Specified area (see [`Extent`](../../../aspose.gis/extent/)) |
| options | StarGeneratorOptions | Polygon creation options (see [`StarGeneratorOptions`](../../stargeneratoroptions/)) |

### Return Value

Array of stars (see enumeration of [`IPolygon`](../../../aspose.gis.geometries/ipolygon/))

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentOutOfRangeException | Number of stars must be grater then one. |
| NullReferenceException | Extent must have a value (not be NULL) |
| ArgumentException | The minimum and maximum lengths must be unequal and greater than 3 |
| ArgumentException | The maximum length must be greater than the minimum |

### See Also

* interface [IPolygon](../../../aspose.gis.geometries/ipolygon/)
* class [Extent](../../../aspose.gis/extent/)
* class [StarGeneratorOptions](../../stargeneratoroptions/)
* class [GeoGenerator](../)
* namespace [Aspose.Gis.GeoTools](../../geogenerator/)
* assembly [Aspose.GIS](../../../)


