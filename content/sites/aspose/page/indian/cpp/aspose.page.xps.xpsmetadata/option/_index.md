---
title: "Aspose::Page::XPS::XpsMetadata::Option क्लास"
linktitle: "Option"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::XpsMetadata::Option क्लास। एक सामान्य PrintTicketOption को लागू करने वाली क्लास। सभी स्कीमा-परिभाषित विकल्पों के लिए बेस क्लास। एक Option तत्व इस विकल्प से जुड़े सभी Property और ScoredProperty तत्वों को समाहित करता है। C++ में।"
type: docs
weight: 7600
url: /hi/cpp/aspose.page.xps.xpsmetadata/option/
---
## Option class


यह क्लास एक सामान्य [PrintTicket](../printticket/)**[Option](./)** को लागू करती है। सभी स्कीमा-परिभाषित विकल्पों के लिए बेस क्लास। एक [Option](./) तत्व इस विकल्प से जुड़े सभी [Property](../property/) और [ScoredProperty](../scoredproperty/) तत्वों को समाहित करता है। [https://docs.microsoft.com/en-us/windows/win32/printdocs/option](https://docs.microsoft.com/en-us/windows/win32/printdocs/option).

```cpp
class Option : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
               public virtual Aspose::Page::XPS::XpsMetadata::IFeatureItem
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | इस विकल्प की आइटम सूची के अंत में आइटमों की सूची जोड़ता है। प्रत्येक को एक [ScoredProperty](../scoredproperty/) या [Property](../property/) इंस्टेंस होना चाहिए। |
| [Option](./option/)(System::String, const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | एक नया [PrintTicket](../printticket/) विकल्प इंस्टेंस बनाता है। |
| [Option](./option/)(const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | एक नया [PrintTicket](../printticket/) विकल्प इंस्टेंस बनाता है। |
| [Option](./option/)(System::SharedPtr\<Option\>) | एक क्लोन विकल्प इंस्टेंस बनाता है। |
## संबंधित देखें

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IFeatureItem](../ifeatureitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
