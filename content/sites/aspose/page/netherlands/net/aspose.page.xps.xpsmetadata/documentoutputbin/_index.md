---
title: Class DocumentOutputBin
second_title: Aspose.Page voor .NET API-referentie
description: Aspose.Page.XPS.XpsMetadata.DocumentOutputBin klas. Beschrijft de volledige lijst met ondersteunde bakken voor het apparaat. Staat specificatie toe van output bin per document. DeJobOutputBin DocumentOutputBin and PageOutputBin trefwoorden sluiten elkaar uit er moet er één worden opgegeven in een PrintTicket of Print Capabilitiesdocument. https//docs.microsoft.com/enus/windows/win32/printdocs/documentoutputbin
type: docs
weight: 770
url: /nl/net/aspose.page.xps.xpsmetadata/documentoutputbin/
---
## DocumentOutputBin class

Beschrijft de volledige lijst met ondersteunde bakken voor het apparaat. Staat specificatie toe van output bin per document. De[`JobOutputBin`](../joboutputbin/) ,`DocumentOutputBin` and [`PageOutputBin`](../pageoutputbin/) trefwoorden sluiten elkaar uit, er moet er één worden opgegeven in een PrintTicket- of Print Capabilities-document. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin

```csharp
public sealed class DocumentOutputBin : OutputBin, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [DocumentOutputBin](documentoutputbin/)(params IOutputBinItem[]) | Maakt een nieuwe instantie aan. |

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
* naamruimte [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* montage [Aspose.Page](../../)


