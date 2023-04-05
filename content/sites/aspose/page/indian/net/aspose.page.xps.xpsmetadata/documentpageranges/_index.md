---
title: Class DocumentPageRanges
second_title: .NET API संदर्भ के लिए Aspose.Page
description: Aspose.Page.XPS.XpsMetadata.DocumentPageRanges कक्ष. पृष्ठं में दस्तवेज़ क आउटपुट श्रेण क वर्णन करत है पैरमटर मन नम्न संरचन के अनुरूप हन चहए  PageRangeText PageRange य PageRangePageRange  PageRange PageNumber य PageNumberPageNumber  PageNumber 1 to N जहँ N क संख्य है दस्तवेज़ में पृष्ठ यद पेजनंबर एन त पेजनंबर  एन. स्ट्रंग में व्हइटस्पेस क अनदेख कय जन चहए https//docs.microsoft.com/enus/windows/win32/printdocs/documentpageranges
type: docs
weight: 770
url: /hi/net/aspose.page.xps.xpsmetadata/documentpageranges/
---
## DocumentPageRanges class

पृष्ठों में दस्तावेज़ की आउटपुट श्रेणी का वर्णन करता है। पैरामीटर मान निम्न संरचना के अनुरूप होना चाहिए: - PageRangeText: "PageRange" या "PageRange,PageRange" - PageRange: "PageNumber" या "PageNumber-PageNumber" - PageNumber: 1 to N, जहाँ N की संख्या है दस्तावेज़ में पृष्ठ। यदि पेजनंबर&gt; एन, तो पेजनंबर = एन. स्ट्रिंग में व्हाइटस्पेस को अनदेखा किया जाना चाहिए। https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges

```csharp
public sealed class DocumentPageRanges : StringParameterInit, IDocumentPrintTicketItem, 
    IJobPrintTicketItem
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [DocumentPageRanges](documentpageranges/)(string) | एक नया उदाहरण बनाता है। |

## गुण

| नाम | विवरण |
| --- | --- |
| virtual [MaxLength](../../aspose.page.xps.xpsmetadata/stringparameterinit/maxlength/) { get; } | स्ट्रिंग मानों के लिए, सबसे लंबी अनुमत स्ट्रिंग को परिभाषित करता है। |
| virtual [MinLength](../../aspose.page.xps.xpsmetadata/stringparameterinit/minlength/) { get; } | स्ट्रिंग मानों के लिए, सबसे छोटी अनुमत स्ट्रिंग को परिभाषित करता है। |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | तत्व का नाम प्राप्त करता है। |

### यह सभी देखें

* class [StringParameterInit](../stringparameterinit/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* नाम स्थान [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* सभा [Aspose.Page](../../)


