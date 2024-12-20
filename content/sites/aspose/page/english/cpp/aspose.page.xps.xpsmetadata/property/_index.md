---
title: Aspose::Page::XPS::XpsMetadata::Property class
linktitle: Property
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsMetadata::Property class. The class that implements a common PrintTicketProperty. The base class for all schema-defined properties. A Property element declares a device, job formatting, or other relevant property whose name is given by its name attribute. A Value element is used to assign a value to the Property. A Property can be complex, possibly containing multiple subproperties. Subproperties are also represented by Property elements.  in C++.'
type: docs
weight: 14300
url: /cpp/aspose.page.xps.xpsmetadata/property/
---
## Property class


The class that implements a common [PrintTicket](../printticket/)**[Property](./)**. The base class for all schema-defined properties. A **[Property](./)** element declares a device, job formatting, or other relevant property whose name is given by its name attribute. A [Value](../value/) element is used to assign a value to the **[Property](./)**. A **[Property](./)** can be complex, possibly containing multiple subproperties. Subproperties are also represented by **[Property](./)** elements. [https://docs.microsoft.com/en-us/windows/win32/printdocs/property](https://docs.microsoft.com/en-us/windows/win32/printdocs/property).

```cpp
class Property : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
                 public virtual Aspose::Page::XPS::XpsMetadata::IPrintTicketItem,
                 public Aspose::Page::XPS::XpsMetadata::IFeatureItem,
                 public virtual Aspose::Page::XPS::XpsMetadata::IOptionItem,
                 public Aspose::Page::XPS::XpsMetadata::IScoredPropertyItem,
                 public Aspose::Page::XPS::XpsMetadata::IPropertyItem
```

## Methods

| Method | Description |
| --- | --- |
| [Property](./property/)(System::String, System::SharedPtr\<Property\>, const System::ArrayPtr\<System::SharedPtr\<IPropertyItem\>\>\&) | Creates a new instance. |
| [Property](./property/)(System::String, System::SharedPtr\<Value\>, const System::ArrayPtr\<System::SharedPtr\<IPropertyItem\>\>\&) | Creates a new instance. |
## See Also

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IPrintTicketItem](../iprintticketitem/)
* Class [IFeatureItem](../ifeatureitem/)
* Class [IOptionItem](../ioptionitem/)
* Class [IScoredPropertyItem](../iscoredpropertyitem/)
* Class [IPropertyItem](../ipropertyitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
