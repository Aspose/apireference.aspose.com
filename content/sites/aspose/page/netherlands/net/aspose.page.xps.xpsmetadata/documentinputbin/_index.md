---
title: Class DocumentInputBin
second_title: Aspose.Page voor .NET API-referentie
description: Aspose.Page.XPS.XpsMetadata.DocumentInputBin klas. Beschrijft de geïnstalleerde invoerbak in een apparaat of de volledige lijst met ondersteunde bakken voor een apparaat. DeJobInputBin DocumentInputBin  EnPageInputBin zoekwoorden sluiten elkaar uit. Beide mogen niet tegelijkertijd worden opgegeven in een PrintTicket  of Print Capabilitiesdocument. https//docs.microsoft.com/enus/windows/win32/printdocs/documentinputbin
type: docs
weight: 740
url: /nl/net/aspose.page.xps.xpsmetadata/documentinputbin/
---
## DocumentInputBin class

Beschrijft de geïnstalleerde invoerbak in een apparaat of de volledige lijst met ondersteunde bakken voor een apparaat. De[`JobInputBin`](../jobinputbin/) ,`DocumentInputBin` , En[`PageInputBin`](../pageinputbin/) zoekwoorden sluiten elkaar uit. Beide mogen niet tegelijkertijd worden opgegeven in een PrintTicket - of Print Capabilities-document. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin

```csharp
public sealed class DocumentInputBin : InputBin, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [DocumentInputBin](documentinputbin/)(params IInputBinItem[]) | Maakt een nieuwe instantie aan. |

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
* naamruimte [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* montage [Aspose.Page](../../)


