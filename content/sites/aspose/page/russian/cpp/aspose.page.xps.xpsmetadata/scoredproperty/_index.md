---
title: "Aspose::Page::XPS::XpsMetadata::ScoredProperty class"
linktitle: "ScoredProperty"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsMetadata::ScoredProperty class. Класс, реализующий общую PrintTicketScoredProperty. Базовый класс для всех определённых схемой scored‑свойств. Элемент ScoredProperty объявляет свойство, которое является неотъемлемой частью определения Option. Такие свойства должны сравниваться при оценке того, насколько запрошенный Option соответствует поддерживаемому устройством Option.  в C++."
type: docs
weight: 14600
url: /ru/cpp/aspose.page.xps.xpsmetadata/scoredproperty/
---
## ScoredProperty class


Класс, реализующий общую [PrintTicket](../printticket/)**[ScoredProperty](./)**. Базовый класс для всех определённых схемой scored‑свойств. Элемент **[ScoredProperty](./)** объявляет свойство, которое является неотъемлемой частью определения [Option](../option/). Такие свойства должны сравниваться при оценке того, насколько запрошенный [Option](../option/) соответствует поддерживаемому устройством [Option](../option/). [https://docs.microsoft.com/en-us/windows/win32/printdocs/scoredproperty](https://docs.microsoft.com/en-us/windows/win32/printdocs/scoredproperty).

```cpp
class ScoredProperty : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
                       public virtual Aspose::Page::XPS::XpsMetadata::IOptionItem,
                       public Aspose::Page::XPS::XpsMetadata::IScoredPropertyItem
```

## Методы

| Метод | Описание |
| --- | --- |
| [ScoredProperty](./scoredproperty/)(System::String, System::SharedPtr\<ParameterRef\>) | Создаёт новый экземпляр. |
| [ScoredProperty](./scoredproperty/)(System::String, System::SharedPtr\<Value\>, const System::ArrayPtr\<System::SharedPtr\<IScoredPropertyItem\>\>\&) | Создаёт новый экземпляр. |
## См. также

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IOptionItem](../ioptionitem/)
* Class [IScoredPropertyItem](../iscoredpropertyitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
