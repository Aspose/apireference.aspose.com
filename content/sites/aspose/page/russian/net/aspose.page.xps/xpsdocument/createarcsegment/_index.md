---
title: XpsDocument.CreateArcSegment
second_title: Справочник по Aspose.Page для .NET API
description: XpsDocument метод. Создает новый сегмент эллиптической дуги.
type: docs
weight: 160
url: /ru/net/aspose.page.xps/xpsdocument/createarcsegment/
---
## XpsDocument.CreateArcSegment method

Создает новый сегмент эллиптической дуги.

```csharp
public XpsArcSegment CreateArcSegment(PointF point, SizeF size, float rotationAngle, 
    bool isLargeArc, XpsSweepDirection sweepDirection, bool isStroked = true)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| point | PointF | Конечная точка эллиптической дуги. |
| size | SizeF | Радиусы x и y эллиптической дуги в виде пары x,y. |
| rotationAngle | Single | Указывает, как эллипс поворачивается относительно текущей системы координат. |
| isLargeArc | Boolean | Определяет, рисуется ли дуга с разверткой 180 или больше. |
| sweepDirection | XpsSweepDirection | Направление, в котором рисуется дуга. |
| isStroked | Boolean | Указывает, рисуется ли штрих для этого сегмента пути. |

### Возвращаемое значение

Новый сегмент эллиптической дуги.

### Смотрите также

* class [XpsArcSegment](../../../aspose.page.xps.xpsmodel/xpsarcsegment/)
* enum [XpsSweepDirection](../../../aspose.page.xps.xpsmodel/xpssweepdirection/)
* class [XpsDocument](../)
* пространство имен [Aspose.Page.XPS](../../xpsdocument/)
* сборка [Aspose.Page](../../../)


