---
title: Class JobErrorSheet
second_title: Aspose.Page per riferimento all'API .NET
description: Aspose.Page.XPS.XpsMetadata.JobErrorSheet classe. Descrive loutput del foglio degli errori. Lintero lavoro avrà un unico foglio di errore. Lerrore sheet dovrebbe essere visualizzato come predefinitoPageMediaSize e utilizzando limpostazione predefinitaPageMediaType . Il foglio degli errori deve essere isolato dal resto del lavoro. Ciò significa che qualsiasi opzione di finitura o elaborazione come   O  non deve includere il foglio degli errori. Il foglio degli errori dovrebbe essere il foglio finale del lavoro. https//docs.microsoft.com/enus/windows/win32/printdocs/joberrorsheet
type: docs
weight: 1300
url: /it/net/aspose.page.xps.xpsmetadata/joberrorsheet/
---
## JobErrorSheet class

Descrive l'output del foglio degli errori. L'intero lavoro avrà un unico foglio di errore. L'errore sheet dovrebbe essere visualizzato come predefinito[`PageMediaSize`](../pagemediasize/) e utilizzando l'impostazione predefinita[`PageMediaType`](../pagemediatype/) . Il foglio degli errori deve essere isolato dal resto del lavoro. Ciò significa che qualsiasi opzione di finitura o elaborazione (come , , O ) non deve includere il foglio degli errori. Il foglio degli errori dovrebbe essere il foglio finale del lavoro. https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet

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

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [JobErrorSheet](joberrorsheet/)(params IJobErrorSheetItem[]) | Crea una nuova istanza. |

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
| class [ErrorSheetOption](joberrorsheet.errorsheetoption/) | Descrive il`JobErrorSheet` opzioni di funzionalità. |
| class [ErrorSheetWhen](joberrorsheet.errorsheetwhen/) | Descrive inner caratteristica. |
| interface [IJobErrorSheetItem](joberrorsheet.ijoberrorsheetitem/) | L'interfaccia di qualsiasi`JobErrorSheet` elemento caratteristica. |

### Guarda anche

* class [Feature](../feature/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* spazio dei nomi [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* assemblea [Aspose.Page](../../)


