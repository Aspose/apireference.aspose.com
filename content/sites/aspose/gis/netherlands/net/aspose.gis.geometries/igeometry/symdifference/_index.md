---
title: IGeometry.SymDifference
second_title: Aspose.GIS voor .NET API-referentie
description: IGeometry methode. Bouwt een symmetrisch verschil op tussen deze geometrie en een gespecificeerde geometrie.
type: docs
weight: 330
url: /nl/net/aspose.gis.geometries/igeometry/symdifference/
---
## IGeometry.SymDifference method

Bouwt een symmetrisch verschil op tussen deze geometrie en een gespecificeerde geometrie.

```csharp
public IGeometry SymDifference(IGeometry other)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| other | IGeometry | Een geometrie om symmetrische verschillen mee te berekenen. |

### Winstwaarde

Een geometrie die een symmetrisch verschil vertegenwoordigt van deze geometrie en een argument. De resulterende geometrie bevat puntenset die aanwezig is in een van de geometrieën maar niet aanwezig is in beide.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | *other* is`null`. |
| ArgumentException | Een van de geometrieën is zodanig ongeldig dat de bewerking niet kan worden voltooid. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) van geometrieën zijn niet equivalent. U kunt gebruiken[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) om geometrieën te converteren naar hetzelfde ruimtelijke referentiesysteem. |

### Zie ook

* interface [IGeometry](../)
* naamruimte [Aspose.Gis.Geometries](../../igeometry/)
* montage [Aspose.GIS](../../../)


