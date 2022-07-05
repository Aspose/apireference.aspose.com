---
title: IGeometry
second_title: Справочник по Aspose.GIS for .NET API
description: Корневой класс интерфейса иерархии геометрий
type: docs
weight: 890
url: /ru/net/aspose.gis.geometries/igeometry/
---
## IGeometry interface

Корневой класс интерфейса иерархии геометрий

```csharp
public interface IGeometry
```

## Характеристики

| Имя | Описание |
| --- | --- |
| [Dimension](../../aspose.gis.geometries/igeometry/dimension) { get; } | Получает топологическую размерность этого[`IGeometry`](../igeometry). Если размерность неизвестна (например, для пустой GEOMETRYCOLLECTION), возвращаетсяPoint. |
| [GeometryType](../../aspose.gis.geometries/igeometry/geometrytype) { get; } | Получает тип геометрии. |
| [HasCurveGeometry](../../aspose.gis.geometries/igeometry/hascurvegeometry) { get; } | Получает значение, указывающее, является ли эта геометрия кривой (не линейной) или содержит ее. |
| [HasM](../../aspose.gis.geometries/igeometry/hasm) { get; } | Получает значение, указывающее, имеет ли данный экземпляр координату M. |
| [HasZ](../../aspose.gis.geometries/igeometry/hasz) { get; } | Получает значение, указывающее, имеет ли данный экземпляр координату Z. |
| [IsEmpty](../../aspose.gis.geometries/igeometry/isempty) { get; } | Получает значение, указывающее, является ли этот экземпляр пустым (представляет пустой набор точек). |
| [IsSimple](../../aspose.gis.geometries/igeometry/issimple) { get; } | Получает значение, указывающее, является ли этот экземпляр простым с точки зрения SFA. |
| [IsValid](../../aspose.gis.geometries/igeometry/isvalid) { get; } | Получает значение, указывающее, допустим ли этот экземпляр. |
| [SpatialReferenceSystem](../../aspose.gis.geometries/igeometry/spatialreferencesystem) { get; } | Получает SpatialReferenceSystem этого экземпляра. Это свойство может быть`null`, если SpatialReferenceSystem неизвестна. |

## Методы

