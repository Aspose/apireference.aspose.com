---
title: IGeometry.GetDistanceTo
second_title: Aspose.GIS voor .NET API-referentie
description: IGeometry methode. Berekent de minimale afstand tussen deze geometrie en een gespecificeerde geometrie.
type: docs
weight: 230
url: /nl/net/aspose.gis.geometries/igeometry/getdistanceto/
---
## IGeometry.GetDistanceTo method

Berekent de minimale afstand tussen deze geometrie en een gespecificeerde geometrie.

```csharp
public double GetDistanceTo(IGeometry other)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| other | IGeometry | Een geometrie om de afstand tot te bepalen. |

### Winstwaarde

Als beide geometrieën dat niet zijn[`IsEmpty`](../isempty/) - een afstand tussen de dichtstbijzijnde punten van de geometrieën. Als ten minste één geometrie leeg is, wordt -1 geretourneerd.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Argument is`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) van geometrieën zijn niet equivalent. U kunt gebruiken[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) om geometrieën te converteren naar hetzelfde ruimtelijke referentiesysteem. |

### Zie ook

* interface [IGeometry](../)
* naamruimte [Aspose.Gis.Geometries](../../igeometry/)
* montage [Aspose.GIS](../../../)


