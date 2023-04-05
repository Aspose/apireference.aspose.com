---
title: Class PageOutputBin
second_title: Aspose.Page voor .NET API-referentie
description: Aspose.Page.XPS.XpsMetadata.PageOutputBin klas. Beschrijft de volledige lijst met ondersteunde bakken voor het apparaat. Maakt specificatie van de uitvoerbak per pagina mogelijk. DeJobOutputBin DocumentOutputBin EnPageOutputBin trefwoorden are sluiten elkaar uit er mag er slechts één worden opgegeven in een PrintTicket of Print Capabilitiesdocument. https//docs.microsoft.com/enus/windows/win32/printdocs/pageoutputbin
type: docs
weight: 2320
url: /nl/net/aspose.page.xps.xpsmetadata/pageoutputbin/
---
## PageOutputBin class

Beschrijft de volledige lijst met ondersteunde bakken voor het apparaat. Maakt specificatie van de uitvoerbak per pagina mogelijk. De[`JobOutputBin`](../joboutputbin/) ,[`DocumentOutputBin`](../documentoutputbin/) En`PageOutputBin` trefwoorden are sluiten elkaar uit, er mag er slechts één worden opgegeven in een PrintTicket- of Print Capabilities-document. https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin

```csharp
public sealed class PageOutputBin : OutputBin, IDocumentPrintTicketItem, IJobPrintTicketItem, 
    IPagePrintTicketItem
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [PageOutputBin](pageoutputbin/)(params IOutputBinItem[]) | Maakt een nieuwe instantie aan. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Krijgt de elementnaam. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Voegt een lijst met items toe aan het einde van de itemlijst van dit object. Elk moet een[`Feature`](../feature/) , een[`Option`](../option/) of een[`Property`](../property/) instantie. |

### Zie ook

* class [OutputBin](../outputbin/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* interface [IPagePrintTicketItem](../ipageprintticketitem/)
* naamruimte [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* montage [Aspose.Page](../../)


