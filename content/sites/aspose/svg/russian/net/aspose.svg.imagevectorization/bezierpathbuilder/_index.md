---
title: Class BezierPathBuilder
second_title: Справочник по Aspose.SVG для .NET API
description: Aspose.Svg.ImageVectorization.BezierPathBuilder сорт. SplinePathBuilder класс отвечает за построение сегментов путиSVGPathSeg из списка точек трассировки. Этот построитель пути основан на использовании метода наименьших квадратов для поиска контрольных точек Безье для трассировки точек.
type: docs
weight: 2080
url: /ru/net/aspose.svg.imagevectorization/bezierpathbuilder/
---
## BezierPathBuilder class

[`SplinePathBuilder`](../splinepathbuilder/) класс отвечает за построение сегментов пути[`SVGPathSeg`](../../aspose.svg.paths/svgpathseg/) из списка точек трассировки. Этот построитель пути основан на использовании метода наименьших квадратов для поиска контрольных точек Безье для трассировки точек.

```csharp
public class BezierPathBuilder : IPathBuilder
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [BezierPathBuilder](bezierpathbuilder/)() | Инициализирует новый экземпляр`BezierPathBuilder` класс. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [ErrorThreshold](../../aspose.svg.imagevectorization/bezierpathbuilder/errorthreshold/) { get; set; } | Получает или задает порог ошибки. Этот параметр определяет максимальное отклонение точек от аппроксимированной кривой. По умолчанию 30. |
| [MaxIterations](../../aspose.svg.imagevectorization/bezierpathbuilder/maxiterations/) { get; set; } | Получает или задает порог ошибки. Этот параметр определяет количество итераций для метода аппроксимации наименьших квадратов. По умолчанию 30. |
| [TraceSmoother](../../aspose.svg.imagevectorization/bezierpathbuilder/tracesmoother/) { get; set; } | Получает или задает более плавную трассировку. |

## Методы

| Имя | Описание |
| --- | --- |
| [Build](../../aspose.svg.imagevectorization/bezierpathbuilder/build/)(IEnumerable&lt;PointF&gt;, SVGPathElement) | Строит сегменты пути из списка точек трассировки. |

### Смотрите также

* interface [IPathBuilder](../ipathbuilder/)
* пространство имен [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* сборка [Aspose.SVG](../../)


