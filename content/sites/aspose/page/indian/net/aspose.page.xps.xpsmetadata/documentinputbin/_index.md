---
title: Class DocumentInputBin
second_title: .NET API संदर्भ के लिए Aspose.Page
description: Aspose.Page.XPS.XpsMetadata.DocumentInputBin कक्ष. डवइस में स्थपत इनपुट बन य डवइस के लए समर्थत बन क पूर सूच क वर्णन करत है JobInputBin DocumentInputBin  औरPageInputBin कवर्ड परस्पर अनन्य हैं दनं क PrintTicket य Print Capabilities दस्तवेज़ में एक सथ नर्दष्ट नहं कय जन चहए https//docs.microsoft.com/enus/windows/win32/printdocs/documentinputbin
type: docs
weight: 730
url: /hi/net/aspose.page.xps.xpsmetadata/documentinputbin/
---
## DocumentInputBin class

डिवाइस में स्थापित इनपुट बिन या डिवाइस के लिए समर्थित बिन की पूरी सूची का वर्णन करता है। [`JobInputBin`](../jobinputbin/) ,`DocumentInputBin` , और[`PageInputBin`](../pageinputbin/) कीवर्ड परस्पर अनन्य हैं। दोनों को PrintTicket या Print Capabilities दस्तावेज़ में एक साथ निर्दिष्ट नहीं किया जाना चाहिए। https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin

```csharp
public sealed class DocumentInputBin : InputBin, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [DocumentInputBin](documentinputbin/)(params IInputBinItem[]) | एक नया उदाहरण बनाता है। |

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
* नाम स्थान [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* सभा [Aspose.Page](../../)


