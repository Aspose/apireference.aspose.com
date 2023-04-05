---
title: Class PageInputBin
second_title: .NET API संदर्भ के लिए Aspose.Page
description: Aspose.Page.XPS.XpsMetadata.PageInputBin कक्ष. डवइस में स्थपत इनपुट बन य डवइस के लए समर्थत बन क पूर सूच क वर्णन करत है प्रत पृष्ठ के आधर पर इनपुट बन के वनर्देशन क अनुमत देत हैJobInputBin DocumentInputBin और PageInputBin कवर्ड परस्पर अनन्य हैं दनं क PrintTicket य Print Capabilities दस्तवेज़ में एक सथ नर्दष्ट नहं कय जन चहए https//docs.microsoft.com/enus/windows/win32/printdocs/pageinputbin
type: docs
weight: 2020
url: /hi/net/aspose.page.xps.xpsmetadata/pageinputbin/
---
## PageInputBin class

डिवाइस में स्थापित इनपुट बिन या डिवाइस के लिए समर्थित बिन की पूरी सूची का वर्णन करता है। प्रति पृष्ठ के आधार पर इनपुट बिन के विनिर्देशन की अनुमति देता है।[`JobInputBin`](../jobinputbin/) ,[`DocumentInputBin`](../documentinputbin/) और `PageInputBin` कीवर्ड परस्पर अनन्य हैं। दोनों को PrintTicket या Print Capabilities दस्तावेज़ में एक साथ निर्दिष्ट नहीं किया जाना चाहिए। https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin

```csharp
public sealed class PageInputBin : InputBin, IDocumentPrintTicketItem, IJobPrintTicketItem, 
    IPagePrintTicketItem
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [PageInputBin](pageinputbin/)(params IInputBinItem[]) | एक नया उदाहरण बनाता है। |

## गुण

| नाम | विवरण |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | तत्व का नाम प्राप्त करता है। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | इस सुविधा की आइटम सूची के अंत में आइटम की सूची जोड़ता है। प्रत्येक एक होना चाहिए[`Feature`](../feature/) , एक[`Option`](../option/) या ए[`Property`](../property/) उदाहरण. |

### यह सभी देखें

* class [InputBin](../inputbin/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* interface [IPagePrintTicketItem](../ipageprintticketitem/)
* नाम स्थान [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* सभा [Aspose.Page](../../)


