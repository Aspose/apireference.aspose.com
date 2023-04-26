---
title: Class DocumentHolePunch
second_title: Aspose.Page für .NET-API-Referenz
description: Aspose.Page.XPS.XpsMetadata.DocumentHolePunch klas. Beschreibt die Lochungseigenschaften der Ausgabe. Jedes Dokument wird separat gelocht. DieJobHolePunch UndDocumentHolePunch Schlüsselwörter schließen sich gegenseitig aus. Beide sollten nicht gleichzeitig in einem PrintTicket oder Print CapabilitiesDokument angegeben werden. https//docs.microsoft.com/enus/windows/win32/printdocs/documentholepunch
type: docs
weight: 710
url: /de/net/aspose.page.xps.xpsmetadata/documentholepunch/
---
## DocumentHolePunch class

Beschreibt die Lochungseigenschaften der Ausgabe. Jedes Dokument wird separat gelocht. Die[`JobHolePunch`](../jobholepunch/) Und`DocumentHolePunch` Schlüsselwörter schließen sich gegenseitig aus. Beide sollten nicht gleichzeitig in einem PrintTicket- oder Print Capabilities-Dokument angegeben werden. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentholepunch

```csharp
public sealed class DocumentHolePunch : HolePunch, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [DocumentHolePunch](documentholepunch/)(params HolePunchOption[]) | Erstellt eine neue Instanz. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Ruft den Elementnamen ab. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Fügt eine Liste von Elementen am Ende der Elementliste dieser Funktion hinzu. Jeder muss a sein[`Feature`](../feature/) , ein[`Option`](../option/) oder ein[`Property`](../property/) Instanz. |

### Siehe auch

* class [HolePunch](../holepunch/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* namensraum [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* Montage [Aspose.Page](../../)


