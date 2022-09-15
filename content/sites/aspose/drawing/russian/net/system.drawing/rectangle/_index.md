---
title: Rectangle
second_title: Справочник по API Aspose.Drawing для .NET
description: Хранит набор из четырех целых чисел представляющих расположение и размер прямоугольника.
type: docs
weight: 1040
url: /ru/net/system.drawing/rectangle/
---
## Rectangle structure

Хранит набор из четырех целых чисел, представляющих расположение и размер прямоугольника.

```csharp
public struct Rectangle : IEquatable<Rectangle>
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [Rectangle](rectangle#constructor_1)(Point, Size) | Инициализирует новый экземпляр[`Rectangle`](../rectangle) структура с указанным расположением и размером. |
| [Rectangle](rectangle#constructor)(int, int, int, int) | Инициализирует новый экземпляр структуры Rectangle с указанным расположением и размером. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [Bottom](../../system.drawing/rectangle/bottom) { get; } | Получает координату y, которая является суммой значений свойств Y и Height этой структуры Rectangle. |
| [Height](../../system.drawing/rectangle/height) { get; set; } | Получает или задает высоту этой структуры Rectangle. |
| [IsEmpty](../../system.drawing/rectangle/isempty) { get; } | Получает значение, указывающее, все ли числовые свойства этого[`Rectangle`](../rectangle) имеют нулевые значения. |
| [Left](../../system.drawing/rectangle/left) { get; } | Получает x-координату левого края этой структуры Rectangle. |
| [Location](../../system.drawing/rectangle/location) { get; set; } | Получает или задает координаты левого верхнего угла этогоRectangle структура. |
| [Right](../../system.drawing/rectangle/right) { get; } | Получает координату x, которая является суммой значений свойств X и Width этой структуры Rectangle. |
| [Size](../../system.drawing/rectangle/size) { get; set; } | Получает или задает размер этогоRectangle . |
| [Top](../../system.drawing/rectangle/top) { get; } | Получает координату y верхнего края этой структуры Rectangle. |
| [Width](../../system.drawing/rectangle/width) { get; set; } | Получает или задает ширину этой структуры Rectangle. |
| [X](../../system.drawing/rectangle/x) { get; set; } | Получает или задает координату x левого верхнего угла этой структуры Rectangle. |
| [Y](../../system.drawing/rectangle/y) { get; set; } | Получает или задает координату y верхнего левого угла этой структуры Rectangle. |

## Методы

| Имя | Описание |
| --- | --- |
| static [Ceiling](../../system.drawing/rectangle/ceiling)(RectangleF) | Преобразует указанныйRectangleF структура кRectangle структура путем округленияRectangleF значения до следующего более высокого целочисленного значения. |
| static [FromLTRB](../../system.drawing/rectangle/fromltrb)(int, int, int, int) | СоздаетRectangle структура с указанными местоположениями ребер. |
| static [Inflate](../../system.drawing/rectangle/inflate)(Rectangle, int, int) | Создает[`Rectangle`](../rectangle) который завышен на указанную сумму. |
| static [Intersect](../../system.drawing/rectangle/intersect)(Rectangle, Rectangle) | Возвращает третийRectangle структура, которая представляет пересечение двух другихRectangle структуры. Если пересечения нет, то пустойRectangle возвращается. |
| static [Round](../../system.drawing/rectangle/round)(RectangleF) | Преобразует указанныйRectangleF кRectangle путем округления RectangleFзначения до ближайших целочисленных значений. |
| static [Truncate](../../system.drawing/rectangle/truncate)(RectangleF) | Преобразует указанныйRectangleF кRectangle путем усеченияRectangleF значения. |
| static [Union](../../system.drawing/rectangle/union)(Rectangle, Rectangle) | ПолучаетRectangle структура, содержащая объединение двухRectangle структуры. |
| [Contains](../../system.drawing/rectangle/contains#contains_1)(Point) | Определяет, содержится ли указанная точка в этомRectangle структура. |
| [Contains](../../system.drawing/rectangle/contains#contains_2)(Rectangle) | Определяет, является ли прямоугольная область, представленная*rect* полностью содержится в прямоугольной области, представленной этим[`Rectangle`](../rectangle) . |
| [Contains](../../system.drawing/rectangle/contains#contains)(int, int) | Определяет, содержится ли указанная точка в этомRectangle структура. |
| override [Equals](../../system.drawing/rectangle/equals#equals_1)(object) | Проверяет, является ли objRectangle структура с тем же расположением и размером этогоRectangle структура. |
| [Equals](../../system.drawing/rectangle/equals#equals)(Rectangle) | Проверяет,[`Rectangle`](../rectangle) структура имеет то же расположение и размер, что и эта[`Rectangle`](../rectangle) структура. |
| override [GetHashCode](../../system.drawing/rectangle/gethashcode)() | Возвращает хеш-код для этогоRectangle структура. Для получения информации об использовании хэш-кодов см. GetHashCode . |
| [Inflate](../../system.drawing/rectangle/inflate#inflate_1)(Size) | Увеличивает этоRectangle на указанную сумму. |
| [Inflate](../../system.drawing/rectangle/inflate#inflate)(int, int) | Увеличивает этоRectangle на указанную сумму. |
| [Intersect](../../system.drawing/rectangle/intersect)(Rectangle) | Заменяет этоRectangleс пересечением себя и указанногоRectangle . |
| [IntersectsWith](../../system.drawing/rectangle/intersectswith)(Rectangle) | Определяет, пересекается ли этот прямоугольник с*rect* . |
| [Offset](../../system.drawing/rectangle/offset#offset_1)(Point) | Изменяет положение этого прямоугольника на указанную величину. |
| [Offset](../../system.drawing/rectangle/offset#offset)(int, int) | Изменяет положение этого прямоугольника на указанную величину. |
| override [ToString](../../system.drawing/rectangle/tostring)() | Преобразует атрибуты этого[`Rectangle`](../rectangle) в удобочитаемую строку. |
| [operator ==](../../system.drawing/rectangle/op_equality) | Проверяет, являются ли дваRectangle структуры имеют одинаковое расположение и размер. |
| [operator !=](../../system.drawing/rectangle/op_inequality) | Проверяет, являются ли дваRectangle структуры отличаются расположением или размером. |

## Поля

| Имя | Описание |
| --- | --- |
| static readonly [Empty](../../system.drawing/rectangle/empty) | ПредставляетRectangle структура с неинициализированными свойствами. |

### Смотрите также

* пространство имен [System.Drawing](../../system.drawing)
* сборка [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
