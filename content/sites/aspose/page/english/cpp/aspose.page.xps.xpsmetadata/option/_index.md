---
title: Aspose::Page::XPS::XpsMetadata::Option class
linktitle: Option
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsMetadata::Option class. The class that implements a common PrintTicketOption. The base class for all schema-defined options. An Option element contains all of the Property and ScoredProperty elements associated with this option.  in C++.'
type: docs
weight: 7700
url: /cpp/aspose.page.xps.xpsmetadata/option/
---
## Option class


The class that implements a common [PrintTicket](../printticket/)**[Option](./)**. The base class for all schema-defined options. An [Option](./) element contains all of the [Property](../property/) and [ScoredProperty](../scoredproperty/) elements associated with this option. [https://docs.microsoft.com/en-us/windows/win32/printdocs/option](https://docs.microsoft.com/en-us/windows/win32/printdocs/option).

```cpp
class Option : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
               public virtual Aspose::Page::XPS::XpsMetadata::IFeatureItem
```

## Methods

| Method | Description |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | Adds a list of items to the end of this option's item list. Each one must be a [ScoredProperty](../scoredproperty/) or [Property](../property/) instance. |
| [Option](./option/)(System::String, const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | Creates a new [PrintTicket](../printticket/) option instance. |
| [Option](./option/)(const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | Creates a new [PrintTicket](../printticket/) option instance. |
| [Option](./option/)(System::SharedPtr\<Option\>) | Creates a clone option instance. |
## See Also

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IFeatureItem](../ifeatureitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
