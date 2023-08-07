---
title: GeoJsonSeqDriver.CreateLayer
second_title: Aspose.GIS for .NET API Reference
description: GeoJsonSeqDriver method. Creates a layer and opens it for adding new features
type: docs
weight: 40
url: /net/aspose.gis.formats.geojsonseq/geojsonseqdriver/createlayer/
---
## CreateLayer(string, GeoJsonSeqOptions) {#createlayer_9}

Creates a layer and opens it for adding new features.

```csharp
public VectorLayer CreateLayer(string path, GeoJsonSeqOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | Path to the file. |
| options | GeoJsonSeqOptions | Driver-specific options. |

### Return Value

An instance of [`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | The layer already exists. |

### See Also

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [GeoJsonSeqOptions](../../geojsonseqoptions/)
* class [GeoJsonSeqDriver](../)
* namespace [Aspose.Gis.Formats.GeoJsonSeq](../../geojsonseqdriver/)
* assembly [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, GeoJsonSeqOptions) {#createlayer_3}

Creates a layer and opens it for adding new features.

```csharp
public VectorLayer CreateLayer(AbstractPath path, GeoJsonSeqOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | AbstractPath | Path to the file. |
| options | GeoJsonSeqOptions | Driver-specific options. |

### Return Value

An instance of [`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | The layer already exists. |

### See Also

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [GeoJsonSeqOptions](../../geojsonseqoptions/)
* class [GeoJsonSeqDriver](../)
* namespace [Aspose.Gis.Formats.GeoJsonSeq](../../geojsonseqdriver/)
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
* class [GeoJsonSeqDriver](../)
* namespace [Aspose.Gis.Formats.GeoJsonSeq](../../geojsonseqdriver/)
* assembly [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, GeoJsonSeqOptions, SpatialReferenceSystem) {#createlayer_4}

Creates a layer and opens it for adding new features.

```csharp
public VectorLayer CreateLayer(AbstractPath path, GeoJsonSeqOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | AbstractPath | Path to the file. |
| options | GeoJsonSeqOptions | Driver-specific options. |
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
* class [GeoJsonSeqOptions](../../geojsonseqoptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [GeoJsonSeqDriver](../)
* namespace [Aspose.Gis.Formats.GeoJsonSeq](../../geojsonseqdriver/)
* assembly [Aspose.GIS](../../../)


