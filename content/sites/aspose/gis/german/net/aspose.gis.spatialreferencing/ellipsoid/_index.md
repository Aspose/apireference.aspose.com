---
title: Class Ellipsoid
second_title: Aspose.GIS für .NET-API-Referenz
description: Aspose.Gis.SpatialReferencing.Ellipsoid klas. Ellipsoid stellt ein Ellipsoid dar das sich der Erde annähert.
type: docs
weight: 2070
url: /de/net/aspose.gis.spatialreferencing/ellipsoid/
---
## Ellipsoid class

Ellipsoid stellt ein Ellipsoid dar, das sich der Erde annähert.

```csharp
public class Ellipsoid : IdentifiableObject
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [Ellipsoid](ellipsoid/)(string, double, double, Identifier) | Erstellt ein neues Ellipsoid. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| static [Airy](../../aspose.gis.spatialreferencing/ellipsoid/airy/) { get; } | Luftiges Ellipsoid. |
| static [Grs80](../../aspose.gis.spatialreferencing/ellipsoid/grs80/) { get; } | GRS 1980 Ellipsoid. |
| static [Wgs72](../../aspose.gis.spatialreferencing/ellipsoid/wgs72/) { get; } | WGS 72 Ellipsoid. |
| static [Wgs84](../../aspose.gis.spatialreferencing/ellipsoid/wgs84/) { get; } | WGS 84 Ellipsoid. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Wenn dieser Objektbezeichner ein EPSG-Bezeichner ist - geben Sie seinen Code zurück. Andernfalls - gib -1. zurück |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Kennung dieses identifizierbaren Objekts. |
| [InverseFlattening](../../aspose.gis.spatialreferencing/ellipsoid/inverseflattening/) { get; } | Inverse Abflachung des Ellipsoids. 0, wenn es sich um eine Kugel handelt. |
| [IsSphere](../../aspose.gis.spatialreferencing/ellipsoid/issphere/) { get; } | Erkennt, ob dieses Ellipsoid eine Kugel ist. |
| [IsValid](../../aspose.gis.spatialreferencing/ellipsoid/isvalid/) { get; } | Erkennt, ob das Ellipsoid gültig ist: seine große Halbachse ist größer als 0 und die inverse Abflachung ist positiv oder gleich 0. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Name dieses Objekts. |
| [SemiMajorAxis](../../aspose.gis.spatialreferencing/ellipsoid/semimajoraxis/) { get; } | Große Halbachse des Ellipsoids. |
| [SemiMinorAxis](../../aspose.gis.spatialreferencing/ellipsoid/semiminoraxis/) { get; } | Kleine Halbachse des Ellipsoids. Entspricht der großen Halbachse, wenn es sich um eine Kugel handelt. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [IsEquivalent](../../aspose.gis.spatialreferencing/ellipsoid/isequivalent/)(Ellipsoid) | Bestimmt, ob zwei Ellipsoide äquivalent sind. Wenn Ellipsoid A Ellipsoid B entspricht, dann haben sie dieselbe große Halbachse und umgekehrte Abflachung. |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Gibt eine Zeichenfolge zurück, die das aktuelle Objekt darstellt. |
| static [IsEquivalent](../../aspose.gis.spatialreferencing/ellipsoid/isequivalent/)(Ellipsoid, Ellipsoid) | Bestimmt, ob zwei Ellipsoide äquivalent sind. Wenn Ellipsoid A Ellipsoid B entspricht, dann haben sie dieselbe große Halbachse und umgekehrte Abflachung. |

### Siehe auch

* class [IdentifiableObject](../identifiableobject/)
* namensraum [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* Montage [Aspose.GIS](../../)


