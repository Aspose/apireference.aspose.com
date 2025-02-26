---
title: Dataset.OpenLayerAt
second_title: Aspose.GIS for .NET API Reference
description: Dataset method. Opens the layer at specified index for reading
type: docs
weight: 140
url: /net/aspose.gis/dataset/openlayerat/
---
## Dataset.OpenLayerAt method

Opens the layer at specified index for reading.

```csharp
public abstract VectorLayer OpenLayerAt(int index, DriverOptions options = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| index | Int32 | Index of the layer to open. |
| options | DriverOptions | Open options. |

### Return Value

The layer opened for reading.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | Options object has an incorrect type for this dataset. |
| ArgumentOutOfRangeException | Index is out of range |
| ArgumentException | Options object has an incorrect type for this dataset. |
| [GisException](../../gisexception/) | Error reading the feature from the layer. |
| IOException | An I/O error occurred. |

### See Also

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [Dataset](../)
* namespace [Aspose.Gis](../../dataset/)
* assembly [Aspose.GIS](../../../)


