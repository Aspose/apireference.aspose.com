---
title: Class DataStreamSupporter
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.DataStreamSupporter class. The data stream container
type: docs
weight: 480
url: /net/aspose.cad/datastreamsupporter/
---
## DataStreamSupporter class

The data stream container.

```csharp
public abstract class DataStreamSupporter : DisposableObject
```

## Properties

| Name | Description |
| --- | --- |
| [DataStreamContainer](../../aspose.cad/datastreamsupporter/datastreamcontainer/) { get; } | Gets the object's data stream. |
| [Disposed](../../aspose.cad/disposableobject/disposed/) { get; } | Gets a value indicating whether this instance is disposed. |
| abstract [IsCached](../../aspose.cad/datastreamsupporter/iscached/) { get; } | Gets a value indicating whether object's data is cached currently and no data reading is required. |

## Methods

| Name | Description |
| --- | --- |
| abstract [CacheData](../../aspose.cad/datastreamsupporter/cachedata/)() | Caches the data and ensures no additional data loading will be performed from the underlying [`DataStreamContainer`](./datastreamcontainer/). |
| [Dispose](../../aspose.cad/disposableobject/dispose/)() | Disposes the current instance. |
| virtual [Save](../../aspose.cad/datastreamsupporter/save/#save)() | Saves the object's data to the current `DataStreamSupporter`. |
| [Save](../../aspose.cad/datastreamsupporter/save/#save_1)(Stream) | Saves the object's data to the specified stream. |
| virtual [Save](../../aspose.cad/datastreamsupporter/save/#save_2)(string) | Saves the object's data to the specified file location. |
| virtual [Save](../../aspose.cad/datastreamsupporter/save/#save_3)(string, bool) | Saves the object's data to the specified file location. |

### See Also

* class [DisposableObject](../disposableobject/)
* namespace [Aspose.CAD](../../aspose.cad/)
* assembly [Aspose.CAD](../../)


