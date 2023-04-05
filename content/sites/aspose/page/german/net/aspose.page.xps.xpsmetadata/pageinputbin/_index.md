---
title: Class PageInputBin
second_title: Aspose.Page für .NET-API-Referenz
description: Aspose.Page.XPS.XpsMetadata.PageInputBin klas. Beschreibt das installierte Eingabefach in einem Gerät oder die vollständige Liste der unterstützten Fächer für ein Gerät. Ermöglicht die Angabe des Eingabefachs pro Seite. DerJobInputBin DocumentInputBin and PageInputBin Schlüsselwörter schließen sich gegenseitig aus. Beide sollten nicht gleichzeitig in einem PrintTicket oder Print CapabilitiesDokument angegeben werden. https//docs.microsoft.com/enus/windows/win32/printdocs/pageinputbin
type: docs
weight: 2020
url: /de/net/aspose.page.xps.xpsmetadata/pageinputbin/
---
## PageInputBin class

Beschreibt das installierte Eingabefach in einem Gerät oder die vollständige Liste der unterstützten Fächer für ein Gerät. Ermöglicht die Angabe des Eingabefachs pro Seite. Der[`JobInputBin`](../jobinputbin/) ,[`DocumentInputBin`](../documentinputbin/) and `PageInputBin` Schlüsselwörter schließen sich gegenseitig aus. Beide sollten nicht gleichzeitig in einem PrintTicket- oder Print Capabilities-Dokument angegeben werden. https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin

```csharp
public sealed class PageInputBin : InputBin, IDocumentPrintTicketItem, IJobPrintTicketItem, 
    IPagePrintTicketItem
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [PageInputBin](pageinputbin/)(params IInputBinItem[]) | Erstellt eine neue Instanz. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Ruft den Elementnamen ab. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Fügt eine Liste von Elementen am Ende der Elementliste dieser Funktion hinzu. Jeder muss a sein[`Feature`](../feature/) , ein[`Option`](../option/) oder ein[`Property`](../property/) Instanz. |

### Siehe auch

* class [InputBin](../inputbin/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* interface [IPagePrintTicketItem](../ipageprintticketitem/)
* namensraum [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* Montage [Aspose.Page](../../)


