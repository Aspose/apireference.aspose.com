---
title: LineString.Item
second_title: Справочник по Aspose.GIS for .NET API
description: LineString свойство. Получает или задаетIPoint по указанному индексу.
type: docs
weight: 80
url: /ru/net/aspose.gis.geometries/linestring/item/
---
## LineString indexer

Получает или задает[`IPoint`](../../ipoint/) по указанному индексу.

```csharp
public IPoint this[int index] { get; set; }
```

| Параметр | Описание |
| --- | --- |
| index | Индекс. |

### Стоимость имущества

[`IPoint`](../../ipoint/) .

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentOutOfRangeException | Индекс вне допустимого диапазона. |
| ArgumentNullException | Значение`null`. |
| ArgumentException | Точка пуста. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) этой геометрии и[`SpatialReferenceSystem`](../spatialreferencesystem/) аргумента оба не`null` и не равны друг другу. |

### Смотрите также

* interface [IPoint](../../ipoint/)
* class [LineString](../)
* пространство имен [Aspose.Gis.Geometries](../../linestring/)
* сборка [Aspose.GIS](../../../)


