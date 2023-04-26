---
title: Class DocumentPageRanges
second_title: Aspose.Page voor .NET API-referentie
description: Aspose.Page.XPS.XpsMetadata.DocumentPageRanges klas. Beschrijft het uitvoerbereik van het document in paginas. De parameterwaarde moet voldoen aan de volgende structuur  PageRangeText PageRange of PageRangePageRange  PageRange PageNumber of PageNumberPageNumber  PageNumber 1 tot N waarbij N het aantal paginas in het document. Als PageNumber  N dan PageNumber  N. Witruimte in de tekenreeks moet worden genegeerd. https//docs.microsoft.com/enus/windows/win32/printdocs/documentpageranges
type: docs
weight: 780
url: /nl/net/aspose.page.xps.xpsmetadata/documentpageranges/
---
## DocumentPageRanges class

Beschrijft het uitvoerbereik van het document in pagina's. De parameterwaarde moet voldoen aan de volgende structuur: - PageRangeText: "PageRange" of "PageRange,PageRange" - PageRange: "PageNumber" of "PageNumber-PageNumber" - PageNumber: 1 tot N, waarbij N het aantal pagina's in het document. Als PageNumber &gt; N, dan PageNumber = N. Witruimte in de tekenreeks moet worden genegeerd. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges

```csharp
public sealed class DocumentPageRanges : StringParameterInit, IDocumentPrintTicketItem, 
    IJobPrintTicketItem
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [DocumentPageRanges](documentpageranges/)(string) | Maakt een nieuwe instantie aan. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| virtual [MaxLength](../../aspose.page.xps.xpsmetadata/stringparameterinit/maxlength/) { get; } | Definieert voor tekenreekswaarden de langste toegestane tekenreeks. |
| virtual [MinLength](../../aspose.page.xps.xpsmetadata/stringparameterinit/minlength/) { get; } | Definieert voor tekenreekswaarden de kortste toegestane tekenreeks. |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Krijgt de elementnaam. |

### Zie ook

* class [StringParameterInit](../stringparameterinit/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* naamruimte [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* montage [Aspose.Page](../../)


