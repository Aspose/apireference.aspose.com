---
title: GeoJsonDriver.CreateLayer
second_title: Aspose.GIS for .NET API Reference
description: GeoJsonDriver method. Creates a layer and opens it for adding new features
type: docs
weight: 40
url: /net/aspose.gis.formats.geojson/geojsondriver/createlayer/
---
## CreateLayer(string, GeoJsonOptions) {#createlayer_9}

Creates a layer and opens it for adding new features.

```csharp
public VectorLayer CreateLayer(string path, GeoJsonOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | Path to the file. |
| options | GeoJsonOptions | Driver-specific options. |

### Return Value

An instance of [`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | The layer already exists. |

### See Also

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [GeoJsonOptions](../../geojsonoptions/)
* class [GeoJsonDriver](../)
* namespace [Aspose.Gis.Formats.GeoJson](../../geojsondriver/)
* assembly [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, GeoJsonOptions) {#createlayer_3}

Creates a layer and opens it for adding new features.

```csharp
public VectorLayer CreateLayer(AbstractPath path, GeoJsonOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | AbstractPath | Path to the file. |
| options | GeoJsonOptions | Driver-specific options. |

### Return Value

An instance of [`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | The layer already exists. |

### See Also

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [GeoJsonOptions](../../geojsonoptions/)
* class [GeoJsonDriver](../)
* namespace [Aspose.Gis.Formats.GeoJson](../../geojsondriver/)
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
* class [GeoJsonDriver](../)
* namespace [Aspose.Gis.Formats.GeoJson](../../geojsondriver/)
* assembly [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, GeoJsonOptions, SpatialReferenceSystem) {#createlayer_4}

Creates a layer and opens it for adding new features.

```csharp
public VectorLayer CreateLayer(AbstractPath path, GeoJsonOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | AbstractPath | Path to the file. |
| options | GeoJsonOptions | Driver-specific options. |
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
* class [GeoJsonOptions](../../geojsonoptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [GeoJsonDriver](../)
* namespace [Aspose.Gis.Formats.GeoJson](../../geojsondriver/)
* assembly [Aspose.GIS](../../../)


