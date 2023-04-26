---
title: Class DocumentBannerSheet
second_title: Aspose.Page لمرجع NET API
description: Aspose.Page.XPS.XpsMetadata.DocumentBannerSheet فصل. يصف ورقة الشعارات ليتم إخراجها لمستند معين. يجب إخراج ورقة الشعار على default PageMediaSize واستخدام الافتراضيPageMediaType . يجب أيضًا عزل ورقة البانر عن باقي الوظيفة. هذا يعني أن أي خيارات إنهاء أو معالجة مثل DocumentDuplex وDocumentStaple  أوDocumentBinding يجب ألا تتضمن ورقة الشعار. قد يتم عزل ورقة الشعارات عن باقي المهمة أو قد لا يتم عزلها. وهذا يعني أن أي وظيفة إنهاء أو خيارات معالجة قد تتضمن ورقة شعار المستند.  //docs.microsoft.com/enus/windows/win32/printdocs/documentbannersheet
type: docs
weight: 540
url: /ar/net/aspose.page.xps.xpsmetadata/documentbannersheet/
---
## DocumentBannerSheet class

يصف ورقة الشعارات ليتم إخراجها لمستند معين. يجب إخراج ورقة الشعار على default [`PageMediaSize`](../pagemediasize/) واستخدام الافتراضي[`PageMediaType`](../pagemediatype/) . يجب أيضًا عزل ورقة البانر عن باقي الوظيفة. هذا يعني أن أي خيارات إنهاء أو معالجة (مثل [`DocumentDuplex`](../documentduplex/) و[`DocumentStaple`](../documentstaple/) ، أو[`DocumentBinding`](../documentbinding/) يجب ألا تتضمن ورقة الشعار. قد يتم عزل ورقة الشعارات عن باقي المهمة أو قد لا يتم عزلها. وهذا يعني أن أي وظيفة إنهاء أو خيارات معالجة قد تتضمن ورقة شعار المستند. : //docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet

```csharp
public sealed class DocumentBannerSheet : Feature, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [DocumentBannerSheet](documentbannersheet/)(params BannerSheetOption[]) | إنشاء مثيل جديد . |

## الخصائص

| اسم | وصف |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | يحصل على اسم العنصر. |

## طُرق

| اسم | وصف |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | إضافة قائمة بالعناصر إلى نهاية قائمة عناصر هذه الميزة. يجب أن يكون كل ملف[`Feature`](../feature/) ، و[`Option`](../option/) أو أ[`Property`](../property/) المثال. |

## أعضاء آخرون

| اسم | وصف |
| --- | --- |
| class [BannerSheetOption](documentbannersheet.bannersheetoption/) | يمثل خيارات`DocumentBannerSheet` ميزة . |

### أنظر أيضا

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* مساحة الاسم [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* المجسم [Aspose.Page](../../)


