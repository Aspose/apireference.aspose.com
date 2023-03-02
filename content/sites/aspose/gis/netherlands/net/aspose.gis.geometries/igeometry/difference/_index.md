---
title: IGeometry.Difference
second_title: Aspose.GIS voor .NET API-referentie
description: IGeometry methode. Trekt een gespecificeerde geometrie af van deze geometrie.
type: docs
weight: 170
url: /nl/net/aspose.gis.geometries/igeometry/difference/
---
## IGeometry.Difference method

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
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) van geometrieën zijn niet equivalent. U kunt gebruiken[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) om geometrieën te converteren naar hetzelfde ruimtelijke referentiesysteem. |

### Zie ook

* interface [IGeometry](../)
* naamruimte [Aspose.Gis.Geometries](../../igeometry/)
* montage [Aspose.GIS](../../../)


