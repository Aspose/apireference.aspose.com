---
title: Enum ExplicitDestinationType
second_title: Aspose.PDF for .NET API Reference
description: Enum ExplicitDestinationType Aspose.Pdf.Annotations. Перечисляет типы явных назначений
type: docs
weight: 1690
url: /ru/net/aspose.pdf.annotations/explicitdestinationtype/
---
## Перечисление ExplicitDestinationType

Перечисляет типы явных назначений.

```csharp
public enum ExplicitDestinationType
```

### Значения

| Название | Значение | Описание |
| --- | --- | --- |
| XYZ | `0` | Отобразить страницу с координатами (левый, верхний), расположенными в верхнем левом углу окна, и содержимое страницы увеличенным в соответствии с коэффициентом масштабирования. Нулевое значение для любого из параметров левый, верхний или масштабирование указывает на то, что текущее значение этого параметра должно быть сохранено без изменений. Значение масштабирования 0 имеет то же значение, что и нулевое значение. |
| Fit | `1` | Отобразить страницу с содержимым, увеличенным ровно настолько, чтобы вся страница поместилась в окне как по горизонтали, так и по вертикали. Если требуемые коэффициенты увеличения по горизонтали и вертикали различаются, используйте меньший из двух, центрируя страницу в окне в другом измерении. |
| FitH | `2` | Отобразить страницу с вертикальной координатой верх, расположенной на верхнем крае окна, и содержимое страницы увеличенным ровно настолько, чтобы вся ширина страницы поместилась в окне. Нулевое значение для верх указывает на то, что текущее значение этого параметра должно быть сохранено без изменений. |
| FitV | `3` | Отобразить страницу с горизонтальной координатой лев, расположенной на левом крае окна, и содержимое страницы увеличенным ровно настолько, чтобы вся высота страницы поместилась в окне. Нулевое значение для лев указывает на то, что текущее значение этого параметра должно быть сохранено без изменений. |
| FitR | `4` | Отобразить страницу с содержимым, увеличенным ровно настолько, чтобы поместить прямоугольник, заданный координатами лев, низ, правый и верх, полностью в окне как по горизонтали, так и по вертикали. Если требуемые коэффициенты увеличения по горизонтали и вертикали различаются, используйте меньший из двух, центрируя прямоугольник в окне в другом измерении. Нулевое значение для любого из параметров может привести к непредсказуемому поведению. |
| FitB | `5` | Отобразить страницу с содержимым, увеличенным ровно настолько, чтобы полностью поместить его ограничивающий прямоугольник в окне как по горизонтали, так и по вертикали. Если требуемые коэффициенты увеличения по горизонтали и вертикали различаются, используйте меньший из двух, центрируя ограничивающий прямоугольник в окне в другом измерении. |
| FitBH | `6` | Отобразить страницу с вертикальной координатой верх, расположенной на верхнем крае окна, и содержимое страницы увеличенным ровно настолько, чтобы вся ширина его ограничивающего прямоугольника поместилась в окне. Нулевое значение для верх указывает на то, что текущее значение этого параметра должно быть сохранено без изменений. |
| FitBV | `7` | Отобразить страницу с горизонтальной координатой лев, расположенной на левом крае окна, и содержимое страницы увеличенным ровно настолько, чтобы вся высота его ограничивающего прямоугольника поместилась в окне. Нулевое значение для лев указывает на то, что текущее значение этого параметра должно быть сохранено без изменений. |

### См. также

* пространство имен [Aspose.Pdf.Annotations](../../aspose.pdf.annotations/)
* сборка [Aspose.PDF](../../)