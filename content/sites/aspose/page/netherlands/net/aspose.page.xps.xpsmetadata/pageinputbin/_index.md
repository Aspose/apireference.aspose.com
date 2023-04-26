---
title: Class PageInputBin
second_title: Aspose.Page voor .NET API-referentie
description: Aspose.Page.XPS.XpsMetadata.PageInputBin klas. Beschrijft de geïnstalleerde invoerbak in een apparaat of de volledige lijst met ondersteunde bakken voor een apparaat. Maakt specificatie van de invoerbak per pagina mogelijk. DeJobInputBin DocumentInputBin and PageInputBin trefwoorden sluiten elkaar uit. Beide mogen niet tegelijkertijd worden opgegeven in een PrintTicket of Print Capabilitiesdocument. https//docs.microsoft.com/enus/windows/win32/printdocs/pageinputbin
type: docs
weight: 2030
url: /nl/net/aspose.page.xps.xpsmetadata/pageinputbin/
---
## PageInputBin class

Beschrijft de geïnstalleerde invoerbak in een apparaat of de volledige lijst met ondersteunde bakken voor een apparaat. Maakt specificatie van de invoerbak per pagina mogelijk. De[`JobInputBin`](../jobinputbin/) ,[`DocumentInputBin`](../documentinputbin/) and `PageInputBin` trefwoorden sluiten elkaar uit. Beide mogen niet tegelijkertijd worden opgegeven in een PrintTicket- of Print Capabilities-document. https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin

```csharp
public sealed class PageInputBin : InputBin, IDocumentPrintTicketItem, IJobPrintTicketItem, 
    IPagePrintTicketItem
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [PageInputBin](pageinputbin/)(params IInputBinItem[]) | Maakt een nieuwe instantie aan. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Krijgt de elementnaam. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Voegt een lijst met items toe aan het einde van de itemlijst van dit object. Elk moet een[`Feature`](../feature/) , een[`Option`](../option/) of een[`Property`](../property/) instantie. |

### Zie ook

* class [InputBin](../inputbin/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* interface [IPagePrintTicketItem](../ipageprintticketitem/)
* naamruimte [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* montage [Aspose.Page](../../)


