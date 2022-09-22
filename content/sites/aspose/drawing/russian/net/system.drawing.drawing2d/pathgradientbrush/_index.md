---
title: PathGradientBrush
second_title: Справочник по API Aspose.Drawing для .NET
description: ИнкапсулируетBrush объект который заполняет интерьерGraphicsPath объект с градиентом. Этот класс не может быть унаследован.
type: docs
weight: 400
url: /ru/net/system.drawing.drawing2d/pathgradientbrush/
---
## PathGradientBrush class

ИнкапсулируетBrush объект, который заполняет интерьерGraphicsPath объект с градиентом. Этот класс не может быть унаследован.

```csharp
public sealed class PathGradientBrush : Brush
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [PathGradientBrush](pathgradientbrush#constructor)(GraphicsPath) | Инициализирует новый экземпляр[`PathGradientBrush`](../pathgradientbrush) класс с указанным путем. |
| [PathGradientBrush](pathgradientbrush#constructor_1)(PointF[]) | Инициализирует новый экземпляр[`PathGradientBrush`](../pathgradientbrush) класс с указанными баллами. |
| [PathGradientBrush](pathgradientbrush#constructor_3)(Point[]) | Инициализирует новый экземпляр[`PathGradientBrush`](../pathgradientbrush) класс с указанными баллами. |
| [PathGradientBrush](pathgradientbrush#constructor_2)(PointF[], WrapMode) | Инициализирует новый экземпляр[`PathGradientBrush`](../pathgradientbrush) class с указанными точками и режимом переноса. |
| [PathGradientBrush](pathgradientbrush#constructor_4)(Point[], WrapMode) | Инициализирует новый экземпляр[`PathGradientBrush`](../pathgradientbrush) class с указанными точками и режимом переноса. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [Blend](../../system.drawing.drawing2d/pathgradientbrush/blend) { get; set; } | Получает или задаетBlend который указывает позиции и факторы, которые определяют пользовательский спад для градиента. |
| [CenterColor](../../system.drawing.drawing2d/pathgradientbrush/centercolor) { get; set; } | Получает или задает цвет в центре градиента контура. |
| [CenterPoint](../../system.drawing.drawing2d/pathgradientbrush/centerpoint) { get; set; } | Получает или задает центральную точку градиента пути. |
| [FocusScales](../../system.drawing.drawing2d/pathgradientbrush/focusscales) { get; set; } | Получает или задает точку фокусировки для спада градиента. |
| [InterpolationColors](../../system.drawing.drawing2d/pathgradientbrush/interpolationcolors) { get; set; } | Получает или задаетColorBlendкоторый определяет многоцветный линейный градиент. |
| [Rectangle](../../system.drawing.drawing2d/pathgradientbrush/rectangle) { get; } | Получает ограничивающий прямоугольник для этогоPathGradientBrush . |
| [SurroundColors](../../system.drawing.drawing2d/pathgradientbrush/surroundcolors) { get; set; } | Получает или задает массив цветов, соответствующих точкам пути thisPathGradientBrush заполняет. |
| [Transform](../../system.drawing.drawing2d/pathgradientbrush/transform) { get; set; } | Получает или задает копиюMatrix который определяет локальное геометрическое преобразование для этогоPathGradientBrush . |
| [WrapMode](../../system.drawing.drawing2d/pathgradientbrush/wrapmode) { get; set; } | Получает или задаетWrapMode который указывает режим переноса для этогоPathGradientBrush . |

## Методы

| Имя | Описание |
| --- | --- |
| override [Clone](../../system.drawing.drawing2d/pathgradientbrush/clone)() | Создает точную копию этогоPathGradientBrush . |
| [Dispose](../../system.drawing/brush/dispose)() | Освобождает все ресурсы, используемые этим объектом Brush. |
| [MultiplyTransform](../../system.drawing.drawing2d/pathgradientbrush/multiplytransform#multiplytransform)(Matrix) | Обновляет матрицу преобразования кисти произведением матрицы преобразования кисти на другую матрицу. |
| [MultiplyTransform](../../system.drawing.drawing2d/pathgradientbrush/multiplytransform#multiplytransform_1)(Matrix, MatrixOrder) | Обновляет матрицу преобразования кисти произведением матрицы преобразования кисти на другую матрицу. |
| [ResetTransform](../../system.drawing.drawing2d/pathgradientbrush/resettransform)() | СбрасываетTransform свойство к личности. |
| [RotateTransform](../../system.drawing.drawing2d/pathgradientbrush/rotatetransform#rotatetransform)(float) | Поворачивает локальное геометрическое преобразование на указанную величину. Этот метод добавляет поворот к преобразованию. |
| [RotateTransform](../../system.drawing.drawing2d/pathgradientbrush/rotatetransform#rotatetransform_1)(float, MatrixOrder) | Поворачивает локальное геометрическое преобразование на указанную величину в указанном порядке. |
| [ScaleTransform](../../system.drawing.drawing2d/pathgradientbrush/scaletransform#scaletransform)(float, float) | Масштабирует локальное геометрическое преобразование на указанные величины. Этот метод добавляет матрицу масштабирования перед преобразованием. |
| [ScaleTransform](../../system.drawing.drawing2d/pathgradientbrush/scaletransform#scaletransform_1)(float, float, MatrixOrder) | Масштабирует локальное геометрическое преобразование на указанные величины в указанном порядке. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/pathgradientbrush/setblendtriangularshape#setblendtriangularshape)(float) | Создает градиент с центральным цветом и линейным переходом к одному окружающему цвету. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/pathgradientbrush/setblendtriangularshape#setblendtriangularshape_1)(float, float) | Создает градиент с центральным цветом и линейным спадом для каждого окружающего цвета. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/pathgradientbrush/setsigmabellshape#setsigmabellshape)(float) | Создает градиентную кисть, которая меняет цвет, начиная с центра пути наружу и заканчивая его границей. Переход от одного цвета к другому основан на кривой в форме колокола. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/pathgradientbrush/setsigmabellshape#setsigmabellshape_1)(float, float) | Создает градиентную кисть, которая меняет цвет, начиная с центра пути наружу и заканчивая его границей. Переход от одного цвета к другому основан на кривой в форме колокола. |
| [TranslateTransform](../../system.drawing.drawing2d/pathgradientbrush/translatetransform#translatetransform)(float, float) | Применяет указанный перевод к локальному геометрическому преобразованию. Этот метод добавляет преобразование перед преобразованием. |
| [TranslateTransform](../../system.drawing.drawing2d/pathgradientbrush/translatetransform#translatetransform_1)(float, float, MatrixOrder) | Применяет указанное преобразование к локальному геометрическому преобразованию в указанном порядке. |

### Смотрите также

* class [Brush](../../system.drawing/brush)
* пространство имен [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* сборка [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
