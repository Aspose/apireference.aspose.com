---
title: RasterDriver.OpenLayer
second_title: Справочник по Aspose.GIS for .NET API
description: RasterDriver метод. Открывает слой для чтения.
type: docs
weight: 20
url: /ru/net/aspose.gis/rasterdriver/openlayer/
---
## OpenLayer(AbstractPath, RasterDriverOptions) {#openlayer_1}

Открывает слой для чтения.

```csharp
public abstract RasterLayer OpenLayer(AbstractPath path, RasterDriverOptions options)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | AbstractPath | Путь к файлу. |
| options | RasterDriverOptions | Параметры, зависящие от драйвера. |

### Возвращаемое значение

Экземпляр[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/).

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentException | Объект параметров имеет неверный тип для этого драйвера. |
| ArgumentNullException | Путь`null`. |
| IOException | Произошла ошибка ввода/вывода. |
| NotSupportedException | Драйвер не может открывать растровые слои (см.[`CanOpenLayers`](../canopenlayers/)). |

### Смотрите также

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [AbstractPath](../../abstractpath/)
* class [RasterDriverOptions](../../rasterdriveroptions/)
* class [RasterDriver](../)
* пространство имен [Aspose.Gis](../../rasterdriver/)
* сборка [Aspose.GIS](../../../)

---

## OpenLayer(string) {#openlayer_2}

Открывает слой для чтения.

```csharp
public RasterLayer OpenLayer(string path)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | String | Путь к файлу. |

### Возвращаемое значение

Экземпляр[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/).

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Путь`null`. |
| IOException | Произошла ошибка ввода/вывода. |
| NotSupportedException | Драйвер не может открывать растровые слои (см.[`CanOpenLayers`](../canopenlayers/)). |

### Смотрите также

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [RasterDriver](../)
* пространство имен [Aspose.Gis](../../rasterdriver/)
* сборка [Aspose.GIS](../../../)

---

## OpenLayer(AbstractPath) {#openlayer}

Открывает слой для чтения.

```csharp
public RasterLayer OpenLayer(AbstractPath path)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | AbstractPath | Путь к файлу. |

### Возвращаемое значение

Экземпляр[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/).

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Путь`null`. |
| IOException | Произошла ошибка ввода/вывода. |
| NotSupportedException | Драйвер не может открывать растровые слои (см.[`CanOpenLayers`](../canopenlayers/)). |

### Смотрите также

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [AbstractPath](../../abstractpath/)
* class [RasterDriver](../)
* пространство имен [Aspose.Gis](../../rasterdriver/)
* сборка [Aspose.GIS](../../../)

---

## OpenLayer(string, RasterDriverOptions) {#openlayer_3}

Открывает слой для чтения.

```csharp
public RasterLayer OpenLayer(string path, RasterDriverOptions options)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | String | Путь к файлу. |
| options | RasterDriverOptions | Параметры, зависящие от драйвера. |

### Возвращаемое значение

Экземпляр[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/).

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentException | Объект параметров имеет неверный тип для этого драйвера. |
| ArgumentNullException | Путь`null`. |
| IOException | Произошла ошибка ввода/вывода. |
| NotSupportedException | Драйвер не может открывать растровые слои (см.[`CanOpenLayers`](../canopenlayers/)). |

### Смотрите также

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [RasterDriverOptions](../../rasterdriveroptions/)
* class [RasterDriver](../)
* пространство имен [Aspose.Gis](../../rasterdriver/)
* сборка [Aspose.GIS](../../../)


