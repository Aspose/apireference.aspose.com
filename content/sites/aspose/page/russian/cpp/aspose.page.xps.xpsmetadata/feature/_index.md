---
title: "Aspose::Page::XPS::XpsMetadata::Feature class"
linktitle: "Функция"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsMetadata::Feature class. Класс, инкапсулирующий общую функцию Print Schema. Базовый класс для всех определённых схемой функций. Элемент Feature содержит полный список элементов Option и Property, которые полностью описывают атрибут устройства, настройку форматирования задания или другую соответствующую характеристику.  в C++."
type: docs
weight: 2900
url: /ru/cpp/aspose.page.xps.xpsmetadata/feature/
---
## Feature class


Класс, инкапсулирующий общую функцию Print Schema. Базовый класс для всех функций, определённых схемой. Элемент **[Feature](./)** содержит полный список элементов [Option](../option/) и [Property](../property/), которые полностью описывают атрибут устройства, настройку форматирования задания или другую релевантную характеристику. [https://docs.microsoft.com/en-us/windows/win32/printdocs/feature](https://docs.microsoft.com/en-us/windows/win32/printdocs/feature).

```cpp
class Feature : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
                public virtual Aspose::Page::XPS::XpsMetadata::IPrintTicketItem,
                public virtual Aspose::Page::XPS::XpsMetadata::IFeatureItem
```

## Методы

| Метод | Описание |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | Добавляет список элементов в конец списка элементов этой функции. Каждый элемент должен быть экземпляром [Feature](./), [Option](../option/) или [Property](../property/). |
| [Feature](./feature/)(System::String, System::SharedPtr\<Option\>, const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | Создаёт новый экземпляр функции [PrintTicket](../printticket/). |
| [Feature](./feature/)(System::String, System::SharedPtr\<Feature\>, const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | Создаёт новый экземпляр функции [PrintTicket](../printticket/). |
## См. также

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IPrintTicketItem](../iprintticketitem/)
* Class [IFeatureItem](../ifeatureitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
