---
title: Class PageInputBin
second_title: Aspose.Page per riferimento all'API .NET
description: Aspose.Page.XPS.XpsMetadata.PageInputBin classe. Descrive il raccoglitore di input installato in un dispositivo o lelenco completo dei raccoglitori supportati per un dispositivo. Consente di specificare il raccoglitore di input in base alla pagina. ILJobInputBin DocumentInputBin e PageInputBin parole chiave si escludono a vicenda. Entrambi non devono essere specificati contemporaneamente in un documento PrintTicket o Print Capabilities. https//docs.microsoft.com/enus/windows/win32/printdocs/pageinputbin
type: docs
weight: 2020
url: /it/net/aspose.page.xps.xpsmetadata/pageinputbin/
---
## PageInputBin class

Descrive il raccoglitore di input installato in un dispositivo o l'elenco completo dei raccoglitori supportati per un dispositivo. Consente di specificare il raccoglitore di input in base alla pagina. IL[`JobInputBin`](../jobinputbin/) ,[`DocumentInputBin`](../documentinputbin/) e `PageInputBin` parole chiave si escludono a vicenda. Entrambi non devono essere specificati contemporaneamente in un documento PrintTicket o Print Capabilities. https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin

```csharp
public sealed class PageInputBin : InputBin, IDocumentPrintTicketItem, IJobPrintTicketItem, 
    IPagePrintTicketItem
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [PageInputBin](pageinputbin/)(params IInputBinItem[]) | Crea una nuova istanza. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Ottiene il nome dell'elemento. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Aggiunge un elenco di elementi alla fine dell'elenco di elementi di questa funzione. Ognuno deve essere a[`Feature`](../feature/) , UN[`Option`](../option/) o un[`Property`](../property/) istanza. |

### Guarda anche

* class [InputBin](../inputbin/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* interface [IPagePrintTicketItem](../ipageprintticketitem/)
* spazio dei nomi [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* assemblea [Aspose.Page](../../)


