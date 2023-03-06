---
title: Geometry.Union
second_title: Aspose.GIS voor .NET API-referentie
description: Geometry methode. Verenigt deze geometrie en een gespecificeerde geometrie.
type: docs
weight: 430
url: /nl/net/aspose.gis.geometries/geometry/union/
---
## Geometry.Union method

Verenigt deze geometrie en een gespecificeerde geometrie.

```csharp
public IGeometry Union(IGeometry other)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| other | IGeometry | Een geometrie om mee te verbinden. |

### Winstwaarde

Een geometrie die een unie vertegenwoordigt van deze geometrie en een argument. De resulterende geometrie bevat puntenset die aanwezig is in deze geometrie of in een argument.

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


