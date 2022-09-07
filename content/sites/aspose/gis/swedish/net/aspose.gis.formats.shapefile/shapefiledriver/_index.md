---
title: ShapefileDriver
second_title: Aspose.GIS för .NET API Referens
description: En drivrutin för Shapefileformatet.
type: docs
weight: 590
url: /sv/net/aspose.gis.formats.shapefile/shapefiledriver/
---
## ShapefileDriver class

En drivrutin för Shapefile-formatet.

```csharp
public class ShapefileDriver : FileDriver
```

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| override [CanCreateDatasets](../../aspose.gis.formats.shapefile/shapefiledriver/cancreatedatasets) { get; } | Får ett värde som indikerar om den här drivrutinen kan skapa datauppsättningar. |
| override [CanCreateLayers](../../aspose.gis.formats.shapefile/shapefiledriver/cancreatelayers) { get; } | Får ett värde som indikerar om den här drivrutinen kan skapa vektorlager. |
| virtual [CanOpenDatasets](../../aspose.gis/filedriver/canopendatasets) { get; } | Får ett värde som indikerar om den här drivrutinen kan öppna datauppsättningar. |
| override [CanOpenLayers](../../aspose.gis.formats.shapefile/shapefiledriver/canopenlayers) { get; } | Får ett värde som indikerar om den här drivrutinen kan öppna vektorlager. |

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
| [CreateLayer](../../aspose.gis.formats.shapefile/shapefiledriver/createlayer#createlayer_3)(AbstractPath, ShapefileOptions) | Skapar ett lager och öppnar det för att lägga till nya funktioner. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath, SpatialReferenceSystem) | Skapar lagret och öppnar det för att läggas till. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, DriverOptions) | Skapar lagret och öppnar det för att läggas till. |
| [CreateLayer](../../aspose.gis.formats.shapefile/shapefiledriver/createlayer#createlayer_9)(string, ShapefileOptions) | Skapar ett lager och öppnar det för att lägga till nya funktioner. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, SpatialReferenceSystem) | Skapar lagret och öppnar det för att läggas till. |
| override [CreateLayer](../../aspose.gis.formats.shapefile/shapefiledriver/createlayer#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | Skapar ett lager och öppnar det för att lägga till nya funktioner. |
| [CreateLayer](../../aspose.gis.formats.shapefile/shapefiledriver/createlayer#createlayer_4)(AbstractPath, ShapefileOptions, SpatialReferenceSystem) | Skapar ett lager och öppnar det för att lägga till nya funktioner. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, DriverOptions, SpatialReferenceSystem) | Skapar lagret och öppnar det för att läggas till. |
| override [EditLayer](../../aspose.gis.formats.shapefile/shapefiledriver/editlayer#editlayer)(AbstractPath, DriverOptions) | Öppnar ett lager för redigering. |
| [EditLayer](../../aspose.gis.formats.shapefile/shapefiledriver/editlayer#editlayer_1)(AbstractPath, ShapefileOptions) | Öppnar ett lager för redigering. |
| [EditLayer](../../aspose.gis/filedriver/editlayer)(string, DriverOptions) | Öppnar ett lager för redigering. |
| [EditLayer](../../aspose.gis.formats.shapefile/shapefiledriver/editlayer#editlayer_3)(string, ShapefileOptions) | Öppnar ett lager för redigering. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(AbstractPath) | Öppnar datasetet. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(string) | Öppnar datasetet. |
| virtual [OpenDataset](../../aspose.gis/filedriver/opendataset)(AbstractPath, DriverOptions) | Öppnar datasetet. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(string, DriverOptions) | Öppnar datasetet. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(AbstractPath) | Öppnar lagret för läsning. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(string) | Öppnar lagret för läsning. |
| override [OpenLayer](../../aspose.gis.formats.shapefile/shapefiledriver/openlayer#openlayer_1)(AbstractPath, DriverOptions) | Öppnar ett lager för läsning. |
| [OpenLayer](../../aspose.gis.formats.shapefile/shapefiledriver/openlayer#openlayer_2)(AbstractPath, ShapefileOptions) | Öppnar ett lager för läsning. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(string, DriverOptions) | Öppnar lagret för läsning. |
| [OpenLayer](../../aspose.gis.formats.shapefile/shapefiledriver/openlayer#openlayer_5)(string, ShapefileOptions) | Öppnar ett lager för läsning. |
| override [SupportsSpatialReferenceSystem](../../aspose.gis.formats.shapefile/shapefiledriver/supportsspatialreferencesystem)(SpatialReferenceSystem) | Bestämmer om specificerat rumsligt referenssystem stöds av drivrutinen. |

### Se även

* class [FileDriver](../../aspose.gis/filedriver)
* namnutrymme [Aspose.Gis.Formats.Shapefile](../../aspose.gis.formats.shapefile)
* hopsättning [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
