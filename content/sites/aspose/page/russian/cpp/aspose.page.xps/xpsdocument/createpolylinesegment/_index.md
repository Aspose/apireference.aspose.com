---
title: "Aspose::Page::XPS::XpsDocument::CreatePolyLineSegment метод"
linktitle: "CreatePolyLineSegment"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsDocument::CreatePolyLineSegment метод. Создаёт новый полигональный рисунок, содержащий произвольное количество отдельных вершин, в C++."
type: docs
weight: 2500
url: /ru/cpp/aspose.page.xps/xpsdocument/createpolylinesegment/
---
## XpsDocument::CreatePolyLineSegment method


Создает новый многоугольный рисунок, содержащий произвольное количество отдельных вершин.

```cpp
System::SharedPtr<XpsModel::XpsPolyLineSegment> Aspose::Page::XPS::XpsDocument::CreatePolyLineSegment(System::ArrayPtr<System::Drawing::PointF> points, bool isStroked=true)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| points | System::ArrayPtr\<System::Drawing::PointF\> | Набор координат для нескольких сегментов, определяющих полилинейный сегмент. |
| isStroked | bool | Указывает, будет ли нарисован штрих для этого сегмента пути. |

### ReturnValue

Новый полигональный сегмент чертежа.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPolyLineSegment](../../../aspose.page.xps.xpsmodel/xpspolylinesegment/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
