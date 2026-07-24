---
title: "Aspose::Page::XPS::XpsDocument::CreatePolyQuadraticBezierSegment метод"
linktitle: "CreatePolyQuadraticBezierSegment"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsDocument::CreatePolyQuadraticBezierSegment метод. Создаёт новый набор квадратичных кривых Безье от предыдущей точки в фигуре пути через набор вершин, используя указанные контрольные точки в C++."
type: docs
weight: 2600
url: /ru/cpp/aspose.page.xps/xpsdocument/createpolyquadraticbeziersegment/
---
## XpsDocument::CreatePolyQuadraticBezierSegment method


Создает новый набор квадратичных кривых Безье от предыдущей точки в фигуре пути через набор вершин, используя указанные контрольные точки.

```cpp
System::SharedPtr<XpsModel::XpsPolyQuadraticBezierSegment> Aspose::Page::XPS::XpsDocument::CreatePolyQuadraticBezierSegment(System::ArrayPtr<System::Drawing::PointF> points, bool isStroked=true)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| points | System::ArrayPtr\<System::Drawing::PointF\> | Контрольные точки для нескольких квадратичных сегментов Безье. |
| isStroked | bool | Указывает, будет ли нарисован штрих для этого сегмента пути. |

### ReturnValue

Новый сегмент квадратичной кривой Безье.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPolyQuadraticBezierSegment](../../../aspose.page.xps.xpsmodel/xpspolyquadraticbeziersegment/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
