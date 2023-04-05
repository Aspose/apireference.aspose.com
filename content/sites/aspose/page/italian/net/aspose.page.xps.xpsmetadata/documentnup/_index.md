---
title: Class DocumentNUp
second_title: Aspose.Page per riferimento all'API .NET
description: Aspose.Page.XPS.XpsMetadata.DocumentNUp classe. Descrive loutput e il formato di più pagine logiche in un singolo foglio fisico. Ogni documento viene compilato separatamente. EJobNUpAllDocumentsContiguously si escludono a vicenda. Spetta al driver determinare la gestione dei vincoli tra queste parole chiave. https//docs.microsoft.com/enus/windows/win32/printdocs/documentnup
type: docs
weight: 740
url: /it/net/aspose.page.xps.xpsmetadata/documentnup/
---
## DocumentNUp class

Descrive l'output e il formato di più pagine logiche in un singolo foglio fisico. Ogni documento viene compilato separatamente. E[`JobNUpAllDocumentsContiguously`](../jobnupalldocumentscontiguously/) si escludono a vicenda. Spetta al driver determinare la gestione dei vincoli tra queste parole chiave. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup

```csharp
DocumentNUp
```

```csharp
public sealed class DocumentNUp : NUp, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [DocumentNUp](documentnup/)(params INUpItem[]) | Crea una nuova istanza. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Ottiene il nome dell'elemento. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Aggiunge un elenco di elementi alla fine dell'elenco di elementi di questa funzione. Ognuno deve essere a[`Feature`](../feature/) , UN[`Option`](../option/) o un[`Property`](../property/) istanza. |
| [AddPagesPerSheetOption](../../aspose.page.xps.xpsmetadata/documentnup/addpagespersheetoption/)(int) | Aggiunge un'opzione con a valore della proprietà score. Specifica il numero di pagine logiche per foglio fisico. |

### Guarda anche

* class [NUp](../nup/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* spazio dei nomi [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* assemblea [Aspose.Page](../../)


