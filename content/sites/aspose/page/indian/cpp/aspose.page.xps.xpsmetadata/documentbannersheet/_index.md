---
title: "Aspose::Page::XPS::XpsMetadata::DocumentBannerSheet class"
linktitle: "DocumentBannerSheet"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::XpsMetadata::DocumentBannerSheet class. किसी विशेष दस्तावेज़ के लिए आउटपुट होने वाले बैनर शीट का वर्णन करता है। बैनर शीट को डिफ़ॉल्ट PageMediaSize पर और डिफ़ॉल्ट PageMediaType का उपयोग करके आउटपुट किया जाना चाहिए। बैनर शीट को जॉब के शेष भाग से भी अलग होना चाहिए। इसका अर्थ है कि कोई भी फिनिशिंग या प्रोसेसिंग विकल्प (जैसे DocumentDuplex, DocumentStaple, या DocumentBinding) बैनर शीट को शामिल नहीं करेंगे। बैनर शीट जॉब के शेष भाग से अलग हो भी सकती है और नहीं भी। इसका अर्थ है कि कोई भी जॉब फिनिशिंग या प्रोसेसिंग विकल्प, दस्तावेज़ बैनर शीट को शामिल कर सकते हैं। बैनर शीट दस्तावेज़ की पहली शीट के रूप में होनी चाहिए। C++ में।"
type: docs
weight: 400
url: /hi/cpp/aspose.page.xps.xpsmetadata/documentbannersheet/
---
## DocumentBannerSheet class


किसी विशेष दस्तावेज़ के लिए आउटपुट होने वाले बैनर शीट का वर्णन करता है। बैनर शीट को डिफ़ॉल्ट [PageMediaSize](../pagemediasize/) पर और डिफ़ॉल्ट [PageMediaType](../pagemediatype/) का उपयोग करके आउटपुट किया जाना चाहिए। बैनर शीट को जॉब के शेष भाग से भी अलग होना चाहिए। इसका अर्थ है कि कोई भी फिनिशिंग या प्रोसेसिंग विकल्प (जैसे [DocumentDuplex](../documentduplex/), [DocumentStaple](../documentstaple/), या [DocumentBinding](../documentbinding/)) बैनर शीट को शामिल नहीं करेंगे। बैनर शीट जॉब के शेष भाग से अलग हो भी सकती है और नहीं भी। इसका अर्थ है कि कोई भी जॉब फिनिशिंग या प्रोसेसिंग विकल्प, दस्तावेज़ बैनर शीट को शामिल कर सकते हैं। बैनर शीट दस्तावेज़ की पहली शीट के रूप में होनी चाहिए। [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet).

```cpp
class DocumentBannerSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                            public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                            public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Nested classes

* Class [BannerSheetOption](./bannersheetoption/)
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [DocumentBannerSheet](./documentbannersheet/)(const System::ArrayPtr\<System::SharedPtr\<DocumentBannerSheet::BannerSheetOption\>\>\&) | एक नया इंस्टेंस बनाता है। |
## संबंधित देखें

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
