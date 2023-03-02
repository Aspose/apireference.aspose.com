---
title: IGeometry.SpatiallyContains
second_title: Aspose.GIS voor .NET API-referentie
description: IGeometry methode. Bepaalt of deze geometrie ruimtelijk een gespecificeerde geometrie bevat.
type: docs
weight: 310
url: /nl/net/aspose.gis.geometries/igeometry/spatiallycontains/
---
## IGeometry.SpatiallyContains method

Bepaalt of deze geometrie ruimtelijk een gespecificeerde geometrie bevat.

```csharp
public bool SpatiallyContains(IGeometry other)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| other | IGeometry | Een geometrie. |

### Winstwaarde

`true`als deze geometrie "ruimtelijk" een andere geometrie bevat.`false` anders.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Argument is`null`. |
| ArgumentException | Een van de geometrieën is zodanig ongeldig dat de bewerking niet kan worden voltooid. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) van geometrieën zijn niet equivalent. U kunt gebruiken[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) om geometrieën te converteren naar hetzelfde ruimtelijke referentiesysteem. |

### Opmerkingen

Deze methode test of een geometrie een andere bevat in termen van DE-9IM intersectiematrix. Deze methode is gelijk aan:

```csharp
other.Within(this);
```

### Zie ook

* method [Within](../within/)
* method [Covers](../covers/)
* interface [IGeometry](../)
* naamruimte [Aspose.Gis.Geometries](../../igeometry/)
* montage [Aspose.GIS](../../../)


