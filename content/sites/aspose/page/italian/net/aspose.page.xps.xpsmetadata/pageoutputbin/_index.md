---
title: Class PageOutputBin
second_title: Aspose.Page per riferimento all'API .NET
description: Aspose.Page.XPS.XpsMetadata.PageOutputBin classe. Descrive lelenco completo dei bin supportati per il dispositivo. Consente di specificare lo scomparto di uscita in base alla pagina. TheJobOutputBin DocumentOutputBin EPageOutputBin le parole chiave sono che si escludono a vicenda solo una deve essere specificata in un documento PrintTicket o Print Capabilities. https//docs.microsoft.com/enus/windows/win32/printdocs/pageoutputbin
type: docs
weight: 2330
url: /it/net/aspose.page.xps.xpsmetadata/pageoutputbin/
---
## PageOutputBin class

Descrive l'elenco completo dei bin supportati per il dispositivo. Consente di specificare lo scomparto di uscita in base alla pagina. The[`JobOutputBin`](../joboutputbin/) ,[`DocumentOutputBin`](../documentoutputbin/) E`PageOutputBin` le parole chiave sono che si escludono a vicenda, solo una deve essere specificata in un documento PrintTicket o Print Capabilities. https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin

```csharp
public sealed class PageOutputBin : OutputBin, IDocumentPrintTicketItem, IJobPrintTicketItem, 
    IPagePrintTicketItem
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [PageOutputBin](pageoutputbin/)(params IOutputBinItem[]) | Crea una nuova istanza. |

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
* interface [IPagePrintTicketItem](../ipageprintticketitem/)
* spazio dei nomi [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* assemblea [Aspose.Page](../../)


