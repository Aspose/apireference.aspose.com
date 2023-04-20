---
title: Class SplinePathBuilder
second_title: Справочник по Aspose.SVG для .NET API
description: Aspose.Svg.ImageVectorization.SplinePathBuilder сорт. SplinePathBuilder класс отвечает за построение сегментов путиSVGPathSeg из списка точек трассировки. Этот построитель пути основан на применении сплайна КатмуллаРома к набору сглаженных и уменьшенных точек пути..
type: docs
weight: 2160
url: /ru/net/aspose.svg.imagevectorization/splinepathbuilder/
---
## SplinePathBuilder class

`SplinePathBuilder` класс отвечает за построение сегментов пути[`SVGPathSeg`](../../aspose.svg.paths/svgpathseg/) из списка точек трассировки. Этот построитель пути основан на применении сплайна Катмулла-Рома к набору сглаженных и уменьшенных точек пути..

```csharp
public class SplinePathBuilder : IPathBuilder
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [SplinePathBuilder](splinepathbuilder/#constructor)() | Инициализирует новый экземпляр`SplinePathBuilder` класс. |
| [SplinePathBuilder](splinepathbuilder/#constructor_2)(float) | Инициализирует новый экземпляр`SplinePathBuilder` класс. |
| [SplinePathBuilder](splinepathbuilder/#constructor_1)(IImageTraceSmoother, IImageTraceSimplifier, float) | Инициализирует новый экземпляр`SplinePathBuilder` класс. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [Tension](../../aspose.svg.imagevectorization/splinepathbuilder/tension/) { get; set; } | Значение натяжения влияет на то, насколько круто изгибается кривая в (интерполированных) контрольных точках. Оно должно быть в диапазоне от 0 до 1. Любые более высокие или более низкие значения будут совмещены с минимальными и максимальными значениями этого диапазона, соответственно. |
| [TraceSimplifier](../../aspose.svg.imagevectorization/splinepathbuilder/tracesimplifier/) { get; set; } | Получает или задает средство упрощения трассировки. |
| [TraceSmoother](../../aspose.svg.imagevectorization/splinepathbuilder/tracesmoother/) { get; set; } | Получает или задает более плавную трассировку. |

## Методы

| Имя | Описание |
| --- | --- |
| [Build](../../aspose.svg.imagevectorization/splinepathbuilder/build/)(IEnumerable&lt;PointF&gt;, SVGPathElement) | Строит сегменты пути из списка точек трассировки. |

### Смотрите также

* interface [IPathBuilder](../ipathbuilder/)
* пространство имен [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* сборка [Aspose.SVG](../../)


