---
title: "Aspose::Page::XPS::XpsDocument::SaveAsImageBytes метод"
linktitle: "SaveAsImageBytes"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsDocument::SaveAsImageBytes метод. Сохраняет документ в формате растрового изображения в виде массивов байтов в C++."
type: docs
weight: 5600
url: /ru/cpp/aspose.page.xps/xpsdocument/saveasimagebytes/
---
## XpsDocument::SaveAsImageBytes method


Сохраняет документ в формате растрового изображения в виде массивов байтов.

```cpp
System::ArrayPtr<System::ArrayPtr<System::ArrayPtr<uint8_t>>> Aspose::Page::XPS::XpsDocument::SaveAsImageBytes(System::SharedPtr<Presentation::Image::ImageSaveOptions> options)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| параметры | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | Параметры сохранения документа в формате растрового изображения. |

### ReturnValue

Полученные массивы байтов изображений. Первое измерение соответствует внутренним документам, а второе — страницам внутри внутренних документов.

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
