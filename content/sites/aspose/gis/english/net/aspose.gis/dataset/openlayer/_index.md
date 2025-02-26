---
title: Dataset.OpenLayer
second_title: Aspose.GIS for .NET API Reference
description: Dataset method. Opens the layer with specified name for reading
type: docs
weight: 130
url: /net/aspose.gis/dataset/openlayer/
---
## Dataset.OpenLayer method

Opens the layer with specified name for reading.

```csharp
public abstract VectorLayer OpenLayer(string name, DriverOptions options = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| name | String | Name of the layer to open. |
| options | DriverOptions | Open options. |

### Return Value

The layer opened for reading.

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
* class [Dataset](../)
* namespace [Aspose.Gis](../../dataset/)
* assembly [Aspose.GIS](../../../)


