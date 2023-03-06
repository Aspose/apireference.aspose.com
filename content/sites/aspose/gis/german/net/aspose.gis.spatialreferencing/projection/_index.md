---
title: Class Projection
second_title: Aspose.GIS für .NET-API-Referenz
description: Aspose.Gis.SpatialReferencing.Projection klas. Stellt eine Projektionsmethode mit Parametern dar die Längengrad Breitengrad in x y umwandelt.
type: docs
weight: 2240
url: /de/net/aspose.gis.spatialreferencing/projection/
---
## Projection class

Stellt eine Projektionsmethode mit Parametern dar, die (Längengrad, Breitengrad) in (x, y) umwandelt.

```csharp
public class Projection : IdentifiableObject
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [AngularParametersUnit](../../aspose.gis.spatialreferencing/projection/angularparametersunit/) { get; } | Einheit, die für Winkelparameter verwendet wird. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Wenn dieser Objektbezeichner ein EPSG-Bezeichner ist - geben Sie seinen Code zurück. Andernfalls - gib -1. zurück |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Kennung dieses identifizierbaren Objekts. |
| [LinearParametersUnit](../../aspose.gis.spatialreferencing/projection/linearparametersunit/) { get; } | Einheit, die für lineare Parameter verwendet wird. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Name dieses Objekts. |
| [ParametersNames](../../aspose.gis.spatialreferencing/projection/parametersnames/) { get; } | Ruft eine aufzählbare Sammlung von Namen von Parametern ab, die dieser Projektion gegeben wurden |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [GetParameterValue](../../aspose.gis.spatialreferencing/projection/getparametervalue/)(string, ParameterType) | Ruft Parameter mit dem angegebenen Namen dieser Projektion ab. |
| [IsEquivalent](../../aspose.gis.spatialreferencing/projection/isequivalent/)(Projection) | Bestimmt, ob zwei Projektionen gleichwertig sind. Äquivalente Projektionen werden (Längengrad, Breitengrad) auf (x, y) auf die gleiche Weise abgebildet. |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Gibt eine Zeichenfolge zurück, die das aktuelle Objekt darstellt. |
| [TryGetParameterValue](../../aspose.gis.spatialreferencing/projection/trygetparametervalue/)(string, ParameterType) | Ruft Parameter mit dem angegebenen Namen dieser Projektion ab. Wenn es keinen solchen Parameter gibt - kehrt zurück`null` . |

### Siehe auch

* class [IdentifiableObject](../identifiableobject/)
* namensraum [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* Montage [Aspose.GIS](../../)


