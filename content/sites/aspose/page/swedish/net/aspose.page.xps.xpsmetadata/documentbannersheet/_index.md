---
title: Class DocumentBannerSheet
second_title: Aspose.Page för .NET API-referens
description: Aspose.Page.XPS.XpsMetadata.DocumentBannerSheet klass. Beskriver bannerarket som ska matas ut för ett visst dokument. Bannerbladet ska matas ut på default PageMediaSize och använder standardPageMediaType . Bannerarket bör också isoleras från resten av jobbet. Detta innebär att eventuella efterbehandlings eller bearbetningsalternativ som DocumentDuplex DocumentStaple  ellerDocumentBinding ska inte inkludera bannerbladet. Bannerarket kan eller kanske inte är isolerat från resten av jobbet. Detta betyder att alla efterbehandlings eller bearbetningsalternativ för jobb kan inkludera dokumentbannerbladet. Bannerarket bör förekomma som det första arket i dokumentet. https //docs.microsoft.com/enus/windows/win32/printdocs/documentbannersheet
type: docs
weight: 530
url: /sv/net/aspose.page.xps.xpsmetadata/documentbannersheet/
---
## DocumentBannerSheet class

Beskriver bannerarket som ska matas ut för ett visst dokument. Bannerbladet ska matas ut på default [`PageMediaSize`](../pagemediasize/) och använder standard[`PageMediaType`](../pagemediatype/) . Bannerarket bör också isoleras från resten av jobbet. Detta innebär att eventuella efterbehandlings- eller bearbetningsalternativ (som [`DocumentDuplex`](../documentduplex/) ,[`DocumentStaple`](../documentstaple/) , eller[`DocumentBinding`](../documentbinding/)) ska inte inkludera bannerbladet. Bannerarket kan eller kanske inte är isolerat från resten av jobbet. Detta betyder att alla efterbehandlings- eller bearbetningsalternativ för jobb kan inkludera dokumentbannerbladet. Bannerarket bör förekomma som det första arket i dokumentet. https ://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet

```csharp
public sealed class DocumentBannerSheet : Feature, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [DocumentBannerSheet](documentbannersheet/)(params BannerSheetOption[]) | Skapar en ny instans. |

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
| class [BannerSheetOption](documentbannersheet.bannersheetoption/) | Representerar alternativ för`DocumentBannerSheet` feature. |

### Se även

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* namnutrymme [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* hopsättning [Aspose.Page](../../)


