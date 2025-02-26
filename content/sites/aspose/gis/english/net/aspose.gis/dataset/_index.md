---
title: Class Dataset
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.Dataset class. A dataset is the collection of VectorLayer instances
type: docs
weight: 1430
url: /net/aspose.gis/dataset/
---
## Dataset class

A dataset is the collection of [`VectorLayer`](../vectorlayer/) instances.

```csharp
public abstract class Dataset : IDisposable
```

## Properties

| Name | Description |
| --- | --- |
| virtual [CanCreateLayers](../../aspose.gis/dataset/cancreatelayers/) { get; } | Gets a value indicating whether this dataset can create vector layers. |
| virtual [CanRemoveLayers](../../aspose.gis/dataset/canremovelayers/) { get; } | Gets a value indicating whether this dataset can remove vector layers. |
| abstract [Driver](../../aspose.gis/dataset/driver/) { get; } | Gets the [`Driver`](./driver/) that instantiated this dataset. |
| abstract [LayersCount](../../aspose.gis/dataset/layerscount/) { get; } | Gets the number of layers in this dataset. |

## Methods

| Name | Description |
| --- | --- |
| static [Create](../../aspose.gis/dataset/create/#create)(AbstractPath, FileDriver) | Creates a dataset. |
| static [Create](../../aspose.gis/dataset/create/#create_2)(string, FileDriver) | Creates a dataset. |
| static [Create](../../aspose.gis/dataset/create/#create_1)(AbstractPath, FileDriver, DriverOptions) | Creates a dataset. |
| static [Create](../../aspose.gis/dataset/create/#create_3)(string, FileDriver, DriverOptions) | Creates a dataset. |
| static [Open](../../aspose.gis/dataset/open/#open)(AbstractPath, FileDriver) | Opens the dataset. |
| static [Open](../../aspose.gis/dataset/open/#open_2)(IDbConnection, DatabaseDriver) | Opens the dataset. |
| static [Open](../../aspose.gis/dataset/open/#open_3)(string, FileDriver) | Opens the dataset. |
| static [Open](../../aspose.gis/dataset/open/#open_1)(AbstractPath, FileDriver, DriverOptions) | Opens the dataset. |
| static [Open](../../aspose.gis/dataset/open/#open_4)(string, FileDriver, DriverOptions) | Opens the dataset. |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer)() | Creates a new vector layer and opens it for appending. |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer_2)(SpatialReferenceSystem) | Creates a new vector layer and opens it for appending. |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer_1)(DriverOptions, SpatialReferenceSystem) | Creates a new vector layer and opens it for appending. |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer_4)(string, SpatialReferenceSystem) | Creates a new vector layer with specified name and opens it for appending. |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer_3)(string, DriverOptions, SpatialReferenceSystem) | Creates a new vector layer with specified name and opens it for appending. |
| [Dispose](../../aspose.gis/dataset/dispose/)() | Releases the resources used by the `Dataset`. |
| abstract [EditLayer](../../aspose.gis/dataset/editlayer/)(string, DriverOptions, SpatialReferenceSystem) | Opens the layer with specified name for editing. |
| abstract [EditLayerAt](../../aspose.gis/dataset/editlayerat/)(int, DriverOptions, SpatialReferenceSystem) | Opens the layer with specified name for editing. |
| abstract [GetLayerName](../../aspose.gis/dataset/getlayername/)(int) | Gets the name of the layer at specified index. |
| virtual [HasLayerWithName](../../aspose.gis/dataset/haslayerwithname/)(string) | Check has current dataset a layer with specific name |
| abstract [OpenLayer](../../aspose.gis/dataset/openlayer/)(string, DriverOptions) | Opens the layer with specified name for reading. |
| abstract [OpenLayerAt](../../aspose.gis/dataset/openlayerat/)(int, DriverOptions) | Opens the layer at specified index for reading. |
| virtual [RemoveLayer](../../aspose.gis/dataset/removelayer/)(string) | Removes the vector layer with specified name. |
| virtual [RemoveLayerAt](../../aspose.gis/dataset/removelayerat/)(int) | Removes the vector layer at specified index. |
| virtual [RenameLayer](../../aspose.gis/dataset/renamelayer/)(string, string) | Rename layer in dataset |

### See Also

* namespace [Aspose.Gis](../../aspose.gis/)
* assembly [Aspose.GIS](../../)


