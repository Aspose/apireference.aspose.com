---
title: Class PageWatermark
second_title: Aspose.Page per riferimento all'API .NET
description: Aspose.Page.XPS.XpsMetadata.PageWatermark classe. Descrive limpostazione della filigrana delloutput e le caratteristiche della filigrana. Le filigrane si applicano alla pagina logica non alla pagina fisica. Ad esempio seDocumentDuplex è abilitato verrà visualizzata una filigrana su ciascuno pagina su ogni foglio. SeDocumentDuplex  2 ogni foglio avrà 2 filigrane. https//docs.microsoft.com/enus/windows/win32/printdocs/pagewatermark
type: docs
weight: 2650
url: /it/net/aspose.page.xps.xpsmetadata/pagewatermark/
---
## PageWatermark class

Descrive l'impostazione della filigrana dell'output e le caratteristiche della filigrana. Le filigrane si applicano alla pagina logica, non alla pagina fisica. Ad esempio, se[`DocumentDuplex`](../documentduplex/) è abilitato, verrà visualizzata una filigrana su ciascuno pagina su ogni foglio. Se[`DocumentDuplex`](../documentduplex/) , =2, ogni foglio avrà 2 filigrane. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark

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

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [PageWatermark](pagewatermark/)(params IPageWatermarkItem[]) | Crea una nuova istanza. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Ottiene il nome dell'elemento. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Aggiunge un elenco di elementi alla fine dell'elenco di elementi di questa funzione. Ognuno deve essere a[`Feature`](../feature/) , UN[`Option`](../option/) o un[`Property`](../property/) istanza. |

## Altri membri

| Nome | Descrizione |
| --- | --- |
| interface [IPageWatermarkItem](pagewatermark.ipagewatermarkitem/) | L'interfaccia di qualsiasi`PageWatermark` elemento caratteristica. |
| interface [IPageWatermarkOptionItem](pagewatermark.ipagewatermarkoptionitem/) | L'interfaccia di qualsiasi[`PageWatermarkOption`](../pagewatermark.pagewatermarkoption/) oggetto. |
| class [Layering](pagewatermark.layering/) | Descrive inner caratteristica. Definisce il comportamento dei livelli della filigrana. |
| class [LayeringOption](pagewatermark.layeringoption/) | Descrive il[`Layering`](../pagewatermark.layering/) opzioni di funzionalità. |
| class [PageWatermarkOption](pagewatermark.pagewatermarkoption/) | Descrive il`PageWatermark` opzioni caratteristiche. |

### Guarda anche

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* interface [IPagePrintTicketItem](../ipageprintticketitem/)
* spazio dei nomi [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* assemblea [Aspose.Page](../../)


