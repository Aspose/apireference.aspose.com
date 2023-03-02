---
title: Interface ICurve
second_title: Справочник по Aspose.GIS for .NET API
description: Aspose.Gis.Geometries.ICurve интерфейс. АICurve представляет собой последовательность точек.
type: docs
weight: 980
url: /ru/net/aspose.gis.geometries/icurve/
---
## ICurve interface

А`ICurve` представляет собой последовательность точек.

```csharp
public interface ICurve : IGeometry
```

## Характеристики

| Имя | Описание |
| --- | --- |
| [EndPoint](../../aspose.gis.geometries/icurve/endpoint/) { get; } | Возвращает копию конечной точки кривой. |
| [IsClosed](../../aspose.gis.geometries/icurve/isclosed/) { get; } | Получает значения, указывающие, замкнута ли кривая. Кривая замкнута, если ее начальная точка совпадает с конечной точкой. |
| [StartPoint](../../aspose.gis.geometries/icurve/startpoint/) { get; } | Возвращает копию начальной точки кривой. |

## Методы

| Имя | Описание |
| --- | --- |
| [ToEditable](../../aspose.gis.geometries/icurve/toeditable/)() | Получает редактируемую копию этой геометрии. |
| [ToLinearGeometry](../../aspose.gis.geometries/icurve/tolineargeometry/#tolineargeometry)() | Получает приблизительную или эквивалентную некривую версию этой геометрии, используя значение по умолчанию.`толерантность` . |
| [ToLinearGeometry](../../aspose.gis.geometries/icurve/tolineargeometry/#tolineargeometry_1)(double) | Получает приблизительную или эквивалентную некривую версию этой геометрии, используя указанный`толерантность` . |

### Смотрите также

* interface [IGeometry](../igeometry/)
* пространство имен [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* сборка [Aspose.GIS](../../)


