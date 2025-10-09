---
title: Class Unit
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.SpatialReferencing.Unit class. Represent measurement unit
type: docs
weight: 4740
url: /net/aspose.gis.spatialreferencing/unit/
---
## Unit class

Represent measurement unit.

```csharp
public class Unit : IdentifiableObject
```

## Constructors

| Name | Description |
| --- | --- |
| [Unit](unit/)(string, double, Identifier) | Create new instance. |

## Properties

| Name | Description |
| --- | --- |
| static [Degree](../../aspose.gis.spatialreferencing/unit/degree/) { get; } | Get Unit that represents degrees. |
| static [Meter](../../aspose.gis.spatialreferencing/unit/meter/) { get; } | Get Unit that represents meters. |
| static [Radian](../../aspose.gis.spatialreferencing/unit/radian/) { get; } | Get Unit that represents radians. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | If this objects identifier is EPSG identifier - return its code. Otherwise - return -1. |
| [Factor](../../aspose.gis.spatialreferencing/unit/factor/) { get; } | Factor to meter, if this is length unit, factor to radian, if this is angle unit. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Identifier of this identifiable object. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Name of this object. |

## Methods

| Name | Description |
| --- | --- |
| [Apply](../../aspose.gis.spatialreferencing/unit/apply/)(double) | Converts argument to unit, described by this instance. |
| [Deapply](../../aspose.gis.spatialreferencing/unit/deapply/)(double) | Converts argument from unit, described by this instance, to radians or meters. |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Returns a string that represents the current object. |

### See Also

* class [IdentifiableObject](../identifiableobject/)
* namespace [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* assembly [Aspose.GIS](../../)


