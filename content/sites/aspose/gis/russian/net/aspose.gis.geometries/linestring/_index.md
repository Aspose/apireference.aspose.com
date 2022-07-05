---
title: LineString
second_title: Справочник по Aspose.GIS for .NET API
description: Многовершинная линия.
type: docs
weight: 1010
url: /ru/net/aspose.gis.geometries/linestring/
---
## LineString class

Многовершинная линия.

```csharp
public class LineString : Curve, ILineString
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [LineString](linestring#constructor)() | Инициализирует новый экземпляр класса[`LineString`](../linestring). |
| [LineString](linestring#constructor_2)(IEnumerable&lt;IPoint&gt;) | Инициализирует новый экземпляр класса[`LineString`](../linestring). |
| [LineString](linestring#constructor_1)(ILineString) | Инициализирует новый экземпляр класса[`LineString`](../linestring). |

## Характеристики

| Имя | Описание |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension) { get; } | Получает количество координатных измерений для этого[`Geometry`](../geometry). |
| [Count](../../aspose.gis.geometries/linestring/count) { get; } | Получает количество точек в[`LineString`](../linestring). |
| [Dimension](../../aspose.gis.geometries/curve/dimension) { get; } | Получает топологическую размерность этого[`Geometry`](../geometry). |
| override [EndPoint](../../aspose.gis.geometries/linestring/endpoint) { get; } | Возвращает копию конечной точки кривой. |
| override [GeometryType](../../aspose.gis.geometries/linestring/geometrytype) { get; } | Получает тип геометрии. |
| virtual [HasCurveGeometry](../../aspose.gis.geometries/geometry/hascurvegeometry) { get; } | Получает значение, указывающее, является ли эта геометрия кривой (не линейной) или содержит ее. |
| [HasM](../../aspose.gis.geometries/linestring/hasm) { get; set; } | Получает значение, указывающее, имеет ли данный экземпляр координату M. |
| [HasZ](../../aspose.gis.geometries/linestring/hasz) { get; set; } | Получает значение, указывающее, имеет ли данный экземпляр координату Z. |
| [IsClosed](../../aspose.gis.geometries/curve/isclosed) { get; } | Получает значения, указывающие, замкнута ли кривая. Кривая замкнута, если ее начальная точка совпадает с конечной точкой. |
| override [IsEmpty](../../aspose.gis.geometries/linestring/isempty) { get; } | Получает значение, указывающее, является ли этот экземпляр пустым. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple) { get; } | Получает значение, указывающее, является ли этот экземпляр простым с точки зрения SFA. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid) { get; } | Получает значение, указывающее, допустим ли этот экземпляр. |
| [Item](../../aspose.gis.geometries/linestring/item) { get; set; } | Получает или задает[`IPoint`](../ipoint)по указанному индексу. |
| [SpatialReferenceSystem](../../aspose.gis.geometries/linestring/spatialreferencesystem) { get; set; } | Получает SpatialReferenceSystem этого экземпляра. Это свойство может быть`null`, если SpatialReferenceSystem не установлено. Присвоение новой SpatialReferenceSystem не приведет к преобразованию координат, изменится только ссылка. |
| override [StartPoint](../../aspose.gis.geometries/linestring/startpoint) { get; } | Возвращает копию начальной точки кривой. |

## Методы

| Имя | Описание |
| --- | --- |
| [AddPoint](../../aspose.gis.geometries/linestring/addpoint#addpoint)(IPoint) | Добавляет точку в конец строки. |
| [AddPoint](../../aspose.gis.geometries/linestring/addpoint#addpoint_1)(double, double) | Добавляет точку в конец строки. |
| [AddPoint](../../aspose.gis.geometries/linestring/addpoint#addpoint_2)(double, double, double) | Добавляет точку в конец строки. |
| [AddPoint](../../aspose.gis.geometries/linestring/addpoint#addpoint_3)(double, double, double, double) | Добавляет точку в конец строки. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary)() | Преобразует эту геометрию в ее известное двоичное представление. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary)(WkbVariant) | Преобразует эту геометрию в ее известное двоичное представление. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(Measurement, Measurement, Renderer, VectorSymbolizer) | Экспортируйте эту геометрию в представление изображения. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Экспортируйте эту геометрию в представление изображения. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Экспортируйте эту геометрию в представление изображения. |
| [AsText](../../aspose.gis.geometries/geometry/astext)() | Преобразует эту геометрию в ее общеизвестное текстовое представление. |
| [AsText](../../aspose.gis.geometries/geometry/astext)(WktVariant) | Преобразует эту геометрию в ее общеизвестное текстовое представление. |
| [AsText](../../aspose.gis.geometries/geometry/astext)(WktVariant, NumericFormat) | Преобразует эту геометрию в ее общеизвестное текстовое представление. |
| override [Clone](../../aspose.gis.geometries/linestring/clone)() | Клонирует этот экземпляр. |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby)(IGeometry) | Определяет, покрывается ли эта геометрия указанной геометрией. |
| [Covers](../../aspose.gis.geometries/geometry/covers)(IGeometry) | Определяет, покрывает ли эта геометрия указанную геометрию. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses)(IGeometry) | Определяет, пересекаются ли эта геометрия и указанная геометрия. |
| [Difference](../../aspose.gis.geometries/geometry/difference)(IGeometry) | Вычитает указанную геометрию из этой геометрии. |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint)(IGeometry) | Определяет, не пересекается ли эта геометрия с указанной геометрией. |
| [Equals](../../aspose.gis.geometries/linestring/equals#equals)(ILineString) | Указывает, равен ли текущий объект другому объекту того же типа. |
| override [Equals](../../aspose.gis.geometries/linestring/equals#equals_1)(object) | Определяет, равен ли указанный объект текущему объекту. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea)() | Вычисляет площадь этой геометрии. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer)(double, int) | Вычисляет буферную область вокруг этой геометрии. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid)() | Вычисляет центр тяжести этой геометрии. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull)() | Вычисляет выпуклую оболочку этой геометрии. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto)(IGeometry) | Вычисляет минимальное расстояние между этой геометрией и указанной геометрией. |
| [GetEnumerator](../../aspose.gis.geometries/linestring/getenumerator)() | Возвращает перечислитель, который перебирает коллекцию. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent)() | Вычисляет и возвращает ограничивающий экстент этой геометрии. |
| override [GetHashCode](../../aspose.gis.geometries/linestring/gethashcode)() | Служит хэш-функцией по умолчанию. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength)() | Вычисляет длину этой геометрии. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection)(IGeometry) | Строит пересечение между этой геометрией и указанной геометрией. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects)(Extent) | Определяет, пересекает ли эта геометрия заданный экстент. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects)(IGeometry) | Определяет, пересекаются ли эта геометрия и указанная геометрия. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps)(IGeometry) | Определяет, перекрывается ли эта геометрия с указанной геометрией. |
| [Relate](../../aspose.gis.geometries/geometry/relate)(IGeometry, string) | Определяет, соответствует ли DE-9IM матрица пересечения этой геометрии и указанной геометрии заданному шаблону. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines)() | Получает многоугольники, представленные в виде линий этой геометрии. |
| override [Reverse](../../aspose.gis.geometries/linestring/reverse)() | Обратный порядок точек в этом[`LineString`](../linestring). |
| [RoundM](../../aspose.gis.geometries/geometry/roundm)(int) | Округляет координату M до указанного количества дробных цифр. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy)(int) | Округляет координаты X и Y до указанного количества дробных цифр. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz)(int) | Округляет координату Z до указанного количества дробных цифр. |
| override [SetEmpty](../../aspose.gis.geometries/linestring/setempty)() | Делает это[`Geometry`](../geometry)пустым. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains)(IGeometry) | Определяет, содержит ли эта геометрия в пространстве указанную геометрию. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals)(IGeometry) | Определяет, является ли эта геометрия пространственно равной указанной геометрии. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference)(IGeometry) | Создает симметричную разность между этой геометрией и указанной геометрией. |
| [ToEditable](../../aspose.gis.geometries/linestring/toeditable#toeditable_2)() | Получает редактируемую копию этой геометрии. (3 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable)() | Получает редактируемую копию этой геометрии. |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry)() | Получает приблизительную или эквивалентную некривую версию этой геометрии, используя допуск по умолчанию . (2 methods) |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry)(double) | Получает приблизительную или эквивалентную некривую версию этой геометрии с использованием указанного допуска . (2 methods) |
| override [ToString](../../aspose.gis.geometries/geometry/tostring)() | Возвращает строку, представляющую текущий объект. |
| [Touches](../../aspose.gis.geometries/geometry/touches)(IGeometry) | Определяет, соприкасаются ли эта геометрия и указанная геометрия. |
| [Union](../../aspose.gis.geometries/geometry/union)(IGeometry) | Объединяет эту геометрию и указанную геометрию. |
| [Within](../../aspose.gis.geometries/geometry/within)(Extent) | Определяет, находится ли эта геометрия в пределах указанного экстента. |
| [Within](../../aspose.gis.geometries/geometry/within)(IGeometry) | Определяет, находится ли эта геометрия в пределах указанной геометрии. |
| [operator ==](../../aspose.gis.geometries/linestring/op_equality) | Реализует оператор ==. |
| [operator !=](../../aspose.gis.geometries/linestring/op_inequality) | Реализует оператор !=. |

### Смотрите также

* class [Curve](../curve)
* interface [ILineString](../ilinestring)
* пространство имен [Aspose.Gis.Geometries](../../aspose.gis.geometries)
* сборка [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
