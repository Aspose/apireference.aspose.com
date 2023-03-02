---
title: GeoGenerator.ProduceLines
second_title: Справочник по Aspose.GIS for .NET API
description: GeoGenerator метод. Создает новый перечислитель ILineString с заданным количеством случайных элементов все они находятся в заданном экстенте.
type: docs
weight: 10
url: /ru/net/aspose.gis.geotools/geogenerator/producelines/
---
## GeoGenerator.ProduceLines method

Создает новый перечислитель ILineString с заданным количеством случайных элементов, все они находятся в заданном экстенте.

```csharp
public static IEnumerable<ILineString> ProduceLines(Extent rect, LineGeneratorOptions options)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| rect | Extent | указанная площадь (см.[`Степень`](../../../aspose.gis/extent/)) |
| options | LineGeneratorOptions | Варианты создания линии (см.[`LineGeneratorOptions`](../../linegeneratoroptions/)) |

### Возвращаемое значение

Массив строк (см. перечисление[`ILineString`](../../../aspose.gis.geometries/ilinestring/))

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentOutOfRangeException | Количество строк должно быть больше одной. |
| NullReferenceException | Экстент должен иметь значение (не быть NULL) |

### Смотрите также

* interface [ILineString](../../../aspose.gis.geometries/ilinestring/)
* class [Extent](../../../aspose.gis/extent/)
* class [LineGeneratorOptions](../../linegeneratoroptions/)
* class [GeoGenerator](../)
* пространство имен [Aspose.Gis.GeoTools](../../geogenerator/)
* сборка [Aspose.GIS](../../../)


