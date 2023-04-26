---
title: Class DocumentPageRanges
second_title: Aspose.Page for .NET API Referansı
description: Aspose.Page.XPS.XpsMetadata.DocumentPageRanges sınıf. Belgenin çıktı aralığını sayfa olarak tanımlar. Parametre değeri şu yapıya uygun olmalıdır  PageRangeText PageRange veya PageRangePageRange  PageRange PageNumber veya PageNumberPageNumber  PageNumber 1 ila N burada N sayfa sayısıdır belgedeki sayfalar.SayfaNumarası  N ise SayfaNumarası  N. Dizedeki boşluk yoksayılmalıdır. https//docs.microsoft.com/enus/windows/win32/printdocs/documentpageranges
type: docs
weight: 780
url: /tr/net/aspose.page.xps.xpsmetadata/documentpageranges/
---
## DocumentPageRanges class

Belgenin çıktı aralığını sayfa olarak tanımlar. Parametre değeri şu yapıya uygun olmalıdır: - PageRangeText: "PageRange" veya "PageRange,PageRange" - PageRange: "PageNumber" veya "PageNumber-PageNumber" - PageNumber: 1 ila N, burada N, sayfa sayısıdır belgedeki sayfalar.SayfaNumarası &gt; N ise, SayfaNumarası = N. Dizedeki boşluk yoksayılmalıdır. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges

```csharp
public sealed class DocumentPageRanges : StringParameterInit, IDocumentPrintTicketItem, 
    IJobPrintTicketItem
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [DocumentPageRanges](documentpageranges/)(string) | Yeni bir örnek oluşturur. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| virtual [MaxLength](../../aspose.page.xps.xpsmetadata/stringparameterinit/maxlength/) { get; } | Dizi değerleri için izin verilen en uzun diziyi tanımlar. |
| virtual [MinLength](../../aspose.page.xps.xpsmetadata/stringparameterinit/minlength/) { get; } | Dizi değerleri için izin verilen en kısa diziyi tanımlar. |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Öğe adını alır. |

### Ayrıca bakınız

* class [StringParameterInit](../stringparameterinit/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* ad alanı [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* toplantı [Aspose.Page](../../)


