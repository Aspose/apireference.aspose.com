---
title: Class DocumentPageRanges
second_title: Aspose.Page per riferimento all'API .NET
description: Aspose.Page.XPS.XpsMetadata.DocumentPageRanges classe. Descrive lintervallo di output del documento in pagine. Il valore del parametro deve essere conforme alla seguente struttura  PageRangeText PageRange o PageRangePageRange  PageRange PageNumber o PageNumberPageNumber  PageNumber da 1 a N dove N è il numero di pagine nel documento. Se PageNumber  N allora PageNumber  N. Gli spazi bianchi nella stringa devono essere ignorati. https//docs.microsoft.com/enus/windows/win32/printdocs/documentpageranges
type: docs
weight: 780
url: /it/net/aspose.page.xps.xpsmetadata/documentpageranges/
---
## DocumentPageRanges class

Descrive l'intervallo di output del documento in pagine. Il valore del parametro deve essere conforme alla seguente struttura: - PageRangeText: "PageRange" o "PageRange,PageRange" - PageRange: "PageNumber" o "PageNumber-PageNumber" - PageNumber: da 1 a N, dove N è il numero di pagine nel documento. Se PageNumber &gt; N, allora PageNumber = N. Gli spazi bianchi nella stringa devono essere ignorati. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges

```csharp
public sealed class DocumentPageRanges : StringParameterInit, IDocumentPrintTicketItem, 
    IJobPrintTicketItem
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [DocumentPageRanges](documentpageranges/)(string) | Crea una nuova istanza. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| virtual [MaxLength](../../aspose.page.xps.xpsmetadata/stringparameterinit/maxlength/) { get; } | Per i valori stringa, definisce la stringa più lunga consentita. |
| virtual [MinLength](../../aspose.page.xps.xpsmetadata/stringparameterinit/minlength/) { get; } | Per i valori stringa, definisce la stringa consentita più breve. |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Ottiene il nome dell'elemento. |

### Guarda anche

* class [StringParameterInit](../stringparameterinit/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* spazio dei nomi [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* assemblea [Aspose.Page](../../)


