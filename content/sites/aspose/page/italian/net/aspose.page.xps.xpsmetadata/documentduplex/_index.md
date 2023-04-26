---
title: Class DocumentDuplex
second_title: Aspose.Page per riferimento all'API .NET
description: Aspose.Page.XPS.XpsMetadata.DocumentDuplex classe. Descrive le caratteristiche duplex delloutput. La funzione fronte/retro consente la stampa su entrambi i lati del supporto. Ogni documento viene stampato in fronte/retro separatamente. DocumentDuplex e JobDuplexAllDocumentsContiguously si escludono a vicenda. Spetta al driver determinare la gestione dei vincoli tra queste parole chiave. https//docs.microsoft.com/enus/windows/win32/printdocs/ documentoduplex
type: docs
weight: 700
url: /it/net/aspose.page.xps.xpsmetadata/documentduplex/
---
## DocumentDuplex class

Descrive le caratteristiche duplex dell'output. La funzione fronte/retro consente la stampa su entrambi i lati del supporto. Ogni documento viene stampato in fronte/retro separatamente. DocumentDuplex e JobDuplexAllDocumentsContiguously si escludono a vicenda. Spetta al driver determinare la gestione dei vincoli tra queste parole chiave. https://docs.microsoft.com/en-us/windows/win32/printdocs/ documentoduplex

```csharp
public sealed class DocumentDuplex : Duplex, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [DocumentDuplex](documentduplex/)(params DuplexOption[]) | Crea una nuova istanza. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Ottiene il nome dell'elemento. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Aggiunge un elenco di elementi alla fine dell'elenco di elementi di questa funzione. Ognuno deve essere a[`Feature`](../feature/) , UN[`Option`](../option/) o un[`Property`](../property/) istanza. |

### Guarda anche

* class [Duplex](../duplex/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* spazio dei nomi [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* assemblea [Aspose.Page](../../)


