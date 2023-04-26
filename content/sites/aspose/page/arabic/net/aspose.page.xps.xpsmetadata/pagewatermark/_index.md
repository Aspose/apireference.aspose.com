---
title: Class PageWatermark
second_title: Aspose.Page لمرجع NET API
description: Aspose.Page.XPS.XpsMetadata.PageWatermark فصل. يصف إعداد العلامة المائية للإخراج وخصائص العلامة المائية. تنطبق العلامات المائية على الصفحة المنطقية  وليس على الصفحة الفعلية. على سبيل المثال  إذاDocumentDuplex ممكّن  ستظهر علامة مائية على كل منهما صفحة على كل ورقة. لوDocumentDuplex  2  سيكون لكل ورقة علامتين مائيتين . https//docs.microsoft.com/enus/windows/win32/printdocs/pagewatermark
type: docs
weight: 2650
url: /ar/net/aspose.page.xps.xpsmetadata/pagewatermark/
---
## PageWatermark class

يصف إعداد العلامة المائية للإخراج وخصائص العلامة المائية. تنطبق العلامات المائية على الصفحة المنطقية ، وليس على الصفحة الفعلية. على سبيل المثال ، إذا[`DocumentDuplex`](../documentduplex/) ممكّن ، ستظهر علامة مائية على كل منهما صفحة على كل ورقة. لو[`DocumentDuplex`](../documentduplex/) ، 2 ، سيكون لكل ورقة علامتين مائيتين . https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark

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

## المنشئون

| اسم | وصف |
| --- | --- |
| [PageWatermark](pagewatermark/)(params IPageWatermarkItem[]) | إنشاء مثيل جديد . |

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
| interface [IPageWatermarkItem](pagewatermark.ipagewatermarkitem/) | واجهة أي ملف`PageWatermark` عنصر الميزة. |
| interface [IPageWatermarkOptionItem](pagewatermark.ipagewatermarkoptionitem/) | واجهة أي ملف[`PageWatermarkOption`](../pagewatermark.pagewatermarkoption/) item. |
| class [Layering](pagewatermark.layering/) | يصف الداخلية ميزة. يحدد سلوك طبقات العلامة المائية. |
| class [LayeringOption](pagewatermark.layeringoption/) | يصف ملف[`Layering`](../pagewatermark.layering/) خيارات الميزة. |
| class [PageWatermarkOption](pagewatermark.pagewatermarkoption/) | يصف ملف`PageWatermark` خيارات الميزات. |

### أنظر أيضا

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* interface [IPagePrintTicketItem](../ipageprintticketitem/)
* مساحة الاسم [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* المجسم [Aspose.Page](../../)


