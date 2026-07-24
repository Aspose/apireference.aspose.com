---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePolyLineSegment method"
linktitle: "CreatePolyLineSegment"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePolyLineSegment method. Создает новое полигональное изображение, содержащее произвольное количество отдельных вершин, в C++."
type: docs
weight: 1800
url: /ru/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createpolylinesegment/
---
## PageAPI::CreatePolyLineSegment method


Создает новый многоугольный рисунок, содержащий произвольное количество отдельных вершин.

```cpp
System::SharedPtr<XpsModel::XpsPolyLineSegment> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePolyLineSegment(System::ArrayPtr<System::Drawing::PointF> points, bool isStroked=true)
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
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
