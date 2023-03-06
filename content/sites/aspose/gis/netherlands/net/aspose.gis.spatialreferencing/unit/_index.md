---
title: Class Unit
second_title: Aspose.GIS voor .NET API-referentie
description: Aspose.Gis.SpatialReferencing.Unit klas. Vertegenwoordigen meeteenheid.
type: docs
weight: 2290
url: /nl/net/aspose.gis.spatialreferencing/unit/
---
## Unit class

Vertegenwoordigen meeteenheid.

```csharp
public class Unit : IdentifiableObject
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [Unit](unit/)(string, double, Identifier) | Nieuwe instantie maken. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| static [Degree](../../aspose.gis.spatialreferencing/unit/degree/) { get; } | Krijg Eenheid die graden vertegenwoordigt. |
| static [Meter](../../aspose.gis.spatialreferencing/unit/meter/) { get; } | Krijg Eenheid die meter vertegenwoordigt. |
| static [Radian](../../aspose.gis.spatialreferencing/unit/radian/) { get; } | Get Eenheid die radialen vertegenwoordigt. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Als deze object-ID een EPSG-ID is - geef de code terug. Anders - retourneer -1. |
| [Factor](../../aspose.gis.spatialreferencing/unit/factor/) { get; } | Factor naar meter, als dit de lengte-eenheid is, factor naar radialen, als dit de hoekeenheid is. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Identificatie van dit identificeerbare object. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Naam van dit object. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [Apply](../../aspose.gis.spatialreferencing/unit/apply/)(double) | Converteert argument naar eenheid, beschreven door deze instantie. |
| [Deapply](../../aspose.gis.spatialreferencing/unit/deapply/)(double) | Converteert argument van eenheid, beschreven door deze instantie, naar radialen of meters. |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Retourneert een tekenreeks die het huidige object vertegenwoordigt. |

### Zie ook

* class [IdentifiableObject](../identifiableobject/)
* naamruimte [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* montage [Aspose.GIS](../../)


