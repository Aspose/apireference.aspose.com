---
title: FileGdbDriver.CreateLayer
second_title: Aspose.GIS for .NET API Reference
description: FileGdbDriver method. Creates a layer and opens it for adding new features.
type: docs
weight: 60
url: /net/aspose.gis.formats.filegdb/filegdbdriver/createlayer/
---
## CreateLayer(string, FileGdbOptions) {#createlayer_8}

Creates a layer and opens it for adding new features.

```csharp
public VectorLayer CreateLayer(string path, FileGdbOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | Path to the file. |
| options | FileGdbOptions | Driver-specific options. |

### Return Value

An instance of [`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | The layer already exists. |

### See Also

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [FileGdbOptions](../../filegdboptions/)
* class [FileGdbDriver](../)
* namespace [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* assembly [Aspose.GIS](../../../)

---

## CreateLayer(string, FileGdbOptions, SpatialReferenceSystem) {#createlayer_9}

Creates a layer and opens it for appending.

```csharp
public VectorLayer CreateLayer(string path, FileGdbOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | Path to the file. |
| options | FileGdbOptions | Driver-specific options. |
| spatialReferenceSystem | SpatialReferenceSystem | Spatial reference system. |

### Return Value

An instance of [`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | The layer already exists. |
| NotSupportedException | Spatial reference system is not supported by the driver. |

### See Also

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [FileGdbOptions](../../filegdboptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileGdbDriver](../)
* namespace [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* assembly [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions, SpatialReferenceSystem) {#createlayer_2}

Creates a layer and opens it for appending.

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
| NotSupportedException | Spatial reference system is not supported by the driver. |

### See Also

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileGdbDriver](../)
* namespace [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* assembly [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, FileGdbOptions, SpatialReferenceSystem) {#createlayer_3}

Creates a layer and opens it for appending.

```csharp
public VectorLayer CreateLayer(AbstractPath path, FileGdbOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | AbstractPath | Path to the file. |
| options | FileGdbOptions | Driver-specific options. |
| spatialReferenceSystem | SpatialReferenceSystem | Spatial reference system. |

### Return Value

An instance of [`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | The layer already exists. |
| NotSupportedException | Spatial reference system is not supported by the driver. |

### See Also

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [FileGdbOptions](../../filegdboptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileGdbDriver](../)
* namespace [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* assembly [Aspose.GIS](../../../)


