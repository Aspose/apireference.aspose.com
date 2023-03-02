---
title: Geometry.Difference
second_title: Aspose.GIS voor .NET API-referentie
description: Geometry methode. Trekt een gespecificeerde geometrie af van deze geometrie.
type: docs
weight: 180
url: /nl/net/aspose.gis.geometries/geometry/difference/
---
## Geometry.Difference method

Trekt een gespecificeerde geometrie af van deze geometrie.

```csharp
public IGeometry Difference(IGeometry other)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| other | IGeometry | Een geometrie om af te trekken. |

### Winstwaarde

Een geometrie die een verschil vertegenwoordigt van deze geometrie en een argument. De resulterende geometrie bevat puntenset die aanwezig is in deze geometrie maar niet aanwezig is in een argument.

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


