---
title: "Aspose::Page::XPS::XpsMetadata::PageOutputColor::PageOutputColorOption класс"
linktitle: "PageOutputColorOption"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsMetadata::PageOutputColor::PageOutputColorOption класс. Описывает параметры функции PageOutputColor в C++."
type: docs
weight: 400
url: /ru/cpp/aspose.page.xps.xpsmetadata/pageoutputcolor/pageoutputcoloroption/
---
## PageOutputColorOption class


Описывает параметры функции [PageOutputColor](../).

```cpp
class PageOutputColorOption : public Aspose::Page::XPS::XpsMetadata::Option,
                              public Aspose::Page::XPS::XpsMetadata::PageOutputColor::IPageOutputColorItem
```

## Методы

| Метод | Описание |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<PageOutputColor::IPageOutputColorOptionItem\>\>\&) | Добавляет массив экземпляров [IPageOutputColorOptionItem](../ipageoutputcoloroptionitem/) в параметр. |
| static [Color](./color/)(int32_t, int32_t) | Указывает, что вывод должен быть в цвете. |
| static [Grayscale](./grayscale/)(int32_t, int32_t) | Указывает, что вывод должен быть в градациях серого. |
| static [Monochrome](./monochrome/)(int32_t, int32_t) | Указывает, что вывод должен быть монохромным (черный). |
| [PageOutputColorOption](./pageoutputcoloroption/)(System::String, const System::ArrayPtr\<System::SharedPtr\<PageOutputColor::IPageOutputColorOptionItem\>\>\&) | Создаёт новый экземпляр. |
## См. также

* Class [Option](../../option/)
* Class [IPageOutputColorItem](../ipageoutputcoloritem/)
* Class [PageOutputColor](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
