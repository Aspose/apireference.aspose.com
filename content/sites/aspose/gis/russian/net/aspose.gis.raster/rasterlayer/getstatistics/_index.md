---
title: RasterLayer.GetStatistics
second_title: Справочник по Aspose.GIS for .NET API
description: RasterLayer метод. Вычислить сводную статистику состоящую из количества суммы среднего минимума максимума.
type: docs
weight: 160
url: /ru/net/aspose.gis.raster/rasterlayer/getstatistics/
---
## RasterLayer.GetStatistics method

Вычислить сводную статистику, состоящую из количества, суммы, среднего, минимума, максимума.

```csharp
public RasterStatistics GetStatistics(int bandIndex = 0, bool excludeNodataValue = true)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| bandIndex | Int32 | Индекс группы. Нумерация начинается с 0. |
| excludeNodataValue | Boolean | Позволяет исключить значения 'nodata'. Если для excludeNodataValue задано значение false, учитываются все пиксели. |

### Возвращаемое значение

Сводная статистика.

### Смотрите также

* class [RasterStatistics](../../rasterstatistics/)
* class [RasterLayer](../)
* пространство имен [Aspose.Gis.Raster](../../rasterlayer/)
* сборка [Aspose.GIS](../../../)


