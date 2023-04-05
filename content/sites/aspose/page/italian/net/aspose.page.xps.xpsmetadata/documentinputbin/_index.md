---
title: Class DocumentInputBin
second_title: Aspose.Page per riferimento all'API .NET
description: Aspose.Page.XPS.XpsMetadata.DocumentInputBin classe. Descrive il contenitore di input installato in un dispositivo o lelenco completo dei contenitori supportati per un dispositivo. IlJobInputBin DocumentInputBin  EPageInputBin Le parole chiave si escludono a vicenda. Entrambi non devono essere specificati contemporaneamente in un documento PrintTicket o Print Capabilities. https//docs.microsoft.com/enus/windows/win32/printdocs/documentinputbin
type: docs
weight: 730
url: /it/net/aspose.page.xps.xpsmetadata/documentinputbin/
---
## DocumentInputBin class

Descrive il contenitore di input installato in un dispositivo o l'elenco completo dei contenitori supportati per un dispositivo. Il[`JobInputBin`](../jobinputbin/) ,`DocumentInputBin` , E[`PageInputBin`](../pageinputbin/) Le parole chiave si escludono a vicenda. Entrambi non devono essere specificati contemporaneamente in un documento PrintTicket o Print Capabilities. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin

```csharp
public sealed class DocumentInputBin : InputBin, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [DocumentInputBin](documentinputbin/)(params IInputBinItem[]) | Crea una nuova istanza. |

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
* spazio dei nomi [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* assemblea [Aspose.Page](../../)


