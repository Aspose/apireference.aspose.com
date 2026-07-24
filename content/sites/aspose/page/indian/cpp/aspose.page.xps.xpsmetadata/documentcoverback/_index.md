---
title: "Aspose::Page::XPS::XpsMetadata::DocumentCoverBack क्लास"
linktitle: "DocumentCoverBack"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::XpsMetadata::DocumentCoverBack क्लास। बैक (अंत) कवर शीट का वर्णन करता है। प्रत्येक दस्तावेज़ की एक अलग शीट होगी। कवर शीट को उस PageMediaSize और PageMediaType पर प्रिंट किया जाना चाहिए जो दस्तावेज़ के अंतिम पृष्ठ के लिए उपयोग किया जाता है। कवर शीट को प्रोसेसिंग विकल्पों (जैसे DocumentDuplex, DocumentNUp) में एकीकृत किया जाना चाहिए जैसा कि निर्दिष्ट Option द्वारा संकेतित है।  in C++."
type: docs
weight: 1000
url: /hi/cpp/aspose.page.xps.xpsmetadata/documentcoverback/
---
## DocumentCoverBack class


बैक (अंत) कवर शीट का वर्णन करता है। प्रत्येक दस्तावेज़ की एक अलग शीट होगी। कवर शीट को अंतिम पृष्ठ के लिए उपयोग किए गए [PageMediaSize](../pagemediasize/) और [PageMediaType](../pagemediatype/) पर प्रिंट किया जाना चाहिए। कवर शीट को प्रोसेसिंग विकल्पों (जैसे [DocumentDuplex](../documentduplex/), [DocumentNUp](../documentnup/)) में एकीकृत किया जाना चाहिए जैसा कि निर्दिष्ट [Option](../option/) द्वारा संकेतित है। [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverback](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverback).

```cpp
class DocumentCoverBack : public Aspose::Page::XPS::XpsMetadata::Feature,
                          public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                          public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Nested classes

* Class [CoverBackOption](./coverbackoption/)
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [DocumentCoverBack](./documentcoverback/)(const System::ArrayPtr\<System::SharedPtr\<DocumentCoverBack::CoverBackOption\>\>\&) | एक नया इंस्टेंस बनाता है। |
## संबंधित देखें

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
