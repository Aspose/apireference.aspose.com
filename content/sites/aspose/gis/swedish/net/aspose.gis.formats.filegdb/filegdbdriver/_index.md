---
title: FileGdbDriver
second_title: Aspose.GIS för .NET API Referens
description: En drivrutin för ESRI File Geodatabaseformatet.
type: docs
weight: 230
url: /sv/net/aspose.gis.formats.filegdb/filegdbdriver/
---
## FileGdbDriver class

En drivrutin för ESRI File Geodatabase-formatet.

```csharp
public sealed class FileGdbDriver : FileDriver
```

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| override [CanCreateDatasets](../../aspose.gis.formats.filegdb/filegdbdriver/cancreatedatasets) { get; } | Får ett värde som indikerar om den här drivrutinen kan skapa datauppsättningar. |
| override [CanCreateLayers](../../aspose.gis.formats.filegdb/filegdbdriver/cancreatelayers) { get; } | Får ett värde som indikerar om den här drivrutinen kan skapa vektorlager. |
| override [CanOpenDatasets](../../aspose.gis.formats.filegdb/filegdbdriver/canopendatasets) { get; } | Får ett värde som indikerar om den här drivrutinen kan öppna datauppsättningar. |
| override [CanOpenLayers](../../aspose.gis.formats.filegdb/filegdbdriver/canopenlayers) { get; } | Får ett värde som indikerar om den här drivrutinen kan öppna vektorlager. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset)(AbstractPath) | Skapar en datauppsättning. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset)(string) | Skapar en datauppsättning. |
| override [CreateDataset](../../aspose.gis.formats.filegdb/filegdbdriver/createdataset#createdataset_1)(AbstractPath, DriverOptions) | Skapar en datauppsättning. |
| [CreateDataset](../../aspose.gis.formats.filegdb/filegdbdriver/createdataset#createdataset_2)(AbstractPath, FileGdbOptions) | Skapar en datauppsättning. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset)(string, DriverOptions) | Skapar en datauppsättning. |
| [CreateDataset](../../aspose.gis.formats.filegdb/filegdbdriver/createdataset#createdataset_5)(string, FileGdbOptions) | Skapar en datauppsättning. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath) | Skapar lagret och öppnar det för att läggas till. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string) | Skapar lagret och öppnar det för att läggas till. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath, DriverOptions) | Skapar lagret och öppnar det för att läggas till. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath, SpatialReferenceSystem) | Skapar lagret och öppnar det för att läggas till. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, DriverOptions) | Skapar lagret och öppnar det för att läggas till. |
| [CreateLayer](../../aspose.gis.formats.filegdb/filegdbdriver/createlayer#createlayer_8)(string, FileGdbOptions) | Skapar ett lager och öppnar det för att lägga till nya funktioner. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, SpatialReferenceSystem) | Skapar lagret och öppnar det för att läggas till. |
| override [CreateLayer](../../aspose.gis.formats.filegdb/filegdbdriver/createlayer#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | Skapar ett lager och öppnar det för att läggas till. |
| [CreateLayer](../../aspose.gis.formats.filegdb/filegdbdriver/createlayer#createlayer_3)(AbstractPath, FileGdbOptions, SpatialReferenceSystem) | Skapar ett lager och öppnar det för att läggas till. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, DriverOptions, SpatialReferenceSystem) | Skapar lagret och öppnar det för att läggas till. |
| [CreateLayer](../../aspose.gis.formats.filegdb/filegdbdriver/createlayer#createlayer_9)(string, FileGdbOptions, SpatialReferenceSystem) | Skapar ett lager och öppnar det för att läggas till. |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer)(AbstractPath, DriverOptions) | Öppnar ett lager för redigering. |
| [EditLayer](../../aspose.gis/filedriver/editlayer)(string, DriverOptions) | Öppnar ett lager för redigering. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(AbstractPath) | Öppnar datasetet. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(string) | Öppnar datasetet. |
| override [OpenDataset](../../aspose.gis.formats.filegdb/filegdbdriver/opendataset#opendataset_1)(AbstractPath, DriverOptions) | Öppnar datasetet. |
| [OpenDataset](../../aspose.gis.formats.filegdb/filegdbdriver/opendataset#opendataset_2)(AbstractPath, FileGdbOptions) | Öppnar datasetet. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(string, DriverOptions) | Öppnar datasetet. |
| [OpenDataset](../../aspose.gis.formats.filegdb/filegdbdriver/opendataset#opendataset_5)(string, FileGdbOptions) | Öppnar datasetet. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(AbstractPath) | Öppnar lagret för läsning. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(string) | Öppnar lagret för läsning. |
| override [OpenLayer](../../aspose.gis.formats.filegdb/filegdbdriver/openlayer#openlayer_1)(AbstractPath, DriverOptions) | Öppnar ett lager för läsning. |
| [OpenLayer](../../aspose.gis.formats.filegdb/filegdbdriver/openlayer#openlayer_2)(AbstractPath, FileGdbOptions) | Öppnar ett lager för läsning. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(string, DriverOptions) | Öppnar lagret för läsning. |
| [OpenLayer](../../aspose.gis.formats.filegdb/filegdbdriver/openlayer#openlayer_5)(string, FileGdbOptions) | Öppnar ett lager för läsning. |
| override [SupportsSpatialReferenceSystem](../../aspose.gis.formats.filegdb/filegdbdriver/supportsspatialreferencesystem)(SpatialReferenceSystem) | Bestämmer om specificerat rumsligt referenssystem stöds av drivrutinen. |

### Se även

* class [FileDriver](../../aspose.gis/filedriver)
* namnutrymme [Aspose.Gis.Formats.FileGdb](../../aspose.gis.formats.filegdb)
* hopsättning [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
