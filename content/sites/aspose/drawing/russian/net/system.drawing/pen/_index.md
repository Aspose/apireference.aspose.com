---
title: Pen
second_title: Справочник по API Aspose.Drawing для .NET
description: Определяет объект используемый для рисования линий и кривых.
type: docs
weight: 910
url: /ru/net/system.drawing/pen/
---
## Pen class

Определяет объект, используемый для рисования линий и кривых.

```csharp
public class Pen : IDisposable
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [Pen](pen#constructor)(Brush) | Инициализирует новый экземпляр[`Pen`](../pen) класс с указаннымBrush . |
| [Pen](pen#constructor_2)(Color) | Инициализирует новый экземпляр[`Pen`](../pen) класс с указаннымColor . |
| [Pen](pen#constructor_1)(Brush, float) | Инициализирует новый экземпляр класса Pen с указанными кистью и шириной. |
| [Pen](pen#constructor_3)(Color, float) | Инициализирует новый экземпляр класса Pen с указанными свойствами Color и Width. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [Alignment](../../system.drawing/pen/alignment) { get; set; } | Получает или задает выравнивание для этогоPen . |
| [Brush](../../system.drawing/pen/brush) { get; set; } | Получает или задает кисть, которая определяет атрибуты этогоPen . |
| [Color](../../system.drawing/pen/color) { get; set; } | Получает или устанавливает цвет этогоPen . |
| [CompoundArray](../../system.drawing/pen/compoundarray) { get; set; } | Получает или задает массив значений, указывающий составное перо. Составное перо рисует составную линию, состоящую из параллельных линий и пробелов. |
| [CustomEndCap](../../system.drawing/pen/customendcap) { get; set; } | Получает или задает пользовательскую заглушку для использования в конце строк, нарисованных с помощью этогоPen . |
| [CustomStartCap](../../system.drawing/pen/customstartcap) { get; set; } | Получает или задает пользовательскую заглушку для использования в начале строк, нарисованных с помощью этогоPen . |
| [DashCap](../../system.drawing/pen/dashcap) { get; set; } | Получает или задает стиль заглавных букв, используемый в конце дефисов, составляющих пунктирные линии, нарисованные с помощью this Pen . |
| [DashOffset](../../system.drawing/pen/dashoffset) { get; set; } | Получает или задает расстояние от начала линии до начала штрихового узора. |
| [DashPattern](../../system.drawing/pen/dashpattern) { get; set; } | Получает или задает массив пользовательских дефисов и пробелов. |
| [DashStyle](../../system.drawing/pen/dashstyle) { get; set; } | Получает или задает стиль, используемый для пунктирных линий, нарисованных с помощью этогоPen . |
| [EndCap](../../system.drawing/pen/endcap) { get; set; } | Получает или задает стиль заглавных букв, используемый в конце линий, нарисованных этим Pen. |
| [LineJoin](../../system.drawing/pen/linejoin) { get; set; } | Получает или задает стиль соединения концов двух последовательных линий, нарисованных этим Pen. |
| [MiterLimit](../../system.drawing/pen/miterlimit) { get; set; } | Получает или задает предел толщины соединения на скошенном углу. |
| [PenType](../../system.drawing/pen/pentype) { get; } | Получает стиль линий, нарисованных этим Pen. |
| [StartCap](../../system.drawing/pen/startcap) { get; set; } | Получает или задает стиль заглавных букв, используемый в начале линий, нарисованных этим Pen. |
| [Transform](../../system.drawing/pen/transform) { get; set; } | Получает или задает копию геометрического преобразования для этогоPen . |
| [Width](../../system.drawing/pen/width) { get; set; } | Получает или задает ширину этого пера в единицах объекта Graphics, используемого для рисования. |

## Методы

| Имя | Описание |
| --- | --- |
| [Clone](../../system.drawing/pen/clone)() | Создает точную копию этогоPen . |
| [Dispose](../../system.drawing/pen/dispose)() | Освобождает все ресурсы, используемые этим Pen. |
| [MultiplyTransform](../../system.drawing/pen/multiplytransform#multiplytransform)(Matrix) | Умножает матрицу преобразования для этогоPen указаннымMatrix . |
| [MultiplyTransform](../../system.drawing/pen/multiplytransform#multiplytransform_1)(Matrix, MatrixOrder) | Умножает матрицу преобразования для этогоPen указаннымMatrix в указанном порядке. |
| [ResetTransform](../../system.drawing/pen/resettransform)() | Сбрасывает матрицу геометрического преобразования для этогоPen к личности. |
| [RotateTransform](../../system.drawing/pen/rotatetransform#rotatetransform)(float) | Поворачивает локальное геометрическое преобразование на указанный угол. Этот метод добавляет поворот к преобразованию. |
| [RotateTransform](../../system.drawing/pen/rotatetransform#rotatetransform_1)(float, MatrixOrder) | Поворачивает локальное геометрическое преобразование на указанный угол в указанном порядке. |
| [ScaleTransform](../../system.drawing/pen/scaletransform#scaletransform)(float, float) | Масштабирует локальное геометрическое преобразование по указанным коэффициентам. Этот метод добавляет матрицу масштабирования к преобразованию. |
| [ScaleTransform](../../system.drawing/pen/scaletransform#scaletransform_1)(float, float, MatrixOrder) | Масштабирует локальное геометрическое преобразование по указанным коэффициентам в указанном порядке. |
| [SetLineCap](../../system.drawing/pen/setlinecap)(LineCap, LineCap, DashCap) | Устанавливает значения, определяющие стиль заглавных букв, используемых для окончания линий, нарисованных этим[`Pen`](../pen) . |
| [TranslateTransform](../../system.drawing/pen/translatetransform#translatetransform)(float, float) | Преобразует локальное геометрическое преобразование по указанным размерам. Этот метод добавляет перевод к преобразованию. |
| [TranslateTransform](../../system.drawing/pen/translatetransform#translatetransform_1)(float, float, MatrixOrder) | Преобразует локальное геометрическое преобразование по указанным размерам в указанном порядке. |

### Смотрите также

* пространство имен [System.Drawing](../../system.drawing)
* сборка [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
