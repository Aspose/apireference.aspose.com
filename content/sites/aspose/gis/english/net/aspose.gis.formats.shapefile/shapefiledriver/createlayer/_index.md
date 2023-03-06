---
title: ShapefileDriver.CreateLayer
second_title: Aspose.GIS for .NET API Reference
description: ShapefileDriver method. Creates a layer and opens it for adding new features.
type: docs
weight: 40
url: /net/aspose.gis.formats.shapefile/shapefiledriver/createlayer/
---
## CreateLayer(string, ShapefileOptions) {#createlayer_9}

Creates a layer and opens it for adding new features.

```csharp
public VectorLayer CreateLayer(string path, ShapefileOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | Path to the file. |
| options | ShapefileOptions | Driver-specific options. |

### Return Value

An instance of [`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | The layer already exists. |

### See Also

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [ShapefileOptions](../../shapefileoptions/)
* class [ShapefileDriver](../)
* namespace [Aspose.Gis.Formats.Shapefile](../../shapefiledriver/)
* assembly [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, ShapefileOptions) {#createlayer_3}

Creates a layer and opens it for adding new features.

```csharp
public VectorLayer CreateLayer(AbstractPath path, ShapefileOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | AbstractPath | Path to the file. |
| options | ShapefileOptions | Driver-specific options. |

### Return Value

An instance of [`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | The layer already exists. |

### See Also

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [ShapefileOptions](../../shapefileoptions/)
* class [ShapefileDriver](../)
* namespace [Aspose.Gis.Formats.Shapefile](../../shapefiledriver/)
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
* class [ShapefileDriver](../)
* namespace [Aspose.Gis.Formats.Shapefile](../../shapefiledriver/)
* assembly [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, ShapefileOptions, SpatialReferenceSystem) {#createlayer_4}

Creates a layer and opens it for adding new features.

```csharp
public VectorLayer CreateLayer(AbstractPath path, ShapefileOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | AbstractPath | Path to the file. |
| options | ShapefileOptions | Driver-specific options. |
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
* class [ShapefileOptions](../../shapefileoptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [ShapefileDriver](../)
* namespace [Aspose.Gis.Formats.Shapefile](../../shapefiledriver/)
* assembly [Aspose.GIS](../../../)


