---
title: NurbsCurve
second_title: Справочник по Aspose.3D для .NET API
description: кривая NURBShttps//en.wikipedia.org/wiki/Non-uniform_rational_B-spline представляет собой кривую представленную NURBS неоднородный рациональный базисный сплайн Кривая NURBS определяется ееOrder./nurbscurve/order  набор взвешенныхControlPoints./geometry/controlpoints иKnotVectors./nurbscurve/knotvectors Компонент w в контрольной точке используется как вес контрольной точки какой бы она ни былаTwoDimensional или жеThreeDimensional
type: docs
weight: 460
url: /ru/net/aspose.threed.entities/nurbscurve/
---
## NurbsCurve class

[кривая NURBS](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline) представляет собой кривую, представленную NURBS (неоднородный рациональный базисный сплайн), Кривая NURBS определяется ее[`Order`](./order) , набор взвешенных[`ControlPoints`](../geometry/controlpoints) и[`KnotVectors`](./knotvectors) Компонент w в контрольной точке используется как вес контрольной точки, какой бы она ни былаTwoDimensional или жеThreeDimensional

```csharp
public class NurbsCurve : Curve
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [NurbsCurve](nurbscurve#constructor)() | Инициализирует новый экземпляр[`NurbsCurve`](../nurbscurve) класс. |
| [NurbsCurve](nurbscurve#constructor_1)(string) | Инициализирует новый экземпляр[`NurbsCurve`](../nurbscurve) класс. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [Color](../../aspose.threed.entities/curve/color) { get; set; } | Получает или задает цвет линии, значение по умолчанию — белый (1, 1, 1) |
| [ControlPoints](../../aspose.threed.entities/nurbscurve/controlpoints) { get; } | Получить все контрольные точки |
| [CurveType](../../aspose.threed.entities/nurbscurve/curvetype) { get; set; } | Получает или задает тип кривой. |
| [Dimension](../../aspose.threed.entities/nurbscurve/dimension) { get; set; } | Получает или задает размер кривой. |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Получает или задает, следует ли исключить этот объект при экспорте. |
| [KnotVectors](../../aspose.threed.entities/nurbscurve/knotvectors) { get; } | Получает вектор узлов, это последовательность значений параметров, которая определяет, где и как контрольные точки влияют на кривую NURBS. |
| [Multiplicity](../../aspose.threed.entities/nurbscurve/multiplicity) { get; } | Получает кратность. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Получает или задает имя. |
| [Order](../../aspose.threed.entities/nurbscurve/order) { get; set; } | Получает или задает порядок кривой NURBS, он определяет количество ближайших контрольных точек, которые влияют на любую заданную точку на кривой. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Получает или задает первый родительский узел, если задан первый родительский узел, этот объект будет отсоединен от других родительских узлов. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Получает все родительские узлы, сущность может быть присоединена к нескольким родительским узлам для экземпляра геометрии |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Получает коллекцию всех свойств. |
| [Rational](../../aspose.threed.entities/nurbscurve/rational) { get; set; } | Получает или задает, является ли оно рациональным, это значение указывает, является ли это[`NurbsCurve`](../nurbscurve) является рациональным или нерациональным сплайном. Нерациональный B-сплайн является частным случаем рациональных B-сплайнов. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Получает сцену, которой принадлежит этот объект |

## Методы

| Имя | Описание |
| --- | --- |
| [Evaluate](../../aspose.threed.entities/nurbscurve/evaluate)(int) | Оценить кривую NURBS |
| [EvaluateAt](../../aspose.threed.entities/nurbscurve/evaluateat)(double) | Оценить точку кривой в указанной позиции |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Находит свойство. Это может быть динамическое свойство (созданное CreateDynamicProperty/SetProperty) или родное свойство (идентифицированное по имени) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Получает ограничивающую рамку текущего объекта в его системе координат объектного пространства. |
| override [GetEntityRendererKey](../../aspose.threed.entities/curve/getentityrendererkey)() | Получает ключ средства визуализации объектов, зарегистрированного в средстве визуализации |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Получить значение указанного свойства |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Удаляет динамическое свойство. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Удалить указанное свойство с именем name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Устанавливает значение указанного свойства |

### Смотрите также

* class [Curve](../curve)
* пространство имен [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* сборка [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
