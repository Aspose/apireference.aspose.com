---
title: "Aspose::Page::XPS::XpsMetadata::DocumentOutputBin class"
linktitle: "DocumentOutputBin"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::XpsMetadata::DocumentOutputBin class. डिवाइस के लिए समर्थित बिन्स की पूरी सूची को वर्णित करता है। प्रति दस्तावेज़ आधार पर आउटपुट बिन निर्दिष्ट करने की अनुमति देता है। JobOutputBin, DocumentOutputBin और PageOutputBin कीवर्ड परस्पर अनन्य हैं; केवल एक को PrintTicket या Print Capabilities दस्तावेज़ में निर्दिष्ट किया जाना चाहिए। C++ में।"
type: docs
weight: 2100
url: /hi/cpp/aspose.page.xps.xpsmetadata/documentoutputbin/
---
## DocumentOutputBin class


डिवाइस के लिए समर्थित बिन्स की पूरी सूची को वर्णित करता है। प्रति दस्तावेज़ आधार पर आउटपुट बिन निर्दिष्ट करने की अनुमति देता है। [JobOutputBin](../joboutputbin/), [DocumentOutputBin](./) और [PageOutputBin](../pageoutputbin/) कीवर्ड परस्पर अनन्य हैं; केवल एक को [PrintTicket](../printticket/) या Print Capabilities दस्तावेज़ में निर्दिष्ट किया जाना चाहिए। [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin).

```cpp
class DocumentOutputBin : public Aspose::Page::XPS::XpsMetadata::OutputBin,
                          public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                          public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [DocumentOutputBin](./documentoutputbin/)(const System::ArrayPtr\<System::SharedPtr\<OutputBin::IOutputBinItem\>\>\&) | एक नया इंस्टेंस बनाता है। |
## संबंधित देखें

* Class [OutputBin](../outputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
