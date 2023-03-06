---
title: Class Unit
second_title: Aspose.GIS für .NET-API-Referenz
description: Aspose.Gis.SpatialReferencing.Unit klas. Stellt die Maßeinheit dar.
type: docs
weight: 2290
url: /de/net/aspose.gis.spatialreferencing/unit/
---
## Unit class

Stellt die Maßeinheit dar.

```csharp
public class Unit : IdentifiableObject
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [Unit](unit/)(string, double, Identifier) | Neue Instanz erstellen. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| static [Degree](../../aspose.gis.spatialreferencing/unit/degree/) { get; } | Holen Sie sich die Einheit, die Grad darstellt. |
| static [Meter](../../aspose.gis.spatialreferencing/unit/meter/) { get; } | Holen Sie sich eine Einheit, die Meter darstellt. |
| static [Radian](../../aspose.gis.spatialreferencing/unit/radian/) { get; } | Holen Sie sich die Einheit, die das Bogenmaß darstellt. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Wenn dieser Objektbezeichner ein EPSG-Bezeichner ist - geben Sie seinen Code zurück. Andernfalls - gib -1. zurück |
| [Factor](../../aspose.gis.spatialreferencing/unit/factor/) { get; } | Faktor in Meter, wenn Längeneinheit, Faktor in Bogenmaß, wenn Winkeleinheit. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Kennung dieses identifizierbaren Objekts. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Name dieses Objekts. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [Apply](../../aspose.gis.spatialreferencing/unit/apply/)(double) | Konvertiert Argument in Einheit, beschrieben durch diese Instanz. |
| [Deapply](../../aspose.gis.spatialreferencing/unit/deapply/)(double) | Konvertiert das Argument von der durch diese Instanz beschriebenen Einheit in Bogenmaß oder Meter. |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Gibt eine Zeichenfolge zurück, die das aktuelle Objekt darstellt. |

### Siehe auch

* class [IdentifiableObject](../identifiableobject/)
* namensraum [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* Montage [Aspose.GIS](../../)


