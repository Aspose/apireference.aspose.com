---
title: Class JobErrorSheet
second_title: .NET API संदर्भ के लिए Aspose.Page
description: Aspose.Page.XPS.XpsMetadata.JobErrorSheet कक्ष. एरर शट आउटपुट क वर्णन करत है पूरे जब में एक संगल एरर शट हग त्रुट पत्र डफ़ल्ट पर आउटपुट हन चहएPageMediaSize और डफ़ल्ट क उपयग करनPageMediaType . त्रुट पत्रक क शेष कर्य से अलग कय जन चहए इसक मतलब है क कई भ फनशंग or प्रसेसंग वकल्प जैसे   य  में त्रुट पत्र शमल नहं हन चहए त्रुट पत्रक कर्य क अंतम पत्रक के रूप में हन चहए https//docs.microsoft.com/enus/windows/win32/printdocs/joberrorsheet
type: docs
weight: 1290
url: /hi/net/aspose.page.xps.xpsmetadata/joberrorsheet/
---
## JobErrorSheet class

एरर शीट आउटपुट का वर्णन करता है। पूरे जॉब में एक सिंगल एरर शीट होगी। त्रुटि पत्र डिफ़ॉल्ट पर आउटपुट होना चाहिए[`PageMediaSize`](../pagemediasize/) और डिफ़ॉल्ट का उपयोग करना[`PageMediaType`](../pagemediatype/) . त्रुटि पत्रक को शेष कार्य से अलग किया जाना चाहिए। इसका मतलब है कि कोई भी फिनिशिंग or प्रोसेसिंग विकल्प (जैसे , , या ) में त्रुटि पत्र शामिल नहीं होना चाहिए। त्रुटि पत्रक कार्य की अंतिम पत्रक के रूप में होना चाहिए। https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet

```csharp
JobDuplex
```

```csharp
JobStaple
```

```csharp
JobBinding
```

```csharp
public sealed class JobErrorSheet : Feature, IJobPrintTicketItem
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [JobErrorSheet](joberrorsheet/)(params IJobErrorSheetItem[]) | एक नया उदाहरण बनाता है। |

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
| class [ErrorSheetOption](joberrorsheet.errorsheetoption/) | का वर्णन करता है`JobErrorSheet` सुविधा विकल्प. |
| class [ErrorSheetWhen](joberrorsheet.errorsheetwhen/) | आंतरिक वर्णन करता है सुविधा. |
| interface [IJobErrorSheetItem](joberrorsheet.ijoberrorsheetitem/) | किसी का इंटरफ़ेस`JobErrorSheet` फीचर आइटम. |

### यह सभी देखें

* class [Feature](../feature/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* नाम स्थान [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* सभा [Aspose.Page](../../)


