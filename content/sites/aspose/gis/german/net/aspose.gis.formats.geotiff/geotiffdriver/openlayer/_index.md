---
title: GeoTiffDriver.OpenLayer
second_title: Aspose.GIS für .NET-API-Referenz
description: GeoTiffDriver methode. Öffnet die Ebene zum Lesen.
type: docs
weight: 20
url: /de/net/aspose.gis.formats.geotiff/geotiffdriver/openlayer/
---
## OpenLayer(AbstractPath, RasterDriverOptions) {#openlayer_2}

Öffnet die Ebene zum Lesen.

```csharp
public override RasterLayer OpenLayer(AbstractPath path, RasterDriverOptions options)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | AbstractPath | Pfad zur Datei. |
| options | RasterDriverOptions | Fahrerspezifische Optionen. |

### Rückgabewert

Eine Instanz von[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/).

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentException | Das Optionsobjekt hat einen falschen Typ für diesen Treiber. |
| ArgumentNullException | Der Weg ist`null`. |
| IOException | Ein E/A-Fehler ist aufgetreten. |
| NotSupportedException | Treiber kann Rasterebenen nicht öffnen (siehe[`CanOpenLayers`](../canopenlayers/)). |

### Siehe auch

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [RasterDriverOptions](../../../aspose.gis/rasterdriveroptions/)
* class [GeoTiffDriver](../)
* namensraum [Aspose.Gis.Formats.GeoTiff](../../geotiffdriver/)
* Montage [Aspose.GIS](../../../)

---

## OpenLayer(string, GeoTiffOptions) {#openlayer_4}

Öffnet eine Ebene zum Lesen.

```csharp
public RasterLayer OpenLayer(string path, GeoTiffOptions options)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | String | Pfad zur Datei. |
| options | GeoTiffOptions | Fahrerspezifische Optionen. |

### Rückgabewert

Eine Instanz von[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/).

### Siehe auch

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [GeoTiffOptions](../../geotiffoptions/)
* class [GeoTiffDriver](../)
* namensraum [Aspose.Gis.Formats.GeoTiff](../../geotiffdriver/)
* Montage [Aspose.GIS](../../../)

---

## OpenLayer(AbstractPath, GeoTiffOptions) {#openlayer_1}

Öffnet eine Ebene zum Lesen.

```csharp
public RasterLayer OpenLayer(AbstractPath path, GeoTiffOptions options)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| path | AbstractPath | Pfad zur Datei. |
| options | GeoTiffOptions | Fahrerspezifische Optionen. |

### Rückgabewert

Eine Instanz von[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/).

### Siehe auch

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [GeoTiffOptions](../../geotiffoptions/)
* class [GeoTiffDriver](../)
* namensraum [Aspose.Gis.Formats.GeoTiff](../../geotiffdriver/)
* Montage [Aspose.GIS](../../../)


