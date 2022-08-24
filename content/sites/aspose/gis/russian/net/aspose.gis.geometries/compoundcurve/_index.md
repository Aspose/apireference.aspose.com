---
title: CompoundCurve
second_title: Справочник по Aspose.GIS for .NET API
description: Кривая представляющая собой последовательность смежных кривых так что соседние кривые соединяются в своих конечных точках.
type: docs
weight: 790
url: /ru/net/aspose.gis.geometries/compoundcurve/
---
## CompoundCurve class

Кривая, представляющая собой последовательность смежных кривых, так что соседние кривые соединяются в своих конечных точках.

```csharp
public class CompoundCurve : Curve, ICompoundCurve
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [CompoundCurve](compoundcurve#constructor)() | Инициализирует новый экземпляр[`CompoundCurve`](../compoundcurve) класс. |
| [CompoundCurve](compoundcurve#constructor_1)(ICompoundCurve) | Инициализирует новый экземпляр[`CompoundCurve`](../compoundcurve) класс. |
| [CompoundCurve](compoundcurve#constructor_2)(IEnumerable&lt;ICurve&gt;) | Инициализирует новый экземпляр[`CompoundCurve`](../compoundcurve) класс. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension) { get; } | Получает количество координатных измерений для этого[`Geometry`](../geometry) . |
| [Count](../../aspose.gis.geometries/compoundcurve/count) { get; } | Получает количество кривых в[`ICompoundCurve`](../icompoundcurve) . |
| [Dimension](../../aspose.gis.geometries/curve/dimension) { get; } | Получает топологическую размерность этого[`Geometry`](../geometry) . |
| override [EndPoint](../../aspose.gis.geometries/compoundcurve/endpoint) { get; } | Возвращает копию конечной точки кривой. |
| override [GeometryType](../../aspose.gis.geometries/compoundcurve/geometrytype) { get; } | Получает тип геометрии. |
| override [HasCurveGeometry](../../aspose.gis.geometries/compoundcurve/hascurvegeometry) { get; } | Получает значение, указывающее, является ли эта геометрия кривой (нелинейной) или содержит ее. |
| [HasM](../../aspose.gis.geometries/compoundcurve/hasm) { get; set; } | Получает значение, указывающее, имеет ли данный экземпляр координату M. |
| [HasZ](../../aspose.gis.geometries/compoundcurve/hasz) { get; set; } | Получает значение, указывающее, имеет ли данный экземпляр координату Z. |
| [IsClosed](../../aspose.gis.geometries/curve/isclosed) { get; } | Получает значения, указывающие, замкнута ли кривая. Кривая замкнута, если ее начальная точка совпадает с конечной точкой. |
| override [IsEmpty](../../aspose.gis.geometries/compoundcurve/isempty) { get; } | Получает значение, указывающее, является ли этот экземпляр пустым. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple) { get; } | Получает значение, указывающее, является ли этот экземпляр простым с точки зрения SFA. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid) { get; } | Получает значение, указывающее, является ли этот экземпляр допустимым. |
| [Item](../../aspose.gis.geometries/compoundcurve/item) { get; } | Получает[`ICurve`](../icurve) по указанному индексу. |
| [SpatialReferenceSystem](../../aspose.gis.geometries/compoundcurve/spatialreferencesystem) { get; set; } | Получает SpatialReferenceSystem этого экземпляра. Это свойство может быть`null` , если SpatialReferenceSystem не задан. Назначение новой SpatialReferenceSystem не приведет к преобразованию координат, изменится только привязка. |
| override [StartPoint](../../aspose.gis.geometries/compoundcurve/startpoint) { get; } | Возвращает копию начальной точки кривой. |

## Методы

| Имя | Описание |
| --- | --- |
| [AddCurve](../../aspose.gis.geometries/compoundcurve/addcurve)(ICurve) | Добавляет кривую в конец этого[`CompoundCurve`](../compoundcurve) . |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary)() | Преобразует эту геометрию в ее общеизвестное двоичное представление. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary)(WkbVariant) | Преобразует эту геометрию в ее общеизвестное двоичное представление. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(Measurement, Measurement, Renderer, VectorSymbolizer) | Экспорт этой геометрии в представление изображения. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Экспорт этой геометрии в представление изображения. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Экспорт этой геометрии в представление изображения. |
| [AsText](../../aspose.gis.geometries/geometry/astext)() | Преобразует эту геометрию в ее общеизвестное текстовое представление. |
| [AsText](../../aspose.gis.geometries/geometry/astext)(WktVariant) | Преобразует эту геометрию в ее общеизвестное текстовое представление. |
| [AsText](../../aspose.gis.geometries/geometry/astext)(WktVariant, NumericFormat) | Преобразует эту геометрию в ее общеизвестное текстовое представление. |
| override [Clone](../../aspose.gis.geometries/compoundcurve/clone)() | Клонирует этот экземпляр. |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby)(IGeometry) | Определяет, покрывается ли эта геометрия указанной геометрией. |
| [Covers](../../aspose.gis.geometries/geometry/covers)(IGeometry) | Определяет, покрывает ли эта геометрия указанную геометрию. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses)(IGeometry) | Определяет, пересекаются ли эта геометрия и указанная геометрия. |
| [Difference](../../aspose.gis.geometries/geometry/difference)(IGeometry) | Вычитает указанную геометрию из этой геометрии. |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint)(IGeometry) | Определяет, не пересекается ли эта геометрия с указанной геометрией. |
| [Equals](../../aspose.gis.geometries/compoundcurve/equals#equals)(ICompoundCurve) | Указывает, равен ли текущий объект другому объекту того же типа. |
| override [Equals](../../aspose.gis.geometries/compoundcurve/equals#equals_1)(object) | Определяет, равен ли указанный объект текущему объекту. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea)() | Вычисляет площадь этой геометрии. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer)(double, int) | Вычисляет область буфера вокруг этой геометрии. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid)() | Вычисляет центроид этой геометрии. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull)() | Вычисляет выпуклую оболочку этой геометрии. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto)(IGeometry) | Вычисляет минимальное расстояние между этой геометрией и указанной геометрией. |
| [GetEnumerator](../../aspose.gis.geometries/compoundcurve/getenumerator)() | Возвращает перечислитель, который выполняет итерацию по коллекции. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent)() | Вычисляет и возвращает ограничивающий экстент этой геометрии. |
| override [GetHashCode](../../aspose.gis.geometries/compoundcurve/gethashcode)() | Служит хеш-функцией по умолчанию. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength)() | Вычисляет длину этой геометрии. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection)(IGeometry) | Строит пересечение между этой геометрией и заданной геометрией. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects)(Extent) | Определяет, пересекает ли эта геометрия заданный экстент. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects)(IGeometry) | Определяет, пересекаются ли эта геометрия и указанная геометрия. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps)(IGeometry) | Определяет, перекрывается ли эта геометрия с указанной геометрией. |
| [Relate](../../aspose.gis.geometries/geometry/relate)(IGeometry, string) | Определяет, соответствует ли матрица пересечения DE-9IM этой геометрии и указанной геометрии предоставленному шаблону. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines)() | Получает многоугольники, представленные в виде линий этой геометрии. |
| override [Reverse](../../aspose.gis.geometries/compoundcurve/reverse)() | Отменяет это[`CompoundCurve`](../compoundcurve) . То есть - обратный порядок кривых и каждой кривой внутри этой составной кривой. |
| [RoundM](../../aspose.gis.geometries/geometry/roundm)(int) | Округляет координату M до указанного количества дробных цифр. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy)(int) | Округляет координаты X и Y до указанного количества дробных цифр. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz)(int) | Округляет координату Z до указанного количества дробных цифр. |
| override [SetEmpty](../../aspose.gis.geometries/compoundcurve/setempty)() | Делает это[`Geometry`](../geometry) пустой. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains)(IGeometry) | Определяет, содержит ли эта геометрия в пространстве указанную геометрию. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals)(IGeometry) | Определяет, является ли эта геометрия пространственно равной указанной геометрии. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference)(IGeometry) | Строит симметричную разность между этой геометрией и заданной геометрией. |
| [ToEditable](../../aspose.gis.geometries/compoundcurve/toeditable#toeditable)() | Получает редактируемую копию этой геометрии. (3 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable)() | Получает редактируемую копию этой геометрии. |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry)() | Получает приблизительную или эквивалентную некривую версию этой геометрии, используя значение по умолчанию.`толерантность` . (2 methods) |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry)(double) | Получает приблизительную или эквивалентную некривую версию этой геометрии, используя указанный`толерантность` . (2 methods) |
| override [ToString](../../aspose.gis.geometries/geometry/tostring)() | Возвращает строку, которая представляет текущий объект. |
| [Touches](../../aspose.gis.geometries/geometry/touches)(IGeometry) | Определяет, соприкасаются ли эта геометрия и указанная геометрия. |
| [Union](../../aspose.gis.geometries/geometry/union)(IGeometry) | Объединяет эту геометрию и указанную геометрию. |
| [Within](../../aspose.gis.geometries/geometry/within)(Extent) | Определяет, находится ли эта геометрия в пределах указанного экстента. |
| [Within](../../aspose.gis.geometries/geometry/within)(IGeometry) | Определяет, находится ли эта геометрия в пределах указанной геометрии. |
| [operator ==](../../aspose.gis.geometries/compoundcurve/op_equality) | Реализует оператор ==. |
| [operator !=](../../aspose.gis.geometries/compoundcurve/op_inequality) | Реализует оператор !=. |

### Примечания

Составная кривая не может содержать другие составные кривые.

### Смотрите также

* class [Curve](../curve)
* interface [ICompoundCurve](../icompoundcurve)
* пространство имен [Aspose.Gis.Geometries](../../aspose.gis.geometries)
* сборка [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
