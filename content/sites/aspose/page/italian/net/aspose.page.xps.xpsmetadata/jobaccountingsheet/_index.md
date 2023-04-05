---
title: Class JobAccountingSheet
second_title: Aspose.Page per riferimento all'API .NET
description: Aspose.Page.XPS.XpsMetadata.JobAccountingSheet classe. Descrive il foglio contabile da emettere per il lavoro. Il foglio contabile dovrebbe essere emesso sul default PageMediaSize e utilizzando limpostazione predefinitaPageMediaType . Il foglio contabile dovrebbe essere isolato da dal resto del lavoro. Ciò significa che qualsiasi opzione di finitura o lavorazione come   O  non deve includere il foglio contabile. Il foglio contabile può essere la prima o lultima pagina del lavoro a discrezione dellimplementatore. https//docs.microsoft.com/enus/windows/win32/printdocs/jobaccountingsheet
type: docs
weight: 1130
url: /it/net/aspose.page.xps.xpsmetadata/jobaccountingsheet/
---
## JobAccountingSheet class

Descrive il foglio contabile da emettere per il lavoro. Il foglio contabile dovrebbe essere emesso sul default [`PageMediaSize`](../pagemediasize/) e utilizzando l'impostazione predefinita[`PageMediaType`](../pagemediatype/) . Il foglio contabile dovrebbe essere isolato da dal resto del lavoro. Ciò significa che qualsiasi opzione di finitura o lavorazione (come , , O ) non deve includere il foglio contabile. Il foglio contabile può essere la prima o l'ultima pagina del lavoro a discrezione dell'implementatore. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobaccountingsheet

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
public sealed class JobAccountingSheet : Feature, IJobPrintTicketItem
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [JobAccountingSheet](jobaccountingsheet/)(params JobAccountingSheetOption[]) | Crea una nuova istanza. |

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
| class [JobAccountingSheetOption](jobaccountingsheet.jobaccountingsheetoption/) | Descrive il`JobAccountingSheet` opzioni di funzionalità. |

### Guarda anche

* class [Feature](../feature/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* spazio dei nomi [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* assemblea [Aspose.Page](../../)


