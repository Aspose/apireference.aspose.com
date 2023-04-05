---
title: Class DocumentCollate
second_title: Aspose.Page für .NET-API-Referenz
description: Aspose.Page.XPS.XpsMetadata.DocumentCollate klas. Beschreibt die Sortiereigenschaften der Ausgabe. Alle Seiten in jedem einzelnen Dokument werden sortiert. DocumentCollate und JobCollateAlldocuments schließen sich gegenseitig aus. Das Verhalten und die Implementierung ob beide oder nur eines dieser Schlüsselwörter implementiert wird bleibt dem Treiber überlassen. https//docs.microsoft.com/enus/windows/win32/printdocs/documentcollate
type: docs
weight: 610
url: /de/net/aspose.page.xps.xpsmetadata/documentcollate/
---
## DocumentCollate class

Beschreibt die Sortiereigenschaften der Ausgabe. Alle Seiten in jedem einzelnen Dokument werden sortiert. DocumentCollate und JobCollateAlldocuments schließen sich gegenseitig aus. Das Verhalten und die Implementierung, ob beide oder nur eines dieser Schlüsselwörter implementiert wird, bleibt dem Treiber überlassen. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcollate

```csharp
public sealed class DocumentCollate : Collate, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [DocumentCollate](documentcollate/)(params CollateOption[]) |  |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Ruft den Elementnamen ab. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Fügt eine Liste von Elementen am Ende der Elementliste dieser Funktion hinzu. Jeder muss a sein[`Feature`](../feature/) , ein[`Option`](../option/) oder ein[`Property`](../property/) Instanz. |

### Siehe auch

* class [Collate](../collate/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* namensraum [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* Montage [Aspose.Page](../../)


