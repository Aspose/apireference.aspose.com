---
title: FileDriver.OpenLayer
second_title: Aspose.GIS for .NET API Reference
description: FileDriver method. Opens the layer for reading
type: docs
weight: 90
url: /net/aspose.gis/filedriver/openlayer/
---
## OpenLayer(string) {#openlayer_2}

Opens the layer for reading.

```csharp
public VectorLayer OpenLayer(string path)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | Path to the file. |

### Return Value

An instance of [`VectorLayer`](../../vectorlayer/).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | The path is `null`. |
| [GisException](../../gisexception/) | Error reading the feature from the file. |
| IOException | An I/O error occurred. |
| NotSupportedException | Driver can not open vector layers (see [`CanOpenLayers`](../canopenlayers/)). |

### See Also

* class [VectorLayer](../../vectorlayer/)
* class [FileDriver](../)
* namespace [Aspose.Gis](../../filedriver/)
* assembly [Aspose.GIS](../../../)

---

## OpenLayer(AbstractPath) {#openlayer}

Opens the layer for reading.

```csharp
public VectorLayer OpenLayer(AbstractPath path)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | AbstractPath | Path to the file. |

### Return Value

An instance of [`VectorLayer`](../../vectorlayer/).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | The path is `null`. |
| [GisException](../../gisexception/) | Error reading the feature from the file. |
| IOException | An I/O error occurred. |
| NotSupportedException | Driver can not open vector layers (see [`CanOpenLayers`](../canopenlayers/)). |

### See Also

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* namespace [Aspose.Gis](../../filedriver/)
* assembly [Aspose.GIS](../../../)

---

## OpenLayer(string, DriverOptions) {#openlayer_3}

Opens the layer for reading.

```csharp
public VectorLayer OpenLayer(string path, DriverOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | Path to the file. |
| options | DriverOptions | Driver-specific options. |

### Return Value

An instance of [`VectorLayer`](../../vectorlayer/).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | Options object has an incorrect type for this driver. |
| ArgumentNullException | The path is `null`. |
| [GisException](../../gisexception/) | Error reading the feature from the file. |
| IOException | An I/O error occurred. |
| NotSupportedException | Driver can not open vector layers (see [`CanOpenLayers`](../canopenlayers/)). |

### See Also

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* namespace [Aspose.Gis](../../filedriver/)
* assembly [Aspose.GIS](../../../)

---

## OpenLayer(AbstractPath, DriverOptions) {#openlayer_1}

Opens the layer for reading.

```csharp
public abstract VectorLayer OpenLayer(AbstractPath path, DriverOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | AbstractPath | Path to the file. |
| options | DriverOptions | Driver-specific options. |

### Return Value

An instance of [`VectorLayer`](../../vectorlayer/).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | Options object has an incorrect type for this driver. |
| ArgumentNullException | The path is `null`. |
| [GisException](../../gisexception/) | Error reading the feature from the file. |
| IOException | An I/O error occurred. |
| NotSupportedException | Driver can not open vector layers (see [`CanOpenLayers`](../canopenlayers/)). |

### See Also

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* namespace [Aspose.Gis](../../filedriver/)
* assembly [Aspose.GIS](../../../)


