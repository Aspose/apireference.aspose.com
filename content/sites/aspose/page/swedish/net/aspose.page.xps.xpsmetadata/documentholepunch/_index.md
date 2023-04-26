---
title: Class DocumentHolePunch
second_title: Aspose.Page för .NET API-referens
description: Aspose.Page.XPS.XpsMetadata.DocumentHolePunch klass. Beskriver håltagningsegenskaperna för utgången. Varje dokument stansas separat. DenJobHolePunch ochDocumentHolePunch nyckelord utesluter varandra. Båda bör inte anges samtidigt i ett PrintTicket eller Print Capabilitiesdokument. https//docs.microsoft.com/enus/windows/win32/printdocs/documentholepunch
type: docs
weight: 710
url: /sv/net/aspose.page.xps.xpsmetadata/documentholepunch/
---
## DocumentHolePunch class

Beskriver håltagningsegenskaperna för utgången. Varje dokument stansas separat. Den[`JobHolePunch`](../jobholepunch/) och`DocumentHolePunch` nyckelord utesluter varandra. Båda bör inte anges samtidigt i ett PrintTicket- eller Print Capabilities-dokument. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentholepunch

```csharp
public sealed class DocumentHolePunch : HolePunch, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [DocumentHolePunch](documentholepunch/)(params HolePunchOption[]) | Skapar en ny instans. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Hämtar elementets namn. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Lägger till en lista med objekt i slutet av denna funktions objektlista. Var och en måste vara en[`Feature`](../feature/) , en[`Option`](../option/) eller a[`Property`](../property/) instans. |

### Se även

* class [HolePunch](../holepunch/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* namnutrymme [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* hopsättning [Aspose.Page](../../)


