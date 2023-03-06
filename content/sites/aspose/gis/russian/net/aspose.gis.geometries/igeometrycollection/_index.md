---
title: Interface IGeometryCollection
second_title: Справочник по Aspose.GIS for .NET API
description: Aspose.Gis.Geometries.IGeometryCollection интерфейс. АIGeometryCollection этоIGeometry это набор из одной или нескольких геометрий.
type: docs
weight: 1010
url: /ru/net/aspose.gis.geometries/igeometrycollection/
---
## IGeometryCollection interface

А`IGeometryCollection` это[`IGeometry`](../igeometry/) это набор из одной или нескольких геометрий.

```csharp
public interface IGeometryCollection : IEnumerable<IGeometry>, IEquatable<IGeometryCollection>, 
    IGeometry
```

## Характеристики

| Имя | Описание |
| --- | --- |
| [Count](../../aspose.gis.geometries/igeometrycollection/count/) { get; } | Получает количество геометрий в этой коллекции. |
| [Item](../../aspose.gis.geometries/igeometrycollection/item/) { get; } | Получает[`IGeometry`](../igeometry/) по указанному индексу. |

## Методы

| Имя | Описание |
| --- | --- |
| [GetPointOnSurface](../../aspose.gis.geometries/igeometrycollection/getpointonsurface/)() | Находит точку, которая гарантированно находится на одной из поверхностей в этой коллекции. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/igeometrycollection/replacepolygonsbylines/)() | Получает многоугольники, представленные в виде линий этой геометрии. |
| [ToEditable](../../aspose.gis.geometries/igeometrycollection/toeditable/)() | Получает редактируемую копию этой геометрии. |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometrycollection/tolineargeometry/#tolineargeometry)() | Получает приблизительную или эквивалентную некривую версию этой геометрии, используя значение по умолчанию.`толерантность` . |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometrycollection/tolineargeometry/#tolineargeometry_1)(double) | Получает приблизительную или эквивалентную некривую версию этой геометрии, используя указанный`толерантность` . |

### Смотрите также

* interface [IGeometry](../igeometry/)
* пространство имен [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* сборка [Aspose.GIS](../../)


