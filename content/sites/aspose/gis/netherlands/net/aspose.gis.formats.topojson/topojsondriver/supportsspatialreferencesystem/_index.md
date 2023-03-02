---
title: TopoJsonDriver.SupportsSpatialReferenceSystem
second_title: Aspose.GIS voor .NET API-referentie
description: TopoJsonDriver methode. Bepaalt of gespecificeerd ruimtelijk referentiesysteem wordt ondersteund door de driver.
type: docs
weight: 60
url: /nl/net/aspose.gis.formats.topojson/topojsondriver/supportsspatialreferencesystem/
---
## TopoJsonDriver.SupportsSpatialReferenceSystem method

Bepaalt of gespecificeerd ruimtelijk referentiesysteem wordt ondersteund door de driver.

```csharp
public override bool SupportsSpatialReferenceSystem(SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| spatialReferenceSystem | SpatialReferenceSystem | Ruimtelijk referentiesysteem. |

### Winstwaarde

Booleaanse waarde, die aangeeft of het gespecificeerde ruimtelijke referentiesysteem wordt ondersteund door de driver.

### Opmerkingen

Voor TopoJSON is het enige ondersteunde ruimtelijke referentiesysteem 'null', aangezien er geen manier is om ruimtelijke referentiesysteeminformatie op te slaan in het TopoJSON-bestand en de TopoJSON-specificatie specificeert niet wat het ruimtelijke referentiesysteem van geometrieën is in het TopoJSON-bestand.

### Zie ook

* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [TopoJsonDriver](../)
* naamruimte [Aspose.Gis.Formats.TopoJson](../../topojsondriver/)
* montage [Aspose.GIS](../../../)


