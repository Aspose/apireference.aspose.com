---
title: Class FileGdbDriver
second_title: Aspose.GIS für .NET-API-Referenz
description: Aspose.Gis.Formats.FileGdb.FileGdbDriver klas. Ein Treiber für das ESRI File GeodatabaseFormat.
type: docs
weight: 260
url: /de/net/aspose.gis.formats.filegdb/filegdbdriver/
---
## FileGdbDriver class

Ein Treiber für das ESRI File Geodatabase-Format.

```csharp
public sealed class FileGdbDriver : FileDriver
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| override [CanCreateDatasets](../../aspose.gis.formats.filegdb/filegdbdriver/cancreatedatasets/) { get; } | Ruft einen Wert ab, der angibt, ob dieser Treiber Datensätze erstellen kann. |
| override [CanCreateLayers](../../aspose.gis.formats.filegdb/filegdbdriver/cancreatelayers/) { get; } | Ruft einen Wert ab, der angibt, ob dieser Treiber Vektorebenen erstellen kann. |
| override [CanOpenDatasets](../../aspose.gis.formats.filegdb/filegdbdriver/canopendatasets/) { get; } | Ruft einen Wert ab, der angibt, ob dieser Treiber Datensätze öffnen kann. |
| override [CanOpenLayers](../../aspose.gis.formats.filegdb/filegdbdriver/canopenlayers/) { get; } | Ruft einen Wert ab, der angibt, ob dieser Treiber Vektorebenen öffnen kann. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(AbstractPath) | Erstellt einen Datensatz. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string) | Erstellt einen Datensatz. |
| override [CreateDataset](../../aspose.gis.formats.filegdb/filegdbdriver/createdataset/#createdataset_1)(AbstractPath, DriverOptions) | Erstellt einen Datensatz. |
| [CreateDataset](../../aspose.gis.formats.filegdb/filegdbdriver/createdataset/#createdataset_2)(AbstractPath, FileGdbOptions) | Erstellt einen Datensatz. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string, DriverOptions) | Erstellt einen Datensatz. |
| [CreateDataset](../../aspose.gis.formats.filegdb/filegdbdriver/createdataset/#createdataset_5)(string, FileGdbOptions) | Erstellt einen Datensatz. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath) | Erstellt die Ebene und öffnet sie zum Anhängen. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string) | Erstellt die Ebene und öffnet sie zum Anhängen. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, DriverOptions) | Erstellt die Ebene und öffnet sie zum Anhängen. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, SpatialReferenceSystem) | Erstellt die Ebene und öffnet sie zum Anhängen. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions) | Erstellt die Ebene und öffnet sie zum Anhängen. |
| [CreateLayer](../../aspose.gis.formats.filegdb/filegdbdriver/createlayer/#createlayer_8)(string, FileGdbOptions) | Erstellt einen Layer und öffnet ihn zum Hinzufügen neuer Features. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, SpatialReferenceSystem) | Erstellt die Ebene und öffnet sie zum Anhängen. |
| override [CreateLayer](../../aspose.gis.formats.filegdb/filegdbdriver/createlayer/#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | Erstellt eine Ebene und öffnet sie zum Anhängen. |
| [CreateLayer](../../aspose.gis.formats.filegdb/filegdbdriver/createlayer/#createlayer_3)(AbstractPath, FileGdbOptions, SpatialReferenceSystem) | Erstellt eine Ebene und öffnet sie zum Anhängen. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions, SpatialReferenceSystem) | Erstellt die Ebene und öffnet sie zum Anhängen. |
| [CreateLayer](../../aspose.gis.formats.filegdb/filegdbdriver/createlayer/#createlayer_9)(string, FileGdbOptions, SpatialReferenceSystem) | Erstellt eine Ebene und öffnet sie zum Anhängen. |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer/)(AbstractPath, DriverOptions) | Öffnet eine Ebene zur Bearbeitung. |
| [EditLayer](../../aspose.gis/filedriver/editlayer/)(string, DriverOptions) | Öffnet eine Ebene zur Bearbeitung. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath) | Öffnet den Datensatz. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string) | Öffnet den Datensatz. |
| override [OpenDataset](../../aspose.gis.formats.filegdb/filegdbdriver/opendataset/#opendataset_1)(AbstractPath, DriverOptions) | Öffnet den Datensatz. |
| [OpenDataset](../../aspose.gis.formats.filegdb/filegdbdriver/opendataset/#opendataset_2)(AbstractPath, FileGdbOptions) | Öffnet den Datensatz. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string, DriverOptions) | Öffnet den Datensatz. |
| [OpenDataset](../../aspose.gis.formats.filegdb/filegdbdriver/opendataset/#opendataset_5)(string, FileGdbOptions) | Öffnet den Datensatz. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(AbstractPath) | Öffnet die Ebene zum Lesen. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string) | Öffnet die Ebene zum Lesen. |
| override [OpenLayer](../../aspose.gis.formats.filegdb/filegdbdriver/openlayer/#openlayer_1)(AbstractPath, DriverOptions) | Öffnet eine Ebene zum Lesen. |
| [OpenLayer](../../aspose.gis.formats.filegdb/filegdbdriver/openlayer/#openlayer_2)(AbstractPath, FileGdbOptions) | Öffnet eine Ebene zum Lesen. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string, DriverOptions) | Öffnet die Ebene zum Lesen. |
| [OpenLayer](../../aspose.gis.formats.filegdb/filegdbdriver/openlayer/#openlayer_5)(string, FileGdbOptions) | Öffnet eine Ebene zum Lesen. |
| override [SupportsSpatialReferenceSystem](../../aspose.gis.formats.filegdb/filegdbdriver/supportsspatialreferencesystem/)(SpatialReferenceSystem) | Bestimmt, ob das angegebene Raumbezugssystem vom Treiber unterstützt wird. |

### Siehe auch

* class [FileDriver](../../aspose.gis/filedriver/)
* namensraum [Aspose.Gis.Formats.FileGdb](../../aspose.gis.formats.filegdb/)
* Montage [Aspose.GIS](../../)


