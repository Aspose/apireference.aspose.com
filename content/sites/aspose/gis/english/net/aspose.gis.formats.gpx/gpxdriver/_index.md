---
title: Class GpxDriver
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.Formats.Gpx.GpxDriver class. A driver for the GPX format
type: docs
weight: 1970
url: /net/aspose.gis.formats.gpx/gpxdriver/
---
## GpxDriver class

A driver for the GPX format.

```csharp
public class GpxDriver : FileDriver
```

## Properties

| Name | Description |
| --- | --- |
| override [CanCreateDatasets](../../aspose.gis.formats.gpx/gpxdriver/cancreatedatasets/) { get; } | Gets a value indicating whether this driver can create datasets. |
| override [CanCreateLayers](../../aspose.gis.formats.gpx/gpxdriver/cancreatelayers/) { get; } | Gets a value indicating whether this driver can create vector layers. |
| virtual [CanOpenDatasets](../../aspose.gis/filedriver/canopendatasets/) { get; } | Gets a value indicating whether this driver can open datasets. |
| override [CanOpenLayers](../../aspose.gis.formats.gpx/gpxdriver/canopenlayers/) { get; } | Gets a value indicating whether this driver can open vector layers. |

## Methods

| Name | Description |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(AbstractPath) | Creates a dataset. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string) | Creates a dataset. |
| virtual [CreateDataset](../../aspose.gis/filedriver/createdataset/)(AbstractPath, DriverOptions) | Creates a dataset. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string, DriverOptions) | Creates a dataset. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath) | Creates the layer and opens it for appending. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string) | Creates the layer and opens it for appending. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, DriverOptions) | Creates the layer and opens it for appending. |
| [CreateLayer](../../aspose.gis.formats.gpx/gpxdriver/createlayer/#createlayer_3)(AbstractPath, GpxOptions) | Creates a layer and opens it for adding new features. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, SpatialReferenceSystem) | Creates the layer and opens it for appending. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions) | Creates the layer and opens it for appending. |
| [CreateLayer](../../aspose.gis.formats.gpx/gpxdriver/createlayer/#createlayer_9)(string, GpxOptions) | Creates a layer and opens it for adding new features. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, SpatialReferenceSystem) | Creates the layer and opens it for appending. |
| override [CreateLayer](../../aspose.gis.formats.gpx/gpxdriver/createlayer/#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | Creates a layer and opens it for adding new features. |
| [CreateLayer](../../aspose.gis.formats.gpx/gpxdriver/createlayer/#createlayer_4)(AbstractPath, GpxOptions, SpatialReferenceSystem) | Creates a layer and opens it for adding new features. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions, SpatialReferenceSystem) | Creates the layer and opens it for appending. |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer/)(AbstractPath, DriverOptions) | Opens a layer for editing. |
| [EditLayer](../../aspose.gis/filedriver/editlayer/)(string, DriverOptions) | Opens a layer for editing. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath) | Opens the dataset. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string) | Opens the dataset. |
| virtual [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath, DriverOptions) | Opens the dataset. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string, DriverOptions) | Opens the dataset. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(AbstractPath) | Opens the layer for reading. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string) | Opens the layer for reading. |
| override [OpenLayer](../../aspose.gis.formats.gpx/gpxdriver/openlayer/#openlayer_1)(AbstractPath, DriverOptions) | Opens a layer for reading. |
| [OpenLayer](../../aspose.gis.formats.gpx/gpxdriver/openlayer/#openlayer_2)(AbstractPath, GpxOptions) | Opens a layer for reading. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string, DriverOptions) | Opens the layer for reading. |
| [OpenLayer](../../aspose.gis.formats.gpx/gpxdriver/openlayer/#openlayer_5)(string, GpxOptions) | Opens a layer for reading. |
| override [SupportsSpatialReferenceSystem](../../aspose.gis.formats.gpx/gpxdriver/supportsspatialreferencesystem/)(SpatialReferenceSystem) | Determines, whether specified spatial reference system is supported by the driver. |

### See Also

* class [FileDriver](../../aspose.gis/filedriver/)
* namespace [Aspose.Gis.Formats.Gpx](../../aspose.gis.formats.gpx/)
* assembly [Aspose.GIS](../../)


