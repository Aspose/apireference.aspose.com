---
title: GdalDriver.CreateLayer
second_title: Aspose.GIS för .NET API Referens
description: GdalDriver metod. Skapar ett lager och öppnar det för att lägga till nya funktioner.
type: docs
weight: 40
url: /sv/net/aspose.gis.formats.gdal/gdaldriver/createlayer/
---
## GdalDriver.CreateLayer method

Skapar ett lager och öppnar det för att lägga till nya funktioner.

```csharp
public override VectorLayer CreateLayer(AbstractPath path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| path | AbstractPath | Sökväg till filen. |
| options | DriverOptions | Förarspecifika alternativ. |
| spatialReferenceSystem | SpatialReferenceSystem | Rumsligt referenssystem. |

### Returvärde

Ett exempel på[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Undantag

| undantag | skick |
| --- | --- |
| InvalidOperationException | Lagret finns redan. |
| NotSupportedException | Det rumsliga referenssystemet stöds inte av föraren. |

### Se även

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [GdalDriver](../)
* namnutrymme [Aspose.Gis.Formats.GDAL](../../gdaldriver/)
* hopsättning [Aspose.GIS](../../../)


