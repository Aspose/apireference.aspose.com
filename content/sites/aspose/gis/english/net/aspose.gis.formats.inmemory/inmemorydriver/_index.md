---
title: Class InMemoryDriver
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.Formats.InMemory.InMemoryDriver class. A driver for work with data in memory
type: docs
weight: 2010
url: /net/aspose.gis.formats.inmemory/inmemorydriver/
---
## InMemoryDriver class

A driver for work with data in memory.

```csharp
public sealed class InMemoryDriver : FileDriver
```

## Properties

| Name | Description |
| --- | --- |
| override [CanCreateDatasets](../../aspose.gis.formats.inmemory/inmemorydriver/cancreatedatasets/) { get; } | Gets a value indicating whether this driver can create datasets. |
| override [CanCreateLayers](../../aspose.gis.formats.inmemory/inmemorydriver/cancreatelayers/) { get; } | Gets a value indicating whether this driver can create vector layers. |
| virtual [CanOpenDatasets](../../aspose.gis/filedriver/canopendatasets/) { get; } | Gets a value indicating whether this driver can open datasets. |
| override [CanOpenLayers](../../aspose.gis.formats.inmemory/inmemorydriver/canopenlayers/) { get; } | Gets a value indicating whether this driver can open vector layers. |

## Methods

| Name | Description |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(AbstractPath) | Creates a dataset. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string) | Creates a dataset. |
| virtual [CreateDataset](../../aspose.gis/filedriver/createdataset/)(AbstractPath, DriverOptions) | Creates a dataset. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string, DriverOptions) | Creates a dataset. |
| [CreateLayer](../../aspose.gis.formats.inmemory/inmemorydriver/createlayer/#createlayer)() | Creates a layer and opens it for adding new features. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath) | Creates the layer and opens it for appending. |
| [CreateLayer](../../aspose.gis.formats.inmemory/inmemorydriver/createlayer/#createlayer_5)(FeaturesSequence) | Creates a layer from features sequence and opens it for adding new features. |
| [CreateLayer](../../aspose.gis.formats.inmemory/inmemorydriver/createlayer/#createlayer_6)(SpatialReferenceSystem) | Creates a layer and opens it for adding new features. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string) | Creates the layer and opens it for appending. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, DriverOptions) | Creates the layer and opens it for appending. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, SpatialReferenceSystem) | Creates the layer and opens it for appending. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions) | Creates the layer and opens it for appending. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, SpatialReferenceSystem) | Creates the layer and opens it for appending. |
| override [CreateLayer](../../aspose.gis.formats.inmemory/inmemorydriver/createlayer/#createlayer_3)(AbstractPath, DriverOptions, SpatialReferenceSystem) | Creates a layer and opens it for adding new features. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions, SpatialReferenceSystem) | Creates the layer and opens it for appending. |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer/)(AbstractPath, DriverOptions) | Opens a layer for editing. |
| [EditLayer](../../aspose.gis/filedriver/editlayer/)(string, DriverOptions) | Opens a layer for editing. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath) | Opens the dataset. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string) | Opens the dataset. |
| virtual [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath, DriverOptions) | Opens the dataset. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string, DriverOptions) | Opens the dataset. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(AbstractPath) | Opens the layer for reading. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string) | Opens the layer for reading. |
| override [OpenLayer](../../aspose.gis.formats.inmemory/inmemorydriver/openlayer/#openlayer_1)(AbstractPath, DriverOptions) | Opens a layer for reading. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string, DriverOptions) | Opens the layer for reading. |
| override [SupportsSpatialReferenceSystem](../../aspose.gis.formats.inmemory/inmemorydriver/supportsspatialreferencesystem/)(SpatialReferenceSystem) | Determines, whether specified spatial reference system is supported by the driver. |

### See Also

* class [FileDriver](../../aspose.gis/filedriver/)
* namespace [Aspose.Gis.Formats.InMemory](../../aspose.gis.formats.inmemory/)
* assembly [Aspose.GIS](../../)


