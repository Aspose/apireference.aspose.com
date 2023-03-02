---
title: Class Identifier
second_title: Aspose.GIS voor .NET API-referentie
description: Aspose.Gis.SpatialReferencing.Identifier klas. Vertegenwoordigt een identifier  een verwijzing naar externe beschrijving van een object. Als u een SRS maakt van WKTIdentifier komt overeen met het sleutelwoord AUTHORITY.
type: docs
weight: 2160
url: /nl/net/aspose.gis.spatialreferencing/identifier/
---
## Identifier class

Vertegenwoordigt een identifier - een verwijzing naar externe beschrijving van een object. Als u een SRS maakt van WKT,`Identifier` komt overeen met het sleutelwoord "AUTHORITY".

```csharp
public class Identifier : IEquatable<Identifier>
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [Identifier](identifier/)(string, string) | Nieuwe instantie maken. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [AuthorityName](../../aspose.gis.spatialreferencing/identifier/authorityname/) { get; } | Een naam van autoriteit, die een[`AuthorityUniqueIdentifier`](./authorityuniqueidentifier/) . |
| [AuthorityUniqueIdentifier](../../aspose.gis.spatialreferencing/identifier/authorityuniqueidentifier/) { get; } | Een unieke manier om een object binnen een[`AuthorityName`](./authorityname/) . |

## methoden

| Naam | Beschrijving |
| --- | --- |
| static [Epsg](../../aspose.gis.spatialreferencing/identifier/epsg/)(int) | Creëert een nieuwe identificatie die de EPSG-identificatie met code vertegenwoordigt*epsgCode* . |
| [Equals](../../aspose.gis.spatialreferencing/identifier/equals/#equals)(Identifier) | Geeft aan of het huidige object gelijk is aan een ander object van hetzelfde type. |
| override [Equals](../../aspose.gis.spatialreferencing/identifier/equals/#equals_1)(object) | Bepaalt of het opgegeven object gelijk is aan het huidige object. |
| [GetEpsgCode](../../aspose.gis.spatialreferencing/identifier/getepsgcode/)() | Als dit object een geldige EPSG-identificatie vertegenwoordigt (bijv. de naam van de autoriteit is "EPSG" en de unieke identificatie van de autoriteit is een geheel getal) - geef het terug. Anders - retourneer -1. |
| override [GetHashCode](../../aspose.gis.spatialreferencing/identifier/gethashcode/)() | Dient als de standaard hash-functie. |
| [operator ==](../../aspose.gis.spatialreferencing/identifier/op_equality/) | Implementeert de operator ==. |
| [operator !=](../../aspose.gis.spatialreferencing/identifier/op_inequality/) | Implementeert de operator !=. |

### Voorbeelden

WGS 84 Ruimtelijk referentiesysteem heeft EPSG-code 4326, dus het kan identifier bevatten: WGS 84 Ellipsoid heeft EPSG-code 7030 en bevat mogelijk de volgende identificatie:

```csharp
new  {  = "EPSG",  = 4326 };
```

```csharp
new  {  = "EPSG",  = 7030 };
```

### Zie ook

* naamruimte [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* montage [Aspose.GIS](../../)


