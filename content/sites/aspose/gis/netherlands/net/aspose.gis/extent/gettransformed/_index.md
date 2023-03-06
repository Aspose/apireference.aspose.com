---
title: Extent.GetTransformed
second_title: Aspose.GIS voor .NET API-referentie
description: Extent methode. Retourneert nieuw bereik in gespecificeerdSpatialReferenceSystem die deze omvang bevat.
type: docs
weight: 150
url: /nl/net/aspose.gis/extent/gettransformed/
---
## Extent.GetTransformed method

Retourneert nieuw bereik in gespecificeerd[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) die deze omvang bevat.

```csharp
public Extent GetTransformed(SpatialReferenceSystem targetSrs)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| targetSrs | SpatialReferenceSystem | [`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) om te transformeren naar. |

### Winstwaarde

Het resultaat van transformatie in deze mate naar de gespecificeerde SRS.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Argument is`null` . |
| NotSupportedException | Transformatie naar de geleverde SRS wordt niet ondersteund. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | Transformatie mislukt. |
| InvalidOperationException | [`SpatialReferenceSystem`](../spatialreferencesystem/) van deze omvang is`null` . |

### Zie ook

* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Extent](../)
* naamruimte [Aspose.Gis](../../extent/)
* montage [Aspose.GIS](../../../)


