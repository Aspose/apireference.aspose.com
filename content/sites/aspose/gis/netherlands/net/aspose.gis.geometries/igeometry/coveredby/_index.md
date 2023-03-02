---
title: IGeometry.CoveredBy
second_title: Aspose.GIS voor .NET API-referentie
description: IGeometry methode. Bepaalt of deze geometrie wordt gedekt door een gespecificeerde geometrie.
type: docs
weight: 140
url: /nl/net/aspose.gis.geometries/igeometry/coveredby/
---
## IGeometry.CoveredBy method

Bepaalt of deze geometrie wordt gedekt door een gespecificeerde geometrie.

```csharp
public bool CoveredBy(IGeometry other)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| other | IGeometry | Een geometrie. |

### Winstwaarde

`true`als deze geometrie "ruimtelijk wordt bedekt door" een andere geometrie.`false` anders.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Argument is`null`. |
| ArgumentException | Een van de geometrieën is zodanig ongeldig dat de bewerking niet kan worden voltooid. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) van geometrieën zijn niet equivalent. U kunt gebruiken[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) om geometrieën te converteren naar hetzelfde ruimtelijke referentiesysteem. |

### Opmerkingen

Deze methode test of een geometrie wordt gedekt door een andere in termen van DE-9IM intersectiematrix. Deze methode is gelijk aan:

```csharp
other.Covers(this);
```

### Zie ook

* method [SpatiallyContains](../spatiallycontains/)
* method [Covers](../covers/)
* interface [IGeometry](../)
* naamruimte [Aspose.Gis.Geometries](../../igeometry/)
* montage [Aspose.GIS](../../../)


