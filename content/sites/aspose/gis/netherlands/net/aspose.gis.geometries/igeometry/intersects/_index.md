---
title: IGeometry.Intersects
second_title: Aspose.GIS voor .NET API-referentie
description: IGeometry methode. Bepaalt of deze geometrie een gespecificeerd bereik snijdt.
type: docs
weight: 270
url: /nl/net/aspose.gis.geometries/igeometry/intersects/
---
## Intersects(Extent) {#intersects}

Bepaalt of deze geometrie een gespecificeerd bereik snijdt.

```csharp
public bool Intersects(Extent extent)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| extent | Extent | De omvang. |

### Winstwaarde

`true` als deze geometrie de omvang doorsnijdt;`false` anders.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Argument is`null`. |

### Zie ook

* method [Intersects](../../../aspose.gis/extent/intersects/)
* class [Extent](../../../aspose.gis/extent/)
* interface [IGeometry](../)
* naamruimte [Aspose.Gis.Geometries](../../igeometry/)
* montage [Aspose.GIS](../../../)

---

## Intersects(IGeometry) {#intersects_1}

Bepaalt of deze geometrie en een opgegeven geometrie elkaar snijden.

```csharp
public bool Intersects(IGeometry other)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| other | IGeometry | Een geometrie. |

### Winstwaarde

`true` als deze geometrie een andere geometrie "ruimtelijk snijdt".`false` anders.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Argument is`null`. |
| ArgumentException | Een van de geometrieën is zodanig ongeldig dat de bewerking niet kan worden voltooid. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) van geometrieën zijn niet equivalent. U kunt gebruiken[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) om geometrieën te converteren naar hetzelfde ruimtelijke referentiesysteem. |

### Opmerkingen

Deze methode is gelijk aan: Dit is de ontkenning van[`Disjoint`](../disjoint/) . Zien[`Disjoint`](../disjoint/) voor meer details.

```csharp
!this.Disjoint(other);
```

### Zie ook

* interface [IGeometry](../)
* naamruimte [Aspose.Gis.Geometries](../../igeometry/)
* montage [Aspose.GIS](../../../)


