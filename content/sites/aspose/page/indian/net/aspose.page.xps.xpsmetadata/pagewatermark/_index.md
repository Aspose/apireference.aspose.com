---
title: Class PageWatermark
second_title: .NET API संदर्भ के लिए Aspose.Page
description: Aspose.Page.XPS.XpsMetadata.PageWatermark कक्ष. आउटपुट क वटरमर्क सेटंग और वटरमर्क वशेषतओं क वर्णन करत है वटरमर्क तर्कक पृष्ठ पर लगू  भतक पृष्ठ पर नहं उदहरण के लए यदDocumentDuplex सक्षम है प्रत्येक पर एक वटरमर्क दखई देग प्रत्येक शट पर पेज अगरDocumentDuplex  2 त प्रत्येक शट में 2 वटरमर्क हंगे https//docs.microsoft.com/enus/windows/win32/printdocs/pagewatermark
type: docs
weight: 2640
url: /hi/net/aspose.page.xps.xpsmetadata/pagewatermark/
---
## PageWatermark class

आउटपुट की वॉटरमार्क सेटिंग और वॉटरमार्क विशेषताओं का वर्णन करता है। वॉटरमार्क तार्किक पृष्ठ पर लागू , भौतिक पृष्ठ पर नहीं। उदाहरण के लिए, यदि[`DocumentDuplex`](../documentduplex/) सक्षम है, प्रत्येक पर एक वॉटरमार्क दिखाई देगा प्रत्येक शीट पर पेज। अगर[`DocumentDuplex`](../documentduplex/) , =2, तो प्रत्येक शीट में 2 वॉटरमार्क होंगे। https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark

```csharp
NUp
```

```csharp
PagesPerSheet
```

```csharp
public sealed class PageWatermark : Feature, IDocumentPrintTicketItem, IJobPrintTicketItem, 
    IPagePrintTicketItem
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [PageWatermark](pagewatermark/)(params IPageWatermarkItem[]) | एक नया उदाहरण बनाता है। |

## गुण

| नाम | विवरण |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | तत्व का नाम प्राप्त करता है। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | इस सुविधा की आइटम सूची के अंत में आइटम की सूची जोड़ता है। प्रत्येक एक होना चाहिए[`Feature`](../feature/) , एक[`Option`](../option/) या ए[`Property`](../property/) उदाहरण. |

## अन्य सदस्य

| नाम | विवरण |
| --- | --- |
| interface [IPageWatermarkItem](pagewatermark.ipagewatermarkitem/) | किसी का इंटरफ़ेस`PageWatermark` फीचर आइटम. |
| interface [IPageWatermarkOptionItem](pagewatermark.ipagewatermarkoptionitem/) | किसी का इंटरफ़ेस[`PageWatermarkOption`](../pagewatermark.pagewatermarkoption/) मद. |
| class [Layering](pagewatermark.layering/) | आंतरिक वर्णन करता है विशेषता। वॉटरमार्क के लेयरिंग व्यवहार को परिभाषित करता है। |
| class [LayeringOption](pagewatermark.layeringoption/) | का वर्णन करता है[`Layering`](../pagewatermark.layering/) सुविधा विकल्प. |
| class [PageWatermarkOption](pagewatermark.pagewatermarkoption/) | का वर्णन करता है`PageWatermark` सुविधाएँ विकल्प. |

### यह सभी देखें

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* interface [IPagePrintTicketItem](../ipageprintticketitem/)
* नाम स्थान [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* सभा [Aspose.Page](../../)


