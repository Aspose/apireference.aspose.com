---
title: "System::Drawing::Drawing2D::CustomLineCap::CustomLineCap конструктор"
linktitle: "CustomLineCap"
second_title: "Aspose.Page для C++"
description: "System::Drawing::Drawing2D::CustomLineCap::CustomLineCap конструктор. Создаёт новый экземпляр класса CustomLineCap, представляющего пользовательскую конечную линию с указанными свойствами в C++."
type: docs
weight: 100
url: /ru/cpp/system.drawing.drawing2d/customlinecap/customlinecap/
---
## CustomLineCap::CustomLineCap constructor


Создаёт новый экземпляр класса [CustomLineCap](../), представляющего пользовательскую конечную линию с указанными свойствами.

```cpp
System::Drawing::Drawing2D::CustomLineCap::CustomLineCap(const SharedPtr<GraphicsPath> &fillPath, const SharedPtr<GraphicsPath> &strokePath, LineCap baseCap=LineCap::Flat, float baseInset=0)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| fillPath | const SharedPtr\<GraphicsPath\>\& | Указывает заливку для пользовательской конечной линии |
| strokePath | const SharedPtr\<GraphicsPath\>\& | Указывает контур пользовательской конечной линии |
| baseCap | LineCap | Базовая конечная линия, из которой создаётся пользовательская конечная линия |
| baseInset | float | Указывает расстояние между линией и конечной линией |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GraphicsPath](../../graphicspath/)
* Enum [LineCap](../../linecap/)
* Class [CustomLineCap](../)
* Namespace [System::Drawing::Drawing2D](../../)
* Library [Aspose.Page for C++](../../../)
