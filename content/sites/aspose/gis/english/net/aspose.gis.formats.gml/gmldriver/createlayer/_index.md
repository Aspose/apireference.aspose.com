---
title: GmlDriver.CreateLayer
second_title: Aspose.GIS for .NET API Reference
description: GmlDriver method. Creates a layer and opens it for adding new features
type: docs
weight: 40
url: /net/aspose.gis.formats.gml/gmldriver/createlayer/
---
## CreateLayer(string, GmlOptions) {#createlayer_7}

Creates a layer and opens it for adding new features.

```csharp
public VectorLayer CreateLayer(string path, GmlOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | Path to the file. |
| options | GmlOptions | Driver-specific options. |

### Return Value

An instance of [`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | The layer already exists. |

### See Also

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [GmlOptions](../../gmloptions/)
* class [GmlDriver](../)
* namespace [Aspose.Gis.Formats.Gml](../../gmldriver/)
* assembly [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions, SpatialReferenceSystem) {#createlayer_2}

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
* class [GmlDriver](../)
* namespace [Aspose.Gis.Formats.Gml](../../gmldriver/)
* assembly [Aspose.GIS](../../../)

---

## CreateLayer(string, GmlOptions, SpatialReferenceSystem) {#createlayer_8}

Creates a layer and opens it for adding new features.

```csharp
public VectorLayer CreateLayer(string path, GmlOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | Path to the file. |
| options | GmlOptions | Driver-specific options. |
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
* class [GmlOptions](../../gmloptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [GmlDriver](../)
* namespace [Aspose.Gis.Formats.Gml](../../gmldriver/)
* assembly [Aspose.GIS](../../../)


