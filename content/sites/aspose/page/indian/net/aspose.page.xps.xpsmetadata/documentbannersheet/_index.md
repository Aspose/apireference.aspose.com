---
title: Class DocumentBannerSheet
second_title: .NET API संदर्भ के लिए Aspose.Page
description: Aspose.Page.XPS.XpsMetadata.DocumentBannerSheet कक्ष. कस वशेष दस्तवेज़ के आउटपुट के लए बैनर शट क वर्णन करत है बैनर शट क डफ़ल्ट पर आउटपुट हन चहएPageMediaSize और डफ़ल्ट क उपयग करनPageMediaType . बैनर शट क भ शेष कर्य से अलग कय जन चहए इसक मतलब है क कई भ फनशंग य प्रसेसंग वकल्प जैसे DocumentDuplex DocumentStaple  यDocumentBinding में बैनर शट शमल नहं हन चहए बैनर शट शेष नकर से अलग ह सकत है य नहं भ ह सकत है इसक मतलब है क कस भ नकर क पूर करने य प्रसंस्करण के वकल्प में दस्तवेज़ बैनर शट शमल ह सकत है बैनर शट दस्तवेज़ क पहल शट के रूप में हन चहए https //docs.microsoft.com/enus/windows/win32/printdocs/documentbannersheet
type: docs
weight: 530
url: /hi/net/aspose.page.xps.xpsmetadata/documentbannersheet/
---
## DocumentBannerSheet class

किसी विशेष दस्तावेज़ के आउटपुट के लिए बैनर शीट का वर्णन करता है। बैनर शीट को डिफ़ॉल्ट पर आउटपुट होना चाहिए[`PageMediaSize`](../pagemediasize/) और डिफ़ॉल्ट का उपयोग करना[`PageMediaType`](../pagemediatype/) . बैनर शीट को भी शेष कार्य से अलग किया जाना चाहिए। इसका मतलब है कि कोई भी फिनिशिंग या प्रोसेसिंग विकल्प (जैसे [`DocumentDuplex`](../documentduplex/) ,[`DocumentStaple`](../documentstaple/) , या[`DocumentBinding`](../documentbinding/)) में बैनर शीट शामिल नहीं होनी चाहिए। बैनर शीट शेष नौकरी से अलग हो सकती है या नहीं भी हो सकती है। इसका मतलब है कि किसी भी नौकरी को पूरा करने या प्रसंस्करण के विकल्प में दस्तावेज़ बैनर शीट शामिल हो सकती है। बैनर शीट दस्तावेज़ की पहली शीट के रूप में होनी चाहिए। https ://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet

```csharp
public sealed class DocumentBannerSheet : Feature, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [DocumentBannerSheet](documentbannersheet/)(params BannerSheetOption[]) | एक नया उदाहरण बनाता है। |

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
| class [BannerSheetOption](documentbannersheet.bannersheetoption/) | के विकल्पों का प्रतिनिधित्व करता है`DocumentBannerSheet` सुविधा. |

### यह सभी देखें

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* नाम स्थान [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* सभा [Aspose.Page](../../)


