---
title: GdalDriver.CreateLayer
second_title: Aspose.GIS für .NET-API-Referenz
description: GdalDriver methode. Erstellt einen Layer und öffnet ihn zum Hinzufügen neuer Features.
type: docs
weight: 40
url: /de/net/aspose.gis.formats.gdal/gdaldriver/createlayer/
---
## GdalDriver.CreateLayer method

Erstellt einen Layer und öffnet ihn zum Hinzufügen neuer Features.

```csharp
public override VectorLayer CreateLayer(AbstractPath path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | AbstractPath | Pfad zur Datei. |
| options | DriverOptions | Fahrerspezifische Optionen. |
| spatialReferenceSystem | SpatialReferenceSystem | Räumliches Bezugssystem. |

### Rückgabewert

Eine Instanz von[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| InvalidOperationException | Die Ebene ist bereits vorhanden. |
| NotSupportedException | Das räumliche Bezugssystem wird vom Treiber nicht unterstützt. |

### Siehe auch

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [GdalDriver](../)
* namensraum [Aspose.Gis.Formats.GDAL](../../gdaldriver/)
* Montage [Aspose.GIS](../../../)


