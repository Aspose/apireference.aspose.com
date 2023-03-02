---
title: GdalDriver.CreateLayer
second_title: Aspose.GIS voor .NET API-referentie
description: GdalDriver methode. Maakt een laag en opent deze om nieuwe objecten toe te voegen.
type: docs
weight: 40
url: /nl/net/aspose.gis.formats.gdal/gdaldriver/createlayer/
---
## GdalDriver.CreateLayer method

Maakt een laag en opent deze om nieuwe objecten toe te voegen.

```csharp
public override VectorLayer CreateLayer(AbstractPath path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| path | AbstractPath | Pad naar het bestand. |
| options | DriverOptions | Bestuurderspecifieke opties. |
| spatialReferenceSystem | SpatialReferenceSystem | Ruimtelijk referentiesysteem. |

### Winstwaarde

Een voorbeeld van[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| InvalidOperationException | De laag bestaat al. |
| NotSupportedException | Ruimtelijk referentiesysteem wordt niet ondersteund door de bestuurder. |

### Zie ook

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [GdalDriver](../)
* naamruimte [Aspose.Gis.Formats.GDAL](../../gdaldriver/)
* montage [Aspose.GIS](../../../)


