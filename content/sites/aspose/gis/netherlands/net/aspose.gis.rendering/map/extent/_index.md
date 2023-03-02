---
title: Map.Extent
second_title: Aspose.GIS voor .NET API-referentie
description: Map eigendom. Specificeert de grenzen van de te renderen kaart. Indien ingesteld opnull  wordt de mate tijdens het renderen berekend om alle geometrieën in alle lagen op te nemen.
type: docs
weight: 40
url: /nl/net/aspose.gis.rendering/map/extent/
---
## Map.Extent property

Specificeert de grenzen van de te renderen kaart. Indien ingesteld op`null` , wordt de mate tijdens het renderen berekend om alle geometrieën in alle lagen op te nemen.

```csharp
public Extent Extent { get; set; }
```

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentException | [`IsValid`](../../../aspose.gis/extent/isvalid/) is`false`.[`Width`](../../../aspose.gis/extent/width/) kleiner is dan of gelijk is aan nul.[`Height`](../../../aspose.gis/extent/height/) kleiner is dan of gelijk is aan nul.[`SpatialReferenceSystem`](../../../aspose.gis/extent/spatialreferencesystem/) is`null`. |

### Opmerkingen

Als het ruimtelijke referentiesysteem van het bereik niet gelijk is aan het ruimtelijke referentiesysteem van de kaart, wordt het bereik getransformeerd naar het beoogde ruimtelijke referentiesysteem tijdens het renderen.

### Zie ook

* class [Extent](../../../aspose.gis/extent/)
* class [Map](../)
* naamruimte [Aspose.Gis.Rendering](../../map/)
* montage [Aspose.GIS](../../../)


