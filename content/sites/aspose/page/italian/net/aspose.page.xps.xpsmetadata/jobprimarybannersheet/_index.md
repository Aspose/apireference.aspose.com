---
title: Class JobPrimaryBannerSheet
second_title: Aspose.Page per riferimento all'API .NET
description: Aspose.Page.XPS.XpsMetadata.JobPrimaryBannerSheet classe. Descrive il foglio banner da emettere per il lavoro. Il foglio banner dovrebbe essere emesso su default PageMediaSize e utilizzando limpostazione predefinitaPageMediaType . Il foglio banner dovrebbe essere isolato dal resto del lavoro. Ciò significa che qualsiasi opzione di finitura o lavorazione come JobDuplexAllDocumentsContiguously JobStapleAllDocuments  OJobBindAllDocuments  non deve includere il foglio banner. Il foglio banner dovrebbe essere il primo foglio del lavoro.
type: docs
weight: 1470
url: /it/net/aspose.page.xps.xpsmetadata/jobprimarybannersheet/
---
## JobPrimaryBannerSheet class

Descrive il foglio banner da emettere per il lavoro. Il foglio banner dovrebbe essere emesso su default [`PageMediaSize`](../pagemediasize/) e utilizzando l'impostazione predefinita[`PageMediaType`](../pagemediatype/) . Il foglio banner dovrebbe essere isolato dal resto del lavoro. Ciò significa che qualsiasi opzione di finitura o lavorazione (come [`JobDuplexAllDocumentsContiguously`](../jobduplexalldocumentscontiguously/) ,[`JobStapleAllDocuments`](../jobstaplealldocuments/) , O[`JobBindAllDocuments`](../jobbindalldocuments/) ) non deve includere il foglio banner. Il foglio banner dovrebbe essere il primo foglio del lavoro.

```csharp
public sealed class JobPrimaryBannerSheet : Feature, IJobPrintTicketItem
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [JobPrimaryBannerSheet](jobprimarybannersheet/)(params BannerSheetOption[]) | Crea una nuova istanza. |

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
| class [BannerSheetOption](jobprimarybannersheet.bannersheetoption/) | Rappresenta le opzioni di`JobPrimaryBannerSheet` caratteristica. |

### Guarda anche

* class [Feature](../feature/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* spazio dei nomi [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* assemblea [Aspose.Page](../../)


