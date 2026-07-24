---
title: "Aspose::Page::XPS::XpsMetadata::PageInputBin class"
linktitle: "PageInputBin"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::XpsMetadata::PageInputBin class. डिवाइस में स्थापित इनपुट बिन या डिवाइस के लिए समर्थित बिन की पूरी सूची का वर्णन करता है। प्रति पृष्ठ आधार पर इनपुट बिन निर्दिष्ट करने की अनुमति देता है। JobInputBin, DocumentInputBin और PageInputBin कीवर्ड आपस में परस्पर अनन्य हैं। दोनों को एक साथ PrintTicket या Print Capabilities दस्तावेज़ में निर्दिष्ट नहीं किया जाना चाहिए।  in C++."
type: docs
weight: 10000
url: /hi/cpp/aspose.page.xps.xpsmetadata/pageinputbin/
---
## PageInputBin class


डिवाइस में स्थापित इनपुट बिन या डिवाइस के लिए समर्थित बिन की पूरी सूची का वर्णन करता है। प्रति पृष्ठ आधार पर इनपुट बिन निर्दिष्ट करने की अनुमति देता है। [JobInputBin](../jobinputbin/), [DocumentInputBin](../documentinputbin/) और [PageInputBin](./) कीवर्ड आपस में परस्पर अनन्य हैं। दोनों को एक साथ [PrintTicket](../printticket/) या Print Capabilities दस्तावेज़ में निर्दिष्ट नहीं किया जाना चाहिए। [https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin).

```cpp
class PageInputBin : public Aspose::Page::XPS::XpsMetadata::InputBin,
                     public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                     public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem,
                     public Aspose::Page::XPS::XpsMetadata::IPagePrintTicketItem
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [PageInputBin](./pageinputbin/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinItem\>\>\&) | एक नया इंस्टेंस बनाता है। |
## संबंधित देखें

* Class [InputBin](../inputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
