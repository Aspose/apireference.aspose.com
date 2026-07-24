---
title: "Aspose::Page::XPS::XpsMetadata::PageWatermark क्लास"
linktitle: "PageWatermark"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::XpsMetadata::PageWatermark क्लास। आउटपुट की वॉटरमार्क सेटिंग और वॉटरमार्क विशेषताओं का वर्णन करता है। वॉटरमार्क लॉजिकल पेज पर लागू होते हैं, शारीरिक पेज पर नहीं। उदाहरण के लिए, यदि DocumentDuplex सक्षम है, तो प्रत्येक NUp पेज पर प्रत्येक शीट में वॉटरमार्क दिखाई देगा। यदि DocumentDuplex, PagesPerSheet=2, तो प्रत्येक शीट में 2 वॉटरमार्क होंगे। in C++."
type: docs
weight: 13100
url: /hi/cpp/aspose.page.xps.xpsmetadata/pagewatermark/
---
## PageWatermark class


आउटपुट की वॉटरमार्क सेटिंग और वॉटरमार्क विशेषताओं का वर्णन करता है। वॉटरमार्क लॉजिकल पेज पर लागू होते हैं, शारीरिक पेज पर नहीं। उदाहरण के लिए, यदि [DocumentDuplex](../documentduplex/) सक्षम है, तो प्रत्येक **[NUp](../nup/)** पेज पर प्रत्येक शीट में वॉटरमार्क दिखाई देगा। यदि [DocumentDuplex](../documentduplex/), **PagesPerSheet**=2, तो प्रत्येक शीट में 2 वॉटरमार्क होंगे। [https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark](https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark).

```cpp
class PageWatermark : public Aspose::Page::XPS::XpsMetadata::Feature,
                      public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IPagePrintTicketItem
```

## Nested classes

* Class [IPageWatermarkItem](./ipagewatermarkitem/)
* Class [IPageWatermarkOptionItem](./ipagewatermarkoptionitem/)
* Class [Layering](./layering/)
* Class [LayeringOption](./layeringoption/)
* Class [PageWatermarkOption](./pagewatermarkoption/)
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [PageWatermark](./pagewatermark/)(const System::ArrayPtr\<System::SharedPtr\<PageWatermark::IPageWatermarkItem\>\>\&) | एक नया इंस्टेंस बनाता है। |
## संबंधित देखें

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
