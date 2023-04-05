---
title: Class DocumentOutputBin
second_title: Aspose.Page per riferimento all'API .NET
description: Aspose.Page.XPS.XpsMetadata.DocumentOutputBin classe. Descrive lelenco completo dei bin supportati per il dispositivo. Consente di specificare output bin in base al documento. ILJobOutputBin DocumentOutputBin e PageOutputBin le parole chiave si escludono a vicenda solo una deve essere specificata in un documento PrintTicket o Print Capabilities. https//docs.microsoft.com/enus/windows/win32/printdocs/documentoutputbin
type: docs
weight: 760
url: /it/net/aspose.page.xps.xpsmetadata/documentoutputbin/
---
## DocumentOutputBin class

Descrive l'elenco completo dei bin supportati per il dispositivo. Consente di specificare output bin in base al documento. IL[`JobOutputBin`](../joboutputbin/) ,`DocumentOutputBin` e [`PageOutputBin`](../pageoutputbin/) le parole chiave si escludono a vicenda, solo una deve essere specificata in un documento PrintTicket o Print Capabilities. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin

```csharp
public sealed class DocumentOutputBin : OutputBin, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [DocumentOutputBin](documentoutputbin/)(params IOutputBinItem[]) | Crea una nuova istanza. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Ottiene il nome dell'elemento. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Aggiunge un elenco di elementi alla fine dell'elenco di elementi di questa funzione. Ognuno deve essere a[`Feature`](../feature/) , UN[`Option`](../option/) o un[`Property`](../property/) istanza. |

### Guarda anche

* class [OutputBin](../outputbin/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* spazio dei nomi [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* assemblea [Aspose.Page](../../)


