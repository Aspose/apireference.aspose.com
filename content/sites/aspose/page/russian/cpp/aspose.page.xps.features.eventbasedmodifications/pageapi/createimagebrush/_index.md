---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush method"
linktitle: "CreateImageBrush"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush method. Создает новую кисть изображения в C++."
type: docs
weight: 1100
url: /ru/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createimagebrush/
---
## PageAPI::CreateImageBrush(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) method


Создает новую кисть изображения.

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush(System::SharedPtr<XpsModel::XpsImage> image, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| изображение | System::SharedPtr\<XpsModel::XpsImage\> | Ресурс изображения. |
| viewbox | System::Drawing::RectangleF | Позиция и размеры исходного содержимого кисти. |
| область просмотра | System::Drawing::RectangleF | Область в содержащем координатном пространстве основной плитки кисти, которая (возможно многократно) применяется для заполнения области, к которой применяется кисть. |

### ReturnValue

Новая кисть изображения.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsImageBrush](../../../aspose.page.xps.xpsmodel/xpsimagebrush/)
* Class [XpsImage](../../../aspose.page.xps.xpsmodel/xpsimage/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreateImageBrush(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) method


Создает новую кисть изображения.

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateImageBrush(System::String imagePath, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| imagePath | System::String | Путь к изображению, используемому в качестве плитки кисти. |
| viewbox | System::Drawing::RectangleF | Позиция и размеры исходного содержимого кисти. |
| область просмотра | System::Drawing::RectangleF | Область в содержащем координатном пространстве основной плитки кисти, которая (возможно многократно) применяется для заполнения области, к которой применяется кисть. |

### ReturnValue

Новая кисть изображения.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsImageBrush](../../../aspose.page.xps.xpsmodel/xpsimagebrush/)
* Class [String](../../../system/string/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
