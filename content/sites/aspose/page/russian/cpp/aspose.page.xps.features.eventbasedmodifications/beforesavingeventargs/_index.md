---
title: "Aspose::Page::XPS::Features::EventBasedModifications::BeforeSavingEventArgs класс"
linktitle: "BeforeSavingEventArgs"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::BeforeSavingEventArgs класс. Определяет базовый класс для аргументов различных событий перед сохранением в C++."
type: docs
weight: 200
url: /ru/cpp/aspose.page.xps.features.eventbasedmodifications/beforesavingeventargs/
---
## BeforeSavingEventArgs class


Определяет базовый класс для аргументов различных событий перед сохранением.

```cpp
template<typename T>class BeforeSavingEventArgs : public System::Object
```


| Параметр | Описание |
| --- | --- |
| T | Тип API модификации. |
## Методы

| Метод | Описание |
| --- | --- |
| [get_AbsolutePageNumber](./get_absolutepagenumber/)() const | Текущий абсолютный номер страницы во всех документах пакета [XPS](../../aspose.page.xps/). |
| [get_DocumentNumber](./get_documentnumber/)() const | Текущий номер документа в пакете [XPS](../../aspose.page.xps/). |
| [get_ElementAPI](./get_elementapi/)() const | Получает API модификации элемента, который собирается быть сохранённым. |
| [get_OutputPageNumber](./get_outputpagenumber/)() const | Текущий номер вывода. Он отличается от **AbsolutePageNumber**, если указана опция сохранения **PageNumbers**. |
| [get_RelativePageNumber](./get_relativepagenumber/)() const | Текущий номер страницы относительно текущего документа в пакете [XPS](../../aspose.page.xps/). |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Устанавливает n‑й аргумент шаблона как слабый указатель (вместо shared). Позволяет переключать указатели в контейнерах в режим weak. |

## См. также

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../)
* Library [Aspose.Page for C++](../../)
