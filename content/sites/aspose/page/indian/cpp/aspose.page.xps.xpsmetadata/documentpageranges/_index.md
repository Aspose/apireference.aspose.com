---
title: "Aspose::Page::XPS::XpsMetadata::DocumentPageRanges class"
linktitle: "DocumentPageRanges"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::XpsMetadata::DocumentPageRanges class. दस्तावेज़ के पृष्ठों में आउटपुट रेंज को वर्णित करता है। पैरामीटर मान को निम्नलिखित संरचना के अनुरूप होना चाहिए: C++ में।"
type: docs
weight: 2200
url: /hi/cpp/aspose.page.xps.xpsmetadata/documentpageranges/
---
## DocumentPageRanges class


दस्तावेज़ की पृष्ठों में आउटपुट रेंज का वर्णन करता है। पैरामीटर मान को निम्नलिखित संरचना के अनुरूप होना चाहिए:

```cpp
class DocumentPageRanges : public Aspose::Page::XPS::XpsMetadata::StringParameterInit,
                           public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                           public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [DocumentPageRanges](./documentpageranges/)(System::String) | एक नया इंस्टेंस बनाता है। |
## टिप्पणियाँ


* PageRangeText: "PageRange" or "PageRange,PageRange"
* PageRange: "PageNumber" or "PageNumber-PageNumber"
* PageNumber: 1 to N, where N is the number of pages in the document.If PageNumber > N, then PageNumber = N. Whitespace in the string should be ignored. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges)


## संबंधित देखें

* Class [StringParameterInit](../stringparameterinit/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
