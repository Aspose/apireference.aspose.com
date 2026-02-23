---
title: Aspose::Page::XPS::XpsMetadata::Feature class
linktitle: Feature
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsMetadata::Feature class. The class that incapsulates a common Print Schema feature. The base class for all schema-defined features. A Feature element contains a complete list of the Option and Property elements that fully describe a device attribute, job formatting setting, or other relevant characteristic.  in C++.'
type: docs
weight: 2900
url: /cpp/aspose.page.xps.xpsmetadata/feature/
---
## Feature class


The class that incapsulates a common Print Schema feature. The base class for all schema-defined features. A **[Feature](./)** element contains a complete list of the [Option](../option/) and [Property](../property/) elements that fully describe a device attribute, job formatting setting, or other relevant characteristic. [https://docs.microsoft.com/en-us/windows/win32/printdocs/feature](https://docs.microsoft.com/en-us/windows/win32/printdocs/feature).

```cpp
class Feature : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
                public virtual Aspose::Page::XPS::XpsMetadata::IPrintTicketItem,
                public virtual Aspose::Page::XPS::XpsMetadata::IFeatureItem
```

## Methods

| Method | Description |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | Adds a list of items to the end of this feature's item list. Each one must be a [Feature](./), an [Option](../option/), or a [Property](../property/) instance. |
| [Feature](./feature/)(System::String, System::SharedPtr\<Option\>, const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | Creates a new [PrintTicket](../printticket/) feature instance. |
| [Feature](./feature/)(System::String, System::SharedPtr\<Feature\>, const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | Creates a new [PrintTicket](../printticket/) feature instance. |
## See Also

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IPrintTicketItem](../iprintticketitem/)
* Class [IFeatureItem](../ifeatureitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
