---
title: Class FileDriver
second_title: Aspose.GIS voor .NET API-referentie
description: Aspose.Gis.FileDriver klas. Een stuurprogramma voor een specifieke bestandsindeling.
type: docs
weight: 180
url: /nl/net/aspose.gis/filedriver/
---
## FileDriver class

Een stuurprogramma voor een specifieke bestandsindeling.

```csharp
public abstract class FileDriver : Driver
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| abstract [CanCreateDatasets](../../aspose.gis/filedriver/cancreatedatasets/) { get; } | Krijgt een waarde die aangeeft of dit stuurprogramma gegevenssets kan maken. |
| abstract [CanCreateLayers](../../aspose.gis/filedriver/cancreatelayers/) { get; } | Krijgt een waarde die aangeeft of dit stuurprogramma vectorlagen kan maken. |
| virtual [CanOpenDatasets](../../aspose.gis/filedriver/canopendatasets/) { get; } | Krijgt een waarde die aangeeft of dit stuurprogramma datasets kan openen. |
| abstract [CanOpenLayers](../../aspose.gis/filedriver/canopenlayers/) { get; } | Krijgt een waarde die aangeeft of dit stuurprogramma vectorlagen kan openen. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/#createdataset)(AbstractPath) | Creëert een dataset. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/#createdataset_2)(string) | Creëert een dataset. |
| virtual [CreateDataset](../../aspose.gis/filedriver/createdataset/#createdataset_1)(AbstractPath, DriverOptions) | Creëert een dataset. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/#createdataset_3)(string, DriverOptions) | Creëert een dataset. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer)(AbstractPath) | Maakt de laag en opent deze om toe te voegen. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_4)(string) | Maakt de laag en opent deze om toe te voegen. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_1)(AbstractPath, DriverOptions) | Maakt de laag en opent deze om toe te voegen. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_3)(AbstractPath, SpatialReferenceSystem) | Maakt de laag en opent deze om toe te voegen. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_5)(string, DriverOptions) | Maakt de laag en opent deze om toe te voegen. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_7)(string, SpatialReferenceSystem) | Maakt de laag en opent deze om toe te voegen. |
| abstract [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | Maakt de laag en opent deze om toe te voegen. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_6)(string, DriverOptions, SpatialReferenceSystem) | Maakt de laag en opent deze om toe te voegen. |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer/#editlayer)(AbstractPath, DriverOptions) | Opent een laag om te bewerken. |
| [EditLayer](../../aspose.gis/filedriver/editlayer/#editlayer_1)(string, DriverOptions) | Opent een laag om te bewerken. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/#opendataset)(AbstractPath) | Opent de dataset. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/#opendataset_2)(string) | Opent de dataset. |
| virtual [OpenDataset](../../aspose.gis/filedriver/opendataset/#opendataset_1)(AbstractPath, DriverOptions) | Opent de dataset. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/#opendataset_3)(string, DriverOptions) | Opent de dataset. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/#openlayer)(AbstractPath) | Opent de laag om te lezen. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/#openlayer_2)(string) | Opent de laag om te lezen. |
| abstract [OpenLayer](../../aspose.gis/filedriver/openlayer/#openlayer_1)(AbstractPath, DriverOptions) | Opent de laag om te lezen. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/#openlayer_3)(string, DriverOptions) | Opent de laag om te lezen. |
| abstract [SupportsSpatialReferenceSystem](../../aspose.gis/filedriver/supportsspatialreferencesystem/)(SpatialReferenceSystem) | Bepaalt of gespecificeerd ruimtelijk referentiesysteem wordt ondersteund door de driver. |

### Zie ook

* class [Driver](../driver/)
* naamruimte [Aspose.Gis](../../aspose.gis/)
* montage [Aspose.GIS](../../)


