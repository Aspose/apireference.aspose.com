---
title: MapInfoInterchangeDriver
second_title: Aspose.GIS för .NET API Referens
description: En drivrutin för MapInfo Interchange Format.
type: docs
weight: 510
url: /sv/net/aspose.gis.formats.mapinfointerchange/mapinfointerchangedriver/
---
## MapInfoInterchangeDriver class

En drivrutin för MapInfo Interchange Format.

```csharp
public sealed class MapInfoInterchangeDriver : FileDriver
```

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| override [CanCreateDatasets](../../aspose.gis.formats.mapinfointerchange/mapinfointerchangedriver/cancreatedatasets) { get; } | Får ett värde som indikerar om den här drivrutinen kan skapa datauppsättningar. |
| override [CanCreateLayers](../../aspose.gis.formats.mapinfointerchange/mapinfointerchangedriver/cancreatelayers) { get; } | Får ett värde som indikerar om den här drivrutinen kan skapa vektorlager. |
| virtual [CanOpenDatasets](../../aspose.gis/filedriver/canopendatasets) { get; } | Får ett värde som indikerar om den här drivrutinen kan öppna datauppsättningar. |
| override [CanOpenLayers](../../aspose.gis.formats.mapinfointerchange/mapinfointerchangedriver/canopenlayers) { get; } | Får ett värde som indikerar om den här drivrutinen kan öppna vektorlager. |

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
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath, SpatialReferenceSystem) | Skapar lagret och öppnar det för att läggas till. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, DriverOptions) | Skapar lagret och öppnar det för att läggas till. |
| [CreateLayer](../../aspose.gis.formats.mapinfointerchange/mapinfointerchangedriver/createlayer#createlayer_7)(string, MapInfoInterchangeOptions) | Skapar ett lager och öppnar det för att lägga till nya funktioner. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, SpatialReferenceSystem) | Skapar lagret och öppnar det för att läggas till. |
| override [CreateLayer](../../aspose.gis.formats.mapinfointerchange/mapinfointerchangedriver/createlayer#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | Skapar ett lager och öppnar det för att lägga till nya funktioner. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, DriverOptions, SpatialReferenceSystem) | Skapar lagret och öppnar det för att läggas till. |
| [CreateLayer](../../aspose.gis.formats.mapinfointerchange/mapinfointerchangedriver/createlayer#createlayer_8)(string, MapInfoInterchangeOptions, SpatialReferenceSystem) | Skapar ett lager och öppnar det för att lägga till nya funktioner. |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer)(AbstractPath, DriverOptions) | Öppnar ett lager för redigering. |
| [EditLayer](../../aspose.gis/filedriver/editlayer)(string, DriverOptions) | Öppnar ett lager för redigering. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(AbstractPath) | Öppnar datasetet. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(string) | Öppnar datasetet. |
| virtual [OpenDataset](../../aspose.gis/filedriver/opendataset)(AbstractPath, DriverOptions) | Öppnar datasetet. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(string, DriverOptions) | Öppnar datasetet. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(AbstractPath) | Öppnar lagret för läsning. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(string) | Öppnar lagret för läsning. |
| override [OpenLayer](../../aspose.gis.formats.mapinfointerchange/mapinfointerchangedriver/openlayer#openlayer_1)(AbstractPath, DriverOptions) | Öppnar ett lager för läsning. |
| [OpenLayer](../../aspose.gis.formats.mapinfointerchange/mapinfointerchangedriver/openlayer#openlayer_2)(AbstractPath, MapInfoInterchangeOptions) | Öppnar ett lager för läsning. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(string, DriverOptions) | Öppnar lagret för läsning. |
| [OpenLayer](../../aspose.gis.formats.mapinfointerchange/mapinfointerchangedriver/openlayer#openlayer_5)(string, MapInfoInterchangeOptions) | Öppnar ett lager för läsning. |
| override [SupportsSpatialReferenceSystem](../../aspose.gis.formats.mapinfointerchange/mapinfointerchangedriver/supportsspatialreferencesystem)(SpatialReferenceSystem) | Bestämmer om specificerat rumsligt referenssystem stöds av drivrutinen. |

### Se även

* class [FileDriver](../../aspose.gis/filedriver)
* namnutrymme [Aspose.Gis.Formats.MapInfoInterchange](../../aspose.gis.formats.mapinfointerchange)
* hopsättning [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
