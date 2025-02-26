---
title: Class Ellipsoid
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.SpatialReferencing.Ellipsoid class. Ellipsoid represents an ellipsoid which approximates earth
type: docs
weight: 4520
url: /net/aspose.gis.spatialreferencing/ellipsoid/
---
## Ellipsoid class

Ellipsoid represents an ellipsoid, which approximates earth.

```csharp
public class Ellipsoid : IdentifiableObject
```

## Constructors

| Name | Description |
| --- | --- |
| [Ellipsoid](ellipsoid/)(string, double, double, Identifier) | Creates new Ellipsoid. |

## Properties

| Name | Description |
| --- | --- |
| static [Airy](../../aspose.gis.spatialreferencing/ellipsoid/airy/) { get; } | Airy ellipsoid. |
| static [Grs80](../../aspose.gis.spatialreferencing/ellipsoid/grs80/) { get; } | GRS 1980 Ellipsoid. |
| static [Wgs72](../../aspose.gis.spatialreferencing/ellipsoid/wgs72/) { get; } | WGS 72 Ellipsoid. |
| static [Wgs84](../../aspose.gis.spatialreferencing/ellipsoid/wgs84/) { get; } | WGS 84 Ellipsoid. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | If this objects identifier is EPSG identifier - return its code. Otherwise - return -1. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Identifier of this identifiable object. |
| [InverseFlattening](../../aspose.gis.spatialreferencing/ellipsoid/inverseflattening/) { get; } | Inverse flattening of ellipsoid. 0 if this is a sphere. |
| [IsSphere](../../aspose.gis.spatialreferencing/ellipsoid/issphere/) { get; } | Detects whether this ellipsoid is a sphere. |
| [IsValid](../../aspose.gis.spatialreferencing/ellipsoid/isvalid/) { get; } | Detects whether ellipsoid is valid: its semi major axis is more then 0 and inverse flattening is positive or equal to 0. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Name of this object. |
| [SemiMajorAxis](../../aspose.gis.spatialreferencing/ellipsoid/semimajoraxis/) { get; } | Semi major axis of ellipsoid. |
| [SemiMinorAxis](../../aspose.gis.spatialreferencing/ellipsoid/semiminoraxis/) { get; } | Semi minor axis of ellipsoid. Equals to semi major axis if this is a sphere. |

## Methods

| Name | Description |
| --- | --- |
| [IsEquivalent](../../aspose.gis.spatialreferencing/ellipsoid/isequivalent/)(Ellipsoid) | Determines if two ellipsoids are equivalent. If ellipsoid A is equivalent to ellipsoid B, then they have same semi major axis and inverse flattening. |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Returns a string that represents the current object. |
| static [IsEquivalent](../../aspose.gis.spatialreferencing/ellipsoid/isequivalent/)(Ellipsoid, Ellipsoid) | Determines if two ellipsoids are equivalent. If ellipsoid A is equivalent to ellipsoid B, then they have same semi major axis and inverse flattening. |

### See Also

* class [IdentifiableObject](../identifiableobject/)
* namespace [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* assembly [Aspose.GIS](../../)


