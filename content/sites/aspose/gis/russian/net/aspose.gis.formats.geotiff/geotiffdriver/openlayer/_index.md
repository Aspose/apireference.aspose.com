---
title: GeoTiffDriver.OpenLayer
second_title: Справочник по Aspose.GIS for .NET API
description: GeoTiffDriver метод. Открывает слой для чтения.
type: docs
weight: 20
url: /ru/net/aspose.gis.formats.geotiff/geotiffdriver/openlayer/
---
## OpenLayer(AbstractPath, RasterDriverOptions) {#openlayer_2}

Открывает слой для чтения.

```csharp
public override RasterLayer OpenLayer(AbstractPath path, RasterDriverOptions options)
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
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [RasterDriverOptions](../../../aspose.gis/rasterdriveroptions/)
* class [GeoTiffDriver](../)
* пространство имен [Aspose.Gis.Formats.GeoTiff](../../geotiffdriver/)
* сборка [Aspose.GIS](../../../)

---

## OpenLayer(string, GeoTiffOptions) {#openlayer_4}

Открывает слой для чтения.

```csharp
public RasterLayer OpenLayer(string path, GeoTiffOptions options)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | String | Путь к файлу. |
| options | GeoTiffOptions | Параметры, зависящие от драйвера. |

### Возвращаемое значение

Экземпляр[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/).

### Смотрите также

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [GeoTiffOptions](../../geotiffoptions/)
* class [GeoTiffDriver](../)
* пространство имен [Aspose.Gis.Formats.GeoTiff](../../geotiffdriver/)
* сборка [Aspose.GIS](../../../)

---

## OpenLayer(AbstractPath, GeoTiffOptions) {#openlayer_1}

Открывает слой для чтения.

```csharp
public RasterLayer OpenLayer(AbstractPath path, GeoTiffOptions options)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | AbstractPath | Путь к файлу. |
| options | GeoTiffOptions | Параметры, зависящие от драйвера. |

### Возвращаемое значение

Экземпляр[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/).

### Смотрите также

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [GeoTiffOptions](../../geotiffoptions/)
* class [GeoTiffDriver](../)
* пространство имен [Aspose.Gis.Formats.GeoTiff](../../geotiffdriver/)
* сборка [Aspose.GIS](../../../)


