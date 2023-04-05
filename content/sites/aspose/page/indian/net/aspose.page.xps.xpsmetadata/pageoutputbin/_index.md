---
title: Class PageOutputBin
second_title: .NET API संदर्भ के लिए Aspose.Page
description: Aspose.Page.XPS.XpsMetadata.PageOutputBin कक्ष. डवइस के लए समर्थत डब्बे क पूर सूच क वर्णन करत है प्रत पृष्ठ आधर पर आउटपुट बन के वनर्देशन क अनुमत देत है. TheJobOutputBin DocumentOutputBin औरPageOutputBin कवर्ड are परस्परक रूप से अनन्य केवल एक PrintTicket य Print Capabilities दस्तवेज़ में नर्दष्ट कय जन चहए https//docs.microsoft.com/enus/windows/win32/printdocs/pageoutputbin
type: docs
weight: 2320
url: /hi/net/aspose.page.xps.xpsmetadata/pageoutputbin/
---
## PageOutputBin class

डिवाइस के लिए समर्थित डिब्बे की पूरी सूची का वर्णन करता है। प्रति पृष्ठ आधार पर आउटपुट बिन के विनिर्देशन की अनुमति देता है. The[`JobOutputBin`](../joboutputbin/) ,[`DocumentOutputBin`](../documentoutputbin/) और`PageOutputBin` कीवर्ड are पारस्परिक रूप से अनन्य केवल एक PrintTicket या Print Capabilities दस्तावेज़ में निर्दिष्ट किया जाना चाहिए। https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin

```csharp
public sealed class PageOutputBin : OutputBin, IDocumentPrintTicketItem, IJobPrintTicketItem, 
    IPagePrintTicketItem
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [PageOutputBin](pageoutputbin/)(params IOutputBinItem[]) | एक नया उदाहरण बनाता है। |

## गुण

| नाम | विवरण |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | तत्व का नाम प्राप्त करता है। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | इस सुविधा की आइटम सूची के अंत में आइटम की सूची जोड़ता है। प्रत्येक एक होना चाहिए[`Feature`](../feature/) , एक[`Option`](../option/) या ए[`Property`](../property/) उदाहरण. |

### यह सभी देखें

* class [OutputBin](../outputbin/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* interface [IPagePrintTicketItem](../ipageprintticketitem/)
* नाम स्थान [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* सभा [Aspose.Page](../../)


