---
title: Class JobPrimaryBannerSheet
second_title: .NET API संदर्भ के लिए Aspose.Page
description: Aspose.Page.XPS.XpsMetadata.JobPrimaryBannerSheet कक्ष. कर्य के लए आउटपुट हने के लए बैनर शट क वर्णन करत है बैनर शट क डफ़ल्ट पर आउटपुट हन चहएPageMediaSize और डफ़ल्ट क उपयग करनPageMediaType . बैनर शट क शेष कर्य से अलग कय जन चहए इसक मतलब है क कई भ फनशंग य प्रसेसंग वकल्प जैसे JobDuplexAllDocumentsContiguously JobStapleAllDocuments  यJobBindAllDocuments  में बैनर शट शमल नहं हन चहए बैनर शट जब क पहल शट के रूप में हन चहए
type: docs
weight: 1470
url: /hi/net/aspose.page.xps.xpsmetadata/jobprimarybannersheet/
---
## JobPrimaryBannerSheet class

कार्य के लिए आउटपुट होने के लिए बैनर शीट का वर्णन करता है। बैनर शीट को डिफ़ॉल्ट पर आउटपुट होना चाहिए[`PageMediaSize`](../pagemediasize/) और डिफ़ॉल्ट का उपयोग करना[`PageMediaType`](../pagemediatype/) . बैनर शीट को शेष कार्य से अलग किया जाना चाहिए। इसका मतलब है कि कोई भी फिनिशिंग या प्रोसेसिंग विकल्प (जैसे [`JobDuplexAllDocumentsContiguously`](../jobduplexalldocumentscontiguously/) ,[`JobStapleAllDocuments`](../jobstaplealldocuments/) , या[`JobBindAllDocuments`](../jobbindalldocuments/) ) में बैनर शीट शामिल नहीं होनी चाहिए। बैनर शीट जॉब की पहली शीट के रूप में होनी चाहिए।

```csharp
public sealed class JobPrimaryBannerSheet : Feature, IJobPrintTicketItem
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [JobPrimaryBannerSheet](jobprimarybannersheet/)(params BannerSheetOption[]) | एक नया उदाहरण बनाता है। |

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
| class [BannerSheetOption](jobprimarybannersheet.bannersheetoption/) | के विकल्पों का प्रतिनिधित्व करता है`JobPrimaryBannerSheet` सुविधा. |

### यह सभी देखें

* class [Feature](../feature/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* नाम स्थान [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* सभा [Aspose.Page](../../)