| Имя | Описание |
| --- | --- |
| [AsBinary](../../aspose.gis.geometries/igeometry/asbinary#asbinary)() | Преобразует эту геометрию в ее известное двоичное представление. |
| [AsBinary](../../aspose.gis.geometries/igeometry/asbinary#asbinary_1)(WkbVariant) | Преобразует эту геометрию в ее известное двоичное представление. |
| [AsImage](../../aspose.gis.geometries/igeometry/asimage#asimage)(Measurement, Measurement, Renderer, VectorSymbolizer) | Экспортируйте эту геометрию в представление изображения. |
| [AsImage](../../aspose.gis.geometries/igeometry/asimage#asimage_1)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Экспортируйте эту геометрию в представление изображения. |
| [AsImage](../../aspose.gis.geometries/igeometry/asimage#asimage_2)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Экспортируйте эту геометрию в представление изображения. |
| [AsText](../../aspose.gis.geometries/igeometry/astext#astext)() | Преобразует эту геометрию в ее общеизвестное текстовое представление. |
| [AsText](../../aspose.gis.geometries/igeometry/astext#astext_1)(WktVariant) | Преобразует эту геометрию в ее общеизвестное текстовое представление. |
| [AsText](../../aspose.gis.geometries/igeometry/astext#astext_2)(WktVariant, NumericFormat) | Преобразует эту геометрию в ее общеизвестное текстовое представление. |
| [Clone](../../aspose.gis.geometries/igeometry/clone)() | Клонирует этот экземпляр. |
| [CoveredBy](../../aspose.gis.geometries/igeometry/coveredby)(IGeometry) | Определяет, покрывается ли эта геометрия указанной геометрией. |
| [Covers](../../aspose.gis.geometries/igeometry/covers)(IGeometry) | Определяет, покрывает ли эта геометрия указанную геометрию. |
| [Crosses](../../aspose.gis.geometries/igeometry/crosses)(IGeometry) | Определяет, пересекаются ли эта геометрия и указанная геометрия. |
| [Difference](../../aspose.gis.geometries/igeometry/difference)(IGeometry) | Вычитает указанную геометрию из этой геометрии. |
| [Disjoint](../../aspose.gis.geometries/igeometry/disjoint)(IGeometry) | Определяет, не пересекается ли эта геометрия с указанной геометрией. |
| [GetArea](../../aspose.gis.geometries/igeometry/getarea)() | Вычисляет площадь этой геометрии. |
| [GetBuffer](../../aspose.gis.geometries/igeometry/getbuffer)(double, int) | Вычисляет буферную область вокруг этой геометрии. |
| [GetCentroid](../../aspose.gis.geometries/igeometry/getcentroid)() | Вычисляет центр тяжести этой геометрии. |
| [GetConvexHull](../../aspose.gis.geometries/igeometry/getconvexhull)() | Вычисляет выпуклую оболочку этой геометрии. |
| [GetDistanceTo](../../aspose.gis.geometries/igeometry/getdistanceto)(IGeometry) | Вычисляет минимальное расстояние между этой геометрией и указанной геометрией. |
| [GetExtent](../../aspose.gis.geometries/igeometry/getextent)() | Вычисляет и возвращает ограничивающий экстент этой геометрии. |
| [GetLength](../../aspose.gis.geometries/igeometry/getlength)() | Вычисляет длину этой геометрии. |
| [Intersection](../../aspose.gis.geometries/igeometry/intersection)(IGeometry) | Строит пересечение между этой геометрией и указанной геометрией. |
| [Intersects](../../aspose.gis.geometries/igeometry/intersects#intersects)(Extent) | Определяет, пересекает ли эта геометрия заданный экстент. |
| [Intersects](../../aspose.gis.geometries/igeometry/intersects#intersects_1)(IGeometry) | Определяет, пересекаются ли эта геометрия и указанная геометрия. |
| [Overlaps](../../aspose.gis.geometries/igeometry/overlaps)(IGeometry) | Определяет, перекрывается ли эта геометрия с указанной геометрией. |
| [Relate](../../aspose.gis.geometries/igeometry/relate)(IGeometry, string) | Определяет, соответствует ли DE-9IM матрица пересечения этой геометрии и указанной геометрии заданному шаблону. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/igeometry/replacepolygonsbylines)() | Получает многоугольники, представленные в виде линий этой геометрии. |
| [SpatiallyContains](../../aspose.gis.geometries/igeometry/spatiallycontains)(IGeometry) | Определяет, содержит ли эта геометрия в пространстве указанную геометрию. |
| [SpatiallyEquals](../../aspose.gis.geometries/igeometry/spatiallyequals)(IGeometry) | Определяет, является ли эта геометрия пространственно равной указанной геометрии. |
| [SymDifference](../../aspose.gis.geometries/igeometry/symdifference)(IGeometry) | Создает симметричную разность между этой геометрией и указанной геометрией. |
| [ToEditable](../../aspose.gis.geometries/igeometry/toeditable#toeditable)() | Получает редактируемую копию этой геометрии. |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/igeometry/toeditable#toeditable_1)() | Получает редактируемую копию этой геометрии. |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometry/tolineargeometry#tolineargeometry)() | Получает приблизительную или эквивалентную некривую версию этой геометрии, используя допуск по умолчанию . |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometry/tolineargeometry#tolineargeometry_1)(double) | Получает приблизительную или эквивалентную некривую версию этой геометрии с использованием указанного допуска . |
| [Touches](../../aspose.gis.geometries/igeometry/touches)(IGeometry) | Определяет, соприкасаются ли эта геометрия и указанная геометрия. |
| [Union](../../aspose.gis.geometries/igeometry/union)(IGeometry) | Объединяет эту геометрию и указанную геометрию. |
| [Within](../../aspose.gis.geometries/igeometry/within#within)(Extent) | Определяет, находится ли эта геометрия в пределах указанного экстента. |
| [Within](../../aspose.gis.geometries/igeometry/within#within_1)(IGeometry) | Определяет, находится ли эта геометрия в пределах указанной геометрии. |

### Смотрите также

* пространство имен [Aspose.Gis.Geometries](../../aspose.gis.geometries)
* сборка [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
