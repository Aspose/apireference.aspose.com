---
title: RectangleF
second_title: Справочник по API Aspose.Drawing для .NET
description: Хранит набор из четырех чисел с плавающей запятой которые представляют положение и размер прямоугольника. Для более сложных функций региона используйте объект Region.
type: docs
weight: 1050
url: /ru/net/system.drawing/rectanglef/
---
## RectangleF structure

Хранит набор из четырех чисел с плавающей запятой, которые представляют положение и размер прямоугольника. Для более сложных функций региона используйте объект Region.

```csharp
public struct RectangleF : IEquatable<RectangleF>
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [RectangleF](rectanglef#constructor_1)(PointF, SizeF) | Инициализирует новый экземпляр структуры RectangleF с указанным расположением и размером. |
| [RectangleF](rectanglef#constructor)(float, float, float, float) | Инициализирует новый экземпляр структуры RectangleF с указанным расположением и размером. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [Bottom](../../system.drawing/rectanglef/bottom) { get; } | Получает координату y, которая является суммой Y и высоты этой структуры RectangleF. |
| [Height](../../system.drawing/rectanglef/height) { get; set; } | Получает или задает высоту этой структуры RectangleF. |
| [IsEmpty](../../system.drawing/rectanglef/isempty) { get; } | Получает значение, указывающее,Width или жеHeight property этогоRectangleFимеет нулевое значение. |
| [Left](../../system.drawing/rectanglef/left) { get; } | Получает x-координату левого края этой структуры RectangleF. |
| [Location](../../system.drawing/rectanglef/location) { get; set; } | Получает или задает координаты левого верхнего угла этогоRectangleF структура. |
| [Right](../../system.drawing/rectanglef/right) { get; } | Получает координату x, которая является суммой X и ширины этой структуры RectangleF. |
| [Size](../../system.drawing/rectanglef/size) { get; set; } | Получает или задает размер этогоRectangleF . |
| [Top](../../system.drawing/rectanglef/top) { get; } | Получает координату y верхнего края этой структуры RectangleF. |
| [Width](../../system.drawing/rectanglef/width) { get; set; } | Получает или задает ширину этой структуры RectangleF. |
| [X](../../system.drawing/rectanglef/x) { get; set; } | Получает или задает координату x левого верхнего угла этой структуры RectangleF. |
| [Y](../../system.drawing/rectanglef/y) { get; set; } | Получает или задает координату x левого верхнего угла этой структуры RectangleF. |

## Методы

| Имя | Описание |
| --- | --- |
| static [FromLTRB](../../system.drawing/rectanglef/fromltrb)(float, float, float, float) | Создает структуру RectangleF с левым верхним и правым нижним углами в указанных местах. |
| static [Inflate](../../system.drawing/rectanglef/inflate)(RectangleF, float, float) | Создает и возвращает увеличенную копию указанногоRectangleF структура. Копия увеличена на указанную сумму. Исходный прямоугольник остается без изменений. |
| static [Intersect](../../system.drawing/rectanglef/intersect)(RectangleF, RectangleF) | ВозвращаетRectangleF структура, представляющая пересечение двух прямоугольников. Если нет пересечения и пустоRectangleF возвращается. |
| static [Union](../../system.drawing/rectanglef/union)(RectangleF, RectangleF) | Создает наименьший возможный третий прямоугольник, который может содержать оба прямоугольника, образующие объединение. |
| [Contains](../../system.drawing/rectanglef/contains#contains_1)(PointF) | Определяет, содержится ли указанная точка в этомRectangleF структура. |
| [Contains](../../system.drawing/rectanglef/contains#contains_2)(RectangleF) | Определяет, является ли прямоугольная область, представленная*rect* полностью содержится в этомRectangleF структура. |
| [Contains](../../system.drawing/rectanglef/contains#contains)(float, float) | Определяет, содержится ли указанная точка в этомRectangleF структура. |
| override [Equals](../../system.drawing/rectanglef/equals#equals_1)(object) | Определяет, является ли указанныйObject , равно этому экземпляру. |
| [Equals](../../system.drawing/rectanglef/equals#equals)(RectangleF) | Проверяет,[`RectangleF`](../rectanglef) структура имеет то же расположение и размер, что и эта[`RectangleF`](../rectanglef) структура. |
| override [GetHashCode](../../system.drawing/rectanglef/gethashcode)() | Возвращает хэш-код для этого экземпляра. |
| [Inflate](../../system.drawing/rectanglef/inflate#inflate_1)(SizeF) | раздувает этоRectangleF на указанную сумму. |
| [Inflate](../../system.drawing/rectanglef/inflate#inflate)(float, float) | раздувает этоRectangleF структуру на указанную сумму. |
| [Intersect](../../system.drawing/rectanglef/intersect)(RectangleF) | Заменяет этоRectangleF структура с пересечением себя и указанного RectangleF структура. |
| [IntersectsWith](../../system.drawing/rectanglef/intersectswith)(RectangleF) | Определяет, пересекается ли этот прямоугольник с*rect* . |
| [Offset](../../system.drawing/rectanglef/offset#offset_1)(PointF) | Изменяет положение этого прямоугольника на указанную величину. |
| [Offset](../../system.drawing/rectanglef/offset#offset)(float, float) | Изменяет положение этого прямоугольника на указанную величину. |
| override [ToString](../../system.drawing/rectanglef/tostring)() | Преобразует атрибуты этого[`Rectangle`](../rectangle) в удобочитаемую строку. |
| [operator ==](../../system.drawing/rectanglef/op_equality) | Проверяет, являются ли дваRectangleF структуры имеют одинаковое расположение и размер. |
| [implicit operator](../../system.drawing/rectanglef/op_implicit) | Преобразует указанную структуру Rectangle в структуру RectangleF. |
| [operator !=](../../system.drawing/rectanglef/op_inequality) | Проверяет, являются ли дваRectangleF структуры отличаются расположением или размером. |

## Поля

| Имя | Описание |
| --- | --- |
| static readonly [Empty](../../system.drawing/rectanglef/empty) | Представляет экземплярRectangleF класс с неинициализированными членами. |

### Смотрите также

* пространство имен [System.Drawing](../../system.drawing)
* сборка [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
