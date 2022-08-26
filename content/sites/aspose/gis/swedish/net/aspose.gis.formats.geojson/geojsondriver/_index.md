---
title: GeoJsonDriver
second_title: Aspose.GIS för .NET API Referens
description: En drivrutin för GeoJSONformatet.
type: docs
weight: 250
url: /sv/net/aspose.gis.formats.geojson/geojsondriver/
---
## GeoJsonDriver class

En drivrutin för GeoJSON-formatet.

```csharp
public sealed class GeoJsonDriver : FileDriver
```

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| override [CanCreateDatasets](../../aspose.gis.formats.geojson/geojsondriver/cancreatedatasets) { get; } | Får ett värde som indikerar om den här drivrutinen kan skapa datauppsättningar. |
| override [CanCreateLayers](../../aspose.gis.formats.geojson/geojsondriver/cancreatelayers) { get; } | Får ett värde som indikerar om den här drivrutinen kan skapa vektorlager. |
| virtual [CanOpenDatasets](../../aspose.gis/filedriver/canopendatasets) { get; } | Får ett värde som indikerar om den här drivrutinen kan öppna datauppsättningar. |
| override [CanOpenLayers](../../aspose.gis.formats.geojson/geojsondriver/canopenlayers) { get; } | Får ett värde som indikerar om den här drivrutinen kan öppna vektorlager. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset)(AbstractPath) | Skapar en datauppsättning. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset)(string) | Skapar en datauppsättning. |
| virtual [CreateDataset](../../aspose.gis/filedriver/createdataset)(AbstractPath, DriverOptions) | Skapar en datauppsättning. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset)(string, DriverOptions) | Skapar en datauppsättning. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath) | Skapar lagret och öppnar det för att läggas till. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string) | Skapar lagret och öppnar det för att läggas till. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath, DriverOptions) | Skapar lagret och öppnar det för att läggas till. |
| [CreateLayer](../../aspose.gis.formats.geojson/geojsondriver/createlayer#createlayer_3)(AbstractPath, GeoJsonOptions) | Skapar ett lager och öppnar det för att lägga till nya funktioner. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath, SpatialReferenceSystem) | Skapar lagret och öppnar det för att läggas till. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, DriverOptions) | Skapar lagret och öppnar det för att läggas till. |
| [CreateLayer](../../aspose.gis.formats.geojson/geojsondriver/createlayer#createlayer_9)(string, GeoJsonOptions) | Skapar ett lager och öppnar det för att lägga till nya funktioner. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, SpatialReferenceSystem) | Skapar lagret och öppnar det för att läggas till. |
| override [CreateLayer](../../aspose.gis.formats.geojson/geojsondriver/createlayer#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | Skapar ett lager och öppnar det för att lägga till nya funktioner. |
| [CreateLayer](../../aspose.gis.formats.geojson/geojsondriver/createlayer#createlayer_4)(AbstractPath, GeoJsonOptions, SpatialReferenceSystem) | Skapar ett lager och öppnar det för att lägga till nya funktioner. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, DriverOptions, SpatialReferenceSystem) | Skapar lagret och öppnar det för att läggas till. |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer)(AbstractPath, DriverOptions) | Öppnar ett lager för redigering. |
| [EditLayer](../../aspose.gis/filedriver/editlayer)(string, DriverOptions) | Öppnar ett lager för redigering. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(AbstractPath) | Öppnar datasetet. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(string) | Öppnar datasetet. |
| virtual [OpenDataset](../../aspose.gis/filedriver/opendataset)(AbstractPath, DriverOptions) | Öppnar datasetet. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(string, DriverOptions) | Öppnar datasetet. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(AbstractPath) | Öppnar lagret för läsning. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(string) | Öppnar lagret för läsning. |
| override [OpenLayer](../../aspose.gis.formats.geojson/geojsondriver/openlayer#openlayer_1)(AbstractPath, DriverOptions) | Öppnar ett lager för läsning. |
| [OpenLayer](../../aspose.gis.formats.geojson/geojsondriver/openlayer#openlayer_2)(AbstractPath, GeoJsonOptions) | Öppnar ett lager för läsning. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(string, DriverOptions) | Öppnar lagret för läsning. |
| [OpenLayer](../../aspose.gis.formats.geojson/geojsondriver/openlayer#openlayer_5)(string, GeoJsonOptions) | Öppnar ett lager för läsning. |
| override [SupportsSpatialReferenceSystem](../../aspose.gis.formats.geojson/geojsondriver/supportsspatialreferencesystem)(SpatialReferenceSystem) | Bestämmer om specificerat rumsligt referenssystem stöds av drivrutinen. |

### Se även

* class [FileDriver](../../aspose.gis/filedriver)
* namnutrymme [Aspose.Gis.Formats.GeoJson](../../aspose.gis.formats.geojson)
* hopsättning [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
