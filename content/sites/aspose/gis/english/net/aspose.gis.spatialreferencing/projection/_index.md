---
title: Class Projection
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.SpatialReferencing.Projection class. Represents a projection method with parameters that transforms longitude latitude to x y
type: docs
weight: 4690
url: /net/aspose.gis.spatialreferencing/projection/
---
## Projection class

Represents a projection method with parameters, that transforms (longitude, latitude) to (x, y).

```csharp
public class Projection : IdentifiableObject
```

## Properties

| Name | Description |
| --- | --- |
| [AngularParametersUnit](../../aspose.gis.spatialreferencing/projection/angularparametersunit/) { get; } | Unit that is used for angular parameters. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | If this objects identifier is EPSG identifier - return its code. Otherwise - return -1. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Identifier of this identifiable object. |
| [LinearParametersUnit](../../aspose.gis.spatialreferencing/projection/linearparametersunit/) { get; } | Unit that is used for linear parameters. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Name of this object. |
| [ParametersNames](../../aspose.gis.spatialreferencing/projection/parametersnames/) { get; } | Gets an enumerable collection of names of parameters given to this projection |

## Methods

| Name | Description |
| --- | --- |
| [GetParameterValue](../../aspose.gis.spatialreferencing/projection/getparametervalue/)(string, ParameterType) | Gets parameter with specified name of this projection. |
| [IsEquivalent](../../aspose.gis.spatialreferencing/projection/isequivalent/)(Projection) | Determines is two projections are equivalent. Equivalent projections map (longitude, latitude) to (x, y) in the same way. |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Returns a string that represents the current object. |
| [TryGetParameterValue](../../aspose.gis.spatialreferencing/projection/trygetparametervalue/)(string, ParameterType) | Gets parameter with specified name of this projection. If there are no such parameter - returns `null`. |

### See Also

* class [IdentifiableObject](../identifiableobject/)
* namespace [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* assembly [Aspose.GIS](../../)


