---
title: Geometry.Relate
second_title: Aspose.GIS voor .NET API-referentie
description: Geometry methode. Bepaalt of DE9IM intersectiematrix van deze geometrie en een gespecificeerde geometrie overeenkomt met het verstrekte patroon.
type: docs
weight: 300
url: /nl/net/aspose.gis.geometries/geometry/relate/
---
## Geometry.Relate method

Bepaalt of DE-9IM intersectiematrix van deze geometrie en een gespecificeerde geometrie overeenkomt met het verstrekte patroon.

```csharp
public bool Relate(IGeometry other, string intersectionPatternMatrix)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| other | IGeometry | Een geometrie. |
| intersectionPatternMatrix | String | Een patroon om mee te matchen. Dit moet een tekenreeks zijn met een lengte gelijk aan 9. Elk teken van de tekenreeks vertegenwoordigt de verwachte dimensie van een intersectie: karakter 0 - tussen interieurs van de geometrieën.karakter 1 - tussen het interieur van deze geometrie en de grens van een andere geometrie.karakter 2 - tussen binnenkant van deze geometrie en buitenkant van een andere geometrie.karakter 3 - tussen de grens van deze geometrie en het interieur van een andere geometrie.karakter 4 - tussen de grenzen van de geometrieën.karakter 5 - tussen de grens van deze geometrie en de buitenkant van een andere geometrie.karakter 6 - tussen buitenkant van deze geometrie en binnenkant van een andere geometrie.karakter 7 - tussen de buitenkant van deze geometrie en de grens van een andere geometrie.karakter 8 - tussen buitenkanten van de geometrieën. Mogelijke waarden van elk teken zijn: * - elke waarde;F - geen kruising;T - elk kruispunt;0 - puntsnijpunt (bijv. gedeeld punt);1 - lijnkruising (bijv. gedeeld lijnstuk);2 - gebiedskruising (bijv. gedeeld deel van polygoon); Een intersectiepatroon "F0**********" betekent bijvoorbeeld dat er geen intersectie mag zijn tussen geometrie-binnenkanten en intersectie tussen geometriegrenzen moet een punt zijn. Zie OpenGIS Simple Features Specification voor meer details over intersectiematrix patroon. |

### Winstwaarde

`true` als deze intersectiematrix overeenkomt met patroon;`false` anders.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | *other* is`null`. |
| ArgumentException | Een van de geometrieën is zodanig ongeldig dat de bewerking niet kan worden voltooid. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) van geometrieën zijn niet equivalent. U kunt gebruiken[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) om geometrieën te converteren naar hetzelfde ruimtelijke referentiesysteem. |

### Opmerkingen

Deze methode bouwt DE-9IM intersectiematrix en matcht deze met het patroon Zie OpenGIS Simple Features Specification voor meer details over DE-9IM intersectiematrix.

### Voorbeelden

De volgende code:  zal detecteren of geometrieën ruimtelijk gelijk zijn.

```csharp
geometry.Relate(other, "T*F**FFF*");
```

### Zie ook

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* naamruimte [Aspose.Gis.Geometries](../../geometry/)
* montage [Aspose.GIS](../../../)


