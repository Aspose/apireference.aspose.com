---
title: Matrix
second_title: Справочник по API Aspose.Drawing для .NET
description: Инкапсулирует аффинную матрицу 3 на 3 представляющую геометрическое преобразование. Этот класс не может быть унаследован.
type: docs
weight: 360
url: /ru/net/system.drawing.drawing2d/matrix/
---
## Matrix class

Инкапсулирует аффинную матрицу 3 на 3, представляющую геометрическое преобразование. Этот класс не может быть унаследован.

```csharp
public sealed class Matrix : IDisposable
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [Matrix](matrix#constructor)() | Инициализирует новый экземпляр класса Matrix как единичную матрицу. |
| [Matrix](matrix#constructor_2)(Rectangle, Point[]) | Инициализирует новый экземпляр[`Matrix`](../matrix) class к геометрическому преобразованию, определенному указанным прямоугольником и массивом точек. |
| [Matrix](matrix#constructor_3)(RectangleF, PointF[]) | Инициализирует новый экземпляр[`Matrix`](../matrix) class к геометрическому преобразованию, определенному указанным прямоугольником и массивом точек. |
| [Matrix](matrix#constructor_1)(float, float, float, float, float, float) | Инициализирует новый экземпляр класса Matrix с указанными элементами. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [Elements](../../system.drawing.drawing2d/matrix/elements) { get; } | Получает массив значений с плавающей запятой, который представляет элементы этой матрицы. |
| [IsIdentity](../../system.drawing.drawing2d/matrix/isidentity) { get; } | Получает значение, указывающее, является ли эта матрица единичной матрицей. |
| [IsInvertible](../../system.drawing.drawing2d/matrix/isinvertible) { get; } | Получает значение, указывающее, является ли эта матрица обратимой. |
| [OffsetX](../../system.drawing.drawing2d/matrix/offsetx) { get; } | Получает значение перевода x (значение dx или элемент в третьей строке и первом столбце) этой матрицы. |
| [OffsetY](../../system.drawing.drawing2d/matrix/offsety) { get; } | Получает значение перевода по оси y (т.`ды` значение или элемент в третьей строке и втором столбце) этой матрицы. |

## Методы

| Имя | Описание |
| --- | --- |
| [Clone](../../system.drawing.drawing2d/matrix/clone)() | Создает точную копию этой Матрицы. |
| [Dispose](../../system.drawing.drawing2d/matrix/dispose)() | Освобождает все ресурсы, используемые этой матрицей. |
| [Invert](../../system.drawing.drawing2d/matrix/invert)() | Инвертирует эту матрицу, если она обратима. |
| [Multiply](../../system.drawing.drawing2d/matrix/multiply#multiply)(Matrix) | Умножает этоMatrix по матрице, указанной в*matrix* параметр, , добавив указанныйMatrix . |
| [Multiply](../../system.drawing.drawing2d/matrix/multiply#multiply_1)(Matrix, MatrixOrder) | Умножает этоMatrix по матрице, указанной в*matrix* параметр, и в порядке, указанном в*order* параметр. |
| [Reset](../../system.drawing.drawing2d/matrix/reset)() | Сбрасывает этоMatrixиметь элементы единичной матрицы. |
| [Rotate](../../system.drawing.drawing2d/matrix/rotate#rotate)(float) | Добавить к этомуMatrix вращение по часовой стрелке, вокруг начала координат и на указанный угол. |
| [Rotate](../../system.drawing.drawing2d/matrix/rotate#rotate_1)(float, MatrixOrder) | Применяет вращение по часовой стрелке на величину, указанную в параметре угла, вокруг начала координат (нулевые координаты x и y) для этогоMatrix . |
| [RotateAt](../../system.drawing.drawing2d/matrix/rotateat#rotateat)(float, PointF) | Применяет вращение по часовой стрелке к этой матрице вокруг точки, указанной в параметре точки, и путем добавления вращения. |
| [RotateAt](../../system.drawing.drawing2d/matrix/rotateat#rotateat_1)(float, PointF, MatrixOrder) | Применяет вращение по часовой стрелке вокруг указанной точки к этой матрице в указанном порядке. |
| [Scale](../../system.drawing.drawing2d/matrix/scale#scale)(float, float) | Применяет указанный вектор масштаба к этой матрице, добавляя вектор масштаба перед ним. |
| [Scale](../../system.drawing.drawing2d/matrix/scale#scale_1)(float, float, MatrixOrder) | Применяет указанный вектор масштаба (scaleX и scaleY) к этой матрице, используя указанный порядок. |
| [Shear](../../system.drawing.drawing2d/matrix/shear#shear)(float, float) | Применяет указанный вектор сдвига к этой матрице, добавляя перед ним преобразование сдвига. |
| [Shear](../../system.drawing.drawing2d/matrix/shear#shear_1)(float, float, MatrixOrder) | Применяет указанный вектор сдвига к этой матрице в указанном порядке. |
| [TransformPoints](../../system.drawing.drawing2d/matrix/transformpoints#transformpoints)(PointF[]) | Применяет геометрическое преобразование, представленное этимMatrix в указанный массив точек. |
| [TransformPoints](../../system.drawing.drawing2d/matrix/transformpoints#transformpoints_1)(Point[]) | Применяет геометрическое преобразование, представленное этимMatrix в указанный массив точек. |
| [TransformVectors](../../system.drawing.drawing2d/matrix/transformvectors)(PointF[]) | Умножает каждый вектор в массиве на матрицу. Элементы перевода этой матрицы (третья строка) игнорируются. |
| [Translate](../../system.drawing.drawing2d/matrix/translate#translate)(float, float) | Применяет указанный вектор смещения (смещениеX и смещениеY) к этой матрице, добавляя вектор смещения перед ним. |
| [Translate](../../system.drawing.drawing2d/matrix/translate#translate_1)(float, float, MatrixOrder) | Применяет указанный вектор смещения к этой матрице в указанном порядке. |

### Смотрите также

* пространство имен [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* сборка [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
