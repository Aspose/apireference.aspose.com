---
title: Aspose::Page::XPS::XpsMetadata::ScoredProperty class
linktitle: ScoredProperty
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsMetadata::ScoredProperty class. The class that implements a common PrintTicketScoredProperty. The base class for all schema-defined scored properties. A ScoredProperty element declares a property that is intrinsic to an Option definition. Such properties should be compared when evaluating how closely a requested Option matches a device-supported Option.  in C++.'
type: docs
weight: 14700
url: /cpp/aspose.page.xps.xpsmetadata/scoredproperty/
---
## ScoredProperty class


The class that implements a common [PrintTicket](../printticket/)**[ScoredProperty](./)**. The base class for all schema-defined scored properties. A **[ScoredProperty](./)** element declares a property that is intrinsic to an [Option](../option/) definition. Such properties should be compared when evaluating how closely a requested [Option](../option/) matches a device-supported [Option](../option/). [https://docs.microsoft.com/en-us/windows/win32/printdocs/scoredproperty](https://docs.microsoft.com/en-us/windows/win32/printdocs/scoredproperty).

```cpp
class ScoredProperty : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
                       public virtual Aspose::Page::XPS::XpsMetadata::IOptionItem,
                       public Aspose::Page::XPS::XpsMetadata::IScoredPropertyItem
```

## Methods

| Method | Description |
| --- | --- |
| [ScoredProperty](./scoredproperty/)(System::String, System::SharedPtr\<ParameterRef\>) | Creates a new instance. |
| [ScoredProperty](./scoredproperty/)(System::String, System::SharedPtr\<Value\>, const System::ArrayPtr\<System::SharedPtr\<IScoredPropertyItem\>\>\&) | Creates a new instance. |
## See Also

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IOptionItem](../ioptionitem/)
* Class [IScoredPropertyItem](../iscoredpropertyitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
