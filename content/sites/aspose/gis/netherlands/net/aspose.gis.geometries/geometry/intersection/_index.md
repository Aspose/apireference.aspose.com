---
title: Geometry.Intersection
second_title: Aspose.GIS voor .NET API-referentie
description: Geometry methode. Bouwt een snijpunt tussen deze geometrie en een gespecificeerde geometrie.
type: docs
weight: 270
url: /nl/net/aspose.gis.geometries/geometry/intersection/
---
## Geometry.Intersection method

Bouwt een snijpunt tussen deze geometrie en een gespecificeerde geometrie.

```csharp
public IGeometry Intersection(IGeometry other)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| other | IGeometry | Een geometrie om snijpunt mee te berekenen. |

### Winstwaarde

Een geometrie die een snijpunt vertegenwoordigt van deze geometrie en een argument. De resulterende geometrie bevat puntenset die aanwezig is in zowel deze geometrie als een argument.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | *other* is`null`. |
| ArgumentException | Een van de geometrieën is zodanig ongeldig dat de bewerking niet kan worden voltooid. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) van geometrieën zijn niet equivalent. U kunt gebruiken[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) om geometrieën te converteren naar hetzelfde ruimtelijke referentiesysteem. |

### Zie ook

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* naamruimte [Aspose.Gis.Geometries](../../geometry/)
* montage [Aspose.GIS](../../../)


