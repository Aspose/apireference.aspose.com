---
title: Class GpxDriver
second_title: Aspose.GIS für .NET-API-Referenz
description: Aspose.Gis.Formats.Gpx.GpxDriver klas. Ein Treiber für das GPXFormat.
type: docs
weight: 360
url: /de/net/aspose.gis.formats.gpx/gpxdriver/
---
## GpxDriver class

Ein Treiber für das GPX-Format.

```csharp
public class GpxDriver : FileDriver
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| override [CanCreateDatasets](../../aspose.gis.formats.gpx/gpxdriver/cancreatedatasets/) { get; } | Ruft einen Wert ab, der angibt, ob dieser Treiber Datensätze erstellen kann. |
| override [CanCreateLayers](../../aspose.gis.formats.gpx/gpxdriver/cancreatelayers/) { get; } | Ruft einen Wert ab, der angibt, ob dieser Treiber Vektorebenen erstellen kann. |
| virtual [CanOpenDatasets](../../aspose.gis/filedriver/canopendatasets/) { get; } | Ruft einen Wert ab, der angibt, ob dieser Treiber Datensätze öffnen kann. |
| override [CanOpenLayers](../../aspose.gis.formats.gpx/gpxdriver/canopenlayers/) { get; } | Ruft einen Wert ab, der angibt, ob dieser Treiber Vektorebenen öffnen kann. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(AbstractPath) | Erstellt einen Datensatz. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string) | Erstellt einen Datensatz. |
| virtual [CreateDataset](../../aspose.gis/filedriver/createdataset/)(AbstractPath, DriverOptions) | Erstellt einen Datensatz. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string, DriverOptions) | Erstellt einen Datensatz. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath) | Erstellt die Ebene und öffnet sie zum Anhängen. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string) | Erstellt die Ebene und öffnet sie zum Anhängen. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, DriverOptions) | Erstellt die Ebene und öffnet sie zum Anhängen. |
| [CreateLayer](../../aspose.gis.formats.gpx/gpxdriver/createlayer/#createlayer_3)(AbstractPath, GpxOptions) | Erstellt einen Layer und öffnet ihn zum Hinzufügen neuer Features. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, SpatialReferenceSystem) | Erstellt die Ebene und öffnet sie zum Anhängen. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions) | Erstellt die Ebene und öffnet sie zum Anhängen. |
| [CreateLayer](../../aspose.gis.formats.gpx/gpxdriver/createlayer/#createlayer_9)(string, GpxOptions) | Erstellt einen Layer und öffnet ihn zum Hinzufügen neuer Features. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, SpatialReferenceSystem) | Erstellt die Ebene und öffnet sie zum Anhängen. |
| override [CreateLayer](../../aspose.gis.formats.gpx/gpxdriver/createlayer/#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | Erstellt einen Layer und öffnet ihn zum Hinzufügen neuer Features. |
| [CreateLayer](../../aspose.gis.formats.gpx/gpxdriver/createlayer/#createlayer_4)(AbstractPath, GpxOptions, SpatialReferenceSystem) | Erstellt einen Layer und öffnet ihn zum Hinzufügen neuer Features. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions, SpatialReferenceSystem) | Erstellt die Ebene und öffnet sie zum Anhängen. |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer/)(AbstractPath, DriverOptions) | Öffnet eine Ebene zur Bearbeitung. |
| [EditLayer](../../aspose.gis/filedriver/editlayer/)(string, DriverOptions) | Öffnet eine Ebene zur Bearbeitung. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath) | Öffnet den Datensatz. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string) | Öffnet den Datensatz. |
| virtual [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath, DriverOptions) | Öffnet den Datensatz. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string, DriverOptions) | Öffnet den Datensatz. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(AbstractPath) | Öffnet die Ebene zum Lesen. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string) | Öffnet die Ebene zum Lesen. |
| override [OpenLayer](../../aspose.gis.formats.gpx/gpxdriver/openlayer/#openlayer_1)(AbstractPath, DriverOptions) | Öffnet eine Ebene zum Lesen. |
| [OpenLayer](../../aspose.gis.formats.gpx/gpxdriver/openlayer/#openlayer_2)(AbstractPath, GpxOptions) | Öffnet eine Ebene zum Lesen. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string, DriverOptions) | Öffnet die Ebene zum Lesen. |
| [OpenLayer](../../aspose.gis.formats.gpx/gpxdriver/openlayer/#openlayer_5)(string, GpxOptions) | Öffnet eine Ebene zum Lesen. |
| override [SupportsSpatialReferenceSystem](../../aspose.gis.formats.gpx/gpxdriver/supportsspatialreferencesystem/)(SpatialReferenceSystem) | Bestimmt, ob das angegebene Raumbezugssystem vom Treiber unterstützt wird. |

### Siehe auch

* class [FileDriver](../../aspose.gis/filedriver/)
* namensraum [Aspose.Gis.Formats.Gpx](../../aspose.gis.formats.gpx/)
* Montage [Aspose.GIS](../../)


