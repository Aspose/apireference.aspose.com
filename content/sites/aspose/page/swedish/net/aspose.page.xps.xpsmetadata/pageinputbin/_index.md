---
title: Class PageInputBin
second_title: Aspose.Page för .NET API-referens
description: Aspose.Page.XPS.XpsMetadata.PageInputBin klass. Beskriver det installerade inmatningsfacket i en enhet eller hela listan över stödda fack för en enhet. Tillåter specifikation av inmatningsfacket per sida. DeJobInputBin DocumentInputBin och PageInputBin nyckelord utesluter varandra. Båda bör inte anges samtidigt i ett PrintTicket eller Print Capabilitiesdokument. https//docs.microsoft.com/enus/windows/win32/printdocs/pageinputbin
type: docs
weight: 2020
url: /sv/net/aspose.page.xps.xpsmetadata/pageinputbin/
---
## PageInputBin class

Beskriver det installerade inmatningsfacket i en enhet eller hela listan över stödda fack för en enhet. Tillåter specifikation av inmatningsfacket per sida. De[`JobInputBin`](../jobinputbin/) ,[`DocumentInputBin`](../documentinputbin/) och `PageInputBin` nyckelord utesluter varandra. Båda bör inte anges samtidigt i ett PrintTicket- eller Print Capabilities-dokument. https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin

```csharp
public sealed class PageInputBin : InputBin, IDocumentPrintTicketItem, IJobPrintTicketItem, 
    IPagePrintTicketItem
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [PageInputBin](pageinputbin/)(params IInputBinItem[]) | Skapar en ny instans. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Hämtar elementets namn. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Lägger till en lista med objekt i slutet av denna funktions objektlista. Var och en måste vara en[`Feature`](../feature/) , en[`Option`](../option/) eller a[`Property`](../property/) instans. |

### Se även

* class [InputBin](../inputbin/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* interface [IPagePrintTicketItem](../ipageprintticketitem/)
* namnutrymme [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* hopsättning [Aspose.Page](../../)


