---
title: InMemoryDriver.CreateLayer
second_title: Aspose.GIS for .NET API Reference
description: InMemoryDriver method. Creates a layer and opens it for adding new features.
type: docs
weight: 40
url: /net/aspose.gis.formats.inmemory/inmemorydriver/createlayer/
---
## CreateLayer(AbstractPath, DriverOptions, SpatialReferenceSystem) {#createlayer_3}

Creates a layer and opens it for adding new features.

```csharp
public override VectorLayer CreateLayer(AbstractPath path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | AbstractPath | Path to the file. |
| options | DriverOptions | Driver-specific options. |
| spatialReferenceSystem | SpatialReferenceSystem | Spatial reference system. |

### Return Value

An instance of [`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | The layer already exists. |

### See Also

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [InMemoryDriver](../)
* namespace [Aspose.Gis.Formats.InMemory](../../inmemorydriver/)
* assembly [Aspose.GIS](../../../)

---

## CreateLayer() {#createlayer}

Creates a layer and opens it for adding new features.

```csharp
public VectorLayer CreateLayer()
```

### Return Value

An instance of [`VectorLayer`](../../../aspose.gis/vectorlayer/).

### See Also

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [InMemoryDriver](../)
* namespace [Aspose.Gis.Formats.InMemory](../../inmemorydriver/)
* assembly [Aspose.GIS](../../../)


