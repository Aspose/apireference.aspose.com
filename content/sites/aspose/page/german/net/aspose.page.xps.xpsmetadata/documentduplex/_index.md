---
title: Class DocumentDuplex
second_title: Aspose.Page für .NET-API-Referenz
description: Aspose.Page.XPS.XpsMetadata.DocumentDuplex klas. Beschreibt die DuplexEigenschaften der Ausgabe. Die Duplexfunktion ermöglicht das Drucken auf beiden Seiten des Mediums. Jedes Dokument wird separat dupliziert. DocumentDuplex und JobDuplexAllDocumentsContiguously schließen sich gegenseitig aus. Es ist Sache des Treibers die Handhabung von Einschränkungen zwischen diesen Schlüsselwörtern festzulegen. https//docs.microsoft.com/enus/windows/win32/printdocs/ documentduplex
type: docs
weight: 700
url: /de/net/aspose.page.xps.xpsmetadata/documentduplex/
---
## DocumentDuplex class

Beschreibt die Duplex-Eigenschaften der Ausgabe. Die Duplexfunktion ermöglicht das Drucken auf beiden Seiten des Mediums. Jedes Dokument wird separat dupliziert. DocumentDuplex und JobDuplexAllDocumentsContiguously schließen sich gegenseitig aus. Es ist Sache des Treibers, die Handhabung von Einschränkungen zwischen diesen Schlüsselwörtern festzulegen. https://docs.microsoft.com/en-us/windows/win32/printdocs/ documentduplex

```csharp
public sealed class DocumentDuplex : Duplex, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [DocumentDuplex](documentduplex/)(params DuplexOption[]) | Erstellt eine neue Instanz. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Ruft den Elementnamen ab. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Fügt eine Liste von Elementen am Ende der Elementliste dieser Funktion hinzu. Jeder muss a sein[`Feature`](../feature/) , ein[`Option`](../option/) oder ein[`Property`](../property/) Instanz. |

### Siehe auch

* class [Duplex](../duplex/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* namensraum [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* Montage [Aspose.Page](../../)


