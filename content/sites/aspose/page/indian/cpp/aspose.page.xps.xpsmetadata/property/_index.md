---
title: "Aspose::Page::XPS::XpsMetadata::Property class"
linktitle: "गुण"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::XpsMetadata::Property class. एक सामान्य PrintTicketProperty को लागू करने वाली कक्षा। सभी स्कीमा-परिभाषित प्रॉपर्टीज़ के लिए बेस क्लास। एक Property तत्व डिवाइस, जॉब फॉर्मेटिंग, या अन्य संबंधित प्रॉपर्टी को घोषित करता है जिसका नाम उसके name एट्रिब्यूट द्वारा दिया जाता है। एक Value तत्व का उपयोग Property को मान असाइन करने के लिए किया जाता है। एक Property जटिल हो सकती है, संभवतः कई सबप्रॉपर्टीज़ शामिल करती है। सबप्रॉपर्टीज़ भी Property तत्वों द्वारा प्रतिनिधित्व की जाती हैं। C++ में।"
type: docs
weight: 14300
url: /hi/cpp/aspose.page.xps.xpsmetadata/property/
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

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Property](./property/)(System::String, System::SharedPtr\<Property\>, const System::ArrayPtr\<System::SharedPtr\<IPropertyItem\>\>\&) | एक नया इंस्टेंस बनाता है। |
| [Property](./property/)(System::String, System::SharedPtr\<Value\>, const System::ArrayPtr\<System::SharedPtr\<IPropertyItem\>\>\&) | एक नया इंस्टेंस बनाता है। |
## संबंधित देखें

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IPrintTicketItem](../iprintticketitem/)
* Class [IFeatureItem](../ifeatureitem/)
* Class [IOptionItem](../ioptionitem/)
* Class [IScoredPropertyItem](../iscoredpropertyitem/)
* Class [IPropertyItem](../ipropertyitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
