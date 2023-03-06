---
title: Class Projection
second_title: Aspose.GIS voor .NET API-referentie
description: Aspose.Gis.SpatialReferencing.Projection klas. Vertegenwoordigt een projectiemethode met parameters die lengtegraad breedtegraad transformeert naar x y.
type: docs
weight: 2240
url: /nl/net/aspose.gis.spatialreferencing/projection/
---
## Projection class

Vertegenwoordigt een projectiemethode met parameters, die (lengtegraad, breedtegraad) transformeert naar (x, y).

```csharp
public class Projection : IdentifiableObject
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [AngularParametersUnit](../../aspose.gis.spatialreferencing/projection/angularparametersunit/) { get; } | Eenheid die wordt gebruikt voor hoekparameters. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Als deze object-ID een EPSG-ID is - geef de code terug. Anders - retourneer -1. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Identificatie van dit identificeerbare object. |
| [LinearParametersUnit](../../aspose.gis.spatialreferencing/projection/linearparametersunit/) { get; } | Eenheid die wordt gebruikt voor lineaire parameters. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Naam van dit object. |
| [ParametersNames](../../aspose.gis.spatialreferencing/projection/parametersnames/) { get; } | Krijgt een ontelbare verzameling namen van parameters die aan deze projectie zijn gegeven |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [GetParameterValue](../../aspose.gis.spatialreferencing/projection/getparametervalue/)(string, ParameterType) | Krijgt parameter met opgegeven naam van deze projectie. |
| [IsEquivalent](../../aspose.gis.spatialreferencing/projection/isequivalent/)(Projection) | Bepaalt of twee projecties equivalent zijn. Equivalente projecties brengen (lengtegraad, breedtegraad) in kaart (x, y) in the op dezelfde manier. |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Retourneert een tekenreeks die het huidige object vertegenwoordigt. |
| [TryGetParameterValue](../../aspose.gis.spatialreferencing/projection/trygetparametervalue/)(string, ParameterType) | Haalt de parameter op met de opgegeven naam van deze projectie. Als er geen dergelijke parameter is - retourneert`null` . |

### Zie ook

* class [IdentifiableObject](../identifiableobject/)
* naamruimte [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* montage [Aspose.GIS](../../)


