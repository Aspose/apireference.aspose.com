---
title: Class JobInputBin
second_title: Aspose.Page voor .NET API-referentie
description: Aspose.Page.XPS.XpsMetadata.JobInputBin klas. Beschrijft de geïnstalleerde invoerbak in een apparaat of de volledige lijst met ondersteunde bakken voor een apparaat. Maakt specificatie van de invoerbak per taak mogelijk. DeJobInputBin DocumentInputBin  enPageInputBin trefwoorden sluiten elkaar uit. Beide mogen niet gelijktijdig worden opgegeven in een PrintTicket of Print Capabilitiesdocument. https//docs.microsoft.com/enus/windows/win32/printdocs/jobinputbin
type: docs
weight: 1380
url: /nl/net/aspose.page.xps.xpsmetadata/jobinputbin/
---
## JobInputBin class

Beschrijft de geïnstalleerde invoerbak in een apparaat of de volledige lijst met ondersteunde bakken voor een apparaat. Maakt specificatie van de invoerbak per taak mogelijk. De`JobInputBin` ,[`DocumentInputBin`](../documentinputbin/) , en[`PageInputBin`](../pageinputbin/) trefwoorden sluiten elkaar uit. Beide mogen niet gelijktijdig worden opgegeven in een PrintTicket- of Print Capabilities-document. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobinputbin

```csharp
public sealed class JobInputBin : InputBin, IJobPrintTicketItem
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [JobInputBin](jobinputbin/)(params IInputBinItem[]) | Maakt een nieuwe instantie aan. |

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
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* naamruimte [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* montage [Aspose.Page](../../)


