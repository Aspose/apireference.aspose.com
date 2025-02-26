---
title: Dataset.EditLayerAt
second_title: Aspose.GIS for .NET API Reference
description: Dataset method. Opens the layer with specified name for editing
type: docs
weight: 100
url: /net/aspose.gis/dataset/editlayerat/
---
## Dataset.EditLayerAt method

Opens the layer with specified name for editing.

```csharp
public abstract VectorLayer EditLayerAt(int index, DriverOptions options = null, 
    SpatialReferenceSystem spatialReferenceSystem = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| index | Int32 | Index of the layer to edit. |
| options | DriverOptions | Open options. |
| spatialReferenceSystem | SpatialReferenceSystem | Spatial reference system for new geometries. |

### Return Value

The layer opened for editing.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | Layer with specified name does not exist; Options object has an incorrect type for this dataset. |
| ArgumentException | Options object has an incorrect type for this dataset. |
| ArgumentNullException | The name is `null`. |
| [GisException](../../gisexception/) | Error reading the feature from the layer. |
| IOException | An I/O error occurred. |

### See Also

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Dataset](../)
* namespace [Aspose.Gis](../../dataset/)
* assembly [Aspose.GIS](../../../)


