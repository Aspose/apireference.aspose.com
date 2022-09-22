---
title: LinearGradientBrush
second_title: Справочник по API Aspose.Drawing для .NET
description: ИнкапсулируетBrush с линейным градиентом. Этот класс не может быть унаследован.
type: docs
weight: 340
url: /ru/net/system.drawing.drawing2d/lineargradientbrush/
---
## LinearGradientBrush class

ИнкапсулируетBrush с линейным градиентом. Этот класс не может быть унаследован.

```csharp
public sealed class LinearGradientBrush : Brush
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [LinearGradientBrush](lineargradientbrush#constructor)(Point, Point, Color, Color) | Инициализирует новый экземпляр[`LinearGradientBrush`](../lineargradientbrush) класс с указанными точками и цветами. |
| [LinearGradientBrush](lineargradientbrush#constructor_1)(PointF, PointF, Color, Color) | Инициализирует новый экземпляр[`LinearGradientBrush`](../lineargradientbrush) класс с указанными точками и цветами. |
| [LinearGradientBrush](lineargradientbrush#constructor_2)(Rectangle, Color, Color, float) | Инициализирует новый экземпляр[`LinearGradientBrush`](../lineargradientbrush)класс на основе прямоугольника, начального и конечного цветов и угла ориентации. |
| [LinearGradientBrush](lineargradientbrush#constructor_4)(Rectangle, Color, Color, LinearGradientMode) | Инициализирует новый экземпляр[`LinearGradientBrush`](../lineargradientbrush) класс на основе прямоугольника, начального и конечного цветов и ориентации. |
| [LinearGradientBrush](lineargradientbrush#constructor_5)(RectangleF, Color, Color, float) | Инициализирует новый экземпляр[`LinearGradientBrush`](../lineargradientbrush)класс на основе прямоугольника, начального и конечного цветов и угла ориентации. |
| [LinearGradientBrush](lineargradientbrush#constructor_7)(RectangleF, Color, Color, LinearGradientMode) | Инициализирует новый экземпляр[`LinearGradientBrush`](../lineargradientbrush) класс на основе прямоугольника, начального и конечного цветов и режима ориентации. |
| [LinearGradientBrush](lineargradientbrush#constructor_3)(Rectangle, Color, Color, float, bool) | Инициализирует новый экземпляр[`LinearGradientBrush`](../lineargradientbrush)класс на основе прямоугольника, начального и конечного цветов и угла ориентации. |
| [LinearGradientBrush](lineargradientbrush#constructor_6)(RectangleF, Color, Color, float, bool) | Инициализирует новый экземпляр[`LinearGradientBrush`](../lineargradientbrush)класс на основе прямоугольника, начального и конечного цветов и угла ориентации. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [Blend](../../system.drawing.drawing2d/lineargradientbrush/blend) { get; set; } | Получает или задаетBlend который указывает позиции и факторы, определяющие спад custom для градиента. |
| [GammaCorrection](../../system.drawing.drawing2d/lineargradientbrush/gammacorrection) { get; set; } | Получает или задает значение, указывающее, включена ли гамма-коррекция для этогоLinearGradientBrush . |
| [InterpolationColors](../../system.drawing.drawing2d/lineargradientbrush/interpolationcolors) { get; set; } | Получает или задаетColorBlendкоторый определяет многоцветный линейный градиент. |
| [LinearColors](../../system.drawing.drawing2d/lineargradientbrush/linearcolors) { get; set; } | Получает или задает начальный и конечный цвета градиента. |
| [Rectangle](../../system.drawing.drawing2d/lineargradientbrush/rectangle) { get; } | Получает прямоугольную область, определяющую начальную и конечную точки градиента. |
| [Transform](../../system.drawing.drawing2d/lineargradientbrush/transform) { get; set; } | Получает или устанавливает копиюMatrix который определяет локальное геометрическое преобразование для этогоLinearGradientBrush . |
| [WrapMode](../../system.drawing.drawing2d/lineargradientbrush/wrapmode) { get; set; } | Получает или задаетWrapMode перечисление, указывающее режим переноса для этогоLinearGradientBrush . |

## Методы

| Имя | Описание |
| --- | --- |
| override [Clone](../../system.drawing.drawing2d/lineargradientbrush/clone)() | Создает точную копию этогоLinearGradientBrush . |
| [Dispose](../../system.drawing/brush/dispose)() | Освобождает все ресурсы, используемые этим объектом Brush. |
| [MultiplyTransform](../../system.drawing.drawing2d/lineargradientbrush/multiplytransform#multiplytransform)(Matrix) | УмножаетMatrix который представляет локальное геометрическое преобразование этогоLinearGradientBrush указаннымMatrix путем добавления указанногоMatrix . |
| [MultiplyTransform](../../system.drawing.drawing2d/lineargradientbrush/multiplytransform#multiplytransform_1)(Matrix, MatrixOrder) | УмножаетMatrix который представляет локальное геометрическое преобразование этогоLinearGradientBrush указаннымMatrix в указанном порядке. |
| [ResetTransform](../../system.drawing.drawing2d/lineargradientbrush/resettransform)() | СбрасываетTransform свойство к личности. |
| [RotateTransform](../../system.drawing.drawing2d/lineargradientbrush/rotatetransform#rotatetransform)(float) | Поворачивает локальное геометрическое преобразование на указанную величину. Этот метод добавляет поворот к преобразованию. |
| [RotateTransform](../../system.drawing.drawing2d/lineargradientbrush/rotatetransform#rotatetransform_1)(float, MatrixOrder) | Поворачивает локальное геометрическое преобразование на указанную величину в указанном порядке. |
| [ScaleTransform](../../system.drawing.drawing2d/lineargradientbrush/scaletransform#scaletransform)(float, float) | Масштабирует локальное геометрическое преобразование на указанные величины. Этот метод добавляет матрицу масштабирования перед преобразованием. |
| [ScaleTransform](../../system.drawing.drawing2d/lineargradientbrush/scaletransform#scaletransform_1)(float, float, MatrixOrder) | Масштабирует локальное геометрическое преобразование на указанные величины в указанном порядке. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/lineargradientbrush/setblendtriangularshape#setblendtriangularshape)(float) | Создает линейный градиент с центральным цветом и линейным спадом к одному цвету на обоих концах. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/lineargradientbrush/setblendtriangularshape#setblendtriangularshape_1)(float, float) | Создает линейный градиент с центральным цветом и линейным спадом к одному цвету на обоих концах. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/lineargradientbrush/setsigmabellshape#setsigmabellshape)(float) | Создает спад градиента на основе колоколообразной кривой. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/lineargradientbrush/setsigmabellshape#setsigmabellshape_1)(float, float) | Создает спад градиента на основе колоколообразной кривой. |
| [TranslateTransform](../../system.drawing.drawing2d/lineargradientbrush/translatetransform#translatetransform)(float, float) | Преобразует локальное геометрическое преобразование по указанным размерам. Этот метод добавляет преобразование перед преобразованием. |
| [TranslateTransform](../../system.drawing.drawing2d/lineargradientbrush/translatetransform#translatetransform_1)(float, float, MatrixOrder) | Преобразует локальное геометрическое преобразование по указанным размерам в указанном порядке. |

### Смотрите также

* class [Brush](../../system.drawing/brush)
* пространство имен [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* сборка [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
