---
title: "Aspose::Page::XPS::XpsMetadata::DocumentInputBin क्लास"
linktitle: "DocumentInputBin"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::XpsMetadata::DocumentInputBin क्लास. डिवाइस में स्थापित इनपुट बिन या डिवाइस के लिए समर्थित बिनों की पूरी सूची का वर्णन करता है। JobInputBin, DocumentInputBin, और PageInputBin कीवर्ड परस्पर अनन्य हैं। दोनों को PrintTicket या Print Capabilities दस्तावेज़ में एक साथ निर्दिष्ट नहीं किया जाना चाहिए।  C++ में।"
type: docs
weight: 1800
url: /hi/cpp/aspose.page.xps.xpsmetadata/documentinputbin/
---
## DocumentInputBin class


डिवाइस में स्थापित इनपुट बिन या डिवाइस के लिए समर्थित बिनों की पूरी सूची का वर्णन करता है। [JobInputBin](../jobinputbin/), [DocumentInputBin](./), और [PageInputBin](../pageinputbin/) कीवर्ड परस्पर अनन्य हैं। दोनों को [PrintTicket](../printticket/) या Print Capabilities दस्तावेज़ में एक साथ निर्दिष्ट नहीं किया जाना चाहिए। [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin).

```cpp
class DocumentInputBin : public Aspose::Page::XPS::XpsMetadata::InputBin,
                         public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                         public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [DocumentInputBin](./documentinputbin/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinItem\>\>\&) | एक नया इंस्टेंस बनाता है। |
## संबंधित देखें

* Class [InputBin](../inputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
