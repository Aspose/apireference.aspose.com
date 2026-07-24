---
title: "Aspose::Page::XPS::XpsMetadata::PageOutputBin class"
linktitle: "PageOutputBin"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::XpsMetadata::PageOutputBin class. डिवाइस के लिए समर्थित बिनों की पूरी सूची का वर्णन करता है। प्रति पृष्ठ आधार पर आउटपुट बिन निर्दिष्ट करने की अनुमति देता है। JobOutputBin, DocumentOutputBin और PageOutputBin कीवर्ड परस्पर अनन्य हैं; केवल एक को PrintTicket या Print Capabilities दस्तावेज़ में निर्दिष्ट किया जाना चाहिए। C++ में।"
type: docs
weight: 11400
url: /hi/cpp/aspose.page.xps.xpsmetadata/pageoutputbin/
---
## PageOutputBin class


डिवाइस के लिए समर्थित बिनों की पूरी सूची का वर्णन करता है। प्रति पृष्ठ आधार पर आउटपुट बिन निर्दिष्ट करने की अनुमति देता है। [JobOutputBin](../joboutputbin/), [DocumentOutputBin](../documentoutputbin/) और [PageOutputBin](./) कीवर्ड परस्पर अनन्य हैं; केवल एक को [PrintTicket](../printticket/) या Print Capabilities दस्तावेज़ में निर्दिष्ट किया जाना चाहिए। [https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin).

```cpp
class PageOutputBin : public Aspose::Page::XPS::XpsMetadata::OutputBin,
                      public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IPagePrintTicketItem
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [PageOutputBin](./pageoutputbin/)(const System::ArrayPtr\<System::SharedPtr\<OutputBin::IOutputBinItem\>\>\&) | एक नया इंस्टेंस बनाता है। |
## संबंधित देखें

* Class [OutputBin](../outputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
