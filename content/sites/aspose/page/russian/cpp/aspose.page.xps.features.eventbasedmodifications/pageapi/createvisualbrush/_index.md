---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateVisualBrush method"
linktitle: "CreateVisualBrush"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateVisualBrush method. Создает новую визуальную кисть в C++."
type: docs
weight: 2200
url: /ru/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createvisualbrush/
---
## PageAPI::CreateVisualBrush method


Создает новую визуальную кисть.

```cpp
System::SharedPtr<XpsModel::XpsVisualBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateVisualBrush(System::SharedPtr<XpsModel::XpsContentElement> element, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| element | System::SharedPtr\<XpsModel::XpsContentElement\> | Элемент [XPS](../../../aspose.page.xps/) (Canvas, Path или Glyphs) для свойства Visual визуальной кисти. |
| viewbox | System::Drawing::RectangleF | Позиция и размеры исходного содержимого кисти. |
| область просмотра | System::Drawing::RectangleF | Область в содержащем координатном пространстве основной плитки кисти, которая (возможно многократно) применяется для заполнения области, к которой применяется кисть. |

### ReturnValue

Новая визуальная кисть.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsVisualBrush](../../../aspose.page.xps.xpsmodel/xpsvisualbrush/)
* Class [XpsContentElement](../../../aspose.page.xps.xpsmodel/xpscontentelement/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
