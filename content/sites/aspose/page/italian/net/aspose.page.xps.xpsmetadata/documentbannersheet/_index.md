---
title: Class DocumentBannerSheet
second_title: Aspose.Page per riferimento all'API .NET
description: Aspose.Page.XPS.XpsMetadata.DocumentBannerSheet classe. Descrive il foglio banner da emettere per un particolare documento. Il foglio banner dovrebbe essere emesso su default PageMediaSize e utilizzando limpostazione predefinitaPageMediaType . Anche il foglio banner deve essere isolato dal resto del lavoro. Ciò significa che qualsiasi opzione di finitura o lavorazione come DocumentDuplex DocumentStaple  ODocumentBinding non deve includere il foglio banner. Il foglio banner può o meno essere isolato dal resto del lavoro. Ciò significa che qualsiasi opzione di finitura o elaborazione del lavoro può includere il foglio banner del documento. Il foglio banner deve essere il primo foglio del documento. https https//docs.microsoft.com/enus/windows/win32/printdocs/documentbannersheet
type: docs
weight: 540
url: /it/net/aspose.page.xps.xpsmetadata/documentbannersheet/
---
## DocumentBannerSheet class

Descrive il foglio banner da emettere per un particolare documento. Il foglio banner dovrebbe essere emesso su default [`PageMediaSize`](../pagemediasize/) e utilizzando l'impostazione predefinita[`PageMediaType`](../pagemediatype/) . Anche il foglio banner deve essere isolato dal resto del lavoro. Ciò significa che qualsiasi opzione di finitura o lavorazione (come [`DocumentDuplex`](../documentduplex/) ,[`DocumentStaple`](../documentstaple/) , O[`DocumentBinding`](../documentbinding/)) non deve includere il foglio banner. Il foglio banner può o meno essere isolato dal resto del lavoro. Ciò significa che qualsiasi opzione di finitura o elaborazione del lavoro può includere il foglio banner del documento. Il foglio banner deve essere il primo foglio del documento. https https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet

```csharp
public sealed class DocumentBannerSheet : Feature, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [DocumentBannerSheet](documentbannersheet/)(params BannerSheetOption[]) | Crea una nuova istanza. |

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
| class [BannerSheetOption](documentbannersheet.bannersheetoption/) | Rappresenta le opzioni di`DocumentBannerSheet` caratteristica. |

### Guarda anche

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* spazio dei nomi [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* assemblea [Aspose.Page](../../)


