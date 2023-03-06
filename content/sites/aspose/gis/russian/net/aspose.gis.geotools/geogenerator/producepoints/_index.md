---
title: GeoGenerator.ProducePoints
second_title: Справочник по Aspose.GIS for .NET API
description: GeoGenerator метод. Создает массив точек принадлежащих указанной области.
type: docs
weight: 20
url: /ru/net/aspose.gis.geotools/geogenerator/producepoints/
---
## GeoGenerator.ProducePoints method

Создает массив точек, принадлежащих указанной области.

```csharp
public static IEnumerable<IGeometry> ProducePoints(Extent rect, PointGeneratorOptions options)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| rect | Extent | указанная площадь (см.[`Степень`](../../../aspose.gis/extent/)). |
| options | PointGeneratorOptions | Параметры создания точки (см.[`Параметры генератора точек`](../../pointgeneratoroptions/)). |

### Возвращаемое значение

Массив точек (см. перечисление[`ИГеометрия`](../../../aspose.gis.geometries/igeometry/)).

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentOutOfRangeException | Количество баллов должно быть больше одного. |
| NullReferenceException | Экстент должен иметь значение (не быть NULL). |

### Смотрите также

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [Extent](../../../aspose.gis/extent/)
* class [PointGeneratorOptions](../../pointgeneratoroptions/)
* class [GeoGenerator](../)
* пространство имен [Aspose.Gis.GeoTools](../../geogenerator/)
* сборка [Aspose.GIS](../../../)


