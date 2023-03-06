---
title: CsvDriver.CreateLayer
second_title: Aspose.GIS for .NET API Reference
description: CsvDriver method. Creates a layer and opens it for adding new features.
type: docs
weight: 50
url: /net/aspose.gis.formats.csv/csvdriver/createlayer/
---
## CreateLayer(string, CsvOptions) {#createlayer_9}

Creates a layer and opens it for adding new features.

```csharp
public VectorLayer CreateLayer(string path, CsvOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | Path to the file. |
| options | CsvOptions | Driver-specific options. |

### Return Value

An instance of [`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | The layer already exists. |

### See Also

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [CsvOptions](../../csvoptions/)
* class [CsvDriver](../)
* namespace [Aspose.Gis.Formats.Csv](../../csvdriver/)
* assembly [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, CsvOptions) {#createlayer_3}

Creates a layer and opens it for adding new features.

```csharp
public VectorLayer CreateLayer(AbstractPath path, CsvOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | AbstractPath | Path to the file. |
| options | CsvOptions | Driver-specific options. |

### Return Value

An instance of [`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | The layer already exists. |

### See Also

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [CsvOptions](../../csvoptions/)
* class [CsvDriver](../)
* namespace [Aspose.Gis.Formats.Csv](../../csvdriver/)
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
* class [CsvDriver](../)
* namespace [Aspose.Gis.Formats.Csv](../../csvdriver/)
* assembly [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, CsvOptions, SpatialReferenceSystem) {#createlayer_4}

Creates a layer and opens it for adding new features.

```csharp
public VectorLayer CreateLayer(AbstractPath path, CsvOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | AbstractPath | Path to the file. |
| options | CsvOptions | Driver-specific options. |
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
* class [CsvOptions](../../csvoptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [CsvDriver](../)
* namespace [Aspose.Gis.Formats.Csv](../../csvdriver/)
* assembly [Aspose.GIS](../../../)


