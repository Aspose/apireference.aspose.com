---
title: RasterDriver.OpenLayer
second_title: Aspose.GIS for .NET API 参考
description: RasterDriver 方法. 打开图层进行读取
type: docs
weight: 20
url: /zh/net/aspose.gis/rasterdriver/openlayer/
---
## OpenLayer(AbstractPath, RasterDriverOptions) {#openlayer_1}

打开图层进行读取。

```csharp
public abstract RasterLayer OpenLayer(AbstractPath path, RasterDriverOptions options)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | AbstractPath | 文件的路径。 |
| options | RasterDriverOptions | 特定于驱动程序的选项。 |

### 返回值

的实例[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/).

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentException | 此驱动程序的选项对象类型不正确。 |
| ArgumentNullException | 路径是`null`. |
| IOException | 发生 I/O 错误。 |
| NotSupportedException | 驱动程序无法打开光栅层（请参阅[`CanOpenLayers`](../canopenlayers/)). |

### 也可以看看

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [AbstractPath](../../abstractpath/)
* class [RasterDriverOptions](../../rasterdriveroptions/)
* class [RasterDriver](../)
* 命名空间 [Aspose.Gis](../../rasterdriver/)
* 部件 [Aspose.GIS](../../../)

---

## OpenLayer(string) {#openlayer_2}

打开图层进行读取。

```csharp
public RasterLayer OpenLayer(string path)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | String | 文件的路径。 |

### 返回值

的实例[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/).

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 路径是`null`. |
| IOException | 发生 I/O 错误。 |
| NotSupportedException | 驱动程序无法打开光栅层（请参阅[`CanOpenLayers`](../canopenlayers/)). |

### 也可以看看

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [RasterDriver](../)
* 命名空间 [Aspose.Gis](../../rasterdriver/)
* 部件 [Aspose.GIS](../../../)

---

## OpenLayer(AbstractPath) {#openlayer}

打开图层进行读取。

```csharp
public RasterLayer OpenLayer(AbstractPath path)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | AbstractPath | 文件的路径。 |

### 返回值

的实例[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/).

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 路径是`null`. |
| IOException | 发生 I/O 错误。 |
| NotSupportedException | 驱动程序无法打开光栅层（请参阅[`CanOpenLayers`](../canopenlayers/)). |

### 也可以看看

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [AbstractPath](../../abstractpath/)
* class [RasterDriver](../)
* 命名空间 [Aspose.Gis](../../rasterdriver/)
* 部件 [Aspose.GIS](../../../)

---

## OpenLayer(string, RasterDriverOptions) {#openlayer_3}

打开图层进行读取。

```csharp
public RasterLayer OpenLayer(string path, RasterDriverOptions options)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | String | 文件的路径。 |
| options | RasterDriverOptions | 特定于驱动程序的选项。 |

### 返回值

的实例[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/).

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentException | 此驱动程序的选项对象类型不正确。 |
| ArgumentNullException | 路径是`null`. |
| IOException | 发生 I/O 错误。 |
| NotSupportedException | 驱动程序无法打开光栅层（请参阅[`CanOpenLayers`](../canopenlayers/)). |

### 也可以看看

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [RasterDriverOptions](../../rasterdriveroptions/)
* class [RasterDriver](../)
* 命名空间 [Aspose.Gis](../../rasterdriver/)
* 部件 [Aspose.GIS](../../../)


