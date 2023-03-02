---
title: Class FileGdbDriver
second_title: Aspose.GIS voor .NET API-referentie
description: Aspose.Gis.Formats.FileGdb.FileGdbDriver klas. Een stuurprogramma voor het ESRI File Geodatabaseformaat.
type: docs
weight: 260
url: /nl/net/aspose.gis.formats.filegdb/filegdbdriver/
---
## FileGdbDriver class

Een stuurprogramma voor het ESRI File Geodatabase-formaat.

```csharp
public sealed class FileGdbDriver : FileDriver
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| override [CanCreateDatasets](../../aspose.gis.formats.filegdb/filegdbdriver/cancreatedatasets/) { get; } | Krijgt een waarde die aangeeft of dit stuurprogramma gegevenssets kan maken. |
| override [CanCreateLayers](../../aspose.gis.formats.filegdb/filegdbdriver/cancreatelayers/) { get; } | Krijgt een waarde die aangeeft of dit stuurprogramma vectorlagen kan maken. |
| override [CanOpenDatasets](../../aspose.gis.formats.filegdb/filegdbdriver/canopendatasets/) { get; } | Krijgt een waarde die aangeeft of dit stuurprogramma datasets kan openen. |
| override [CanOpenLayers](../../aspose.gis.formats.filegdb/filegdbdriver/canopenlayers/) { get; } | Krijgt een waarde die aangeeft of dit stuurprogramma vectorlagen kan openen. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(AbstractPath) | Creëert een dataset. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string) | Creëert een dataset. |
| override [CreateDataset](../../aspose.gis.formats.filegdb/filegdbdriver/createdataset/#createdataset_1)(AbstractPath, DriverOptions) | Creëert een dataset. |
| [CreateDataset](../../aspose.gis.formats.filegdb/filegdbdriver/createdataset/#createdataset_2)(AbstractPath, FileGdbOptions) | Creëert een dataset. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string, DriverOptions) | Creëert een dataset. |
| [CreateDataset](../../aspose.gis.formats.filegdb/filegdbdriver/createdataset/#createdataset_5)(string, FileGdbOptions) | Creëert een dataset. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath) | Maakt de laag en opent deze om toe te voegen. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string) | Maakt de laag en opent deze om toe te voegen. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, DriverOptions) | Maakt de laag en opent deze om toe te voegen. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, SpatialReferenceSystem) | Maakt de laag en opent deze om toe te voegen. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions) | Maakt de laag en opent deze om toe te voegen. |
| [CreateLayer](../../aspose.gis.formats.filegdb/filegdbdriver/createlayer/#createlayer_8)(string, FileGdbOptions) | Maakt een laag en opent deze om nieuwe objecten toe te voegen. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, SpatialReferenceSystem) | Maakt de laag en opent deze om toe te voegen. |
| override [CreateLayer](../../aspose.gis.formats.filegdb/filegdbdriver/createlayer/#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | Maakt een laag en opent deze om toe te voegen. |
| [CreateLayer](../../aspose.gis.formats.filegdb/filegdbdriver/createlayer/#createlayer_3)(AbstractPath, FileGdbOptions, SpatialReferenceSystem) | Maakt een laag en opent deze om toe te voegen. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions, SpatialReferenceSystem) | Maakt de laag en opent deze om toe te voegen. |
| [CreateLayer](../../aspose.gis.formats.filegdb/filegdbdriver/createlayer/#createlayer_9)(string, FileGdbOptions, SpatialReferenceSystem) | Maakt een laag en opent deze om toe te voegen. |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer/)(AbstractPath, DriverOptions) | Opent een laag om te bewerken. |
| [EditLayer](../../aspose.gis/filedriver/editlayer/)(string, DriverOptions) | Opent een laag om te bewerken. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath) | Opent de dataset. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string) | Opent de dataset. |
| override [OpenDataset](../../aspose.gis.formats.filegdb/filegdbdriver/opendataset/#opendataset_1)(AbstractPath, DriverOptions) | Opent de dataset. |
| [OpenDataset](../../aspose.gis.formats.filegdb/filegdbdriver/opendataset/#opendataset_2)(AbstractPath, FileGdbOptions) | Opent de dataset. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string, DriverOptions) | Opent de dataset. |
| [OpenDataset](../../aspose.gis.formats.filegdb/filegdbdriver/opendataset/#opendataset_5)(string, FileGdbOptions) | Opent de dataset. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(AbstractPath) | Opent de laag om te lezen. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string) | Opent de laag om te lezen. |
| override [OpenLayer](../../aspose.gis.formats.filegdb/filegdbdriver/openlayer/#openlayer_1)(AbstractPath, DriverOptions) | Opent een laag om te lezen. |
| [OpenLayer](../../aspose.gis.formats.filegdb/filegdbdriver/openlayer/#openlayer_2)(AbstractPath, FileGdbOptions) | Opent een laag om te lezen. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string, DriverOptions) | Opent de laag om te lezen. |
| [OpenLayer](../../aspose.gis.formats.filegdb/filegdbdriver/openlayer/#openlayer_5)(string, FileGdbOptions) | Opent een laag om te lezen. |
| override [SupportsSpatialReferenceSystem](../../aspose.gis.formats.filegdb/filegdbdriver/supportsspatialreferencesystem/)(SpatialReferenceSystem) | Bepaalt of gespecificeerd ruimtelijk referentiesysteem wordt ondersteund door de driver. |

### Zie ook

* class [FileDriver](../../aspose.gis/filedriver/)
* naamruimte [Aspose.Gis.Formats.FileGdb](../../aspose.gis.formats.filegdb/)
* montage [Aspose.GIS](../../)


