---
title: Class PageWatermark
second_title: Aspose.Page voor .NET API-referentie
description: Aspose.Page.XPS.XpsMetadata.PageWatermark klas. Beschrijft de watermerkinstelling van de uitvoer en de watermerkkenmerken. Watermerken passen toe op de logische pagina niet op de fysieke pagina. Als bijvoorbeeldDocumentDuplex is ingeschakeld verschijnt er een watermerk op elk pagina op elk blad. AlsDocumentDuplex  2 dan heeft elk blad 2 watermerken. https//docs.microsoft.com/enus/windows/win32/printdocs/pagewatermark
type: docs
weight: 2650
url: /nl/net/aspose.page.xps.xpsmetadata/pagewatermark/
---
## PageWatermark class

Beschrijft de watermerkinstelling van de uitvoer en de watermerkkenmerken. Watermerken passen toe op de logische pagina, niet op de fysieke pagina. Als bijvoorbeeld[`DocumentDuplex`](../documentduplex/) is ingeschakeld, verschijnt er een watermerk op elk pagina op elk blad. Als[`DocumentDuplex`](../documentduplex/) , =2, dan heeft elk blad 2 watermerken. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark

```csharp
NUp
```

```csharp
PagesPerSheet
```

```csharp
public sealed class PageWatermark : Feature, IDocumentPrintTicketItem, IJobPrintTicketItem, 
    IPagePrintTicketItem
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [PageWatermark](pagewatermark/)(params IPageWatermarkItem[]) | Maakt een nieuwe instantie aan. |

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
| interface [IPageWatermarkItem](pagewatermark.ipagewatermarkitem/) | De interface van elk`PageWatermark` functie-item. |
| interface [IPageWatermarkOptionItem](pagewatermark.ipagewatermarkoptionitem/) | De interface van elk[`PageWatermarkOption`](../pagewatermark.pagewatermarkoption/) item. |
| class [Layering](pagewatermark.layering/) | Beschrijft innerlijk functie. Definieert het laaggedrag van het watermerk. |
| class [LayeringOption](pagewatermark.layeringoption/) | Beschrijft de[`Layering`](../pagewatermark.layering/) functie-opties. |
| class [PageWatermarkOption](pagewatermark.pagewatermarkoption/) | Beschrijft de`PageWatermark` functies opties. |

### Zie ook

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* interface [IPagePrintTicketItem](../ipageprintticketitem/)
* naamruimte [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* montage [Aspose.Page](../../)


