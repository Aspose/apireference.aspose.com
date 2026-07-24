---
title: "Метод Aspose::Page::XPS::XpsDocument::CreateArcSegment"
linktitle: "CreateArcSegment"
second_title: "Aspose.Page для C++"
description: "Метод Aspose::Page::XPS::XpsDocument::CreateArcSegment. Создаёт новый эллиптический дуговой сегмент в C++."
type: docs
weight: 1000
url: /ru/cpp/aspose.page.xps/xpsdocument/createarcsegment/
---
## XpsDocument::CreateArcSegment method


Создаёт новый сегмент эллиптической дуги.

```cpp
System::SharedPtr<XpsModel::XpsArcSegment> Aspose::Page::XPS::XpsDocument::CreateArcSegment(System::Drawing::PointF point, System::Drawing::SizeF size, float rotationAngle, bool isLargeArc, XpsModel::XpsSweepDirection sweepDirection, bool isStroked=true)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| точка | System::Drawing::PointF | Конечная точка эллиптической дуги. |
| size | System::Drawing::SizeF | Радиусы x и y эллиптической дуги в виде пары x,y. |
| rotationAngle | float | Указывает, как эллипс вращается относительно текущей системы координат. |
| isLargeArc | bool | Определяет, рисуется ли дуга с охватом 180 градусов или более. |
| sweepDirection | XpsModel::XpsSweepDirection | Направление, в котором рисуется дуга. |
| isStroked | bool | Указывает, будет ли нарисован штрих для этого сегмента пути. |

### ReturnValue

Новый эллиптический дуговой сегмент.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsArcSegment](../../../aspose.page.xps.xpsmodel/xpsarcsegment/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [XpsSweepDirection](../../../aspose.page.xps.xpsmodel/xpssweepdirection/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
