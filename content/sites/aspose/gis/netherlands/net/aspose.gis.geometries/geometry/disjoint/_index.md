---
title: Geometry.Disjoint
second_title: Aspose.GIS voor .NET API-referentie
description: Geometry methode. Bepaalt of deze geometrie disjunct is van een gespecificeerde geometrie.
type: docs
weight: 190
url: /nl/net/aspose.gis.geometries/geometry/disjoint/
---
## Geometry.Disjoint method

Bepaalt of deze geometrie disjunct is van een gespecificeerde geometrie.

```csharp
public bool Disjoint(IGeometry other)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| other | IGeometry | Een geometrie. |

### Winstwaarde

`true` als deze geometrie "ruimtelijk gescheiden" is van een andere geometrie.`false` anders.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Argument is`null`. |
| ArgumentException | Een van de geometrieën is zodanig ongeldig dat de bewerking niet kan worden voltooid. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) van geometrieën zijn niet equivalent. U kunt gebruiken[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) om geometrieën te converteren naar hetzelfde ruimtelijke referentiesysteem. |

### Opmerkingen

Deze methode test of geometrieën onsamenhangend zijn in termen van DE-9IM intersectiematrix. In principe test het of twee geometrieën geen gemeenschappelijke punten hebben. Deze methode is gelijk aan: Zie OpenGIS Simple Features Specification voor meer details over DE-9IM.

```csharp
this.Relate(other, "FF*FF****");
```

### Zie ook

* method [Intersects](../../igeometry/intersects/)
* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* naamruimte [Aspose.Gis.Geometries](../../geometry/)
* montage [Aspose.GIS](../../../)


