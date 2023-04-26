---
title: Class JobErrorSheet
second_title: Aspose.Page voor .NET API-referentie
description: Aspose.Page.XPS.XpsMetadata.JobErrorSheet klas. Beschrijft de uitvoer van het foutenblad. De hele taak heeft één foutenblad. Het foutblad moet standaard worden uitgevoerdPageMediaSize en de standaard gebruikenPageMediaType . Het foutenblad moet worden geïsoleerd van de rest van de taak. Dit betekent dat alle afwerkings of verwerkingsopties zoals   of  mag het foutblad niet bevatten. Het foutenblad moet verschijnen als het laatste blad van de taak. https//docs.microsoft.com/enus/windows/win32/printdocs/joberrorsheet
type: docs
weight: 1300
url: /nl/net/aspose.page.xps.xpsmetadata/joberrorsheet/
---
## JobErrorSheet class

Beschrijft de uitvoer van het foutenblad. De hele taak heeft één foutenblad. Het foutblad moet standaard worden uitgevoerd[`PageMediaSize`](../pagemediasize/) en de standaard gebruiken[`PageMediaType`](../pagemediatype/) . Het foutenblad moet worden geïsoleerd van de rest van de taak. Dit betekent dat alle afwerkings- of verwerkingsopties (zoals , , of ) mag het foutblad niet bevatten. Het foutenblad moet verschijnen als het laatste blad van de taak. https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet

```csharp
JobDuplex
```

```csharp
JobStaple
```

```csharp
JobBinding
```

```csharp
public sealed class JobErrorSheet : Feature, IJobPrintTicketItem
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [JobErrorSheet](joberrorsheet/)(params IJobErrorSheetItem[]) | Maakt een nieuwe instantie aan. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Krijgt de elementnaam. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Voegt een lijst met items toe aan het einde van de itemlijst van dit object. Elk moet een[`Feature`](../feature/) , een[`Option`](../option/) of een[`Property`](../property/) instantie. |

## Andere leden

| Naam | Beschrijving |
| --- | --- |
| class [ErrorSheetOption](joberrorsheet.errorsheetoption/) | Beschrijft de`JobErrorSheet` functie-opties. |
| class [ErrorSheetWhen](joberrorsheet.errorsheetwhen/) | Beschrijft innerlijk functie. |
| interface [IJobErrorSheetItem](joberrorsheet.ijoberrorsheetitem/) | De interface van elk`JobErrorSheet` functie-item. |

### Zie ook

* class [Feature](../feature/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* naamruimte [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* montage [Aspose.Page](../../)


