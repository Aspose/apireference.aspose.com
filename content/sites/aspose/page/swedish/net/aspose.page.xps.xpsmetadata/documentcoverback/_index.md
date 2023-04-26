---
title: Class DocumentCoverBack
second_title: Aspose.Page för .NET API-referens
description: Aspose.Page.XPS.XpsMetadata.DocumentCoverBack klass. Beskriver det bakre avslutande försättsbladet. Varje dokument kommer att ha ett separat ark. Försättsbladet ska skrivas ut påPageMediaSize ochPageMediaType används för den sista sidan av dokumentet. Försättsbladet bör integreras i processing options som t.exDocumentDuplex DocumentNUp  som anges av det angivna alternativet. https//docs.microsoft.com/enus/windows/win32/printdocs/documentcoverback
type: docs
weight: 640
url: /sv/net/aspose.page.xps.xpsmetadata/documentcoverback/
---
## DocumentCoverBack class

Beskriver det bakre (avslutande) försättsbladet. Varje dokument kommer att ha ett separat ark. Försättsbladet ska skrivas ut på[`PageMediaSize`](../pagemediasize/) och[`PageMediaType`](../pagemediatype/) används för den sista sidan av dokumentet. Försättsbladet bör integreras i processing options (som t.ex[`DocumentDuplex`](../documentduplex/) ,[`DocumentNUp`](../documentnup/) ) som anges av det angivna alternativet. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverback

```csharp
public sealed class DocumentCoverBack : Feature, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [DocumentCoverBack](documentcoverback/)(params CoverBackOption[]) | Skapar en ny instans. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Hämtar elementets namn. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Lägger till en lista med objekt i slutet av denna funktions objektlista. Var och en måste vara en[`Feature`](../feature/) , en[`Option`](../option/) eller a[`Property`](../property/) instans. |

## Andra medlemmar

| namn | Beskrivning |
| --- | --- |
| class [CoverBackOption](documentcoverback.coverbackoption/) | Beskriver`DocumentCoverBack` funktionsalternativ. |

### Se även

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* namnutrymme [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* hopsättning [Aspose.Page](../../)


