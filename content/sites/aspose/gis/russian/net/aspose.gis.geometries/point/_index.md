---
title: Point
second_title: Справочник по Aspose.GIS for .NET API
description: АPoint./point представляет одно место в координатном пространстве.
type: docs
weight: 1090
url: /ru/net/aspose.gis.geometries/point/
---
## Point class

А[`Point`](../point) представляет одно место в координатном пространстве.

```csharp
public class Point : Geometry, IPoint
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [Point](point#constructor)() | Инициализирует новый экземпляр[`Point`](../point) класс. |
| [Point](point#constructor_1)(IPoint) | Инициализирует новый экземпляр[`Point`](../point) класс. |
| [Point](point#constructor_2)(double, double) | Инициализирует новый экземпляр[`Point`](../point) класс. |
| [Point](point#constructor_3)(double, double, double) | Инициализирует новый экземпляр[`Point`](../point) класс. |
| [Point](point#constructor_4)(double, double, double, double) | Инициализирует новый экземпляр[`Point`](../point) класс. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension) { get; } | Получает количество координатных измерений для этого[`Geometry`](../geometry) . |
| override [Dimension](../../aspose.gis.geometries/point/dimension) { get; } | Получает топологическую размерность этого[`Geometry`](../geometry) . |
| override [GeometryType](../../aspose.gis.geometries/point/geometrytype) { get; } | Получает тип геометрии. |
| virtual [HasCurveGeometry](../../aspose.gis.geometries/geometry/hascurvegeometry) { get; } | Получает значение, указывающее, является ли эта геометрия кривой (нелинейной) или содержит ее. |
| override [HasM](../../aspose.gis.geometries/point/hasm) { get; set; } | Получает значение, указывающее, имеет ли данный экземпляр координату M. |
| override [HasZ](../../aspose.gis.geometries/point/hasz) { get; set; } | Получает значение, указывающее, имеет ли данный экземпляр координату Z. |
| virtual [IsEmpty](../../aspose.gis.geometries/geometry/isempty) { get; } | Получает значение, указывающее, является ли этот экземпляр пустым. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple) { get; } | Получает значение, указывающее, является ли этот экземпляр простым с точки зрения SFA. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid) { get; } | Получает значение, указывающее, является ли этот экземпляр допустимым. |
| [M](../../aspose.gis.geometries/point/m) { get; set; } | Получает или задает значение m-координаты. |
| override [SpatialReferenceSystem](../../aspose.gis.geometries/point/spatialreferencesystem) { get; set; } | Получает SpatialReferenceSystem этого экземпляра. Это свойство может быть`null` , is SpatialReferenceSystem is unknown. Назначение новой SpatialReferenceSystem не будет выполнять никакого преобразования координат, изменится только ссылка. |
| [X](../../aspose.gis.geometries/point/x) { get; set; } | Получает или задает значение координаты x. |
| [Y](../../aspose.gis.geometries/point/y) { get; set; } | Получает или задает значение координаты Y. |
| [Z](../../aspose.gis.geometries/point/z) { get; set; } | Получает или задает значение координаты z. |

## Методы

| Имя | Описание |
| --- | --- |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary)() | Преобразует эту геометрию в ее общеизвестное двоичное представление. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary)(WkbVariant) | Преобразует эту геометрию в ее общеизвестное двоичное представление. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(Measurement, Measurement, Renderer, VectorSymbolizer) | Экспорт этой геометрии в представление изображения. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Экспорт этой геометрии в представление изображения. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Экспорт этой геометрии в представление изображения. |
| [AsText](../../aspose.gis.geometries/geometry/astext)() | Преобразует эту геометрию в ее общеизвестное текстовое представление. |
| [AsText](../../aspose.gis.geometries/geometry/astext)(WktVariant) | Преобразует эту геометрию в ее общеизвестное текстовое представление. |
| [AsText](../../aspose.gis.geometries/geometry/astext)(WktVariant, NumericFormat) | Преобразует эту геометрию в ее общеизвестное текстовое представление. |
| override [Clone](../../aspose.gis.geometries/point/clone)() | Клонирует этот экземпляр. |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby)(IGeometry) | Определяет, покрывается ли эта геометрия указанной геометрией. |
| [Covers](../../aspose.gis.geometries/geometry/covers)(IGeometry) | Определяет, покрывает ли эта геометрия указанную геометрию. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses)(IGeometry) | Определяет, пересекаются ли эта геометрия и указанная геометрия. |
| [Difference](../../aspose.gis.geometries/geometry/difference)(IGeometry) | Вычитает указанную геометрию из этой геометрии. |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint)(IGeometry) | Определяет, не пересекается ли эта геометрия с указанной геометрией. |
| [Equals](../../aspose.gis.geometries/point/equals#equals)(IPoint) | Указывает, равен ли текущий объект другому объекту того же типа. |
| override [Equals](../../aspose.gis.geometries/point/equals#equals_1)(object) | Определяет, равен ли указанный объект текущему объекту. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea)() | Вычисляет площадь этой геометрии. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer)(double, int) | Вычисляет область буфера вокруг этой геометрии. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid)() | Вычисляет центроид этой геометрии. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull)() | Вычисляет выпуклую оболочку этой геометрии. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto)(IGeometry) | Вычисляет минимальное расстояние между этой геометрией и указанной геометрией. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent)() | Вычисляет и возвращает ограничивающий экстент этой геометрии. |
| override [GetHashCode](../../aspose.gis.geometries/point/gethashcode)() | Служит хеш-функцией по умолчанию. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength)() | Вычисляет длину этой геометрии. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection)(IGeometry) | Строит пересечение между этой геометрией и заданной геометрией. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects)(Extent) | Определяет, пересекает ли эта геометрия заданный экстент. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects)(IGeometry) | Определяет, пересекаются ли эта геометрия и указанная геометрия. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps)(IGeometry) | Определяет, перекрывается ли эта геометрия с указанной геометрией. |
| [Relate](../../aspose.gis.geometries/geometry/relate)(IGeometry, string) | Определяет, соответствует ли матрица пересечения DE-9IM этой геометрии и указанной геометрии предоставленному шаблону. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines)() | Получает многоугольники, представленные в виде линий этой геометрии. |
| [RoundM](../../aspose.gis.geometries/geometry/roundm)(int) | Округляет координату M до указанного количества дробных цифр. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy)(int) | Округляет координаты X и Y до указанного количества дробных цифр. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz)(int) | Округляет координату Z до указанного количества дробных цифр. |
| override [SetEmpty](../../aspose.gis.geometries/point/setempty)() | Делает это[`Geometry`](../geometry) пустой. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains)(IGeometry) | Определяет, содержит ли эта геометрия в пространстве указанную геометрию. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals)(IGeometry) | Определяет, является ли эта геометрия пространственно равной указанной геометрии. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference)(IGeometry) | Строит симметричную разность между этой геометрией и заданной геометрией. |
| [ToEditable](../../aspose.gis.geometries/point/toeditable#toeditable_1)() | Получает редактируемую копию этой геометрии. (2 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable)() | Получает редактируемую копию этой геометрии. |
| [ToLinearGeometry](../../aspose.gis.geometries/geometry/tolineargeometry)() | Получает приблизительную или эквивалентную некривую версию этой геометрии, используя значение по умолчанию.`толерантность` . |
| [ToLinearGeometry](../../aspose.gis.geometries/geometry/tolineargeometry)(double) | Получает приблизительную или эквивалентную некривую версию этой геометрии, используя указанный`толерантность` . |
| override [ToString](../../aspose.gis.geometries/geometry/tostring)() | Возвращает строку, которая представляет текущий объект. |
| [Touches](../../aspose.gis.geometries/geometry/touches)(IGeometry) | Определяет, соприкасаются ли эта геометрия и указанная геометрия. |
| [Union](../../aspose.gis.geometries/geometry/union)(IGeometry) | Объединяет эту геометрию и указанную геометрию. |
| [Within](../../aspose.gis.geometries/geometry/within)(Extent) | Определяет, находится ли эта геометрия в пределах указанного экстента. |
| [Within](../../aspose.gis.geometries/geometry/within)(IGeometry) | Определяет, находится ли эта геометрия в пределах указанной геометрии. |
| [operator ==](../../aspose.gis.geometries/point/op_equality) | Реализует оператор ==. |
| [operator !=](../../aspose.gis.geometries/point/op_inequality) | Реализует оператор !=. |

### Смотрите также

* class [Geometry](../geometry)
* interface [IPoint](../ipoint)
* пространство имен [Aspose.Gis.Geometries](../../aspose.gis.geometries)
* сборка [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
