---
title: GeoGenerator.ProducePolygons
second_title: Aspose.GIS for .NET API Reference
description: GeoGenerator method. Creates a new IPolygon Enumerator with a given number of random items all of them within a given extent
type: docs
weight: 30
url: /net/aspose.gis.geotools/geogenerator/producepolygons/
---
## GeoGenerator.ProducePolygons method

Creates a new IPolygon Enumerator with a given number of random items, all of them within a given extent.

```csharp
public static IEnumerable<IPolygon> ProducePolygons(Extent rect, PolygonGeneratorOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| rect | Extent | Specified area (see [`Extent`](../../../aspose.gis/extent/)) |
| options | PolygonGeneratorOptions | Polygon creation options (see [`PolygonGeneratorOptions`](../../polygongeneratoroptions/)) |

### Return Value

Array of polygons (see enumeration of [`IPolygon`](../../../aspose.gis.geometries/ipolygon/))

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentOutOfRangeException | Number of polygons must be grater then one. |
| NullReferenceException | Extent must have a value (not be NULL) |
| ArgumentException | The minimum and maximum lengths must be unequal and greater than 0 |
| ArgumentException | The maximum length must be greater than the minimum |

### See Also

* interface [IPolygon](../../../aspose.gis.geometries/ipolygon/)
* class [Extent](../../../aspose.gis/extent/)
* class [PolygonGeneratorOptions](../../polygongeneratoroptions/)
* class [GeoGenerator](../)
* namespace [Aspose.Gis.GeoTools](../../geogenerator/)
* assembly [Aspose.GIS](../../../)


