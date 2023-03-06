---
title: Geometry.Within
second_title: Aspose.GIS voor .NET API-referentie
description: Geometry methode. Bepaalt of deze geometrie binnen een opgegeven bereik valt.
type: docs
weight: 440
url: /nl/net/aspose.gis.geometries/geometry/within/
---
## Within(Extent) {#within}

Bepaalt of deze geometrie binnen een opgegeven bereik valt.

```csharp
public bool Within(Extent extent)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| extent | Extent | De omvang. |

### Winstwaarde

`true` als deze geometrie binnen bereik is;`false` anders.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Argument is`null`. |

### Zie ook

* method [Contains](../../../aspose.gis/extent/contains/)
* class [Extent](../../../aspose.gis/extent/)
* class [Geometry](../)
* naamruimte [Aspose.Gis.Geometries](../../geometry/)
* montage [Aspose.GIS](../../../)

---

## Within(IGeometry) {#within_1}

Bepaalt of deze geometrie binnen een gespecificeerde geometrie valt.

```csharp
public bool Within(IGeometry other)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| other | IGeometry | Een geometrie. |

### Winstwaarde

`true` als deze geometrie "ruimtelijk binnen" een andere geometrie is.`false` anders.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Argument is`null`. |
| ArgumentException | Een van de geometrieën is zodanig ongeldig dat de bewerking niet kan worden voltooid. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) van geometrieën zijn niet equivalent. U kunt gebruiken[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) om geometrieën te converteren naar hetzelfde ruimtelijke referentiesysteem. |

### Opmerkingen

Deze methode test of de ene geometrie binnen de andere ligt in termen van de DE-9IM intersectiematrix. De ene geometrie bevindt zich binnen een andere, als een andere geometrie elk punt van de geometrie bevat en geometrieën de binnenkanten elkaar kruisen. Deze methode is gelijk aan: Zie OpenGIS Simple Features Specification voor meer details over DE-9IM en "ruimtelijk binnen" relatie.

```csharp
this.Relate(other, "T*F**F***");
```

### Zie ook

* method [SpatiallyContains](../../igeometry/spatiallycontains/)
* method [CoveredBy](../../igeometry/coveredby/)
* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* naamruimte [Aspose.Gis.Geometries](../../geometry/)
* montage [Aspose.GIS](../../../)


