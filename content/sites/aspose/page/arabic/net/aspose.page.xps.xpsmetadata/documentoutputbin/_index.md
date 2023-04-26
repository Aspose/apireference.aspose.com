---
title: Class DocumentOutputBin
second_title: Aspose.Page لمرجع NET API
description: Aspose.Page.XPS.XpsMetadata.DocumentOutputBin فصل. يصف القائمة الكاملة للحاويات المدعومة للجهاز. يسمح بمواصفات output bin على أساس كل مستند. الJobOutputBin وDocumentOutputBin و PageOutputBin الكلمات الرئيسية هي حصرية بشكل متبادل  يجب تحديد واحدة فقط في وثيقة PrintTicket أو Print Capabilities . https//docs.microsoft.com/enus/windows/win32/printdocs/documentoutputbin
type: docs
weight: 770
url: /ar/net/aspose.page.xps.xpsmetadata/documentoutputbin/
---
## DocumentOutputBin class

يصف القائمة الكاملة للحاويات المدعومة للجهاز. يسمح بمواصفات output bin على أساس كل مستند. ال[`JobOutputBin`](../joboutputbin/) و`DocumentOutputBin` و [`PageOutputBin`](../pageoutputbin/) الكلمات الرئيسية هي حصرية بشكل متبادل ، يجب تحديد واحدة فقط في وثيقة PrintTicket أو Print Capabilities . https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin

```csharp
public sealed class DocumentOutputBin : OutputBin, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [DocumentOutputBin](documentoutputbin/)(params IOutputBinItem[]) | إنشاء مثيل جديد . |

## الخصائص

| اسم | وصف |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | يحصل على اسم العنصر. |

## طُرق

| اسم | وصف |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | إضافة قائمة بالعناصر إلى نهاية قائمة عناصر هذه الميزة. يجب أن يكون كل ملف[`Feature`](../feature/) ، و[`Option`](../option/) أو أ[`Property`](../property/) المثال. |

### أنظر أيضا

* class [OutputBin](../outputbin/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* مساحة الاسم [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* المجسم [Aspose.Page](../../)


