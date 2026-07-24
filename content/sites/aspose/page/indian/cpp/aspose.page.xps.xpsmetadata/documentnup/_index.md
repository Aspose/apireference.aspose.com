---
title: "Aspose::Page::XPS::XpsMetadata::DocumentNUp क्लास"
linktitle: "DocumentNUp"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::XpsMetadata::DocumentNUp क्लास। कई लॉजिकल पृष्ठों को एकल फिजिकल शीट पर आउटपुट और फॉर्मेट का वर्णन करता है। प्रत्येक दस्तावेज़ अलग से संकलित किया जाता है। DocumentNUp और JobNUpAllDocumentsContiguously परस्पर अनन्य हैं। इन कीवर्ड्स के बीच प्रतिबंध संभालना ड्राइवर पर निर्भर है। in C++."
type: docs
weight: 2000
url: /hi/cpp/aspose.page.xps.xpsmetadata/documentnup/
---
## DocumentNUp class


कई लॉजिकल पृष्ठों को एकल फिजिकल शीट पर आउटपुट और फॉर्मेट का वर्णन करता है। प्रत्येक दस्तावेज़ अलग से संकलित किया जाता है। **[DocumentNUp](./)** और [JobNUpAllDocumentsContiguously](../jobnupalldocumentscontiguously/) परस्पर अनन्य हैं। इन कीवर्ड्स के बीच प्रतिबंध संभालना ड्राइवर पर निर्भर है। [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup).

```cpp
class DocumentNUp : public Aspose::Page::XPS::XpsMetadata::NUp,
                    public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                    public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [AddPagesPerSheetOption](./addpagespersheetoption/)(int32_t) | एक **PagesPerSheet** स्कोर्ड प्रॉपर्टी वैल्यू के साथ विकल्प जोड़ता है। फिजिकल शीट पर लॉजिकल पेजों की संख्या निर्दिष्ट करता है। |
| [DocumentNUp](./documentnup/)(const System::ArrayPtr\<System::SharedPtr\<NUp::INUpItem\>\>\&) | एक नया इंस्टेंस बनाता है। |
## संबंधित देखें

* Class [NUp](../nup/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
