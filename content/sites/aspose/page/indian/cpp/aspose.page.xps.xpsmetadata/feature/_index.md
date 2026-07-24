---
title: "Aspose::Page::XPS::XpsMetadata::Feature क्लास"
linktitle: "फ़ीचर"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::XpsMetadata::Feature क्लास। एक सामान्य Print Schema फीचर को समाहित करने वाली क्लास। सभी स्कीमा-परिभाषित फीचर्स के लिए बेस क्लास। एक Feature तत्व विकल्प और प्रॉपर्टी तत्वों की पूरी सूची रखता है जो डिवाइस एट्रिब्यूट, जॉब फॉर्मेटिंग सेटिंग, या अन्य संबंधित विशेषता को पूरी तरह वर्णित करती है। C++ में।"
type: docs
weight: 2900
url: /hi/cpp/aspose.page.xps.xpsmetadata/feature/
---
## Feature class


सामान्य Print Schema सुविधा को संलग्न करने वाली क्लास। सभी schema-परिभाषित सुविधाओं के लिए आधार क्लास। एक **[Feature](./)** तत्व में डिवाइस एट्रिब्यूट, जॉब फ़ॉर्मेटिंग सेटिंग, या अन्य संबंधित विशेषता का पूर्ण विवरण देने वाले [Option](../option/) और [Property](../property/) तत्वों की पूरी सूची होती है। [https://docs.microsoft.com/en-us/windows/win32/printdocs/feature](https://docs.microsoft.com/en-us/windows/win32/printdocs/feature)।

```cpp
class Feature : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
                public virtual Aspose::Page::XPS::XpsMetadata::IPrintTicketItem,
                public virtual Aspose::Page::XPS::XpsMetadata::IFeatureItem
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | इस सुविधा की आइटम सूची के अंत में आइटमों की एक सूची जोड़ता है। प्रत्येक को एक [Feature](./), एक [Option](../option/), या एक [Property](../property/) इंस्टेंस होना चाहिए। |
| [Feature](./feature/)(System::String, System::SharedPtr\<Option\>, const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | एक नया [PrintTicket](../printticket/) सुविधा इंस्टेंस बनाता है। |
| [Feature](./feature/)(System::String, System::SharedPtr\<Feature\>, const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | एक नया [PrintTicket](../printticket/) सुविधा इंस्टेंस बनाता है। |
## संबंधित देखें

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IPrintTicketItem](../iprintticketitem/)
* Class [IFeatureItem](../ifeatureitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
