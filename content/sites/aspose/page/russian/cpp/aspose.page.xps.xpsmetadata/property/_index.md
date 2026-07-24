---
title: "Aspose::Page::XPS::XpsMetadata::Property class"
linktitle: "Свойство"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsMetadata::Property class. Класс, реализующий общую PrintTicketProperty. Базовый класс для всех определённых схемой свойств. Элемент Property объявляет устройство, форматирование задания или другое релевантное свойство, имя которого задаётся атрибутом name. Элемент Value используется для назначения значения свойству Property. Property может быть сложным, возможно содержащим несколько под‑свойств. Под‑свойства также представлены элементами Property.  в C++."
type: docs
weight: 14300
url: /ru/cpp/aspose.page.xps.xpsmetadata/property/
---
## Property class


Класс, реализующий общую [PrintTicket](../printticket/)**[Property](./)**. Базовый класс для всех определённых схемой свойств. Элемент **[Property](./)** объявляет устройство, форматирование задания или другое релевантное свойство, имя которого задаётся атрибутом name. Элемент [Value](../value/) используется для назначения значения элементу **[Property](./)**. **[Property](./)** может быть сложным, возможно содержащим несколько под‑свойств. Под‑свойства также представлены элементами **[Property](./)**. [https://docs.microsoft.com/en-us/windows/win32/printdocs/property](https://docs.microsoft.com/en-us/windows/win32/printdocs/property).

```cpp
class Property : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
                 public virtual Aspose::Page::XPS::XpsMetadata::IPrintTicketItem,
                 public Aspose::Page::XPS::XpsMetadata::IFeatureItem,
                 public virtual Aspose::Page::XPS::XpsMetadata::IOptionItem,
                 public Aspose::Page::XPS::XpsMetadata::IScoredPropertyItem,
                 public Aspose::Page::XPS::XpsMetadata::IPropertyItem
```

## Методы

| Метод | Описание |
| --- | --- |
| [Property](./property/)(System::String, System::SharedPtr\<Property\>, const System::ArrayPtr\<System::SharedPtr\<IPropertyItem\>\>\&) | Создаёт новый экземпляр. |
| [Property](./property/)(System::String, System::SharedPtr\<Value\>, const System::ArrayPtr\<System::SharedPtr\<IPropertyItem\>\>\&) | Создаёт новый экземпляр. |
## См. также

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IPrintTicketItem](../iprintticketitem/)
* Class [IFeatureItem](../ifeatureitem/)
* Class [IOptionItem](../ioptionitem/)
* Class [IScoredPropertyItem](../iscoredpropertyitem/)
* Class [IPropertyItem](../ipropertyitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
