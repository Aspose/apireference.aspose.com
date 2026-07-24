---
title: "Класс Aspose::Page::XPS::XpsMetadata::Option"
linktitle: "Option"
second_title: "Aspose.Page для C++"
description: "Класс Aspose::Page::XPS::XpsMetadata::Option. Класс, реализующий общую PrintTicketOption. Базовый класс для всех опций, определённых схемой. Элемент Option содержит все элементы Property и ScoredProperty, связанные с этой опцией.  в C++."
type: docs
weight: 7600
url: /ru/cpp/aspose.page.xps.xpsmetadata/option/
---
## Option class


Класс, реализующий общую [PrintTicket](../printticket/)**[Option](./)**. Базовый класс для всех опций, определённых схемой. Элемент [Option](./) содержит все элементы [Property](../property/) и [ScoredProperty](../scoredproperty/), связанные с этой опцией. [https://docs.microsoft.com/en-us/windows/win32/printdocs/option](https://docs.microsoft.com/en-us/windows/win32/printdocs/option).

```cpp
class Option : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
               public virtual Aspose::Page::XPS::XpsMetadata::IFeatureItem
```

## Методы

| Метод | Описание |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | Добавляет список элементов в конец списка элементов этой опции. Каждый из них должен быть экземпляром [ScoredProperty](../scoredproperty/) или [Property](../property/). |
| [Option](./option/)(System::String, const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | Создаёт новый экземпляр опции [PrintTicket](../printticket/). |
| [Option](./option/)(const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | Создаёт новый экземпляр опции [PrintTicket](../printticket/). |
| [Option](./option/)(System::SharedPtr\<Option\>) | Создаёт клон экземпляра опции. |
## См. также

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IFeatureItem](../ifeatureitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
