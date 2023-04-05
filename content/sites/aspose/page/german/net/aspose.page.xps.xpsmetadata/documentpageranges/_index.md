---
title: Class DocumentPageRanges
second_title: Aspose.Page für .NET-API-Referenz
description: Aspose.Page.XPS.XpsMetadata.DocumentPageRanges klas. Beschreibt den Ausgabeumfang des Dokuments in Seiten. Der Parameterwert muss der folgenden Struktur entsprechen  PageRangeText PageRange oder PageRangePageRange  PageRange PageNumber oder PageNumberPageNumber  PageNumber 1 bis N wobei N die Nummer von ist Seiten im Dokument. Wenn PageNumber  N dann PageNumber  N. Leerzeichen in der Zeichenfolge sollten ignoriert werden. https//docs.microsoft.com/enus/windows/win32/printdocs/documentpageranges
type: docs
weight: 770
url: /de/net/aspose.page.xps.xpsmetadata/documentpageranges/
---
## DocumentPageRanges class

Beschreibt den Ausgabeumfang des Dokuments in Seiten. Der Parameterwert muss der folgenden Struktur entsprechen: - PageRangeText: "PageRange" oder "PageRange,PageRange" - PageRange: "PageNumber" oder "PageNumber-PageNumber" - PageNumber: 1 bis N, wobei N die Nummer von ist Seiten im Dokument. Wenn PageNumber &gt; N, dann PageNumber = N. Leerzeichen in der Zeichenfolge sollten ignoriert werden. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges

```csharp
public sealed class DocumentPageRanges : StringParameterInit, IDocumentPrintTicketItem, 
    IJobPrintTicketItem
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [DocumentPageRanges](documentpageranges/)(string) | Erstellt eine neue Instanz. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| virtual [MaxLength](../../aspose.page.xps.xpsmetadata/stringparameterinit/maxlength/) { get; } | Definiert für Zeichenfolgenwerte die längste zulässige Zeichenfolge. |
| virtual [MinLength](../../aspose.page.xps.xpsmetadata/stringparameterinit/minlength/) { get; } | Definiert für Zeichenfolgenwerte die kürzeste zulässige Zeichenfolge. |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Ruft den Elementnamen ab. |

### Siehe auch

* class [StringParameterInit](../stringparameterinit/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* namensraum [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* Montage [Aspose.Page](../../)


