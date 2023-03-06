---
title: VectorLayer.Item
second_title: Aspose.GIS for .NET API Reference
description: VectorLayer property. Gets the Feature at the specified index.
type: docs
weight: 70
url: /net/aspose.gis/vectorlayer/item/
---
## VectorLayer indexer

Gets the [`Feature`](../../feature/) at the specified index.

```csharp
public virtual Feature this[int index] { get; }
```

| Parameter | Description |
| --- | --- |
| index | The index of the feature. |

### Property Value

The [`Feature`](../../feature/).

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | is thrown if layer is opened write-only. |
| ArgumentOutOfRangeException | Index is out of range. |
| [GisException](../../gisexception/) | Error reading the feature from the file. |
| IOException | An I/O error occurred. |

### See Also

* class [Feature](../../feature/)
* class [VectorLayer](../)
* namespace [Aspose.Gis](../../vectorlayer/)
* assembly [Aspose.GIS](../../../)


