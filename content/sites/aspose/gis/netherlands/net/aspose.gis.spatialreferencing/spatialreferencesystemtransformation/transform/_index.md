---
title: SpatialReferenceSystemTransformation.Transform
second_title: Aspose.GIS voor .NET API-referentie
description: SpatialReferenceSystemTransformation methode. Transformeert geometrie van ruimtelijk bronreferentiesysteem naar doelruimtelijk referentiesysteem.
type: docs
weight: 40
url: /nl/net/aspose.gis.spatialreferencing/spatialreferencesystemtransformation/transform/
---
## SpatialReferenceSystemTransformation.Transform method

Transformeert geometrie van ruimtelijk bronreferentiesysteem naar doelruimtelijk referentiesysteem.

```csharp
public Geometry Transform(IGeometry geometry)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| geometry | IGeometry | Geometrie om te transformeren. |

### Winstwaarde

Nieuwe geometrie in doelruimtelijk referentiesysteem.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Geometrie is`null` . |
| ArgumentException | Geometrieën[`SpatialReferenceSystem`](../../../aspose.gis.geometries/igeometry/spatialreferencesystem/) is niet`null` en komt niet overeen met [`Source`](../source/) |
| [TransformationException](../../transformationexception/) | Transformatie mislukt. |

### Zie ook

* class [Geometry](../../../aspose.gis.geometries/geometry/)
* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [SpatialReferenceSystemTransformation](../)
* naamruimte [Aspose.Gis.SpatialReferencing](../../spatialreferencesystemtransformation/)
* montage [Aspose.GIS](../../../)


