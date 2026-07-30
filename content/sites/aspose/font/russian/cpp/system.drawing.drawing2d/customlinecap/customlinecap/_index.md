---
title: "System::Drawing::Drawing2D::CustomLineCap::CustomLineCap конструктор"
linktitle: "CustomLineCap"
second_title: "Aspose.Font для C++"
description: "System::Drawing::Drawing2D::CustomLineCap::CustomLineCap конструктор. Создаёт новый экземпляр класса CustomLineCap, который представляет пользовательскую заглушку линии с указанными свойствами в C++."
type: docs
weight: 100
url: /ru/cpp/system.drawing.drawing2d/customlinecap/customlinecap/
---
## CustomLineCap::CustomLineCap constructor


Создаёт новый экземпляр класса [CustomLineCap](../), который представляет пользовательскую заглушку линии с указанными свойствами.

```cpp
System::Drawing::Drawing2D::CustomLineCap::CustomLineCap(const SharedPtr<GraphicsPath> &fillPath, const SharedPtr<GraphicsPath> &strokePath, LineCap baseCap=LineCap::Flat, float baseInset=0)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| fillPath | const SharedPtr\<GraphicsPath\>\& | Указывает заливку для пользовательской заглушки |
| strokePath | const SharedPtr\<GraphicsPath\>\& | Указывает контур пользовательской заглушки |
| baseCap | LineCap | Базовая заглушка линии, из которой создаётся пользовательская заглушка |
| baseInset | float | Указывает расстояние между линией и заглушкой |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GraphicsPath](../../graphicspath/)
* Enum [LineCap](../../linecap/)
* Class [CustomLineCap](../)
* Namespace [System::Drawing::Drawing2D](../../)
* Library [Aspose.Font for C++](../../../)
