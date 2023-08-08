---
title: RasterDriver.OpenLayer
second_title: Aspose.GIS for .NET API Reference
description: RasterDriver method. Opens the layer for reading
type: docs
weight: 20
url: /net/aspose.gis/rasterdriver/openlayer/
---
## OpenLayer(AbstractPath, RasterDriverOptions) {#openlayer_1}

Opens the layer for reading.

```csharp
public abstract RasterLayer OpenLayer(AbstractPath path, RasterDriverOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | AbstractPath | Path to the file. |
| options | RasterDriverOptions | Driver-specific options. |

### Return Value

An instance of [`RasterLayer`](../../../aspose.gis.raster/rasterlayer/).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | Options object has an incorrect type for this driver. |
| ArgumentNullException | The path is `null`. |
| IOException | An I/O error occurred. |
| NotSupportedException | Driver can not open raster layers (see [`CanOpenLayers`](../canopenlayers/)). |

### See Also

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [AbstractPath](../../abstractpath/)
* class [RasterDriverOptions](../../rasterdriveroptions/)
* class [RasterDriver](../)
* namespace [Aspose.Gis](../../rasterdriver/)
* assembly [Aspose.GIS](../../../)

---

## OpenLayer(string) {#openlayer_2}

Opens the layer for reading.

```csharp
public RasterLayer OpenLayer(string path)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | Path to the file. |

### Return Value

An instance of [`RasterLayer`](../../../aspose.gis.raster/rasterlayer/).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | The path is `null`. |
| IOException | An I/O error occurred. |
| NotSupportedException | Driver can not open raster layers (see [`CanOpenLayers`](../canopenlayers/)). |

### See Also

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [RasterDriver](../)
* namespace [Aspose.Gis](../../rasterdriver/)
* assembly [Aspose.GIS](../../../)

---

## OpenLayer(AbstractPath) {#openlayer}

Opens the layer for reading.

```csharp
public RasterLayer OpenLayer(AbstractPath path)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | AbstractPath | Path to the file. |

### Return Value

An instance of [`RasterLayer`](../../../aspose.gis.raster/rasterlayer/).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | The path is `null`. |
| IOException | An I/O error occurred. |
| NotSupportedException | Driver can not open raster layers (see [`CanOpenLayers`](../canopenlayers/)). |

### See Also

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [AbstractPath](../../abstractpath/)
* class [RasterDriver](../)
* namespace [Aspose.Gis](../../rasterdriver/)
* assembly [Aspose.GIS](../../../)

---

## OpenLayer(string, RasterDriverOptions) {#openlayer_3}

Opens the layer for reading.

```csharp
public RasterLayer OpenLayer(string path, RasterDriverOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | Path to the file. |
| options | RasterDriverOptions | Driver-specific options. |

### Return Value

An instance of [`RasterLayer`](../../../aspose.gis.raster/rasterlayer/).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | Options object has an incorrect type for this driver. |
| ArgumentNullException | The path is `null`. |
| IOException | An I/O error occurred. |
| NotSupportedException | Driver can not open raster layers (see [`CanOpenLayers`](../canopenlayers/)). |

### See Also

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [RasterDriverOptions](../../rasterdriveroptions/)
* class [RasterDriver](../)
* namespace [Aspose.Gis](../../rasterdriver/)
* assembly [Aspose.GIS](../../../)


