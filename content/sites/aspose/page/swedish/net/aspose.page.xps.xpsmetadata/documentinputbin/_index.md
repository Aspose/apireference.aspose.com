---
title: Class DocumentInputBin
second_title: Aspose.Page för .NET API-referens
description: Aspose.Page.XPS.XpsMetadata.DocumentInputBin klass. Beskriver det installerade inmatningsfacket i en enhet eller hela listan över stödda lager för en enhet. JobInputBin DocumentInputBin  ochPageInputBin nyckelord utesluter varandra. Båda bör inte anges samtidigt i ett PrintTicket eller Print Capabilitiesdokument. https//docs.microsoft.com/enus/windows/win32/printdocs/documentinputbin
type: docs
weight: 740
url: /sv/net/aspose.page.xps.xpsmetadata/documentinputbin/
---
## DocumentInputBin class

Beskriver det installerade inmatningsfacket i en enhet eller hela listan över stödda lager för en enhet. [`JobInputBin`](../jobinputbin/) ,`DocumentInputBin` , och[`PageInputBin`](../pageinputbin/) nyckelord utesluter varandra. Båda bör inte anges samtidigt i ett PrintTicket eller Print Capabilities-dokument. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin

```csharp
public sealed class DocumentInputBin : InputBin, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [DocumentInputBin](documentinputbin/)(params IInputBinItem[]) | Skapar en ny instans. |

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
* namnutrymme [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* hopsättning [Aspose.Page](../../)


