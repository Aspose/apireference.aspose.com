---
title: Class Ellipsoid
second_title: Aspose.GIS voor .NET API-referentie
description: Aspose.Gis.SpatialReferencing.Ellipsoid klas. Ellipsoïde vertegenwoordigt een ellipsoïde die de aarde benadert.
type: docs
weight: 2070
url: /nl/net/aspose.gis.spatialreferencing/ellipsoid/
---
## Ellipsoid class

Ellipsoïde vertegenwoordigt een ellipsoïde, die de aarde benadert.

```csharp
public class Ellipsoid : IdentifiableObject
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [Ellipsoid](ellipsoid/)(string, double, double, Identifier) | Creëert nieuwe ellipsoïde. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| static [Airy](../../aspose.gis.spatialreferencing/ellipsoid/airy/) { get; } | Luchtige ellipsoïde. |
| static [Grs80](../../aspose.gis.spatialreferencing/ellipsoid/grs80/) { get; } | GRS 1980 Ellipsoïde. |
| static [Wgs72](../../aspose.gis.spatialreferencing/ellipsoid/wgs72/) { get; } | WGS 72 Ellipsoïde. |
| static [Wgs84](../../aspose.gis.spatialreferencing/ellipsoid/wgs84/) { get; } | WGS 84 Ellipsoïde. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Als deze object-ID een EPSG-ID is - geef de code terug. Anders - retourneer -1. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Identificatie van dit identificeerbare object. |
| [InverseFlattening](../../aspose.gis.spatialreferencing/ellipsoid/inverseflattening/) { get; } | Inverse afvlakking van ellipsoïde. 0 als dit een bol is. |
| [IsSphere](../../aspose.gis.spatialreferencing/ellipsoid/issphere/) { get; } | Detecteert of deze ellipsoïde een bol is. |
| [IsValid](../../aspose.gis.spatialreferencing/ellipsoid/isvalid/) { get; } | Detecteert of ellipsoïde geldig is: de halve hoofdas is meer dan 0 en omgekeerde afvlakking is positief of gelijk aan 0. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Naam van dit object. |
| [SemiMajorAxis](../../aspose.gis.spatialreferencing/ellipsoid/semimajoraxis/) { get; } | Halve hoofdas van ellipsoïde. |
| [SemiMinorAxis](../../aspose.gis.spatialreferencing/ellipsoid/semiminoraxis/) { get; } | Halve kleine as van ellipsoïde. Is gelijk aan de halve lange as als dit een bol is. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [IsEquivalent](../../aspose.gis.spatialreferencing/ellipsoid/isequivalent/)(Ellipsoid) | Bepaalt of twee ellipsoïden equivalent zijn. Als ellipsoïde A equivalent is aan ellipsoïde B, dan hebben ze dezelfde halve lange as en omgekeerde afvlakking. |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Retourneert een tekenreeks die het huidige object vertegenwoordigt. |
| static [IsEquivalent](../../aspose.gis.spatialreferencing/ellipsoid/isequivalent/)(Ellipsoid, Ellipsoid) | Bepaalt of twee ellipsoïden equivalent zijn. Als ellipsoïde A equivalent is aan ellipsoïde B, dan hebben ze dezelfde halve lange as en omgekeerde afvlakking. |

### Zie ook

* class [IdentifiableObject](../identifiableobject/)
* naamruimte [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* montage [Aspose.GIS](../../)


