---
title: GeoGenerator.ProduceStars
second_title: Справочник по Aspose.GIS for .NET API
description: GeoGenerator метод. Создает массив звезд все они находятся в заданном экстенте.
type: docs
weight: 40
url: /ru/net/aspose.gis.geotools/geogenerator/producestars/
---
## GeoGenerator.ProduceStars method

Создает массив звезд, все они находятся в заданном экстенте.

```csharp
public static IEnumerable<IPolygon> ProduceStars(Extent rect, StarGeneratorOptions options)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| rect | Extent | указанная площадь (см.[`Степень`](../../../aspose.gis/extent/)) |
| options | StarGeneratorOptions | Параметры создания полигона (см.[`StarGeneratorOptions`](../../stargeneratoroptions/)) |

### Возвращаемое значение

Массив звезд (см. перечисление[`IPполигон`](../../../aspose.gis.geometries/ipolygon/))

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentOutOfRangeException | Количество звезд должно быть больше одной. |
| NullReferenceException | Экстент должен иметь значение (не быть NULL) |
| ArgumentException | Минимальная и максимальная длина должны быть неравны и превышать 3 |
| ArgumentException | Максимальная длина должна быть больше минимальной |

### Смотрите также

* interface [IPolygon](../../../aspose.gis.geometries/ipolygon/)
* class [Extent](../../../aspose.gis/extent/)
* class [StarGeneratorOptions](../../stargeneratoroptions/)
* class [GeoGenerator](../)
* пространство имен [Aspose.Gis.GeoTools](../../geogenerator/)
* сборка [Aspose.GIS](../../../)


