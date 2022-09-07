---
title: CsvDriver
second_title: Aspose.GIS för .NET API Referens
description: En drivrutin för CSVformatet.
type: docs
weight: 180
url: /sv/net/aspose.gis.formats.csv/csvdriver/
---
## CsvDriver class

En drivrutin för CSV-formatet.

```csharp
public class CsvDriver : FileDriver
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [CsvDriver](csvdriver)() | Default_Constructor |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| override [CanCreateDatasets](../../aspose.gis.formats.csv/csvdriver/cancreatedatasets) { get; } | Får ett värde som indikerar om den här drivrutinen kan skapa datauppsättningar. |
| override [CanCreateLayers](../../aspose.gis.formats.csv/csvdriver/cancreatelayers) { get; } | Får ett värde som indikerar om den här drivrutinen kan skapa vektorlager. |
| virtual [CanOpenDatasets](../../aspose.gis/filedriver/canopendatasets) { get; } | Får ett värde som indikerar om den här drivrutinen kan öppna datauppsättningar. |
| override [CanOpenLayers](../../aspose.gis.formats.csv/csvdriver/canopenlayers) { get; } | Får ett värde som indikerar om den här drivrutinen kan öppna vektorlager. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset)(AbstractPath) | Skapar en datauppsättning. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset)(string) | Skapar en datauppsättning. |
| virtual [CreateDataset](../../aspose.gis/filedriver/createdataset)(AbstractPath, DriverOptions) | Skapar en datauppsättning. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset)(string, DriverOptions) | Skapar en datauppsättning. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath) | Skapar lagret och öppnar det för att läggas till. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string) | Skapar lagret och öppnar det för att läggas till. |
| [CreateLayer](../../aspose.gis.formats.csv/csvdriver/createlayer#createlayer_3)(AbstractPath, CsvOptions) | Skapar ett lager och öppnar det för att lägga till nya funktioner. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath, DriverOptions) | Skapar lagret och öppnar det för att läggas till. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath, SpatialReferenceSystem) | Skapar lagret och öppnar det för att läggas till. |
| [CreateLayer](../../aspose.gis.formats.csv/csvdriver/createlayer#createlayer_9)(string, CsvOptions) | Skapar ett lager och öppnar det för att lägga till nya funktioner. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, DriverOptions) | Skapar lagret och öppnar det för att läggas till. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, SpatialReferenceSystem) | Skapar lagret och öppnar det för att läggas till. |
| [CreateLayer](../../aspose.gis.formats.csv/csvdriver/createlayer#createlayer_4)(AbstractPath, CsvOptions, SpatialReferenceSystem) | Skapar ett lager och öppnar det för att lägga till nya funktioner. |
| override [CreateLayer](../../aspose.gis.formats.csv/csvdriver/createlayer#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | Skapar ett lager och öppnar det för att lägga till nya funktioner. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, DriverOptions, SpatialReferenceSystem) | Skapar lagret och öppnar det för att läggas till. |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer)(AbstractPath, DriverOptions) | Öppnar ett lager för redigering. |
| [EditLayer](../../aspose.gis/filedriver/editlayer)(string, DriverOptions) | Öppnar ett lager för redigering. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(AbstractPath) | Öppnar datasetet. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(string) | Öppnar datasetet. |
| virtual [OpenDataset](../../aspose.gis/filedriver/opendataset)(AbstractPath, DriverOptions) | Öppnar datasetet. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(string, DriverOptions) | Öppnar datasetet. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(AbstractPath) | Öppnar lagret för läsning. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(string) | Öppnar lagret för läsning. |
| [OpenLayer](../../aspose.gis.formats.csv/csvdriver/openlayer#openlayer_2)(AbstractPath, CsvOptions) | Öppnar ett lager för läsning. |
| override [OpenLayer](../../aspose.gis.formats.csv/csvdriver/openlayer#openlayer_1)(AbstractPath, DriverOptions) | Öppnar ett lager för läsning. |
| [OpenLayer](../../aspose.gis.formats.csv/csvdriver/openlayer#openlayer_5)(string, CsvOptions) | Öppnar ett lager för läsning. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(string, DriverOptions) | Öppnar lagret för läsning. |
| override [SupportsSpatialReferenceSystem](../../aspose.gis.formats.csv/csvdriver/supportsspatialreferencesystem)(SpatialReferenceSystem) | Bestämmer om specificerat rumsligt referenssystem stöds av drivrutinen. |

### Se även

* class [FileDriver](../../aspose.gis/filedriver)
* namnutrymme [Aspose.Gis.Formats.Csv](../../aspose.gis.formats.csv)
* hopsättning [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
