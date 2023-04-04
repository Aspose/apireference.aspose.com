---
title: Class DocumentPageRanges
second_title: Aspose.Page لمرجع NET API
description: Aspose.Page.XPS.XpsMetadata.DocumentPageRanges فصل. يصف نطاق مخرجات الوثيقة بالصفحات. يجب أن تتوافق قيمة المعلمة مع البنية التالية  PageRangeText PageRange أو PageRange PageRange  PageRange PageNumber أو PageNumberPageNumber  PageNumber 1 to N  حيث N هو رقم الصفحات في المستند. إذا كان رقم الصفحة N  فيجب تجاهل PageNumber  N. المسافة البيضاء في السلسلة . https//docs.microsoft.com/enus/windows/win32/printdocs/documentpageranges
type: docs
weight: 770
url: /ar/net/aspose.page.xps.xpsmetadata/documentpageranges/
---
## DocumentPageRanges class

يصف نطاق مخرجات الوثيقة بالصفحات. يجب أن تتوافق قيمة المعلمة مع البنية التالية: - PageRangeText: "PageRange" أو "PageRange، PageRange" - PageRange: "PageNumber" أو "PageNumber-PageNumber" - PageNumber: 1 to N ، حيث N هو رقم الصفحات في المستند. إذا كان رقم الصفحة&gt; N ، فيجب تجاهل PageNumber = N. المسافة البيضاء في السلسلة . https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges

```csharp
public sealed class DocumentPageRanges : StringParameterInit, IDocumentPrintTicketItem, 
    IJobPrintTicketItem
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [DocumentPageRanges](documentpageranges/)(string) | إنشاء مثيل جديد . |

## الخصائص

| اسم | وصف |
| --- | --- |
| virtual [MaxLength](../../aspose.page.xps.xpsmetadata/stringparameterinit/maxlength/) { get; } | لقيم السلسلة ، تحدد أطول سلسلة مسموح بها. |
| virtual [MinLength](../../aspose.page.xps.xpsmetadata/stringparameterinit/minlength/) { get; } | لقيم السلسلة ، تحدد أقصر سلسلة مسموح بها. |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | يحصل على اسم العنصر. |

### أنظر أيضا

* class [StringParameterInit](../stringparameterinit/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* مساحة الاسم [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* المجسم [Aspose.Page](../../)


