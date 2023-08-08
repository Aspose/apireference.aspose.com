---
title: Geometry.Relate
second_title: Aspose.GIS for .NET API Reference
description: Geometry method. Determines if DE9IM intersection matrix of this geometry and a specified geometry matches provided pattern
type: docs
weight: 300
url: /net/aspose.gis.geometries/geometry/relate/
---
## Geometry.Relate method

Determines if DE-9IM intersection matrix of this geometry and a specified geometry matches provided pattern.

```csharp
public bool Relate(IGeometry other, string intersectionPatternMatrix)
```

| Parameter | Type | Description |
| --- | --- | --- |
| other | IGeometry | A geometry. |
| intersectionPatternMatrix | String | A patter to match with. This should be a string with length equal to 9. Each character of the string represent expected dimension of an intersection: character 0 - between interiors of the geometries.character 1 - between interior of this geometry and boundary of another geometry.character 2 - between interior of this geometry and exterior of another geometry.character 3 - between boundary of this geometry and interior of another geometry.character 4 - between boundaries of the geometries.character 5 - between boundary of this geometry and exterior of another geometry.character 6 - between exterior of this geometry and interior of another geometry.character 7 - between exterior of this geometry and boundary of another geometry.character 8 - between exteriors of the geometries. Possible values of each characters are: * - any value;F - no intersection;T - any intersection;0 - point intersection (e.g. shared point);1 - line intersection (e.g. shared segment of line);2 - area intersection (e.g. shared part of polygon); For example, an intersection pattern "F0*******" means, that there should not be intersection between geometries interiors and intersection between geometries boundaries must be a point. See OpenGIS Simple Features Specification for more details about intersection matrix pattern. |

### Return Value

`true` if this intersection matrix matches patter; `false` otherwise.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | *other* is `null`. |
| ArgumentException | One of the geometries is invalid in such way that operation can not be finished. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) of geometries are not equivalent. You can use [`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) in order to convert geometries to the same spatial reference system. |

## Remarks

This method builds DE-9IM intersection matrix and matches it with the pattern See OpenGIS Simple Features Specification for more details about DE-9IM intersection matrix.

## Examples

The following code:

```csharp
geometry.Relate(other, "T*F**FFF*");
```

will detect whether geometries are spatially equal.

### See Also

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* namespace [Aspose.Gis.Geometries](../../geometry/)
* assembly [Aspose.GIS](../../../)


