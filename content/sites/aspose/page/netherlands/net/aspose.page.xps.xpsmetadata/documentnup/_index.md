---
title: Class DocumentNUp
second_title: Aspose.Page voor .NET API-referentie
description: Aspose.Page.XPS.XpsMetadata.DocumentNUp klas. Beschrijft de uitvoer en indeling van meerdere logische paginas op één enkel fysiek blad. Elk document wordt afzonderlijk samengesteld. EnJobNUpAllDocumentsContiguously sluiten elkaar wederzijds uit. Het is aan het stuurprogramma om de beperkingsafhandeling tussen deze sleutelwoorden te bepalen. https//docs.microsoft.com/enus/windows/win32/printdocs/documentnup
type: docs
weight: 740
url: /nl/net/aspose.page.xps.xpsmetadata/documentnup/
---
## DocumentNUp class

Beschrijft de uitvoer en indeling van meerdere logische pagina's op één enkel fysiek blad. Elk document wordt afzonderlijk samengesteld. En[`JobNUpAllDocumentsContiguously`](../jobnupalldocumentscontiguously/) sluiten elkaar wederzijds uit. Het is aan het stuurprogramma om de beperkingsafhandeling tussen deze sleutelwoorden te bepalen. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup

```csharp
DocumentNUp
```

```csharp
public sealed class DocumentNUp : NUp, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [DocumentNUp](documentnup/)(params INUpItem[]) | Maakt een nieuwe instantie aan. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Krijgt de elementnaam. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Voegt een lijst met items toe aan het einde van de itemlijst van dit object. Elk moet een[`Feature`](../feature/) , een[`Option`](../option/) of een[`Property`](../property/) instantie. |
| [AddPagesPerSheetOption](../../aspose.page.xps.xpsmetadata/documentnup/addpagespersheetoption/)(int) | Toevoegingen en optie met een gescoorde eigenschapswaarde. Specificeert het aantal logische pagina's per fysiek blad. |

### Zie ook

* class [NUp](../nup/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* naamruimte [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* montage [Aspose.Page](../../)


